package nd;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements ad.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ed.c f214248b = ed.c.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cd.c f214249a;

    public c(byte[] bArr) throws GeneralSecurityException {
        if (!f214248b.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f214249a = new cd.c(bArr);
    }

    @Override // ad.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrA = w.a(12);
        cd.c cVar = this.f214249a;
        boolean z = cVar.f23131b;
        if (bArrA.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[z ? bArr.length + 28 : bArr.length + 16];
        if (z) {
            System.arraycopy(bArrA, 0, bArr3, 0, 12);
        }
        AlgorithmParameterSpec algorithmParameterSpecA = cd.c.a(bArrA);
        cd.b bVar = cd.c.d;
        ((Cipher) bVar.get()).init(1, cVar.f23130a, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) bVar.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) bVar.get()).doFinal(bArr, 0, bArr.length, bArr3, z ? 12 : 0);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(j6.a.l(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    }

    @Override // ad.a
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        cd.c cVar = this.f214249a;
        boolean z = cVar.f23131b;
        if (bArrCopyOf.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr.length < (z ? 28 : 16)) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (z && !ByteBuffer.wrap(bArrCopyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = cd.c.a(bArrCopyOf);
        cd.b bVar = cd.c.d;
        ((Cipher) bVar.get()).init(2, cVar.f23130a, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) bVar.get()).updateAAD(bArr2);
        }
        int i = z ? 12 : 0;
        int length = bArr.length;
        if (z) {
            length -= 12;
        }
        return ((Cipher) bVar.get()).doFinal(bArr, i, length);
    }
}
