package xmm;

import java.io.IOException;
import java.io.OutputStream;
import tc7.m0;

/* JADX INFO: loaded from: classes14.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f307289a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f307290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wmm.a f307291c;
    public long d;
    public boolean e;

    public c(m0 m0Var, tjf.m0 m0Var2) {
        this.f307290b = m0Var;
        this.f307291c = m0Var2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            flush();
        } catch (IOException unused) {
        }
        ((OutputStream) this.f307291c.a(this)).close();
    }

    public final void d(int i) {
        if (this.e || this.d + ((long) i) <= this.f307289a) {
            return;
        }
        this.e = true;
        this.f307290b.getClass();
        throw new IllegalArgumentException(String.format("Cannot read more than %,d into a byte array", Integer.MAX_VALUE));
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        ((OutputStream) this.f307291c.a(this)).flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        d(bArr.length);
        ((OutputStream) this.f307291c.a(this)).write(bArr);
        this.d += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        d(i2);
        ((OutputStream) this.f307291c.a(this)).write(bArr, i, i2);
        this.d += (long) i2;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        d(1);
        ((OutputStream) this.f307291c.a(this)).write(i);
        this.d++;
    }
}
