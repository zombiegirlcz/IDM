package amm;

import kotlin.jvm.internal.Intrinsics;
import mmm.k0;
import mmm.q0;
import mmm.v0;
import mmm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class d implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f6492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f6494c;

    public d(j jVar) {
        this.f6494c = jVar;
        this.f6492a = new w(((k0) jVar.f6501c.d).f207279a.timeout());
    }

    @Override // mmm.q0, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f6493b) {
            return;
        }
        this.f6493b = true;
        ((k0) this.f6494c.f6501c.d).p0("0\r\n\r\n");
        j.k(this.f6494c, this.f6492a);
        this.f6494c.d = 3;
    }

    @Override // mmm.q0, java.io.Flushable
    public final synchronized void flush() {
        if (this.f6493b) {
            return;
        }
        ((k0) this.f6494c.f6501c.d).flush();
    }

    @Override // mmm.q0
    public final v0 timeout() {
        return this.f6492a;
    }

    @Override // mmm.q0
    public final void write(mmm.h source, long j2) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f6493b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        k0 k0Var = (k0) this.f6494c.f6501c.d;
        if (k0Var.f207281c) {
            throw new IllegalStateException("closed");
        }
        k0Var.f207280b.y(j2);
        k0Var.d();
        k0Var.p0("\r\n");
        k0Var.write(source, j2);
        k0Var.p0("\r\n");
    }
}
