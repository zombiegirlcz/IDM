package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class b1 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f245377c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(efm.i iVar, int i) {
        super(iVar);
        this.f245377c = i;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        switch (this.f245377c) {
            case 0:
                this.f245362b.n(new a1(aVar));
                break;
            case 1:
                this.f245362b.n(new r1(aVar));
                break;
            default:
                this.f245362b.n(new s1(aVar));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(efm.i iVar, boolean z) {
        super(iVar);
        this.f245377c = 2;
    }
}
