package lj;

import com.ironz.binaryprefs.exception.EncryptionException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.jmrtd.lds.CVCAFile;

/* JADX INFO: loaded from: classes.dex */
public final class b implements e {
    public static final byte[] d = {CVCAFile.CAR_TAG, 80, 69, 70, 2, CVCAFile.CAR_TAG};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f195578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f195579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecureRandom f195580c;

    public b(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        if (bArr.length != 16) {
            throw new EncryptionException("Secret key must be 16 bytes");
        }
        this.f195578a = bArr;
        this.f195579b = bArr2;
        this.f195580c = new SecureRandom();
    }

    public static a c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new EncryptionException("Encrypted data is empty or null");
        }
        if (bArr.length >= 6 && bArr[0] == 66 && bArr[1] == 80 && bArr[2] == 69 && bArr[3] == 70 && bArr[5] == 66) {
            byte b4 = bArr[4];
            return b4 != 1 ? b4 != 2 ? a.V0_NO_HEADER_FIXED_IV_CBC : a.V2_HEADER_GCM : a.V1_HEADER_CBC;
        }
        return a.V0_NO_HEADER_FIXED_IV_CBC;
    }

    public final byte[] a(byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (bArr.length < 18) {
            throw new EncryptionException("Encrypted data too short for new format. ver 0x02");
        }
        byte[] bArr2 = new byte[12];
        byte[] bArr3 = new byte[bArr.length - 18];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.position(6);
        byteBufferWrap.get(bArr2);
        byteBufferWrap.get(bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f195578a, "AES");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr2);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, secretKeySpec, gCMParameterSpec);
        return cipher.doFinal(bArr3);
    }

    @Override // lj.e
    public final byte[] b(byte[] bArr) {
        try {
            a aVarC = c(bArr);
            int iOrdinal = aVarC.ordinal();
            byte[] bArr2 = this.f195578a;
            if (iOrdinal == 0) {
                byte[] bArr3 = this.f195579b;
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                cipher.init(2, secretKeySpec, ivParameterSpec);
                return cipher.doFinal(bArr);
            }
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return a(bArr);
                }
                throw new EncryptionException("Unexpected format " + aVarC.ordinal());
            }
            if (bArr.length < 22) {
                throw new EncryptionException("Encrypted data too short for new format. ver 0x01");
            }
            byte[] bArr4 = new byte[16];
            byte[] bArr5 = new byte[bArr.length - 22];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.position(6);
            byteBufferWrap.get(bArr4);
            byteBufferWrap.get(bArr5);
            SecretKeySpec secretKeySpec2 = new SecretKeySpec(bArr2, "AES");
            IvParameterSpec ivParameterSpec2 = new IvParameterSpec(bArr4);
            Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher2.init(2, secretKeySpec2, ivParameterSpec2);
            return cipher2.doFinal(bArr5);
        } catch (Exception e) {
            EncryptionException encryptionException = new EncryptionException("Failed to decrypt data");
            encryptionException.initCause(e);
            throw encryptionException;
        }
    }

    @Override // lj.e
    public final byte[] encrypt(byte[] bArr) {
        try {
            byte[] bArr2 = new byte[12];
            this.f195580c.nextBytes(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f195578a, "AES");
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr2);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeySpec, gCMParameterSpec);
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            byte[] bArr3 = d;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(18 + bArrDoFinal.length);
            byteBufferAllocate.put(bArr3);
            byteBufferAllocate.put(bArr2);
            byteBufferAllocate.put(bArrDoFinal);
            return byteBufferAllocate.array();
        } catch (Exception e) {
            throw new EncryptionException(e);
        }
    }
}
