package tfm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class b7 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270370h;
    public final TimeUnit i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final efm.c0 f270371j;
    public final efm.w k;

    public b7(efm.r rVar, long j2, TimeUnit timeUnit, efm.c0 c0Var, efm.w wVar) {
        super(rVar);
        this.f270370h = j2;
        this.i = timeUnit;
        this.f270371j = c0Var;
        this.k = wVar;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        efm.w wVar = this.k;
        efm.w wVar2 = this.f270328g;
        efm.c0 c0Var = this.f270371j;
        if (wVar != null) {
            x6 x6Var = new x6(yVar, this.f270370h, this.i, c0Var.b(), this.k);
            yVar.onSubscribe(x6Var);
            x6Var.c(0L);
            wVar2.subscribe(x6Var);
            return;
        }
        y6 y6Var = new y6(yVar, this.f270370h, this.i, c0Var.b());
        yVar.onSubscribe(y6Var);
        ifm.c cVarB = y6Var.d.b(new a7(0L, y6Var), y6Var.f270974b, y6Var.f270975c);
        lfm.b bVar = y6Var.e;
        bVar.getClass();
        lfm.d.c(bVar, cVarB);
        wVar2.subscribe(y6Var);
    }
}
