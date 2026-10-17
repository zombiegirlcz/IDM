package tfm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class a6 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270344h;
    public final TimeUnit i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final efm.c0 f270345j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f270346l;

    public a6(efm.r rVar, long j2, TimeUnit timeUnit, efm.c0 c0Var, int i, boolean z) {
        super(rVar);
        this.f270344h = j2;
        this.i = timeUnit;
        this.f270345j = c0Var;
        this.k = i;
        this.f270346l = z;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        this.f270328g.subscribe(new z5(yVar, this.f270344h, this.i, this.f270345j, this.k, this.f270346l));
    }
}
