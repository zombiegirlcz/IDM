package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class g5 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kfm.p f270489h;
    public final long i;

    public g5(efm.r rVar, long j2, kfm.p pVar) {
        super(rVar);
        this.f270489h = pVar;
        this.i = j2;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        lfm.b bVar = new lfm.b(1);
        yVar.onSubscribe(bVar);
        new f5(yVar, this.i, this.f270489h, bVar, this.f270328g).a();
    }
}
