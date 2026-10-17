package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class e2 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f270427h;
    public final kfm.p i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(efm.r rVar, kfm.p pVar, int i) {
        super(rVar);
        this.f270427h = i;
        this.i = pVar;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        switch (this.f270427h) {
            case 0:
                this.f270328g.subscribe(new d2(yVar, this.i, 0));
                break;
            case 1:
                this.f270328g.subscribe(new e6(yVar, this.i, 0));
                break;
            default:
                this.f270328g.subscribe(new e6(yVar, this.i, 1));
                break;
        }
    }
}
