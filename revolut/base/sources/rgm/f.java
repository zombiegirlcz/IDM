package rgm;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes14.dex */
public final class f extends Completable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observable f254238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f254239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ygm.f f254240c;
    public final int d;

    public f(Observable observable, igm.o oVar, ygm.f fVar, int i) {
        this.f254238a = observable;
        this.f254239b = oVar;
        this.f254240c = fVar;
        this.d = i;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void i(fgm.b bVar) {
        Observable observable = this.f254238a;
        igm.o oVar = this.f254239b;
        if (g4i.a.L(observable, oVar, bVar)) {
            return;
        }
        observable.subscribe(new e(bVar, oVar, this.f254240c, this.d));
    }
}
