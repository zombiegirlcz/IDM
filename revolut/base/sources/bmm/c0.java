package bmm;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mmm.s0;
import mmm.v0;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes13.dex */
public final class c0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mmm.h f16897c = new mmm.h();
    public final mmm.h d = new mmm.h();
    public boolean e;
    public final /* synthetic */ e0 f;

    public c0(e0 e0Var, long j2, boolean z) {
        this.f = e0Var;
        this.f16895a = j2;
        this.f16896b = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j2;
        e0 e0Var = this.f;
        synchronized (e0Var) {
            this.e = true;
            mmm.h hVar = this.d;
            j2 = hVar.f207266b;
            hVar.f();
            e0Var.notifyAll();
            Unit unit = Unit.f186387a;
        }
        if (j2 > 0) {
            e0 e0Var2 = this.f;
            TimeZone timeZone = vlm.j.f290512a;
            e0Var2.f16905b.i(j2);
        }
        this.f.a();
    }

    @Override // mmm.s0
    public final long read(mmm.h sink, long j2) throws Throwable {
        boolean z;
        Throwable streamResetException;
        long j3;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.m(j2, "byteCount < 0: ").toString());
        }
        do {
            e0 e0Var = this.f;
            synchronized (e0Var) {
                e0Var.f16905b.getClass();
                b0 b0Var = e0Var.i;
                z = true;
                boolean z3 = b0Var.f16893c || b0Var.f16891a;
                if (z3) {
                    e0Var.f16909j.j();
                }
                try {
                    if (e0Var.f() == null || this.f16896b) {
                        streamResetException = null;
                    } else {
                        streamResetException = e0Var.f16911m;
                        if (streamResetException == null) {
                            b bVarF = e0Var.f();
                            Intrinsics.h(bVarF);
                            streamResetException = new StreamResetException(bVarF);
                        }
                    }
                    if (this.e) {
                        throw new IOException("stream closed");
                    }
                    mmm.h hVar = this.d;
                    long j5 = hVar.f207266b;
                    if (j5 > 0) {
                        j3 = hVar.read(sink, Math.min(j2, j5));
                        cmm.a.b(e0Var.f16906c, j3, 0L, 2);
                        long jA = e0Var.f16906c.a();
                        if (streamResetException == null && jA >= e0Var.f16905b.f16972r.a() / 2) {
                            e0Var.f16905b.l(e0Var.f16904a, jA);
                            cmm.a.b(e0Var.f16906c, 0L, jA, 1);
                        }
                        z = false;
                    } else {
                        if (this.f16896b || streamResetException != null) {
                            z = false;
                        } else {
                            try {
                                e0Var.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                        j3 = -1;
                    }
                    Unit unit = Unit.f186387a;
                } finally {
                    if (z3) {
                        e0Var.f16909j.m();
                    }
                }
            }
            e0 e0Var2 = this.f;
            e0Var2.f16905b.f16971q.b(e0Var2.f16906c);
        } while (z);
        if (j3 != -1) {
            return j3;
        }
        if (streamResetException == null) {
            return -1L;
        }
        throw streamResetException;
    }

    @Override // mmm.s0
    public final v0 timeout() {
        return this.f.f16909j;
    }
}
