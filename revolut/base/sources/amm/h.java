package amm;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mmm.k0;
import mmm.n0;
import mmm.o0;
import mmm.q0;
import mmm.v0;
import mmm.w;
import nmm.o;

/* JADX INFO: loaded from: classes14.dex */
public final class h implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6496a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6498c;
    public final Object d;

    public h(mmm.h sink, Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        k0 sink2 = u1.b(sink);
        Intrinsics.checkNotNullParameter(sink2, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f6498c = sink2;
        this.d = deflater;
    }

    @Override // mmm.q0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        switch (this.f6496a) {
            case 0:
                j jVar = (j) this.d;
                if (this.f6497b) {
                    return;
                }
                this.f6497b = true;
                j.k(jVar, (w) this.f6498c);
                jVar.d = 3;
                return;
            default:
                Deflater deflater = (Deflater) this.d;
                if (this.f6497b) {
                    return;
                }
                try {
                    deflater.finish();
                    d(false);
                    th = null;
                } catch (Throwable th10) {
                    th = th10;
                }
                try {
                    deflater.end();
                    break;
                } catch (Throwable th11) {
                    if (th == null) {
                        th = th11;
                    }
                }
                try {
                    ((k0) this.f6498c).close();
                    break;
                } catch (Throwable th12) {
                    if (th == null) {
                        th = th12;
                    }
                }
                this.f6497b = true;
                if (th != null) {
                    throw th;
                }
                return;
        }
    }

    public void d(boolean z) throws IOException {
        n0 n0VarU;
        int iDeflate;
        Deflater deflater = (Deflater) this.d;
        k0 k0Var = (k0) this.f6498c;
        mmm.h hVar = k0Var.f207280b;
        while (true) {
            n0VarU = hVar.u(1);
            byte[] bArr = n0VarU.f207291a;
            if (z) {
                try {
                    int i = n0VarU.f207293c;
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                int i2 = n0VarU.f207293c;
                iDeflate = deflater.deflate(bArr, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                n0VarU.f207293c += iDeflate;
                hVar.f207266b += (long) iDeflate;
                k0Var.d();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (n0VarU.f207292b == n0VarU.f207293c) {
            hVar.f207265a = n0VarU.a();
            o0.a(n0VarU);
        }
    }

    @Override // mmm.q0, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f6496a) {
            case 0:
                if (!this.f6497b) {
                    ((k0) ((j) this.d).f6501c.d).flush();
                    break;
                }
                break;
            default:
                d(true);
                ((k0) this.f6498c).flush();
                break;
        }
    }

    @Override // mmm.q0
    public final v0 timeout() {
        switch (this.f6496a) {
            case 0:
                return (w) this.f6498c;
            default:
                return ((k0) this.f6498c).f207279a.timeout();
        }
    }

    public String toString() {
        switch (this.f6496a) {
            case 1:
                return "DeflaterSink(" + ((k0) this.f6498c) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            default:
                return super.toString();
        }
    }

    @Override // mmm.q0
    public final void write(mmm.h source, long j2) throws IOException {
        switch (this.f6496a) {
            case 0:
                Intrinsics.checkNotNullParameter(source, "source");
                if (this.f6497b) {
                    throw new IllegalStateException("closed");
                }
                vlm.h.e(source.f207266b, 0L, j2);
                ((k0) ((j) this.d).f6501c.d).write(source, j2);
                return;
            default:
                Deflater deflater = (Deflater) this.d;
                Intrinsics.checkNotNullParameter(source, "source");
                mmm.b.b(source.f207266b, 0L, j2);
                while (j2 > 0) {
                    n0 n0Var = source.f207265a;
                    Intrinsics.h(n0Var);
                    int iMin = (int) Math.min(j2, n0Var.f207293c - n0Var.f207292b);
                    deflater.setInput(n0Var.f207291a, n0Var.f207292b, iMin);
                    d(false);
                    long j3 = iMin;
                    source.f207266b -= j3;
                    int i = n0Var.f207292b + iMin;
                    n0Var.f207292b = i;
                    if (i == n0Var.f207293c) {
                        source.f207265a = n0Var.a();
                        o0.a(n0Var);
                    }
                    j2 -= j3;
                }
                deflater.setInput(o.f217429a, 0, 0);
                return;
        }
    }

    public h(j jVar) {
        this.d = jVar;
        this.f6498c = new w(((k0) jVar.f6501c.d).f207279a.timeout());
    }
}
