package qfm;

/* JADX INFO: loaded from: classes13.dex */
public final class l extends efm.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.i f245452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.o f245453c;
    public final zfm.f d;

    public l(efm.i iVar, ufm.l lVar, zfm.f fVar) {
        this.f245452b = iVar;
        this.f245453c = lVar;
        this.d = fVar;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        efm.i iVar = this.f245452b;
        kfm.o oVar = this.f245453c;
        if (te0.w.x0(iVar, aVar, oVar)) {
            return;
        }
        int i = d.f245387a[this.d.ordinal()];
        iVar.a(i != 1 ? i != 2 ? new g(aVar, oVar) : new f(aVar, oVar, true) : new f(aVar, oVar, false));
    }
}
