package rgm;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes14.dex */
public final class n extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Observable f254265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.o f254266c;
    public final boolean d;

    public /* synthetic */ n(Observable observable, igm.o oVar, boolean z, int i) {
        this.f254264a = i;
        this.f254265b = observable;
        this.f254266c = oVar;
        this.d = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        switch (this.f254264a) {
            case 0:
                Observable observable = this.f254265b;
                igm.o oVar = this.f254266c;
                if (!g4i.a.M(observable, oVar, lVar)) {
                    observable.subscribe(new m(lVar, oVar, this.d));
                }
                break;
            default:
                Observable observable2 = this.f254265b;
                igm.o oVar2 = this.f254266c;
                if (!g4i.a.N(observable2, oVar2, lVar)) {
                    observable2.subscribe(new p(lVar, oVar2, this.d));
                }
                break;
        }
    }
}
