package sgm;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes14.dex */
public final class t2 extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f263175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u2 f263176b;

    public t2(Object obj2, u2 u2Var) {
        this.f263175a = obj2;
        this.f263176b = u2Var;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        this.f263176b.subscribe(lVar);
    }
}
