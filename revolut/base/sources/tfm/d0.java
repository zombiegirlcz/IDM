package tfm;

import efm.c0;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270397h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TimeUnit f270398j;
    public final efm.c0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Callable f270399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f270400m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f270401n;

    public d0(efm.r rVar, long j2, long j3, TimeUnit timeUnit, efm.c0 c0Var, Callable callable, int i, boolean z) {
        super(rVar);
        this.f270397h = j2;
        this.i = j3;
        this.f270398j = timeUnit;
        this.k = c0Var;
        this.f270399l = callable;
        this.f270400m = i;
        this.f270401n = z;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        long j2 = this.i;
        long j3 = this.f270397h;
        efm.c0 c0Var = this.k;
        TimeUnit timeUnit = this.f270398j;
        Callable callable = this.f270399l;
        efm.w wVar = this.f270328g;
        if (j3 == j2 && this.f270400m == Integer.MAX_VALUE) {
            wVar.subscribe(new z(new bgm.d(yVar), callable, j3, timeUnit, c0Var));
            return;
        }
        c0.a aVarB = c0Var.b();
        long j5 = this.f270397h;
        long j16 = this.i;
        if (j5 == j16) {
            wVar.subscribe(new y(new bgm.d(yVar), callable, j5, timeUnit, this.f270400m, this.f270401n, aVarB));
        } else {
            wVar.subscribe(new c0(new bgm.d(yVar), callable, j5, j16, timeUnit, aVarB));
        }
    }
}
