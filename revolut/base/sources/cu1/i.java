package cu1;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.b f108735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f108736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f108737c;
    public final e4m.e d;
    public final e4m.e e;

    public i(j jVar, uw1.b bVar) {
        this.f108735a = bVar;
        this.f108736b = jVar;
        int i = 8;
        this.f108737c = e4m.b.b(new c63.b(this, 1, i));
        this.d = e4m.b.b(new c63.b(this, 0, i));
        this.e = e4m.b.b(new c63.b(this, 2, i));
    }

    public final bu1.f a() {
        lz1.m mVar = (lz1.m) this.f108735a;
        fx1.a aVarF = mVar.f();
        vc.s.j(aVarF);
        xt1.d dVarA = this.f108736b.a();
        vc.s.j(dVarA);
        wt1.b bVar = (wt1.b) this.d.get();
        uw1.c cVarD = mVar.d();
        vc.s.j(cVarD);
        return new bu1.f(aVarF, dVarA, bVar, cVarD);
    }
}
