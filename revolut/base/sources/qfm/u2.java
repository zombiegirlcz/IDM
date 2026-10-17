package qfm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class u2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f245560c;
    public final TimeUnit d;
    public final efm.c0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(j0 j0Var, efm.c0 c0Var) {
        super(j0Var);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f245560c = 10000L;
        this.d = timeUnit;
        this.e = c0Var;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        r2 r2Var = new r2(aVar, this.f245560c, this.d, this.e.b());
        aVar.e(r2Var);
        ifm.c cVarB = r2Var.d.b(new t2(0L, r2Var), r2Var.f245526b, r2Var.f245527c);
        lfm.b bVar = r2Var.e;
        bVar.getClass();
        lfm.d.c(bVar, cVarB);
        this.f245362b.n(r2Var);
    }
}
