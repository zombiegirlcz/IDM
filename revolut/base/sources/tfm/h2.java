package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class h2 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kfm.o f270503h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f270504j;
    public final int k;

    public h2(efm.w wVar, kfm.o oVar, boolean z, int i, int i2) {
        super(wVar);
        this.f270503h = oVar;
        this.i = z;
        this.f270504j = i;
        this.k = i2;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        efm.w wVar = this.f270328g;
        kfm.o oVar = this.f270503h;
        if (m70.a.v(wVar, yVar, oVar)) {
            return;
        }
        wVar.subscribe(new g2(this.f270504j, this.k, yVar, oVar, this.i));
    }
}
