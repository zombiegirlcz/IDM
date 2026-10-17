package y8;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class a extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f311590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f311591b = -1;

    public a(ByteBuffer byteBuffer) {
        this.f311590a = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f311590a.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.f311591b = this.f311590a.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f311590a;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & UnsignedBytes.MAX_VALUE;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i = this.f311591b;
        if (i == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f311590a.position(i);
    }

    @Override // java.io.InputStream
    public final long skip(long j2) {
        ByteBuffer byteBuffer = this.f311590a;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long jMin = Math.min(j2, byteBuffer.remaining());
        byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
        return jMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.f311590a;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }
}
