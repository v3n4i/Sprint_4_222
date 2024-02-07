package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SingleElements {
    WebDriver driver;
    public static final By cookieButton = By.xpath(".//button[text()='да все привыкли']");
    public static final By zeroHeading = By.id("accordion__heading-0");
    public static final By zeroCheck = By.xpath(".//div[@aria-labelledby=\"accordion__heading-0\"]/p");
    public static final By firstHeading = By.id("accordion__heading-1");
    public static final By firstCheck = By.xpath(".//div[@aria-labelledby=\"accordion__heading-1\"]/p");
    public static final By secondHeading = By.id("accordion__heading-2");
    public static final By secondCheck = By.xpath(".//div[@aria-labelledby=\"accordion__heading-2\"]/p");
    public static final By thirdHeading = By.id("accordion__heading-3");
    public static final By thirdCheck = By.xpath(".//div[@aria-labelledby=\"accordion__heading-3\"]/p");
    public static final By fourthHeading = By.id("accordion__heading-4");
    public static final By fourthCheck = By.xpath(".//div[@aria-labelledby=\"accordion__heading-4\"]/p");
    public static final By fifthHeading = By.id("accordion__heading-5");
    public static final By fifthCheck = By.xpath(".//div[@aria-labelledby=\"accordion__heading-5\"]/p");
    public static final By sixthHeading = By.id("accordion__heading-6");
    public static final By sixthCheck = By.xpath(".//div[@aria-labelledby=\"accordion__heading-6\"]/p");
    public static final By seventhHeading = By.id("accordion__heading-7");
    public static final By seventhCheck = By.xpath(".//div[@aria-labelledby=\"accordion__heading-7\"]/p");

    public static final By orderOneButton = By.xpath(".//button[@class=\"Button_Button__ra12g\"]");
    public static final By nameInOrderPage = By.xpath(".//input[@placeholder=\"* Имя\"]");
    public static final By surnameInOrderPage = By.xpath(".//input[@placeholder=\"* Фамилия\"]");
    public static final By addressInOrderPage = By.xpath(".//input[@placeholder=\"* Адрес: куда привезти заказ\"]");
    public static final By phoneInOrderPage = By.xpath(".//input[@placeholder=\"* Телефон: на него позвонит курьер\"]");
    public static final By nextButtonInOrderPage = By.xpath(".//button[text()=\"Далее\"]");
    public static final By checkForOrderPage = By.xpath(".//button[text()='Посмотреть статус']");
    public static final By blackColorOfScooter = By.xpath(".//input[@id=\"black\"]");
    public static final By greyColorOfScooter = By.xpath(".//input[@id=\"grey\"]");
    public static final By settledDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    public static final By dropDown = By.xpath(".//div[@class='Dropdown-placeholder']");
    public static final By startOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    public static final By yesButton = By.xpath(".//div[@class=\"Order_Modal__YZ-d3\"]/*/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public void clickOnCookie() {
        driver.findElement(cookieButton).click();
    }

    public void clickOrderButton() {
        driver.findElement(orderOneButton).click();
    }

    public void fillName(String name) {
        driver.findElement(nameInOrderPage).sendKeys(name);
    }

    public void fillSurname(String surname) {
        driver.findElement(surnameInOrderPage).sendKeys(surname);
    }

    public void fillAddress(String address) {
        driver.findElement(addressInOrderPage).sendKeys(address);
    }

    public void fillPhoneInOrderPage(String phone) {
        driver.findElement(phoneInOrderPage).sendKeys(phone);
    }

    public void pressNextButton() {
        driver.findElement(nextButtonInOrderPage).click();
    }

    boolean result;

    public boolean validationOfFirstOrderPage() {
        String str = driver.findElement(checkForOrderPage).getText();
        if (str.equals("Посмотреть статус"))
            result = true;
        else
            result = false;
        return result;

    }

    public void selectColor(String scooterColor) {
        if (scooterColor.equals("чёрный жемчуг")) {
            driver.findElement(blackColorOfScooter).click();
        } else if (scooterColor.equals("серая безысходность")) {
            driver.findElement(greyColorOfScooter).click();
        }
    }

    public SingleElements(WebDriver driver) {
        this.driver = driver;
    }

    public void clickArrowOne(By button) {
        driver.findElement(button).click();
    }

    public void scrollUntilElement(By button) {
        WebElement element = driver.findElement(button);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public String getTextOfFirstArrow(By button) {
        return driver.findElement(button).getText();
    }

    public void selectMetro(String metro) {
        String metroSearchFormatter = String.format(".//div[@class=\"select-search has-focus\"]//*[text()='%s']", metro);
        driver.findElement(By.xpath(".//div[@class=\"select-search__value\"]")).click();
        driver.findElement(By.xpath(metroSearchFormatter)).click();
    }

    public void setDate(String date) {
        driver.findElement(settledDate).sendKeys(date);
        driver.findElement(By.xpath(".//div[@class='App_App__15LM-']")).click();
    }

    public void setLimitOfRent(String limit) {
        String limitOfRentFormatter = String.format(".//div[@class='Dropdown-menu']/div[text()='%s']", limit);
        driver.findElement(dropDown).click();
        driver.findElement(By.xpath(limitOfRentFormatter)).click();
    }

    public void startOrder() {
        driver.findElement(startOrderButton).click();
    }

    public void yesButtonClick() {
        driver.findElement(yesButton).click();
    }
}