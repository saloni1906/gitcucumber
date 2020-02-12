package FeatureFile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class P1 {
	@Given("I enter 20 in the calculator")
	public void  case1()
	{
		System.out.println("I enter 50 in the calculator");
	}
	
	@And("I press add")
	public void I_press_add()
	{
		System.out.println("I press add");
	}
	
	@And("I entered 50 in the calculator")
	public void I_entered_50_in_the_calculator()
	{
		System.out.println("I entered 50 in the calculator");
	}
	
	@When("I press equal symbol")
	public void I_press_equal_symbol()
	{
		System.out.println("When I press equal symbol");
	}
	
	@Then("The result should be 100 on the screen")
	public void The_result_should_be_100_on_the_screen()
	{
		System.out.println("Then The result should be 100 on the screen");
	}
	
	

}
