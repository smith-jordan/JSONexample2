/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonexample1;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
 
public class Jsonexample1 {
     
    public static void main(String[] args) {
        JsonObject personObject = Json.createObjectBuilder()
                .add("name", "Jordan")
                .add("age", 31)
                .add("isMarried", true)
                .add("address", 
                     Json.createObjectBuilder().add("street", "672 West")
                                               .add("city", "Idaho Falls")
                                               .add("zipCode", "83401")
                                               .build()
                    )
                .add("phoneNumber", 
                     Json.createArrayBuilder().add("00-000-0000")
                                              .add("11-111-1111")
                                              .add("11-111-1112")
                                              .build()
                    )
                .build();
         
        JsonObject personObject2 = Json.createObjectBuilder()
                .add("name", "Joanne")
                .add("age", 30)
                .add("isMarried", true)
                .add("address", 
                     Json.createObjectBuilder().add("street", "672 West")
                                               .add("city", "Idaho Falls")
                                               .add("zipCode", "83401")
                                               .build()
                    )
                .add("phoneNumber", 
                     Json.createArrayBuilder().add("00-000-0000")
                                              .add("11-111-1111")
                                              .add("11-111-1112")
                                              .build()
                    )
                .build();
        
        
        
        System.out.println("Object: " + personObject);
        System.out.println("Object: " + personObject2);
    }
}