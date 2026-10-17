package rfm;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f253932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f253933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(efm.k kVar, Object obj2, int i) {
        super(kVar);
        this.f253932b = i;
        this.f253933c = obj2;
    }

    @Override // efm.k
    public final void j(efm.l lVar) {
        switch (this.f253932b) {
            case 0:
                ((efm.k) this.f253913a).i(new pfm.k(lVar, (kfm.a) this.f253933c, 1));
                break;
            case 1:
                ((efm.k) this.f253913a).i(new g(lVar, (k3k.l) this.f253933c, 0));
                break;
            case 2:
                ((efm.k) this.f253913a).i(new i(lVar, (kfm.p) this.f253933c, 0));
                break;
            default:
                ((efm.k) this.f253913a).i(new g(lVar, (kfm.o) this.f253933c, 1));
                break;
        }
    }
}
