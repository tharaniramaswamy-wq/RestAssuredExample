package Day1;
import org.testng.annotations.*;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class HttpReq {
@Test


	void getUsers() {
	given()
	.when()
	.get("https://reqres.in/api/users?page=2")
	.then()
	.statusCode(200)
	.body("page",equalTo(2))
	.log().all();
	
}
@Test

void createUser() {
	HashMap hm = new HashMap();
	hm.put("id", "0");
	hm.put("idBook","0");
	hm.put("firstName", "thara");
	hm.put("lastName", "rmswhjjmy");
	given()
	.contentType("application/json")
	.body(hm)
	.when()
	.post("https://fakerestapi.azurewebsites.net/api/v1/Authors")
	.then()
	.statusCode(200)
	.log().all();
}


}