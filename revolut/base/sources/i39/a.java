package i39;

import com.google.common.collect.ImmutableMap;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.lifestyle_feed.api.models.LifestyleWidgetContext;
import csh.j;
import cwi.m1;
import cwi.x;
import did.q;
import dsh.h;
import grl.k9;
import iwb.r;
import iwb.t;
import kotlin.jvm.internal.Intrinsics;
import kti.g;
import kti.i;
import vc.s;
import zxb.k0;
import zxb.t0;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hsh.b f158112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f158113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zxb.e f158114c;
    public final fjf.a d;
    public final n69.a e;
    public final did.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f49.a f158115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f158116h;
    public final aoj.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nej.a f158117j;
    public final afj.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f158118l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r f158119m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i f158120n;
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t0 f158121p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m1 f158122q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f158123r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final xuj.i f158124s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s2l.a f158125t;
    public final u06.c u;
    public final a v = this;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final gff.a f158126w = new gff.a(this, 0, 29);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final gff.a f158127x = new gff.a(this, 1, 29);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final gff.a f158128y = new gff.a(this, 2, 29);
    public final gff.a z = new gff.a(this, 3, 29);
    public final gff.a A = new gff.a(this, 4, 29);
    public final gff.a B = new gff.a(this, 5, 29);
    public final gff.a C = new gff.a(this, 6, 29);
    public final gff.a D = new gff.a(this, 7, 29);
    public final gff.a E = new gff.a(this, 8, 29);
    public final gff.a F = new gff.a(this, 9, 29);
    public final gff.a G = new gff.a(this, 10, 29);
    public final gff.a H = new gff.a(this, 11, 29);
    public final gff.a I = new gff.a(this, 12, 29);
    public final gff.a J = new gff.a(this, 13, 29);
    public final gff.a K = new gff.a(this, 14, 29);
    public final gff.a L = new gff.a(this, 15, 29);
    public final e4m.e M = e4m.b.b(e4m.c.a(this));
    public final e4m.e N = e4m.b.b(new gff.a(this, 16, 29));
    public final e4m.e O = e4m.b.b(new gff.a(this, 17, 29));
    public final e4m.e P = e4m.b.b(new gff.a(this, 18, 29));
    public final gff.a Q = new gff.a(this, 19, 29);
    public final gff.a R = new gff.a(this, 20, 29);
    public final gff.a S = new gff.a(this, 21, 29);

    public a(fjf.a aVar, hsh.b bVar, zxb.e eVar, k0 k0Var, s2l.a aVar2, n69.a aVar3, f49.a aVar4, q qVar, did.d dVar, aoj.a aVar5, nej.a aVar6, afj.b bVar2, r rVar, t tVar, g gVar, i iVar, t0 t0Var, x xVar, m1 m1Var, u06.c cVar, xuj.i iVar2) {
        this.f158112a = bVar;
        this.f158113b = k0Var;
        this.f158114c = eVar;
        this.d = aVar;
        this.e = aVar3;
        this.f = dVar;
        this.f158115g = aVar4;
        this.f158116h = qVar;
        this.i = aVar5;
        this.f158117j = aVar6;
        this.k = bVar2;
        this.f158118l = tVar;
        this.f158119m = rVar;
        this.f158120n = iVar;
        this.o = gVar;
        this.f158121p = t0Var;
        this.f158122q = m1Var;
        this.f158123r = xVar;
        this.f158124s = iVar2;
        this.f158125t = aVar2;
        this.u = cVar;
    }

    @Override // csh.k
    public final csh.i a() {
        csh.i iVar = (csh.i) this.f158125t.d.get();
        s.j(iVar);
        return iVar;
    }

    @Override // csh.k
    public final ImmutableMap b() {
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(7);
        builderBuilderWithExpectedSize.put("nearby_rewards", this.F);
        builderBuilderWithExpectedSize.put("esim", this.G);
        builderBuilderWithExpectedSize.put("giftcards", this.H);
        builderBuilderWithExpectedSize.put("airport_fast_track_pass", this.I);
        builderBuilderWithExpectedSize.put("airport_lounges", this.J);
        builderBuilderWithExpectedSize.put("transactions", this.K);
        builderBuilderWithExpectedSize.put("esim_medium", this.L);
        return builderBuilderWithExpectedSize.build();
    }

    @Override // csh.k
    public final h c() {
        dsh.g gVar = new dsh.g();
        fsh.c cVar = new fsh.c();
        j39.e eVar = new j39.e();
        j39.c cVar2 = new j39.c();
        j39.d dVar = new j39.d();
        j39.b bVar = new j39.b();
        j39.f fVar = new j39.f();
        j39.a aVar = new j39.a();
        j39.g gVar2 = new j39.g();
        ImmutableMap immutableMapOf = ImmutableMap.of("LoyaltyTransactionsDynamic", this.f158126w);
        ImmutableMap immutableMapOf2 = ImmutableMap.of("NearbyRewardsMedium", this.f158127x);
        ImmutableMap immutableMapOf3 = ImmutableMap.of("EsimHomeSmall", this.f158128y, "EsimHomeMedium", this.z);
        ImmutableMap immutableMapOf4 = ImmutableMap.of("GiftCardsMedium", this.A);
        ImmutableMap immutableMapOf5 = ImmutableMap.of("AirportFastTrackPassMedium", this.B);
        ImmutableMap immutableMapOf6 = ImmutableMap.of("RevPointsRimMedium", this.C);
        ImmutableMap immutableMapOf7 = ImmutableMap.of("AirportLoungesMedium", this.D);
        ImmutableMap immutableMapOf8 = ImmutableMap.of("TripItineraryMedium", this.E);
        sz5.f initializer = new sz5.f(gVar, cVar, eVar, cVar2, dVar, bVar, fVar, aVar, gVar2, immutableMapOf, immutableMapOf2, immutableMapOf3, immutableMapOf4, immutableMapOf5, immutableMapOf6, immutableMapOf7, immutableMapOf8);
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        gVar.a(LifestyleWidgetContext.class, immutableMapOf);
        gVar.a(LifestyleWidgetContext.class, fsh.c.a(immutableMapOf2, eVar));
        gVar.a(LifestyleWidgetContext.class, fsh.c.a(immutableMapOf3, cVar2));
        gVar.a(LifestyleWidgetContext.class, fsh.c.a(immutableMapOf4, dVar));
        gVar.a(LifestyleWidgetContext.class, fsh.c.a(immutableMapOf5, bVar));
        gVar.a(LifestyleWidgetContext.class, fsh.c.a(immutableMapOf6, fVar));
        gVar.a(LifestyleWidgetContext.class, fsh.c.a(immutableMapOf7, aVar));
        gVar.a(LifestyleWidgetContext.class, fsh.c.a(immutableMapOf8, gVar2));
        return new h(gVar.f117321a);
    }

    @Override // csh.k
    public final csh.g d() {
        return new h39.c();
    }

    @Override // csh.k
    public final csh.b e() {
        return new h39.a();
    }

    @Override // csh.k
    public final j f() {
        return new h39.d();
    }

    @Override // csh.k
    public final Class g() {
        return e.class;
    }

    @Override // csh.k
    public final q2l.a h() {
        q2l.a aVar = (q2l.a) this.f158125t.e.get();
        s.j(aVar);
        return aVar;
    }

    @Override // csh.k
    public final AnalyticsProduct.Retail l() {
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.v;
        return com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
    }
}
