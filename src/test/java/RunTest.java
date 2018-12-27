import org.junit.*;

public class RunTest {
    @Before
    public void tearsUp(){
        System.out.println("BeforeTest");
    }
    @After
    public void tearsDown(){
        System.out.println("AfterTest");
    }
    @Test
    public void testStringEquals(){
        String testBody = "TestBody";
        System.out.println(testBody);
        Assert.assertEquals("Строки не равны!", "TestBody", testBody);
    }
    @Test
    public void testClassFail(){
        String testBody = this.getClass().getSimpleName();
        System.out.println(testBody);
        Assert.assertEquals("Имя класса не соответствует:\"TestClass\"!", "TestClass", testBody);
    }

}
