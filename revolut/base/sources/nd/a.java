package nd;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements r {
    public static final ed.c d = ed.c.ALGORITHM_REQUIRES_BORINGCRYPTO;
    public static final cd.b e = new cd.b(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f214241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f214242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f214243c;

    public a(byte[] bArr, int i) throws GeneralSecurityException {
        if (!d.a()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        x.a(bArr.length);
        this.f214241a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) e.get()).getBlockSize();
        this.f214243c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f214242b = i;
    }

    public final void a(boolean z, byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, int i3) throws GeneralSecurityException {
        Cipher cipher = (Cipher) e.get();
        byte[] bArr4 = new byte[this.f214243c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f214242b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f214241a;
        if (z) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
