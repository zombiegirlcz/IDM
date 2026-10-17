package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kfm.o f270765h;
    public final zfm.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f270766j;
    public final int k;

    public r0(efm.r rVar, kfm.o oVar, zfm.f fVar, int i, int i2) {
        super(rVar);
        this.f270765h = oVar;
        this.i = fVar;
        this.f270766j = i;
        this.k = i2;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        this.f270328g.subscribe(new q0(yVar, this.f270765h, this.f270766j, this.k, this.i));
    }
}
