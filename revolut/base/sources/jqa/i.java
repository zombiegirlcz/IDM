package jqa;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.push_to_card.impl.flows.amount_common.Push2CardAmountService;
import com.revolut.feature.push_to_card.impl.ui.review.PushToCardTransferReviewScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import ip0.v7;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import z0h.q1;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements xki.e {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;
    public final e4m.e E;
    public final e4m.e F;
    public final e4m.e G;
    public final e4m.e H;
    public final e4m.e I;
    public final e4m.e J;
    public final e4m.e K;
    public final e4m.e L;
    public final e4m.e M;
    public final e4m.e N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PushToCardTransferReviewScreenContract$InputData f177580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f177581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f177582c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f177583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f177584h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f177585j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f177586l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f177587m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f177588n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f177589p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f177590q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f177591r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f177592s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f177593t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f177594w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f177595x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f177596y;
    public final e4m.e z;

    public i(e eVar, ViewController viewController, PushToCardTransferReviewScreenContract$InputData pushToCardTransferReviewScreenContract$InputData) {
        this.f177582c = eVar;
        this.f177580a = pushToCardTransferReviewScreenContract$InputData;
        this.f177581b = viewController;
        this.d = v7.q(eVar, this, 0);
        this.e = v7.q(eVar, this, 1);
        this.f = e4m.b.b(e4m.c.a(viewController));
        this.f177583g = v7.q(eVar, this, 4);
        this.f177584h = v7.q(eVar, this, 3);
        this.i = v7.q(eVar, this, 2);
        this.f177585j = v7.q(eVar, this, 6);
        this.k = v7.q(eVar, this, 5);
        this.f177586l = v7.q(eVar, this, 8);
        this.f177587m = v7.q(eVar, this, 7);
        this.f177588n = v7.q(eVar, this, 10);
        this.o = v7.q(eVar, this, 12);
        this.f177589p = v7.q(eVar, this, 11);
        this.f177590q = v7.q(eVar, this, 13);
        this.f177591r = v7.q(eVar, this, 9);
        int i = 0;
        this.f177592s = e4m.b.b(new h(eVar, this, 15, i));
        this.f177593t = v7.q(eVar, this, 14);
        this.u = e4m.b.b(new h(eVar, this, 17, i));
        this.v = v7.q(eVar, this, 16);
        this.f177594w = v7.q(eVar, this, 19);
        this.f177595x = v7.q(eVar, this, 18);
        this.f177596y = e4m.b.b(new h(eVar, this, 21, i));
        this.z = v7.q(eVar, this, 20);
        this.A = v7.q(eVar, this, 25);
        this.B = e4m.b.b(new h(eVar, this, 24, i));
        this.C = v7.q(eVar, this, 26);
        this.D = e4m.b.b(new h(eVar, this, 27, i));
        this.E = e4m.b.b(new h(eVar, this, 23, i));
        this.F = v7.q(eVar, this, 22);
        this.G = v7.q(eVar, this, 28);
        this.H = v7.q(eVar, this, 29);
        this.I = e4m.g.a(new h(eVar, this, 30, i));
        this.J = e4m.g.a(new h(eVar, this, 32, i));
        this.K = e4m.g.a(new h(eVar, this, 31, i));
        this.L = e4m.g.a(new h(eVar, this, 35, i));
        this.M = v7.q(eVar, this, 34);
        this.N = e4m.b.b(new h(eVar, this, 33, i));
    }

    public final jid.z b() {
        e eVar = this.f177582c;
        Retrofit retrofit = ((nj0.d) eVar.f177541b).f();
        kra.a aVar = kra.b.Companion;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(Push2CardAmountService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        Push2CardAmountService push2CardAmountService = (Push2CardAmountService) objCreate;
        vc.s.k(push2CardAmountService);
        aVar.getClass();
        ne0.d dVar = new ne0.d();
        rga.c cVarB = eVar.d.b();
        vc.s.j(cVarB);
        return new jid.z(new h30.q(push2CardAmountService, dVar, cVarB), eVar.f177543g.b());
    }

    public final m5k.b c() {
        q1 q1Var = (q1) this.C.get();
        e eVar = this.f177582c;
        return new m5k.b(new m5k.g(q1Var, eVar.o.f()), new m5k.d(eVar.f177549p.e()), new m5k.e());
    }

    @Override // xki.e
    public final Set f() {
        yji.n nVar = (yji.n) this.f177593t.get();
        yji.n nVar2 = (yji.n) this.v.get();
        yji.n nVar3 = (yji.n) this.f177595x.get();
        yji.n nVar4 = (yji.n) this.z.get();
        yji.n nVar5 = (yji.n) this.F.get();
        yji.n nVar6 = (yji.n) this.G.get();
        yji.n nVar7 = (yji.n) this.H.get();
        zrf.m provider = (zrf.m) this.I.get();
        Intrinsics.checkNotNullParameter(provider, "provider");
        vc.s.k(provider);
        zrf.g provider2 = (zrf.g) this.K.get();
        Intrinsics.checkNotNullParameter(provider2, "provider");
        vc.s.k(provider2);
        return ImmutableSet.of(nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, provider, provider2, (yji.n) this.f177589p.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get(), (yji.d) this.e.get(), (yji.d) this.i.get(), (yji.d) this.k.get(), (yji.d) this.f177587m.get(), (yji.d) this.f177591r.get(), new yji.d[0]);
    }

    public final p5k.f j() {
        p5k.y yVar = new p5k.y();
        e eVar = this.f177582c;
        v2k.c cVarA = eVar.f177546l.a();
        ite.a aVar = eVar.f177545j;
        gte.a aVarB = aVar.b();
        vc.s.j(aVarB);
        gte.a aVarB2 = aVar.b();
        vc.s.j(aVarB2);
        g1i.c cVar = new g1i.c(aVarB2, 2);
        gte.a aVarB3 = aVar.b();
        vc.s.j(aVarB3);
        return new p5k.f(yVar, cVarA, aVarB, cVar, new p5k.l(aVarB3));
    }

    public final osa.f q() {
        jid.z zVarB = b();
        e eVar = this.f177582c;
        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) eVar.f177544h).c();
        vc.s.j(aVarC);
        return new osa.f(zVarB, aVarC, eVar.i.a());
    }

    public final p5k.x s() {
        p5k.y yVar = new p5k.y();
        e eVar = this.f177582c;
        k5i.c cVarA = eVar.k.a();
        p5k.f fVarJ = j();
        j9l.a aVar = new j9l.a();
        gte.a aVarB = eVar.f177545j.b();
        vc.s.j(aVarB);
        return new p5k.x(yVar, cVarA, fVarJ, new kgm.i(aVar, aVarB), new p5k.p());
    }
}
