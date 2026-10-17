package sfm;

import efm.y;

/* JADX INFO: loaded from: classes13.dex */
public final class s extends efm.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final efm.r f262562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kfm.o f262563h;
    public final boolean i;

    public s(efm.r rVar, kfm.o oVar, boolean z) {
        this.f262562g = rVar;
        this.f262563h = oVar;
        this.i = z;
    }

    @Override // efm.r
    public final void subscribeActual(y yVar) {
        efm.r rVar = this.f262562g;
        kfm.o oVar = this.f262563h;
        if (kli.a.G(rVar, oVar, yVar)) {
            return;
        }
        rVar.subscribe(new r(yVar, oVar, this.i));
    }
}
