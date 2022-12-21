import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MainTest {
    Main main = new Main();
    @Test
    void additional(){
        assertEquals(expected:3, main.add(x:1, y:1));
    }
}
