package ta9;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ore.b f269173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk3.c f269174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ite.a f269175c;
    public final e0 d;
    public final q8b.a e;

    public b0(ore.b bVar, q8b.a aVar, ite.a aVar2, jk3.c cVar, e0 e0Var) {
        this.f269173a = bVar;
        this.f269174b = cVar;
        this.f269175c = aVar2;
        this.d = e0Var;
        this.e = aVar;
    }

    public final qa9.w a() {
        mre.c cVarB = this.f269173a.b();
        vc.s.j(cVarB);
        fk3.a aVarA = this.f269174b.a();
        vc.s.j(aVarA);
        gte.a aVarB = this.f269175c.b();
        vc.s.j(aVarB);
        qb9.b bVar = (qb9.b) this.d.f269202h.get();
        vc.s.j(bVar);
        return new qa9.w(cVarB, aVarA, aVarB, new i4b.f(bVar));
    }

    public final jid.z b() {
        n8b.b bVarB = this.e.b();
        vc.s.j(bVarB);
        qa9.p pVar = new qa9.p(bVarB, new kbb.c(new onh.b(new sa9.e()), new p56.a(new sa9.e()), new sa9.b()));
        gte.a aVarB = this.f269175c.b();
        vc.s.j(aVarB);
        return new jid.z(pVar, new qa9.a(aVarB));
    }
}
