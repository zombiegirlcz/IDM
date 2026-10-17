package tfm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class j1 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270559h;
    public final TimeUnit i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final efm.c0 f270560j;
    public final boolean k;

    public j1(efm.r rVar, long j2, TimeUnit timeUnit, efm.c0 c0Var, boolean z) {
        super(rVar);
        this.f270559h = j2;
        this.i = timeUnit;
        this.f270560j = c0Var;
        this.k = z;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        efm.y dVar = this.k ? yVar : new bgm.d(yVar);
        this.f270328g.subscribe(new i1(dVar, this.f270559h, this.i, this.f270560j.b(), this.k));
    }
}
