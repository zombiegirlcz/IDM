package nd;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public final class h implements ad.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f214258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ad.n f214259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f214260c;

    public h(r rVar, ad.n nVar, int i) {
        this.f214258a = rVar;
        this.f214259b = nVar;
        this.f214260c = i;
    }

    @Override // ad.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        a aVar = (a) this.f214258a;
        aVar.getClass();
        int length = bArr.length;
        int i = aVar.f214242b;
        int i2 = Integer.MAX_VALUE - i;
        if (length > i2) {
            throw new GeneralSecurityException(a0.d.n("plaintext length can not exceed ", i2));
        }
        byte[] bArr3 = new byte[bArr.length + i];
        byte[] bArrA = w.a(i);
        System.arraycopy(bArrA, 0, bArr3, 0, i);
        aVar.a(true, bArr, bArr3, 0, bArr.length, bArrA, aVar.f214242b);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return hx7.i.c(bArr3, this.f214259b.b(hx7.i.c(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // ad.a
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f214260c;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f214259b.a(bArrCopyOfRange2, hx7.i.c(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        a aVar = (a) this.f214258a;
        aVar.getClass();
        int length2 = bArrCopyOfRange.length;
        int i2 = aVar.f214242b;
        if (length2 < i2) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArrCopyOfRange, 0, bArr3, 0, i2);
        int length3 = bArrCopyOfRange.length;
        int i3 = aVar.f214242b;
        byte[] bArr4 = new byte[length3 - i3];
        aVar.a(false, bArrCopyOfRange, bArr4, i3, bArrCopyOfRange.length - i3, bArr3, 0);
        return bArr4;
    }
}
