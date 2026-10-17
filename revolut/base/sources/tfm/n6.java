package tfm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class n6 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270679h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TimeUnit f270680j;
    public final efm.c0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f270681l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f270682m;

    public n6(efm.r rVar, long j2, long j3, TimeUnit timeUnit, efm.c0 c0Var, int i, boolean z) {
        super(rVar);
        this.f270679h = j2;
        this.i = j3;
        this.f270680j = timeUnit;
        this.k = c0Var;
        this.f270681l = i;
        this.f270682m = z;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        this.f270328g.subscribe(new m6(yVar, this.f270679h, this.i, this.f270680j, this.k, this.f270681l, this.f270682m));
    }
}
