package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class f6 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f270461h;
    public final efm.c0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f6(efm.r rVar, efm.c0 c0Var, int i) {
        super(rVar);
        this.f270461h = i;
        this.i = c0Var;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        switch (this.f270461h) {
            case 0:
                sfm.a aVar = new sfm.a(yVar);
                yVar.onSubscribe(aVar);
                lfm.d.e(aVar, this.i.c(new ch.p(21, this, false, aVar)));
                break;
            default:
                this.f270328g.subscribe(new d7(yVar, this.i));
                break;
        }
    }
}
