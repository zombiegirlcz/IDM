package sfm;

import efm.y;

/* JADX INFO: loaded from: classes13.dex */
public final class j extends efm.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final efm.r f262534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kfm.o f262535h;
    public final zfm.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f262536j;

    public j(efm.r rVar, kfm.o oVar, zfm.f fVar, int i) {
        this.f262534g = rVar;
        this.f262535h = oVar;
        this.i = fVar;
        this.f262536j = i;
    }

    @Override // efm.r
    public final void subscribeActual(y yVar) {
        efm.r rVar = this.f262534g;
        kfm.o oVar = this.f262535h;
        if (kli.a.G(rVar, oVar, yVar)) {
            return;
        }
        rVar.subscribe(new i(yVar, oVar, this.f262536j, this.i));
    }
}
