package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: classes14.dex */
public final class p0 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f263062b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.o f263063c;
    public final int d;
    public final Object e;

    public p0(ObservableSource observableSource, igm.o oVar, int i, ygm.f fVar) {
        super(observableSource);
        this.f263063c = oVar;
        this.e = fVar;
        this.d = Math.max(8, i);
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        switch (this.f263062b) {
            case 0:
                ygm.f fVar = (ygm.f) this.e;
                igm.o oVar = this.f263063c;
                ObservableSource observableSource = this.f262688a;
                if (!cp5.c.S(lVar, oVar, observableSource)) {
                    ygm.f fVar2 = ygm.f.IMMEDIATE;
                    int i = this.d;
                    if (fVar != fVar2) {
                        observableSource.subscribe(new n0(i, lVar, oVar, fVar == ygm.f.END));
                    } else {
                        observableSource.subscribe(new o0(new ahm.c(lVar), oVar, i));
                    }
                    break;
                }
                break;
            default:
                this.f262688a.subscribe(new w6(lVar, (ObservableSource) this.e, this.f263063c, this.d));
                break;
        }
    }

    public p0(Observable observable, ObservableSource observableSource, igm.o oVar, int i) {
        super(observable);
        this.e = observableSource;
        this.f263063c = oVar;
        this.d = i;
    }
}
