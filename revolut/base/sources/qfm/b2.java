package qfm;

/* JADX INFO: loaded from: classes13.dex */
public final class b2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.p f245378c;
    public final long d;

    public b2(efm.i iVar, long j2, kfm.p pVar) {
        super(iVar);
        this.f245378c = pVar;
        this.d = j2;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        yfm.f fVar = new yfm.f(false);
        aVar.e(fVar);
        new a2(aVar, this.d, this.f245378c, fVar, this.f245362b).a();
    }
}
