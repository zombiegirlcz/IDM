package joh;

import android.content.Context;
import b9.w2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements xph.b, oqh.c, vnh.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f177067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pqi.a f177068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zdl.c f177069c;
    public final h9h.a d;
    public final ite.a e;
    public final whl.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zdl.f f177070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u8h.c f177071h;
    public final s5d.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final emi.a f177072j;
    public final w k = this;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f177073l = e4m.b.b(new h(this));

    public w(ite.a aVar, h9h.a aVar2, pqi.a aVar3, s5d.a aVar4, whl.f fVar, zdl.c cVar, zdl.f fVar2, u8h.c cVar2, emi.a aVar5, Context context) {
        this.f177067a = context;
        this.f177068b = aVar3;
        this.f177069c = cVar;
        this.d = aVar2;
        this.e = aVar;
        this.f = fVar;
        this.f177070g = fVar2;
        this.f177071h = cVar2;
        this.i = aVar4;
        this.f177072j = aVar5;
    }

    public final hph.c a() {
        return new hph.c(this.f177068b.g(), new ooh.d());
    }

    @Override // xph.b
    public final xph.a b() {
        return new g2e.t(this.k, 22);
    }

    @Override // oqh.c
    public final oqh.a c() {
        return new fkg.a(this.k, 21);
    }

    public final toh.g d() {
        gte.a aVarB = this.e.b();
        vc.s.j(aVarB);
        return new toh.g(aVarB, new toh.o());
    }

    public final w2 e() {
        woh.b screenerInfoDialogClauseFactory = new woh.b();
        hph.j metricMapper = h();
        Intrinsics.checkNotNullParameter(screenerInfoDialogClauseFactory, "screenerInfoDialogClauseFactory");
        Intrinsics.checkNotNullParameter(metricMapper, "metricMapper");
        uoh.g gVar = new uoh.g();
        hph.j metricMapper2 = h();
        Intrinsics.checkNotNullParameter(metricMapper2, "metricMapper");
        uoh.h hVar = new uoh.h();
        hph.j metricMapper3 = h();
        Intrinsics.checkNotNullParameter(metricMapper3, "metricMapper");
        uoh.e eVar = new uoh.e();
        hph.j metricMapper4 = h();
        Intrinsics.checkNotNullParameter(metricMapper4, "metricMapper");
        uoh.a aVar = new uoh.a();
        hph.j metricMapper5 = h();
        Intrinsics.checkNotNullParameter(metricMapper5, "metricMapper");
        uoh.c cVar = new uoh.c();
        ooh.b bVar = new ooh.b();
        ybl.l lVarF = this.d.f();
        ugl.c cVarD = this.f.d();
        vc.s.j(cVarD);
        return new w2(gVar, hVar, eVar, aVar, cVar, bVar, lVarF, cVarD, new sph.o());
    }

    public final fkg.a f() {
        ugl.c cVarD = this.f.d();
        vc.s.j(cVarD);
        return new fkg.a(cVarD, new sph.o());
    }

    public final uqh.f g() {
        hph.k kVarI = i();
        hph.j screenerMetricsResourceMapper = h();
        toh.m screenerMetricSortingChangeProvider = new toh.m();
        Intrinsics.checkNotNullParameter(screenerMetricsResourceMapper, "screenerMetricsResourceMapper");
        Intrinsics.checkNotNullParameter(screenerMetricSortingChangeProvider, "screenerMetricSortingChangeProvider");
        return new uqh.f(kVarI, new uqh.c());
    }

    public final hph.j h() {
        hph.h signShowingPolicyMapper = new hph.h();
        Intrinsics.checkNotNullParameter(signShowingPolicyMapper, "signShowingPolicyMapper");
        return new hph.j(new hph.f(), d(), new toh.k());
    }

    public final hph.k i() {
        return new hph.k(this.d.C(), h());
    }
}
