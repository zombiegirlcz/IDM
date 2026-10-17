package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: classes14.dex */
public final class t6 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ObservableSource f263187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f263188c;

    public t6(Observable observable, ObservableSource observableSource, int i) {
        super(observable);
        this.f263187b = observableSource;
        this.f263188c = i;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        s6 s6Var = new s6(lVar, this.f263188c);
        lVar.onSubscribe(s6Var);
        this.f263187b.subscribe(s6Var.f263156c);
        this.f262688a.subscribe(s6Var);
    }
}
