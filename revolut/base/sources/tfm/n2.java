package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class n2 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f270670h;
    public final kfm.o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f270671j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(efm.r rVar, kfm.o oVar, boolean z, int i) {
        super(rVar);
        this.f270670h = i;
        this.i = oVar;
        this.f270671j = z;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        switch (this.f270670h) {
            case 0:
                this.f270328g.subscribe(new m2(0, yVar, this.i, this.f270671j));
                break;
            case 1:
                this.f270328g.subscribe(new m2(1, yVar, this.i, this.f270671j));
                break;
            default:
                x3 x3Var = new x3(yVar, this.i, this.f270671j);
                yVar.onSubscribe(x3Var.d);
                this.f270328g.subscribe(x3Var);
                break;
        }
    }
}
