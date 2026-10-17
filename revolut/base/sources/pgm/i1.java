package pgm;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes14.dex */
public final class i1 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.p f236077c;
    public final long d;

    public i1(Flowable flowable, igm.p pVar) {
        super(flowable);
        this.f236077c = pVar;
        this.d = 3L;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void k(dom.a aVar) {
        xgm.e eVar = new xgm.e();
        aVar.e(eVar);
        new h1(aVar, this.d, this.f236077c, eVar, this.f236000b).a();
    }
}
