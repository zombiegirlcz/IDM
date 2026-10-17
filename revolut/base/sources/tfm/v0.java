package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class v0 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f270880h;
    public final efm.h0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(efm.r rVar, efm.h0 h0Var, int i) {
        super(rVar);
        this.f270880h = i;
        this.i = h0Var;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        switch (this.f270880h) {
            case 0:
                this.f270328g.subscribe(new s0(yVar, this.i, 2));
                break;
            default:
                t3 t3Var = new t3(yVar, 1);
                yVar.onSubscribe(t3Var);
                this.f270328g.subscribe(t3Var);
                ((efm.d0) this.i).q((rgm.d) t3Var.f270840j);
                break;
        }
    }
}
