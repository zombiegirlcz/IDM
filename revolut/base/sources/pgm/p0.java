package pgm;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class p0 extends Flowable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Scheduler f236124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f236125c;
    public final long d;

    public p0(long j2, long j3, Scheduler scheduler) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f236125c = j2;
        this.d = j3;
        this.f236124b = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void k(dom.a aVar) {
        o0 o0Var = new o0(aVar);
        aVar.e(o0Var);
        Scheduler scheduler = this.f236124b;
        boolean z = scheduler instanceof vgm.x;
        AtomicReference atomicReference = o0Var.f236120c;
        if (!z) {
            jgm.b.e(atomicReference, scheduler.e(o0Var, this.f236125c, this.d, TimeUnit.MILLISECONDS));
        } else {
            vgm.w wVar = new vgm.w();
            jgm.b.e(atomicReference, wVar);
            wVar.c(o0Var, this.f236125c, this.d, TimeUnit.MILLISECONDS);
        }
    }
}
