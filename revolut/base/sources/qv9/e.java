package qv9;

import java.security.Key;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import kgm.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f249545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PublicKey f249546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PrivateKey f249547c;
    public final SecretKeySpec d;

    public e(d realService, a31.a encryptionKeysEncoder) {
        Intrinsics.checkNotNullParameter(realService, "realService");
        Intrinsics.checkNotNullParameter(encryptionKeysEncoder, "encryptionKeysEncoder");
        this.f249545a = realService;
        this.f249546b = encryptionKeysEncoder.l("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEblXeZZLqtcNrFvi/Dy/cTf9cKXAJRM9gZqAM/+EWg1TLRgcSVimAjWz/ux3jJRATB4P3E93lNSKWtfzVlOGMcw==");
        this.f249547c = encryptionKeysEncoder.k("MIGHAgEAMBMGByqGSM49AgEGCCqGSM49AwEHBG0wawIBAQQg5zxyuKH37NhxHLELcE3Bljj+p8BsFthV3+CAeXXYwAqhRANCAARuVd5lkuq1w2sW+L8PL9xN/1wpcAlEz2BmoAz/4RaDVMtGBxJWKYCNbP+7HeMlEBMHg/cT3eU1Ipa1/NWU4Yxz");
        Intrinsics.checkNotNullParameter("3Wk8adft1I9o/PImAoPSIvUBgKhwgxAx8iUoAmRrKrY=", "encodedSymmetricKey");
        this.d = new SecretKeySpec(((a) encryptionKeysEncoder.f955b).a("3Wk8adft1I9o/PImAoPSIvUBgKhwgxAx8iUoAmRrKrY="), "AES");
    }

    @Override // qv9.c
    public final i a(byte[] plainText, Key key) {
        Intrinsics.checkNotNullParameter(plainText, "plainText");
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f249545a.a(plainText, key);
    }

    @Override // qv9.c
    public final SecretKeySpec b(byte[] symmetricKeyRaw) {
        Intrinsics.checkNotNullParameter(symmetricKeyRaw, "symmetricKeyRaw");
        return this.f249545a.b(symmetricKeyRaw);
    }

    @Override // qv9.c
    public final byte[] c(PublicKey publicKey, PrivateKey privateKey) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        return this.f249545a.c(publicKey, privateKey);
    }

    @Override // qv9.c
    public final byte[] d(i cipherWithNonce, Key key) {
        Intrinsics.checkNotNullParameter(cipherWithNonce, "cipherWithNonce");
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f249545a.d(cipherWithNonce, key);
    }

    @Override // qv9.c
    public final SecretKey e() {
        return this.d;
    }

    @Override // qv9.c
    public final KeyPair generateKeyPair() {
        return new KeyPair(this.f249546b, this.f249547c);
    }
}
