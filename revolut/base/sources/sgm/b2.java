package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes14.dex */
public final class b2 extends Single implements lgm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observable f262716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f262717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f262718c;

    public b2(Observable observable, long j2, Object obj2) {
        this.f262716a = observable;
        this.f262717b = j2;
        this.f262718c = obj2;
    }

    @Override // lgm.d
    public final Observable a() {
        return new x1(this.f262716a, this.f262717b, this.f262718c, true);
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void j(fgm.p pVar) {
        this.f262716a.subscribe(new a2(pVar, this.f262717b, this.f262718c));
    }
}
