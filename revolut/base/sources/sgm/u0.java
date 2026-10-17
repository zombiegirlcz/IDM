package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes14.dex */
public final class u0 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f263192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f263193c;
    public final ygm.f d;
    public final Scheduler e;

    public u0(Observable observable, igm.o oVar, int i, ygm.f fVar, Scheduler scheduler) {
        super(observable);
        this.f263192b = oVar;
        this.d = fVar;
        this.f263193c = Math.max(8, i);
        this.e = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        ygm.f fVar = ygm.f.IMMEDIATE;
        igm.o oVar = this.f263192b;
        Scheduler scheduler = this.e;
        ObservableSource observableSource = this.f262688a;
        ygm.f fVar2 = this.d;
        if (fVar2 == fVar) {
            observableSource.subscribe(new t0(new ahm.c(lVar), oVar, this.f263193c, scheduler.b()));
        } else {
            observableSource.subscribe(new s0(lVar, oVar, this.f263193c, fVar2 == ygm.f.END, scheduler.b()));
        }
    }
}
