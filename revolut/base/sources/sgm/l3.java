package sgm;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes14.dex */
public final class l3 extends Observable implements bhm.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f262978a;

    public l3(Object obj2) {
        this.f262978a = obj2;
    }

    @Override // igm.q
    public final Object get() {
        return this.f262978a;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        h5 h5Var = new h5(lVar, this.f262978a);
        lVar.onSubscribe(h5Var);
        h5Var.run();
    }
}
