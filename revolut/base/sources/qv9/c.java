package qv9;

import java.security.Key;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import kgm.i;

/* JADX INFO: loaded from: classes13.dex */
public interface c {
    i a(byte[] bArr, Key key);

    SecretKeySpec b(byte[] bArr);

    byte[] c(PublicKey publicKey, PrivateKey privateKey);

    byte[] d(i iVar, Key key);

    SecretKey e();

    KeyPair generateKeyPair();
}
