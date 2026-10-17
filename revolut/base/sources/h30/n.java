package h30;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.revolut.chat.data.network.InAppCallSupportApi;
import com.revolut.chat.data.network.MetaInfoApi;
import com.revolut.chat.data.network.TicketsInfoApi;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import v20.v0;

/* JADX INFO: loaded from: classes.dex */
public final class n implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f148904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final of3.f f148906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nj0.a f148908c;
    public final l70.e d;
    public final jm0.a e;
    public final of3.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ee0.a f148911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final an0.c f148912h;
    public final Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final rg0.e f148914j;
    public final of3.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final th0.a f148916l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g0 f148917m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final lsb.a f148918n;
    public final ee7.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cf0.f f148921p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rkd.g f148922q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vxc.i f148923r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gp6.a f148925s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sse.b f148927t;
    public final ld0.c u;
    public final wrg.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n f148930w = this;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f148932x = l.k(this, 5);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f148934y = l.k(this, 4);
    public final e4m.e z = l.k(this, 8);
    public final m A = new m(this, 9);
    public final e4m.e B = e4m.g.a(new m(this, 7));
    public final e4m.e C = l.k(this, 13);
    public final e4m.e D = l.k(this, 12);
    public final e4m.e E = l.k(this, 15);
    public final e4m.e F = l.k(this, 14);
    public final e4m.e G = e4m.b.b(new m(this, 11));
    public final e4m.e H = e4m.g.a(new m(this, 10));
    public final e4m.e I = l.k(this, 6);
    public final e4m.e J = l.k(this, 3);
    public final e4m.e K = e4m.g.a(new m(this, 2));
    public final e4m.e L = l.k(this, 16);
    public final e4m.e M = l.k(this, 17);
    public final e4m.e N = e4m.b.b(new m(this, 1));
    public final e4m.e O = l.k(this, 18);
    public final e4m.e P = e4m.g.a(new m(this, 19));
    public final m Q = new m(this, 21);
    public final e4m.e R = l.k(this, 20);
    public final m S = new m(this, 22);
    public final e4m.e T = e4m.b.b(new m(this, 23));
    public final e4m.e U = e4m.b.b(new m(this, 0));
    public final e4m.e V = l.k(this, 24);
    public final m W = new m(this, 25);
    public final e4m.e X = e4m.g.a(new m(this, 26));
    public final m Y = new m(this, 28);
    public final e4m.e Z = l.k(this, 27);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final e4m.e f148905a0 = l.k(this, 30);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final e4m.e f148907b0 = e4m.b.b(new m(this, 29));
    public final e4m.e c0 = e4m.g.a(new m(this, 34));

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final e4m.e f148909d0 = l.k(this, 35);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final e4m.e f148910e0 = l.k(this, 37);
    public final e4m.e f0 = l.k(this, 38);
    public final e4m.e g0 = l.k(this, 39);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final m f148913h0 = new m(this, 40);
    public final e4m.e i0 = l.k(this, 36);
    public final e4m.e j0 = l.k(this, 33);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final m f148915k0 = new m(this, 42);
    public final e4m.e l0 = l.k(this, 43);
    public final e4m.e m0 = l.k(this, 41);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final m f148919n0 = new m(this, 45);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final e4m.e f148920o0 = e4m.b.b(new m(this, 44));
    public final e4m.e p0 = e4m.b.b(new m(this, 32));
    public final e4m.e q0 = e4m.b.b(new m(this, 31));

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final e4m.e f148924r0 = e4m.b.b(new m(this, 46));

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final e4m.e f148926s0 = e4m.b.b(new m(this, 48));

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final e4m.e f148928t0 = e4m.b.b(new m(this, 47));
    public final m u0 = new m(this, 49);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final e4m.e f148929v0 = l.k(this, 50);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final e4m.e f148931w0 = l.k(this, 51);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final e4m.e f148933x0 = l.k(this, 52);
    public final e4m.e y0 = l.k(this, 53);
    public final e4m.e z0 = l.k(this, 54);

    public n(b bVar, ld0.c cVar, of3.c cVar2, of3.f fVar, g0 g0Var, of3.b bVar2, l70.e eVar, ee0.a aVar, cf0.f fVar2, rg0.e eVar2, nj0.a aVar2, sse.b bVar3, vxc.i iVar, gp6.a aVar3, jm0.a aVar4, ee7.a aVar5, th0.a aVar6, an0.c cVar3, lsb.a aVar7, wrg.a aVar8, rkd.g gVar, Context context) {
        this.f148904a = bVar;
        this.f148906b = fVar;
        this.f148908c = aVar2;
        this.d = eVar;
        this.e = aVar4;
        this.f = cVar2;
        this.f148911g = aVar;
        this.f148912h = cVar3;
        this.i = context;
        this.f148914j = eVar2;
        this.k = bVar2;
        this.f148916l = aVar6;
        this.f148917m = g0Var;
        this.f148918n = aVar7;
        this.o = aVar5;
        this.f148921p = fVar2;
        this.f148922q = gVar;
        this.f148923r = iVar;
        this.f148925s = aVar3;
        this.f148927t = bVar3;
        this.u = cVar;
        this.v = aVar8;
    }

    public final e40.w A() {
        l80.e eVarH = this.d.h();
        vc.s.j(eVarH);
        k50.x xVarL = l();
        z50.e eVarV = v();
        z50.g gVar = new z50.g();
        j30.c cVarF = this.f148906b.f();
        vc.s.j(cVarF);
        return new e40.w(eVarH, xVarL, eVarV, gVar, cVarF);
    }

    public final z20.t B() {
        zk0.b bVarL = this.d.l();
        vc.s.j(bVarL);
        return new z20.t(bVarL, new z20.a());
    }

    public final w50.u C() {
        t1j.b bVar = new t1j.b((c30.h) this.f148926s0.get());
        j30.c cVarF = this.f148906b.f();
        vc.s.j(cVarF);
        l80.e eVarH = this.d.h();
        vc.s.j(eVarH);
        return new w50.u(bVar, cVarF, eVarH);
    }

    public final m30.g a() {
        n30.n nVarK = k();
        jpc.e eVarG = g();
        be7.k kVarC = this.o.c();
        vc.s.j(kVarC);
        l80.e eVarH = this.d.h();
        vc.s.j(eVarH);
        n30.x xVarB = this.f148906b.b();
        vc.s.j(xVarB);
        return new m30.g(nVarK, eVarG, kVarC, eVarH, xVarB);
    }

    @Override // q40.b
    public final q40.a b() {
        return new a0(this.f148930w);
    }

    @Override // c50.a
    public final b0 c() {
        return new b0(this.f148930w);
    }

    public final k30.a d() {
        return new k30.a((s20.d) this.N.get(), o());
    }

    public final a20.a e() {
        b1j.a aVar = (b1j.a) this.z.get();
        qd0.b bVar = (qd0.b) this.A.get();
        p10.b bVarE = this.f148906b.e();
        vc.s.j(bVarE);
        t20.d dVar = (t20.d) this.G.get();
        dm0.d dVarD = this.e.d();
        vc.s.j(dVarD);
        a20.a provider = new a20.a(aVar, bVar, bVarE, dVar, dVarD, new w01.f());
        Intrinsics.checkNotNullParameter(provider, "provider");
        return provider;
    }

    public final u20.f f() {
        return new u20.f((TicketsInfoApi) this.K.get(), (InAppCallSupportApi) this.X.get(), (ne0.j) this.M.get(), (ue0.c) this.S.get(), r());
    }

    public final jpc.e g() {
        v20.o oVar = (v20.o) this.U.get();
        u20.f fVarF = f();
        j30.c cVarF = this.f148906b.f();
        vc.s.j(cVarF);
        return new jpc.e(oVar, fVarF, cVarF);
    }

    public final k50.p h() {
        j30.c cVarF = this.f148906b.f();
        vc.s.j(cVarF);
        f80.a aVarX = this.d.x();
        vc.s.j(aVarX);
        return new k50.p(cVarF, aVarX);
    }

    public final p30.d i() {
        q10.a aVar = (q10.a) this.f148931w0.get();
        qz0.j jVar = (qz0.j) this.f148933x0.get();
        zk0.b bVarL = this.d.l();
        vc.s.j(bVarL);
        Context context = this.i;
        return gsi.d.l(this.f148904a, aVar, context, jVar, new su9.c(context, bVarL));
    }

    @Override // f50.a
    public final f50.d j() {
        return new f0(this.f148930w);
    }

    public final n30.n k() {
        v20.o oVar = (v20.o) this.U.get();
        MetaInfoApi metaInfoApi = (MetaInfoApi) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) this.J.get(), "retrofit", MetaInfoApi.class, "create(...)");
        vc.s.k(metaInfoApi);
        lfm.c cVar = (lfm.c) this.V.get();
        d4m.a aVarA = e4m.b.a(this.W);
        j30.c cVarF = this.f148906b.f();
        vc.s.j(cVarF);
        return new n30.n(oVar, metaInfoApi, cVar, aVarA, cVarF);
    }

    public final k50.x l() {
        of3.f fVar = this.f148906b;
        j30.c cVarF = fVar.f();
        vc.s.j(cVarF);
        p10.b bVarE = fVar.e();
        vc.s.j(bVarE);
        return new k50.x(cVarF, bVarE, gsi.d.r(this.f148904a), h());
    }

    public final n30.v m() {
        of3.f fVar = this.f148906b;
        j30.c cVarF = fVar.f();
        vc.s.j(cVarF);
        n30.n nVarK = k();
        tf3.b bVarD = fVar.d();
        vc.s.j(bVarD);
        return new n30.v(cVarF, nVarK, bVarD);
    }

    public final e40.g n() {
        m30.g gVarA = a();
        e40.w wVarA = A();
        j30.c cVarF = this.f148906b.f();
        vc.s.j(cVarF);
        e40.k kVar = new e40.k(new r10.v(gVarA, wVarA, cVarF), k());
        n30.n nVarK = k();
        be7.h hVarB = this.o.b();
        vc.s.j(hVarB);
        return new e40.g(kVar, nVarK, hVarB);
    }

    public final e30.b o() {
        return new e30.b((r20.b) this.O.get());
    }

    public final b9k.f p() {
        ImmutableMap immutableMapA = ((of3.j) this.k).a();
        vc.s.j(immutableMapA);
        k50.x xVarL = l();
        of3.f fVar = this.f148906b;
        j30.c cVarF = fVar.f();
        vc.s.j(cVarF);
        f01.a aVarG = fVar.g();
        vc.s.j(aVarG);
        return new b9k.f(immutableMapA, xVarL, cVarF, aVarG, ((s41.a) fVar.i).d(), (q50.l) this.R.get());
    }

    @Override // i40.a
    public final w q() {
        return new w(this.f148930w);
    }

    public final y10.h r() {
        a20.a aVarE = e();
        y10.c cVar = new y10.c(new y10.b());
        k50.x xVarL = l();
        kg.o oVar = (kg.o) this.f148932x.get();
        v0 v0Var = (v0) this.P.get();
        of3.f fVar = this.f148906b;
        f01.a aVarG = fVar.g();
        vc.s.j(aVarG);
        v0 v0Var2 = (v0) this.P.get();
        a20.a aVarE2 = e();
        f01.a aVarG2 = fVar.g();
        vc.s.j(aVarG2);
        return new y10.h(aVarE, cVar, xVarL, oVar, v0Var, aVarG, new y10.l(v0Var2, aVarE2, aVarG2), p());
    }

    public final q s() {
        l30.b bVar = (l30.b) this.p0.get();
        os2.g gVarA = l70.u.a();
        j30.c cVarF = this.f148906b.f();
        vc.s.j(cVarF);
        df0.b bVarA = this.f148921p.a();
        vc.s.j(bVarA);
        return new q(bVar, gVarA, cVarF, bVarA);
    }

    public final j30.c t() {
        j30.c cVarF = this.f148906b.f();
        vc.s.j(cVarF);
        return cVarF;
    }

    public final j30.d u() {
        return (j30.d) this.q0.get();
    }

    public final z50.e v() {
        l80.e eVarH = this.d.h();
        vc.s.j(eVarH);
        return new z50.e(eVarH);
    }

    public final r10.q w() {
        of3.f fVar = this.f148906b;
        j30.c cVarF = fVar.f();
        vc.s.j(cVarF);
        qd0.b bVar = (qd0.b) this.A.get();
        kg.o oVar = (kg.o) this.f148932x.get();
        k50.x xVarL = l();
        f01.a aVarG = fVar.g();
        vc.s.j(aVarG);
        return new r10.q(cVarF, bVar, new f30.k(oVar, xVarL, aVarG, new n50.b(l(), v())));
    }

    public final r30.a x() {
        return new r30.a((y20.g0) this.j0.get());
    }

    public final uvl.c y() {
        return new uvl.c(e4m.b.a(this.L), r(), new y20.h());
    }

    public final xe0.e z() {
        ee0.a aVar = this.f148911g;
        je0.d mapper = aVar.b();
        vc.s.j(mapper);
        yk0.a databaseSessionProvider = this.f148912h.b();
        vc.s.j(databaseSessionProvider);
        xe0.f storageFactory = aVar.f();
        vc.s.j(storageFactory);
        a30.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "PRE_CHAT_FILE", mapper, 1, null, 48);
    }
}
