package fa0;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.backend_flow.domain.endpoint.BackendFlowApiEndpoints;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.ExternalValidation;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.MaxAmountValidation;
import com.revolut.feature.backend_flow.domain.models.MaxLengthValidation;
import com.revolut.feature.backend_flow.domain.models.MinAmountValidation;
import com.revolut.feature.backend_flow.domain.models.MinLengthValidation;
import com.revolut.feature.backend_flow.domain.models.RegexValidation;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lb0.e0;
import lb0.l0;
import lb0.p0;
import lb0.r0;
import yc0.c0;

/* JADX INFO: loaded from: classes19.dex */
public final class r implements nb0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f133131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FormScreen f133132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f133133c;
    public final j d;
    public final e4m.c e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f133134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f133135h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f133136j;
    public final q k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f133137l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q f133138m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f133139n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f133140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f133141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f133142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f133143s;

    public r(k kVar, j jVar, ViewController viewController, FormScreen formScreen) {
        this.f133133c = kVar;
        this.d = jVar;
        this.f133131a = viewController;
        this.f133132b = formScreen;
        e4m.c cVarA = e4m.c.a(viewController);
        this.e = cVarA;
        this.f = e4m.b.b(cVarA);
        int i = 0;
        this.f133134g = e4m.b.b(new q(kVar, this, 2, i));
        this.f133135h = e4m.b.b(new q(kVar, this, 1, i));
        this.i = e4m.b.b(new q(kVar, this, 0, i));
        this.f133136j = e4m.b.b(new q(kVar, this, 5, i));
        this.k = new q(kVar, this, 6, i);
        this.f133137l = e4m.b.b(new q(kVar, this, 7, i));
        this.f133138m = new q(kVar, this, 8, i);
        this.f133139n = e4m.b.b(new q(kVar, this, 9, i));
        this.o = e4m.b.b(this.e);
        this.f133140p = e4m.b.b(new q(kVar, this, 10, i));
        this.f133141q = e4m.b.b(new q(kVar, this, 4, i));
        this.f133142r = e4m.b.b(new q(kVar, this, 3, i));
        this.f133143s = e4m.b.b(new q(kVar, this, 11, i));
    }

    @Override // ta0.a
    public final qa0.a F() {
        return (qa0.a) this.d.f133086o0.get();
    }

    @Override // ta0.a
    public final j60.a P() {
        return (j60.a) this.f133135h.get();
    }

    public final u96.b b() {
        l70.e eVar = this.f133133c.f133103c;
        z70.a aVarF = eVar.f();
        vc.s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        vc.s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    public final nli.e c() {
        l70.e eVar = this.f133133c.f133103c;
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        t80.c cVar = (t80.c) this.f133137l.get();
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f133143s.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.i.get(), (yji.d) this.f133142r.get());
    }

    @Override // nb0.a
    public final qd0.b i() {
        qd0.b bVarN = this.f133133c.f133103c.n();
        vc.s.j(bVarN);
        return bVarN;
    }

    @Override // ta0.a
    public final yc0.g m() {
        return (yc0.g) this.d.f133100y.get();
    }

    @Override // nb0.a
    public final com.revolut.core.backend_flow.impl.ui.form_screen.a n() {
        j jVar = this.d;
        BackendFlow backendFlow = jVar.f133070a;
        k kVar = this.f133133c;
        vl2.a aVar = kVar.f133102b;
        ul2.c cVar = (ul2.c) aVar.d.get();
        vc.s.j(cVar);
        jx0.a aVar2 = new jx0.a(backendFlow, cVar);
        l70.e eVar = kVar.f133103c;
        w80.b bVarJ = eVar.j();
        vc.s.j(bVarJ);
        t70.g gVarO = eVar.o();
        vc.s.j(gVarO);
        nb0.c.Companion.getClass();
        ViewController viewController = this.f133131a;
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        zc0.c cVar2 = new zc0.c(bVarJ, gVarO, new p80.a(viewController.m2()), (aa0.y) jVar.i0.get(), jVar.j(), jVar.c(), new yc0.o((yc0.g) jVar.f133100y.get()), (ad0.p) jVar.E.get(), (ad0.c) jVar.B.get(), new ad0.t(jVar.b(), new yc0.p()), new ad0.s(jVar.b(), new yc0.p()), new ad0.g(jVar.b()), new ad0.v(jVar.q()), new ad0.o(), jVar.q(), new yc0.p(), (yc0.y) jVar.l0.get(), (bd0.a) jVar.u0.get(), (yc0.v) jVar.f133092s0.get(), (c0) jVar.f133094t0.get());
        p0 p0Var = (p0) jVar.m0.get();
        l80.e eVarH = eVar.h();
        vc.s.j(eVarH);
        r0 r0Var = new r0(cVar2, p0Var, new yc0.m(eVarH), (bd0.a) jVar.u0.get(), (c0) jVar.f133094t0.get(), (yc0.v) jVar.f133092s0.get(), (l0) jVar.f133090r0.get(), (ad0.a) jVar.z.get());
        com.revolut.core.backend_flow.impl.ui.form_screen.b bVar = new com.revolut.core.backend_flow.impl.ui.form_screen.b(jVar.f133070a, new g5k.e(jVar.g0), jVar.f133095v0, jVar.f133097w0, jVar.f133099x0);
        e60.a aVar3 = (e60.a) this.f133141q.get();
        ob0.a aVar4 = (ob0.a) jVar.j0.get();
        ua0.a aVar5 = (ua0.a) jVar.P.get();
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(6);
        BackendFlow backendFlow2 = jVar.f133070a;
        p90.a aVar6 = (p90.a) aVar.f290174c.get();
        vc.s.j(aVar6);
        BackendFlowApiEndpoints backendFlowApiEndpoints = jVar.e;
        gte.a aVarB = kVar.i.b();
        vc.s.j(aVarB);
        builderBuilderWithExpectedSize.put(ExternalValidation.class, new ed0.d(new e0(backendFlow2, aVar6, backendFlowApiEndpoints, aVarB)));
        builderBuilderWithExpectedSize.put(MaxLengthValidation.class, new ed0.f());
        builderBuilderWithExpectedSize.put(MinLengthValidation.class, new ed0.h());
        builderBuilderWithExpectedSize.put(RegexValidation.class, new ed0.i((zzl.b) jVar.f133079h0.get()));
        builderBuilderWithExpectedSize.put(MinAmountValidation.class, new ed0.g());
        builderBuilderWithExpectedSize.put(MaxAmountValidation.class, new ed0.e());
        dd0.c cVar3 = new dd0.c(builderBuilderWithExpectedSize.build());
        cd0.d dVar = new cd0.d();
        ul2.c cVar4 = (ul2.c) aVar.d.get();
        vc.s.j(cVar4);
        ob0.i iVar = new ob0.i(cVar4);
        j60.a aVar7 = (j60.a) this.f133135h.get();
        qa0.b bVar2 = (qa0.b) jVar.u.get();
        c70.a aVarZ = eVar.z();
        vc.s.j(aVarZ);
        return new com.revolut.core.backend_flow.impl.ui.form_screen.a(aVar2, r0Var, bVar, aVar3, aVar4, aVar5, cVar3, dVar, iVar, aVar7, bVar2, aVarZ, this.f133132b);
    }
}
