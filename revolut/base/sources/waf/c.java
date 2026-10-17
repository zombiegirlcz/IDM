package waf;

import aa0.a0;
import aa0.b0;
import aa0.c0;
import aa0.d0;
import aa0.e0;
import aa0.f0;
import aa0.g0;
import aa0.i;
import aa0.i0;
import aa0.i1;
import aa0.j0;
import aa0.k0;
import aa0.l;
import aa0.l0;
import aa0.m;
import aa0.n;
import aa0.p;
import aa0.t;
import aa0.u;
import aa0.w;
import aa0.y;
import aa0.z;
import android.util.Size;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.backend_flow.ui.BackendFlowSnapshotsCompressor;
import com.revolut.feature.backend_flow.domain.models.ExternalValidation;
import com.revolut.feature.backend_flow.domain.models.MaxAmountValidation;
import com.revolut.feature.backend_flow.domain.models.MaxLengthValidation;
import com.revolut.feature.backend_flow.domain.models.MinAmountValidation;
import com.revolut.feature.backend_flow.domain.models.MinLengthValidation;
import com.revolut.feature.backend_flow.domain.models.RegexValidation;
import com.revolut.feature.backend_flow.domain.models.WidgetProgressionItem;
import dcl.q;
import iri.j;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import qc0.g1;
import qc0.k;
import qi3.o;
import t80.e;
import vc.s;
import wli.x;
import wpg.v;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f295903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f295904b;

    public c(d dVar, int i) {
        this.f295903a = dVar;
        this.f295904b = i;
    }

    @Override // phm.a
    public final Object get() {
        d dVar = this.f295903a;
        int i = this.f295904b;
        switch (i) {
            case 0:
                hri.b bVar = dVar.f295905a;
                return new ifm.b();
            case 1:
                hri.b bVar2 = dVar.f295905a;
                return new j();
            case 2:
                x90.c cVar = dVar.f295909c;
                k state = (k) dVar.o.get();
                Intrinsics.checkNotNullParameter(state, "state");
                s.k(state);
                return state;
            case 3:
                com.revolut.feature.chooser.e eVar = new com.revolut.feature.chooser.e();
                tc0.c cVar2 = new tc0.c();
                dVar.getClass();
                return new g1(eVar, cVar2, new onh.b(new BackendFlowSnapshotsCompressor()));
            case 4:
                x90.c cVar3 = dVar.f295909c;
                qc0.j router = (qc0.j) dVar.Z.get();
                Intrinsics.checkNotNullParameter(router, "router");
                s.k(router);
                return router;
            case 5:
                e4m.e eVar2 = dVar.W;
                l70.e eVar3 = dVar.f295907b;
                qc0.h presentationModel = (qc0.h) eVar2.get();
                q transitionsInteractor = new q(new i(), (xl2.f) dVar.L.get());
                am2.a backendFlowCountryInteractor = dVar.f295912g.a();
                k state2 = (k) dVar.o.get();
                t70.b currencyLocalization = eVar3.g();
                s.j(currencyLocalization);
                String flowName = dVar.f295913h;
                mm.d actionsDispatcher = (mm.d) dVar.X.get();
                x deeplinkHandler = ((s41.a) dVar.i).d();
                xl2.f backendFlowConfiguration = (xl2.f) dVar.L.get();
                s70.a intentProvider = eVar3.m();
                s.j(intentProvider);
                yc0.a addressFlowInputDataMapper = (yc0.a) dVar.Y.get();
                Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
                Intrinsics.checkNotNullParameter(transitionsInteractor, "transitionsInteractor");
                Intrinsics.checkNotNullParameter(backendFlowCountryInteractor, "backendFlowCountryInteractor");
                Intrinsics.checkNotNullParameter(state2, "state");
                Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
                Intrinsics.checkNotNullParameter(flowName, "flowName");
                Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
                Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
                Intrinsics.checkNotNullParameter(backendFlowConfiguration, "backendFlowConfiguration");
                Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
                Intrinsics.checkNotNullParameter(addressFlowInputDataMapper, "addressFlowInputDataMapper");
                return new vaf.a(presentationModel, transitionsInteractor, backendFlowCountryInteractor, state2, currencyLocalization, flowName, actionsDispatcher, deeplinkHandler, backendFlowConfiguration, intentProvider, addressFlowInputDataMapper);
            case 6:
                k kVar = (k) dVar.o.get();
                wl2.f fVar = (wl2.f) dVar.f295923q.get();
                ifm.b bVar3 = (ifm.b) dVar.f295918m.get();
                com.revolut.feature.chooser.a aVar = new com.revolut.feature.chooser.a((com.revolut.feature.chooser.d) dVar.f295922p.get(), (o) dVar.f295924r.get());
                yc0.k kVar2 = (yc0.k) dVar.f295926s.get();
                f0 f0Var = (f0) dVar.f295928t.get();
                w80.b bVarJ = dVar.f295907b.j();
                s.j(bVarJ);
                z zVar = new z(bVarJ);
                aa0.b bVar4 = (aa0.b) dVar.u.get();
                c0 c0Var = (c0) dVar.v.get();
                k0 k0Var = (k0) dVar.f295929w.get();
                i0 i0Var = new i0();
                b0 b0Var = (b0) dVar.z.get();
                aa0.h hVar = (aa0.h) dVar.A.get();
                n nVar = (n) dVar.B.get();
                aa0.d dVar2 = (aa0.d) dVar.C.get();
                p pVar = (p) dVar.D.get();
                l lVar = (l) dVar.E.get();
                m mVar = (m) dVar.F.get();
                a0 a0Var = (a0) dVar.G.get();
                i1 i1Var = (i1) dVar.H.get();
                l0 l0Var = (l0) dVar.I.get();
                e0 e0Var = (e0) dVar.J.get();
                j0 j0Var = (j0) dVar.K.get();
                aa0.j jVar = new aa0.j();
                t tVar = new t();
                q qVar = new q(new i(), (xl2.f) dVar.L.get());
                aa0.s sVar = new aa0.s((ad0.a) dVar.M.get(), 1);
                aa0.f fVar2 = new aa0.f();
                aa0.g gVar = new aa0.g();
                u uVar = new u();
                g0 g0Var = new g0();
                aa0.q qVar2 = new aa0.q((ad0.a) dVar.M.get());
                aa0.s sVar2 = new aa0.s((ad0.a) dVar.M.get(), 0);
                aa0.k kVar3 = new aa0.k();
                aa0.a aVar2 = new aa0.a();
                d0 d0Var = new d0();
                com.google.firebase.messaging.t tVarA = dVar.a();
                eli.j jVarA = dVar.f.a();
                ca0.a aVar3 = new ca0.a();
                bd0.d dVar3 = (bd0.d) dVar.Q.get();
                yc0.f fVar3 = (yc0.f) dVar.T.get();
                ad0.a aVar4 = (ad0.a) dVar.M.get();
                aa0.o oVar = new aa0.o();
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(6);
                builderBuilderWithExpectedSize.put(ExternalValidation.class, new ed0.d((wl2.a) dVar.U.get()));
                builderBuilderWithExpectedSize.put(MaxLengthValidation.class, new ed0.f());
                builderBuilderWithExpectedSize.put(MinLengthValidation.class, new ed0.h());
                builderBuilderWithExpectedSize.put(RegexValidation.class, new ed0.i((zzl.b) dVar.f295930x.get()));
                builderBuilderWithExpectedSize.put(MinAmountValidation.class, new ed0.g());
                builderBuilderWithExpectedSize.put(MaxAmountValidation.class, new ed0.e());
                return new qc0.j0(kVar, fVar, bVar3, aVar, kVar2, f0Var, zVar, bVar4, c0Var, k0Var, i0Var, b0Var, hVar, nVar, dVar2, pVar, lVar, mVar, a0Var, i1Var, l0Var, e0Var, j0Var, jVar, tVar, qVar, sVar, fVar2, gVar, uVar, g0Var, qVar2, sVar2, kVar3, aVar2, d0Var, tVarA, jVarA, aVar3, dVar3, fVar3, aVar4, oVar, new dd0.c(builderBuilderWithExpectedSize.build()), new cd0.d());
            case 7:
                o9f.i iVar = (o9f.i) dVar.d.C.get();
                s.j(iVar);
                return new o9f.h(iVar, dVar.e);
            case 8:
                x90.c cVar4 = dVar.f295909c;
                qi3.b modelsProvider = new qi3.b((com.revolut.feature.chooser.d) dVar.f295922p.get());
                Intrinsics.checkNotNullParameter(modelsProvider, "modelsProvider");
                return modelsProvider;
            case 9:
                x90.c cVar5 = dVar.f295909c;
                l80.e eVarH = dVar.f295907b.h();
                s.j(eVarH);
                return v.l(cVar5, eVarH);
            case 10:
                x90.c cVar6 = dVar.f295909c;
                return new f0();
            case 11:
                x90.c cVar7 = dVar.f295909c;
                return new aa0.b();
            case 12:
                x90.c cVar8 = dVar.f295909c;
                return new c0();
            case 13:
                x90.c cVar9 = dVar.f295909c;
                return new k0();
            case 14:
                x90.c cVar10 = dVar.f295909c;
                z80.b bVarS = dVar.f295907b.s();
                s.j(bVarS);
                return v.g(cVar10, bVarS, (y) dVar.f295931y.get());
            case 15:
                return v.i(dVar.f295909c, (zzl.b) dVar.f295930x.get());
            case 16:
                h.Companion.getClass();
                return new zzl.c();
            case 17:
                x90.c cVar11 = dVar.f295909c;
                return new aa0.h();
            case 18:
                x90.c cVar12 = dVar.f295909c;
                return new n();
            case 19:
                return v.h(dVar.f295909c, (y) dVar.f295931y.get());
            case 20:
                x90.c cVar13 = dVar.f295909c;
                return new p();
            case 21:
                x90.c cVar14 = dVar.f295909c;
                return new l();
            case 22:
                x90.c cVar15 = dVar.f295909c;
                return new m();
            case 23:
                x90.c cVar16 = dVar.f295909c;
                return new a0();
            case 24:
                x90.c cVar17 = dVar.f295909c;
                return new i1();
            case 25:
                x90.c cVar18 = dVar.f295909c;
                return new l0();
            case 26:
                x90.c cVar19 = dVar.f295909c;
                return new e0();
            case 27:
                x90.c cVar20 = dVar.f295909c;
                return new j0();
            case 28:
                h.Companion.getClass();
                return new xl2.f(true, zhm.f0.f322471a, false, new Size(720, 1280));
            case 29:
                x90.c cVar21 = dVar.f295909c;
                return new ad0.b();
            case 30:
                return new cn.e();
            case 31:
                return new ym.d();
            case 32:
                return new um.c();
            case 33:
                x90.c cVar22 = dVar.f295909c;
                return new bd0.e();
            case 34:
                return v.s(dVar.f295909c, (yc0.b0) dVar.S.get());
            case 35:
                return v.u(dVar.f295909c, (k) dVar.o.get(), new smd.s((la0.c) dVar.R.get()));
            case 36:
                return v.e(dVar.f295909c, (k) dVar.o.get());
            case 37:
                x90.c cVar23 = dVar.f295909c;
                w legacyBackendFlowAdapterInteractor = new w((wl2.f) dVar.f295923q.get(), dVar.f295912g.b());
                Intrinsics.checkNotNullParameter(legacyBackendFlowAdapterInteractor, "legacyBackendFlowAdapterInteractor");
                return legacyBackendFlowAdapterInteractor;
            case 38:
                return new mm.d();
            case 39:
                return v.c(dVar.f295909c, (yc0.b0) dVar.S.get());
            case 40:
                x90.c cVar24 = dVar.f295909c;
                qc0.h state3 = (qc0.h) dVar.W.get();
                Intrinsics.checkNotNullParameter(state3, "state");
                s.k(state3);
                return state3;
            case 41:
                dVar.getClass();
                return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
            case 42:
                return new ln.c();
            case 43:
                return new vc0.a((qc0.j) dVar.Z.get(), (k) dVar.o.get(), (ln.a) dVar.f295910d0.get(), (xl2.f) dVar.L.get(), (mm.d) dVar.X.get(), dVar.a());
            case 44:
                return new vc0.b((ln.a) dVar.f295910d0.get());
            case 45:
                return new vc0.c((k) dVar.o.get(), (qc0.j) dVar.Z.get(), (wl2.f) dVar.f295923q.get(), dVar.f.a(), new ca0.a(), dVar.a());
            case 46:
                x90.c cVar25 = dVar.f295909c;
                qc0.j router2 = (qc0.j) dVar.Z.get();
                Intrinsics.checkNotNullParameter(router2, "router");
                s.k(router2);
                return router2;
            case 47:
                return new sm.e();
            case 48:
                return new om.c();
            case 49:
                return new g3l.g();
            case 50:
                return new an.a();
            case 51:
                return new d4l.a();
            case 52:
                x90.c cVar26 = dVar.f295909c;
                qc0.h state4 = (qc0.h) dVar.W.get();
                Intrinsics.checkNotNullParameter(state4, "state");
                s.k(state4);
                return state4;
            case 53:
                h.Companion.getClass();
                return new t80.c(new e.a("TransferOut"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
            case 54:
                return v.d(dVar.f295909c, (k) dVar.o.get(), (la0.c) dVar.R.get(), ImmutableMap.of(WidgetProgressionItem.class, new z90.b()));
            case 55:
                return v.t(dVar.f295909c, (bd0.d) dVar.Q.get());
            case 56:
                x90.c cVar27 = dVar.f295909c;
                z70.a aVarF = dVar.f295907b.f();
                s.j(aVarF);
                return v.p(cVar27, aVarF);
            case 57:
                x90.c cVar28 = dVar.f295909c;
                return new yc0.w();
            default:
                throw new AssertionError(i);
        }
    }
}
