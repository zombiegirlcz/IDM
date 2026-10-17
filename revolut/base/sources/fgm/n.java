package fgm;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f135113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ggm.b f135114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f135115c;
    public long d;
    public long e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f135116g;

    public n(o oVar, long j2, Runnable runnable, long j3, ggm.b bVar, long j5) {
        this.f135116g = oVar;
        this.f135113a = runnable;
        this.f135114b = bVar;
        this.f135115c = j5;
        this.e = j3;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j2;
        this.f135113a.run();
        ggm.b bVar = this.f135114b;
        if (bVar.isDisposed()) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        o oVar = this.f135116g;
        oVar.getClass();
        long jA = Scheduler.a(timeUnit);
        long j3 = Scheduler.f163115b;
        long j5 = jA + j3;
        long j16 = this.e;
        long j22 = this.f135115c;
        if (j5 < j16 || jA >= j16 + j22 + j3) {
            j2 = jA + j22;
            long j42 = this.d + 1;
            this.d = j42;
            this.f = j2 - (j22 * j42);
        } else {
            long j46 = this.f;
            long j47 = this.d + 1;
            this.d = j47;
            j2 = (j47 * j22) + j46;
        }
        this.e = jA;
        Disposable disposableA = oVar.a(this, j2 - jA, timeUnit);
        bVar.getClass();
        jgm.b.c(bVar, disposableA);
    }
}
