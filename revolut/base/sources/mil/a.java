package mil;

import aa0.a0;
import aa0.b0;
import aa0.c0;
import aa0.d0;
import aa0.e0;
import aa0.f0;
import aa0.g;
import aa0.g0;
import aa0.i;
import aa0.i0;
import aa0.i1;
import aa0.j0;
import aa0.k0;
import aa0.l;
import aa0.l0;
import aa0.m;
import aa0.p;
import aa0.t;
import aa0.w;
import aa0.y;
import aa0.z;
import android.content.Context;
import android.view.View;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.backend_flow.ui.BackendFlowSnapshotsCompressor;
import com.revolut.feature.apm.bizum.impl.data.network.BizumService;
import com.revolut.feature.apm.core.impl.crypto.ApmKeyGenerator;
import com.revolut.feature.backend_flow.domain.models.ExternalValidation;
import com.revolut.feature.backend_flow.domain.models.MaxAmountValidation;
import com.revolut.feature.backend_flow.domain.models.MaxLengthValidation;
import com.revolut.feature.backend_flow.domain.models.MinAmountValidation;
import com.revolut.feature.backend_flow.domain.models.MinLengthValidation;
import com.revolut.feature.backend_flow.domain.models.RegexValidation;
import com.revolut.feature.backend_flow.domain.models.WidgetProgressionItem;
import com.revolut.feature.cryptocommodity_invest.api.navigation.CryptoSortingPickerInputData;
import com.revolut.feature.payments.air.widget.impl.data.network.PaymentWidgetService;
import com.revolut.feature.payments.transfers.personalisation.impl.data.service.TransfersPersonalisationService;
import com.revolut.feature.wealth.ui.api.navigation.DisclosuresDestination;
import com.revolut.feature.wealth.ui.impl.disclosures.DisclosuresControllerContract$Input;
import com.revolut.shared.feature.wealth_orders.domain.impl.data.GsonHolder;
import com.revolut.shared.feature.wealth_orders.domain.impl.data.network.TradingProjectionsService;
import dcl.q;
import dw3.c1;
import e4m.e;
import hn.f;
import hn.h;
import iri.j;
import java.time.Clock;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p54.n;
import qc0.g1;
import qc0.k;
import qi3.o;
import qw7.u;
import r54.d;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import rp0.x0;
import skm.p0;
import ulm.a1;
import ulm.b1;
import um.c;
import vc.s;
import wli.x;
import wpg.v;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f205881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f205882c;

    public /* synthetic */ a(Object obj2, int i, int i2) {
        this.f205880a = i2;
        this.f205882c = obj2;
        this.f205881b = i;
    }

    private final Object a() {
        na4.e eVar = (na4.e) this.f205882c;
        int i = this.f205881b;
        switch (i) {
            case 0:
                hri.b bVar = eVar.f213748a;
                return new ifm.b();
            case 1:
                hri.b bVar2 = eVar.f213748a;
                return new j();
            case 2:
                return new cn.e();
            case 3:
                return new c();
            case 4:
                eVar.getClass();
                return new h(ImmutableSet.copyOf((Collection) f.a()));
            case 5:
                return new ln.c();
            case 6:
                eVar.getClass();
                return new n(new g1(new com.revolut.feature.chooser.e(), new tc0.c(), new onh.b(new BackendFlowSnapshotsCompressor())), new c84.f());
            case 7:
                dw3.e eVar2 = eVar.f213752c;
                l70.e eVar3 = eVar.f213750b;
                d dVar = eVar.f;
                ow3.e eVar4 = (ow3.e) ((c1) eVar2).Y0.get();
                s.j(eVar4);
                ln.a aVar = (ln.a) eVar.f213771t.get();
                qc0.h hVar = (qc0.h) eVar.Y.get();
                q qVar = new q(new i(), u.i(dVar));
                p54.e eVar5 = (p54.e) eVar.u.get();
                am2.a aVarA = eVar.f213756h.a();
                t70.b bVarG = eVar3.g();
                s.j(bVarG);
                xl2.f fVarI = u.i(dVar);
                mm.d dVar2 = (mm.d) eVar.Z.get();
                x xVarD = ((s41.a) eVar.i).d();
                s70.a aVarM = eVar3.m();
                s.j(aVarM);
                return new ma4.b(eVar4, aVar, hVar, qVar, eVar5, aVarA, bVarG, fVarI, dVar2, xVarD, aVarM, (yc0.a) eVar.f213749a0.get());
            case 8:
                k kVar = (k) eVar.u.get();
                wl2.f fVar = (wl2.f) eVar.v.get();
                ifm.b bVar3 = (ifm.b) eVar.o.get();
                com.revolut.feature.chooser.a aVar2 = new com.revolut.feature.chooser.a((com.revolut.feature.chooser.d) eVar.f213774w.get(), (o) eVar.f213776x.get());
                yc0.k kVar2 = (yc0.k) eVar.f213778y.get();
                f0 f0Var = (f0) eVar.z.get();
                w80.b bVarJ = eVar.f213750b.j();
                s.j(bVarJ);
                z zVar = new z(bVarJ);
                aa0.b bVar4 = (aa0.b) eVar.A.get();
                c0 c0Var = (c0) eVar.B.get();
                k0 k0Var = (k0) eVar.C.get();
                i0 i0Var = new i0();
                b0 b0Var = (b0) eVar.F.get();
                aa0.h hVar2 = (aa0.h) eVar.G.get();
                aa0.n nVar = (aa0.n) eVar.H.get();
                aa0.d dVar3 = (aa0.d) eVar.I.get();
                p pVar = (p) eVar.J.get();
                l lVar = (l) eVar.K.get();
                m mVar = (m) eVar.L.get();
                a0 a0Var = (a0) eVar.M.get();
                i1 i1Var = (i1) eVar.N.get();
                l0 l0Var = (l0) eVar.O.get();
                e0 e0Var = (e0) eVar.P.get();
                j0 j0Var = (j0) eVar.Q.get();
                aa0.j jVar = new aa0.j();
                t tVar = new t();
                q qVar2 = new q(new i(), u.i(eVar.f));
                aa0.s sVar = new aa0.s((ad0.a) eVar.R.get(), 1);
                aa0.f fVar2 = new aa0.f();
                g gVar = new g();
                aa0.u uVar = new aa0.u();
                g0 g0Var = new g0();
                aa0.q qVar3 = new aa0.q((ad0.a) eVar.R.get());
                aa0.s sVar2 = new aa0.s((ad0.a) eVar.R.get(), 0);
                aa0.k kVar3 = new aa0.k();
                aa0.a aVar3 = new aa0.a();
                d0 d0Var = new d0();
                com.google.firebase.messaging.t tVarH = eVar.h();
                eli.j jVarA = eVar.f213755g.a();
                ca0.a aVar4 = new ca0.a();
                bd0.d dVar4 = (bd0.d) eVar.T.get();
                yc0.f fVar3 = (yc0.f) eVar.W.get();
                ad0.a aVar5 = (ad0.a) eVar.R.get();
                aa0.o oVar = new aa0.o();
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(6);
                builderBuilderWithExpectedSize.put(ExternalValidation.class, new ed0.d((wl2.a) eVar.X.get()));
                builderBuilderWithExpectedSize.put(MaxLengthValidation.class, new ed0.f());
                builderBuilderWithExpectedSize.put(MinLengthValidation.class, new ed0.h());
                builderBuilderWithExpectedSize.put(RegexValidation.class, new ed0.i((zzl.b) eVar.D.get()));
                builderBuilderWithExpectedSize.put(MinAmountValidation.class, new ed0.g());
                builderBuilderWithExpectedSize.put(MaxAmountValidation.class, new ed0.e());
                return new qc0.j0(kVar, fVar, bVar3, aVar2, kVar2, f0Var, zVar, bVar4, c0Var, k0Var, i0Var, b0Var, hVar2, nVar, dVar3, pVar, lVar, mVar, a0Var, i1Var, l0Var, e0Var, j0Var, jVar, tVar, qVar2, sVar, fVar2, gVar, uVar, g0Var, qVar3, sVar2, kVar3, aVar3, d0Var, tVarH, jVarA, aVar4, dVar4, fVar3, aVar5, oVar, new dd0.c(builderBuilderWithExpectedSize.build()), new cd0.d());
            case 9:
                b80.c cVarP = eVar.f213750b.p();
                s.j(cVarP);
                ow3.e eVar6 = (ow3.e) ((c1) eVar.f213752c).Y0.get();
                s.j(eVar6);
                return new cx3.a(cVarP, eVar6, (qv3.a) eVar.u.get());
            case 10:
                x90.c cVar = eVar.d;
                k state = (k) eVar.u.get();
                Intrinsics.checkNotNullParameter(state, "state");
                s.k(state);
                return state;
            case 11:
                x90.c cVar2 = eVar.d;
                qi3.b modelsProvider = new qi3.b((com.revolut.feature.chooser.d) eVar.f213774w.get());
                Intrinsics.checkNotNullParameter(modelsProvider, "modelsProvider");
                return modelsProvider;
            case 12:
                x90.c cVar3 = eVar.d;
                l80.e eVarH = eVar.f213750b.h();
                s.j(eVarH);
                return v.l(cVar3, eVarH);
            case 13:
                x90.c cVar4 = eVar.d;
                return new f0();
            case 14:
                x90.c cVar5 = eVar.d;
                return new aa0.b();
            case 15:
                x90.c cVar6 = eVar.d;
                return new c0();
            case 16:
                x90.c cVar7 = eVar.d;
                return new k0();
            case 17:
                x90.c cVar8 = eVar.d;
                z80.b bVarS = eVar.f213750b.s();
                s.j(bVarS);
                return v.g(cVar8, bVarS, (y) eVar.E.get());
            case 18:
                return v.i(eVar.d, (zzl.b) eVar.D.get());
            case 19:
                r54.e eVar7 = eVar.e;
                return new zzl.c();
            case 20:
                x90.c cVar9 = eVar.d;
                return new aa0.h();
            case 21:
                x90.c cVar10 = eVar.d;
                return new aa0.n();
            case 22:
                return v.h(eVar.d, (y) eVar.E.get());
            case 23:
                x90.c cVar11 = eVar.d;
                return new p();
            case 24:
                x90.c cVar12 = eVar.d;
                return new l();
            case 25:
                x90.c cVar13 = eVar.d;
                return new m();
            case 26:
                x90.c cVar14 = eVar.d;
                return new a0();
            case 27:
                x90.c cVar15 = eVar.d;
                return new i1();
            case 28:
                x90.c cVar16 = eVar.d;
                return new l0();
            case 29:
                x90.c cVar17 = eVar.d;
                return new e0();
            case 30:
                x90.c cVar18 = eVar.d;
                return new j0();
            case 31:
                x90.c cVar19 = eVar.d;
                return new ad0.b();
            case 32:
                return new ym.d();
            case 33:
                x90.c cVar20 = eVar.d;
                return new bd0.e();
            case 34:
                return v.s(eVar.d, (yc0.b0) eVar.V.get());
            case 35:
                return v.u(eVar.d, (k) eVar.u.get(), new smd.s((la0.c) eVar.U.get()));
            case 36:
                return v.e(eVar.d, (k) eVar.u.get());
            case 37:
                x90.c cVar21 = eVar.d;
                w legacyBackendFlowAdapterInteractor = new w((wl2.f) eVar.v.get(), eVar.f213756h.b());
                Intrinsics.checkNotNullParameter(legacyBackendFlowAdapterInteractor, "legacyBackendFlowAdapterInteractor");
                return legacyBackendFlowAdapterInteractor;
            case 38:
                return new mm.d();
            case 39:
                return v.c(eVar.d, (yc0.b0) eVar.V.get());
            case 40:
                return new vc0.a((qc0.j) eVar.f213751b0.get(), (k) eVar.u.get(), (ln.a) eVar.f213771t.get(), u.i(eVar.f), (mm.d) eVar.Z.get(), eVar.h());
            case 41:
                return new vc0.b((ln.a) eVar.f213771t.get());
            case 42:
                return new vc0.c((k) eVar.u.get(), (qc0.j) eVar.f213751b0.get(), (wl2.f) eVar.v.get(), eVar.f213755g.a(), new ca0.a(), eVar.h());
            case 43:
                h3l.e eVar8 = (h3l.e) eVar.f0.get();
                ln.a aVar6 = (ln.a) eVar.f213771t.get();
                ho.t tVarC = eVar.f213758j.c();
                s.j(tVarC);
                return new i3l.b(eVar8, aVar6, tVarC, 0);
            case 44:
                return new h3l.m();
            case 45:
                h3l.e eVar9 = (h3l.e) eVar.f0.get();
                ln.a aVar7 = (ln.a) eVar.f213771t.get();
                ho.t tVarC2 = eVar.f213758j.c();
                s.j(tVarC2);
                return new i3l.b(eVar9, aVar7, tVarC2, 1);
            case 46:
                return new i3l.a((h3l.e) eVar.f0.get(), (ln.a) eVar.f213771t.get(), 1);
            case 47:
                return new i3l.a((h3l.e) eVar.f0.get(), (ln.a) eVar.f213771t.get(), 0);
            case 48:
                x90.c cVar22 = eVar.d;
                qc0.j router = (qc0.j) eVar.f213751b0.get();
                Intrinsics.checkNotNullParameter(router, "router");
                s.k(router);
                return router;
            case 49:
                return new sm.e();
            case 50:
                return new om.c();
            case 51:
                return new g3l.g();
            case 52:
                return new an.a();
            case 53:
                return new d4l.a();
            case 54:
                x90.c cVar23 = eVar.d;
                qc0.h state2 = (qc0.h) eVar.Y.get();
                Intrinsics.checkNotNullParameter(state2, "state");
                s.k(state2);
                return state2;
            case 55:
                return u.t(eVar.e);
            case 56:
                return v.d(eVar.d, (k) eVar.u.get(), (la0.c) eVar.U.get(), ImmutableMap.of(WidgetProgressionItem.class, new z90.b()));
            case 57:
                return v.t(eVar.d, (bd0.d) eVar.T.get());
            case 58:
                x90.c cVar24 = eVar.d;
                z70.a aVarF = eVar.f213750b.f();
                s.j(aVarF);
                return v.p(cVar24, aVarF);
            case 59:
                x90.c cVar25 = eVar.d;
                return new yc0.w();
            case 60:
                x90.c cVar26 = eVar.d;
                qc0.j router2 = (qc0.j) eVar.f213751b0.get();
                Intrinsics.checkNotNullParameter(router2, "router");
                s.k(router2);
                return router2;
            case 61:
                x90.c cVar27 = eVar.d;
                qc0.h state3 = (qc0.h) eVar.Y.get();
                Intrinsics.checkNotNullParameter(state3, "state");
                s.k(state3);
                return state3;
            case 62:
                return new h3l.h((h3l.e) eVar.f0.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        nh2.l lVar = (nh2.l) this.f205882c;
        nh2.m mVar = lVar.f215301a;
        uw1.b bVar = lVar.f215302b;
        int i = this.f205881b;
        switch (i) {
            case 0:
                return new kh2.g();
            case 1:
                uw1.c cVarD = ((lz1.m) bVar).d();
                s.j(cVarD);
                qh2.a aVarA = mVar.a();
                s.j(aVarA);
                nh2.e eVar = (nh2.e) mVar.f.get();
                s.j(eVar);
                vz1.j jVarI = ((lz1.m) bVar).i();
                s.j(jVarI);
                return new qh2.o(cVarD, aVarA, eVar, jVarI, (CoroutineScope) lVar.e.get());
            case 2:
                nh2.c.Companion.getClass();
                return rd0.e.a(p0.f264002b);
            case 3:
                uw1.c cVarD2 = ((lz1.m) bVar).d();
                s.j(cVarD2);
                return new rh2.c(cVarD2);
            case 4:
                uw1.c cVarD3 = ((lz1.m) bVar).d();
                s.j(cVarD3);
                return new mh2.b(cVarD3, ((lz1.m) bVar).g(), new t12.c());
            case 5:
                sri.m mVar2 = (sri.m) lVar.i.get();
                uw1.c cVarD4 = ((lz1.m) bVar).d();
                s.j(cVarD4);
                vz1.a aVar = (vz1.a) ((lz1.m) bVar).C.get();
                s.j(aVar);
                return new lh2.i(mVar2, cVarD4, aVar);
            case 6:
                Context context = lVar.f215303c;
                nh2.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return sri.o.c(context, null, null, 14);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        nh2.m mVar = (nh2.m) this.f205882c;
        uw1.b bVar = mVar.f215309c;
        int i = this.f205881b;
        if (i == 0) {
            sf0.h hVarB = mVar.f215307a.b();
            s.j(hVarB);
            v60.e eVarA = mVar.f215308b.a();
            s.j(eVarA);
            oh2.d dVar = new oh2.d(hVarB, eVarA);
            nh2.e eVar = (nh2.e) mVar.f.get();
            fx1.a aVarF = ((lz1.m) bVar).f();
            s.j(aVarF);
            ang.f fVarE = mVar.d.e();
            whf.b bVarA = mVar.e.a();
            s.j(bVarA);
            return new qh2.h(dVar, eVar, aVarF, fVarE, bVarA);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        com.revolut.feature.apm.core.impl.crypto.h factory = (com.revolut.feature.apm.core.impl.crypto.h) ((lz1.m) bVar).S.get();
        s.j(factory);
        tl0.a aVar = factory.f61865b;
        nh2.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        e02.b config = nh2.f.f215299b;
        Intrinsics.checkNotNullParameter(config, "config");
        com.revolut.feature.apm.core.impl.crypto.o keyProvider = new com.revolut.feature.apm.core.impl.crypto.o(config, factory.f61864a, new ApmKeyGenerator(config.f, 14), aVar);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
        return new nh2.e(keyProvider, new com.revolut.feature.apm.core.impl.crypto.d(config, keyProvider, aVar, factory.f61866c));
    }

    private final Object d() {
        nh2.c0 c0Var = (nh2.c0) this.f205882c;
        a31.a aVar = c0Var.f215279g;
        a31.a aVar2 = c0Var.f;
        a31.a aVar3 = c0Var.e;
        a31.a aVar4 = c0Var.f215278c;
        a31.a aVar5 = c0Var.d;
        a31.a aVar6 = c0Var.f215277b;
        ecm.q qVar = c0Var.f215276a;
        int i = this.f205881b;
        if (i == 0) {
            return new nh2.a(qVar, aVar6, aVar4, c0Var.v);
        }
        if (i == 1) {
            nh2.m mVar = (nh2.m) ((nh2.d) c0Var.u.get()).b();
            s.k(mVar);
            return mVar;
        }
        if (i == 2) {
            return new nh2.d(aVar6, aVar5, aVar3, aVar2, aVar, qVar);
        }
        if (i == 3) {
            return new i39.d(qVar, c0Var.f215280h, c0Var.i, aVar5, c0Var.f215281j, c0Var.k, aVar6, aVar4, c0Var.f215282l, c0Var.v, c0Var.f215291x, c0Var.f215283m, c0Var.f215284n, c0Var.o, c0Var.f215285p, c0Var.f215286q, aVar3, aVar2, c0Var.f215287r, c0Var.f215288s, c0Var.f215289t, aVar);
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        nh2.l lVar = (nh2.l) ((nh2.a) c0Var.f215290w.get()).b();
        s.k(lVar);
        return lVar;
    }

    private final Object e() {
        nh5.a aVar = (nh5.a) this.f205882c;
        rtd.a aVar2 = aVar.f215372b;
        usg.a aVar3 = aVar.f215371a;
        int i = this.f205881b;
        if (i == 0) {
            wsg.b bVarA = aVar3.a();
            yud.g gVarD = aVar2.d();
            s.j(gVarD);
            return new oh5.d(bVarA, gVarD, aVar.a());
        }
        if (i == 1) {
            return new oh5.e(aVar3.a(), aVar.a());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        wsg.b bVarA2 = aVar3.a();
        yud.g gVarD2 = aVar2.d();
        s.j(gVarD2);
        return new oh5.b(bVarA2, gVarD2, aVar.a());
    }

    @Override // phm.a
    public final Object get() {
        int i = this.f205880a;
        int i2 = this.f205881b;
        Object obj2 = this.f205882c;
        switch (i) {
            case 0:
                b bVar = (b) obj2;
                ee0.a aVar = bVar.f205883a;
                l70.e eVar = bVar.e;
                switch (i2) {
                    case 0:
                        return new ne0.d();
                    case 1:
                        je0.d mapper = aVar.b();
                        s.j(mapper);
                        yk0.a databaseSessionProvider = bVar.f205884b.b();
                        s.j(databaseSessionProvider);
                        xe0.f fVarF = aVar.f();
                        s.j(fVarF);
                        fil.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                        return xe0.f.f(fVarF, databaseSessionProvider, "trading_projections_storage", mapper, 3, zhm.v.k(v0.a.c(fVarF, "storageFactory", 1, 2), new exa.a(2, 3, 5)), 32);
                    case 2:
                        return new lil.b();
                    case 3:
                        return new nil.c((jil.a) bVar.f205890m.get());
                    case 4:
                        TradingProjectionsService tradingProjectionsService = (TradingProjectionsService) bVar.f205889l.get();
                        ne0.j jVar = (ne0.j) bVar.f205887h.get();
                        ue0.c cVar = (ue0.c) bVar.i.get();
                        l80.e eVarH = eVar.h();
                        s.j(eVarH);
                        jul.o oVar = new jul.o(cVar, eVarH);
                        l80.e eVarH2 = eVar.h();
                        s.j(eVarH2);
                        return new jil.a(tradingProjectionsService, jVar, oVar, eVarH2);
                    case 5:
                        TradingProjectionsService tradingProjectionsService2 = (TradingProjectionsService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) bVar.k.get(), "retrofit", TradingProjectionsService.class, "create(...)");
                        s.k(tradingProjectionsService2);
                        return tradingProjectionsService2;
                    case 6:
                        Retrofit retrofit = ((nj0.d) bVar.f205885c).f();
                        gfl.a wealthNetworkConfiguration = bVar.d.f161039a;
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Intrinsics.checkNotNullParameter(wealthNetworkConfiguration, "wealthNetworkConfiguration");
                        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
                        builderNewBuilder.converterFactories().clear();
                        Object value = GsonHolder.f105371a.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        builderNewBuilder.addConverterFactory(GsonConverterFactory.create((kg.o) value));
                        builderNewBuilder.baseUrl(wealthNetworkConfiguration.getHostUrl());
                        Retrofit retrofitBuild = builderNewBuilder.build();
                        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                        s.k(retrofitBuild);
                        return retrofitBuild;
                    default:
                        throw new AssertionError(i2);
                }
            case 1:
                mkh.g gVar = (mkh.g) obj2;
                mkh.s sVar = gVar.f206326b;
                if (i2 == 0) {
                    pkh.l lVar = new pkh.l();
                    rkh.f fVar = (rkh.f) gVar.f206327c.get();
                    mre.c cVarB = sVar.f206414k0.b();
                    s.j(cVarB);
                    return new pkh.k(lVar, fVar, new tkh.b(cVarB));
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                DisclosuresControllerContract$Input inputData = gVar.f206325a;
                l61.a aVarB = sVar.V.b();
                s.j(aVarB);
                rkh.b commoditiesDisclosuresProvider = new rkh.b(aVarB);
                rkh.d cryptoDisclosuresProvider = new rkh.d(sVar.V.e());
                ybl.l lVarF = sVar.d.f();
                qkh.a aVar2 = new qkh.a();
                jlh.p pVar = (jlh.p) sVar.f206408d1.get();
                ybl.i iVarB = sVar.f.b();
                s.j(iVarB);
                rkh.m tradingDisclosuresProvider = new rkh.m(lVarF, aVar2, pVar, iVarB);
                fk3.a aVarA = sVar.i0.a();
                s.j(aVarA);
                ybl.l lVarF2 = sVar.d.f();
                wbf.k kVar = (wbf.k) sVar.j0.C.get();
                s.j(kVar);
                rkh.h investCombinedDisclosuresProvider = new rkh.h(aVarA, lVarF2, kVar);
                skh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(commoditiesDisclosuresProvider, "commoditiesDisclosuresProvider");
                Intrinsics.checkNotNullParameter(cryptoDisclosuresProvider, "cryptoDisclosuresProvider");
                Intrinsics.checkNotNullParameter(tradingDisclosuresProvider, "tradingDisclosuresProvider");
                Intrinsics.checkNotNullParameter(investCombinedDisclosuresProvider, "investCombinedDisclosuresProvider");
                DisclosuresDestination.Configuration configuration = inputData.f95987a;
                if (Intrinsics.f(configuration, DisclosuresDestination.Configuration.Commodities.f95903a)) {
                    return commoditiesDisclosuresProvider;
                }
                if (Intrinsics.f(configuration, DisclosuresDestination.Configuration.Crypto.f95904a)) {
                    return cryptoDisclosuresProvider;
                }
                if (Intrinsics.f(configuration, DisclosuresDestination.Configuration.Trading.f95906a)) {
                    return tradingDisclosuresProvider;
                }
                if (Intrinsics.f(configuration, DisclosuresDestination.Configuration.InvestCombined.f95905a)) {
                    return investCombinedDisclosuresProvider;
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                mlf.d dVar = (mlf.d) obj2;
                ctj.e eVar2 = dVar.f206750n0;
                l70.e eVar3 = dVar.f206726b;
                if (i2 == 0) {
                    sri.m mVarS = dVar.S();
                    f80.a aVarX = eVar3.x();
                    s.j(aVarX);
                    return new llf.b(new nlf.a(mVarS, aVarX));
                }
                if (i2 == 1) {
                    zk0.b bVarL = eVar3.l();
                    s.j(bVarL);
                    l80.e eVarH3 = eVar3.h();
                    s.j(eVarH3);
                    enf.e eVar4 = new enf.e(new enf.a());
                    zk0.b bVarL2 = eVar3.l();
                    s.j(bVarL2);
                    return new rnf.l(bVarL, eVarH3, new enf.c(eVar4, bVarL2));
                }
                if (i2 != 2) {
                    throw new AssertionError(i2);
                }
                wzi.a incomeSorterInteractor = ((ctj.b) eVar2).a();
                s.j(incomeSorterInteractor);
                wsg.n walletInteractor = dVar.z.b();
                ang.f userInteractor = dVar.f206757r.e();
                l80.e eVarH4 = eVar3.h();
                s.j(eVarH4);
                ppk.f fVarA = dVar.f206752o0.a();
                wzi.a aVarA2 = ((ctj.b) eVar2).a();
                s.j(aVarA2);
                kof.l incomeSorterInfoProvider = new kof.l(eVarH4, fVarA, aVarA2);
                j9l.a moneyCalculator = new j9l.a();
                jmd.c incomeSorterContentDepsApi = dVar.p0;
                mlf.h.Companion.getClass();
                Intrinsics.checkNotNullParameter(incomeSorterInteractor, "incomeSorterInteractor");
                Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
                Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
                Intrinsics.checkNotNullParameter(incomeSorterInfoProvider, "incomeSorterInfoProvider");
                Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
                Intrinsics.checkNotNullParameter(incomeSorterContentDepsApi, "incomeSorterContentDepsApi");
                return new kof.j(incomeSorterInteractor, walletInteractor, userInteractor, incomeSorterInfoProvider, new rqd.h(incomeSorterContentDepsApi.f176526a.a()), moneyCalculator);
            case 3:
                mm8.a aVar3 = (mm8.a) obj2;
                a31.a aVar4 = aVar3.f207177c;
                if (i2 == 0) {
                    return new ae9.d(aVar3.f207175a, aVar3.f207180j, aVar3.f207178g, aVar4, aVar3.f207179h, 5);
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        return new nm8.f(aVar3.f207176b, aVar4, aVar3.d, aVar3.e, aVar3.f);
                    }
                    throw new AssertionError(i2);
                }
                nm8.b bVar2 = (nm8.b) ((nm8.f) aVar3.i.get()).b();
                s.k(bVar2);
                return bVar2;
            case 4:
                mo9.b bVar3 = (mo9.b) obj2;
                ee0.a aVar5 = bVar3.f207576b;
                if (i2 == 0) {
                    lo9.d dVar2 = (lo9.d) bVar3.f207586r.get();
                    CoroutineScope coroutineScopeA = bVar3.d.a();
                    s.j(coroutineScopeA);
                    return new ko9.b(dVar2, coroutineScopeA);
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        return new ne0.d();
                    }
                    if (i2 != 3) {
                        throw new AssertionError(i2);
                    }
                    je0.d mapper2 = aVar5.d();
                    s.j(mapper2);
                    yk0.a databaseSessionProvider2 = bVar3.f207577c.b();
                    s.j(databaseSessionProvider2);
                    xe0.f storageFactory = aVar5.f();
                    s.j(storageFactory);
                    mo9.f.Companion.getClass();
                    Intrinsics.checkNotNullParameter(mapper2, "mapper");
                    Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                    Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                    return xe0.f.f(storageFactory, databaseSessionProvider2, "air_payment_widget", mapper2, 1, zhm.f0.f322471a, 32);
                }
                ik0.b retrofitFactory = ((nj0.d) bVar3.f207575a).m();
                s.j(retrofitFactory);
                mo9.g jsonProvider = new mo9.g();
                Intrinsics.checkNotNullParameter(jsonProvider, "jsonProvider");
                rlm.o json = jsonProvider.f207598a;
                s.k(json);
                Intrinsics.checkNotNullParameter(json, "json");
                b1.Companion.getClass();
                ek.a converterFactory = ek.b.a(json, a1.a("application/json"));
                mo9.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Retrofit retrofit3 = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27);
                s.k(retrofit3);
                Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                Object objCreate = retrofit3.create(PaymentWidgetService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                PaymentWidgetService paymentWidgetService = (PaymentWidgetService) objCreate;
                s.k(paymentWidgetService);
                return new lo9.e(new kdh.b(paymentWidgetService, new lo9.b((ne0.j) bVar3.f207584p.get(), (ue0.c) bVar3.f207585q.get())), new lo9.b((ne0.j) bVar3.f207584p.get(), (ue0.c) bVar3.f207585q.get()));
            case 5:
                mrg.a aVar6 = (mrg.a) obj2;
                if (i2 == 0) {
                    return new rrg.d((jki.p) aVar6.f208120b.get(), aVar6.f208119a);
                }
                if (i2 == 1) {
                    return new rrg.e();
                }
                throw new AssertionError(i2);
            case 6:
                ms1.i iVar = (ms1.i) obj2;
                nj0.a aVar7 = iVar.f208530a;
                if (i2 == 0) {
                    return new hs1.c((BizumService) iVar.f208531b.get(), ((nj0.d) aVar7).i);
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                Retrofit retrofit4 = ((nj0.d) aVar7).f();
                ms1.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                Object objCreate2 = retrofit4.create(BizumService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                BizumService bizumService = (BizumService) objCreate2;
                s.k(bizumService);
                return bizumService;
            case 7:
                if (i2 == 0) {
                    return new ct1.h((jki.p) ((ms1.o) obj2).f208563a.get());
                }
                if (i2 == 1) {
                    return new ct1.i();
                }
                throw new AssertionError(i2);
            case 8:
                msf.a aVar8 = (msf.a) obj2;
                a31.a aVar9 = aVar8.f208663g;
                if (i2 == 0) {
                    return new bt7.l(aVar8.f208660a, aVar8.f208661b, aVar8.f208662c, aVar8.d, aVar8.e, aVar8.f, aVar9, aVar8.f208664h, aVar8.i, aVar8.f208665j, aVar8.k, aVar8.f208666l, 1);
                }
                if (i2 == 1) {
                    return new n8j.a(aVar9, 5);
                }
                throw new AssertionError(i2);
            case 9:
                if (i2 == 0) {
                    return new jtb.a();
                }
                if (i2 == 1) {
                    return new jtb.c();
                }
                if (i2 != 2) {
                    throw new AssertionError(i2);
                }
                kbb.q qVar = (kbb.q) ((nbb.a) ((mtb.d) obj2).f208799a).J.get();
                s.j(qVar);
                return new jtb.b(qVar);
            case 10:
                ix5.c cVar2 = (ix5.c) obj2;
                CryptoSortingPickerInputData cryptoSortingPickerInputData = cVar2.f169343b;
                if (i2 == 0) {
                    return new ox5.h(cryptoSortingPickerInputData, (cli.n) cVar2.f169344c.get());
                }
                if (i2 == 1) {
                    return new i3g.k(new ny5.j(), cryptoSortingPickerInputData);
                }
                throw new AssertionError(i2);
            case 11:
                mw5.o oVar2 = (mw5.o) obj2;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new ry5.a();
                    }
                    throw new AssertionError(i2);
                }
                ry5.g gVar2 = (ry5.g) oVar2.f209397b.get();
                mw5.l lVar2 = oVar2.f209396a;
                fk3.a aVarA3 = lVar2.f209387w.a();
                s.j(aVarA3);
                xv5.c cVarA = lVar2.f209377h.a();
                s.j(cVarA);
                return new ry5.o(gVar2, new nw5.i(aVarA3, cVarA, vd0.d.a(), (nw5.j) lVar2.H.get()));
            case 12:
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new qy.b();
                    }
                    throw new AssertionError(i2);
                }
                mz.b bVar4 = (mz.b) obj2;
                ly.c cVar3 = bVar4.f210562a;
                y80.a aVarR = bVar4.f210563b.r();
                s.j(aVarR);
                return new com.revolut.camerakit.revolut.ui.flow.b(cVar3, aVarR);
            case 13:
                n12.c cVar4 = (n12.c) obj2;
                a31.a aVar10 = cVar4.f211216r;
                a31.a aVar11 = cVar4.f211215q;
                a31.a aVar12 = cVar4.f211217s;
                a31.a aVar13 = cVar4.f211214p;
                a31.a aVar14 = cVar4.o;
                a31.a aVar15 = cVar4.f211213n;
                a31.a aVar16 = cVar4.i;
                a31.a aVar17 = cVar4.d;
                a31.a aVar18 = cVar4.f211207c;
                a31.a aVar19 = cVar4.f;
                a31.a aVar20 = cVar4.G;
                a31.a aVar21 = cVar4.f211206b;
                a31.a aVar22 = cVar4.f211209h;
                a31.a aVar23 = cVar4.e;
                ecm.q qVar2 = cVar4.f211205a;
                if (i2 == 0) {
                    return new p12.a(qVar2, aVar21, aVar18, aVar17, aVar23, aVar19, cVar4.f211208g, aVar22, aVar16, cVar4.f211210j, cVar4.k, cVar4.f211211l, cVar4.f211212m, aVar15, aVar14, aVar13, aVar11, aVar10);
                }
                if (i2 == 1) {
                    return new c3d.d(aVar21, aVar12, 24);
                }
                if (i2 == 2) {
                    return new o41.e(qVar2, cVar4.f211218t, aVar23, aVar19, cVar4.u, aVar18, aVar21, cVar4.S, cVar4.v, cVar4.f211219w, cVar4.f211220x, aVar17, cVar4.f211221y, cVar4.z, cVar4.A, aVar22, aVar16, cVar4.B, cVar4.C, cVar4.D, cVar4.E, cVar4.F, aVar20, aVar15, aVar14, aVar13, aVar12, cVar4.H, cVar4.I, aVar11, aVar10, cVar4.J, cVar4.K, cVar4.L, cVar4.M, cVar4.N, cVar4.O);
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        return new ee7.e(qVar2, aVar23, cVar4.S, aVar22, cVar4.P, aVar20);
                    }
                    throw new AssertionError(i2);
                }
                p12.l lVar3 = (p12.l) ((p12.a) cVar4.Q.get()).b();
                s.k(lVar3);
                return lVar3;
            case 14:
                n16.b bVar5 = (n16.b) obj2;
                ite.a aVar24 = bVar5.f211247a;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            return new r16.a();
                        }
                        throw new AssertionError(i2);
                    }
                    y16.d actionsProvider = new y16.d(new wqi.a());
                    Intrinsics.checkNotNullParameter(actionsProvider, "actionsProvider");
                    y16.e deFiWalletActivationHeaderMapper = new y16.e();
                    y16.d actionsProvider2 = new y16.d(new wqi.a());
                    Intrinsics.checkNotNullParameter(actionsProvider2, "actionsProvider");
                    y16.b deFiAccountHeaderMapper = new y16.b();
                    Intrinsics.checkNotNullParameter(deFiWalletActivationHeaderMapper, "deFiWalletActivationHeaderMapper");
                    Intrinsics.checkNotNullParameter(deFiAccountHeaderMapper, "deFiAccountHeaderMapper");
                    return new y16.c();
                }
                gte.a aVarB2 = aVar24.b();
                s.j(aVarB2);
                f16.b bVar6 = (f16.b) bVar5.f211248b.k.get();
                s.j(bVar6);
                t46.a aVar25 = (t46.a) bVar5.f211249c.i.get();
                s.j(aVar25);
                xv5.c cVarA2 = bVar5.d.a();
                s.j(cVarA2);
                bn2.p pVarC = bVar5.e.c();
                ang.f fVarE = bVar5.f.e();
                mre.c cVarB2 = bVar5.f211250g.b();
                s.j(cVarB2);
                o16.e eVar5 = new o16.e(fVarE, cVarB2);
                onh.b bVar7 = new onh.b(new wt5.a());
                gte.a aVarB3 = aVar24.b();
                s.j(aVarB3);
                return new com.revolut.feature.defi.accounts.impl.ui.extension.a(aVarB2, bVar6, aVar25, cVarA2, pVarC, eVar5, bVar7, new x16.k(aVarB3));
            case 15:
                n2a.a aVar26 = (n2a.a) obj2;
                ee0.a aVar27 = aVar26.f211500a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new ne0.d();
                    }
                    if (i2 != 2) {
                        throw new AssertionError(i2);
                    }
                    je0.d mapper3 = aVar27.d();
                    s.j(mapper3);
                    yk0.a databaseSessionProvider3 = aVar26.f211501b.b();
                    s.j(databaseSessionProvider3);
                    xe0.f storageFactory2 = aVar27.f();
                    s.j(storageFactory2);
                    n2a.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(mapper3, "mapper");
                    Intrinsics.checkNotNullParameter(databaseSessionProvider3, "databaseSessionProvider");
                    Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                    return xe0.f.f(storageFactory2, databaseSessionProvider3, "TransfersPersonalisationStorage", mapper3, 1, zhm.f0.f322471a, 32);
                }
                ne0.j jVar2 = (ne0.j) aVar26.f211505j.get();
                ue0.c cVar5 = (ue0.c) aVar26.k.get();
                ik0.b retrofitFactory2 = ((nj0.d) aVar26.f211502c).m();
                s.j(retrofitFactory2);
                n2a.g jsonProvider2 = new n2a.g();
                Intrinsics.checkNotNullParameter(jsonProvider2, "jsonProvider");
                rlm.o json2 = jsonProvider2.f211509a;
                s.k(json2);
                Intrinsics.checkNotNullParameter(json2, "json");
                b1.Companion.getClass();
                ek.a converterFactory2 = ek.b.a(json2, a1.a("application/json"));
                n2a.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory2, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory2, "converterFactory");
                Retrofit retrofit5 = ik0.b.a(retrofitFactory2, null, null, converterFactory2, null, 27);
                s.k(retrofit5);
                Intrinsics.checkNotNullParameter(retrofit5, "retrofit");
                Object objCreate3 = retrofit5.create(TransfersPersonalisationService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate3, "create(...)");
                TransfersPersonalisationService transfersPersonalisationService = (TransfersPersonalisationService) objCreate3;
                s.k(transfersPersonalisationService);
                return new k2a.d(jVar2, cVar5, transfersPersonalisationService);
            case 16:
                n3l.b bVar8 = (n3l.b) obj2;
                switch (i2) {
                    case 0:
                        return new ifm.b();
                    case 1:
                        return new j();
                    case 2:
                        o3l.f fVar2 = (o3l.f) bVar8.f212199h.get();
                        c70.a aVarZ = bVar8.f212195a.z();
                        s.j(aVarZ);
                        return new o3l.j(fVar2, aVarZ);
                    case 3:
                        return new o3l.s();
                    case 4:
                        l3l.h hVar = (l3l.h) bVar8.k.get();
                        ifm.b bVar9 = (ifm.b) bVar8.f.get();
                        ho.t tVarC = bVar8.f212197c.c();
                        s.j(tVarC);
                        return new l3l.s(hVar, bVar9, tVarC, ((s41.a) bVar8.d).d());
                    case 5:
                        return new l3l.h((o3l.d) bVar8.i.get(), (l3l.c) bVar8.f212200j.get(), new tul.b(new aua.f(((vta.a) bVar8.f212196b).a())), (ifm.b) bVar8.f.get());
                    case 6:
                        return new l3l.t((o3l.f) bVar8.f212199h.get());
                    default:
                        throw new AssertionError(i2);
                }
            case 17:
                n46.a dependenciesApi = (n46.a) obj2;
                rr5.a cryptoFeedWidgetApi = dependenciesApi.f212305b;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(cryptoFeedWidgetApi, "cryptoFeedWidgetApi");
                        ys5.h factory = ((rs5.c) cryptoFeedWidgetApi).m();
                        pt5.t transactionsFilterProvider = (pt5.t) dependenciesApi.e.get();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(transactionsFilterProvider, "transactionsFilterProvider");
                        thf.g gVar3 = factory.f316408a;
                        whf.b bVar10 = factory.f316409b;
                        if (transactionsFilterProvider == null) {
                            transactionsFilterProvider = (pt5.t) factory.f316410c.get();
                        }
                        return new ys5.d(gVar3, bVar10, transactionsFilterProvider);
                    case 1:
                        g76.a deFiTransactionsApi = dependenciesApi.f212306c;
                        Intrinsics.checkNotNullParameter(deFiTransactionsApi, "deFiTransactionsApi");
                        return (d76.b) deFiTransactionsApi.a().f129738b;
                    case 2:
                        Intrinsics.checkNotNullParameter(cryptoFeedWidgetApi, "cryptoFeedWidgetApi");
                        ys5.h factory2 = ((rs5.c) cryptoFeedWidgetApi).m();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        return factory2.f;
                    case 3:
                        Intrinsics.checkNotNullParameter(cryptoFeedWidgetApi, "cryptoFeedWidgetApi");
                        ys5.h factory3 = ((rs5.c) cryptoFeedWidgetApi).m();
                        pt5.t transactionsFilterProvider2 = (pt5.t) dependenciesApi.e.get();
                        lt5.a source = lt5.a.DEFI;
                        s.k(source);
                        q46.a emptyStateDestinationProvider = new q46.a(0);
                        o46.b navigationHandler = (o46.b) dependenciesApi.i.get();
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        Intrinsics.checkNotNullParameter(transactionsFilterProvider2, "transactionsFilterProvider");
                        Intrinsics.checkNotNullParameter(source, "source");
                        Intrinsics.checkNotNullParameter(emptyStateDestinationProvider, "emptyStateDestinationProvider");
                        Intrinsics.checkNotNullParameter(navigationHandler, "navigationHandler");
                        return factory3.a(transactionsFilterProvider2, source, emptyStateDestinationProvider, navigationHandler);
                    case 4:
                        return new o46.b((p46.d) dependenciesApi.f212308h.get());
                    case 5:
                        return new p46.d();
                    case 6:
                        f4h.a factory4 = dependenciesApi.f212304a.b();
                        q46.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory4, "factory");
                        Intrinsics.checkNotNullParameter(dependenciesApi, "dependenciesApi");
                        return factory4.i(dependenciesApi);
                    default:
                        throw new AssertionError(i2);
                }
            case 18:
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new p69.b();
                    }
                    throw new AssertionError(i2);
                }
                gte.a featureToggleInteractor = ((n69.a) obj2).f212745a.b();
                s.j(featureToggleInteractor);
                p0 p0Var = p0.f264001a;
                elm.f dispatcher = elm.f.f127540b;
                s.k(dispatcher);
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
                return new p69.a(featureToggleInteractor, dispatcher);
            case 19:
                return a();
            case 20:
                nb2.a aVar28 = (nb2.a) obj2;
                if (i2 == 0) {
                    return new qb2.c((cli.n) aVar28.f213957b.get(), aVar28.f213956a);
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                Intrinsics.checkNotNullParameter(new qb2.e(), "mapper");
                return new qb2.d();
            case 21:
                nbb.a aVar29 = (nbb.a) obj2;
                nj0.a aVar30 = aVar29.f214024l;
                vxd.b bVar11 = aVar29.f214023j;
                bq.j jVar3 = aVar29.f214022h;
                ckg.a aVar31 = aVar29.f214018a;
                aje.a tabCryptoApi = aVar29.E;
                gke.a aVar32 = aVar29.f214027p;
                uie.l tabCreditApi = aVar29.f214031t;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            return new kbb.p();
                        }
                        throw new AssertionError(i2);
                    }
                    dtb.b bVar12 = (dtb.b) aVar29.F.f174012h.get();
                    s.j(bVar12);
                    dtb.b bVar13 = (dtb.b) ((ske.c) aVar32).c0.get();
                    s.j(bVar13);
                    dtb.b bVar14 = (dtb.b) ((jje.c) tabCryptoApi).X.get();
                    s.j(bVar14);
                    dtb.b bVar15 = (dtb.b) ((vle.b) aVar29.G).F.get();
                    s.j(bVar15);
                    dtb.b bVar16 = (dtb.b) ((r5a.a) aVar29.H).d.get();
                    s.j(bVar16);
                    dtb.b bVar17 = (dtb.b) tabCreditApi.f280404h.get();
                    s.j(bVar17);
                    return new kbb.q(bVar12, bVar13, bVar14, bVar15, bVar16, bVar17);
                }
                ekg.g uiPersonalisationInteractor = aVar31.b();
                ntb.c mainScreenTabEventDispatcher = (ntb.c) aVar29.f214019b.f229578a.get();
                s.j(mainScreenTabEventDispatcher);
                bte.a appTipsBinding = (bte.a) ((drb.a) aVar29.f214020c).e.get();
                s.j(appTipsBinding);
                bng.b accountLockManager = new bng.b(aVar29.d.e(), 0);
                rla.c appearanceSettingsInteractor = (rla.c) aVar29.e.C.get();
                s.j(appearanceSettingsInteractor);
                fk3.b bVarB = aVar29.f.b();
                s.j(bVarB);
                qbb.a configurationProvider = new qbb.a(bVarB, aVar29.f214021g.f183264b);
                zjh.f inAppUpdaterFactory = new zjh.f((ue0.c) jVar3.e.get());
                zjh.c inAppUpdaterActivityDelegateFactory = new zjh.c((ue0.c) jVar3.e.get());
                vta.a aVar33 = (vta.a) aVar29.i;
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
                dqk.a aVar34 = aVar33.f291939a;
                d4m.a aVarA4 = e4m.b.a(aVar34.d);
                wsg.n nVarB = aVar34.f117041b.b();
                ang.f fVarE2 = aVar34.f117042c.e();
                dqk.d.Companion.getClass();
                Clock clockSystemDefaultZone = Clock.systemDefaultZone();
                Intrinsics.checkNotNullExpressionValue(clockSystemDefaultZone, "systemDefaultZone(...)");
                s.k(clockSystemDefaultZone);
                ImmutableSet eligibilities = ImmutableSet.of(new eqk.b(aVarA4, nVarB, fVarE2, clockSystemDefaultZone));
                Intrinsics.checkNotNullParameter(eligibilities, "eligibilities");
                Intrinsics.checkNotNullParameter(eligibilities, "eligibilities");
                nd.p externalEligibilities = new nd.p();
                vta.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(externalEligibilities, "externalEligibilities");
                s.k(eligibilities);
                builderBuilderWithExpectedSize.addAll((Iterable) eligibilities);
                builderBuilderWithExpectedSize.add(new wta.b(new aua.f(aVar33.a()), vta.d.a()));
                py3.b bVar18 = new py3.b(builderBuilderWithExpectedSize.build(), 1);
                yta.b bVar19 = new yta.b(new aua.f(aVar33.a()), vta.d.a());
                x xVarD = ((s41.a) aVar33.d).d();
                yp.b bVarA = aVar33.e.a();
                dqk.f fVar3 = new dqk.f();
                gte.a aVarB4 = aVar33.f.b();
                s.j(aVarB4);
                sz5.f appRatingControllerExtensionFactory = new sz5.f(bVar18, bVar19, xVarD, bVarA, fVar3, aVarB4, new toh.d(new aua.f(aVar33.a()), vta.d.a()), new cua.a());
                zxd.c statementsInteractor = ((eyd.b) bVar11).a();
                s.j(statementsInteractor);
                vyd.a statementGenerationDialogModelConfigurationFactory = new vyd.a();
                daj.a cryptoNavigationInterceptorControllerExtensionFactory = (daj.a) ((caj.a) aVar29.k).d.get();
                s.j(cryptoNavigationInterceptorControllerExtensionFactory);
                ij0.c revolutHostChecker = (ij0.c) ((nj0.d) aVar30).f216306t.get();
                s.j(revolutHostChecker);
                hk0.a networkFileRepository = ((nj0.d) aVar30).j();
                n0e.b statementsNaviCommandFactory = ((eyd.b) bVar11).c();
                f80.a uriHelper = aVar29.f214025m.x();
                s.j(uriHelper);
                u29.o oVar3 = (u29.o) ((t29.c) aVar29.f214026n).z.get();
                s.j(oVar3);
                ji5.m mVarE = aVar29.o.e();
                s.j(mVarE);
                uke.a aVar35 = (uke.a) ((ske.c) aVar32).f0.get();
                s.j(aVar35);
                ekg.g gVarB = aVar31.b();
                ibb.d dVar3 = (ibb.d) ((mbb.a) aVar29.f214028q).f204191a.get();
                s.j(dVar3);
                xx9.p pVarB = aVar29.f214029r.b();
                s.j(pVarB);
                n8b.a aVarA5 = aVar29.f214030s.a();
                s.j(aVarA5);
                vtb.a aVar36 = new vtb.a();
                vie.j jVar4 = (vie.j) tabCreditApi.i.get();
                s.j(jVar4);
                kbb.o mainContainerTabItemsProvider = new kbb.o(oVar3, mVarE, aVar35, gVarB, dVar3, pVarB, aVarA5, aVar36, jVar4);
                x deeplinkHandler = ((s41.a) aVar29.u).d();
                h1b.b appsFlyerDeeplinkObserver = (h1b.b) aVar29.v.f180199p.get();
                s.j(appsFlyerDeeplinkObserver);
                ug6.f externalAccountTopupResultExtensionFactory = (ug6.f) aVar29.f214032w.i.get();
                s.j(externalAccountTopupResultExtensionFactory);
                ad2.a aVar37 = (ad2.a) aVar29.f214033x.f133865j.get();
                s.j(aVar37);
                sbb.d apmConfirmRegistrationModelExtension = new sbb.d(aVar37);
                uw1.c cVarD = ((lz1.m) aVar29.f214034y).d();
                s.j(cVarD);
                lx1.d dVarB = ((ey1.e) aVar29.z).b();
                s.j(dVarB);
                oy1.b bVarB2 = aVar29.A.b();
                kz9.a aVarA6 = aVar29.B.a();
                s.j(aVarA6);
                sbb.k apmDeeplinkModelExtension = new sbb.k(cVarD, dVarB, bVarB2, aVarA6);
                sbb.p checklistModelExtension = new sbb.p();
                uak.f pendingPaymentChecker = (uak.f) aVar29.C.f295950g.get();
                s.j(pendingPaymentChecker);
                a5h.g planChangeAppThemeManager = aVar29.D.b();
                Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
                Intrinsics.checkNotNullParameter(mainScreenTabEventDispatcher, "mainScreenTabEventDispatcher");
                Intrinsics.checkNotNullParameter(appTipsBinding, "appTipsBinding");
                Intrinsics.checkNotNullParameter(accountLockManager, "accountLockManager");
                Intrinsics.checkNotNullParameter(appearanceSettingsInteractor, "appearanceSettingsInteractor");
                Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
                Intrinsics.checkNotNullParameter(inAppUpdaterFactory, "inAppUpdaterFactory");
                Intrinsics.checkNotNullParameter(inAppUpdaterActivityDelegateFactory, "inAppUpdaterActivityDelegateFactory");
                Intrinsics.checkNotNullParameter(appRatingControllerExtensionFactory, "appRatingControllerExtensionFactory");
                Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
                Intrinsics.checkNotNullParameter(statementGenerationDialogModelConfigurationFactory, "statementGenerationDialogModelConfigurationFactory");
                Intrinsics.checkNotNullParameter(cryptoNavigationInterceptorControllerExtensionFactory, "cryptoNavigationInterceptorControllerExtensionFactory");
                Intrinsics.checkNotNullParameter(revolutHostChecker, "revolutHostChecker");
                Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
                Intrinsics.checkNotNullParameter(statementsNaviCommandFactory, "statementsNaviCommandFactory");
                Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
                Intrinsics.checkNotNullParameter(mainContainerTabItemsProvider, "mainContainerTabItemsProvider");
                Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
                Intrinsics.checkNotNullParameter(appsFlyerDeeplinkObserver, "appsFlyerDeeplinkObserver");
                Intrinsics.checkNotNullParameter(externalAccountTopupResultExtensionFactory, "externalAccountTopupResultExtensionFactory");
                Intrinsics.checkNotNullParameter(apmConfirmRegistrationModelExtension, "apmConfirmRegistrationModelExtension");
                Intrinsics.checkNotNullParameter(apmDeeplinkModelExtension, "apmDeeplinkModelExtension");
                Intrinsics.checkNotNullParameter(checklistModelExtension, "checklistModelExtension");
                Intrinsics.checkNotNullParameter(pendingPaymentChecker, "pendingPaymentChecker");
                Intrinsics.checkNotNullParameter(planChangeAppThemeManager, "planChangeAppThemeManager");
                Intrinsics.checkNotNullParameter(tabCreditApi, "tabCreditApi");
                Intrinsics.checkNotNullParameter(tabCryptoApi, "tabCryptoApi");
                return new nbb.d(inAppUpdaterFactory, externalAccountTopupResultExtensionFactory, appTipsBinding, appsFlyerDeeplinkObserver, deeplinkHandler, accountLockManager, pendingPaymentChecker, appearanceSettingsInteractor, planChangeAppThemeManager, uiPersonalisationInteractor, statementsInteractor, statementGenerationDialogModelConfigurationFactory, revolutHostChecker, networkFileRepository, statementsNaviCommandFactory, uriHelper, apmConfirmRegistrationModelExtension, apmDeeplinkModelExtension, checklistModelExtension, appRatingControllerExtensionFactory, cryptoNavigationInterceptorControllerExtensionFactory, inAppUpdaterActivityDelegateFactory, configurationProvider, mainContainerTabItemsProvider, mainScreenTabEventDispatcher, tabCreditApi, tabCryptoApi);
            case 22:
                ned.d dVar4 = (ned.d) obj2;
                if (i2 == 0) {
                    return new com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alert_details.a(dVar4.f214440a);
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) dVar4.e.get();
                red.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                x0 x0Var = rp0.g1.Companion;
                View decorView = controller.m2().getWindow().getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
                return x0.a(x0Var, decorView);
            case 23:
                ned.n nVar = (ned.n) obj2;
                if (i2 == 0) {
                    return new cfd.g((cli.n) nVar.f214485b.get(), nVar.f214484a);
                }
                if (i2 == 1) {
                    return new cfd.h();
                }
                throw new AssertionError(i2);
            case 24:
                return b();
            case 25:
                return c();
            case 26:
                if (i2 == 0) {
                    return new zh2.e((cli.n) ((nh2.w) obj2).f215358a.get());
                }
                if (i2 == 1) {
                    return new zh2.f();
                }
                throw new AssertionError(i2);
            case 27:
                return d();
            case 28:
                return e();
            default:
                nk7.d dVar5 = (nk7.d) obj2;
                if (i2 == 0) {
                    return new xk7.g((jki.p) dVar5.f216672c.get(), dVar5.f216670a);
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                thf.g gVarE = dVar5.f216671b.f216717c.e();
                s.j(gVarE);
                return new xk7.i(new ik7.j(gVarE));
        }
    }
}
