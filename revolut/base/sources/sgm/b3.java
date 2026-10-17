package sgm;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes14.dex */
public final class b3 extends Completable implements lgm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observable f262719a;

    public b3(Observable observable) {
        this.f262719a = observable;
    }

    @Override // lgm.d
    public final Observable a() {
        return new a1(this.f262719a, 3);
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void i(fgm.b bVar) {
        this.f262719a.subscribe(new p1(bVar, 4));
    }
}
