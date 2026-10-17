package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class p4 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270719h;

    public p4(efm.r rVar, long j2) {
        super(rVar);
        this.f270719h = j2;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        lfm.b bVar = new lfm.b(1);
        yVar.onSubscribe(bVar);
        long j2 = this.f270719h;
        new o4(yVar, j2 != Long.MAX_VALUE ? j2 - 1 : Long.MAX_VALUE, bVar, this.f270328g).a();
    }
}
