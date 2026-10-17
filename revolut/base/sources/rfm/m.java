package rfm;

/* JADX INFO: loaded from: classes13.dex */
public final class m extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f253965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.o f253966c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(efm.k kVar, kfm.o oVar, int i) {
        super(kVar);
        this.f253965b = i;
        this.f253966c = oVar;
    }

    @Override // efm.k
    public final void j(efm.l lVar) {
        switch (this.f253965b) {
            case 0:
                ((efm.k) this.f253913a).i(new b(lVar, this.f253966c));
                break;
            case 1:
                ((efm.k) this.f253913a).i(new pfm.s(lVar, this.f253966c, 1));
                break;
            default:
                ((efm.k) this.f253913a).i(new pfm.u(lVar, this.f253966c));
                break;
        }
    }
}
