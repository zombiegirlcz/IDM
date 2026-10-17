package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class l1 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f262973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f262974c;
    public final Scheduler d;
    public final boolean e;

    public l1(Observable observable, long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        super(observable);
        this.f262973b = j2;
        this.f262974c = timeUnit;
        this.d = scheduler;
        this.e = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        fgm.l cVar = this.e ? lVar : new ahm.c(lVar);
        this.f262688a.subscribe(new k1(cVar, this.f262973b, this.f262974c, this.d.b(), this.e));
    }
}
