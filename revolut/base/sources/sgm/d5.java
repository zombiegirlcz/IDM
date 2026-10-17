package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class d5 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f262771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f262772c;
    public final TimeUnit d;
    public final Scheduler e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final igm.g f262773g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d5(Observable observable, long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z, igm.g gVar, int i) {
        super(observable);
        this.f262771b = i;
        this.f262772c = j2;
        this.d = timeUnit;
        this.e = scheduler;
        this.f = z;
        this.f262773g = gVar;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        switch (this.f262771b) {
            case 0:
                ahm.c cVar = new ahm.c(lVar);
                boolean z = this.f;
                Scheduler scheduler = this.e;
                TimeUnit timeUnit = this.d;
                ObservableSource observableSource = this.f262688a;
                if (!z) {
                    observableSource.subscribe(new b5(cVar, this.f262772c, timeUnit, scheduler, this.f262773g));
                } else {
                    observableSource.subscribe(new a5(cVar, this.f262772c, timeUnit, scheduler, this.f262773g));
                }
                break;
            default:
                this.f262688a.subscribe(new d6(lVar, this.f262772c, this.d, this.e.b(), this.f, this.f262773g));
                break;
        }
    }
}
