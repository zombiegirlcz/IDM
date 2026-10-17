package sfm;

import efm.y;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends efm.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final efm.r f262553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kfm.o f262554h;
    public final boolean i;

    public p(efm.r rVar, kfm.o oVar, boolean z) {
        this.f262553g = rVar;
        this.f262554h = oVar;
        this.i = z;
    }

    @Override // efm.r
    public final void subscribeActual(y yVar) {
        efm.r rVar = this.f262553g;
        kfm.o oVar = this.f262554h;
        if (kli.a.F(rVar, oVar, yVar)) {
            return;
        }
        rVar.subscribe(new o(yVar, oVar, this.i));
    }
}
