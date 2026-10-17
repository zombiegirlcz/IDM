package tf;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import xf.f0;
import xf.z;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f270128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rf.d f270129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Timer f270130c;
    public long e;
    public long d = -1;
    public long f = -1;

    public a(InputStream inputStream, rf.d dVar, Timer timer) {
        this.f270130c = timer;
        this.f270128a = inputStream;
        this.f270129b = dVar;
        this.e = ((f0) dVar.d.f49761b).getTimeToResponseInitiatedUs();
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        try {
            return this.f270128a.available();
        } catch (IOException e) {
            Timer timer = this.f270130c;
            rf.d dVar = this.f270129b;
            t61.a.v(timer, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        rf.d dVar = this.f270129b;
        Timer timer = this.f270130c;
        long jA = timer.a();
        if (this.f == -1) {
            this.f = jA;
        }
        try {
            this.f270128a.close();
            long j2 = this.d;
            if (j2 != -1) {
                dVar.J(j2);
            }
            long j3 = this.e;
            if (j3 != -1) {
                z zVar = dVar.d;
                zVar.c();
                ((f0) zVar.f49761b).setTimeToResponseInitiatedUs(j3);
            }
            dVar.T(this.f);
            dVar.b();
        } catch (IOException e) {
            t61.a.v(timer, dVar, dVar);
            throw e;
        }
    }

    public final void d(long j2) {
        long j3 = this.d;
        if (j3 == -1) {
            this.d = j2;
        } else {
            this.d = j3 + j2;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f270128a.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f270128a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        Timer timer = this.f270130c;
        rf.d dVar = this.f270129b;
        try {
            int i = this.f270128a.read();
            long jA = timer.a();
            if (this.e == -1) {
                this.e = jA;
            }
            if (i != -1 || this.f != -1) {
                d(1L);
                dVar.J(this.d);
                return i;
            }
            this.f = jA;
            dVar.T(jA);
            dVar.b();
            return i;
        } catch (IOException e) {
            t61.a.v(timer, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        try {
            this.f270128a.reset();
        } catch (IOException e) {
            Timer timer = this.f270130c;
            rf.d dVar = this.f270129b;
            t61.a.v(timer, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j2) throws IOException {
        Timer timer = this.f270130c;
        rf.d dVar = this.f270129b;
        try {
            long jSkip = this.f270128a.skip(j2);
            long jA = timer.a();
            if (this.e == -1) {
                this.e = jA;
            }
            if (jSkip == 0 && j2 != 0 && this.f == -1) {
                this.f = jA;
                dVar.T(jA);
                return jSkip;
            }
            d(jSkip);
            dVar.J(this.d);
            return jSkip;
        } catch (IOException e) {
            t61.a.v(timer, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        Timer timer = this.f270130c;
        rf.d dVar = this.f270129b;
        try {
            int i3 = this.f270128a.read(bArr, i, i2);
            long jA = timer.a();
            if (this.e == -1) {
                this.e = jA;
            }
            if (i3 == -1 && this.f == -1) {
                this.f = jA;
                dVar.T(jA);
                dVar.b();
                return i3;
            }
            d(i3);
            dVar.J(this.d);
            return i3;
        } catch (IOException e) {
            t61.a.v(timer, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        Timer timer = this.f270130c;
        rf.d dVar = this.f270129b;
        try {
            int i = this.f270128a.read(bArr);
            long jA = timer.a();
            if (this.e == -1) {
                this.e = jA;
            }
            if (i == -1 && this.f == -1) {
                this.f = jA;
                dVar.T(jA);
                dVar.b();
                return i;
            }
            d(i);
            dVar.J(this.d);
            return i;
        } catch (IOException e) {
            t61.a.v(timer, dVar, dVar);
            throw e;
        }
    }
}
