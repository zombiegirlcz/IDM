package cd;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.k;
import com.revolut.core.ui_kit.models.Clause;
import hx7.i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes17.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f23134b;

    public e(Clause clause, int i) {
        this.f23134b = clause;
        this.f23133a = i;
    }

    public static int d(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long e(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static k i(byte[] bArr, int i, int i2, boolean z) {
        k kVar = new k(bArr, i, i2, z);
        try {
            kVar.m(i2);
            return kVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public ByteBuffer a(int i, byte[] bArr) {
        int[] iArrC = c(i, a.c(bArr));
        int[] iArr = (int[]) iArrC.clone();
        a.b(iArr);
        for (int i2 = 0; i2 < iArrC.length; i2++) {
            iArrC[i2] = iArrC[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrC, 0, 16);
        return byteBufferOrder;
    }

    public abstract void b(int i);

    public abstract int[] c(int i, int[] iArr);

    public abstract boolean f();

    public abstract int g();

    public abstract boolean h();

    public abstract int j();

    public abstract void k(int i);

    public void l(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != j()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + j());
        }
        int iRemaining = byteBuffer2.remaining();
        int i = iRemaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBufferA = a(this.f23133a + i3, bArr);
            if (i3 == i) {
                i.d0(byteBuffer, byteBuffer2, byteBufferA, iRemaining % 64);
            } else {
                i.d0(byteBuffer, byteBuffer2, byteBufferA, 64);
            }
        }
    }

    public abstract int m(int i);

    public abstract boolean n();

    public abstract com.google.crypto.tink.shaded.protobuf.i o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();
}
