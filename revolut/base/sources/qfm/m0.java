package qfm;

/* JADX INFO: loaded from: classes13.dex */
public final class m0 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.o f245474c;
    public final int d;
    public final int e;

    public m0(efm.i iVar, kfm.o oVar, int i, int i2) {
        super(iVar);
        this.f245474c = oVar;
        this.d = i;
        this.e = i2;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        efm.i iVar = this.f245362b;
        kfm.o oVar = this.f245474c;
        if (te0.w.x0(iVar, aVar, oVar)) {
            return;
        }
        iVar.n(new l0(aVar, oVar, this.d, this.e));
    }
}
