package rfm;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f253975b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(efm.n nVar, int i) {
        super(nVar);
        this.f253975b = i;
    }

    @Override // efm.k
    public final void j(efm.l lVar) {
        switch (this.f253975b) {
            case 0:
                ((efm.k) this.f253913a).i(new p(lVar, 1));
                break;
            case 1:
                ((efm.k) this.f253913a).i(new p(lVar, 2));
                break;
            default:
                ((efm.k) this.f253913a).i(lVar);
                break;
        }
    }
}
