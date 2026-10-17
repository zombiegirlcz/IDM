package gcm;

import io.grpc.StatusRuntimeException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes22.dex */
public final class u3 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f142897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e6 f142898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f142899c;
    public long d;
    public long e;

    public u3(InputStream inputStream, int i, e6 e6Var) {
        super(inputStream);
        this.e = -1L;
        this.f142897a = i;
        this.f142898b = e6Var;
    }

    public final void d() {
        long j2 = this.d;
        long j3 = this.f142899c;
        if (j2 > j3) {
            long j5 = j2 - j3;
            for (ecm.e0 e0Var : this.f142898b.f142632a) {
                e0Var.g(j5);
            }
            this.f142899c = this.d;
        }
    }

    public final void f() {
        long j2 = this.d;
        int i = this.f142897a;
        if (j2 <= i) {
            return;
        }
        throw new StatusRuntimeException(ecm.g2.f124805j.g("Decompressed gRPC message exceeds maximum size " + i));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.e = this.d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            this.d++;
        }
        f();
        d();
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.e == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.d = this.e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j2);
        this.d += jSkip;
        f();
        d();
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 != -1) {
            this.d += (long) i3;
        }
        f();
        d();
        return i3;
    }
}
