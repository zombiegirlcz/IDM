package nd;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes17.dex */
public final class u implements ld.a {
    public static final ed.c e = ed.c.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f214271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f214272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f214273c;
    public final int d;

    public u(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        t tVar = new t(this);
        this.f214271a = tVar;
        if (!e.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f214272b = str;
        this.f214273c = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                this.d = 20;
                break;
            case "HMACSHA224":
                this.d = 28;
                break;
            case "HMACSHA256":
                this.d = 32;
                break;
            case "HMACSHA384":
                this.d = 48;
                break;
            case "HMACSHA512":
                this.d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        tVar.get();
    }

    @Override // ld.a
    public final byte[] a(int i, byte[] bArr) throws InvalidAlgorithmParameterException {
        if (i > this.d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        t tVar = this.f214271a;
        ((Mac) tVar.get()).update(bArr);
        return Arrays.copyOf(((Mac) tVar.get()).doFinal(), i);
    }
}
