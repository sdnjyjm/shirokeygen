import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class shirokeygen{
public static void main(String[] args) throws Exception {
        KeyGenerator keygen = KeyGenerator.getInstance("AES");
        SecretKey deskey = keygen.generateKey();
        System.out.println(Base64.getEncoder().encodeToString(deskey.getEncoded()));
    }
}