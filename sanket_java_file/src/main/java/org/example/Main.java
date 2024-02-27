package org.example;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("customer.json"));

            JSONArray customers = (JSONArray) obj;
            for (Object customer : customers) {
                JSONObject customerObj = (JSONObject) customer;

                String name = (String) customerObj.get("name");
                String memberSince = (String) customerObj.get("member-since");
                String rating = (String) customerObj.get("rating");

                System.out.println("Name: " + name);
                System.out.println("Member Since: " + memberSince);
                System.out.println("Rating: " + rating);
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}