package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class q3 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f270748h;
    public final kfm.o i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3(efm.w wVar, kfm.o oVar, int i) {
        super(wVar);
        this.f270748h = i;
        this.i = oVar;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        switch (this.f270748h) {
            case 0:
                this.f270328g.subscribe(new d2(yVar, this.i, 1));
                break;
            case 1:
                this.f270328g.subscribe(new y3(yVar, this.i));
                break;
            default:
                ihm.j jVarD = new ihm.f().d();
                try {
                    Object objApply = this.i.apply(jVarD);
                    mfm.f.b(objApply, "The handler returned a null ObservableSource");
                    efm.w wVar = (efm.w) objApply;
                    i5 i5Var = new i5(yVar, jVarD, this.f270328g);
                    yVar.onSubscribe(i5Var);
                    wVar.subscribe(i5Var.e);
                    i5Var.a();
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    lfm.e.d(th10, yVar);
                }
                break;
        }
    }
}
