package qv9;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kgm.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // qv9.c
    public final i a(byte[] plainText, Key key) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Intrinsics.checkNotNullParameter(plainText, "plainText");
        Intrinsics.checkNotNullParameter(key, "key");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, key);
        byte[] bArrDoFinal = cipher.doFinal(plainText);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        byte[] iv2 = cipher.getIV();
        Intrinsics.checkNotNullExpressionValue(iv2, "getIV(...)");
        return new i(bArrDoFinal, iv2);
    }

    @Override // qv9.c
    public final SecretKeySpec b(byte[] symmetricKeyRaw) {
        Intrinsics.checkNotNullParameter(symmetricKeyRaw, "symmetricKeyRaw");
        return new SecretKeySpec(symmetricKeyRaw, 0, 32, "AES");
    }

    @Override // qv9.c
    public final byte[] c(PublicKey publicKey, PrivateKey privateKey) throws NoSuchAlgorithmException, InvalidKeyException {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
        keyAgreement.init(privateKey);
        keyAgreement.doPhase(publicKey, true);
        byte[] bArrGenerateSecret = keyAgreement.generateSecret();
        Intrinsics.checkNotNullExpressionValue(bArrGenerateSecret, "generateSecret(...)");
        return bArrGenerateSecret;
    }

    @Override // qv9.c
    public final byte[] d(i cipherWithNonce, Key key) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(cipherWithNonce, "cipherWithNonce");
        Intrinsics.checkNotNullParameter(key, "key");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, key, new GCMParameterSpec(128, cipherWithNonce.i()));
        byte[] bArrDoFinal = cipher.doFinal(cipherWithNonce.g());
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    @Override // qv9.c
    public final SecretKey e() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        Intrinsics.checkNotNullExpressionValue(secretKeyGenerateKey, "generateKey(...)");
        return secretKeyGenerateKey;
    }

    @Override // qv9.c
    public final KeyPair generateKeyPair() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(new ECGenParameterSpec("prime256v1"));
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        Intrinsics.checkNotNullExpressionValue(keyPairGenerateKeyPair, "generateKeyPair(...)");
        return keyPairGenerateKeyPair;
    }
}
