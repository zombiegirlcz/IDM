package nd;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes17.dex */
public final class s implements ld.a {
    public static final ed.c d = ed.c.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f214267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f214268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f214269c;

    public s(byte[] bArr) throws GeneralSecurityException {
        x.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f214267a = secretKeySpec;
        if (!d.a()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) j.f214261b.f214263a.e("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] bArrT = ue8.c.t(cipher.doFinal(new byte[16]));
        this.f214268b = bArrT;
        this.f214269c = ue8.c.t(bArrT);
    }

    @Override // ld.a
    public final byte[] a(int i, byte[] bArr) {
        byte[] bArrF0;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!d.a()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) j.f214261b.f214263a.e("AES/ECB/NoPadding");
        cipher.init(1, this.f214267a);
        int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        if (iMax * 16 == bArr.length) {
            bArrF0 = hx7.i.e0((iMax - 1) * 16, bArr, 0, this.f214268b, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = -128;
            bArrF0 = hx7.i.f0(bArrCopyOf, this.f214269c);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i2 = 0; i2 < iMax - 1; i2++) {
            bArrDoFinal = cipher.doFinal(hx7.i.e0(0, bArrDoFinal, i2 * 16, bArr, 16));
        }
        return Arrays.copyOf(cipher.doFinal(hx7.i.f0(bArrF0, bArrDoFinal)), i);
    }
}
