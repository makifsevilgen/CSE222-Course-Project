package tests;
import java.io.*;

/**
 * @author S. Burak YASAR
 */

public class CovidTest extends Test{
    
    private boolean testResult;

    /** Constructor
    *@param patientID patient id
    */
    public CovidTest(String patientID){
        super(patientID);
        testResult = false;
    }
    
    // A constructor.
    public CovidTest(String patientID, boolean testResult){
        super(patientID);
        this.testResult = testResult;
    }     

    /**
     * This function sets the testResult variable to the value of the parameter result
     * 
     * @param result The result of the test.
     */
    public void setTestResult(boolean result){
        testResult = result;
    }

    /** Get Result
    *@return returns test result
    */
    public boolean getTestResult(){
        return testResult;
    }

    /** Returns String representation of test result
    *@return returns test result
    */
    public String toString(){
        
        return   "\nPatient ID:" + getID() + ((testResult == true) ? " Covid Test Result: Positive" :
        " Covid Test Result: Negative");
    }

    /**
     * This function is used to test the CovidTest class
     */
    public static void main(String[] args) {

        System.out.println("------------ Test of RadiologicalTest ---------------\n");
        
        String patientId1 = "123456";
        String patientId2 = "1474744784784";


        /**Constructor test */

        CovidTest test1 = new CovidTest(patientId1);
        CovidTest test2 = new CovidTest(patientId2);


        /**Setter test */

        test1.setTestResult(true);
        test2.setTestResult(false);

        /**Getter test */

        System.out.println("Get Result: " + test1.getTestResult());
        System.out.println();
        
        System.out.println("Get Result: " + test2.getTestResult());
        System.out.println();
        
        /** stringTo Test */

        System.out.println(test1);
        System.out.println();
        System.out.println(test2);
        
        
    }


}
