package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: classes14.dex */
public final class q6 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f263109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f263110c;
    public final int d;

    public q6(Observable observable, long j2, long j3, int i) {
        super(observable);
        this.f263109b = j2;
        this.f263110c = j3;
        this.d = i;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        long j2 = this.f263110c;
        long j3 = this.f263109b;
        ObservableSource observableSource = this.f262688a;
        if (j3 == j2) {
            observableSource.subscribe(new o6(lVar, j3, this.d));
            return;
        }
        observableSource.subscribe(new p6(lVar, this.f263109b, this.f263110c, this.d));
    }
}
