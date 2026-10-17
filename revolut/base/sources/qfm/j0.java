package qfm;

import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes13.dex */
public final class j0 extends a implements kfm.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f245433c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(efm.i iVar, Object obj2, int i) {
        super(iVar);
        this.f245433c = i;
        this.d = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        switch (this.f245433c) {
            case 0:
                kfm.p pVar = (kfm.p) this.d;
                boolean z = aVar instanceof nfm.a;
                efm.i iVar = this.f245362b;
                if (!z) {
                    iVar.n(new i0(aVar, pVar));
                } else {
                    iVar.n(new h0((nfm.a) aVar, pVar, 0));
                }
                break;
            case 1:
                this.f245362b.n(new q1(aVar, (j0) this.d));
                break;
            default:
                jhm.a aVar2 = new jhm.a(aVar);
                dgm.f fVar = new dgm.f(new dgm.h());
                try {
                    Object objApply = ((kfm.o) this.d).apply(fVar);
                    mfm.f.b(objApply, "handler returned a null Publisher");
                    Publisher publisher = (Publisher) objApply;
                    y1 y1Var = new y1(this.f245362b);
                    c2 c2Var = new c2(aVar2, fVar, y1Var);
                    y1Var.d = c2Var;
                    aVar.e(c2Var);
                    publisher.a(y1Var);
                    y1Var.onNext(0);
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    yfm.d.d(th10, aVar);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(efm.i iVar) {
        super(iVar);
        this.f245433c = 1;
        this.d = this;
    }
}
