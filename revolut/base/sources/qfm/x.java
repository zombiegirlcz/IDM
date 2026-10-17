package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.g f245577c;
    public final kfm.g d;
    public final kfm.a e;
    public final kfm.a f;

    public x(efm.i iVar, kfm.g gVar, kfm.g gVar2, kfm.a aVar, kfm.a aVar2) {
        super(iVar);
        this.f245577c = gVar;
        this.d = gVar2;
        this.e = aVar;
        this.f = aVar2;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        boolean z = aVar instanceof nfm.a;
        efm.i iVar = this.f245362b;
        if (z) {
            iVar.n(new v((nfm.a) aVar, this.f245577c, this.d, this.e, this.f));
        } else {
            iVar.n(new w(aVar, this.f245577c, this.d, this.e, this.f));
        }
    }
}
