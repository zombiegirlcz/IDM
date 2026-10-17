package nd;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public final class g implements ad.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cd.f f214257b;

    public g(byte[] bArr, int i) {
        this.f214256a = i;
        switch (i) {
            case 1:
                this.f214257b = new cd.f(bArr, 1);
                break;
            default:
                this.f214257b = new cd.f(bArr, 0);
                break;
        }
    }

    @Override // ad.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f214256a) {
            case 0:
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] bArrA = w.a(12);
                byteBufferAllocate.put(bArrA);
                this.f214257b.b(byteBufferAllocate, bArrA, bArr, bArr2);
                return byteBufferAllocate.array();
            default:
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] bArrA2 = w.a(24);
                byteBufferAllocate2.put(bArrA2);
                this.f214257b.b(byteBufferAllocate2, bArrA2, bArr, bArr2);
                return byteBufferAllocate2.array();
        }
    }

    @Override // ad.a
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f214256a) {
            case 0:
                if (bArr.length < 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
                return this.f214257b.a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), bArrCopyOf, bArr2);
            default:
                if (bArr.length < 40) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                byte[] bArrCopyOf2 = Arrays.copyOf(bArr, 24);
                return this.f214257b.a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), bArrCopyOf2, bArr2);
        }
    }
}
