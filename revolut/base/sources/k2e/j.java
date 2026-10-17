package k2e;

import g2e.n0;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import qgk.i3;
import zxb.k0;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements z2e.a, b3e.b, h3e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ite.a f180510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f180511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iwb.r f180512c;
    public final ila.b d;
    public final nj0.a e;
    public final ee0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final an0.c f180513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f49.a f180514h;
    public final did.q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kvb.b f180515j;
    public final vn.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l70.e f180516l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final cri.b f180517m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xmg.a f180518n;
    public final efk.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i3 f180519p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ore.b f180520q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f180521r = this;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f180522s = e4m.b.b(new i(this, 2));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f180523t = e4m.b.b(new i(this, 1));
    public final e4m.e u = e4m.b.b(new i(this, 3));
    public final e4m.e v = e4m.b.b(new i(this, 4));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f180524w = e4m.b.b(new i(this, 0));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f180525x = e4m.b.b(new i(this, 5));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f180526y = e4m.b.b(new i(this, 6));
    public final e4m.e z = e4m.b.b(new i(this, 7));
    public final e4m.e A = e4m.b.b(new i(this, 8));

    public j(z zVar, vn.a aVar, kf0.c cVar, l70.e eVar, ee0.a aVar2, nj0.a aVar3, cri.b bVar, ite.a aVar4, f49.a aVar5, efk.a aVar6, ila.b bVar2, i3 i3Var, k0 k0Var, kvb.b bVar3, iwb.r rVar, did.q qVar, an0.c cVar2, ore.b bVar4, xmg.a aVar7) {
        this.f180510a = aVar4;
        this.f180511b = k0Var;
        this.f180512c = rVar;
        this.d = bVar2;
        this.e = aVar3;
        this.f = aVar2;
        this.f180513g = cVar2;
        this.f180514h = aVar5;
        this.i = qVar;
        this.f180515j = bVar3;
        this.k = aVar;
        this.f180516l = eVar;
        this.f180517m = bVar;
        this.f180518n = aVar7;
        this.o = aVar6;
        this.f180519p = i3Var;
        this.f180520q = bVar4;
    }

    public final twg.c a() {
        eub.a revPointsAvailabilityInteractor = this.f180511b.a();
        vc.s.j(revPointsAvailabilityInteractor);
        h4g.g shopsFeatureAvailabilityInteractor = this.i.b();
        svb.a revPointsGiftcardsFeatureInteractor = this.f180512c.a();
        vc.s.j(revPointsGiftcardsFeatureInteractor);
        h30.q storeAvailabilityInteractor = d();
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsGiftcardsFeatureInteractor, "revPointsGiftcardsFeatureInteractor");
        Intrinsics.checkNotNullParameter(storeAvailabilityInteractor, "storeAvailabilityInteractor");
        twg.c cVar = new twg.c();
        cVar.f275017a = revPointsAvailabilityInteractor;
        cVar.f275018b = shopsFeatureAvailabilityInteractor;
        cVar.f275019c = revPointsGiftcardsFeatureInteractor;
        cVar.d = storeAvailabilityInteractor;
        return cVar;
    }

    @Override // h3e.a
    public final u b() {
        return new u(this.f180521r);
    }

    @Override // b3e.b
    public final b3e.a c() {
        return new t(this.f180521r);
    }

    public final h30.q d() {
        gte.a aVarB = this.f180510a.b();
        vc.s.j(aVarB);
        eub.a aVarA = this.f180511b.a();
        vc.s.j(aVarA);
        svb.a aVarA2 = this.f180512c.a();
        vc.s.j(aVarA2);
        return new h30.q(aVarB, aVarA, aVarA2, this.d.a());
    }

    public final l2e.a e() {
        return new l2e.a((g2e.r) this.f180524w.get());
    }

    public final t1 f() {
        return new t1((g2e.w) this.f180526y.get());
    }

    public final kye.e g() {
        n0 n0Var = (n0) this.f180525x.get();
        lvb.d dVar = (lvb.d) this.f180515j.v.get();
        vc.s.j(dVar);
        return new kye.e(n0Var, dVar);
    }

    @Override // z2e.a
    public final p j() {
        return new p(this.f180521r);
    }
}
