package rfm;

/* JADX INFO: loaded from: classes13.dex */
public final class z extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f253986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final efm.n f253987c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(efm.k kVar, efm.n nVar, int i) {
        super(kVar);
        this.f253986b = i;
        this.f253987c = nVar;
    }

    @Override // efm.k
    public final void j(efm.l lVar) {
        switch (this.f253986b) {
            case 0:
                ((efm.k) this.f253913a).i(new ofm.h(lVar, this.f253987c, 3));
                break;
            default:
                ofm.h hVar = new ofm.h(lVar, 4);
                lVar.onSubscribe(hVar);
                ((c0) this.f253987c).i((a0) hVar.f224921c);
                ((efm.k) this.f253913a).i(hVar);
                break;
        }
    }
}
