package xf6;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.work.WorkManager;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.backend_flow.ui.BackendFlowSnapshotsCompressor;
import com.revolut.core.strings_ota.impl.services.StringsOtaService;
import com.revolut.feature.address.common.impl.flow.field_search.manual.AddManuallyScreenContract$InputData;
import com.revolut.feature.backend_flow.domain.models.ExternalValidation;
import com.revolut.feature.backend_flow.domain.models.MaxAmountValidation;
import com.revolut.feature.backend_flow.domain.models.MaxLengthValidation;
import com.revolut.feature.backend_flow.domain.models.MinAmountValidation;
import com.revolut.feature.backend_flow.domain.models.MinLengthValidation;
import com.revolut.feature.backend_flow.domain.models.RegexValidation;
import com.revolut.feature.backend_flow.domain.models.WidgetProgressionItem;
import com.revolut.feature.card.tokenization.impl.data.network.CardTokenizationService;
import com.revolut.feature.check_topup.impl.network.CheckTopUpService;
import com.revolut.feature.check_topup.impl.ui_kompot.screen.scan.dialog.CheckTopUpScanDialogHelperImpl;
import com.revolut.feature.external_accounts.impl.repository.network.CrossBorderOpenBankingService;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details.ConsentDetailsScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.screens.iban.IbanScreenContract$InputData;
import h80.e;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Retrofit;
import t80.e;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f304786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f304787c;

    public /* synthetic */ a1(Object obj2, int i, int i2) {
        this.f304785a = i2;
        this.f304787c = obj2;
        this.f304786b = i;
    }

    private final Object a() {
        xz4.d dVar = (xz4.d) this.f304787c;
        int i = this.f304786b;
        switch (i) {
            case 0:
                hri.b bVar = dVar.f309839a;
                return new ifm.b();
            case 1:
                hri.b bVar2 = dVar.f309839a;
                return new iri.j();
            case 2:
                return new cn.e();
            case 3:
                return new um.c();
            case 4:
                dVar.getClass();
                return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
            case 5:
                return new ln.c();
            case 6:
                dVar.getClass();
                return new vz4.m(new qc0.g1(new com.revolut.feature.chooser.e(), new tc0.c(), new onh.b(new BackendFlowSnapshotsCompressor())));
            case 7:
                e4m.e eVar = dVar.X;
                l70.e eVar2 = dVar.f309841b;
                r54.f fVar = dVar.e;
                vz4.a aVar = (vz4.a) eVar.get();
                mz4.b bVar3 = (mz4.b) dVar.f309843c.f250348l.get();
                vc.s.j(bVar3);
                vz4.b bVar4 = (vz4.b) dVar.f309860s.get();
                dcl.q qVar = new dcl.q(new aa0.i(), qw7.u.j(fVar));
                am2.a aVarA = dVar.f309846g.a();
                t70.b bVarG = eVar2.g();
                vc.s.j(bVarG);
                mm.d dVar2 = (mm.d) dVar.Y.get();
                xl2.f fVarJ = qw7.u.j(fVar);
                wli.x xVarD = ((s41.a) dVar.f309847h).d();
                s70.a aVarM = eVar2.m();
                vc.s.j(aVarM);
                return new vz4.l(aVar, bVar3, bVar4, qVar, aVarA, bVarG, dVar2, fVarJ, xVarD, aVarM, (yc0.a) dVar.Z.get());
            case 8:
                qc0.k kVar = (qc0.k) dVar.f309860s.get();
                wl2.f fVar2 = (wl2.f) dVar.f309862t.get();
                ifm.b bVar5 = (ifm.b) dVar.f309852m.get();
                com.revolut.feature.chooser.a aVar2 = new com.revolut.feature.chooser.a((com.revolut.feature.chooser.d) dVar.u.get(), (qi3.o) dVar.v.get());
                yc0.k kVar2 = (yc0.k) dVar.f309864w.get();
                aa0.f0 f0Var = (aa0.f0) dVar.f309865x.get();
                w80.b bVarJ = dVar.f309841b.j();
                vc.s.j(bVarJ);
                aa0.z zVar = new aa0.z(bVarJ);
                aa0.b bVar6 = (aa0.b) dVar.f309866y.get();
                aa0.c0 c0Var = (aa0.c0) dVar.z.get();
                aa0.k0 k0Var = (aa0.k0) dVar.A.get();
                aa0.i0 i0Var = new aa0.i0();
                aa0.b0 b0Var = (aa0.b0) dVar.D.get();
                aa0.h hVar = (aa0.h) dVar.E.get();
                aa0.n nVar = (aa0.n) dVar.F.get();
                aa0.d dVar3 = (aa0.d) dVar.G.get();
                aa0.p pVar = (aa0.p) dVar.H.get();
                aa0.l lVar = (aa0.l) dVar.I.get();
                aa0.m mVar = (aa0.m) dVar.J.get();
                aa0.a0 a0Var = (aa0.a0) dVar.K.get();
                aa0.i1 i1Var = (aa0.i1) dVar.L.get();
                aa0.l0 l0Var = (aa0.l0) dVar.M.get();
                aa0.e0 e0Var = (aa0.e0) dVar.N.get();
                aa0.j0 j0Var = (aa0.j0) dVar.O.get();
                aa0.j jVar = new aa0.j();
                aa0.t tVar = new aa0.t();
                dcl.q qVar2 = new dcl.q(new aa0.i(), qw7.u.j(dVar.e));
                aa0.s sVar = new aa0.s((ad0.a) dVar.P.get(), 1);
                aa0.f fVar3 = new aa0.f();
                aa0.g gVar = new aa0.g();
                aa0.u uVar = new aa0.u();
                aa0.g0 g0Var = new aa0.g0();
                aa0.q qVar3 = new aa0.q((ad0.a) dVar.P.get());
                aa0.s sVar2 = new aa0.s((ad0.a) dVar.P.get(), 0);
                aa0.k kVar3 = new aa0.k();
                aa0.a aVar3 = new aa0.a();
                aa0.d0 d0Var = new aa0.d0();
                com.google.firebase.messaging.t tVarH = dVar.h();
                eli.j jVarA = dVar.f.a();
                ca0.a aVar4 = new ca0.a();
                bd0.d dVar4 = (bd0.d) dVar.R.get();
                yc0.f fVar4 = (yc0.f) dVar.U.get();
                ad0.a aVar5 = (ad0.a) dVar.P.get();
                aa0.o oVar = new aa0.o();
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(6);
                builderBuilderWithExpectedSize.put(ExternalValidation.class, new ed0.d((wl2.a) dVar.V.get()));
                builderBuilderWithExpectedSize.put(MaxLengthValidation.class, new ed0.f());
                builderBuilderWithExpectedSize.put(MinLengthValidation.class, new ed0.h());
                builderBuilderWithExpectedSize.put(RegexValidation.class, new ed0.i((zzl.b) dVar.B.get()));
                builderBuilderWithExpectedSize.put(MinAmountValidation.class, new ed0.g());
                builderBuilderWithExpectedSize.put(MaxAmountValidation.class, new ed0.e());
                return new vz4.j(new qc0.j0(kVar, fVar2, bVar5, aVar2, kVar2, f0Var, zVar, bVar6, c0Var, k0Var, i0Var, b0Var, hVar, nVar, dVar3, pVar, lVar, mVar, a0Var, i1Var, l0Var, e0Var, j0Var, jVar, tVar, qVar2, sVar, fVar3, gVar, uVar, g0Var, qVar3, sVar2, kVar3, aVar3, d0Var, tVarH, jVarA, aVar4, dVar4, fVar4, aVar5, oVar, new dd0.c(builderBuilderWithExpectedSize.build()), new cd0.d()), (ifm.b) dVar.f309852m.get(), (rz4.b) dVar.W.get(), (vz4.b) dVar.f309860s.get());
            case 9:
                rz4.b interactor = (rz4.b) dVar.f309843c.f250354s.get();
                vc.s.j(interactor);
                b80.c connectivityRepository = dVar.f309841b.p();
                vc.s.j(connectivityRepository);
                vz4.b state = (vz4.b) dVar.f309860s.get();
                wz4.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(interactor, "interactor");
                Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
                Intrinsics.checkNotNullParameter(state, "state");
                return new cx3.a(interactor, connectivityRepository, new wp0.b(state, 13));
            case 10:
                x90.c cVar = dVar.d;
                qc0.k state2 = (qc0.k) dVar.f309860s.get();
                Intrinsics.checkNotNullParameter(state2, "state");
                vc.s.k(state2);
                return state2;
            case 11:
                x90.c cVar2 = dVar.d;
                qi3.b modelsProvider = new qi3.b((com.revolut.feature.chooser.d) dVar.u.get());
                Intrinsics.checkNotNullParameter(modelsProvider, "modelsProvider");
                return modelsProvider;
            case 12:
                x90.c cVar3 = dVar.d;
                l80.e eVarH = dVar.f309841b.h();
                vc.s.j(eVarH);
                return wpg.v.l(cVar3, eVarH);
            case 13:
                x90.c cVar4 = dVar.d;
                return new aa0.f0();
            case 14:
                x90.c cVar5 = dVar.d;
                return new aa0.b();
            case 15:
                x90.c cVar6 = dVar.d;
                return new aa0.c0();
            case 16:
                x90.c cVar7 = dVar.d;
                return new aa0.k0();
            case 17:
                x90.c cVar8 = dVar.d;
                z80.b bVarS = dVar.f309841b.s();
                vc.s.j(bVarS);
                return wpg.v.g(cVar8, bVarS, (aa0.y) dVar.C.get());
            case 18:
                return wpg.v.i(dVar.d, (zzl.b) dVar.B.get());
            case 19:
                wz4.a.Companion.getClass();
                return new zzl.c();
            case 20:
                x90.c cVar9 = dVar.d;
                return new aa0.h();
            case 21:
                x90.c cVar10 = dVar.d;
                return new aa0.n();
            case 22:
                return wpg.v.h(dVar.d, (aa0.y) dVar.C.get());
            case 23:
                x90.c cVar11 = dVar.d;
                return new aa0.p();
            case 24:
                x90.c cVar12 = dVar.d;
                return new aa0.l();
            case 25:
                x90.c cVar13 = dVar.d;
                return new aa0.m();
            case 26:
                x90.c cVar14 = dVar.d;
                return new aa0.a0();
            case 27:
                x90.c cVar15 = dVar.d;
                return new aa0.i1();
            case 28:
                x90.c cVar16 = dVar.d;
                return new aa0.l0();
            case 29:
                x90.c cVar17 = dVar.d;
                return new aa0.e0();
            case 30:
                x90.c cVar18 = dVar.d;
                return new aa0.j0();
            case 31:
                x90.c cVar19 = dVar.d;
                return new ad0.b();
            case 32:
                return new ym.d();
            case 33:
                x90.c cVar20 = dVar.d;
                return new bd0.e();
            case 34:
                return wpg.v.s(dVar.d, (yc0.b0) dVar.T.get());
            case 35:
                return wpg.v.u(dVar.d, (qc0.k) dVar.f309860s.get(), new smd.s((la0.c) dVar.S.get()));
            case 36:
                return wpg.v.e(dVar.d, (qc0.k) dVar.f309860s.get());
            case 37:
                x90.c cVar21 = dVar.d;
                aa0.w legacyBackendFlowAdapterInteractor = new aa0.w((wl2.f) dVar.f309862t.get(), dVar.f309846g.b());
                Intrinsics.checkNotNullParameter(legacyBackendFlowAdapterInteractor, "legacyBackendFlowAdapterInteractor");
                return legacyBackendFlowAdapterInteractor;
            case 38:
                rz4.b bVar7 = (rz4.b) dVar.f309843c.f250354s.get();
                vc.s.j(bVar7);
                return bVar7;
            case 39:
                return new mm.d();
            case 40:
                return wpg.v.c(dVar.d, (yc0.b0) dVar.T.get());
            case 41:
                return new vc0.a((qc0.j) dVar.f309842b0.get(), (qc0.k) dVar.f309860s.get(), (ln.a) dVar.f309858r.get(), qw7.u.j(dVar.e), (mm.d) dVar.Y.get(), dVar.h());
            case 42:
                return new vc0.b((ln.a) dVar.f309858r.get());
            case 43:
                return new vc0.c((qc0.k) dVar.f309860s.get(), (qc0.j) dVar.f309842b0.get(), (wl2.f) dVar.f309862t.get(), dVar.f.a(), new ca0.a(), dVar.h());
            case 44:
                x90.c cVar22 = dVar.d;
                qc0.j router = (qc0.j) dVar.f309842b0.get();
                Intrinsics.checkNotNullParameter(router, "router");
                vc.s.k(router);
                return router;
            case 45:
                return new sm.e();
            case 46:
                return new om.c();
            case 47:
                return new g3l.g();
            case 48:
                return new an.a();
            case 49:
                return new d4l.a();
            case 50:
                x90.c cVar23 = dVar.d;
                qc0.h state3 = (qc0.h) dVar.X.get();
                Intrinsics.checkNotNullParameter(state3, "state");
                vc.s.k(state3);
                return state3;
            case 51:
                wz4.a.Companion.getClass();
                return new t80.c(new e.a("ForbearanceApplication"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
            case 52:
                return wpg.v.d(dVar.d, (qc0.k) dVar.f309860s.get(), (la0.c) dVar.S.get(), ImmutableMap.of(WidgetProgressionItem.class, new z90.b()));
            case 53:
                Context context = dVar.i;
                wz4.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new p80.a(context);
            case 54:
                return wpg.v.t(dVar.d, (bd0.d) dVar.R.get());
            case 55:
                x90.c cVar24 = dVar.d;
                z70.a aVarF = dVar.f309841b.f();
                vc.s.j(aVarF);
                return wpg.v.p(cVar24, aVarF);
            case 56:
                x90.c cVar25 = dVar.d;
                return new yc0.w();
            case 57:
                x90.c cVar26 = dVar.d;
                qc0.j router2 = (qc0.j) dVar.f309842b0.get();
                Intrinsics.checkNotNullParameter(router2, "router");
                vc.s.k(router2);
                return router2;
            case 58:
                x90.c cVar27 = dVar.d;
                qc0.h state4 = (qc0.h) dVar.X.get();
                Intrinsics.checkNotNullParameter(state4, "state");
                vc.s.k(state4);
                return state4;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        xzl.a aVar = (xzl.a) this.f304787c;
        ljl.q1 q1Var = aVar.J;
        l70.e eVar = aVar.f310066w;
        opa.b bVar = aVar.f310065t;
        rkd.g gVar = aVar.f310055g;
        da3.j jVar = aVar.f;
        kmg.a aVar2 = aVar.f310052b;
        nib.c cVar = aVar.R;
        xmg.a aVar3 = aVar.f310062q;
        rg0.e eVar2 = aVar.k;
        an0.c cVar2 = aVar.f310061p;
        g8b.a aVar4 = aVar.f310057j;
        opa.c cVar3 = aVar.u;
        u06.a aVar5 = aVar.e;
        int i = this.f304786b;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            q06.d dVarA = aVar5.a();
            vc.s.j(dVarA);
            return new lhi.f0(dVarA);
        }
        ue7.e adoptionExperimentsPushMessageInteractor = (ue7.e) ((te7.b) aVar.f310050a).f270048n.get();
        vc.s.j(adoptionExperimentsPushMessageInteractor);
        omg.c adoptionJourneyPushMessageInterceptor = (omg.c) aVar2.f185863s.get();
        vc.s.j(adoptionJourneyPushMessageInterceptor);
        omg.g fincrimeChecklistPushMessageInterceptor = (omg.g) aVar2.f185864t.get();
        vc.s.j(fincrimeChecklistPushMessageInterceptor);
        rj1.e eVar3 = aVar.f310054c;
        qm.e eVarA = eVar3.a();
        CoroutineScope coroutineScopeA = eVar3.e.a();
        vc.s.j(coroutineScopeA);
        sj1.b advisedComponentsPushMessageInterceptor = new sj1.b(eVarA, coroutineScopeA);
        yd6.d appChallengePushInterceptor = (yd6.d) ((ee6.b) aVar.d).f125086n.get();
        vc.s.j(appChallengePushInterceptor);
        q06.d dVarA2 = aVar5.a();
        vc.s.j(dVarA2);
        l93.f fVarJ = jVar.j();
        vc.s.j(fVarJ);
        skd.i iVarC = gVar.c();
        gte.a aVarB = aVar.f310056h.b();
        vc.s.j(aVarB);
        om4.d0 d0VarB = aVar.i.b();
        lfm.c cVarB = aVar4.b();
        vc.s.j(cVarB);
        CoroutineScope coroutineScopeA2 = eVar2.a();
        vc.s.j(coroutineScopeA2);
        lhi.e cardStatusInterceptor = new lhi.e(dVarA2, fVarJ, iVarC, aVarB, d0VarB, cVarB, coroutineScopeA2);
        uu9.c chatPushMessageInterceptor = (uu9.c) aVar.f310058l.D.get();
        vc.s.j(chatPushMessageInterceptor);
        ko9.b paymentWidgetPushMessageInterceptor = (ko9.b) ((mo9.b) aVar.f310059m).f207587s.get();
        vc.s.j(paymentWidgetPushMessageInterceptor);
        xoj.a aVarA = aVar.f310060n.a();
        vc.s.j(aVarA);
        fk3.a aVarA2 = aVar.o.a();
        vc.s.j(aVarA2);
        zm0.c cVarJ = cVar2.j();
        vc.s.j(cVarJ);
        lfm.c cVarB2 = aVar4.b();
        vc.s.j(cVarB2);
        sri.m mVarD = aVar4.d();
        vc.s.j(mVarD);
        lhi.h checkLockStatusInterceptor = new lhi.h(aVarA, aVarA2, cVarJ, cVarB2, mVarD, new bng.b(aVar3.e(), 0));
        sh3.a aVarA3 = aVar.f310063r.a();
        vc.s.j(aVarA3);
        zm0.c cVarJ2 = cVar2.j();
        vc.s.j(cVarJ2);
        lfm.c cVarB3 = aVar4.b();
        vc.s.j(cVarB3);
        lhi.o checkoutOrdersPushInterceptor = new lhi.o(aVarA3, cVarJ2, cVarB3);
        wsg.n nVarB = aVar.f310064s.b();
        ifm.b bVarA = aVar4.a();
        vc.s.j(bVarA);
        lhi.k checkWalletInterceptor = new lhi.k(nVarB, bVarA);
        lpa.a contextualPromptPushInterceptor = (lpa.a) bVar.d.get();
        vc.s.j(contextualPromptPushInterceptor);
        b90.a aVarA4 = cVar3.a();
        vc.s.j(aVarA4);
        xr3.y yVar = (xr3.y) aVar.v.f282100t.get();
        vc.s.j(yVar);
        lhi.q creditPushInterceptor = new lhi.q(aVarA4, yVar);
        b90.a aVarA5 = cVar3.a();
        vc.s.j(aVarA5);
        q06.d dVarA3 = aVar5.a();
        vc.s.j(dVarA3);
        t70.g gVarO = eVar.o();
        vc.s.j(gVarO);
        ecm.q qVarA = aVar.f310067x.a();
        uli.f fVar = (uli.f) aVar.f310068y.f16836b.get();
        vc.s.j(fVar);
        lhi.u cryptoVolatilityPushInterceptor = new lhi.u(aVarA5, dVarA3, gVarO, qVarA, fVar);
        y5j.k commodityVolatilityPushInterceptor = (y5j.k) aVar.z.J.get();
        vc.s.j(commodityVolatilityPushInterceptor);
        b90.a aVarA6 = cVar3.a();
        vc.s.j(aVarA6);
        yf.c cVar4 = new yf.c((cl3.a) aVar.A.f290239w.get());
        lfm.c cVarB4 = aVar4.b();
        vc.s.j(cVarB4);
        lhi.x displayRegularPushInterceptor = new lhi.x(aVarA6, cVar4, cVarB4);
        lpg.b displaySharedVaultPushInterceptor = (lpg.b) ((wpg.l) aVar.B).G.get();
        vc.s.j(displaySharedVaultPushInterceptor);
        xa6.d donationsInterceptor = (xa6.d) aVar.C.X.get();
        vc.s.j(donationsInterceptor);
        as9.b groupPushMessageInterceptor = (as9.b) aVar.D.K.get();
        vc.s.j(groupPushMessageInterceptor);
        bc7.a homeNPSPushInterceptor = (bc7.a) aVar.E.f304014j.get();
        vc.s.j(homeNPSPushInterceptor);
        m30.j jVar2 = (m30.j) ((h30.n) aVar.F).Z.get();
        vc.s.j(jVar2);
        lhi.y inAppCallsPushInterceptor = new lhi.y(jVar2);
        hn8.b juniorQrCodePushInterceptor = (hn8.b) aVar.G.o.get();
        vc.s.j(juniorQrCodePushInterceptor);
        uw8.b kycPushInterceptor = (uw8.b) aVar.H.f325252x.get();
        vc.s.j(kycPushInterceptor);
        b90.a aVarA7 = cVar3.a();
        vc.s.j(aVarA7);
        lhi.b0 loanPushInterceptor = new lhi.b0(aVarA7, 0);
        b90.a aVarA8 = cVar3.a();
        vc.s.j(aVarA8);
        q06.d dVarA4 = aVar5.a();
        vc.s.j(dVarA4);
        lhi.x moneyRequestPushInterceptor = new lhi.x(aVarA8, dVarA4, aVar.I.g());
        bjl.f otpContentInteractor = (bjl.f) ((ljl.q0) q1Var).f196066k0.get();
        vc.s.j(otpContentInteractor);
        qpa.b pushMessagesInteractor = cVar3.b();
        vc.s.j(pushMessagesInteractor);
        sx9.a recentsUpdatePushInterceptor = (sx9.a) aVar.K.X.get();
        vc.s.j(recentsUpdatePushInterceptor);
        b90.a aVarA9 = cVar3.a();
        vc.s.j(aVarA9);
        lhi.b0 referralCampaignPushInterceptor = new lhi.b0(aVarA9, 1);
        c8c.a revolutPayPushInterceptor = (c8c.a) aVar.L.E.get();
        vc.s.j(revolutPayPushInterceptor);
        j2d.e sharedAlertsPushInterceptor = (j2d.e) aVar.M.k.get();
        vc.s.j(sharedAlertsPushInterceptor);
        q06.d dVarA5 = aVar5.a();
        vc.s.j(dVarA5);
        zm0.c cVarJ3 = cVar2.j();
        vc.s.j(cVarJ3);
        l93.f fVarJ2 = jVar.j();
        vc.s.j(fVarJ2);
        lfm.c cVarB5 = aVar4.b();
        vc.s.j(cVarB5);
        lhi.u suspiciousCardTransactionPushInterceptor = new lhi.u(dVarA5, cVarJ3, fVarJ2, cVarB5);
        q06.d dVarA6 = aVar5.a();
        vc.s.j(dVarA6);
        mri.w wVarA = ((ozl.a) aVar.N).a();
        vc.s.j(wVarA);
        lhi.k trackTransactionLocationInterceptor = new lhi.k(dVarA6, wVarA);
        lhi.f0 transactionsInterceptor = (lhi.f0) aVar.f310051a0.get();
        ang.f fVarE = aVar3.e();
        lfm.c cVarB6 = ((g8b.a) aVar3.f307251m).b();
        vc.s.j(cVarB6);
        ang.j userPushMessageInterceptor = new ang.j(fVarE, cVarB6);
        Context context = aVar.O.f203119a;
        m6h.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        WorkManager companion = WorkManager.INSTANCE.getInstance(context);
        vc.s.k(companion);
        l6h.a wealthGiaMarginCallInterceptor = new l6h.a(companion);
        zm0.c cVarJ4 = cVar2.j();
        vc.s.j(cVarJ4);
        lhi.y validPushInterceptor = new lhi.y(cVarJ4);
        rpa.b verificationPushInterceptor = bVar.a();
        vc.s.j(verificationPushInterceptor);
        jgi.d dVar = (jgi.d) aVar.P.f.get();
        vc.s.j(dVar);
        lhi.y walletPushUpdatesInterceptor = new lhi.y(dVar);
        q06.d dVarA7 = aVar5.a();
        vc.s.j(dVarA7);
        gq.f fVar2 = (gq.f) aVar.Q.o.get();
        vc.s.j(fVar2);
        CoroutineScope coroutineScopeA3 = eVar2.a();
        vc.s.j(coroutineScopeA3);
        lhi.e0 widgetUpdateInterceptor = new lhi.e0(dVarA7, fVar2, coroutineScopeA3);
        job.c savingsOnboardingInterceptor = (job.c) ((anb.n) cVar).J.get();
        vc.s.j(savingsOnboardingInterceptor);
        job.b savingsAccountsRefreshInterceptor = (job.b) ((anb.n) cVar).K.get();
        vc.s.j(savingsAccountsRefreshInterceptor);
        mkb.c savingsChallengeAccountsRefreshInterceptor = (mkb.c) ((vjb.b) aVar.S).f289683l.get();
        vc.s.j(savingsChallengeAccountsRefreshInterceptor);
        job.e savingsProductsRefreshInterceptor = (job.e) ((anb.n) cVar).L.get();
        vc.s.j(savingsProductsRefreshInterceptor);
        s6e.i0 subaccountPushMessageInterceptor = (s6e.i0) aVar.T.D.get();
        vc.s.j(subaccountPushMessageInterceptor);
        q06.d dVarA8 = aVar5.a();
        vc.s.j(dVarA8);
        b90.a aVarA10 = cVar3.a();
        vc.s.j(aVarA10);
        cx1.a aVar6 = (cx1.a) aVar.U.e.get();
        vc.s.j(aVar6);
        CoroutineScope coroutineScopeA4 = eVar2.a();
        vc.s.j(coroutineScopeA4);
        tz1.d apmPendingPaymentInterceptor = new tz1.d(dVarA8, aVarA10, aVar6, coroutineScopeA4);
        db3.b barcodeScannedPushInterceptor = (db3.b) aVar.V.f204068m.get();
        vc.s.j(barcodeScannedPushInterceptor);
        f0f.a externalCardBlockPushInterceptor = (f0f.a) aVar.W.f240057a.get();
        vc.s.j(externalCardBlockPushInterceptor);
        z70.a aVarF = eVar.f();
        vc.s.j(aVarF);
        lhi.a0 interactiveFeedUpdateInterceptor = new lhi.a0(aVarF);
        zkd.b slotManagerPushInterceptor = (zkd.b) gVar.L.get();
        vc.s.j(slotManagerPushInterceptor);
        l61.a aVarB2 = aVar3.b();
        vc.s.j(aVarB2);
        ifm.b bVarA2 = aVar4.a();
        vc.s.j(bVarA2);
        lhi.i0 companyChangePushInterceptor = new lhi.i0(aVarB2, bVarA2);
        fkl.h revolutSsoLogoutEventPushMessageInterceptor = (fkl.h) ((ljl.q0) q1Var).G.get();
        vc.s.j(revolutSsoLogoutEventPushMessageInterceptor);
        com.revolut.feature.junior_progression.impl.push.a juniorProgressionPushInterceptor = new com.revolut.feature.junior_progression.impl.push.a((WorkManager) ((jk8.a) aVar.X).f175129l.get());
        a40.b cxChatPushMessagesInterceptor = aVar.Y.a();
        vc.s.j(cxChatPushMessagesInterceptor);
        rtj.g gVar2 = aVar.Z;
        stj.h hVar = (stj.h) gVar2.f257288n.get();
        CoroutineScope coroutineScopeA5 = gVar2.f.a();
        vc.s.j(coroutineScopeA5);
        lhi.i0 rewardsHubPushInterceptor = new lhi.i0(hVar, coroutineScopeA5);
        Intrinsics.checkNotNullParameter(adoptionExperimentsPushMessageInteractor, "adoptionExperimentsPushMessageInteractor");
        Intrinsics.checkNotNullParameter(adoptionJourneyPushMessageInterceptor, "adoptionJourneyPushMessageInterceptor");
        Intrinsics.checkNotNullParameter(fincrimeChecklistPushMessageInterceptor, "fincrimeChecklistPushMessageInterceptor");
        Intrinsics.checkNotNullParameter(advisedComponentsPushMessageInterceptor, "advisedComponentsPushMessageInterceptor");
        Intrinsics.checkNotNullParameter(appChallengePushInterceptor, "appChallengePushInterceptor");
        Intrinsics.checkNotNullParameter(cardStatusInterceptor, "cardStatusInterceptor");
        Intrinsics.checkNotNullParameter(chatPushMessageInterceptor, "chatPushMessageInterceptor");
        Intrinsics.checkNotNullParameter(paymentWidgetPushMessageInterceptor, "paymentWidgetPushMessageInterceptor");
        Intrinsics.checkNotNullParameter(checkLockStatusInterceptor, "checkLockStatusInterceptor");
        Intrinsics.checkNotNullParameter(checkoutOrdersPushInterceptor, "checkoutOrdersPushInterceptor");
        Intrinsics.checkNotNullParameter(checkWalletInterceptor, "checkWalletInterceptor");
        Intrinsics.checkNotNullParameter(contextualPromptPushInterceptor, "contextualPromptPushInterceptor");
        Intrinsics.checkNotNullParameter(creditPushInterceptor, "creditPushInterceptor");
        Intrinsics.checkNotNullParameter(cryptoVolatilityPushInterceptor, "cryptoVolatilityPushInterceptor");
        Intrinsics.checkNotNullParameter(commodityVolatilityPushInterceptor, "commodityVolatilityPushInterceptor");
        Intrinsics.checkNotNullParameter(displayRegularPushInterceptor, "displayRegularPushInterceptor");
        Intrinsics.checkNotNullParameter(displaySharedVaultPushInterceptor, "displaySharedVaultPushInterceptor");
        Intrinsics.checkNotNullParameter(donationsInterceptor, "donationsInterceptor");
        Intrinsics.checkNotNullParameter(groupPushMessageInterceptor, "groupPushMessageInterceptor");
        Intrinsics.checkNotNullParameter(homeNPSPushInterceptor, "homeNPSPushInterceptor");
        Intrinsics.checkNotNullParameter(inAppCallsPushInterceptor, "inAppCallsPushInterceptor");
        Intrinsics.checkNotNullParameter(juniorQrCodePushInterceptor, "juniorQrCodePushInterceptor");
        Intrinsics.checkNotNullParameter(kycPushInterceptor, "kycPushInterceptor");
        Intrinsics.checkNotNullParameter(loanPushInterceptor, "loanPushInterceptor");
        Intrinsics.checkNotNullParameter(moneyRequestPushInterceptor, "moneyRequestPushInterceptor");
        Intrinsics.checkNotNullParameter(otpContentInteractor, "otpContentInteractor");
        Intrinsics.checkNotNullParameter(pushMessagesInteractor, "pushMessagesInteractor");
        Intrinsics.checkNotNullParameter(recentsUpdatePushInterceptor, "recentsUpdatePushInterceptor");
        Intrinsics.checkNotNullParameter(referralCampaignPushInterceptor, "referralCampaignPushInterceptor");
        Intrinsics.checkNotNullParameter(revolutPayPushInterceptor, "revolutPayPushInterceptor");
        Intrinsics.checkNotNullParameter(sharedAlertsPushInterceptor, "sharedAlertsPushInterceptor");
        Intrinsics.checkNotNullParameter(suspiciousCardTransactionPushInterceptor, "suspiciousCardTransactionPushInterceptor");
        Intrinsics.checkNotNullParameter(trackTransactionLocationInterceptor, "trackTransactionLocationInterceptor");
        Intrinsics.checkNotNullParameter(transactionsInterceptor, "transactionsInterceptor");
        Intrinsics.checkNotNullParameter(userPushMessageInterceptor, "userPushMessageInterceptor");
        Intrinsics.checkNotNullParameter(wealthGiaMarginCallInterceptor, "wealthGiaMarginCallInterceptor");
        Intrinsics.checkNotNullParameter(validPushInterceptor, "validPushInterceptor");
        Intrinsics.checkNotNullParameter(verificationPushInterceptor, "verificationPushInterceptor");
        Intrinsics.checkNotNullParameter(walletPushUpdatesInterceptor, "walletPushUpdatesInterceptor");
        Intrinsics.checkNotNullParameter(widgetUpdateInterceptor, "widgetUpdateInterceptor");
        Intrinsics.checkNotNullParameter(savingsOnboardingInterceptor, "savingsOnboardingInterceptor");
        Intrinsics.checkNotNullParameter(savingsAccountsRefreshInterceptor, "savingsAccountsRefreshInterceptor");
        Intrinsics.checkNotNullParameter(savingsChallengeAccountsRefreshInterceptor, "savingsChallengeAccountsRefreshInterceptor");
        Intrinsics.checkNotNullParameter(savingsProductsRefreshInterceptor, "savingsProductsRefreshInterceptor");
        Intrinsics.checkNotNullParameter(subaccountPushMessageInterceptor, "subaccountPushMessageInterceptor");
        Intrinsics.checkNotNullParameter(apmPendingPaymentInterceptor, "apmPendingPaymentInterceptor");
        Intrinsics.checkNotNullParameter(barcodeScannedPushInterceptor, "barcodeScannedPushInterceptor");
        Intrinsics.checkNotNullParameter(externalCardBlockPushInterceptor, "externalCardBlockPushInterceptor");
        Intrinsics.checkNotNullParameter(interactiveFeedUpdateInterceptor, "interactiveFeedUpdateInterceptor");
        Intrinsics.checkNotNullParameter(slotManagerPushInterceptor, "slotManagerPushInterceptor");
        Intrinsics.checkNotNullParameter(companyChangePushInterceptor, "companyChangePushInterceptor");
        Intrinsics.checkNotNullParameter(revolutSsoLogoutEventPushMessageInterceptor, "revolutSsoLogoutEventPushMessageInterceptor");
        Intrinsics.checkNotNullParameter(juniorProgressionPushInterceptor, "juniorProgressionPushInterceptor");
        Intrinsics.checkNotNullParameter(cxChatPushMessagesInterceptor, "cxChatPushMessagesInterceptor");
        Intrinsics.checkNotNullParameter(rewardsHubPushInterceptor, "rewardsHubPushInterceptor");
        List listK = zhm.v.k(revolutSsoLogoutEventPushMessageInterceptor, recentsUpdatePushInterceptor, otpContentInteractor, contextualPromptPushInterceptor, verificationPushInterceptor, checkoutOrdersPushInterceptor, trackTransactionLocationInterceptor, homeNPSPushInterceptor, advisedComponentsPushMessageInterceptor, juniorQrCodePushInterceptor, adoptionExperimentsPushMessageInteractor, walletPushUpdatesInterceptor, userPushMessageInterceptor, adoptionJourneyPushMessageInterceptor, fincrimeChecklistPushMessageInterceptor, inAppCallsPushInterceptor, savingsOnboardingInterceptor, savingsAccountsRefreshInterceptor, savingsChallengeAccountsRefreshInterceptor, savingsProductsRefreshInterceptor, rewardsHubPushInterceptor, subaccountPushMessageInterceptor, barcodeScannedPushInterceptor, externalCardBlockPushInterceptor, interactiveFeedUpdateInterceptor, juniorProgressionPushInterceptor, kycPushInterceptor, slotManagerPushInterceptor, cxChatPushMessagesInterceptor, companyChangePushInterceptor, wealthGiaMarginCallInterceptor, validPushInterceptor, pushMessagesInteractor, appChallengePushInterceptor, checkLockStatusInterceptor, checkWalletInterceptor, revolutPayPushInterceptor, loanPushInterceptor, creditPushInterceptor, suspiciousCardTransactionPushInterceptor, displaySharedVaultPushInterceptor, moneyRequestPushInterceptor, referralCampaignPushInterceptor, cryptoVolatilityPushInterceptor, commodityVolatilityPushInterceptor, chatPushMessageInterceptor, paymentWidgetPushMessageInterceptor, groupPushMessageInterceptor, apmPendingPaymentInterceptor, displayRegularPushInterceptor, transactionsInterceptor, widgetUpdateInterceptor, donationsInterceptor, sharedAlertsPushInterceptor, cardStatusInterceptor);
        vc.s.k(listK);
        return listK;
    }

    private final Object c() {
        ymg.a aVar = (ymg.a) this.f304787c;
        ee0.a aVar2 = aVar.f314988a;
        int i = this.f304786b;
        if (i == 0) {
            hng.b bVar = (hng.b) aVar.f.get();
            asi.d dVarC = ((j51.a) aVar.f314990c).c();
            vc.s.j(dVarC);
            return new cng.b(bVar, dVarC);
        }
        if (i == 1) {
            return new hng.b((ne0.j) aVar.e.get(), (ue0.c) aVar.d.get());
        }
        if (i != 2) {
            if (i == 3) {
                return new ne0.d();
            }
            throw new AssertionError(i);
        }
        je0.d mapper = aVar2.d();
        vc.s.j(mapper);
        yk0.a databaseSessionProvider = aVar.f314989b.b();
        vc.s.j(databaseSessionProvider);
        xe0.f storageFactory = aVar2.f();
        vc.s.j(storageFactory);
        ymg.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "user_selected_registered_identity", mapper, 0, null, 56);
    }

    private final Object d() {
        yn0.a aVar = (yn0.a) this.f304787c;
        l70.e eVar = aVar.f315075b;
        ee0.a aVar2 = aVar.f315074a;
        int i = this.f304786b;
        if (i == 0) {
            ue0.c cVar = (ue0.c) aVar.d.get();
            ne0.j jVar = (ne0.j) aVar.e.get();
            b80.c cVarP = eVar.p();
            vc.s.j(cVarP);
            StringsOtaService stringsOtaService = (StringsOtaService) aVar.f.get();
            qd0.b bVarN = eVar.n();
            vc.s.j(bVarN);
            return new zn0.d(cVar, jVar, cVarP, stringsOtaService, bVarN);
        }
        if (i == 1) {
            je0.d objectMapper = aVar2.b();
            vc.s.j(objectMapper);
            xe0.f storageFactory = aVar2.f();
            vc.s.j(storageFactory);
            yn0.c.Companion.getClass();
            Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
            Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
            return xe0.f.e(storageFactory, "storage_strings_ota.pref", objectMapper, 12);
        }
        if (i == 2) {
            return new ne0.d();
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        Retrofit retrofit = ((nj0.d) aVar.f315076c).f();
        yn0.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(StringsOtaService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        StringsOtaService stringsOtaService2 = (StringsOtaService) objCreate;
        vc.s.k(stringsOtaService2);
        return stringsOtaService2;
    }

    private final Object e() {
        int i = this.f304786b;
        if (i == 0) {
            return new oq5.i((cli.n) ((yo5.q) this.f304787c).f315574a.get());
        }
        if (i == 1) {
            return new oq5.j();
        }
        throw new AssertionError(i);
    }

    private final Object f() {
        ysb.b bVar = (ysb.b) this.f304787c;
        int i = this.f304786b;
        if (i != 0) {
            if (i == 1) {
                return new atb.d(bVar.f316433b.e());
            }
            throw new AssertionError(i);
        }
        gte.a aVarB = bVar.f316432a.b();
        vc.s.j(aVarB);
        return new atb.b(aVarB);
    }

    private final Object g() {
        ysb.c cVar = (ysb.c) this.f304787c;
        gvh.a aVar = cVar.e;
        int i = this.f304786b;
        if (i == 0) {
            mt8.d dVarB = cVar.f316435a.b();
            vc.s.j(dVarB);
            return new atb.a(dVarB);
        }
        if (i == 1) {
            return new btb.c(cVar.f316436b.b());
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    throw new AssertionError(i);
                }
                zsb.d.Companion.getClass();
                e.a aVar2 = h80.e.f149935b;
                vc.s.k(aVar2);
                return aVar2;
            }
            Lifecycle lifecycle = (Lifecycle) cVar.f316442m.get();
            z70.a aVarF = cVar.f316439h.f();
            vc.s.j(aVarF);
            gte.a aVarB = cVar.i.b();
            vc.s.j(aVarB);
            return new btb.q(lifecycle, aVarF, aVarB);
        }
        fne.b bVar = (fne.b) cVar.f316437c.f162890r.get();
        vc.s.j(bVar);
        btb.r rVar = new btb.r();
        j89.a aVar3 = (j89.a) cVar.d.u.get();
        vc.s.j(aVar3);
        qil.a aVar4 = (qil.a) aVar.f147174q.get();
        vc.s.j(aVar4);
        btb.b bVar2 = new btb.b();
        jvh.a aVarA = aVar.a();
        vc.s.j(aVarA);
        kma.b bVar3 = (kma.b) cVar.f.f136212g.get();
        vc.s.j(bVar3);
        return new btb.l(bVar, rVar, aVar3, aVar4, bVar2, aVarA, bVar3, cVar.f316438g.a());
    }

    @Override // phm.a
    public final Object get() {
        Object mVar;
        qc0.j router;
        Object hVar;
        Object bVar;
        Object lVar;
        Object mVar2;
        Object dVar;
        Object aVar;
        switch (this.f304785a) {
            case 0:
                x0 x0Var = (x0) this.f304787c;
                IbanScreenContract$InputData ibanScreenContract$InputData = x0Var.f305156b;
                int i = this.f304786b;
                if (i == 0) {
                    return new vn6.i(ibanScreenContract$InputData, (cli.n) x0Var.d.get());
                }
                if (i == 1) {
                    return new vn6.k(ibanScreenContract$InputData, b3j.f.a(), b3j.g.a());
                }
                throw new AssertionError(i);
            case 1:
                y1 y1Var = (y1) this.f304787c;
                int i2 = this.f304786b;
                if (i2 == 0) {
                    return new bh6.d();
                }
                if (i2 == 1) {
                    return new bh6.i();
                }
                if (i2 == 2) {
                    wsg.n nVarB = y1Var.f305172b.b();
                    z71.a aVarF = ((c21.b) y1Var.f305173c).f();
                    vc.s.j(aVarF);
                    return new bh6.a(nVarB, aVarF);
                }
                if (i2 != 3) {
                    throw new AssertionError(i2);
                }
                f80.a aVarX = y1Var.d.x();
                vc.s.j(aVarX);
                return new bh6.j(aVarX);
            case 2:
                int i3 = this.f304786b;
                if (i3 == 0) {
                    return new ui6.e((cli.n) ((a2) this.f304787c).f304788a.get());
                }
                if (i3 == 1) {
                    return new tyc.l(new gi6.a());
                }
                throw new AssertionError(i3);
            case 3:
                j2 j2Var = (j2) this.f304787c;
                ConsentDetailsScreenContract$InputData consentDetailsScreenContract$InputData = j2Var.f304903a;
                w2 w2Var = j2Var.f304904b;
                int i5 = this.f304786b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new AssertionError(i5);
                    }
                    gl6.g gVar = new gl6.g();
                    m35.r rVarO = w2Var.f305149t.o();
                    vc.s.j(rVarO);
                    gte.a aVarB = w2Var.f305145p.b();
                    vc.s.j(aVarB);
                    c91.a aVarA = w2Var.u.a();
                    vc.s.j(aVarA);
                    return new ll6.l(new nl6.c(gVar, rVarO, aVarB, aVarA), consentDetailsScreenContract$InputData);
                }
                cli.n nVar = (cli.n) j2Var.f304905c.get();
                g6e.d dVarB = w2Var.v.b();
                vc.s.j(dVarB);
                wsg.n nVarB2 = w2Var.f305144n.b();
                al4.n nVarS = w2Var.f305150w.s();
                vc.s.j(nVarS);
                g48.r0 r0VarC = w2Var.f305148s.c();
                ang.f fVarE = w2Var.f305151x.e();
                bd3.a aVarA2 = w2Var.f305152y.a();
                vc.s.j(aVarA2);
                twg.c cVarA = w2Var.z.a();
                hj8.a aVarA3 = w2Var.A.a();
                vc.s.j(aVarA3);
                y45.i iVarI = w2Var.f305149t.i();
                djb.n nVarA = w2Var.B.a();
                vc.s.j(nVarA);
                psi.a aVarA4 = w2Var.C.a();
                vc.s.j(aVarA4);
                gte.a aVarB2 = w2Var.f305145p.b();
                vc.s.j(aVarB2);
                return new com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details.a(nVar, consentDetailsScreenContract$InputData, new fi6.h(dVarB, nVarB2, nVarS, r0VarC, fVarE, aVarA2, cVarA, aVarA3, iVarI, nVarA, aVarA4, aVarB2), new r10.a(w2Var.D.a(), w2Var.f305144n.b()));
            case 4:
                d3 d3Var = (d3) this.f304787c;
                int i6 = this.f304786b;
                if (i6 == 0) {
                    return new yi6.e((cli.n) d3Var.f304826c.get());
                }
                if (i6 == 1) {
                    return new yi6.f(d3Var.f304825b, new gl6.g());
                }
                throw new AssertionError(i6);
            case 5:
                d3 d3Var2 = (d3) this.f304787c;
                int i21 = this.f304786b;
                if (i21 == 0) {
                    return new yi6.e((cli.n) d3Var2.f304826c.get());
                }
                if (i21 == 1) {
                    return new yi6.f(d3Var2.f304825b, new gl6.g());
                }
                throw new AssertionError(i21);
            case 6:
                i3 i3Var = (i3) this.f304787c;
                int i22 = this.f304786b;
                if (i22 == 0) {
                    return new am6.f((cli.n) i3Var.f304896c.get());
                }
                if (i22 == 1) {
                    return new am6.h(i3Var.f304895b);
                }
                throw new AssertionError(i22);
            case 7:
                i3 i3Var2 = (i3) this.f304787c;
                int i32 = this.f304786b;
                if (i32 == 0) {
                    return new am6.f((cli.n) i3Var2.f304896c.get());
                }
                if (i32 == 1) {
                    return new am6.h(i3Var2.f304895b);
                }
                throw new AssertionError(i32);
            case 8:
                xg4.d dVar2 = (xg4.d) this.f304787c;
                int i33 = this.f304786b;
                switch (i33) {
                    case 0:
                        hri.b bVar2 = dVar2.f305542a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar3 = dVar2.f305542a;
                        return new iri.j();
                    case 2:
                        return new cn.e();
                    case 3:
                        return new um.c();
                    case 4:
                        dVar2.getClass();
                        return new hn.h(ImmutableSet.copyOf((Collection) hn.f.a()));
                    case 5:
                        return new ln.c();
                    case 6:
                        dVar2.getClass();
                        return new wg4.a(new p54.n(new qc0.g1(new com.revolut.feature.chooser.e(), new tc0.c(), new onh.b(new BackendFlowSnapshotsCompressor())), new c84.f()), new j64.c(new c84.f()));
                    case 7:
                        uq3.b bVar4 = dVar2.f305546c;
                        l70.e eVar = dVar2.f305544b;
                        r54.d dVar3 = dVar2.f305550h;
                        xq3.j jVarH = bVar4.h();
                        vc.s.j(jVarH);
                        rz3.c cVarG = ((dw3.c1) dVar2.d).g();
                        vc.s.j(cVarG);
                        ii4.o oVar = (ii4.o) dVar2.A.get();
                        qc0.h hVar2 = (qc0.h) dVar2.f305548e0.get();
                        dcl.q qVar = new dcl.q(new aa0.i(), qw7.u.i(dVar3));
                        p54.e eVar2 = (p54.e) dVar2.f305568w.get();
                        am2.a aVarA5 = dVar2.f305552j.a();
                        t70.b bVarG = eVar.g();
                        vc.s.j(bVarG);
                        xl2.f fVarI = qw7.u.i(dVar3);
                        mm.d dVar4 = (mm.d) dVar2.f0.get();
                        wli.x xVarD = ((s41.a) dVar2.k).d();
                        s70.a aVarM = eVar.m();
                        vc.s.j(aVarM);
                        mVar = new p54.m(jVarH, cVarG, oVar, hVar2, qVar, eVar2, aVarA5, bVarG, fVarI, dVar4, xVarD, aVarM, (yc0.a) dVar2.g0.get());
                        return mVar;
                    case 8:
                        return new ii4.z((li4.a) dVar2.z.get());
                    case 9:
                        return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) dVar2.f305570x.get(), li4.e.class, (li4.b) dVar2.f305572y.get()));
                    case 10:
                        xq3.j jVarH2 = dVar2.f305546c.h();
                        vc.s.j(jVarH2);
                        return new li4.c(jVarH2);
                    case 11:
                        uq3.b bVar5 = dVar2.f305546c;
                        uq3.b bVar6 = dVar2.f305546c;
                        xq3.j jVarH3 = bVar5.h();
                        vc.s.j(jVarH3);
                        xq3.c cVarF = bVar6.f();
                        vc.s.j(cVarF);
                        sp3.a aVarM2 = bVar6.m();
                        vc.s.j(aVarM2);
                        sf0.h hVarB = dVar2.e.b();
                        vc.s.j(hVarB);
                        return new ji4.b(jVarH3, cVarF, aVarM2, new py3.e(hVarB));
                    case 12:
                        qc0.k kVar = (qc0.k) dVar2.f305568w.get();
                        wl2.f fVar = (wl2.f) dVar2.B.get();
                        ifm.b bVar7 = (ifm.b) dVar2.f305560q.get();
                        com.revolut.feature.chooser.a aVar2 = new com.revolut.feature.chooser.a((com.revolut.feature.chooser.d) dVar2.C.get(), (qi3.o) dVar2.D.get());
                        yc0.k kVar2 = (yc0.k) dVar2.E.get();
                        aa0.f0 f0Var = (aa0.f0) dVar2.F.get();
                        w80.b bVarJ = dVar2.f305544b.j();
                        vc.s.j(bVarJ);
                        aa0.z zVar = new aa0.z(bVarJ);
                        aa0.b bVar8 = (aa0.b) dVar2.G.get();
                        aa0.c0 c0Var = (aa0.c0) dVar2.H.get();
                        aa0.k0 k0Var = (aa0.k0) dVar2.I.get();
                        aa0.i0 i0Var = new aa0.i0();
                        aa0.b0 b0Var = (aa0.b0) dVar2.L.get();
                        aa0.h hVar3 = (aa0.h) dVar2.M.get();
                        aa0.n nVar2 = (aa0.n) dVar2.N.get();
                        aa0.d dVar5 = (aa0.d) dVar2.O.get();
                        aa0.p pVar = (aa0.p) dVar2.P.get();
                        aa0.l lVar2 = (aa0.l) dVar2.Q.get();
                        aa0.m mVar3 = (aa0.m) dVar2.R.get();
                        aa0.a0 a0Var = (aa0.a0) dVar2.S.get();
                        aa0.i1 i1Var = (aa0.i1) dVar2.T.get();
                        aa0.l0 l0Var = (aa0.l0) dVar2.U.get();
                        aa0.e0 e0Var = (aa0.e0) dVar2.V.get();
                        aa0.j0 j0Var = (aa0.j0) dVar2.W.get();
                        aa0.j jVar = new aa0.j();
                        aa0.t tVar = new aa0.t();
                        dcl.q qVar2 = new dcl.q(new aa0.i(), qw7.u.i(dVar2.f305550h));
                        aa0.s sVar = new aa0.s((ad0.a) dVar2.X.get(), 1);
                        aa0.f fVar2 = new aa0.f();
                        aa0.g gVar2 = new aa0.g();
                        aa0.u uVar = new aa0.u();
                        aa0.g0 g0Var = new aa0.g0();
                        aa0.q qVar3 = new aa0.q((ad0.a) dVar2.X.get());
                        aa0.s sVar2 = new aa0.s((ad0.a) dVar2.X.get(), 0);
                        aa0.k kVar3 = new aa0.k();
                        aa0.a aVar3 = new aa0.a();
                        aa0.d0 d0Var = new aa0.d0();
                        com.google.firebase.messaging.t tVarD = dVar2.d();
                        eli.j jVarA = dVar2.i.a();
                        ca0.a aVar4 = new ca0.a();
                        bd0.d dVar6 = (bd0.d) dVar2.Z.get();
                        yc0.f fVar3 = (yc0.f) dVar2.c0.get();
                        ad0.a aVar5 = (ad0.a) dVar2.X.get();
                        aa0.o oVar2 = new aa0.o();
                        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(6);
                        builderBuilderWithExpectedSize.put(ExternalValidation.class, new ed0.d((wl2.a) dVar2.f305547d0.get()));
                        builderBuilderWithExpectedSize.put(MaxLengthValidation.class, new ed0.f());
                        builderBuilderWithExpectedSize.put(MinLengthValidation.class, new ed0.h());
                        builderBuilderWithExpectedSize.put(RegexValidation.class, new ed0.i((zzl.b) dVar2.J.get()));
                        builderBuilderWithExpectedSize.put(MinAmountValidation.class, new ed0.g());
                        builderBuilderWithExpectedSize.put(MaxAmountValidation.class, new ed0.e());
                        return new qc0.j0(kVar, fVar, bVar7, aVar2, kVar2, f0Var, zVar, bVar8, c0Var, k0Var, i0Var, b0Var, hVar3, nVar2, dVar5, pVar, lVar2, mVar3, a0Var, i1Var, l0Var, e0Var, j0Var, jVar, tVar, qVar2, sVar, fVar2, gVar2, uVar, g0Var, qVar3, sVar2, kVar3, aVar3, d0Var, tVarD, jVarA, aVar4, dVar6, fVar3, aVar5, oVar2, new dd0.c(builderBuilderWithExpectedSize.build()), new cd0.d());
                    case 13:
                        qv3.a aVar6 = (qv3.a) dVar2.f305568w.get();
                        zx3.a aVar7 = (zx3.a) ((dw3.c1) dVar2.d).W0.get();
                        vc.s.j(aVar7);
                        b80.c cVarP = dVar2.f305544b.p();
                        vc.s.j(cVarP);
                        return new cx3.a(aVar6, aVar7, cVarP);
                    case 14:
                        x90.c cVar = dVar2.f;
                        qc0.k state = (qc0.k) dVar2.f305568w.get();
                        Intrinsics.checkNotNullParameter(state, "state");
                        vc.s.k(state);
                        return state;
                    case 15:
                        x90.c cVar2 = dVar2.f;
                        qi3.b modelsProvider = new qi3.b((com.revolut.feature.chooser.d) dVar2.C.get());
                        Intrinsics.checkNotNullParameter(modelsProvider, "modelsProvider");
                        return modelsProvider;
                    case 16:
                        x90.c cVar3 = dVar2.f;
                        l80.e eVarH = dVar2.f305544b.h();
                        vc.s.j(eVarH);
                        return wpg.v.l(cVar3, eVarH);
                    case 17:
                        x90.c cVar4 = dVar2.f;
                        return new aa0.f0();
                    case 18:
                        x90.c cVar5 = dVar2.f;
                        return new aa0.b();
                    case 19:
                        x90.c cVar6 = dVar2.f;
                        return new aa0.c0();
                    case 20:
                        x90.c cVar7 = dVar2.f;
                        return new aa0.k0();
                    case 21:
                        x90.c cVar8 = dVar2.f;
                        z80.b bVarS = dVar2.f305544b.s();
                        vc.s.j(bVarS);
                        return wpg.v.g(cVar8, bVarS, (aa0.y) dVar2.K.get());
                    case 22:
                        return wpg.v.i(dVar2.f, (zzl.b) dVar2.J.get());
                    case 23:
                        r54.e eVar3 = dVar2.f305549g;
                        return new zzl.c();
                    case 24:
                        x90.c cVar9 = dVar2.f;
                        return new aa0.h();
                    case 25:
                        x90.c cVar10 = dVar2.f;
                        return new aa0.n();
                    case 26:
                        return wpg.v.h(dVar2.f, (aa0.y) dVar2.K.get());
                    case 27:
                        x90.c cVar11 = dVar2.f;
                        return new aa0.p();
                    case 28:
                        x90.c cVar12 = dVar2.f;
                        return new aa0.l();
                    case 29:
                        x90.c cVar13 = dVar2.f;
                        return new aa0.m();
                    case 30:
                        x90.c cVar14 = dVar2.f;
                        return new aa0.a0();
                    case 31:
                        x90.c cVar15 = dVar2.f;
                        return new aa0.i1();
                    case 32:
                        x90.c cVar16 = dVar2.f;
                        return new aa0.l0();
                    case 33:
                        x90.c cVar17 = dVar2.f;
                        return new aa0.e0();
                    case 34:
                        x90.c cVar18 = dVar2.f;
                        return new aa0.j0();
                    case 35:
                        x90.c cVar19 = dVar2.f;
                        return new ad0.b();
                    case 36:
                        return new ym.d();
                    case 37:
                        x90.c cVar20 = dVar2.f;
                        return new bd0.e();
                    case 38:
                        return wpg.v.s(dVar2.f, (yc0.b0) dVar2.f305545b0.get());
                    case 39:
                        return wpg.v.u(dVar2.f, (qc0.k) dVar2.f305568w.get(), new smd.s((la0.c) dVar2.f305543a0.get()));
                    case 40:
                        return wpg.v.e(dVar2.f, (qc0.k) dVar2.f305568w.get());
                    case 41:
                        x90.c cVar21 = dVar2.f;
                        aa0.w legacyBackendFlowAdapterInteractor = new aa0.w((wl2.f) dVar2.B.get(), dVar2.f305552j.b());
                        Intrinsics.checkNotNullParameter(legacyBackendFlowAdapterInteractor, "legacyBackendFlowAdapterInteractor");
                        return legacyBackendFlowAdapterInteractor;
                    case 42:
                        return new mm.d();
                    case 43:
                        return wpg.v.c(dVar2.f, (yc0.b0) dVar2.f305545b0.get());
                    case 44:
                        return new g3l.g();
                    case 45:
                        e4m.e eVar4 = dVar2.f305568w;
                        r54.d dVar7 = dVar2.f305550h;
                        return new du8.b(new jt0.b((qc0.k) eVar4.get(), (p54.e) dVar2.f305568w.get(), qw7.u.i(dVar7)), (mm.d) dVar2.f0.get(), new vc0.a((qc0.j) dVar2.f305551h0.get(), (qc0.k) dVar2.f305568w.get(), (ln.a) dVar2.v.get(), qw7.u.i(dVar7), (mm.d) dVar2.f0.get(), dVar2.d()));
                    case 46:
                        return new ew2.v0((qv3.a) dVar2.f305568w.get(), (mm.d) dVar2.f0.get());
                    case 47:
                        return new vc0.c((qc0.k) dVar2.f305568w.get(), (qc0.j) dVar2.f305551h0.get(), (wl2.f) dVar2.B.get(), dVar2.i.a(), new ca0.a(), dVar2.d());
                    case 48:
                        e4m.e eVar5 = dVar2.m0;
                        dw3.e eVar6 = dVar2.d;
                        an.a aVar8 = (an.a) eVar5.get();
                        ln.a aVar9 = (ln.a) dVar2.v.get();
                        g3l.a aVar10 = (g3l.a) dVar2.i0.get();
                        hz3.c cVarB = ((dw3.c1) eVar6).b();
                        ow3.e eVar7 = (ow3.e) ((dw3.c1) eVar6).Y0.get();
                        vc.s.j(eVar7);
                        j64.b bVar9 = (j64.b) dVar2.f305568w.get();
                        mri.w wVarA = ((ozl.a) dVar2.f305554l).a();
                        vc.s.j(wVarA);
                        eq3.b bVar10 = (eq3.b) dVar2.f305557n0.get();
                        wli.x xVarD2 = ((s41.a) dVar2.k).d();
                        hw3.c cVar22 = (hw3.c) ((dw3.c1) eVar6).f118472s0.get();
                        vc.s.j(cVar22);
                        aq3.a aVarE = dVar2.f305546c.e();
                        vc.s.j(aVarE);
                        mVar = new k64.h(aVar8, aVar9, aVar10, cVarB, eVar7, bVar9, wVarA, bVar10, xVarD2, cVar22, aVarE, dVar2.d());
                        return mVar;
                    case 49:
                        return new an.a();
                    case 50:
                        return new ow3.a();
                    case 51:
                        x90.c cVar23 = dVar2.f;
                        router = (qc0.j) dVar2.f305551h0.get();
                        Intrinsics.checkNotNullParameter(router, "router");
                        vc.s.k(router);
                        return router;
                    case 52:
                        return new sm.e();
                    case 53:
                        return new om.c();
                    case 54:
                        return new d4l.a();
                    case 55:
                        x90.c cVar24 = dVar2.f;
                        qc0.h state2 = (qc0.h) dVar2.f305548e0.get();
                        Intrinsics.checkNotNullParameter(state2, "state");
                        vc.s.k(state2);
                        return state2;
                    case 56:
                        return qw7.u.t(dVar2.f305549g);
                    case 57:
                        return wpg.v.d(dVar2.f, (qc0.k) dVar2.f305568w.get(), (la0.c) dVar2.f305543a0.get(), ImmutableMap.of(WidgetProgressionItem.class, new z90.b()));
                    case 58:
                        return wpg.v.t(dVar2.f, (bd0.d) dVar2.Z.get());
                    case 59:
                        x90.c cVar25 = dVar2.f;
                        z70.a aVarF2 = dVar2.f305544b.f();
                        vc.s.j(aVarF2);
                        return wpg.v.p(cVar25, aVarF2);
                    case 60:
                        x90.c cVar26 = dVar2.f;
                        return new yc0.w();
                    case 61:
                        x90.c cVar27 = dVar2.f;
                        router = (qc0.j) dVar2.f305551h0.get();
                        Intrinsics.checkNotNullParameter(router, "router");
                        vc.s.k(router);
                        return router;
                    case 62:
                        x90.c cVar28 = dVar2.f;
                        qc0.h state3 = (qc0.h) dVar2.f305548e0.get();
                        Intrinsics.checkNotNullParameter(state3, "state");
                        vc.s.k(state3);
                        return state3;
                    case 63:
                        gte.a aVarB3 = dVar2.o.b();
                        vc.s.j(aVarB3);
                        ow3.e eVar8 = (ow3.e) ((dw3.c1) dVar2.d).Y0.get();
                        vc.s.j(eVar8);
                        return new ow3.c(aVarB3, eVar8);
                    default:
                        throw new AssertionError(i33);
                }
            case 9:
                xj2.g gVar3 = (xj2.g) this.f304787c;
                int i43 = this.f304786b;
                if (i43 == 0) {
                    return new ik2.b((cli.n) gVar3.f306461b.get(), gVar3.f306460a);
                }
                if (i43 == 1) {
                    return new at.r(new kk2.a(), new kk2.b());
                }
                throw new AssertionError(i43);
            case 10:
                int i59 = this.f304786b;
                if (i59 == 0) {
                    xj2.n nVar3 = (xj2.n) this.f304787c;
                    return xhi.f.x(nVar3.e, ((nj0.d) nVar3.f).f());
                }
                if (i59 == 1) {
                    return new bk2.e();
                }
                throw new AssertionError(i59);
            case 11:
                xsl.l lVar3 = (xsl.l) this.f304787c;
                xsl.p pVar2 = lVar3.f308672b;
                int i66 = this.f304786b;
                if (i66 == 0) {
                    return kxa.j.k((j60.a) lVar3.e.get());
                }
                if (i66 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) lVar3.f308673c.get(), (rp0.m) lVar3.d.get());
                }
                if (i66 == 2) {
                    return new rp0.m();
                }
                if (i66 != 3) {
                    throw new AssertionError(i66);
                }
                pdf.b inputData = lVar3.f308671a;
                hvl.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                gvl.j jVar2 = new gvl.j(inputData.f235166a, inputData.f235167b, inputData.f235168c, inputData.d, inputData.e, inputData.f, inputData.f235169g);
                ivl.c cVar29 = new ivl.c();
                wul.o oVarK = pVar2.k.k();
                l80.e eVarH2 = pVar2.f308697j.h();
                vc.s.j(eVarH2);
                a3e.u uVar2 = new a3e.u(cVar29, new ivl.a(oVarK, eVarH2), new ivl.b());
                gvl.p pVar3 = new gvl.p();
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) lVar3.f308673c.get();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new gvl.o(jVar2, uVar2, pVar3, new gvl.a(new c90.c(controller.m2()), pVar2.k.k()), (j60.a) lVar3.e.get());
            case 12:
                return a();
            case 13:
                return b();
            case 14:
                y03.b bVar11 = (y03.b) this.f304787c;
                int i74 = this.f304786b;
                switch (i74) {
                    case 0:
                        return new ifm.b();
                    case 1:
                        return new iri.j();
                    case 2:
                        return new x03.r();
                    case 3:
                        return new ln.c();
                    case 4:
                        x03.d dVar8 = (x03.d) bVar11.f310124j.get();
                        l93.f fVarJ = bVar11.f310120b.j();
                        vc.s.j(fVarJ);
                        uz2.b bVar12 = (uz2.b) bVar11.f310121c.f275756j.get();
                        vc.s.j(bVar12);
                        hVar = new x03.h(dVar8, fVarJ, bVar12, bVar11.d.a());
                        break;
                    case 5:
                        hVar = new x03.q(bVar11.e.c(), (ln.a) bVar11.k.get(), (x03.h) bVar11.f310125l.get(), bVar11.f.b(), (z03.c) bVar11.f310126m.get(), (z03.c) bVar11.f310127n.get());
                        break;
                    case 6:
                        return new z03.f();
                    case 7:
                        return new z03.e();
                    default:
                        throw new AssertionError(i74);
                }
                return hVar;
            case 15:
                y1d.b bVar13 = ((y2d.c) this.f304787c).f310629a;
                int i92 = this.f304786b;
                if (i92 == 0) {
                    ImmutableSet immutableSetB = ((a2d.j) bVar13).b();
                    vc.s.j(immutableSetB);
                    return new n3d.d(immutableSetB);
                }
                if (i92 != 1) {
                    throw new AssertionError(i92);
                }
                ImmutableSet immutableSetOf = ImmutableSet.of((w3d.a) ((a2d.j) bVar13).S.get());
                vc.s.j(immutableSetOf);
                return new n3d.a(immutableSetOf);
            case 16:
                y60.c cVar30 = (y60.c) this.f304787c;
                ee0.a aVar11 = cVar30.f311109a;
                int i96 = this.f304786b;
                if (i96 == 0) {
                    return new x60.c((ue0.c) cVar30.f311111c.get());
                }
                if (i96 != 1) {
                    throw new AssertionError(i96);
                }
                xe0.f storageFactory = aVar11.f();
                vc.s.j(storageFactory);
                yk0.a databaseSessionProvider = cVar30.f311110b.b();
                vc.s.j(databaseSessionProvider);
                je0.d mapper = aVar11.d();
                vc.s.j(mapper);
                y60.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                return xe0.f.f(storageFactory, databaseSessionProvider, "core_account_region", mapper, 1, null, 48);
            case 17:
                y67.a aVar12 = (y67.a) this.f304787c;
                int i99 = this.f304786b;
                if (i99 == 0) {
                    bVar = new v67.b(aVar12.f311207a.a());
                } else {
                    if (i99 != 1) {
                        if (i99 != 2) {
                            throw new AssertionError(i99);
                        }
                        Context context = aVar12.f311208b;
                        y67.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        return sri.o.c(context, null, null, 14);
                    }
                    bVar = new x67.a((v67.b) aVar12.f311209c.get(), (sri.m) aVar12.d.get());
                }
                return bVar;
            case 18:
                y67.f fVar4 = (y67.f) this.f304787c;
                ecm.q qVar4 = fVar4.f311222a;
                int i100 = this.f304786b;
                if (i100 == 0) {
                    return new a16.b(qVar4, fVar4.f311223b, 24);
                }
                if (i100 == 1) {
                    return new a0b.g(qVar4, fVar4.f311224c, fVar4.d, fVar4.e, fVar4.f, fVar4.f311225g, fVar4.f311226h, 10);
                }
                throw new AssertionError(i100);
            case 19:
                y9j.a aVar13 = (y9j.a) this.f304787c;
                xmg.a aVar14 = aVar13.f311858a;
                int i101 = this.f304786b;
                if (i101 == 0) {
                    return new w9j.a();
                }
                if (i101 != 1) {
                    throw new AssertionError(i101);
                }
                l61.a aVarB4 = aVar14.b();
                vc.s.j(aVarB4);
                ang.f fVarE2 = aVar14.e();
                hc5.a aVarA6 = ((gc5.c) aVar13.f311859b).a();
                vc.s.j(aVarA6);
                gte.a aVarB5 = aVar13.f311860c.b();
                vc.s.j(aVarB5);
                return new w9j.e(aVarB4, fVarE2, aVarA6, aVarB5, aVar13.d.a());
            case 20:
                ydl.a aVar15 = (ydl.a) this.f304787c;
                a31.a aVar16 = aVar15.f312699b;
                a31.a aVar17 = aVar15.f312703j;
                a31.a aVar18 = aVar15.f;
                a31.a aVar19 = aVar15.e;
                a31.a aVar20 = aVar15.f312700c;
                a31.a aVar21 = aVar15.i;
                int i102 = this.f304786b;
                switch (i102) {
                    case 0:
                        lVar = new zdl.l(aVar15.f312698a, aVar16, aVar20, aVar15.d, aVar19, aVar18, aVar15.f312701g, aVar15.f312702h, aVar21, aVar17, aVar15.f312705m, aVar15.k);
                        return lVar;
                    case 1:
                        zdl.b bVar14 = (zdl.b) ((zdl.g) aVar15.f312704l.get()).b();
                        vc.s.k(bVar14);
                        return bVar14;
                    case 2:
                        lVar = new zdl.g(aVar16, aVar20, aVar19, aVar18, aVar21, aVar17);
                        return lVar;
                    case 3:
                        mVar2 = new zdl.m(aVar20, aVar19, aVar18, aVar17, aVar21, aVar15.o);
                        return mVar2;
                    case 4:
                        zdl.c cVar31 = (zdl.c) ((zdl.l) aVar15.f312706n.get()).b();
                        vc.s.k(cVar31);
                        return cVar31;
                    case 5:
                        mVar2 = new vtc.q0(aVar20, aVar19, aVar18, aVar17, 2);
                        return mVar2;
                    case 6:
                        return new gpc.b(aVar15.f312709r, aVar15.o, aVar21, 1);
                    case 7:
                        zdl.f fVar5 = (zdl.f) ((zdl.m) aVar15.f312707p.get()).b();
                        vc.s.k(fVar5);
                        return fVar5;
                    default:
                        throw new AssertionError(i102);
                }
            case 21:
                yf3.c cVar32 = (yf3.c) this.f304787c;
                l70.e eVar9 = cVar32.f313155a;
                int i103 = this.f304786b;
                if (i103 == 0) {
                    return new xf3.a();
                }
                if (i103 == 1) {
                    return new zf3.a((bg3.a) cVar32.f313158g.get(), cVar32.f313157c);
                }
                if (i103 == 2) {
                    f80.a aVarX2 = eVar9.x();
                    vc.s.j(aVarX2);
                    CheckTopUpService checkTopUpService = (CheckTopUpService) cVar32.f.get();
                    b80.c cVarP2 = eVar9.p();
                    vc.s.j(cVarP2);
                    return new bg3.a(aVarX2, checkTopUpService, cVarP2);
                }
                if (i103 != 3) {
                    if (i103 == 4) {
                        return new CheckTopUpScanDialogHelperImpl();
                    }
                    throw new AssertionError(i103);
                }
                Retrofit retrofit = ((nj0.d) cVar32.f313156b).f();
                yf3.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object objCreate = retrofit.create(CheckTopUpService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                CheckTopUpService checkTopUpService2 = (CheckTopUpService) objCreate;
                vc.s.k(checkTopUpService2);
                return checkTopUpService2;
            case 22:
                yf6.e eVar10 = (yf6.e) this.f304787c;
                q8b.a aVar22 = eVar10.d;
                an0.c cVar33 = eVar10.f313189b;
                ee0.a aVar23 = eVar10.f313188a;
                int i104 = this.f304786b;
                switch (i104) {
                    case 0:
                        je0.d mapper2 = aVar23.b();
                        vc.s.j(mapper2);
                        yk0.a dbSessionProvider = cVar33.b();
                        vc.s.j(dbSessionProvider);
                        xe0.f storageFactory2 = aVar23.f();
                        vc.s.j(storageFactory2);
                        yf6.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper2, "mapper");
                        Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        return xe0.f.f(storageFactory2, dbSessionProvider, "cross_border_institutions_storage", mapper2, 0, null, 56);
                    case 1:
                        je0.d mapper3 = aVar23.b();
                        vc.s.j(mapper3);
                        yk0.a dbSessionProvider2 = cVar33.b();
                        vc.s.j(dbSessionProvider2);
                        xe0.f storageFactory3 = aVar23.f();
                        vc.s.j(storageFactory3);
                        yf6.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper3, "mapper");
                        Intrinsics.checkNotNullParameter(dbSessionProvider2, "dbSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory3, "storageFactory");
                        return xe0.f.f(storageFactory3, dbSessionProvider2, "external_institution_country_departments_storage", mapper3, 0, null, 56);
                    case 2:
                        je0.d mapper4 = aVar23.b();
                        vc.s.j(mapper4);
                        yk0.a dbSessionProvider3 = cVar33.b();
                        vc.s.j(dbSessionProvider3);
                        xe0.f storageFactory4 = aVar23.f();
                        vc.s.j(storageFactory4);
                        yf6.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper4, "mapper");
                        Intrinsics.checkNotNullParameter(dbSessionProvider3, "dbSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory4, "storageFactory");
                        return xe0.f.f(storageFactory4, dbSessionProvider3, "external_institutions_branches_storage", mapper4, 0, null, 56);
                    case 3:
                        dVar = new fg6.d((cf6.e) eVar10.f313193j.get());
                        break;
                    case 4:
                        ne0.j jVar3 = (ne0.j) eVar10.f313192h.get();
                        CrossBorderOpenBankingService crossBorderOpenBankingService = (CrossBorderOpenBankingService) eVar10.i.get();
                        bf6.c cVar34 = new bf6.c();
                        bf6.c cVar35 = new bf6.c();
                        n8b.a aVarA7 = aVar22.a();
                        vc.s.j(aVarA7);
                        bf6.a aVar24 = new bf6.a(cVar34, new bf6.f(cVar35, aVarA7));
                        bf6.b bVar15 = new bf6.b(new bf6.g(new bf6.d()), new bf6.d());
                        bf6.c cVar36 = new bf6.c();
                        n8b.a aVarA8 = aVar22.a();
                        vc.s.j(aVarA8);
                        bf6.f fVar6 = new bf6.f(cVar36, aVarA8);
                        bf6.g gVar4 = new bf6.g(new bf6.d());
                        bf6.e eVar11 = new bf6.e();
                        bf6.d crossBorderInstitutionDataEntityMapper = new bf6.d();
                        Intrinsics.checkNotNullParameter(crossBorderInstitutionDataEntityMapper, "crossBorderInstitutionDataEntityMapper");
                        dVar = new cf6.e(jVar3, crossBorderOpenBankingService, aVar24, bVar15, fVar6, gVar4, eVar11, new dcl.q(), (ue0.c) eVar10.e.get(), (ue0.c) eVar10.f.get(), (ue0.c) eVar10.f313191g.get());
                        break;
                    case 5:
                        return new ne0.d();
                    case 6:
                        Retrofit retrofit3 = ((nj0.d) eVar10.f313190c).f();
                        yf6.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                        Object objCreate2 = retrofit3.create(CrossBorderOpenBankingService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                        CrossBorderOpenBankingService crossBorderOpenBankingService2 = (CrossBorderOpenBankingService) objCreate2;
                        vc.s.k(crossBorderOpenBankingService2);
                        return crossBorderOpenBankingService2;
                    default:
                        throw new AssertionError(i104);
                }
                return dVar;
            case 23:
                yh1.b bVar16 = (yh1.b) this.f304787c;
                AddManuallyScreenContract$InputData addManuallyScreenContract$InputData = bVar16.f313696a;
                int i105 = this.f304786b;
                if (i105 == 0) {
                    return new ci1.h(addManuallyScreenContract$InputData, (cli.n) bVar16.f313697b.get());
                }
                if (i105 == 1) {
                    return new ci1.j(addManuallyScreenContract$InputData);
                }
                throw new AssertionError(i105);
            case 24:
                return c();
            case 25:
                return d();
            case 26:
                return e();
            case 27:
                return f();
            case 28:
                return g();
            default:
                yu2.c cVar37 = (yu2.c) this.f304787c;
                int i106 = this.f304786b;
                if (i106 == 0) {
                    aVar = new wu2.a((xu2.c) cVar37.f316862c.get());
                } else {
                    if (i106 != 1) {
                        if (i106 != 2) {
                            throw new AssertionError(i106);
                        }
                        Retrofit retrofit4 = ((nj0.d) cVar37.f316860a).f();
                        yu2.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit4, "retrofit");
                        Object objCreate3 = retrofit4.create(CardTokenizationService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate3, "create(...)");
                        CardTokenizationService cardTokenizationService = (CardTokenizationService) objCreate3;
                        vc.s.k(cardTokenizationService);
                        return cardTokenizationService;
                    }
                    aVar = new xu2.c((CardTokenizationService) cVar37.f316861b.get());
                }
                return aVar;
        }
    }

    public a1(t tVar, x0 x0Var, int i) {
        this.f304785a = 0;
        this.f304787c = x0Var;
        this.f304786b = i;
    }
}
