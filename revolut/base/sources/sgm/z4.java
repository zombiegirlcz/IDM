package sgm;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes14.dex */
public final class z4 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.p f263324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f263325c;

    public z4(Observable observable, long j2, igm.p pVar) {
        super(observable);
        this.f263324b = pVar;
        this.f263325c = j2;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        ggm.b bVar = new ggm.b();
        lVar.onSubscribe(bVar);
        new y4(lVar, this.f263325c, this.f263324b, bVar, this.f262688a).a();
    }
}
