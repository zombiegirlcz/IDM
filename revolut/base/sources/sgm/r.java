package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: classes14.dex */
public final class r extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f263111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f263112c;
    public final igm.q d;

    public r(Observable observable, int i, int i2, igm.q qVar) {
        super(observable);
        this.f263111b = i;
        this.f263112c = i2;
        this.d = qVar;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        ObservableSource observableSource = this.f262688a;
        igm.q qVar = this.d;
        int i = this.f263112c;
        int i2 = this.f263111b;
        if (i != i2) {
            observableSource.subscribe(new q(lVar, i2, i, qVar));
            return;
        }
        p pVar = new p(lVar, i2, qVar);
        if (pVar.a()) {
            observableSource.subscribe(pVar);
        }
    }
}
