package tfm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class v7 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270900h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TimeUnit f270901j;
    public final efm.c0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f270902l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f270903m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f270904n;

    public v7(efm.r rVar, long j2, long j3, TimeUnit timeUnit, efm.c0 c0Var, long j5, int i, boolean z) {
        super(rVar);
        this.f270900h = j2;
        this.i = j3;
        this.f270901j = timeUnit;
        this.k = c0Var;
        this.f270902l = j5;
        this.f270903m = i;
        this.f270904n = z;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        bgm.d dVar = new bgm.d(yVar);
        long j2 = this.f270900h;
        long j3 = this.i;
        efm.c0 c0Var = this.k;
        TimeUnit timeUnit = this.f270901j;
        efm.w wVar = this.f270328g;
        if (j2 != j3) {
            wVar.subscribe(new u7(dVar, j2, j3, timeUnit, c0Var.b(), this.f270903m));
            return;
        }
        long j5 = this.f270902l;
        if (j5 == Long.MAX_VALUE) {
            wVar.subscribe(new s7(dVar, j2, timeUnit, c0Var, this.f270903m));
        } else {
            wVar.subscribe(new r7(dVar, j2, timeUnit, c0Var, this.f270903m, j5, this.f270904n));
        }
    }
}
