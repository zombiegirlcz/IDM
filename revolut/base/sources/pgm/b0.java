package pgm;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes14.dex */
public final class b0 extends a implements igm.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f236007c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Flowable flowable, Object obj2, int i) {
        super(flowable);
        this.f236007c = i;
        this.d = obj2;
    }

    @Override // igm.g
    public void accept(Object obj2) {
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void k(dom.a aVar) {
        switch (this.f236007c) {
            case 0:
                igm.p pVar = (igm.p) this.d;
                boolean z = aVar instanceof bhm.a;
                Flowable flowable = this.f236000b;
                if (!z) {
                    flowable.j(new a0(aVar, pVar));
                } else {
                    flowable.j(new z((bhm.a) aVar, pVar, 0));
                }
                break;
            default:
                this.f236000b.j(new y0(aVar, (igm.g) this.d));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ogm.q qVar) {
        super(qVar);
        this.f236007c = 1;
        this.d = this;
    }
}
