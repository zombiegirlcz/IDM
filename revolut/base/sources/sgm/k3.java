package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class k3 extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Scheduler f262959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f262960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f262961c;
    public final long d;
    public final long e;
    public final TimeUnit f;

    public k3(long j2, long j3, long j5, long j16, TimeUnit timeUnit, Scheduler scheduler) {
        this.d = j5;
        this.e = j16;
        this.f = timeUnit;
        this.f262959a = scheduler;
        this.f262960b = j2;
        this.f262961c = j3;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        j3 j3Var = new j3(lVar, this.f262960b, this.f262961c);
        lVar.onSubscribe(j3Var);
        Scheduler scheduler = this.f262959a;
        boolean z = scheduler instanceof vgm.x;
        TimeUnit timeUnit = this.f;
        if (!z) {
            jgm.b.e(j3Var, scheduler.e(j3Var, this.d, this.e, timeUnit));
            return;
        }
        vgm.w wVar = new vgm.w();
        jgm.b.e(j3Var, wVar);
        wVar.c(j3Var, this.d, this.e, timeUnit);
    }
}
