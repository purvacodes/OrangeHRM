package Pages;

import Utility.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPage extends Base {

    @Test
    public void LoginToOrangeHrm() throws InterruptedException {
        navigateToOrangeHRM();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button")).click();
    }
}
