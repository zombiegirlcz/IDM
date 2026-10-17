package sgm;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes14.dex */
public final class v2 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f263218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.o f263219c;
    public final int d;
    public final boolean e;

    public v2(Observable observable, igm.o oVar, igm.o oVar2, int i, boolean z) {
        super(observable);
        this.f263218b = oVar;
        this.f263219c = oVar2;
        this.d = i;
        this.e = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        this.f262688a.subscribe(new s2(lVar, this.f263218b, this.f263219c, this.d, this.e));
    }
}
