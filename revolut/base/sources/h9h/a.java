package h9h;

import android.content.Context;
import com.revolut.feature.wealth.impl.data.network.collections.CollectionsService;
import com.revolut.feature.wealth.impl.data.network.eodrates.EodRatesService;
import com.revolut.feature.wealth.impl.data.network.mosttraded.MostTradedAssetsService;
import com.revolut.feature.wealth.impl.data.network.popularfirstbuy.PopularFirstBuyService;
import com.revolut.feature.wealth.impl.data.network.recurring_orders.PortfolioRecurringOrdersService;
import com.revolut.feature.wealth.impl.data.network.topmovers.TopMoversService;
import fw2.l;
import java.util.Map;
import nd.o;
import sgm.e3;
import t90.i;
import u90.a0;
import u90.a1;
import u90.b0;
import u90.b1;
import u90.c0;
import u90.d0;
import u90.e0;
import u90.f0;
import u90.g0;
import u90.h0;
import u90.i0;
import u90.j;
import u90.j0;
import u90.k;
import u90.k0;
import u90.l0;
import u90.m;
import u90.m0;
import u90.n;
import u90.n0;
import u90.o0;
import u90.p;
import u90.q0;
import u90.r;
import u90.r0;
import u90.s0;
import u90.t;
import u90.t0;
import u90.u;
import u90.u0;
import u90.v;
import u90.w;
import u90.w0;
import u90.x;
import u90.x0;
import u90.y;
import u90.y0;
import u90.z;
import u90.z0;
import vc.s;
import x8h.q;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    public final z7l.a A;
    public final e4m.e A0;
    public final whl.f B;
    public final e4m.e B0;
    public final u8h.c C;
    public final e4m.e C0;
    public final e4m.e D0;
    public final e4m.e E0;
    public final e4m.e F;
    public final l K;
    public final e4m.e L;
    public final e4m.e P;
    public final e4m.e Q;
    public final e4m.e W;
    public final e4m.e X;
    public final e4m.e Y;
    public final e4m.e Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdl.f f150256a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final e4m.e f150257a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zdl.c f150258b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final e4m.e f150259b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final usg.a f150260c;
    public final e4m.e c0;
    public final ee0.a d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final e4m.e f150261d0;
    public final an0.c e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final e4m.e f150262e0;
    public final rk0.c f;
    public final e4m.e f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bpj.a f150263g;
    public final e4m.e g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yj3.a f150264h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final e4m.e f150265h0;
    public final zdl.b i;
    public final e4m.e i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final npk.a f150266j;
    public final e4m.e j0;
    public final m2b.e k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final e4m.e f150267k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m7h.a f150268l;
    public final e4m.e l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p7h.a f150269m;
    public final e4m.e m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final nj0.a f150270n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final e4m.e f150271n0;
    public final l70.e o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final e4m.e f150272o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rg0.e f150273p;
    public final e4m.e p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jk3.c f150274q;
    public final e4m.e q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vv5.e f150275r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final e4m.e f150276r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f150277s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final e4m.e f150278s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ee0.c f150279t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final e4m.e f150280t0;
    public final nf0.a u;
    public final e4m.e u0;
    public final co0.a v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final e4m.e f150281v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c4f.a f150282w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final e4m.e f150283w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ite.a f150284x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final e4m.e f150285x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ku5.g f150286y;
    public final e4m.e y0;
    public final zdl.e z;
    public final e4m.e z0;
    public final a D = this;
    public final e4m.e E = h30.l.m(this, 1);
    public final e4m.e G = h30.l.m(this, 4);
    public final e4m.e H = h30.l.m(this, 5);
    public final e4m.e I = h30.l.m(this, 6);
    public final e4m.e J = h30.l.m(this, 9);
    public final e4m.e M = h30.l.m(this, 7);
    public final e4m.e N = h30.l.m(this, 11);
    public final e4m.e O = h30.l.m(this, 12);
    public final e4m.e R = h30.l.m(this, 16);
    public final e4m.e S = h30.l.m(this, 15);
    public final e4m.e T = h30.l.m(this, 14);
    public final e4m.e U = h30.l.m(this, 18);
    public final e4m.e V = h30.l.m(this, 17);

    public a(p7h.a aVar, m7h.a aVar2, jk3.c cVar, l70.e eVar, ee0.a aVar3, nj0.a aVar4, rg0.e eVar2, rk0.c cVar2, ee0.c cVar3, c4f.a aVar5, ite.a aVar6, bpj.a aVar7, an0.c cVar4, npk.a aVar8, usg.a aVar9, vv5.e eVar3, yj3.a aVar10, nf0.a aVar11, co0.a aVar12, j4i.a aVar13, ku5.g gVar, m2b.e eVar4, zdl.b bVar, zdl.c cVar5, whl.f fVar, u8h.c cVar6, zdl.f fVar2, z7l.a aVar14, zdl.e eVar5, Context context) {
        this.f150256a = fVar2;
        this.f150258b = cVar5;
        this.f150260c = aVar9;
        this.d = aVar3;
        this.e = cVar4;
        this.f = cVar2;
        this.f150263g = aVar7;
        this.f150264h = aVar10;
        this.i = bVar;
        this.f150266j = aVar8;
        this.k = eVar4;
        this.f150268l = aVar2;
        this.f150269m = aVar;
        this.f150270n = aVar4;
        this.o = eVar;
        this.f150273p = eVar2;
        this.f150274q = cVar;
        this.f150275r = eVar3;
        this.f150277s = context;
        this.f150279t = cVar3;
        this.u = aVar11;
        this.v = aVar12;
        this.f150282w = aVar5;
        this.f150284x = aVar6;
        this.f150286y = gVar;
        this.z = eVar5;
        this.A = aVar14;
        this.B = fVar;
        this.C = cVar6;
        int i = 17;
        this.F = e4m.b.b(new l(this, 2, i));
        this.K = new l(this, 8, i);
        this.L = e4m.b.b(new l(this, 10, i));
        this.P = e4m.b.b(new l(this, 3, i));
        this.Q = e4m.b.b(new l(this, 0, i));
        e4m.b.b(new l(this, 13, i));
        this.W = e4m.b.b(new l(this, 19, i));
        this.X = h30.l.m(this, 20);
        this.Y = h30.l.m(this, 23);
        this.Z = h30.l.m(this, 22);
        this.f150257a0 = e4m.b.b(new l(this, 21, i));
        this.f150259b0 = h30.l.m(this, 24);
        this.c0 = h30.l.m(this, 25);
        this.f150261d0 = h30.l.m(this, 26);
        this.f150262e0 = h30.l.m(this, 27);
        this.f0 = h30.l.m(this, 28);
        this.g0 = h30.l.m(this, 30);
        this.f150265h0 = h30.l.m(this, 29);
        this.i0 = h30.l.m(this, 31);
        this.j0 = h30.l.m(this, 33);
        this.f150267k0 = h30.l.m(this, 34);
        this.l0 = h30.l.m(this, 32);
        e4m.b.b(new l(this, 35, i));
        this.m0 = e4m.b.b(new l(this, 36, i));
        this.f150271n0 = h30.l.m(this, 37);
        this.f150272o0 = h30.l.m(this, 39);
        this.p0 = h30.l.m(this, 38);
        this.q0 = h30.l.m(this, 40);
        this.f150276r0 = h30.l.m(this, 42);
        this.f150278s0 = e4m.b.b(new l(this, 41, i));
        this.f150280t0 = e4m.b.b(new l(this, 43, i));
        this.u0 = e4m.b.b(new l(this, 44, i));
        this.f150281v0 = e4m.b.b(new l(this, 45, i));
        this.f150283w0 = e4m.b.b(new l(this, 46, i));
        this.f150285x0 = e4m.b.b(new l(this, 47, i));
        this.y0 = h30.l.m(this, 49);
        this.z0 = e4m.b.b(new l(this, 50, i));
        this.A0 = e4m.b.b(new l(this, 48, i));
        this.B0 = h30.l.m(this, 51);
        this.C0 = h30.l.m(this, 53);
        this.D0 = e4m.b.b(new l(this, 52, i));
        this.E0 = e4m.b.b(new l(this, 54, i));
    }

    public static o K() {
        return new o(new i(), new v90.h());
    }

    public static nbh.f x() {
        return new nbh.f(new nbh.c());
    }

    public static adh.c y() {
        return new adh.c(new nbh.a(), x());
    }

    public final q A() {
        y2f.a aVarB = this.f150282w.b();
        s.j(aVarB);
        return new q(aVarB, z());
    }

    public final d0 B() {
        l0 l0Var = new l0(new t90.h());
        m0 m0Var = new m0();
        o0 o0Var = new o0();
        j jVar = new j();
        k kVar = new k(new z0(), 0);
        i0 i0Var = new i0();
        k kVar2 = new k(new g0());
        u0 u0Var = new u0();
        t0 t0Var = new t0(new z0());
        r rVar = new r();
        m mVar = new m();
        x xVar = new x();
        x0 x0Var = new x0();
        s0 s0Var = new s0();
        e0 e0Var = new e0();
        u90.g gVar = new u90.g();
        b1 b1Var = new b1();
        p pVar = new p(new t90.j(), new t90.b(new t90.c()));
        u90.q qVar = new u90.q(new t90.j(), 0);
        u90.q qVar2 = new u90.q(new t90.j(), 1);
        u90.q qVar3 = new u90.q(new t90.j(), 2);
        l70.e eVar = this.o;
        l80.e eVarH = eVar.h();
        s.j(eVarH);
        w0 w0Var = new w0(eVarH);
        qd0.b bVarN = eVar.n();
        s.j(bVarN);
        z80.b bVarS = eVar.s();
        s.j(bVarS);
        return new d0(l0Var, m0Var, o0Var, jVar, kVar, i0Var, kVar2, u0Var, t0Var, rVar, mVar, xVar, x0Var, s0Var, e0Var, gVar, b1Var, pVar, qVar, qVar2, qVar3, w0Var, new k0(bVarN, bVarS), new k(new z0(), 2), new r0(), new y(), new a0(), new u90.h(a(), 1), new u90.e(a()), new u90.o(), new n(), new z(new t90.h(), 1), new f0(), new k(new t90.l()), new b0(new c0(new y())), new y0(), new z(new t90.h(), 0), new u90.i(), new u90.l(), new k(new z0(), 3), new h0(new z0(), new n0(new y())), new q0(new z0(), new n0(new y())), new u90.s(new n0(new y())), new u90.f(), new u90.h(a(), 0), new u90.a(), new a1(), new j0(), new w(), new u(new v(), new t90.l()), new u(new v(), 0), new u(new v(), 3), new t(new t90.a()), new u(new t90.a(), new v()));
    }

    public final jbh.e C() {
        return new jbh.e(new adh.a(), x(), new jbh.c());
    }

    public final e9h.d D() {
        zdl.c cVar = this.f150258b;
        ybl.b bVarB = cVar.b();
        s.j(bVarB);
        ppk.f fVarA = this.f150266j.a();
        ufm.g gVarE = E();
        wsg.n nVarB = this.f150260c.b();
        xv5.c cVarA = this.f150275r.a();
        s.j(cVarA);
        x8h.k kVarD = d();
        fk3.a aVarA = this.f150274q.a();
        s.j(aVarA);
        return new e9h.d(bVarB, fVarA, gVarE, nVarB, cVarA, kVarD, aVarA, cVar.a());
    }

    public final ufm.g E() {
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t((EodRatesService) this.c0.get(), new i8h.c((ue0.c) this.X.get()), new a7h.b((ne0.j) this.L.get()));
        l80.e eVarH = this.o.h();
        s.j(eVarH);
        return new ufm.g(new u0a.a(tVar, eVarH), this.f150266j.a());
    }

    public final toh.d F() {
        vdl.i0 i0VarD = this.f150258b.d();
        s.j(i0VarD);
        return new toh.d(i0VarD, this.f150266j.a());
    }

    public final t1j.b G() {
        return new t1j.b(new r10.q((PortfolioRecurringOrdersService) this.f150271n0.get(), (w4l.f) this.p0.get(), (w4l.f) this.q0.get()), (byte) 0);
    }

    public final adh.i H() {
        gte.a aVarB = this.f150284x.b();
        s.j(aVarB);
        return new adh.i(aVarB);
    }

    public final g9h.e I() {
        gte.a aVarB = this.f150284x.b();
        s.j(aVarB);
        return new g9h.e(aVarB);
    }

    public final tnb.g0 J() {
        ybl.l lVarA = this.i.a();
        s.j(lVarA);
        return new tnb.g0(lVarA);
    }

    public final r10.r L() {
        f8h.d dVar = (f8h.d) this.P.get();
        x8h.k kVarD = d();
        ybl.j jVarC = this.f150256a.c();
        s.j(jVarC);
        return new r10.r(dVar, kVarD, jVarC);
    }

    public final u90.b a() {
        zk0.b bVarL = this.o.l();
        s.j(bVarL);
        return new u90.b(bVarL);
    }

    public final x8h.g b() {
        com.revolut.feature.wealth.impl.data.repositories.a aVarC = c();
        com.revolut.feature.wealth.impl.data.repositories.a aVarC2 = c();
        zdl.c cVar = this.f150258b;
        ybl.b bVarB = cVar.b();
        s.j(bVarB);
        tv5.b bVarC = this.f150275r.c();
        s.j(bVarC);
        x8h.c cVar2 = new x8h.c(aVarC2, bVarB, bVarC);
        wsg.n nVarB = this.f150260c.b();
        ybl.b bVarB2 = cVar.b();
        s.j(bVarB2);
        return new x8h.g(aVarC, cVar2, nVarB, bVarB2);
    }

    public final com.revolut.feature.wealth.impl.data.repositories.a c() {
        ne0.j jVar = (ne0.j) this.L.get();
        y6h.n nVar = new y6h.n((ue0.c) this.f150262e0.get());
        CollectionsService collectionsService = (CollectionsService) this.f0.get();
        f7h.f fVar = (f7h.f) this.f150265h0.get();
        b80.c cVarP = this.o.p();
        s.j(cVarP);
        ue0.c cVar = (ue0.c) this.X.get();
        y6h.l lVar = new y6h.l((ne0.j) this.L.get(), (ue0.c) this.f150262e0.get());
        y6h.g gVar = new y6h.g((ne0.j) this.L.get(), (ue0.c) this.f150262e0.get());
        sf0.h hVarB = this.u.b();
        s.j(hVarB);
        v60.e eVarA = this.v.a();
        s.j(eVarA);
        return new com.revolut.feature.wealth.impl.data.repositories.a(jVar, nVar, collectionsService, fVar, cVarP, cVar, lVar, gVar, hVarB, eVarA);
    }

    public final x8h.k d() {
        wsg.n nVarB = this.f150260c.b();
        ue0.c cVar = (ue0.c) this.E.get();
        mk0.a aVarA = this.f.a();
        s.j(aVarA);
        e8h.e eVar = new e8h.e(cVar, aVarA);
        tzg.m mVar = (tzg.m) this.F.get();
        ybl.k kVarD = this.f150256a.d();
        s.j(kVarD);
        return new x8h.k(nVarB, eVar, mVar, kVarD);
    }

    public final wzg.a e() {
        return (wzg.a) this.Q.get();
    }

    public final ybl.l f() {
        ybl.l lVarA = this.i.a();
        s.j(lVarA);
        return lVarA;
    }

    public final x8h.m g() {
        ybl.i iVarB = this.f150256a.b();
        s.j(iVarB);
        return new x8h.m(iVarB);
    }

    public final r10.r h() {
        return new r10.r(b(), C(), new x8h.p());
    }

    public final x8h.y i() {
        q qVarA = A();
        c4f.a aVar = this.f150282w;
        y2f.a aVarB = aVar.b();
        s.j(aVarB);
        gte.a aVarB2 = this.f150284x.b();
        s.j(aVarB2);
        y2f.a aVarB3 = aVar.b();
        s.j(aVarB3);
        return new x8h.y(qVarA, aVarB, aVarB2, new rul.e(aVarB3, A()));
    }

    public final tzg.h j() {
        return (tzg.h) this.f150280t0.get();
    }

    public final su9.c k() {
        MostTradedAssetsService mostTradedAssetsService = (MostTradedAssetsService) this.f150259b0.get();
        l8h.g gVar = new l8h.g((ue0.c) this.X.get());
        b7h.a aVar = new b7h.a((ne0.j) this.L.get(), 1);
        b80.c cVarP = this.o.p();
        s.j(cVarP);
        e8h.o oVar = new e8h.o(mostTradedAssetsService, gVar, aVar, cVarP);
        ybl.b bVarB = this.f150258b.b();
        s.j(bVarB);
        fk3.a aVarA = this.f150274q.a();
        s.j(aVarA);
        return new su9.c(oVar, new x8h.e0(bVarB, aVarA));
    }

    public final ryc.a l() {
        return new ryc.a((tzg.i) this.f150257a0.get(), D());
    }

    public final e3 m() {
        PopularFirstBuyService popularFirstBuyService = (PopularFirstBuyService) this.f150261d0.get();
        m8h.d dVar = new m8h.d((ue0.c) this.X.get());
        ne0.j jVar = (ne0.j) this.L.get();
        b80.c cVarP = this.o.p();
        s.j(cVarP);
        return new e3(new e8h.u(popularFirstBuyService, dVar, jVar, cVarP), D());
    }

    public final tul.b n() {
        return new tul.b(new i4b.f((w4l.f) this.l0.get()));
    }

    public final v60.g o() {
        ael.d0 d0VarK = this.f150258b.k();
        s.j(d0VarK);
        tv5.b bVarC = this.f150275r.c();
        s.j(bVarC);
        return new v60.g(d0VarK, bVarC, D());
    }

    public final d9h.a p() {
        return new d9h.a(D(), 0);
    }

    public final x8h.n0 q() {
        gte.a aVarB = this.f150284x.b();
        s.j(aVarB);
        zdl.f fVar = this.f150256a;
        ybl.i iVarB = fVar.b();
        s.j(iVarB);
        e8h.d0 d0Var = (e8h.d0) this.A0.get();
        ybl.k kVarD = fVar.d();
        s.j(kVarD);
        ybl.d dVarH = this.f150258b.h();
        s.j(dVarH);
        return new x8h.n0(aVarB, iVarB, d0Var, kVarD, dVarH);
    }

    public final tsk.t r() {
        TopMoversService topMoversService = (TopMoversService) this.W.get();
        o8h.g gVar = new o8h.g((ue0.c) this.X.get());
        d7h.a aVar = new d7h.a((ne0.j) this.L.get(), 0);
        b80.c cVarP = this.o.p();
        s.j(cVarP);
        return new tsk.t(new e8h.i0(topMoversService, gVar, aVar, cVarP));
    }

    public final kbh.f s() {
        return new kbh.f(new kpj.f(H()), new wfl.b());
    }

    public final tzg.m t() {
        return (tzg.m) this.F.get();
    }

    public final z8h.g u() {
        r10.r rVarL = L();
        wzg.a aVar = (wzg.a) this.Q.get();
        zdl.f fVar = this.f150256a;
        ybl.i iVarB = fVar.b();
        s.j(iVarB);
        x8h.k kVarD = d();
        ppk.f fVarA = this.f150266j.a();
        Map mapA = fVar.a();
        s.j(mapA);
        return new z8h.g(rVarL, aVar, iVarB, kVarD, fVarA, mapA, new z8h.a());
    }

    public final mbh.e v() {
        return (mbh.e) this.f150283w0.get();
    }

    public final ybl.q w() {
        ybl.q qVarA = this.z.a();
        s.j(qVarA);
        return qVarA;
    }

    public final oc.f z() {
        return new oc.f(this.f150277s, 1);
    }
}
