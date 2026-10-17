package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class p0 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kfm.o f270710h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zfm.f f270711j;

    public p0(efm.w wVar, kfm.o oVar, int i, zfm.f fVar) {
        super(wVar);
        this.f270710h = oVar;
        this.f270711j = fVar;
        this.i = Math.max(8, i);
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        efm.w wVar = this.f270328g;
        kfm.o oVar = this.f270710h;
        if (m70.a.v(wVar, yVar, oVar)) {
            return;
        }
        zfm.f fVar = zfm.f.IMMEDIATE;
        int i = this.i;
        zfm.f fVar2 = this.f270711j;
        if (fVar2 == fVar) {
            wVar.subscribe(new o0(new bgm.d(yVar), oVar, i));
        } else {
            wVar.subscribe(new m0(i, yVar, oVar, fVar2 == zfm.f.END));
        }
    }
}
