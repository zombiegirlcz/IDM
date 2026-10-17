package pgm;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes14.dex */
public final class r1 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Scheduler f236136c;
    public final boolean d;

    public r1(Flowable flowable, Scheduler scheduler) {
        super(flowable);
        this.f236136c = scheduler;
        this.d = true;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void k(dom.a aVar) {
        fgm.o oVarB = this.f236136c.b();
        q1 q1Var = new q1(aVar, oVarB, this.f236000b, this.d);
        aVar.e(q1Var);
        oVarB.b(q1Var);
    }
}
