import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MyFirstTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
    }

    @Test
    public void Auth() throws InterruptedException {
        driver.get("http://localhost/litecart/admin");
        driver.findElement(By.cssSelector("[name=username]")).sendKeys("Admin");
        driver.findElement(By.cssSelector("[name=password]")).sendKeys("Admin");
        driver.findElement(By.cssSelector("[name=login]")).click();
        Thread.sleep(2000);
    }

    @After
    public void stop() {
        driver.quit();
        driver=null;
    }
}

