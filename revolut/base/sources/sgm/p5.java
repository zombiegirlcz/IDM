package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class p5 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f263075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f263076c;
    public final Scheduler d;
    public final int e;
    public final boolean f;

    public p5(int i, long j2, Observable observable, Scheduler scheduler, TimeUnit timeUnit, boolean z) {
        super(observable);
        this.f263075b = j2;
        this.f263076c = timeUnit;
        this.d = scheduler;
        this.e = i;
        this.f = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        this.f262688a.subscribe(new o5(lVar, this.f263075b, this.f263076c, this.d, this.e, this.f));
    }
}
