package createdata;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class organisation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
		//login
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("root");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		//create new organization
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Qspider");
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		
		
		//create new contact
		int count=0;
		while(count<20)
		{
		try
		{
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		break;
		}
		catch(Exception e)
		{
			System.out.println("Exception handeled");
		}}
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Divya ");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ravi");
		driver.findElement(By.xpath("//img[contains(@onclick,'return window')]")).click();
		Set<String> setc=driver.getWindowHandles();
		Iterator<String> itc=setc.iterator();
		String parentidc=itc.next();
		String childidc=itc.next();
		driver.switchTo().window(childidc);
		driver.findElement(By.xpath("//a[text()='Qspider']")).click();
		driver.switchTo().window(parentidc);
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
	
	
	
	  //create new opportunity
	driver.findElement(By.xpath("//a[text()='Opportunities']")).click();
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	driver.findElement(By.xpath("//input[@name='potentialname']")).sendKeys("Rithvik",Keys.ENTER);
	while(count<20)
	{
		try
		{
	driver.findElement(By.xpath("//img[contains(@onclick,'return window')]")).click();
	Set<String> seto=driver.getWindowHandles();
	Iterator<String> ito=seto.iterator();
	String parentido=ito.next();
	String childido=ito.next();
	driver.switchTo().window(childido);
	driver.findElement(By.xpath("//a[text()='Qspider']")).click();
	driver.switchTo().window(parentido);
	driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
    break;
		}
		catch(Exception e)
		{
			System.out.println("Handeled");
		}
	}
	//create new vendors
			String x="//a[text()='More']";
			WebElement wb=driver.findElement(By.xpath(x));
			Actions act=new Actions(driver);
			act.moveToElement(wb).perform();
			driver.findElement(By.xpath("//a[text()='Vendors']")).click();
			driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	        driver.findElement(By.name("vendorname")).sendKeys("Apple");
	        driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
	
	//create new product
	driver.findElement(By.xpath("//a[text()='Products']")).click();
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	driver.findElement(By.xpath("//input[@name='productname']")).sendKeys("laptop");
	driver.findElement(By.xpath("//img[contains(@onclick,'return window')]")).click();
	Set<String> setp=driver.getWindowHandles();
	Iterator<String> itp=setp.iterator();
	String parentidp=itp.next();
	String childidp=itp.next();
	driver.switchTo().window(childidp);
	driver.findElement(By.xpath("//a[text()='Apple']")).click();
	driver.switchTo().window(parentidp);
	driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
	
	
	//create new quote
	 WebElement wb1=driver.findElement(By.xpath(x));
	act.moveToElement(wb1).perform();
    driver.findElement(By.xpath("//a[text()='Quotes']")).click();
    driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
    driver.findElement(By.name("subject")).sendKeys("Deepak");
    WebElement wbe1= driver.findElement(By.xpath("//select[@name='quotestage']"));
    Select sel1=new Select(wbe1);
    sel1.selectByValue("Accepted");
    driver.findElement(By.xpath("//img[contains(@onclick,'selectContact')]")).click();
    Set<String> setq=driver.getWindowHandles();
    Iterator <String> itq=setq.iterator();
    String Parentidq=itq.next();
    String childidq=itq.next();
    driver.switchTo().window(childidq);
    driver.findElement(By.xpath("//a[text()='Divya ravi']")).click();
    Alert altq=driver.switchTo().alert();
    altq.accept();
       
    driver.switchTo().window(Parentidq);
    
 
    driver.findElement(By.xpath("//img[contains(@onclick,'return window')]")).click();
    
  
    Set<String> setq1=driver.getWindowHandles();
    Iterator <String> itq1=setq1.iterator();
    String Parentidq1=itq1.next();
    String childidq1=itq1.next();
    driver.switchTo().window(childidq1);
    driver.findElement(By.xpath("//a[text()='Qspider']")).click();
     Alert altq1=driver.switchTo().alert();
     altq1.accept();
     driver.switchTo().window(Parentidq1);
     driver.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys("Qspiders OAR,Murugeshpalya");
   
     driver.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys("Qspiders OAR,Murugeshpalya");
     driver.findElement(By.xpath("//img[contains(@onclick,'productPickList')]")).click();
     Set<String> setq2=driver.getWindowHandles();
     Iterator <String> itq2=setq2.iterator();
     String Parentidq2=itq2.next();
     String childidq2=itq2.next();
     driver.switchTo().window(childidq2);
     driver.findElement(By.xpath("//a[text()='laptop']")).click();
     driver.switchTo().window(Parentidq2);
     
     driver.findElement(By.xpath("//input[@id='qty1']")).sendKeys("10");
     driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
     
     //create new salesorder
     
		WebElement wbe=driver.findElement(By.xpath("//a[text()='More']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(wbe).click().perform();
		driver.findElement(By.xpath("//a[@name='Sales Order']")).click();
		 driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		 driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("so_vtiger");
		 driver.findElement(By.xpath("//img[@onclick='selectQuote()']")).click();
		 Set<String> sets1=driver.getWindowHandles();
	       Iterator <String> its1=sets1.iterator();
	       String Parentids1=its1.next();
	       String childids1=its1.next();
	       driver.switchTo().window(childids1);
	       driver.findElement(By.xpath("//a[text()='Deepak']")).click();
	      
	       driver.switchTo().window(Parentids1);
	       driver.findElement(By.xpath("//img[contains(@onclick,'return window')]")).click();
	       
	       
	       Set<String> sets=driver.getWindowHandles();
	       Iterator <String> its=sets.iterator();
	       String Parentids=its.next();
	       String childids=its.next();
	       driver.switchTo().window(childids);
	       driver.findElement(By.xpath("//a[text()='Qspider']")).click();
	        Alert alts=driver.switchTo().alert();
	        alts.accept();
	        driver.switchTo().window(Parentids);
	        driver.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys("Qspiders OAR,Murugeshpalya");
	        
	        driver.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys("Qspiders OAR,Murugeshpalya");
	        driver.findElement(By.xpath("//img[contains(@onclick,'productPickList')]")).click();
	        Set<String> sets2=driver.getWindowHandles();
	        Iterator <String> its2=sets2.iterator();
	        String Parentids2=its2.next();
	        String childids2=its2.next();
	        driver.switchTo().window(childids2);
	        driver.findElement(By.xpath("//a[text()='laptop']")).click();
	        driver.switchTo().window(Parentids2);
	        
	        driver.findElement(By.xpath("//input[@id='qty1']")).sendKeys("10");
	        driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
	        
	        //create new Invoice
	        while(count<20)
		    {
		    	try
		    	{
	       
	        WebElement we=driver.findElement(By.xpath("//a[text()='More']"));
			Actions actin=new Actions(driver);
			actin.moveToElement(we).click().perform();
			driver.findElement(By.xpath("//a[@name='Invoice']")).click();
			driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
			break;
		    	}
		    	catch(Exception e)
		    	{
		    		System.out.println("Handeled");
		    	}	    		
		    	}
			  driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("Rithvik1");
			   driver.findElement(By.xpath("//img[@onclick='selectSalesOrder();']")).click();
			   Set<String> seti=driver.getWindowHandles();
		       Iterator <String> iti=seti.iterator();
		       String Parentidi=iti.next();
		       String childidi=iti.next();
		       driver.switchTo().window(childidi);
		       driver.findElement(By.xpath("//a[text()='so_vtiger']")).click();
		       driver.switchTo().window(Parentidi);
		       driver.findElement(By.xpath("//img[contains(@onclick,'selectContact')]")).click();
		       Set<String> seti1=driver.getWindowHandles();
		       Iterator <String> iti1=seti1.iterator();
		       String Parentidi1=iti1.next();
		       String childidi1=iti1.next();
		       driver.switchTo().window(childidi1);
		       driver.findElement(By.xpath("//a[text()='Divya ravi']")).click();
		       Alert alti1=driver.switchTo().alert();
		       alti1.accept();
		       driver.switchTo().window(Parentidi1);
		       driver.findElement(By.xpath("//img[contains(@onclick,'return window')]")).click();
		       Set<String> set12=driver.getWindowHandles();
		       Iterator <String> it12=set12.iterator();
		       String Parentid12=it12.next();
		       String childid12=it12.next();
		       driver.switchTo().window(childid12);
		       driver.findElement(By.xpath("//a[text()='Qspider']")).click();
		       Alert altin1=driver.switchTo().alert();
		       altin1.accept();
		       driver.switchTo().window(Parentid12);
		       WebElement wbi=driver.findElement(By.xpath("//select[@name='invoicestatus']"));
		       Select sel11=new Select(wbi);
		       sel11.selectByValue("Created");
		       driver.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys("Qspiders,Malleshwaram");
		       
		       driver.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys("Qspiders ,Malleshwaram");
		       driver.findElement(By.xpath("//img[contains(@onclick,'productPickList')]")).click();
		       Set<String> setin=driver.getWindowHandles();
		       Iterator <String> itin=setin.iterator();
		       String Parentidin=itin.next();
		       String childidin=itin.next();
		       driver.switchTo().window(childidin);
		      
		       driver.findElement(By.xpath("//a[text()='laptop']")).click();
		       driver.switchTo().window(Parentidin);
		       
		       driver.findElement(By.xpath("//input[@id='qty1']")).sendKeys("100");
		       driver.findElement(By.name("button")).click();
		       System.out.println("Invoice is successfully created with Created status");
		       driver.findElement(By.xpath("//a[@class='hdrLink']")).click();
		   
	}

}
