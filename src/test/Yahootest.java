package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Yahootest {
  
  @Test
  public void testsendmail(){
	  System.out.println("sending email");
  }
  @Test
  public void testreceivemail() {
	  System.out.println("receiving email");
  }
  @BeforeMethod
  public void openbrowser() {
	  System.out.println("open the browser");
  }

  @BeforeTest
  public void connectdb() {
	  System.out.println("Connect to db");
  }
  @AfterMethod
  public void closebrowser(){
	  System.out.println("closing the browser");
  }
  @AfterTest
  public void shutdowndb(){
	  
  }
  
  

}
