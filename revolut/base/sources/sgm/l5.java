package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes14.dex */
public final class l5 extends Single implements lgm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ObservableSource f262979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ObservableSource f262980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.d f262981c;
    public final int d;

    public l5(ObservableSource observableSource, ObservableSource observableSource2, igm.d dVar, int i) {
        this.f262979a = observableSource;
        this.f262980b = observableSource2;
        this.f262981c = dVar;
        this.d = i;
    }

    @Override // lgm.d
    public final Observable a() {
        return new rgm.h(this.f262979a, this.f262980b, this.f262981c, this.d, 2);
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void j(fgm.p pVar) {
        j5 j5Var = new j5(pVar, this.d, this.f262979a, this.f262980b, this.f262981c);
        pVar.onSubscribe(j5Var);
        k5[] k5VarArr = (k5[]) j5Var.f262937j;
        j5Var.d.subscribe(k5VarArr[0]);
        j5Var.e.subscribe(k5VarArr[1]);
    }
}
