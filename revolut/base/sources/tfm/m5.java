package tfm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class m5 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270648h;
    public final TimeUnit i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final efm.c0 f270649j;
    public final boolean k;

    public m5(efm.r rVar, long j2, TimeUnit timeUnit, efm.c0 c0Var, boolean z) {
        super(rVar);
        this.f270648h = j2;
        this.i = timeUnit;
        this.f270649j = c0Var;
        this.k = z;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        bgm.d dVar = new bgm.d(yVar);
        boolean z = this.k;
        efm.c0 c0Var = this.f270649j;
        TimeUnit timeUnit = this.i;
        efm.w wVar = this.f270328g;
        if (z) {
            wVar.subscribe(new j5(dVar, this.f270648h, timeUnit, c0Var));
        } else {
            wVar.subscribe(new k5(dVar, this.f270648h, timeUnit, c0Var));
        }
    }
}
