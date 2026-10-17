package nd;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes17.dex */
public final class v implements ad.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ld.a f214274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f214275b;

    public v(ld.a aVar, int i) throws InvalidAlgorithmParameterException {
        this.f214274a = aVar;
        this.f214275b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.a(i, new byte[0]);
    }

    @Override // ad.n
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!MessageDigest.isEqual(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // ad.n
    public final byte[] b(byte[] bArr) {
        return this.f214274a.a(this.f214275b, bArr);
    }
}
