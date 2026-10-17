package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class j6 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kfm.o f270569h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f270570j;

    public j6(efm.w wVar, kfm.o oVar, int i, boolean z) {
        super(wVar);
        this.f270569h = oVar;
        this.i = i;
        this.f270570j = z;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        efm.w wVar = this.f270328g;
        kfm.o oVar = this.f270569h;
        if (m70.a.v(wVar, yVar, oVar)) {
            return;
        }
        wVar.subscribe(new i6(this.i, yVar, oVar, this.f270570j));
    }
}
