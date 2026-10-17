package y8;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import l8.x;

/* JADX INFO: loaded from: classes16.dex */
public final class e extends InputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayDeque f311596c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f311597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IOException f311598b;

    static {
        char[] cArr = l.f311609a;
        f311596c = new ArrayDeque(0);
    }

    public static e d(x xVar) {
        e eVar;
        ArrayDeque arrayDeque = f311596c;
        synchronized (arrayDeque) {
            eVar = (e) arrayDeque.poll();
        }
        if (eVar == null) {
            eVar = new e();
        }
        eVar.f311597a = xVar;
        return eVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f311597a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f311597a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f311597a.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f311597a.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f311597a.read();
        } catch (IOException e) {
            this.f311598b = e;
            throw e;
        }
    }

    public final void release() {
        this.f311598b = null;
        this.f311597a = null;
        ArrayDeque arrayDeque = f311596c;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f311597a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j2) throws IOException {
        try {
            return this.f311597a.skip(j2);
        } catch (IOException e) {
            this.f311598b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f311597a.read(bArr);
        } catch (IOException e) {
            this.f311598b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f311597a.read(bArr, i, i2);
        } catch (IOException e) {
            this.f311598b = e;
            throw e;
        }
    }
}
