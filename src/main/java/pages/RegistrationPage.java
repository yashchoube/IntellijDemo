package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    WebDriver driver;
    @FindBy(xpath =("//input[@name = \"firstName\"]"))
    private WebElement firstName;

    @FindBy(xpath =("//input[@name=\"address1\"]"))
    private WebElement address;

    @FindBy(xpath =("//input[@id = \"email\"]"))
    private WebElement emailId;

    @FindBy(xpath =("//input[@type=\"submit\"]"))
    private WebElement submit;

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

    public void provideContactDetails(){
        firstName.sendKeys("Nandish");
    }

    public void provideMailingDetails(){
        address.sendKeys("Kolkata");
    }

    public void provideUserDetails(){
        emailId.sendKeys("yashprchoube@gmail.com");
    }

    public void clickOnSubmit(){
        submit.click();
    }

}
