package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class c1 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f270382h;
    public final kfm.o i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(efm.r rVar, kfm.o oVar, int i) {
        super(rVar);
        this.f270382h = i;
        this.i = oVar;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        switch (this.f270382h) {
            case 0:
                this.f270328g.subscribe(new b1(new bgm.d(yVar), this.i));
                break;
            case 1:
                this.f270328g.subscribe(new m1(yVar, this.i));
                break;
            case 2:
                this.f270328g.subscribe(new o2(yVar, this.i, 0));
                break;
            case 3:
                ihm.f fVar = new ihm.f();
                try {
                    Object objApply = this.i.apply(fVar);
                    mfm.f.b(objApply, "The selector returned a null ObservableSource");
                    efm.w wVar = (efm.w) objApply;
                    sfm.d dVar = new sfm.d(yVar, 1);
                    wVar.subscribe(dVar);
                    this.f270328g.subscribe(new g4(fVar, dVar, 0));
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    lfm.e.d(th10, yVar);
                    return;
                }
                break;
            default:
                ihm.j jVarD = new ihm.f().d();
                try {
                    Object objApply2 = this.i.apply(jVarD);
                    mfm.f.b(objApply2, "The handler returned a null ObservableSource");
                    efm.w wVar2 = (efm.w) objApply2;
                    s4 s4Var = new s4(yVar, jVarD, this.f270328g);
                    yVar.onSubscribe(s4Var);
                    wVar2.subscribe(s4Var.e);
                    s4Var.a();
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    lfm.e.d(th11, yVar);
                }
                break;
        }
    }
}
