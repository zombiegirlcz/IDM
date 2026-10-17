package bmm;

import java.io.InterruptedIOException;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mmm.q0;
import mmm.v0;

/* JADX INFO: loaded from: classes13.dex */
public final class b0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mmm.h f16892b = new mmm.h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16893c;
    public final /* synthetic */ e0 d;

    public b0(e0 e0Var, boolean z) {
        this.d = e0Var;
        this.f16891a = z;
    }

    @Override // mmm.q0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e0 e0Var = this.d;
        TimeZone timeZone = vlm.j.f290512a;
        synchronized (e0Var) {
            if (this.f16893c) {
                return;
            }
            boolean z = e0Var.f() == null;
            Unit unit = Unit.f186387a;
            e0 e0Var2 = this.d;
            if (!e0Var2.i.f16891a) {
                if (this.f16892b.f207266b > 0) {
                    while (this.f16892b.f207266b > 0) {
                        d(true);
                    }
                } else if (z) {
                    e0Var2.f16905b.j(e0Var2.f16904a, true, null, 0L);
                }
            }
            e0 e0Var3 = this.d;
            synchronized (e0Var3) {
                this.f16893c = true;
                e0Var3.notifyAll();
                Unit unit2 = Unit.f186387a;
            }
            this.d.f16905b.f16976x.flush();
            this.d.a();
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void d(boolean z) {
        long jMin;
        boolean z3;
        e0 e0Var = this.d;
        synchronized (e0Var) {
            try {
                e0Var.k.j();
                while (e0Var.d >= e0Var.e && !this.f16891a && !this.f16893c && e0Var.f() == null) {
                    try {
                        try {
                            e0Var.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th10) {
                        e0Var.k.m();
                        throw th10;
                    }
                }
                e0Var.k.m();
                e0Var.b();
                jMin = Math.min(e0Var.e - e0Var.d, this.f16892b.f207266b);
                e0Var.d += jMin;
                z3 = z && jMin == this.f16892b.f207266b;
                Unit unit = Unit.f186387a;
            } catch (Throwable th11) {
                throw th11;
            }
        }
        this.d.k.j();
        try {
            e0 e0Var2 = this.d;
            e0Var2.f16905b.j(e0Var2.f16904a, z3, this.f16892b, jMin);
        } finally {
            this.d.k.m();
        }
    }

    @Override // mmm.q0, java.io.Flushable
    public final void flush() {
        e0 e0Var = this.d;
        TimeZone timeZone = vlm.j.f290512a;
        synchronized (e0Var) {
            e0Var.b();
            Unit unit = Unit.f186387a;
        }
        while (this.f16892b.f207266b > 0) {
            d(false);
            this.d.f16905b.f16976x.flush();
        }
    }

    @Override // mmm.q0
    public final v0 timeout() {
        return this.d.k;
    }

    @Override // mmm.q0
    public final void write(mmm.h source, long j2) {
        Intrinsics.checkNotNullParameter(source, "source");
        TimeZone timeZone = vlm.j.f290512a;
        mmm.h hVar = this.f16892b;
        hVar.write(source, j2);
        while (hVar.f207266b >= 16384) {
            d(false);
        }
    }
}
