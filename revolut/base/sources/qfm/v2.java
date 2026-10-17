package qfm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class v2 extends efm.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.c0 f245567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f245568c;

    public v2(long j2, efm.c0 c0Var) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f245568c = j2;
        this.f245567b = c0Var;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        pgm.v1 v1Var = new pgm.v1(aVar, 1);
        aVar.e(v1Var);
        ifm.c cVarD = this.f245567b.d(v1Var, this.f245568c, TimeUnit.MILLISECONDS);
        while (!v1Var.compareAndSet(null, cVarD)) {
            if (v1Var.get() != null) {
                if (v1Var.get() == lfm.d.DISPOSED) {
                    cVarD.dispose();
                    return;
                }
                return;
            }
        }
    }
}
