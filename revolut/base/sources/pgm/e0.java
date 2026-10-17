package pgm;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes14.dex */
public final class e0 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.o f236047c;
    public final int d;
    public final int e;

    public e0(Flowable flowable, igm.o oVar, int i, int i2) {
        super(flowable);
        this.f236047c = oVar;
        this.d = i;
        this.e = i2;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void k(dom.a aVar) {
        Flowable flowable = this.f236000b;
        igm.o oVar = this.f236047c;
        if (ifk.b.O(flowable, aVar, oVar)) {
            return;
        }
        flowable.j(new d0(aVar, oVar, this.d, this.e));
    }
}
