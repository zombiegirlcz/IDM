package gcm;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public final class t4 extends InputStream implements ecm.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f142883a;

    @Override // java.io.InputStream
    public final int available() {
        return this.f142883a.m();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f142883a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f142883a.f();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f142883a.g();
    }

    @Override // java.io.InputStream
    public final int read() {
        d dVar = this.f142883a;
        if (dVar.m() == 0) {
            return -1;
        }
        return dVar.l();
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f142883a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j2) {
        d dVar = this.f142883a;
        int iMin = (int) Math.min(dVar.m(), j2);
        dVar.n(iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        d dVar = this.f142883a;
        if (dVar.m() == 0) {
            return -1;
        }
        int iMin = Math.min(dVar.m(), i2);
        dVar.k(bArr, i, iMin);
        return iMin;
    }
}
