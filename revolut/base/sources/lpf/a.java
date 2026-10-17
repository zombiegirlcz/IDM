package lpf;

import com.revolut.feature.transfer.core.impl.quotes.data.network.TransferQuoteService;
import om4.k0;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f198996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nj0.a f198997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bw9.a f198998c;
    public final jhf.a d;
    public final fy9.b e;
    public final xmg.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mj8.b f198999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h9h.a f199000h;
    public final n16.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k26.b f199001j;
    public final ta7.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final usg.a f199002l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jm4.r f199003m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final anb.s f199004n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f199005p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f199006q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f199007r;

    public a(g0 g0Var, nj0.a aVar, mj8.b bVar, ta7.a aVar2, fy9.b bVar2, jhf.a aVar3, xmg.a aVar4, h9h.a aVar5, usg.a aVar6, bw9.a aVar7, anb.s sVar, jm4.r rVar, n16.g gVar, k26.b bVar3) {
        this.f198996a = g0Var;
        this.f198997b = aVar;
        this.f198998c = aVar7;
        this.d = aVar3;
        this.e = bVar2;
        this.f = aVar4;
        this.f198999g = bVar;
        this.f199000h = aVar5;
        this.i = gVar;
        this.f199001j = bVar3;
        this.k = aVar2;
        this.f199002l = aVar6;
        this.f199003m = rVar;
        this.f199004n = sVar;
        int i = 13;
        this.o = e4m.b.b(new lal.j(this, 2, i));
        this.f199005p = e4m.b.b(new lal.j(this, 1, i));
        this.f199006q = e4m.b.b(new lal.j(this, 0, i));
        this.f199007r = e4m.b.b(new lal.j(this, 3, i));
    }

    public final bqf.d a() {
        ay9.a aVarA = this.e.a();
        vc.s.j(aVarA);
        return new bqf.d(aVarA, this.f.e());
    }

    public final ypf.b b() {
        return new ypf.b(this.f198998c.a());
    }

    public final ogm.i c() {
        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) this.d).c();
        vc.s.j(aVarC);
        return new ogm.i(aVarC);
    }

    public final opf.z d() {
        wzg.a aVarE = this.f199000h.e();
        vc.s.j(aVarE);
        k18.c cVarA = this.i.a();
        g26.b bVarA = this.f199001j.a();
        vc.s.j(bVarA);
        wa7.m mVarD = this.k.d();
        opf.b bVarG = g();
        anb.s sVar = this.f199004n;
        djb.n nVarA = sVar.a();
        vc.s.j(nVarA);
        return new opf.z(aVarE, cVarA, bVarA, mVarD, bVarG, nVarA, sVar.b(), i(), h());
    }

    public final t1j.b e() {
        return new t1j.b(new kbb.c((TransferQuoteService) this.f199006q.get(), new spf.a(), this.f198998c.a()));
    }

    public final bqf.g f() {
        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) this.d).c();
        vc.s.j(aVarC);
        hj8.a aVarA = this.f198999g.a();
        vc.s.j(aVarA);
        return new bqf.g(aVarC, aVarA);
    }

    public final opf.b g() {
        usg.a aVar = this.f199002l;
        wsg.n nVarB = aVar.b();
        wa7.m mVarD = this.k.d();
        wsg.n nVarB2 = aVar.b();
        k0 k0VarQ = this.f199003m.q();
        vc.s.j(k0VarQ);
        return new opf.b(nVarB, mVarD, new opf.e(nVarB2, k0VarQ), new opf.f());
    }

    public final jx0.a h() {
        xmg.a aVar = this.f;
        return new jx0.a(aVar.e(), aVar.d());
    }

    public final k7i.i i() {
        return new k7i.i(this.f199002l.a(), (ne0.j) this.f199007r.get());
    }
}
