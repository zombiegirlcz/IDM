package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class i3 extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Scheduler f262902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f262903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f262904c;
    public final TimeUnit d;

    public i3(long j2, long j3, TimeUnit timeUnit, Scheduler scheduler) {
        this.f262903b = j2;
        this.f262904c = j3;
        this.d = timeUnit;
        this.f262902a = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        h3 h3Var = new h3(lVar);
        lVar.onSubscribe(h3Var);
        Scheduler scheduler = this.f262902a;
        boolean z = scheduler instanceof vgm.x;
        TimeUnit timeUnit = this.d;
        if (!z) {
            jgm.b.e(h3Var, scheduler.e(h3Var, this.f262903b, this.f262904c, timeUnit));
            return;
        }
        vgm.w wVar = new vgm.w();
        jgm.b.e(h3Var, wVar);
        wVar.c(h3Var, this.f262903b, this.f262904c, timeUnit);
    }
}
