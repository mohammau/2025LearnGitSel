package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accountPage {
	
	WebDriver driver;
	
	public accountPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	@FindBy(linkText="Edit your account information")
    private WebElement editYourAccountInformation;
    
    public WebElement editYourAccountInformation() {
    	
    	return editYourAccountInformation;
    	
    }

}
