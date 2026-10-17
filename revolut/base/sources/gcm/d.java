package gcm;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public abstract class d implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void d(int i) {
        if (m() < i) {
            throw new IndexOutOfBoundsException();
        }
    }

    public void f() {
    }

    public boolean g() {
        return this instanceof u4;
    }

    public abstract d h(int i);

    public abstract void i(OutputStream outputStream, int i);

    public abstract void j(ByteBuffer byteBuffer);

    public abstract void k(byte[] bArr, int i, int i2);

    public abstract int l();

    public abstract int m();

    public abstract void n(int i);

    public void reset() {
        throw new UnsupportedOperationException();
    }
}
