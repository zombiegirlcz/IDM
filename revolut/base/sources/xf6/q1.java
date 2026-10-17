package xf6;

/* JADX INFO: loaded from: classes13.dex */
public final class q1 implements je6.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fqk.a f304999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je6.g f305000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ite.a f305001c;
    public final n1 d;
    public final usg.a e;
    public final lla.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final aa1.a f305002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vn2.e f305003h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f305004j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f305005l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f305006m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f305007n;

    public q1(ite.a aVar, usg.a aVar2, je6.g gVar, n1 n1Var, fqk.a aVar3, lla.a aVar4, aa1.a aVar5, vn2.e eVar) {
        this.f304999a = aVar3;
        this.f305000b = gVar;
        this.f305001c = aVar;
        this.d = n1Var;
        this.e = aVar2;
        this.f = aVar4;
        this.f305002g = aVar5;
        this.f305003h = eVar;
        int i = 23;
        this.i = e4m.b.b(new vxc.g(this, 0, i));
        this.f305004j = e4m.b.b(new vxc.g(this, 1, i));
        this.k = e4m.b.b(new vxc.g(this, 2, i));
        this.f305005l = e4m.b.b(new vxc.g(this, 3, i));
        this.f305006m = e4m.b.b(new vxc.g(this, 4, i));
        this.f305007n = e4m.b.b(new vxc.g(this, 5, i));
    }

    public final pfe.d a() {
        return (pfe.d) this.i.get();
    }

    public final yg6.h b() {
        je6.h hVarC = ((t) this.f305000b).c();
        vc.s.j(hVarC);
        yg6.m mVar = new yg6.m(this.f.a());
        gte.a aVarB = this.f305001c.b();
        vc.s.j(aVarB);
        return new yg6.h(hVarC, mVar, aVarB);
    }
}
