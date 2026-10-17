package pgm;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes14.dex */
public final class q0 extends Flowable implements bhm.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f236130b;

    public q0(Object obj2) {
        this.f236130b = obj2;
    }

    @Override // igm.q
    public final Object get() {
        return this.f236130b;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void k(dom.a aVar) {
        aVar.e(new xgm.d(aVar, this.f236130b));
    }
}
