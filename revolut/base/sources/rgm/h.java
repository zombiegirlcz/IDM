package rgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import sgm.j5;
import sgm.k5;

/* JADX INFO: loaded from: classes14.dex */
public final class h extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ObservableSource f254246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f254247c;
    public final Object d;
    public final int e;

    public /* synthetic */ h(ObservableSource observableSource, Object obj2, Object obj3, int i, int i2) {
        this.f254245a = i2;
        this.f254246b = observableSource;
        this.f254247c = obj2;
        this.d = obj3;
        this.e = i;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        switch (this.f254245a) {
            case 0:
                Observable observable = (Observable) this.f254246b;
                igm.o oVar = (igm.o) this.f254247c;
                if (!g4i.a.M(observable, oVar, lVar)) {
                    observable.subscribe(new g(this.e, 0, lVar, oVar, (ygm.f) this.d));
                }
                break;
            case 1:
                Observable observable2 = (Observable) this.f254246b;
                igm.o oVar2 = (igm.o) this.f254247c;
                if (!g4i.a.N(observable2, oVar2, lVar)) {
                    observable2.subscribe(new g(this.e, 1, lVar, oVar2, (ygm.f) this.d));
                }
                break;
            default:
                j5 j5Var = new j5(lVar, this.e, this.f254246b, (ObservableSource) this.f254247c, (igm.d) this.d);
                lVar.onSubscribe(j5Var);
                k5[] k5VarArr = (k5[]) j5Var.f262937j;
                j5Var.d.subscribe(k5VarArr[0]);
                j5Var.e.subscribe(k5VarArr[1]);
                break;
        }
    }
}
