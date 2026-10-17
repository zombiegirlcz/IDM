package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class d7 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f262782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f262783c;
    public final TimeUnit d;
    public final Scheduler e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f262784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f262785h;

    public d7(Observable observable, long j2, long j3, TimeUnit timeUnit, Scheduler scheduler, long j5, int i, boolean z) {
        super(observable);
        this.f262782b = j2;
        this.f262783c = j3;
        this.d = timeUnit;
        this.e = scheduler;
        this.f = j5;
        this.f262784g = i;
        this.f262785h = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        long j2 = this.f262782b;
        long j3 = this.f262783c;
        Scheduler scheduler = this.e;
        TimeUnit timeUnit = this.d;
        ObservableSource observableSource = this.f262688a;
        if (j2 != j3) {
            observableSource.subscribe(new c7(lVar, this.f262782b, this.f262783c, timeUnit, scheduler.b(), this.f262784g));
        } else {
            if (this.f == Long.MAX_VALUE) {
                observableSource.subscribe(new a7(lVar, this.f262782b, timeUnit, scheduler, this.f262784g));
                return;
            }
            observableSource.subscribe(new z6(this.f262784g, this.f262782b, this.f, lVar, scheduler, timeUnit, this.f262785h));
        }
    }
}
