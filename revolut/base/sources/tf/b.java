package tf;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;
import xf.f0;
import xf.z;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f270131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Timer f270132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rf.d f270133c;
    public long d = -1;

    public b(OutputStream outputStream, rf.d dVar, Timer timer) {
        this.f270131a = outputStream;
        this.f270133c = dVar;
        this.f270132b = timer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j2 = this.d;
        rf.d dVar = this.f270133c;
        if (j2 != -1) {
            dVar.e(j2);
        }
        Timer timer = this.f270132b;
        long jA = timer.a();
        z zVar = dVar.d;
        zVar.c();
        ((f0) zVar.f49761b).setTimeToRequestCompletedUs(jA);
        try {
            this.f270131a.close();
        } catch (IOException e) {
            t61.a.v(timer, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.f270131a.flush();
        } catch (IOException e) {
            Timer timer = this.f270132b;
            rf.d dVar = this.f270133c;
            t61.a.v(timer, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        rf.d dVar = this.f270133c;
        try {
            this.f270131a.write(i);
            long j2 = this.d + 1;
            this.d = j2;
            dVar.e(j2);
        } catch (IOException e) {
            t61.a.v(this.f270132b, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        rf.d dVar = this.f270133c;
        try {
            this.f270131a.write(bArr);
            long length = this.d + ((long) bArr.length);
            this.d = length;
            dVar.e(length);
        } catch (IOException e) {
            t61.a.v(this.f270132b, dVar, dVar);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        rf.d dVar = this.f270133c;
        try {
            this.f270131a.write(bArr, i, i2);
            long j2 = this.d + ((long) i2);
            this.d = j2;
            dVar.e(j2);
        } catch (IOException e) {
            t61.a.v(this.f270132b, dVar, dVar);
            throw e;
        }
    }
}
