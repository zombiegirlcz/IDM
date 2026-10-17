package pgm;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes14.dex */
public final class j extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.o f236078c;
    public final int d;
    public final ygm.f e;

    public j(s0 s0Var, igm.o oVar, ygm.f fVar) {
        super(s0Var);
        this.f236078c = oVar;
        this.d = 2;
        this.e = fVar;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void k(dom.a aVar) {
        Flowable flowable = this.f236000b;
        igm.o oVar = this.f236078c;
        if (ifk.b.O(flowable, aVar, oVar)) {
            return;
        }
        int i = c.f236011a[this.e.ordinal()];
        int i2 = this.d;
        flowable.a(i != 1 ? i != 2 ? new f(aVar, oVar, i2) : new e(aVar, oVar, i2, true) : new e(aVar, oVar, i2, false));
    }
}
