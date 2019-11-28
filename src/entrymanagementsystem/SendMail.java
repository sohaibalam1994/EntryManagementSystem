/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrymanagementsystem;

/**
 *
 * @author sohai
 */
import java.util.*; 
import javafx.stage.Screen;
import javax.mail.*; 
import javax.mail.internet.*; 
import javax.activation.*; 
import javax.mail.Session; 
import javax.mail.Transport; 
  
  
public class SendMail  
{ 
 
   public static void main(String [] args)  
   {     
      Screeen st=new Screeen();
      String recipient = "monib.rahman88@gmail.com"; 

      String sender =st.mail ; 
      String host = "127.0.0.1"; 
  
      Properties properties = System.getProperties(); 
  
      properties.setProperty("mail.smtp.host", host); 
  
      Session session = Session.getDefaultInstance(properties); 
  
      try 
      { 
         
         MimeMessage message = new MimeMessage(session); 
  
         message.setFrom(new InternetAddress(sender)); 
   
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient)); 
  
         message.setSubject("ENTRY DETAILS"); 
         
   
         message.setText(st.msg); 
  
         Transport.send(message); 
       
      } 
      catch (MessagingException mex)  
      { 
         mex.printStackTrace(); 
      } 
   } 
   
   public void SendToHost()
   {
       Screeen st=new Screeen();
      String recipient = "monib.rahman88@gmail.com"; 

      String sender ="host1@gmail.com" ; 
      String host = "127.0.0.1"; 
  
      Properties properties = System.getProperties(); 
  
      properties.setProperty("mail.smtp.host", host); 
  
      Session session = Session.getDefaultInstance(properties); 
  
      try 
      { 
         
         MimeMessage message = new MimeMessage(session); 
  
         message.setFrom(new InternetAddress(sender)); 
   
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient)); 
  
         message.setSubject("ENTRY DETAILS"); 
         
   
         message.setText(st.msg); 
  
         Transport.send(message); 
       
      } 
      catch (MessagingException mex)  
      { 
         mex.printStackTrace(); 
      } 
   } 
   
}
