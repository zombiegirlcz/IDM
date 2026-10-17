package sgm;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes14.dex */
public final class r0 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f263113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ygm.f f263114c;
    public final int d;
    public final int e;

    public r0(Observable observable, igm.o oVar, ygm.f fVar, int i, int i2) {
        super(observable);
        this.f263113b = oVar;
        this.f263114c = fVar;
        this.d = i;
        this.e = i2;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        this.f262688a.subscribe(new q0(this.d, this.e, lVar, this.f263113b, this.f263114c));
    }
}
