package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes14.dex */
public final class b1 extends Single implements lgm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observable f262715a;

    public b1(Observable observable) {
        this.f262715a = observable;
    }

    @Override // lgm.d
    public final Observable a() {
        return new a1(this.f262715a, 0);
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void j(fgm.p pVar) {
        this.f262715a.subscribe(new z0(pVar, 2));
    }
}
