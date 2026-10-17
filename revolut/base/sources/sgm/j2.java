package sgm;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes14.dex */
public final class j2 extends Completable implements lgm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observable f262921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f262922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f262923c;

    public j2(Observable observable, igm.o oVar, boolean z) {
        this.f262921a = observable;
        this.f262922b = oVar;
        this.f262923c = z;
    }

    @Override // lgm.d
    public final Observable a() {
        return new h2(this.f262921a, this.f262922b, this.f262923c, 0);
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void i(fgm.b bVar) {
        this.f262921a.subscribe(new i2(bVar, this.f262922b, this.f262923c));
    }
}
