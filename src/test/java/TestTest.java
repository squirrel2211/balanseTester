
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestTest {

    @Test
    public void testToWikipediaWebSite(){
        System.setProperty("webdriver.chrome.driver","/home/vladimir/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.avsu.ru/loginparent/");

        WebElement login=driver.findElement(By.cssSelector(".loginTeacher"));
        login.clear();
        login.sendKeys("9635203775");

        WebElement password=driver.findElement(By.id("avsu_pass"));
        password.clear();
        password.sendKeys("30Djdrf05");

        WebElement enter=driver.findElement(By.id("loginTeacherSubmit"));
        enter.click();


        WebElement balanse=driver.findElement(By.className("dataHeaderLcDiv4"));
        balanse.getText();

        driver.close();


    }




}

