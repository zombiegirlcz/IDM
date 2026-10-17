package sgm;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes14.dex */
public final class x1 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f263269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f263270c;
    public final boolean d;

    public x1(Observable observable, long j2, Object obj2, boolean z) {
        super(observable);
        this.f263269b = j2;
        this.f263270c = obj2;
        this.d = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        this.f262688a.subscribe(new w1(lVar, this.f263269b, this.f263270c, this.d));
    }
}
