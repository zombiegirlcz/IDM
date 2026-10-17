package pgm;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes14.dex */
public final class g0 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f236061c;
    public final Object d;
    public final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Flowable flowable, Object obj2, int i, int i2) {
        super(flowable);
        this.f236061c = i2;
        this.d = obj2;
        this.e = i;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void k(dom.a aVar) {
        switch (this.f236061c) {
            case 0:
                this.f236000b.j(new f0(aVar, (igm.o) this.d, this.e));
                break;
            case 1:
                this.f236000b.j(new j0(aVar, (igm.o) this.d, this.e));
                break;
            default:
                fgm.o oVarB = ((Scheduler) this.d).b();
                boolean z = aVar instanceof bhm.a;
                int i = this.e;
                Flowable flowable = this.f236000b;
                if (!z) {
                    flowable.j(new v0(aVar, oVarB, i));
                } else {
                    flowable.j(new u0((bhm.a) aVar, oVarB, i));
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(b0 b0Var, igm.o oVar) {
        super(b0Var);
        this.f236061c = 0;
        this.d = oVar;
        this.e = Integer.MAX_VALUE;
    }
}
