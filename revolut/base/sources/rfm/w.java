package rfm;

/* JADX INFO: loaded from: classes13.dex */
public final class w extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f253982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final efm.c0 f253983c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(efm.k kVar, efm.c0 c0Var, int i) {
        super(kVar);
        this.f253982b = i;
        this.f253983c = c0Var;
    }

    @Override // efm.k
    public final void j(efm.l lVar) {
        switch (this.f253982b) {
            case 0:
                ((efm.k) this.f253913a).i(new v(lVar, this.f253983c, 0));
                break;
            default:
                ofm.h hVar = new ofm.h(lVar, 2);
                lVar.onSubscribe(hVar);
                lfm.b bVar = (lfm.b) hVar.f224920b;
                ifm.c cVarC = this.f253983c.c(new ch.p(hVar, this.f253913a, 20));
                bVar.getClass();
                lfm.d.c(bVar, cVarC);
                break;
        }
    }
}
