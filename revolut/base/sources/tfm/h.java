package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f270497h;
    public final kfm.p i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(efm.r rVar, kfm.p pVar, int i) {
        super(rVar);
        this.f270497h = i;
        this.i = pVar;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        switch (this.f270497h) {
            case 0:
                this.f270328g.subscribe(new g(yVar, this.i, 0));
                break;
            case 1:
                this.f270328g.subscribe(new g(yVar, this.i, 1));
                break;
            default:
                this.f270328g.subscribe(new g(yVar, this.i, 2));
                break;
        }
    }
}
