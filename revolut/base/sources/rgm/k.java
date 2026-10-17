package rgm;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes14.dex */
public final class k extends Completable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observable f254254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f254255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f254256c;

    public k(Observable observable, igm.o oVar, boolean z) {
        this.f254254a = observable;
        this.f254255b = oVar;
        this.f254256c = z;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void i(fgm.b bVar) {
        Observable observable = this.f254254a;
        igm.o oVar = this.f254255b;
        if (g4i.a.L(observable, oVar, bVar)) {
            return;
        }
        observable.subscribe(new j(bVar, oVar, this.f254256c));
    }
}
