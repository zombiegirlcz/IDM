package i0l;

import ad0.n;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.trading_onboarding.impl.actions.OnboardingActionsContract$LaunchRemediationNextPartAction;
import com.revolut.retail.feature.trading_onboarding.impl.actions.OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration;
import h30.l;
import hqi.i;
import java.util.Set;
import tsk.t;
import vc.s;
import zc0.q;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements gsi.h, q {
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
    public final hjg.b L;
    public final hjg.b M;
    public final e4m.e N;
    public final e4m.e O;
    public final e4m.e P;
    public final e4m.e Q;
    public final e4m.e R;
    public final e4m.e S;
    public final e4m.e T;
    public final e4m.e U;
    public final e4m.e V;
    public final e4m.e W;
    public final e4m.e X;
    public final e4m.e Y;
    public final e4m.e Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoi.d f157440a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final e4m.e f157441a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ypi.h f157442b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final e4m.e f157443b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f157444c;
    public final iqi.g d;
    public final TradingOnboardingBackendFlowContract$Configuration e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f157445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f157446h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f157447j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f157448l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f157449m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f157450n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f157451p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f157452q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f157453r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f157454s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f157455t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f157456w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f157457x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f157458y;
    public final e4m.e z;

    public c(d dVar, xoi.d dVar2, ypi.h hVar, i iVar, iqi.g gVar, TradingOnboardingBackendFlowContract$Configuration tradingOnboardingBackendFlowContract$Configuration) {
        xpi.e eVar = xpi.f.Companion;
        this.f = dVar;
        this.f157440a = dVar2;
        this.f157442b = hVar;
        this.f157444c = iVar;
        this.d = gVar;
        this.e = tradingOnboardingBackendFlowContract$Configuration;
        int i = 19;
        this.f157445g = e4m.b.b(new hjg.b(dVar, this, 0, i));
        this.f157446h = l.o(dVar, this, 2);
        this.i = e4m.b.b(new hjg.b(dVar, this, 1, i));
        this.f157447j = e4m.b.b(new hjg.b(dVar, this, 4, i));
        this.k = l.o(dVar, this, 6);
        this.f157448l = l.o(dVar, this, 5);
        this.f157449m = e4m.b.b(new hjg.b(dVar, this, 3, i));
        this.f157450n = l.o(dVar, this, 8);
        this.o = e4m.b.b(new hjg.b(dVar, this, 7, i));
        this.f157451p = e4m.b.b(new hjg.b(dVar, this, 9, i));
        this.f157452q = l.o(dVar, this, 11);
        this.f157453r = e4m.b.b(new hjg.b(dVar, this, 10, i));
        this.f157454s = e4m.b.b(new hjg.b(dVar, this, 12, i));
        this.f157455t = l.o(dVar, this, 14);
        this.u = e4m.b.b(new hjg.b(dVar, this, 13, i));
        this.v = l.o(dVar, this, 15);
        this.f157456w = l.o(dVar, this, 16);
        this.f157457x = l.o(dVar, this, 17);
        this.f157458y = e4m.b.b(new hjg.b(dVar, this, 18, i));
        this.z = l.o(dVar, this, 20);
        this.A = e4m.b.b(new hjg.b(dVar, this, i, i));
        this.B = l.o(dVar, this, 22);
        this.C = e4m.b.b(new hjg.b(dVar, this, 21, i));
        this.D = l.o(dVar, this, 23);
        this.E = l.o(dVar, this, 25);
        this.F = l.o(dVar, this, 24);
        this.G = e4m.b.b(new hjg.b(dVar, this, 26, i));
        this.H = l.o(dVar, this, 27);
        this.I = l.o(dVar, this, 28);
        this.J = e4m.b.b(new hjg.b(dVar, this, 30, i));
        this.K = e4m.b.b(new hjg.b(dVar, this, 31, i));
        this.L = new hjg.b(dVar, this, 32, i);
        this.M = new hjg.b(dVar, this, 33, i);
        this.N = l.o(dVar, this, 29);
        this.O = l.o(dVar, this, 34);
        this.P = l.o(dVar, this, 36);
        this.Q = e4m.b.b(new hjg.b(dVar, this, 35, i));
        this.R = e4m.b.b(dVar.f157460a0);
        this.S = l.o(dVar, this, 38);
        this.T = e4m.g.a(new hjg.b(dVar, this, 40, i));
        this.U = e4m.g.a(new hjg.b(dVar, this, 41, i));
        this.V = e4m.g.a(new hjg.b(dVar, this, 42, i));
        this.W = e4m.g.a(new hjg.b(dVar, this, 43, i));
        this.X = e4m.g.a(new hjg.b(dVar, this, 39, i));
        this.Y = e4m.g.a(new hjg.b(dVar, this, 44, i));
        this.Z = l.o(dVar, this, 46);
        this.f157441a0 = e4m.b.b(new hjg.b(dVar, this, 45, i));
        this.f157443b0 = e4m.b.b(new hjg.b(dVar, this, 37, i));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return bq.i.j(this.f157440a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return bq.i.p(this.f157440a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f157440a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f157440a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f157440a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return bq.i.n(this.f157440a);
    }

    @Override // gsi.h
    public final fsi.g a() {
        return this.f157440a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f157440a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return bq.i.g(this.f157440a);
    }

    @Override // zc0.q
    public final opi.b c() {
        return (opi.b) this.H.get();
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f157440a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f157440a);
    }

    public final yc0.e e() {
        return new yc0.e(new t(bq.i.o(this.f157440a)));
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f157440a);
    }

    public final n f() {
        yc0.e eVarE = e();
        hbl.d dVarC = this.f.f157472m.c();
        s.j(dVarC);
        return new n(eVarE, dVarC);
    }

    public final nli.a g() {
        return new nli.a((t80.c) this.f.f157481s0.get(), bq.i.b(this.f157440a));
    }

    public final nli.e h() {
        d dVar = this.f;
        l70.e eVar = dVar.f157461b;
        zk0.b bVarL = eVar.l();
        s.j(bVarL);
        t80.c cVar = (t80.c) dVar.f157481s0.get();
        f80.a aVarX = eVar.x();
        s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }

    @Override // zc0.q
    public final qd0.b i() {
        qd0.b bVarN = this.f.f157461b.n();
        s.j(bVarN);
        return bVarN;
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(28);
        builderBuilderWithExpectedSize.addAll((Iterable) bq.i.k(this.f157440a));
        builderBuilderWithExpectedSize.add(this.f157445g.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.f157449m.get());
        d dVar = this.f;
        mm.d dVar2 = (mm.d) dVar.c0.get();
        ImmutableMap.Builder builderBuilderWithExpectedSize2 = ImmutableMap.builderWithExpectedSize(6);
        builderBuilderWithExpectedSize2.put(mm.e.class, new mm.f());
        builderBuilderWithExpectedSize2.put(qc0.c.class, dVar.f157468h0.get());
        builderBuilderWithExpectedSize2.put(qc0.d.class, dVar.i0.get());
        builderBuilderWithExpectedSize2.put(qc0.f.class, dVar.j0.get());
        builderBuilderWithExpectedSize2.put(OnboardingActionsContract$LaunchRemediationNextPartAction.class, dVar.f157470k0.get());
        builderBuilderWithExpectedSize2.put(OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction.class, dVar.l0.get());
        builderBuilderWithExpectedSize.add(new en.c(dVar2, builderBuilderWithExpectedSize2.build()));
        builderBuilderWithExpectedSize.add(this.o.get());
        builderBuilderWithExpectedSize.add(this.f157451p.get());
        builderBuilderWithExpectedSize.add(this.f157453r.get());
        builderBuilderWithExpectedSize.add(this.f157454s.get());
        builderBuilderWithExpectedSize.add(this.u.get());
        builderBuilderWithExpectedSize.add(this.f157455t.get());
        builderBuilderWithExpectedSize.add(this.v.get());
        builderBuilderWithExpectedSize.add(this.f157456w.get());
        builderBuilderWithExpectedSize.add(this.f157448l.get());
        builderBuilderWithExpectedSize.add(this.f157457x.get());
        builderBuilderWithExpectedSize.add(this.f157458y.get());
        builderBuilderWithExpectedSize.add(this.A.get());
        builderBuilderWithExpectedSize.add(this.C.get());
        builderBuilderWithExpectedSize.add(this.B.get());
        builderBuilderWithExpectedSize.add(this.D.get());
        builderBuilderWithExpectedSize.add(this.F.get());
        builderBuilderWithExpectedSize.add(this.E.get());
        builderBuilderWithExpectedSize.add(this.G.get());
        builderBuilderWithExpectedSize.add(this.H.get());
        builderBuilderWithExpectedSize.add(this.I.get());
        builderBuilderWithExpectedSize.add(this.N.get());
        builderBuilderWithExpectedSize.add(this.f157450n.get());
        return j6.a.g(this.O, builderBuilderWithExpectedSize);
    }

    @Override // zc0.q
    public final yc0.g m() {
        return (yc0.g) this.f.f157483t0.get();
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f157440a);
    }
}
