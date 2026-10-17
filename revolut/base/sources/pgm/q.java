package pgm;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes14.dex */
public final class q extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qy5.a f236129c;
    public final dcl.q d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Flowable flowable) {
        super(flowable);
        qy5.a aVar = kgm.j.f184025a;
        dcl.q qVar = kgm.j.i;
        this.f236129c = aVar;
        this.d = qVar;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void k(dom.a aVar) {
        boolean z = aVar instanceof bhm.a;
        dcl.q qVar = this.d;
        qy5.a aVar2 = this.f236129c;
        Flowable flowable = this.f236000b;
        if (z) {
            flowable.j(new o((bhm.a) aVar, aVar2, qVar));
        } else {
            flowable.j(new p(aVar, aVar2, qVar));
        }
    }
}
