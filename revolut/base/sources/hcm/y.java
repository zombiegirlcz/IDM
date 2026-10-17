package hcm;

import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class y extends gcm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mmm.h f151337a;

    public y(mmm.h hVar) {
        this.f151337a = hVar;
    }

    @Override // gcm.d, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f151337a.f();
    }

    @Override // gcm.d
    public final gcm.d h(int i) {
        mmm.h hVar = new mmm.h();
        hVar.write(this.f151337a, i);
        return new y(hVar);
    }

    @Override // gcm.d
    public final void i(OutputStream outputStream, int i) throws IOException {
        this.f151337a.B(outputStream, i);
    }

    @Override // gcm.d
    public final void j(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // gcm.d
    public final void k(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int i3 = this.f151337a.read(bArr, i, i2);
            if (i3 == -1) {
                throw new IndexOutOfBoundsException(j6.a.l(i2, "EOF trying to read ", " bytes"));
            }
            i2 -= i3;
            i += i3;
        }
    }

    @Override // gcm.d
    public final int l() {
        try {
            return this.f151337a.readByte() & UnsignedBytes.MAX_VALUE;
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // gcm.d
    public final int m() {
        return (int) this.f151337a.f207266b;
    }

    @Override // gcm.d
    public final void n(int i) {
        try {
            this.f151337a.skip(i);
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }
}
