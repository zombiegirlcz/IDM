package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class o7 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final efm.w f270706h;
    public final kfm.o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f270707j;

    public o7(efm.r rVar, efm.w wVar, kfm.o oVar, int i) {
        super(rVar);
        this.f270706h = wVar;
        this.i = oVar;
        this.f270707j = i;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        this.f270328g.subscribe(new m7(new bgm.d(yVar), this.f270706h, this.i, this.f270707j));
    }
}
