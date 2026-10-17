package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f270853h;
    public final efm.n i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(efm.r rVar, efm.n nVar, int i) {
        super(rVar);
        this.f270853h = i;
        this.i = nVar;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        switch (this.f270853h) {
            case 0:
                this.f270328g.subscribe(new s0(yVar, this.i, 1));
                break;
            default:
                t3 t3Var = new t3(yVar, 0);
                yVar.onSubscribe(t3Var);
                this.f270328g.subscribe(t3Var);
                ((efm.k) this.i).i((rgm.d) t3Var.f270840j);
                break;
        }
    }
}
