package p28;

import com.google.common.collect.ImmutableMap;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import csh.j;
import ewg.p;
import grl.k9;
import iel.a0;
import iel.o;
import iel.q;
import iel.r;
import iel.v;
import iel.x;
import iel.y;
import k8b.k;
import k8b.l;
import k8b.m;
import kotlin.jvm.internal.Intrinsics;
import mkh.t;
import p12.s0;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements g {
    public final yj3.a A;
    public final yah.a B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hsh.b f232104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9h.a f232106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u9h.a f232108c;
    public final bpj.a d;
    public final zdl.f e;
    public final p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ite.a f232111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yog.a f232112h;
    public final ibh.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final vnh.b f232114j;
    public final whl.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final whl.e f232116l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zdl.c f232117m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l70.e f232118n;
    public final m18.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l0k.c f232121p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w9h.a f232122q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vhh.a f232123r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k3d.a f232125s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y9h.a f232127t;
    public final th7.d u;
    public final c4f.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s2l.a f232130w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t f232132x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k3d.d f232134y;
    public final m2b.f z;
    public final b C = this;
    public final s0 D = new s0(this, 0, 3);
    public final s0 E = new s0(this, 1, 3);
    public final s0 F = new s0(this, 2, 3);
    public final s0 G = new s0(this, 3, 3);
    public final s0 H = new s0(this, 4, 3);
    public final s0 I = new s0(this, 5, 3);
    public final s0 J = new s0(this, 6, 3);
    public final s0 K = new s0(this, 7, 3);
    public final s0 L = new s0(this, 8, 3);
    public final s0 M = new s0(this, 9, 3);
    public final s0 N = new s0(this, 10, 3);
    public final e4m.e O = e4m.b.b(new s0(this, 12, 3));
    public final s0 P = new s0(this, 11, 3);
    public final e4m.e Q = e4m.b.b(new s0(this, 14, 3));
    public final s0 R = new s0(this, 13, 3);
    public final s0 S = new s0(this, 15, 3);
    public final s0 T = new s0(this, 16, 3);
    public final s0 U = new s0(this, 17, 3);
    public final s0 V = new s0(this, 18, 3);
    public final s0 W = new s0(this, 19, 3);
    public final s0 X = new s0(this, 20, 3);
    public final s0 Y = new s0(this, 21, 3);
    public final s0 Z = new s0(this, 22, 3);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final s0 f232105a0 = new s0(this, 23, 3);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final s0 f232107b0 = new s0(this, 24, 3);
    public final s0 c0 = new s0(this, 25, 3);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final s0 f232109d0 = new s0(this, 26, 3);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final s0 f232110e0 = new s0(this, 27, 3);
    public final s0 f0 = new s0(this, 28, 3);
    public final s0 g0 = new s0(this, 29, 3);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final s0 f232113h0 = new s0(this, 30, 3);
    public final s0 i0 = new s0(this, 31, 3);
    public final s0 j0 = new s0(this, 32, 3);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final s0 f232115k0 = new s0(this, 33, 3);
    public final s0 l0 = new s0(this, 34, 3);
    public final s0 m0 = new s0(this, 35, 3);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final s0 f232119n0 = new s0(this, 36, 3);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final s0 f232120o0 = new s0(this, 37, 3);
    public final s0 p0 = new s0(this, 38, 3);
    public final s0 q0 = new s0(this, 39, 3);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final s0 f232124r0 = new s0(this, 40, 3);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final s0 f232126s0 = new s0(this, 41, 3);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final s0 f232128t0 = new s0(this, 42, 3);
    public final s0 u0 = new s0(this, 43, 3);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final s0 f232129v0 = new s0(this, 44, 3);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final s0 f232131w0 = new s0(this, 45, 3);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final s0 f232133x0 = new s0(this, 46, 3);
    public final e4m.e y0 = e4m.b.b(e4m.c.a(this));
    public final e4m.e z0 = e4m.b.b(new s0(this, 47, 3));
    public final e4m.e A0 = e4m.b.b(new s0(this, 48, 3));
    public final e4m.e B0 = e4m.b.b(new s0(this, 49, 3));

    public b(m2b.f fVar, whl.e eVar, l70.e eVar2, yj3.a aVar, bpj.a aVar2, h9h.a aVar3, ite.a aVar4, c4f.a aVar5, m18.e eVar3, yah.a aVar6, ibh.b bVar, l0k.c cVar, u9h.a aVar7, w9h.a aVar8, fhd.b bVar2, y9h.a aVar9, yog.a aVar10, k3d.a aVar11, p pVar, zdl.c cVar2, whl.f fVar2, zdl.f fVar3, t tVar, vhh.a aVar12, hsh.b bVar3, s2l.a aVar13, th7.d dVar, k3d.d dVar2, vnh.b bVar4, u0e.a aVar14) {
        this.f232104a = bVar3;
        this.f232106b = aVar3;
        this.f232108c = aVar7;
        this.d = aVar2;
        this.e = fVar3;
        this.f = pVar;
        this.f232111g = aVar4;
        this.f232112h = aVar10;
        this.i = bVar;
        this.f232114j = bVar4;
        this.k = fVar2;
        this.f232116l = eVar;
        this.f232117m = cVar2;
        this.f232118n = eVar2;
        this.o = eVar3;
        this.f232121p = cVar;
        this.f232122q = aVar8;
        this.f232123r = aVar12;
        this.f232125s = aVar11;
        this.f232127t = aVar9;
        this.u = dVar;
        this.v = aVar5;
        this.f232130w = aVar13;
        this.f232132x = tVar;
        this.f232134y = dVar2;
        this.z = fVar;
        this.A = aVar;
        this.B = aVar6;
    }

    @Override // csh.k
    public final csh.i a() {
        csh.i iVar = (csh.i) this.f232130w.d.get();
        s.j(iVar);
        return iVar;
    }

    @Override // csh.k
    public final ImmutableMap b() {
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(21);
        builderBuilderWithExpectedSize.put("most-traded", this.f232109d0);
        builderBuilderWithExpectedSize.put("top_movers", this.f232110e0);
        builderBuilderWithExpectedSize.put("symbol-standalone", this.f0);
        builderBuilderWithExpectedSize.put("watchlist", this.g0);
        builderBuilderWithExpectedSize.put("watchlist-symbol", this.f232113h0);
        builderBuilderWithExpectedSize.put("popular-starter-cfds", this.i0);
        builderBuilderWithExpectedSize.put("cfds-pnl-drivers", this.j0);
        builderBuilderWithExpectedSize.put("recommended-buys", this.f232115k0);
        builderBuilderWithExpectedSize.put("corporate_events", this.l0);
        builderBuilderWithExpectedSize.put("products", this.m0);
        builderBuilderWithExpectedSize.put("transactions", this.f232119n0);
        builderBuilderWithExpectedSize.put("analytics", this.f232120o0);
        builderBuilderWithExpectedSize.put("popular_first_buys", this.p0);
        builderBuilderWithExpectedSize.put("popular_bonds", this.q0);
        builderBuilderWithExpectedSize.put("popular_stocks", this.f232124r0);
        builderBuilderWithExpectedSize.put("popular_etfs", this.f232126s0);
        builderBuilderWithExpectedSize.put("popular_cfds", this.f232128t0);
        builderBuilderWithExpectedSize.put("commodities", this.u0);
        builderBuilderWithExpectedSize.put("news", this.f232129v0);
        builderBuilderWithExpectedSize.put("collections", this.f232131w0);
        builderBuilderWithExpectedSize.put("automations", this.f232133x0);
        return builderBuilderWithExpectedSize.build();
    }

    @Override // csh.k
    public final dsh.h c() {
        dsh.g gVar = new dsh.g();
        fsh.c cVar = new fsh.c();
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(13);
        builderBuilderWithExpectedSize.put("PopularETFsDynamic", this.D);
        builderBuilderWithExpectedSize.put("PopularCFDsDynamic", this.E);
        builderBuilderWithExpectedSize.put("PopularBondsDynamic", this.F);
        builderBuilderWithExpectedSize.put("AnalyticsMedium", this.G);
        builderBuilderWithExpectedSize.put("CollectionsDynamic", this.H);
        builderBuilderWithExpectedSize.put("CorporateEventsDynamic", this.I);
        builderBuilderWithExpectedSize.put("NewsDynamic", this.J);
        builderBuilderWithExpectedSize.put("PopularStocksDynamic", this.K);
        builderBuilderWithExpectedSize.put("PopularFirstBuysDynamic", this.L);
        builderBuilderWithExpectedSize.put("ProductsDynamic", this.M);
        builderBuilderWithExpectedSize.put("TransactionsDynamic", this.N);
        builderBuilderWithExpectedSize.put("CommoditiesMedium", this.P);
        builderBuilderWithExpectedSize.put("WealthAutomationsDynamic", this.R);
        ImmutableMap immutableMapBuild = builderBuilderWithExpectedSize.build();
        ImmutableMap.Builder builderBuilderWithExpectedSize2 = ImmutableMap.builderWithExpectedSize(6);
        builderBuilderWithExpectedSize2.put("SymbolStandalone", this.S);
        builderBuilderWithExpectedSize2.put("SymbolSmall", this.T);
        builderBuilderWithExpectedSize2.put("WatchlistMedium", this.U);
        builderBuilderWithExpectedSize2.put("WatchlistLarge", this.V);
        builderBuilderWithExpectedSize2.put("WatchlistSymbol", this.W);
        builderBuilderWithExpectedSize2.put("WatchlistItems", this.X);
        ImmutableMap immutableMapBuild2 = builderBuilderWithExpectedSize2.build();
        ImmutableMap immutableMapOf = ImmutableMap.of("TopMoversDynamic", this.Y);
        ImmutableMap immutableMapOf2 = ImmutableMap.of("MostTradedDynamic", this.Z, "PopularFirstBuysCfdsDynamic", this.f232105a0, "CfdsPnLDriversDynamic", this.f232107b0, "RecommendedBuysDynamic", this.c0);
        e28.e eVar = new e28.e();
        e28.g gVar2 = new e28.g();
        e28.f fVar = new e28.f();
        i initializer = new i(gVar, cVar, immutableMapBuild, immutableMapBuild2, immutableMapOf, immutableMapOf2, eVar, gVar2, fVar);
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        gVar.a(InvestWidgetContext.class, immutableMapBuild);
        gVar.a(InvestWidgetContext.class, fsh.c.a(immutableMapBuild2, eVar));
        gVar.a(InvestWidgetContext.class, fsh.c.a(immutableMapOf, gVar2));
        gVar.a(InvestWidgetContext.class, fsh.c.a(immutableMapOf2, fVar));
        return new dsh.h(gVar.f117321a);
    }

    @Override // csh.k
    public final csh.g d() {
        return new e28.c();
    }

    @Override // csh.k
    public final csh.b e() {
        return new e28.a();
    }

    @Override // csh.k
    public final j f() {
        return new e28.d();
    }

    @Override // csh.k
    public final Class g() {
        return d28.b.class;
    }

    @Override // csh.k
    public final q2l.a h() {
        q2l.a aVar = (q2l.a) this.f232130w.e.get();
        s.j(aVar);
        return aVar;
    }

    public final ib7.j i() {
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(14);
        builderBuilderWithExpectedSize.put(iel.d.class, new k8b.d());
        builderBuilderWithExpectedSize.put(x.class, new k8b.j());
        builderBuilderWithExpectedSize.put(y.class, new k());
        builderBuilderWithExpectedSize.put(v.class, new k8b.i());
        builderBuilderWithExpectedSize.put(a0.class, new m());
        builderBuilderWithExpectedSize.put(iel.b.class, new k8b.b());
        builderBuilderWithExpectedSize.put(o.class, new k8b.g());
        qd0.b bVarN = this.f232118n.n();
        s.j(bVarN);
        builderBuilderWithExpectedSize.put(iel.h.class, new k8b.e(bVarN));
        builderBuilderWithExpectedSize.put(iel.c.class, new k8b.c());
        builderBuilderWithExpectedSize.put(iel.m.class, new l());
        builderBuilderWithExpectedSize.put(iel.g.class, new l());
        builderBuilderWithExpectedSize.put(q.class, new l());
        builderBuilderWithExpectedSize.put(r.class, new k8b.h());
        builderBuilderWithExpectedSize.put(iel.k.class, new k8b.f());
        return new ib7.j(builderBuilderWithExpectedSize.build(), 1);
    }

    public final ash.i j() {
        return (ash.i) this.z0.get();
    }

    public final e38.f k() {
        gte.a aVarB = this.f232111g.b();
        s.j(aVarB);
        ybl.l lVarF = this.f232106b.f();
        y2f.a aVarB2 = this.v.b();
        s.j(aVarB2);
        return new e38.f(aVarB, lVarF, aVarB2, n());
    }

    @Override // csh.k
    public final AnalyticsProduct.Retail l() {
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.v;
        return com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
    }

    public final f38.b m() {
        gte.a aVarB = this.f232111g.b();
        s.j(aVarB);
        return new f38.b(aVarB, (f38.c) this.Q.get());
    }

    public final n28.d n() {
        xoj.a aVarA = this.d.a();
        s.j(aVarA);
        ybl.i iVarB = this.e.b();
        s.j(iVarB);
        tzg.m mVarT = this.f232106b.t();
        s.j(mVarT);
        return new n28.d(aVarA, iVarB, mVarT);
    }

    public final v28.f o() {
        return new v28.f(this.f232106b.C());
    }

    public final t9h.a p() {
        hd.r factory = this.f232108c.a();
        u28.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new t9h.a((ryc.a) factory.f151364a, (ybl.l) factory.f151365b, (e9h.d) factory.d, (rul.e) factory.e, (gte.a) factory.f);
    }

    public final jpc.e q() {
        q3d.h factory = (q3d.h) this.f232125s.k.get();
        s.j(factory);
        g38.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return factory.a(factory.f241955c);
    }
}
