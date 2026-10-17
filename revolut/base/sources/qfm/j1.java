package qfm;

import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes4.dex */
public final class j1 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f245434c;
    public final kfm.o d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(efm.i iVar, kfm.o oVar, int i) {
        super(iVar);
        this.f245434c = i;
        this.d = oVar;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        switch (this.f245434c) {
            case 0:
                boolean z = aVar instanceof nfm.a;
                kfm.o oVar = this.d;
                efm.i iVar = this.f245362b;
                if (!z) {
                    iVar.n(new i1(aVar, oVar));
                } else {
                    iVar.n(new h0((nfm.a) aVar, oVar, 1));
                }
                break;
            case 1:
                t1 t1Var = new t1(aVar, this.d);
                aVar.e(t1Var);
                this.f245362b.n(t1Var);
                break;
            default:
                jhm.a aVar2 = new jhm.a(aVar);
                dgm.f fVar = new dgm.f(new dgm.h());
                try {
                    Object objApply = this.d.apply(fVar);
                    mfm.f.b(objApply, "handler returned a null Publisher");
                    Publisher publisher = (Publisher) objApply;
                    y1 y1Var = new y1(this.f245362b);
                    x1 x1Var = new x1(aVar2, fVar, y1Var);
                    y1Var.d = x1Var;
                    aVar.e(x1Var);
                    publisher.a(y1Var);
                    y1Var.onNext(0);
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    yfm.d.d(th10, aVar);
                }
                break;
        }
    }
}
