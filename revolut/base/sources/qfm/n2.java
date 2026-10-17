package qfm;

/* JADX INFO: loaded from: classes13.dex */
public final class n2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.o f245486c;
    public final int d;

    public n2(efm.i iVar, kfm.o oVar, int i) {
        super(iVar);
        this.f245486c = oVar;
        this.d = i;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        efm.i iVar = this.f245362b;
        kfm.o oVar = this.f245486c;
        if (te0.w.x0(iVar, aVar, oVar)) {
            return;
        }
        iVar.n(new m2(aVar, oVar, this.d));
    }
}
