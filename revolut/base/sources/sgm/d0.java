package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class d0 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f262756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f262757c;
    public final TimeUnit d;
    public final Scheduler e;
    public final igm.q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f262758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f262759h;

    public d0(Observable observable, long j2, long j3, TimeUnit timeUnit, Scheduler scheduler, igm.q qVar, int i, boolean z) {
        super(observable);
        this.f262756b = j2;
        this.f262757c = j3;
        this.d = timeUnit;
        this.e = scheduler;
        this.f = qVar;
        this.f262758g = i;
        this.f262759h = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        long j2 = this.f262757c;
        long j3 = this.f262756b;
        Scheduler scheduler = this.e;
        TimeUnit timeUnit = this.d;
        igm.q qVar = this.f;
        ObservableSource observableSource = this.f262688a;
        if (j3 == j2 && this.f262758g == Integer.MAX_VALUE) {
            observableSource.subscribe(new a0(new ahm.c(lVar), qVar, j3, timeUnit, scheduler));
            return;
        }
        fgm.o oVarB = scheduler.b();
        long j5 = this.f262756b;
        long j16 = this.f262757c;
        if (j5 == j16) {
            observableSource.subscribe(new z(new ahm.c(lVar), qVar, j5, timeUnit, this.f262758g, this.f262759h, oVarB));
        } else {
            observableSource.subscribe(new c0(new ahm.c(lVar), qVar, j5, j16, timeUnit, oVarB));
        }
    }
}
