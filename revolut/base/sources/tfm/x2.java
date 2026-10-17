package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class x2 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kfm.o f270929h;
    public final kfm.o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f270930j;
    public final boolean k;

    public x2(efm.r rVar, kfm.o oVar, kfm.o oVar2, int i, boolean z) {
        super(rVar);
        this.f270929h = oVar;
        this.i = oVar2;
        this.f270930j = i;
        this.k = z;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        this.f270328g.subscribe(new u2(yVar, this.f270929h, this.i, this.f270930j, this.k));
    }
}
