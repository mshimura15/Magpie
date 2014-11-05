/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *       Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie
{
 /**
  * Get a default greeting  
  * @return a greeting
  */
 public String getGreeting()
 {
  return "Hello, let's talk.";
 }
 
 /**
  * Gives a response to a user statement
  * 
  * @param statement
  *            the user statement
  * @return a response based on the rules given
  */
 public String getResponse(String statement)
 {
  String response = "";
  if (statement.indexOf("no") >= 0)
  {
   response = "Why so negative?";
  }
  else if (statement.indexOf("yes") >= 0)
  {
   response = "That's great!";
  }
  else if (statement.indexOf("apple") >= 0)
  {
   response = "Fruits are very healthy.";
  }
  else if (statement.indexOf("school") >= 0)
  {
   response = "I love school.";
  }
  else if (statement.indexOf("mother") >= 0
    || statement.indexOf("father") >= 0
    || statement.indexOf("sister") >= 0
    || statement.indexOf("brother") >= 0)
  {
   response = "Tell me more about your family.";
  }
  else if (statement.indexOf("ted") >= 0
             || statement.indexOf("doug") >=0
             || statement.indexOf("kiang") >=0
             || statement.indexOf("landgraf") >=0)
  {
    response = "I heard he is a gentleman and a scholar.";
  }         
  else if (statement.indexOf("dog") >= 0
             || statement.indexOf("cat") >=0
             || statement.indexOf("dogs") >=0
             || statement.indexOf("cats") >=0)
  {
   response = "I love pets. Tell me more about yours.";
  }
  else           
  {
   response = getRandomResponse();
  }
  return response;
 }

 /**
  * Pick a default response to use if nothing else fits.
  * @return a non-committal string
  */
 private String getRandomResponse()
 {
  final int NUMBER_OF_RESPONSES = 6;
  double r = Math.random();
  int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
  String response = "";
  
  if (whichResponse == 0)
  {
   response = "Interesting, tell me more.";
  }
  else if (whichResponse == 1)
  {
   response = "Hmmm.";
  }
  else if (whichResponse == 2)
  {
   response = "Do you really think so?"; 
  }
  else if (whichResponse == 3)
  {
   response = "You don't say.";
  }
  else if (whichResponse == 4)
  {
    response = "That's amazing!";
  }
   else if (whichResponse == 5)
  {
    response = "Wow!";
  }

  return response;
 }
}
