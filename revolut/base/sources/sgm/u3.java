package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes14.dex */
public final class u3 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f263202b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f263203c;
    public final boolean d;
    public final Object e;

    public u3(Observable observable, Scheduler scheduler, boolean z, int i) {
        super(observable);
        this.e = scheduler;
        this.d = z;
        this.f263203c = i;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        switch (this.f263202b) {
            case 0:
                Scheduler scheduler = (Scheduler) this.e;
                boolean z = scheduler instanceof vgm.x;
                ObservableSource observableSource = this.f262688a;
                if (!z) {
                    observableSource.subscribe(new t3(lVar, scheduler.b(), this.d, this.f263203c));
                } else {
                    observableSource.subscribe(lVar);
                }
                break;
            default:
                igm.o oVar = (igm.o) this.e;
                ObservableSource observableSource2 = this.f262688a;
                if (!cp5.c.S(lVar, oVar, observableSource2)) {
                    observableSource2.subscribe(new w5(this.f263203c, lVar, oVar, this.d));
                    break;
                }
                break;
        }
    }

    public u3(ObservableSource observableSource, igm.o oVar, int i, boolean z) {
        super(observableSource);
        this.e = oVar;
        this.f263203c = i;
        this.d = z;
    }
}
