package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class x1 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270927h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f270928j;

    public x1(efm.r rVar, long j2, Object obj2, boolean z) {
        super(rVar);
        this.f270927h = j2;
        this.i = obj2;
        this.f270928j = z;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        this.f270328g.subscribe(new w1(yVar, this.f270927h, this.i, this.f270928j));
    }
}
