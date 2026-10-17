package nd;

import com.google.common.base.Ascii;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes17.dex */
public final class d implements ad.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ed.c f214250c = ed.c.ALGORITHM_NOT_FIPS;
    public static final List d = Arrays.asList(64);
    public static final byte[] e = new byte[16];
    public static final byte[] f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f214251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f214252b;

    public d(byte[] bArr) throws GeneralSecurityException {
        if (!f214250c.a()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (!d.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(j6.a.v(new StringBuilder("invalid key size: "), " bytes; key must have 64 bytes", bArr.length));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.f214252b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.f214251a = new s(bArrCopyOfRange);
    }

    @Override // ad.d
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher = (Cipher) j.f214261b.f214263a.e("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & Ascii.DEL);
        bArr3[12] = (byte) (bArr3[12] & Ascii.DEL);
        cipher.init(2, new SecretKeySpec(this.f214252b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            bArrDoFinal = new byte[0];
        }
        if (MessageDigest.isEqual(bArrCopyOfRange, c(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    @Override // ad.d
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) j.f214261b.f214263a.e("AES/CTR/NoPadding");
        byte[] bArrC = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrC.clone();
        bArr3[8] = (byte) (bArr3[8] & Ascii.DEL);
        bArr3[12] = (byte) (bArr3[12] & Ascii.DEL);
        cipher.init(1, new SecretKeySpec(this.f214252b, "AES"), new IvParameterSpec(bArr3));
        return hx7.i.c(bArrC, cipher.doFinal(bArr));
    }

    public final byte[] c(byte[]... bArr) {
        byte[] bArrF0;
        int length = bArr.length;
        s sVar = this.f214251a;
        if (length == 0) {
            return sVar.a(16, f);
        }
        byte[] bArrA = sVar.a(16, e);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrA = hx7.i.f0(ue8.c.t(bArrA), sVar.a(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < bArrA.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int length2 = bArr3.length - bArrA.length;
            bArrF0 = Arrays.copyOf(bArr3, bArr3.length);
            for (int i2 = 0; i2 < bArrA.length; i2++) {
                int i3 = length2 + i2;
                bArrF0[i3] = (byte) (bArrF0[i3] ^ bArrA[i2]);
            }
        } else {
            if (bArr3.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr3, 16);
            bArrCopyOf[bArr3.length] = -128;
            bArrF0 = hx7.i.f0(bArrCopyOf, ue8.c.t(bArrA));
        }
        return sVar.a(16, bArrF0);
    }
}
