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
public final class s implements nb0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f133144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FormScreen f133145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f133146c;
    public final h d;
    public final e4m.c e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f133147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f133148h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f133149j;
    public final q k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f133150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q f133151m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f133152n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f133153p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f133154q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f133155r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f133156s;

    public s(k kVar, h hVar, ViewController viewController, FormScreen formScreen) {
        this.f133146c = kVar;
        this.d = hVar;
        this.f133144a = viewController;
        this.f133145b = formScreen;
        e4m.c cVarA = e4m.c.a(viewController);
        this.e = cVarA;
        this.f = e4m.b.b(cVarA);
        int i = 1;
        this.f133147g = e4m.b.b(new q(kVar, this, 2, i));
        this.f133148h = e4m.b.b(new q(kVar, this, 1, i));
        this.i = e4m.b.b(new q(kVar, this, 0, i));
        this.f133149j = e4m.b.b(new q(kVar, this, 5, i));
        this.k = new q(kVar, this, 6, i);
        this.f133150l = e4m.b.b(new q(kVar, this, 7, i));
        this.f133151m = new q(kVar, this, 8, i);
        this.f133152n = e4m.b.b(new q(kVar, this, 9, i));
        this.o = e4m.b.b(this.e);
        this.f133153p = e4m.b.b(new q(kVar, this, 10, i));
        this.f133154q = e4m.b.b(new q(kVar, this, 4, i));
        this.f133155r = e4m.b.b(new q(kVar, this, 3, i));
        this.f133156s = e4m.b.b(new q(kVar, this, 11, i));
    }

    @Override // ta0.a
    public final qa0.a F() {
        return (qa0.a) this.d.f133052o0.get();
    }

    @Override // ta0.a
    public final j60.a P() {
        return (j60.a) this.f133148h.get();
    }

    public final u96.b b() {
        l70.e eVar = this.f133146c.f133103c;
        z70.a aVarF = eVar.f();
        vc.s.j(aVarF);
        c70.b bVar = new c70.b(aVarF, 2);
        z70.a aVarF2 = eVar.f();
        vc.s.j(aVarF2);
        return new u96.b(bVar, new smd.s(aVarF2));
    }

    public final nli.e c() {
        l70.e eVar = this.f133146c.f133103c;
        zk0.b bVarL = eVar.l();
        vc.s.j(bVarL);
        t80.c cVar = (t80.c) this.f133150l.get();
        f80.a aVarX = eVar.x();
        vc.s.j(aVarX);
        return new nli.e(bVarL, cVar, aVarX);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f133156s.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.i.get(), (yji.d) this.f133155r.get());
    }

    @Override // nb0.a
    public final qd0.b i() {
        qd0.b bVarN = this.f133146c.f133103c.n();
        vc.s.j(bVarN);
        return bVarN;
    }

    @Override // ta0.a
    public final yc0.g m() {
        return (yc0.g) this.d.f133066y.get();
    }

    @Override // nb0.a
    public final com.revolut.core.backend_flow.impl.ui.form_screen.a n() {
        h hVar = this.d;
        BackendFlow backendFlow = hVar.f133036a;
        k kVar = this.f133146c;
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
        ViewController viewController = this.f133144a;
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        zc0.c cVar2 = new zc0.c(bVarJ, gVarO, new p80.a(viewController.m2()), (aa0.y) hVar.i0.get(), hVar.j(), hVar.c(), new yc0.o((yc0.g) hVar.f133066y.get()), (ad0.p) hVar.E.get(), (ad0.c) hVar.B.get(), new ad0.t(hVar.b(), new yc0.p()), new ad0.s(hVar.b(), new yc0.p()), new ad0.g(hVar.b()), new ad0.v(hVar.q()), new ad0.o(), hVar.q(), new yc0.p(), (yc0.y) hVar.l0.get(), (bd0.a) hVar.u0.get(), (yc0.v) hVar.f133058s0.get(), (c0) hVar.f133060t0.get());
        p0 p0Var = (p0) hVar.m0.get();
        l80.e eVarH = eVar.h();
        vc.s.j(eVarH);
        r0 r0Var = new r0(cVar2, p0Var, new yc0.m(eVarH), (bd0.a) hVar.u0.get(), (c0) hVar.f133060t0.get(), (yc0.v) hVar.f133058s0.get(), (l0) hVar.f133056r0.get(), (ad0.a) hVar.z.get());
        com.revolut.core.backend_flow.impl.ui.form_screen.b bVar = new com.revolut.core.backend_flow.impl.ui.form_screen.b(hVar.f133036a, new g5k.e(hVar.g0), hVar.f133061v0, hVar.f133063w0, hVar.f133065x0);
        e60.a aVar3 = (e60.a) this.f133154q.get();
        ob0.a aVar4 = (ob0.a) hVar.j0.get();
        ua0.a aVar5 = (ua0.a) hVar.P.get();
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(6);
        BackendFlow backendFlow2 = hVar.f133036a;
        p90.a aVar6 = (p90.a) aVar.f290174c.get();
        vc.s.j(aVar6);
        BackendFlowApiEndpoints backendFlowApiEndpoints = hVar.e;
        gte.a aVarB = kVar.i.b();
        vc.s.j(aVarB);
        builderBuilderWithExpectedSize.put(ExternalValidation.class, new ed0.d(new e0(backendFlow2, aVar6, backendFlowApiEndpoints, aVarB)));
        builderBuilderWithExpectedSize.put(MaxLengthValidation.class, new ed0.f());
        builderBuilderWithExpectedSize.put(MinLengthValidation.class, new ed0.h());
        builderBuilderWithExpectedSize.put(RegexValidation.class, new ed0.i((zzl.b) hVar.f133045h0.get()));
        builderBuilderWithExpectedSize.put(MinAmountValidation.class, new ed0.g());
        builderBuilderWithExpectedSize.put(MaxAmountValidation.class, new ed0.e());
        dd0.c cVar3 = new dd0.c(builderBuilderWithExpectedSize.build());
        cd0.d dVar = new cd0.d();
        ul2.c cVar4 = (ul2.c) aVar.d.get();
        vc.s.j(cVar4);
        ob0.i iVar = new ob0.i(cVar4);
        j60.a aVar7 = (j60.a) this.f133148h.get();
        qa0.b bVar2 = (qa0.b) hVar.u.get();
        c70.a aVarZ = eVar.z();
        vc.s.j(aVarZ);
        return new com.revolut.core.backend_flow.impl.ui.form_screen.a(aVar2, r0Var, bVar, aVar3, aVar4, aVar5, cVar3, dVar, iVar, aVar7, bVar2, aVarZ, this.f133145b);
    }
}
