package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class y5 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f270972h;
    public final int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y5(efm.r rVar, int i, int i2) {
        super(rVar);
        this.f270972h = i2;
        this.i = i;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        switch (this.f270972h) {
            case 0:
                this.f270328g.subscribe(new x5(yVar, this.i));
                break;
            default:
                this.f270328g.subscribe(new l6(yVar, this.i));
                break;
        }
    }
}
