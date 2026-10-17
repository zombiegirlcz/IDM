package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class a6 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f262702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f262703c;
    public final TimeUnit d;
    public final Scheduler e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f262704g;

    public a6(Observable observable, long j2, long j3, TimeUnit timeUnit, Scheduler scheduler, int i, boolean z) {
        super(observable);
        this.f262702b = j2;
        this.f262703c = j3;
        this.d = timeUnit;
        this.e = scheduler;
        this.f = i;
        this.f262704g = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        this.f262688a.subscribe(new z5(this.f, this.f262702b, this.f262703c, lVar, this.e, this.d, this.f262704g));
    }
}
