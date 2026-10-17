package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ge6.j f245590c;
    public final qf.b d;
    public final en.a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(n nVar, ge6.j jVar) {
        super(nVar);
        qf.b bVar = mfm.f.f;
        en.a aVar = mfm.f.f205043c;
        this.f245590c = jVar;
        this.d = bVar;
        this.e = aVar;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        this.f245362b.n(new y(aVar, this.f245590c, this.d, this.e));
    }
}
