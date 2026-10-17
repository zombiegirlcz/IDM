package tfm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class q6 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270754h;
    public final TimeUnit i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final efm.c0 f270755j;

    public q6(efm.r rVar, long j2, TimeUnit timeUnit, efm.c0 c0Var) {
        super(rVar);
        this.f270754h = j2;
        this.i = timeUnit;
        this.f270755j = c0Var;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        this.f270328g.subscribe(new p6(new bgm.d(yVar), this.f270754h, this.i, this.f270755j.b()));
    }
}
