package tfm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class c7 extends efm.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final efm.c0 f270393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270394h;
    public final TimeUnit i;

    public c7(long j2, TimeUnit timeUnit, efm.c0 c0Var) {
        this.f270394h = j2;
        this.i = timeUnit;
        this.f270393g = c0Var;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        rfm.b0 b0Var = new rfm.b0(yVar, 1);
        yVar.onSubscribe(b0Var);
        ifm.c cVarD = this.f270393g.d(b0Var, this.f270394h, this.i);
        while (!b0Var.compareAndSet(null, cVarD)) {
            if (b0Var.get() != null) {
                if (b0Var.get() == lfm.d.DISPOSED) {
                    cVarD.dispose();
                    return;
                }
                return;
            }
        }
    }
}
