package gcm;

import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* JADX INFO: loaded from: classes13.dex */
public final class u4 extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f142900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f142901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f142902c;
    public int d = -1;

    public u4(byte[] bArr, int i, int i2) {
        Preconditions.checkArgument(i >= 0, "offset must be >= 0");
        Preconditions.checkArgument(i2 >= 0, "length must be >= 0");
        int i3 = i2 + i;
        Preconditions.checkArgument(i3 <= bArr.length, "offset + length exceeds array boundary");
        this.f142902c = (byte[]) Preconditions.checkNotNull(bArr, "bytes");
        this.f142900a = i;
        this.f142901b = i3;
    }

    @Override // gcm.d
    public final void f() {
        this.d = this.f142900a;
    }

    @Override // gcm.d
    public final d h(int i) {
        d(i);
        int i2 = this.f142900a;
        this.f142900a = i2 + i;
        return new u4(this.f142902c, i2, i);
    }

    @Override // gcm.d
    public final void i(OutputStream outputStream, int i) throws IOException {
        d(i);
        outputStream.write(this.f142902c, this.f142900a, i);
        this.f142900a += i;
    }

    @Override // gcm.d
    public final void j(ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer, "dest");
        int iRemaining = byteBuffer.remaining();
        d(iRemaining);
        byteBuffer.put(this.f142902c, this.f142900a, iRemaining);
        this.f142900a += iRemaining;
    }

    @Override // gcm.d
    public final void k(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f142902c, this.f142900a, bArr, i, i2);
        this.f142900a += i2;
    }

    @Override // gcm.d
    public final int l() {
        d(1);
        int i = this.f142900a;
        this.f142900a = i + 1;
        return this.f142902c[i] & UnsignedBytes.MAX_VALUE;
    }

    @Override // gcm.d
    public final int m() {
        return this.f142901b - this.f142900a;
    }

    @Override // gcm.d
    public final void n(int i) {
        d(i);
        this.f142900a += i;
    }

    @Override // gcm.d
    public final void reset() {
        int i = this.d;
        if (i == -1) {
            throw new InvalidMarkException();
        }
        this.f142900a = i;
    }
}
