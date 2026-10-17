package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class i7 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270548h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f270549j;

    public i7(efm.r rVar, long j2, long j3, int i) {
        super(rVar);
        this.f270548h = j2;
        this.i = j3;
        this.f270549j = i;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        long j2 = this.i;
        long j3 = this.f270548h;
        efm.w wVar = this.f270328g;
        if (j3 == j2) {
            wVar.subscribe(new g7(yVar, j3, this.f270549j));
            return;
        }
        wVar.subscribe(new h7(yVar, this.f270548h, this.i, this.f270549j));
    }
}
