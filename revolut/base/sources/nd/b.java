package nd;

import com.google.common.primitives.UnsignedBytes;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements ad.a {
    public static final ed.c e = ed.c.ALGORITHM_NOT_FIPS;
    public static final cd.b f = new cd.b(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final cd.b f214244g = new cd.b(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f214245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f214246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f214247c;
    public final int d;

    public b(byte[] bArr, int i) throws GeneralSecurityException {
        if (!e.a()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.d = i;
        x.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f214247c = secretKeySpec;
        Cipher cipher = (Cipher) f.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrB = b(cipher.doFinal(new byte[16]));
        this.f214245a = bArrB;
        this.f214246b = b(bArrB);
    }

    public static byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            int i2 = i + 1;
            bArr2[i] = (byte) (((bArr[i] << 1) ^ ((bArr[i2] & UnsignedBytes.MAX_VALUE) >>> 7)) & 255);
            i = i2;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // ad.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.d;
        if (length > 2147483631 - i) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i + 16];
        byte[] bArrA = w.a(i);
        System.arraycopy(bArrA, 0, bArr3, 0, i);
        Cipher cipher = (Cipher) f.get();
        SecretKeySpec secretKeySpec = this.f214247c;
        cipher.init(1, secretKeySpec);
        byte[] bArrC = c(cipher, 0, bArrA, 0, bArrA.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrC2 = c(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = (Cipher) f214244g.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrC));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.d);
        byte[] bArrC3 = c(cipher, 2, bArr3, this.d, bArr.length);
        int length2 = bArr.length + i;
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[length2 + i2] = (byte) ((bArrC2[i2] ^ bArrC[i2]) ^ bArrC3[i2]);
        }
        return bArr3;
    }

    public final byte[] c(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrCopyOf;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        byte[] bArr3 = this.f214245a;
        if (i3 == 0) {
            return cipher.doFinal(d(bArr2, bArr3));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                bArrDoFinal[i6] = (byte) (bArrDoFinal[i6] ^ bArr[(i2 + i5) + i6]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i5 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (bArrCopyOfRange.length == 16) {
            bArrCopyOf = d(bArrCopyOfRange, bArr3);
        } else {
            bArrCopyOf = Arrays.copyOf(this.f214246b, 16);
            for (int i21 = 0; i21 < bArrCopyOfRange.length; i21++) {
                bArrCopyOf[i21] = (byte) (bArrCopyOf[i21] ^ bArrCopyOfRange[i21]);
            }
            bArrCopyOf[bArrCopyOfRange.length] = (byte) (bArrCopyOf[bArrCopyOfRange.length] ^ 128);
        }
        return cipher.doFinal(d(bArrDoFinal, bArrCopyOf));
    }

    @Override // ad.a
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.d;
        int i2 = (length - i) - 16;
        if (i2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f.get();
        SecretKeySpec secretKeySpec = this.f214247c;
        cipher.init(1, secretKeySpec);
        byte[] bArrC = c(cipher, 0, bArr, 0, this.d);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrC2 = c(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrC3 = c(cipher, 2, bArr, this.d, i2);
        int length2 = bArr.length - 16;
        byte b4 = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            b4 = (byte) (b4 | (((bArr[length2 + i3] ^ bArrC2[i3]) ^ bArrC[i3]) ^ bArrC3[i3]));
        }
        if (b4 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f214244g.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrC));
        return cipher2.doFinal(bArr, i, i2);
    }
}
