package ql7;

import android.app.Activity;
import android.content.Context;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.LifecycleOwner;
import b9.w2;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.biometric_verification.api.models.BiometricVerificationFeature;
import com.revolut.biometric_verification.api.models.FaceDetectionResource;
import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.client.api.models.CameraKitClientSettings;
import com.revolut.camerakit.client.api.models.CameraKitUiSettings;
import com.revolut.camerakit.core.settings.VideoWatermark;
import com.revolut.camerakit.ui.views.view.CameraKitPreviewView;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.details.AdditionalDriverDetailsScreenContract$InputData;
import com.revolut.feature.insurance_home.impl.ui.screen.product_summary.InsuranceProductSummaryScreenContract$InputData;
import com.revolut.feature.insurance_pet.impl.ui.edit.PetEditFlowContract$Configuration;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.staking.impl.confirmation.StakingConfirmationControllerContract$InputData;
import com.revolut.feature.staking.impl.flow.stake.v2.StakingControllerContract$InputData;
import com.revolut.feature.staking.impl.stake.v2.StakeControllerContract$InputData;
import com.revolut.feature.topup_screen.api.descriptor.EditStoredMethodLabelDescriptor$InputData;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature.topup_screen.impl.flow.external_card_details.ExternalCardDetailsFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.flow.topup_methods.TopupMethodsFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.details.StoredMethodDetailsScreenContract$InputData;
import com.revolut.feature.topup_screen.impl.mcy.McyTopupFlowContract$InputData;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.WorkflowDocumentSelectionFlowContract$InputData;
import com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import ip0.pr;
import ip0.v7;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kye.w3;
import npb.e;
import qgk.i3;

/* JADX INFO: loaded from: classes4.dex */
public final class v1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f247501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f247502c;
    public final Object d;

    public /* synthetic */ v1(Object obj2, Object obj3, int i, int i2) {
        this.f247500a = i2;
        this.f247501b = obj2;
        this.d = obj3;
        this.f247502c = i;
    }

    private final Object a() {
        qve.m mVar = (qve.m) this.d;
        qve.k kVar = (qve.k) this.f247501b;
        int i = this.f247502c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            ViewController flow = mVar.f249626b;
            k0f.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(flow, "flow");
            return new f01.c(flow.m2());
        }
        McyTopupFlowContract$InputData mcyTopupFlowContract$InputData = mVar.f249625a;
        vte.a aVarC = kVar.f249604b.c();
        vc.s.j(aVarC);
        e0f.u0 u0VarB = mVar.b();
        pye.a aVar = new pye.a();
        gte.a aVarB = kVar.k.b();
        vc.s.j(aVarB);
        zja.a aVarA = ((ika.b) kVar.f249617r).a();
        vc.s.j(aVarA);
        l93.f fVarJ = kVar.f249618s.j();
        vc.s.j(fVarJ);
        u51.a aVarA2 = kVar.e.a();
        vc.s.j(aVarA2);
        return new com.revolut.feature.topup_screen.impl.mcy.b(mcyTopupFlowContract$InputData, aVarC, u0VarB, aVar, aVarB, aVarA, fVarJ, aVarA2);
    }

    private final Object b() {
        qve.n nVar = (qve.n) this.d;
        qve.k kVar = (qve.k) this.f247501b;
        int i = this.f247502c;
        switch (i) {
            case 0:
                wj0.a idempotencyKeyHolder = ((nj0.d) kVar.f249602a).i();
                vc.s.j(idempotencyKeyHolder);
                l80.e dateProvider = kVar.v.h();
                vc.s.j(dateProvider);
                wye.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                return new m60.b(idempotencyKeyHolder, dateProvider, "payments_peer_to_peer_transfer");
            case 1:
                return kxa.j.m((j60.a) nVar.f249631g.get());
            case 2:
                return wp5.y.r((com.revolut.kompot.navigable.a) nVar.e.get(), (rp0.m) nVar.f.get());
            case 3:
                return new rp0.m();
            case 4:
                n60.a extension = (n60.a) nVar.i.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 5:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) nVar.e.get();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new n60.a(controller);
            case 6:
                uye.g gVar = nVar.f249628a;
                qve.k kVar2 = nVar.f249629b;
                zu8.c0 c0Var = kVar.f249620w;
                ove.t tVar = kVar.f249604b;
                xf6.r1 r1Var = kVar.f249622y;
                cu8.r0 r0VarA = c0Var.a();
                gte.a aVarB = kVar.k.b();
                vc.s.j(aVarB);
                u0f.a aVar = (u0f.a) kVar.f249621x.f230029a.get();
                vc.s.j(aVar);
                je6.h hVarC = ((xf6.t) kVar2.f).c();
                vc.s.j(hVarC);
                com.revolut.feature.topup_screen.impl.flows.topup.flow.data.h hVar = new com.revolut.feature.topup_screen.impl.flows.topup.flow.data.h(hVarC, new oye.c(new sze.d(new sze.b())));
                uye.c cVar = (uye.c) nVar.k.get();
                uye.b bVar = (uye.b) nVar.f249634l.get();
                u51.a aVarA = kVar.e.a();
                vc.s.j(aVarA);
                xg6.x xVarA = r1Var.a();
                vc.s.j(xVarA);
                oe6.k kVar3 = (oe6.k) r1Var.f305033y.get();
                vc.s.j(kVar3);
                rve.i iVar = (rve.i) tVar.f230121b0.get();
                vc.s.j(iVar);
                wve.a aVar2 = (wve.a) kVar.z.d.get();
                vc.s.j(aVar2);
                fk3.a aVarA2 = kVar.A.a();
                vc.s.j(aVarA2);
                f8a.a aVarB2 = kVar.B.b();
                vc.s.j(aVarB2);
                zu1.a aVar3 = (zu1.a) kVar.C.f219411x.get();
                vc.s.j(aVar3);
                x8k.c cVarC = kVar.D.c();
                wsg.n nVarB = kVar.o.b();
                wsg.n nVarB2 = kVar2.o.b();
                et6.h1 h1VarN = kVar2.E.n();
                vc.s.j(h1VarN);
                et6.h hVar2 = (et6.h) kVar2.F.f291729t.get();
                vc.s.j(hVar2);
                uve.c cVar2 = new uve.c(nVarB2, h1VarN, hVar2);
                qye.c cVar3 = kVar.G;
                eye.f fVar = new eye.f(cVar3.f250285a.b(), cVar3.f250286b.a());
                rh6.b bVar2 = (rh6.b) kVar.H.f250284a.f304965l.get();
                vc.s.j(bVar2);
                eye.c cVar4 = new eye.c(bVar2);
                kwe.b bVar3 = new kwe.b();
                zte.b bVar4 = (zte.b) tVar.f230127h0.get();
                vc.s.j(bVar4);
                sf0.h hVarB = kVar2.f249615p.b();
                vc.s.j(hVarB);
                v60.e eVarA = kVar2.I.a();
                vc.s.j(eVarA);
                c1f.c cVar5 = new c1f.c(hVarB, eVarA);
                wj0.a aVarI = ((nj0.d) kVar.f249602a).i();
                vc.s.j(aVarI);
                com.revolut.feature.external_accounts.api.navigation.a aVarB3 = ((xf6.t) kVar.f).b();
                vc.s.j(aVarB3);
                je0.d dVarD = kVar2.f249606c.d();
                vc.s.j(dVarD);
                rye.e eVar = new rye.e(dVarD);
                uye.d dVar = (uye.d) nVar.f249635m.get();
                owe.d dVar2 = new owe.d();
                d1f.a aVar4 = new d1f.a();
                owe.c cVar6 = new owe.c();
                gye.h hVar3 = new gye.h();
                oe6.a aVarA3 = kVar.J.a();
                vc.s.j(aVarA3);
                fmc.z zVar = new fmc.z(kVar2.f249609g.a(), new sze.d(new sze.b()));
                xye.d dVar3 = new xye.d();
                xye.a aVar5 = new xye.a();
                xye.c cVar7 = new xye.c();
                aue.d dVar4 = new aue.d();
                com.revolut.feature.topup_screen.api.topup_limits.a aVar6 = new com.revolut.feature.topup_screen.api.topup_limits.a();
                jvh.a aVarA4 = kVar.f249610h.a();
                vc.s.j(aVarA4);
                til.m mVarA = kVar.i.a();
                vc.s.j(mVarA);
                uye.a aVar7 = (uye.a) nVar.f249636n.get();
                l2j.a aVar8 = new l2j.a();
                s99.i iVarB = ((s99.a) kVar.K).b();
                rea.m mVarF = kVar.L.f();
                rfb.b bVarB = ((wfb.i) kVar.M).b();
                vc.s.j(bVarB);
                sye.a aVar9 = new sye.a();
                je6.e eVar2 = (je6.e) r1Var.z.get();
                vc.s.j(eVar2);
                return new com.revolut.feature.topup_screen.impl.flows.topup.flow.i(gVar, r0VarA, aVarB, aVar, hVar, cVar, bVar, aVarA, xVarA, kVar3, iVar, aVar2, aVarA2, aVarB2, aVar3, cVarC, nVarB, cVar2, fVar, cVar4, bVar3, bVar4, cVar5, aVarI, aVarB3, eVar, dVar, dVar2, aVar4, cVar6, hVar3, aVarA3, zVar, dVar3, aVar5, cVar7, dVar4, aVar6, aVarA4, mVarA, aVar7, aVar8, iVarB, mVarF, bVarB, aVar9, eVar2);
            case 7:
                return new uye.c();
            case 8:
                return new uye.b();
            case 9:
                return new uye.d();
            case 10:
                return new uye.a();
            case 11:
                ote.a modelExtension = (ote.a) nVar.f249639r.get();
                wye.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
                Set setZ2 = modelExtension.Z2();
                vc.s.k(setZ2);
                return setZ2;
            case 12:
                uye.g inputData = nVar.f249628a;
                ote.c cVar8 = ote.c.SAVINGS;
                ote.b bVar5 = (ote.b) nVar.f249637p.get();
                ote.c cVar9 = ote.c.INVEST;
                ImmutableMap providersMap = ImmutableMap.of(cVar8, bVar5, cVar9, (ote.b) nVar.f249638q.get());
                j60.a bottomDialogExtension = (j60.a) nVar.f249631g.get();
                wye.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(providersMap, "providersMap");
                Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
                TopUpTarget topUpTarget = inputData.f284275a;
                if ((topUpTarget instanceof TopUpTarget.Joint) || (topUpTarget instanceof TopUpTarget.Main) || (topUpTarget instanceof TopUpTarget.RevXFiat) || (topUpTarget instanceof TopUpTarget.Pro)) {
                    return new nye.a();
                }
                if (topUpTarget instanceof TopUpTarget.Savings) {
                    return ((ote.b) zhm.r0.h(cVar8, providersMap)).a(topUpTarget, bottomDialogExtension);
                }
                if (topUpTarget instanceof TopUpTarget.Invest) {
                    return ((ote.b) zhm.r0.h(cVar9, providersMap)).a(topUpTarget, bottomDialogExtension);
                }
                throw new NoWhenBranchMatchedException();
            case 13:
                final djb.n savingsAccountsDetailsInteractor = ((opb.a) kVar.N).f227551a.a();
                vc.s.j(savingsAccountsDetailsInteractor);
                opb.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
                ote.b provider = new ote.b() { // from class: opb.b
                    @Override // ote.b
                    public final ote.a a(TopUpTarget target, j60.a aVar10) {
                        Intrinsics.checkNotNullParameter(target, "target");
                        Intrinsics.checkNotNullParameter(aVar10, "<unused var>");
                        return new e(savingsAccountsDetailsInteractor, (TopUpTarget.Savings) target);
                    }
                };
                Intrinsics.checkNotNullParameter(provider, "provider");
                return provider;
            case 14:
                mbh.e currencyExchangeFactory = ((c4f.h) kVar.O).f21216a.v();
                vc.s.j(currencyExchangeFactory);
                Intrinsics.checkNotNullParameter(currencyExchangeFactory, "currencyExchangeFactory");
                c4f.n provider2 = new c4f.n();
                Intrinsics.checkNotNullParameter(provider2, "provider");
                return provider2;
            case 15:
                return new eye.b((eye.g) nVar.f249641t.get());
            case 16:
                qd0.b bVarN = kVar.v.n();
                vc.s.j(bVarN);
                return new eye.g(bVarN);
            case 17:
                fk3.a aVarA5 = kVar.A.a();
                vc.s.j(aVarA5);
                y51.a aVarA6 = kVar.f249604b.a();
                vc.s.j(aVarA6);
                eye.g gVar2 = (eye.g) nVar.f249641t.get();
                eye.b bVar6 = (eye.b) nVar.u.get();
                wsg.n nVarB3 = kVar.o.b();
                t21.a aVar10 = (t21.a) ((c21.b) kVar.P).f20570k0.get();
                vc.s.j(aVar10);
                return new w3(aVarA5, aVarA6, gVar2, bVar6, nVarB3, aVar10);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        qve.p pVar = (qve.p) this.d;
        qve.k kVar = (qve.k) this.f247501b;
        int i = this.f247502c;
        if (i == 0) {
            cli.n nVar = (cli.n) pVar.f249646b.get();
            StoredMethodDetailsScreenContract$InputData storedMethodDetailsScreenContract$InputData = pVar.f249645a;
            u51.a aVarA = kVar.e.a();
            vc.s.j(aVarA);
            return new wxe.f0(nVar, storedMethodDetailsScreenContract$InputData, aVarA);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        l80.e eVarH = kVar.v.h();
        vc.s.j(eVarH);
        je6.h hVarC = ((xf6.t) kVar.f).c();
        vc.s.j(hVarC);
        return new wxe.h0(eVarH, hVarC, new sze.d(new sze.b()));
    }

    private final Object d() {
        qve.k kVar = (qve.k) this.f247501b;
        qve.u uVar = (qve.u) this.d;
        int i = this.f247502c;
        if (i != 0) {
            if (i == 1) {
                return new yxe.n();
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) uVar.f249661c.get();
        EditStoredMethodLabelDescriptor$InputData editStoredMethodLabelDescriptor$InputData = uVar.f249660b;
        u51.a aVarA = kVar.e.a();
        vc.s.j(aVarA);
        return new yxe.m(nVar, editStoredMethodLabelDescriptor$InputData, aVarA, (sve.a) kVar.c0.get());
    }

    private final Object e() {
        qve.k kVar = (qve.k) this.f247501b;
        qve.u uVar = (qve.u) this.d;
        int i = this.f247502c;
        if (i != 0) {
            if (i == 1) {
                return new yxe.n();
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) uVar.f249661c.get();
        EditStoredMethodLabelDescriptor$InputData editStoredMethodLabelDescriptor$InputData = uVar.f249660b;
        u51.a aVarA = kVar.e.a();
        vc.s.j(aVarA);
        return new yxe.m(nVar, editStoredMethodLabelDescriptor$InputData, aVarA, (sve.a) kVar.c0.get());
    }

    private final Object f() {
        qve.x xVar = (qve.x) this.d;
        qve.w wVar = (qve.w) this.f247501b;
        int i = this.f247502c;
        if (i == 0) {
            w2 jointMcyErrorGuardianControllerExtensionProvider = wVar.k.b();
            iwe.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(jointMcyErrorGuardianControllerExtensionProvider, "jointMcyErrorGuardianControllerExtensionProvider");
            return jointMcyErrorGuardianControllerExtensionProvider.S();
        }
        if (i != 1) {
            if (i == 2) {
                return new tze.a();
            }
            throw new AssertionError(i);
        }
        TopupMethodsFlowContract$InputData topupMethodsFlowContract$InputData = xVar.f249682a;
        ang.f fVarE = wVar.f249671l.e();
        mt8.d dVarB = wVar.f249672m.b();
        vc.s.j(dVarB);
        mt8.a aVarA = xVar.f249683b.f249672m.a();
        vc.s.j(aVarA);
        sze.f fVar = new sze.f(aVarA);
        z71.a aVarF = ((c21.b) wVar.f249673n).f();
        vc.s.j(aVarF);
        wsg.n nVarB = wVar.o.b();
        tze.a aVar = (tze.a) xVar.e.get();
        kwe.b bVar = new kwe.b();
        com.revolut.feature.external_accounts.api.navigation.a aVarB = ((xf6.t) wVar.i).b();
        vc.s.j(aVarB);
        xoj.a aVarA2 = wVar.d.a();
        vc.s.j(aVarA2);
        jwe.a aVar2 = new jwe.a();
        vte.a aVarC = wVar.f.c();
        vc.s.j(aVarC);
        q06.l lVarA = wVar.f249674p.a();
        vc.s.j(lVarA);
        l2j.a aVar3 = new l2j.a();
        gte.a aVarB2 = wVar.e.b();
        vc.s.j(aVarB2);
        return new com.revolut.feature.topup_screen.impl.flow.topup_methods.d(topupMethodsFlowContract$InputData, fVarE, dVarB, fVar, aVarF, nVarB, aVar, bVar, aVarB, aVarA2, aVar2, aVarC, lVarA, aVar3, aVarB2);
    }

    private final Object g() {
        qw7.g gVar = (qw7.g) this.d;
        InsuranceProductSummaryScreenContract$InputData insuranceProductSummaryScreenContract$InputData = gVar.f249819a;
        int i = this.f247502c;
        if (i == 0) {
            return new vw7.e(insuranceProductSummaryScreenContract$InputData, (cli.n) gVar.f249820b.get());
        }
        if (i == 1) {
            return new vw7.f(insuranceProductSummaryScreenContract$InputData, ((qw7.e) this.f247501b).f.g());
        }
        throw new AssertionError(i);
    }

    private final Object h() {
        qw7.i iVar = (qw7.i) this.d;
        qw7.e eVar = iVar.f249826b;
        qw7.e eVar2 = (qw7.e) this.f247501b;
        int i = this.f247502c;
        if (i != 0) {
            if (i == 1) {
                return new tw7.p(new sr7.h(new sr7.i(eVar.f.g())), new sr7.i(eVar.f.g()), new yik.b());
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) iVar.f249827c.get();
        rl7.e eVar3 = (rl7.e) eVar2.f249807h.f247254l.get();
        vc.s.j(eVar3);
        ffk.t tVarF = eVar2.e.f();
        vc.s.j(tVarF);
        return new com.revolut.feature.insurance_home.impl.ui.screen.home.a(nVar, eVar3, tVarF, ((s41.a) eVar2.i).d(), ((ika.b) eVar2.f249808j).b(), eVar2.k.a(), (kw7.e) eVar2.f249814r.get());
    }

    private final Object i() {
        qw7.i iVar = (qw7.i) this.d;
        qw7.e eVar = iVar.f249826b;
        qw7.e eVar2 = (qw7.e) this.f247501b;
        int i = this.f247502c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            sr7.h hVar = new sr7.h(new sr7.i(eVar.f.g()));
            sr7.i iVar2 = new sr7.i(eVar.f.g());
            i3 i3Var = eVar2.f249806g;
            return new tw7.p(hVar, iVar2, new yik.b());
        }
        cli.n nVar = (cli.n) iVar.f249827c.get();
        rl7.e eVar3 = (rl7.e) eVar2.f249807h.f247254l.get();
        vc.s.j(eVar3);
        ffk.t tVarF = eVar2.e.f();
        vc.s.j(tVarF);
        return new com.revolut.feature.insurance_home.impl.ui.screen.home.a(nVar, eVar3, tVarF, ((s41.a) eVar2.i).d(), ((ika.b) eVar2.f249808j).b(), eVar2.k.a(), (kw7.e) eVar2.f249814r.get());
    }

    private final Object j() {
        String str;
        ey.b bVar = (ey.b) this.f247501b;
        ey.d dVar = (ey.d) this.d;
        int i = this.f247502c;
        switch (i) {
            case 0:
                oy.b bVar2 = dVar.f130490b;
                oy.a extension = (oy.a) dVar.i.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 1:
                return olc.c.b(dVar.f130490b, (com.revolut.kompot.navigable.a) dVar.f130493h.get());
            case 2:
                xy.b bVar3 = dVar.f130491c;
                xy.a extension2 = (xy.a) dVar.E.get();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                vc.s.k(extension2);
                return extension2;
            case 3:
                return xhi.f.e(dVar.f130491c, (com.revolut.kompot.navigable.a) dVar.f130493h.get(), (yy.c) dVar.D.get());
            case 4:
                xv.h hVar = (xv.h) dVar.u.get();
                pv.a aVar = (pv.a) dVar.v.get();
                sx.a aVar2 = (sx.a) bVar.f130480g.k.get();
                vc.s.j(aVar2);
                py.d dVarB = bVar.f130480g.b();
                vc.s.j(dVarB);
                return new yy.c(hVar, aVar, aVar2, dVarB, (dv.a) dVar.A.get(), (ww.b) dVar.B.get(), new sy.d0(), (pw.c) dVar.C.get());
            case 5:
                vy.a inputData = dVar.d;
                ey.b bVar4 = (ey.b) dVar.L;
                w2 factory = bVar.d.a();
                u00.d dVar2 = bVar4.e;
                vy.a inputData2 = dVar.d;
                qx.a aVar3 = qx.b.Companion;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(inputData2, "inputData");
                Set set = inputData2.e;
                vc.s.k(set);
                LinkedHashSet validators = dw3.l.h(dVar2, set, (dx.l) dVar.f130495l.get(), bVar4.f);
                xv.d framesProvider = (xv.d) dVar.f130502t.get();
                LifecycleOwner lifecycleOwner = (LifecycleOwner) dVar.f130496m.get();
                dx.l previewMetadata = (dx.l) dVar.f130495l.get();
                iy.b experimentsInteractor = bVar4.f130481h.a();
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(experimentsInteractor, "experimentsInteractor");
                boolean zA = experimentsInteractor.a(px.a.f240490a);
                iy.b experimentsInteractor2 = bVar4.f130481h.a();
                Intrinsics.checkNotNullParameter(experimentsInteractor2, "experimentsInteractor");
                iy.a experiment = px.a.f240492c;
                boolean zA2 = experimentsInteractor2.a(experiment);
                Intrinsics.checkNotNullParameter(bVar4.f130481h.a(), "experimentsInteractor");
                Intrinsics.checkNotNullParameter(experiment, "experiment");
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(validators, "validators");
                Intrinsics.checkNotNullParameter(framesProvider, "framesProvider");
                Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
                Intrinsics.checkNotNullParameter(previewMetadata, "previewMetadata");
                Intrinsics.checkNotNullParameter("default", "analysisCollectionFolder");
                FaceDetectionResource faceDetectionResource = inputData.i;
                return factory.n(validators, framesProvider, lifecycleOwner, previewMetadata, zA, zA2, faceDetectionResource != null ? new cx.a(faceDetectionResource.f50442b, faceDetectionResource.f50443c) : cx.b.f109873a);
            case 6:
                dx.m mVar = (dx.m) dVar.k.get();
                dw3.l.u(mVar);
                return mVar;
            case 7:
                return dw3.l.s((com.revolut.kompot.navigable.a) dVar.f130493h.get());
            case 8:
                return dw3.l.b((sw.d) dVar.f130501s.get());
            case 9:
                tw.a aVarA = bVar.f130480g.a();
                e4m.e eVar = dVar.f130496m;
                ey.b bVar5 = (ey.b) dVar.L;
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) eVar.get();
                PreviewView previewView = (PreviewView) dVar.o.get();
                yw.h hVar2 = (yw.h) dVar.f130500r.get();
                qx.a aVar4 = qx.b.Companion;
                iy.b experimentsInteractor3 = bVar5.f130481h.a();
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(experimentsInteractor3, "experimentsInteractor");
                boolean zA3 = experimentsInteractor3.a(px.a.f240490a);
                f4h.a featuresInteractor = new f4h.a(bVar5.f130478b);
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
                vw.b bVarU = featuresInteractor.u();
                f4h.a featuresInteractor2 = new f4h.a(bVar5.f130478b);
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor2, "featuresInteractor");
                vw.c cVarR = featuresInteractor2.r();
                f4h.a featuresInteractor3 = new f4h.a(bVar5.f130478b);
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor3, "featuresInteractor");
                vw.d dVarJ = featuresInteractor3.j();
                f4h.a featuresInteractor4 = new f4h.a(bVar5.f130478b);
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor4, "featuresInteractor");
                return dw3.l.d(aVarA, lifecycleOwner2, previewView, hVar2, zA3, bVarU, cVarR, dVarJ, featuresInteractor4.g());
            case 10:
                return wy.d.a();
            case 11:
                return dw3.l.t((CameraKitPreviewView) dVar.f130497n.get());
            case 12:
                return dw3.l.f((com.revolut.kompot.navigable.a) dVar.f130493h.get());
            case 13:
                yw.f impl = (yw.f) dVar.f130499q.get();
                Intrinsics.checkNotNullParameter(impl, "impl");
                vc.s.k(impl);
                return impl;
            case 14:
                rx.a factory2 = (rx.a) dVar.f130498p.get();
                ly.c cVar = ((ey.b) dVar.L).f130478b;
                f4h.a featuresInteractor5 = new f4h.a(cVar);
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(featuresInteractor5, "featuresInteractor");
                factory2.getClass();
                yw.a cameraLens = yw.a.FRONT;
                CameraKitClientSettings cameraKitClientSettings = factory2.f257993a;
                yw.e videoResolution = hy.e.a(cameraKitClientSettings);
                yw.e photoResolution = yw.e.HD;
                yw.e previewResolution = yw.e.FHD;
                CameraCaptureSettings cameraCaptureSettings = cameraKitClientSettings.f50706a;
                yw.d cameraPreset = new yw.d(new yw.c(hy.a.a(cameraCaptureSettings), hy.b.a(cameraCaptureSettings), hy.a.b(cameraCaptureSettings)), new yw.i(hy.d.a(cameraCaptureSettings), hy.c.a(cameraCaptureSettings)));
                yw.b initialMode = yw.b.COMBINED;
                VideoWatermark videoWatermark = hy.f.a(cameraCaptureSettings);
                Intrinsics.checkNotNullParameter(cameraLens, "cameraLens");
                Intrinsics.checkNotNullParameter(videoResolution, "videoResolution");
                Intrinsics.checkNotNullParameter(photoResolution, "analysisResolution");
                Intrinsics.checkNotNullParameter(photoResolution, "photoResolution");
                Intrinsics.checkNotNullParameter(cameraPreset, "cameraPreset");
                Intrinsics.checkNotNullParameter(initialMode, "initialMode");
                Intrinsics.checkNotNullParameter(previewResolution, "previewResolution");
                Intrinsics.checkNotNullParameter(videoWatermark, "videoWatermark");
                BiometricVerificationFeature biometricVerificationFeature = cVar.i.f50396j;
                boolean z = false;
                if (biometricVerificationFeature != null) {
                    str = "videoWatermark";
                    if (biometricVerificationFeature.f50390a) {
                        z = true;
                    }
                } else {
                    str = "videoWatermark";
                }
                Intrinsics.checkNotNullParameter(cameraLens, "cameraLens");
                Intrinsics.checkNotNullParameter(videoResolution, "videoResolution");
                Intrinsics.checkNotNullParameter(photoResolution, "analysisResolution");
                Intrinsics.checkNotNullParameter(photoResolution, "photoResolution");
                Intrinsics.checkNotNullParameter(cameraPreset, "cameraPreset");
                Intrinsics.checkNotNullParameter(initialMode, "initialMode");
                Intrinsics.checkNotNullParameter(previewResolution, "previewResolution");
                Intrinsics.checkNotNullParameter(videoWatermark, str);
                return new yw.f(cameraLens, videoResolution, photoResolution, photoResolution, cameraPreset, initialMode, previewResolution, videoWatermark, z);
            case 15:
                CameraKitClientSettings cameraKitClientSettings2 = dVar.e;
                Intrinsics.checkNotNullParameter(cameraKitClientSettings2, "cameraKitClientSettings");
                return new rx.a(cameraKitClientSettings2);
            case 16:
                return dw3.l.e(bVar.i);
            case 17:
                nv.a aVar5 = bVar.i;
                e4m.e eVar2 = dVar.f130503w;
                ey.b bVar6 = (ey.b) dVar.L;
                dv.m mVar2 = (dv.m) eVar2.get();
                xv.c cVar2 = (xv.c) dVar.f130504x.get();
                CameraKitClientSettings cameraKitClientSettings3 = dVar.e;
                xv.h hVar3 = (xv.h) dVar.u.get();
                LifecycleOwner lifecycleOwner3 = (LifecycleOwner) dVar.f130496m.get();
                CameraKitUiSettings cameraKitUiSettings = dVar.f130492g;
                pv.a aVar6 = (pv.a) dVar.v.get();
                ww.b bVar7 = (ww.b) dVar.f130505y.get();
                dx.m mVar3 = (dx.m) dVar.k.get();
                fv.e eVar3 = bVar.f130482j;
                yw.h hVar4 = (yw.h) dVar.z.get();
                qx.a aVar7 = qx.b.Companion;
                f4h.a featuresInteractor6 = new f4h.a(bVar6.f130478b);
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor6, "featuresInteractor");
                vw.b bVarU2 = featuresInteractor6.u();
                f4h.a featuresInteractor7 = new f4h.a(bVar6.f130478b);
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor7, "featuresInteractor");
                vw.c cVarR2 = featuresInteractor7.r();
                f4h.a featuresInteractor8 = new f4h.a(bVar6.f130478b);
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor8, "featuresInteractor");
                return dw3.l.c(aVar5, mVar2, cVar2, cameraKitClientSettings3, hVar3, lifecycleOwner3, cameraKitUiSettings, aVar6, bVar7, mVar3, eVar3, hVar4, bVarU2, cVarR2, featuresInteractor8.j());
            case 18:
                return dw3.l.g(bVar.i, dVar.f, dVar.f130492g);
            case 19:
                return dw3.l.a((sw.d) dVar.f130501s.get());
            case 20:
                return dw3.l.r((sw.d) dVar.f130501s.get());
            case 21:
                yw.h impl2 = (yw.h) dVar.f130500r.get();
                Intrinsics.checkNotNullParameter(impl2, "impl");
                vc.s.k(impl2);
                return impl2;
            case 22:
                return dw3.l.q((sw.d) dVar.f130501s.get());
            case 23:
                return dw3.l.k((sw.d) dVar.f130501s.get());
            case 24:
                yy.c cVar3 = (yy.c) dVar.D.get();
                yf6.b.h(cVar3);
                return cVar3;
            case 25:
                fz.b bVar8 = new fz.b((fz.c) dVar.H.get(), (com.revolut.kompot.navigable.a) dVar.f130493h.get());
                gsi.d.i(bVar8);
                return bVar8;
            case 26:
                return wpg.v.k((LifecycleOwner) dVar.f130496m.get());
            case 27:
                uy.a aVar8 = new uy.a();
                dv.a aVar9 = (dv.a) dVar.A.get();
                xv.h hVar5 = (xv.h) dVar.u.get();
                vy.a aVar10 = dVar.d;
                py.d dVarB2 = bVar.f130480g.b();
                vc.s.j(dVarB2);
                yy.c cVar4 = (yy.c) dVar.D.get();
                dz.a aVar11 = new dz.a();
                ty.h hVar6 = new ty.h();
                ty.i iVar = new ty.i();
                qd0.b bVarN = ((ey.b) dVar.L).f130479c.n();
                vc.s.j(bVarN);
                return new com.revolut.camerakit.revolut.ui.flow.steps.camera.a(aVar8, aVar9, hVar5, aVar10, dVarB2, cVar4, aVar11, hVar6, iVar, new zy.f(new ybh.c0(bVarN, new ez.a())), (cli.n) dVar.J.get());
            case 28:
                qy.a aVar12 = (qy.a) bVar.f130483l.get();
                vy.a aVar13 = dVar.d;
                qd0.b bVarN2 = bVar.f130479c.n();
                vc.s.j(bVarN2);
                return new sy.c0(aVar12, aVar13, bVarN2);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        qy2.a aVar = (qy2.a) this.f247501b;
        qy2.c cVar = (qy2.c) this.d;
        int i = this.f247502c;
        switch (i) {
            case 0:
                g63.e cardScannerDelegate = (g63.e) cVar.f.get();
                ky2.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(cardScannerDelegate, "cardScannerDelegate");
                vc.s.k(cardScannerDelegate);
                return cardScannerDelegate;
            case 1:
                e63.a aVarA = aVar.f250110a.a();
                vc.s.j(aVarA);
                return ky2.c.a(aVarA, (w53.b) cVar.e.get(), (ifm.b) aVar.f250114h.get());
            case 2:
                Activity activity = bq.i.b(cVar.f250123a);
                e63.a factory = aVar.f250110a.a();
                vc.s.j(factory);
                ky2.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return e63.a.a(activity);
            case 3:
                return kpi.f.a();
            case 4:
                Context contextI = bq.i.i(cVar.f250123a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(cVar.f250123a);
                t70.g gVarO = aVar.f250111b.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 5:
                return new tpi.i((rpi.c) cVar.f250128j.get(), gsi.c.a(cVar.f250123a));
            case 6:
                return new rpi.b(bq.i.b(cVar.f250123a));
            case 7:
                return new rpi.h(bq.i.b(cVar.f250123a));
            case 8:
                return new iri.g((iri.j) aVar.i.get(), (iri.m) aVar.f250115j.get(), bq.i.f(cVar.f250123a), bq.i.l(cVar.f250123a));
            case 9:
                return new iri.l((iri.m) aVar.f250115j.get(), bq.i.f(cVar.f250123a), (iri.d) cVar.f250131n.get());
            case 10:
                return new iri.d(bq.i.f(cVar.f250123a));
            case 11:
                return new opi.b(bq.i.f(cVar.f250123a));
            case 12:
                return new aqi.d(bq.i.b(cVar.f250123a), new y80.b());
            case 13:
                return new en.c(ImmutableSet.of((ln.d) cVar.d.k.get()), bq.i.l(cVar.f250123a));
            case 14:
                return new xpi.c(cVar.f250124b, bq.i.b(cVar.f250123a));
            case 15:
                ypi.h hVar = cVar.f250125c;
                fsi.g gVar = cVar.f250123a;
                return new ypi.e(hVar, bq.i.b(gVar), bq.i.o(gVar), bq.i.g(gVar));
            case 16:
                return new k3l.d(bq.i.b(cVar.f250123a));
            case 17:
                jy2.j jVar = (jy2.j) aVar.f250119p.get();
                jy2.h hVar2 = (jy2.h) aVar.o.get();
                z53.b bVar = (z53.b) cVar.v.get();
                xpi.g gVar2 = (xpi.g) cVar.f250135s.get();
                ypi.i iVar = (ypi.i) cVar.f250136t.get();
                tpi.j jVar2 = (tpi.j) cVar.k.get();
                f9b.f fVar = (f9b.f) cVar.f250137w.get();
                jy2.e eVar = (jy2.e) cVar.f250138x.get();
                k3l.b bVar2 = (k3l.b) cVar.u.get();
                opi.d dVar = (opi.d) cVar.f250132p.get();
                rpi.j jVar3 = (rpi.j) cVar.f250129l.get();
                gte.a aVarB = aVar.f.b();
                vc.s.j(aVarB);
                ly2.l lVar = new ly2.l(jVar, hVar2, bVar, gVar2, iVar, jVar2, fVar, eVar, bVar2, dVar, jVar3, aVarB);
                kli.a.p(lVar, bq.i.d(cVar.f250123a));
                return lVar;
            case 18:
                g63.e cardScannerDelegate2 = (g63.e) cVar.f.get();
                ky2.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(cardScannerDelegate2, "cardScannerDelegate");
                vc.s.k(cardScannerDelegate2);
                return cardScannerDelegate2;
            case 19:
                return bq.i.t(cVar.f250123a);
            case 20:
                gte.a aVarB2 = aVar.f.b();
                vc.s.j(aVarB2);
                m93.d dVarF = aVar.f250112c.f();
                vc.s.j(dVarF);
                return new ly2.a(aVarB2, dVarF);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object l() {
        qy7.c cVar = (qy7.c) this.f247501b;
        qy7.a aVar = (qy7.a) this.d;
        int i = this.f247502c;
        switch (i) {
            case 0:
                ypi.h hVar = aVar.f250159b;
                fsi.g gVar = aVar.f250158a;
                return new ypi.e(hVar, bq.i.b(gVar), bq.i.o(gVar), bq.i.g(gVar));
            case 1:
                return new hqi.f(aVar.f250160c, bq.i.b(aVar.f250158a));
            case 2:
                return kpi.f.a();
            case 3:
                Context contextI = bq.i.i(aVar.f250158a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar.f250158a);
                t70.g gVarO = cVar.f250188b.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 4:
                return new tpi.i((rpi.c) aVar.f250163j.get(), gsi.c.a(aVar.f250158a));
            case 5:
                return new rpi.b(bq.i.b(aVar.f250158a));
            case 6:
                return new rpi.h(bq.i.b(aVar.f250158a));
            case 7:
                return new iri.g((iri.j) cVar.i.get(), (iri.m) cVar.f250192j.get(), bq.i.f(aVar.f250158a), bq.i.l(aVar.f250158a));
            case 8:
                return new iri.l((iri.m) cVar.f250192j.get(), bq.i.f(aVar.f250158a), (iri.d) aVar.f250166n.get());
            case 9:
                return new iri.d(bq.i.f(aVar.f250158a));
            case 10:
                return new opi.b(bq.i.f(aVar.f250158a));
            case 11:
                return new mx7.f((mx7.g) cVar.o.get(), bq.i.l(aVar.f250158a), (f9b.f) aVar.f250168q.get(), (tpi.j) aVar.k.get(), (opi.d) aVar.f250167p.get(), (qi3.r) cVar.f250196p.get(), aVar.d, (ypi.i) aVar.f.get(), (hqi.l) aVar.f250161g.get(), bq.i.o(aVar.f250158a));
            case 12:
                return bq.i.t(aVar.f250158a);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object m() {
        qy7.c cVar = (qy7.c) this.f247501b;
        qy7.b bVar = (qy7.b) this.d;
        int i = this.f247502c;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(bVar.f250170a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(bVar.f250170a);
                t70.g gVarO = cVar.f250188b.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) bVar.f.get(), gsi.c.a(bVar.f250170a));
            case 3:
                return new rpi.b(bq.i.b(bVar.f250170a));
            case 4:
                return new rpi.h(bq.i.b(bVar.f250170a));
            case 5:
                return new iri.g((iri.j) cVar.i.get(), new ly7.k(), bq.i.f(bVar.f250170a), bq.i.l(bVar.f250170a));
            case 6:
                return new iri.l(new ly7.k(), bq.i.f(bVar.f250170a), (iri.d) bVar.f250175j.get());
            case 7:
                return new iri.d(bq.i.f(bVar.f250170a));
            case 8:
                return new opi.b(bq.i.f(bVar.f250170a));
            case 9:
                bVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) cVar.u.get(), cVar.h());
            case 10:
                um.c cVar2 = (um.c) cVar.v.get();
                bVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(7);
                qy7.c cVar3 = bVar.f250172c;
                builderBuilderWithExpectedSize.add(cVar3.z.get());
                builderBuilderWithExpectedSize.add(cVar3.A.get());
                hn.h hVar = (hn.h) cVar3.B.get();
                t70.g gVarO2 = cVar3.f250188b.o();
                vc.s.j(gVarO2);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO2));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(cVar3.k());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(bVar.f250178n)));
                return new in.e(cVar2, builderBuilderWithExpectedSize.build(), cVar.h());
            case 11:
                return bq.i.t(bVar.f250170a);
            case 12:
                bVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(bVar.f250179p.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(bVar.f250173g)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) cVar.f250203y.get(), cVar.h());
            case 13:
                return new zm.a();
            case 14:
                bVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(bVar.f250172c.k());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) cVar.B.get(), (npi.f) bVar.e.get());
            case 15:
                return new en.c(ImmutableSet.of((ln.d) bVar.f250172c.f250198r.get()), bq.i.l(bVar.f250170a));
            case 16:
                return new gn.c((lpi.e) bVar.f250183t.get(), (sm.e) cVar.E.get(), ImmutableSet.copyOf((Collection) gn.e.a()), cVar.h());
            case 17:
                return new lpi.b(bq.i.i(bVar.f250170a), bq.i.j(bVar.f250170a));
            case 18:
                bVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) cVar.F.get(), cVar.h());
            case 19:
                bVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                qy7.c cVar4 = bVar.f250172c;
                builderBuilderWithExpectedSize4.add(cVar4.z.get());
                return new g3l.c(j6.a.g(cVar4.A, builderBuilderWithExpectedSize4), (g3l.g) cVar.f250201w.get(), (k3l.b) bVar.f250184w.get(), cVar.h());
            case 20:
                return new k3l.d(bq.i.b(bVar.f250170a));
            case 21:
                bVar.getClass();
                return new xpi.c(xpi.f.d, bq.i.b(bVar.f250170a));
            case 22:
                bVar.getClass();
                return new iqi.b(iqi.g.f167870b, bq.i.b(bVar.f250170a));
            case 23:
                ny7.f fVar = (ny7.f) bVar.A.get();
                tpi.j jVar = (tpi.j) bVar.f250173g.get();
                rpi.c cVar5 = (rpi.c) bVar.f.get();
                ly7.b bVar2 = (ly7.b) cVar.f250202x.get();
                ly7.a aVar = (ly7.a) cVar.N.get();
                l80.e eVarH = bVar.f250172c.f250188b.h();
                vc.s.j(eVarH);
                com.revolut.feature.insurance_pet.impl.ui.pet.dob.a aVar2 = new com.revolut.feature.insurance_pet.impl.ui.pet.dob.a(eVarH);
                w80.b bVarJ = cVar.f250188b.j();
                vc.s.j(bVarJ);
                ny7.y yVar = new ny7.y(fVar, jVar, cVar5, bVar2, aVar, aVar2, new sz7.b(bVarJ), new os2.g((opi.d) bVar.f250176l.get()), (opi.d) bVar.f250176l.get(), new oy7.a(new vx7.c(new yx7.d()), new qx7.a(), new sx7.d(new yx7.d())));
                kli.a.p(yVar, bq.i.d(bVar.f250170a));
                return yVar;
            case 24:
                PetEditFlowContract$Configuration configuration = bVar.f250171b;
                xpi.g navBar = (xpi.g) bVar.f250186y.get();
                iqi.h twinVerticalButtonView = (iqi.h) bVar.z.get();
                rpi.c keyboardView = (rpi.c) bVar.f.get();
                ly7.b router = (ly7.b) cVar.f250202x.get();
                ly7.a presentationModel = (ly7.a) cVar.N.get();
                fx7.a petAnalyticsInteractor = cVar.f250189c.a();
                vc.s.j(petAnalyticsInteractor);
                mm.d actionDispatcher = (mm.d) cVar.C.get();
                py7.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(navBar, "navBar");
                Intrinsics.checkNotNullParameter(twinVerticalButtonView, "twinVerticalButtonView");
                Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
                Intrinsics.checkNotNullParameter(router, "router");
                Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
                Intrinsics.checkNotNullParameter(petAnalyticsInteractor, "petAnalyticsInteractor");
                Intrinsics.checkNotNullParameter(actionDispatcher, "actionDispatcher");
                if (configuration instanceof PetEditFlowContract$Configuration.EditQuote) {
                    return new ny7.a0(navBar, twinVerticalButtonView, keyboardView, router, presentationModel, petAnalyticsInteractor, actionDispatcher);
                }
                if (!(configuration instanceof PetEditFlowContract$Configuration.EditPetFields) && !(configuration instanceof PetEditFlowContract$Configuration.EditPet)) {
                    throw new NoWhenBranchMatchedException();
                }
                return new ny7.b(navBar, twinVerticalButtonView, keyboardView, router, presentationModel, actionDispatcher);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object n() {
        qy7.c cVar = (qy7.c) this.f247501b;
        qy7.d dVar = (qy7.d) this.d;
        int i = this.f247502c;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(dVar.f250204a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(dVar.f250204a);
                t70.g gVarO = cVar.f250188b.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) dVar.e.get(), gsi.c.a(dVar.f250204a));
            case 3:
                return new rpi.b(bq.i.b(dVar.f250204a));
            case 4:
                return new rpi.h(bq.i.b(dVar.f250204a));
            case 5:
                return new iri.g((iri.j) cVar.i.get(), new ly7.k(), bq.i.f(dVar.f250204a), bq.i.l(dVar.f250204a));
            case 6:
                return new iri.l(new ly7.k(), bq.i.f(dVar.f250204a), (iri.d) dVar.i.get());
            case 7:
                return new iri.d(bq.i.f(dVar.f250204a));
            case 8:
                return new opi.b(bq.i.f(dVar.f250204a));
            case 9:
                return new en.c(ImmutableSet.of((ln.d) dVar.f250205b.f250198r.get()), bq.i.l(dVar.f250204a));
            case 10:
                return new wm.l((opi.d) dVar.k.get(), (wm.a) cVar.O.get(), ImmutableSet.copyOf((Collection) xm.b.a()), cVar.h());
            case 11:
                dVar.getClass();
                return new xpi.c(xpi.f.d, bq.i.b(dVar.f250204a));
            case 12:
                dVar.getClass();
                xoi.d dVar2 = dVar.f250204a;
                return new ypi.e(ypi.h.d, bq.i.b(dVar2), bq.i.o(dVar2), bq.i.g(dVar2));
            case 13:
                ry7.o oVar = new ry7.o((xpi.g) dVar.f250212n.get(), (ypi.i) dVar.o.get(), (ly7.b) cVar.f250202x.get(), (ly7.a) cVar.N.get(), (tpi.j) dVar.f.get(), (f9b.f) dVar.f250213p.get(), (opi.d) dVar.k.get(), new sy7.a());
                kli.a.p(oVar, bq.i.d(dVar.f250204a));
                return oVar;
            case 14:
                return bq.i.t(dVar.f250204a);
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object fVar;
        Object fVar2;
        Object cVar;
        Object aVar;
        Object aVar2;
        switch (this.f247500a) {
            case 0:
                w1 w1Var = (w1) this.d;
                int i = this.f247502c;
                switch (i) {
                    case 0:
                        tl7.f fVar3 = (tl7.f) w1Var.f.get();
                        ufg.p0.l(fVar3);
                        return fVar3;
                    case 1:
                        fVar = new tl7.f((j60.a) w1Var.e.get(), new vn7.a(), new in7.a(), new yl7.a(), new yl7.b(), new yl7.e());
                        break;
                    case 2:
                        return h30.l.p((com.revolut.kompot.navigable.a) w1Var.f247511c.get(), (rp0.m) w1Var.d.get());
                    case 3:
                        return new rp0.m();
                    case 4:
                        return kxa.j.l((j60.a) w1Var.e.get());
                    case 5:
                        jki.p pVar = (jki.p) w1Var.i.get();
                        AdditionalDriverDetailsScreenContract$InputData additionalDriverDetailsScreenContract$InputData = w1Var.f247510b;
                        l80.e eVarH = ((k0) this.f247501b).f.h();
                        vc.s.j(eVarH);
                        fVar = new yo7.s(pVar, additionalDriverDetailsScreenContract$InputData, eVarH, (tl7.f) w1Var.f.get());
                        break;
                    case 6:
                        return new yo7.t();
                    default:
                        throw new AssertionError(i);
                }
                return fVar;
            case 1:
                w1 w1Var2 = (w1) this.d;
                int i2 = this.f247502c;
                switch (i2) {
                    case 0:
                        tl7.f fVar4 = (tl7.f) w1Var2.f.get();
                        ufg.p0.l(fVar4);
                        return fVar4;
                    case 1:
                        fVar2 = new tl7.f((j60.a) w1Var2.e.get(), new vn7.a(), new in7.a(), new yl7.a(), new yl7.b(), new yl7.e());
                        break;
                    case 2:
                        return h30.l.p((com.revolut.kompot.navigable.a) w1Var2.f247511c.get(), (rp0.m) w1Var2.d.get());
                    case 3:
                        return new rp0.m();
                    case 4:
                        return kxa.j.l((j60.a) w1Var2.e.get());
                    case 5:
                        jki.p pVar2 = (jki.p) w1Var2.i.get();
                        AdditionalDriverDetailsScreenContract$InputData additionalDriverDetailsScreenContract$InputData2 = w1Var2.f247510b;
                        l80.e eVarH2 = ((k0) this.f247501b).f.h();
                        vc.s.j(eVarH2);
                        fVar2 = new yo7.s(pVar2, additionalDriverDetailsScreenContract$InputData2, eVarH2, (tl7.f) w1Var2.f.get());
                        break;
                    case 6:
                        return new yo7.t();
                    default:
                        throw new AssertionError(i2);
                }
                return fVar2;
            case 2:
                qof.c cVar2 = (qof.c) this.f247501b;
                qof.b bVar = (qof.b) this.d;
                int i3 = this.f247502c;
                switch (i3) {
                    case 0:
                        ypi.h hVar = bVar.f248167b;
                        xoi.d dVar = bVar.f248166a;
                        return new ypi.e(hVar, bq.i.b(dVar), bq.i.o(dVar), bq.i.g(dVar));
                    case 1:
                        return new xpi.c(bVar.f248168c, bq.i.b(bVar.f248166a));
                    case 2:
                        return kpi.f.a();
                    case 3:
                        Context contextI = bq.i.i(bVar.f248166a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(bVar.f248166a);
                        t70.g gVarO = cVar2.f248178b.o();
                        vc.s.j(gVarO);
                        cVar = new npi.c(contextI, baseDelegatesActivityF, gVarO);
                        break;
                    case 4:
                        return new tpi.i((rpi.c) bVar.f248170h.get(), gsi.c.a(bVar.f248166a));
                    case 5:
                        return new rpi.b(bq.i.b(bVar.f248166a));
                    case 6:
                        return new rpi.h(bq.i.b(bVar.f248166a));
                    case 7:
                        cVar = new iri.g((iri.j) cVar2.W.get(), (iri.m) cVar2.X.get(), bq.i.f(bVar.f248166a), bq.i.l(bVar.f248166a));
                        break;
                    case 8:
                        cVar = new iri.l((iri.m) cVar2.X.get(), bq.i.f(bVar.f248166a), (iri.d) bVar.f248172l.get());
                        break;
                    case 9:
                        return new iri.d(bq.i.f(bVar.f248166a));
                    case 10:
                        return new opi.b(bq.i.f(bVar.f248166a));
                    case 11:
                        rof.g gVar = new rof.g((pof.a) cVar2.i0.get(), bq.i.l(bVar.f248166a), (ypi.i) bVar.d.get(), (xpi.g) bVar.e.get(), (f9b.f) bVar.o.get(), (tpi.j) bVar.i.get(), (rpi.c) bVar.f248170h.get());
                        kli.a.p(gVar, bq.i.d(bVar.f248166a));
                        cVar = gVar;
                        break;
                    case 12:
                        return bq.i.t(bVar.f248166a);
                    default:
                        throw new AssertionError(i3);
                }
                return cVar;
            case 3:
                qof.c cVar3 = (qof.c) this.f247501b;
                qof.d dVar2 = (qof.d) this.d;
                int i5 = this.f247502c;
                switch (i5) {
                    case 0:
                        dVar2.getClass();
                        return new xpi.c(xpi.f.d, bq.i.b(dVar2.f248198a));
                    case 1:
                        return kpi.f.a();
                    case 2:
                        Context contextI2 = bq.i.i(dVar2.f248198a);
                        BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(dVar2.f248198a);
                        t70.g gVarO2 = cVar3.f248178b.o();
                        vc.s.j(gVarO2);
                        return new npi.c(contextI2, baseDelegatesActivityF2, gVarO2);
                    case 3:
                        return new tpi.i((rpi.c) dVar2.f248201g.get(), gsi.c.a(dVar2.f248198a));
                    case 4:
                        return new rpi.b(bq.i.b(dVar2.f248198a));
                    case 5:
                        return new rpi.h(bq.i.b(dVar2.f248198a));
                    case 6:
                        return new iri.g((iri.j) cVar3.W.get(), (iri.m) cVar3.X.get(), bq.i.f(dVar2.f248198a), bq.i.l(dVar2.f248198a));
                    case 7:
                        return new iri.l((iri.m) cVar3.X.get(), bq.i.f(dVar2.f248198a), (iri.d) dVar2.k.get());
                    case 8:
                        return new iri.d(bq.i.f(dVar2.f248198a));
                    case 9:
                        return new opi.b(bq.i.f(dVar2.f248198a));
                    case 10:
                        e4m.e eVar = dVar2.d;
                        xoi.d dVar3 = dVar2.f248198a;
                        xpi.g gVar2 = (xpi.g) eVar.get();
                        npi.a aVar3 = (npi.a) dVar2.f.get();
                        sri.m mVarL = bq.i.l(dVar3);
                        l70.e eVar2 = dVar2.f248200c.f248178b;
                        zk0.b bVarL = eVar2.l();
                        vc.s.j(bVarL);
                        l80.e eVarH3 = eVar2.h();
                        vc.s.j(eVarH3);
                        enf.e eVar3 = new enf.e(new enf.a());
                        zk0.b bVarL2 = eVar2.l();
                        vc.s.j(bVarL2);
                        pnf.h hVar2 = new pnf.h(gVar2, aVar3, mVarL, new rnf.l(bVarL, eVarH3, new enf.c(eVar3, bVarL2)), dVar2.f248199b);
                        kli.a.p(hVar2, bq.i.d(dVar3));
                        return hVar2;
                    default:
                        throw new AssertionError(i5);
                }
            case 4:
                qr7.a aVar4 = (qr7.a) this.d;
                int i6 = this.f247502c;
                if (i6 == 0) {
                    return new com.revolut.feature.insurance_common.ui.screen.documents.a((jki.p) aVar4.f248658b.get(), aVar4.f248657a, (or7.a) ((qr7.b) this.f247501b).i.get());
                }
                if (i6 == 1) {
                    return new ur7.f();
                }
                throw new AssertionError(i6);
            case 5:
                qth.g gVar3 = (qth.g) this.f247501b;
                qth.f fVar5 = (qth.f) this.d;
                qth.g gVar4 = fVar5.f249130b;
                int i21 = this.f247502c;
                if (i21 == 0) {
                    ivh.c cVar4 = (ivh.c) fVar5.f249131c.get();
                    gvh.d.a(cVar4);
                    return cVar4;
                }
                if (i21 == 1) {
                    v60.e eVarA = gVar4.i.a();
                    vc.s.j(eVarA);
                    sf0.h hVarB = gVar4.f249137j.b();
                    vc.s.j(hVarB);
                    return gvh.c.a(new kvh.h(hVarB, eVarA), gVar3.f249141p.a());
                }
                if (i21 != 2) {
                    throw new AssertionError(i21);
                }
                SdkFlowContract$InputData sdkFlowContract$InputData = fVar5.f249129a;
                til.d dVar4 = (til.d) gVar3.f249132a.f316441l.get();
                vc.s.j(dVar4);
                jvh.a aVarA = gVar3.f249134c.a();
                vc.s.j(aVarA);
                return new com.revolut.feature.workflow.engine.sdk_flow.f(sdkFlowContract$InputData, dVar4, aVarA, new kvh.f(), new wy8.a(), (ivh.c) fVar5.f249131c.get(), new wuh.g(), new xuh.b(gVar4.f249142q.b()));
            case 6:
                qth.h hVar3 = (qth.h) this.d;
                qth.g gVar5 = (qth.g) this.f247501b;
                l70.e eVar4 = gVar5.f249136h;
                int i22 = this.f247502c;
                if (i22 == 0) {
                    ivh.c cVar5 = (ivh.c) hVar3.d.get();
                    gvh.d.a(cVar5);
                    return cVar5;
                }
                if (i22 == 1) {
                    qth.g gVar6 = hVar3.f249147b;
                    v60.e eVarA2 = gVar6.i.a();
                    vc.s.j(eVarA2);
                    sf0.h hVarB2 = gVar6.f249137j.b();
                    vc.s.j(hVarB2);
                    return gvh.c.a(new kvh.h(hVarB2, eVarA2), gVar5.f249141p.a());
                }
                if (i22 != 2) {
                    if (i22 != 3) {
                        throw new AssertionError(i22);
                    }
                    tog.a aVar5 = (tog.a) gVar5.f249143r.f217679l.get();
                    vc.s.j(aVar5);
                    return new oth.a(aVar5);
                }
                WorkflowDocumentSelectionFlowContract$InputData workflowDocumentSelectionFlowContract$InputData = hVar3.f249146a;
                oth.a aVar6 = (oth.a) hVar3.f.get();
                jvh.a aVarA2 = gVar5.f249134c.a();
                vc.s.j(aVarA2);
                qd0.b bVarN = eVar4.n();
                vc.s.j(bVarN);
                ivh.c cVar6 = (ivh.c) hVar3.d.get();
                f80.a aVarX = eVar4.x();
                vc.s.j(aVarX);
                return new com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.b(workflowDocumentSelectionFlowContract$InputData, aVar6, aVarA2, bVarN, cVar6, aVarX);
            case 7:
                qth.i iVar = (qth.i) this.d;
                qth.g gVar7 = (qth.g) this.f247501b;
                gvh.a aVar7 = gVar7.f249134c;
                ysb.c cVar7 = gVar7.f249132a;
                int i32 = this.f247502c;
                switch (i32) {
                    case 0:
                        Object bottomDialogControllerExtension = (j60.a) iVar.e.get();
                        Intrinsics.checkNotNullParameter(bottomDialogControllerExtension, "bottomDialogControllerExtension");
                        yji.d dVar5 = (yji.d) bottomDialogControllerExtension;
                        vc.s.k(dVar5);
                        return dVar5;
                    case 1:
                        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) iVar.d.get();
                        j60.e dialogHostFinder = new j60.e();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
                        return new j60.c(controller, new rp0.m(), dialogHostFinder);
                    case 2:
                        til.d extension = (til.d) cVar7.f316441l.get();
                        vc.s.j(extension);
                        qth.k.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        return extension;
                    case 3:
                        til.h extension2 = (til.h) cVar7.f316443n.get();
                        vc.s.j(extension2);
                        qth.k.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        return extension2;
                    case 4:
                        Object extension3 = (ep6.n) iVar.f249155j.get();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        yji.n nVar = (yji.n) extension3;
                        vc.s.k(nVar);
                        return nVar;
                    case 5:
                        zo6.a factory = gVar7.f249133b.a();
                        vc.s.j(factory);
                        j60.a bottomExpandableDialogControllerExtension = (j60.a) iVar.e.get();
                        rp0.g1 shotDialogDisplayer = (rp0.g1) iVar.i.get();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
                        ep6.n nVarA = factory.a(bottomExpandableDialogControllerExtension, shotDialogDisplayer, pr.f165860a);
                        vc.s.k(nVarA);
                        return nVarA;
                    case 6:
                        com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) iVar.d.get();
                        Intrinsics.checkNotNullParameter(controller2, "controller");
                        return rp0.x0.a(rp0.g1.Companion, controller2.D2());
                    case 7:
                        jvh.a aVarA3 = aVar7.a();
                        vc.s.j(aVarA3);
                        rth.j jVarJ = iVar.j();
                        rth.o oVar = new rth.o(iVar.c());
                        avh.i iVar2 = new avh.i(iVar.j());
                        pth.e eVarC = iVar.c();
                        til.a aVar8 = (til.a) cVar7.k.get();
                        vc.s.j(aVar8);
                        nuh.l lVar = (nuh.l) gVar7.f249135g.i.get();
                        vc.s.j(lVar);
                        til.d dVar6 = (til.d) cVar7.f316441l.get();
                        vc.s.j(dVar6);
                        hvh.a aVar9 = (hvh.a) aVar7.f147175r.get();
                        vc.s.j(aVar9);
                        ep6.n nVar2 = (ep6.n) iVar.f249155j.get();
                        qd0.b bVarN2 = gVar7.f249136h.n();
                        vc.s.j(bVarN2);
                        til.h hVar4 = (til.h) cVar7.f316443n.get();
                        vc.s.j(hVar4);
                        kvh.h hVarB3 = iVar.b();
                        atb.b bVar2 = (atb.b) gVar7.f.f316434c.get();
                        vc.s.j(bVar2);
                        pvh.b bVar3 = new pvh.b();
                        skd.i iVarC = gVar7.k.c();
                        om4.d0 d0VarB = gVar7.f249138l.b();
                        gte.a aVarB = gVar7.f249139m.b();
                        vc.s.j(aVarB);
                        return new com.revolut.feature.workflow.engine.onboarding.impl.workflow.a(aVarA3, jVarJ, oVar, iVar2, eVarC, aVar8, lVar, dVar6, aVar9, nVar2, bVarN2, hVar4, hVarB3, bVar2, bVar3, iVarC, d0VarB, aVarB, iVar.f249150a);
                    default:
                        throw new AssertionError(i32);
                }
            case 8:
                qud.c cVar8 = (qud.c) this.f247501b;
                qud.b bVar4 = (qud.b) this.d;
                int i33 = this.f247502c;
                switch (i33) {
                    case 0:
                        fvd.a extension4 = (fvd.a) bVar4.d.get();
                        evd.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension4, "extension");
                        vc.s.k(extension4);
                        return extension4;
                    case 1:
                        com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) bVar4.f249354c.get();
                        evd.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller3, "controller");
                        aVar = new fvd.a(controller3);
                        break;
                    case 2:
                        return kxa.j.k((j60.a) bVar4.f249355g.get());
                    case 3:
                        return ehe.n.s((com.revolut.kompot.navigable.a) bVar4.f249354c.get(), (rp0.m) bVar4.f.get());
                    case 4:
                        return new rp0.m();
                    case 5:
                        n60.a aVar10 = (n60.a) bVar4.i.get();
                        o5k.i.l(aVar10);
                        return aVar10;
                    case 6:
                        return o5k.i.q((com.revolut.kompot.navigable.a) bVar4.f249354c.get());
                    case 7:
                        ce5.b bVar5 = cVar8.f249367h;
                        be5.b cryptoConvertDialogDisclaimerFactory = new be5.b();
                        ldd.b focusRequesterDelegate = (ldd.b) bVar4.k.get();
                        n60.a keyboardExtension = (n60.a) bVar4.i.get();
                        swd.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(cryptoConvertDialogDisclaimerFactory, "cryptoConvertDialogDisclaimerFactory");
                        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
                        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
                        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
                        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
                        return new be5.a();
                    case 8:
                        kdd.b bVar6 = cVar8.i;
                        ldd.a focusRequesterDelegateFactory = new ldd.a();
                        swd.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(focusRequesterDelegateFactory, "focusRequesterDelegateFactory");
                        return new ldd.b();
                    case 9:
                        e4m.e eVar5 = bVar4.o;
                        StakeControllerContract$InputData stakeControllerContract$InputData = bVar4.f249352a;
                        cli.n nVar3 = (cli.n) eVar5.get();
                        l70.e eVar6 = cVar8.f249368j;
                        gsc.c cVar9 = cVar8.f249373q;
                        i90.b bVar7 = new i90.b();
                        wsg.n nVarB = cVar8.d.b();
                        ppk.f fVarA = cVar8.k.a();
                        xv5.c cVarA = cVar8.f249369l.a();
                        vc.s.j(cVarA);
                        zwd.e eVar7 = (zwd.e) bVar4.f249361p.get();
                        zwd.b bVar8 = (zwd.b) bVar4.f249360n.get();
                        j60.a aVar11 = (j60.a) bVar4.f249355g.get();
                        fxd.a aVar12 = new fxd.a();
                        w0i.a aVarA4 = cVar8.f249370m.a();
                        w80.b bVar9 = (w80.b) bVar4.f249359m.get();
                        gte.a aVarB2 = cVar8.f249366g.b();
                        vc.s.j(aVarB2);
                        o7.b bVarA = cVar8.f249371n.a();
                        sud.b bVarI = cVar8.i();
                        ang.f fVarE = cVar8.o.e();
                        twd.a aVar13 = new twd.a();
                        gud.b bVarA2 = cVar8.f249372p.a();
                        qud.c cVar10 = bVar4.f249353b;
                        wsg.n nVarB2 = cVar10.d.b();
                        ppk.f fVarA2 = cVar10.k.a();
                        xv5.c cVarA2 = cVar10.f249369l.a();
                        vc.s.j(cVarA2);
                        gte.a aVarB3 = cVar10.f249366g.b();
                        vc.s.j(aVarB3);
                        cwd.b bVarB = cVar10.f249363a.b();
                        vc.s.j(bVarB);
                        uwd.i iVar3 = new uwd.i(stakeControllerContract$InputData, nVarB2, fVarA2, cVarA2, aVarB3, bVarB);
                        zrc.d dVarA = cVar9.a();
                        hsc.c cVarB = cVar9.b();
                        ae5.a aVar14 = (ae5.a) bVar4.f249358l.get();
                        vo9.a aVarB4 = ((ut9.a) cVar8.f249374r).b();
                        vc.s.j(aVarB4);
                        return new com.revolut.feature.staking.impl.stake.v2.b(nVar3, bVar7, stakeControllerContract$InputData, nVarB, fVarA, cVarA, eVar7, bVar8, aVar11, aVar12, aVarA4, bVar9, aVarB2, bVarA, bVarI, fVarE, aVar13, bVarA2, iVar3, dVarA, cVarB, aVar14, aVarB4);
                    case 10:
                        w80.b bVar10 = (w80.b) bVar4.f249359m.get();
                        qd0.b bVarN3 = cVar8.f249368j.n();
                        vc.s.j(bVarN3);
                        zwd.b bVar11 = (zwd.b) bVar4.f249360n.get();
                        gte.a aVarB5 = cVar8.f249366g.b();
                        vc.s.j(aVarB5);
                        aVar = new qwd.x(bVar10, bVarN3, bVar11, aVarB5, cVar8.j(), new uwd.j());
                        break;
                    case 11:
                        qd0.b languageProvider = cVar8.f249368j.n();
                        vc.s.j(languageProvider);
                        rwd.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                        return v80.b.b(languageProvider, false, false, 58);
                    case 12:
                        return rwd.c.a();
                    case 13:
                        return rwd.d.a();
                    default:
                        throw new AssertionError(i33);
                }
                return aVar;
            case 9:
                qud.d dVar7 = (qud.d) this.d;
                qud.c cVar11 = (qud.c) this.f247501b;
                int i43 = this.f247502c;
                switch (i43) {
                    case 0:
                        return kxa.j.k((j60.a) dVar7.e.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) dVar7.f249382c.get(), (rp0.m) dVar7.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return nga.c.s(cVar11.f249375s.c(), (mga.i0) dVar7.f249383g.get(), (mga.f0) dVar7.i.get(), (on.a) dVar7.f249385j.get());
                    case 4:
                        yji.o controller4 = (com.revolut.kompot.navigable.a) dVar7.f249382c.get();
                        iud.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller4, "controller");
                        mga.i0 i0Var = (mga.i0) controller4;
                        vc.s.k(i0Var);
                        return i0Var;
                    case 5:
                        return nga.c.u(cVar11.f249375s.c(), dVar7.f249380a, (wn.a) dVar7.f249384h.get());
                    case 6:
                        return v7.z(cVar11.f249376t, "provider");
                    case 7:
                        os2.g factory2 = cVar11.f249376t.c();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        return (sn.a) factory2.f229224b;
                    case 8:
                        wn.a aVar15 = (wn.a) dVar7.f249384h.get();
                        n57.a.d(aVar15);
                        return aVar15;
                    case 9:
                        StakingConfirmationControllerContract$InputData stakingConfirmationControllerContract$InputData = dVar7.f249381b;
                        l70.e eVar8 = cVar11.f249368j;
                        rtd.a aVar16 = cVar11.f249363a;
                        i90.b bVar12 = new i90.b();
                        cli.n nVar4 = (cli.n) dVar7.f249388n.get();
                        yud.g gVarD = aVar16.d();
                        vc.s.j(gVarD);
                        o7.b bVarA3 = cVar11.f249371n.a();
                        wsg.n nVarB3 = cVar11.d.b();
                        exd.a aVar17 = (exd.a) dVar7.o.get();
                        sud.b bVarI2 = cVar11.i();
                        ang.f fVarE2 = cVar11.o.e();
                        rud.a aVar18 = (rud.a) dVar7.f249389p.get();
                        u2i.d dVar8 = new u2i.d();
                        mre.c cVarB2 = cVar11.f249377w.b();
                        vc.s.j(cVarB2);
                        sh5.d dVarF = cVar11.f.f();
                        vc.s.j(dVarF);
                        j60.a aVar19 = (j60.a) dVar7.e.get();
                        tga.k kVarB = cVar11.f249378x.b();
                        cwd.b bVarB2 = aVar16.b();
                        vc.s.j(bVarB2);
                        return new com.revolut.feature.staking.impl.confirmation.a(stakingConfirmationControllerContract$InputData, bVar12, nVar4, gVarD, bVarA3, nVarB3, aVar17, bVarI2, fVarE2, aVar18, dVar8, cVarB2, dVarF, aVar19, kVarB, bVarB2, new be5.e());
                    case 10:
                        return new hud.r(cVar11.j(), (xud.b) dVar7.f249387m.get());
                    case 11:
                        return new xud.c();
                    case 12:
                        return new exd.b();
                    case 13:
                        sf0.h hVarB4 = cVar11.u.b();
                        vc.s.j(hVarB4);
                        v60.e eVarA3 = cVar11.v.a();
                        vc.s.j(eVarA3);
                        return new rud.b(hVarB4, eVarA3);
                    default:
                        throw new AssertionError(i43);
                }
            case 10:
                qud.e eVar9 = (qud.e) this.d;
                qud.c cVar12 = (qud.c) this.f247501b;
                int i59 = this.f247502c;
                if (i59 == 0) {
                    StakingControllerContract$InputData stakingControllerContract$InputData = eVar9.f249391a;
                    gte.a aVarB6 = cVar12.f249366g.b();
                    vc.s.j(aVarB6);
                    return new com.revolut.feature.staking.impl.flow.stake.v2.a(stakingControllerContract$InputData, aVarB6, (th5.b) eVar9.f249392b.get());
                }
                if (i59 != 1) {
                    throw new AssertionError(i59);
                }
                hi5.f factory3 = (hi5.f) cVar12.f.A.get();
                vc.s.j(factory3);
                uh5.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                return new hi5.h(factory3.f152500b, factory3.f152499a, factory3.f152501c);
            case 11:
                qud.c cVar13 = (qud.c) this.f247501b;
                int i66 = this.f247502c;
                if (i66 != 0) {
                    if (i66 == 1) {
                        return new vwd.k((aud.a) cVar13.B.get());
                    }
                    throw new AssertionError(i66);
                }
                qud.f fVar6 = (qud.f) this.d;
                StakingProduct stakingProduct = fVar6.f249394a;
                cli.n nVar5 = (cli.n) fVar6.f249395b.get();
                ang.f fVarE3 = cVar13.o.e();
                mre.c cVarB3 = cVar13.f249377w.b();
                vc.s.j(cVarB3);
                return new com.revolut.feature.staking.impl.stakingdetails.v2.a(stakingProduct, nVar5, fVarE3, cVarB3);
            case 12:
                qud.c cVar14 = (qud.c) this.f247501b;
                qud.h hVar5 = (qud.h) this.d;
                int i74 = this.f247502c;
                switch (i74) {
                    case 0:
                        fvd.a extension5 = (fvd.a) hVar5.f249402c.get();
                        evd.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension5, "extension");
                        vc.s.k(extension5);
                        return extension5;
                    case 1:
                        com.revolut.kompot.navigable.a controller5 = (com.revolut.kompot.navigable.a) hVar5.f249401b.get();
                        evd.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller5, "controller");
                        aVar2 = new fvd.a(controller5);
                        break;
                    case 2:
                        return kxa.j.k((j60.a) hVar5.f.get());
                    case 3:
                        return ehe.n.s((com.revolut.kompot.navigable.a) hVar5.f249401b.get(), (rp0.m) hVar5.e.get());
                    case 4:
                        return new rp0.m();
                    case 5:
                        cli.n nVar6 = (cli.n) hVar5.k.get();
                        StakingPocket stakingPocket = hVar5.f249400a;
                        yud.g gVarD2 = cVar14.f249363a.d();
                        vc.s.j(gVarD2);
                        ppk.f fVarA3 = cVar14.k.a();
                        xv5.c cVarA3 = cVar14.f249369l.a();
                        vc.s.j(cVarA3);
                        return new com.revolut.feature.staking.impl.unstake.v2.a(nVar6, stakingPocket, gVarD2, fVarA3, cVarA3, (w80.b) hVar5.f249404h.get(), (rud.a) hVar5.f249406l.get(), (zwd.b) hVar5.i.get(), (zwd.e) hVar5.f249407m.get(), (j60.a) hVar5.f.get(), new wwd.b(cVar14.f249364b.h()), new i90.b());
                    case 6:
                        w80.b bVar13 = (w80.b) hVar5.f249404h.get();
                        qd0.b bVarN4 = cVar14.f249368j.n();
                        vc.s.j(bVarN4);
                        return new xwd.p(bVar13, bVarN4, (dvd.a) hVar5.f249405j.get(), (zwd.b) hVar5.i.get());
                    case 7:
                        qd0.b languageProvider2 = cVar14.f249368j.n();
                        vc.s.j(languageProvider2);
                        ywd.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(languageProvider2, "languageProvider");
                        return v80.b.b(languageProvider2, false, false, 58);
                    case 8:
                        return new dvd.c((zwd.b) hVar5.i.get());
                    case 9:
                        return ywd.c.a();
                    case 10:
                        sf0.h hVarB5 = cVar14.u.b();
                        vc.s.j(hVarB5);
                        v60.e eVarA4 = cVar14.v.a();
                        vc.s.j(eVarA4);
                        aVar2 = new rud.b(hVarB5, eVarA4);
                        break;
                    case 11:
                        return ywd.d.a();
                    default:
                        throw new AssertionError(i74);
                }
                return aVar2;
            case 13:
                qve.e eVar10 = (qve.e) this.d;
                qve.k kVar = (qve.k) this.f247501b;
                ove.t tVar = kVar.f249604b;
                int i92 = this.f247502c;
                if (i92 != 0) {
                    if (i92 == 1) {
                        return new ewe.b();
                    }
                    throw new AssertionError(i92);
                }
                ExternalCardDetailsFlowContract$InputData externalCardDetailsFlowContract$InputData = eVar10.f249585a;
                y51.a aVarA5 = tVar.a();
                vc.s.j(aVarA5);
                e0f.i iVar4 = (e0f.i) tVar.T.get();
                vc.s.j(iVar4);
                u51.a aVarA6 = kVar.e.a();
                vc.s.j(aVarA6);
                n3i.b bVarA4 = kVar.f249609g.a();
                ewe.d dVar9 = new ewe.d();
                jvh.a aVarA7 = kVar.f249610h.a();
                vc.s.j(aVarA7);
                til.m mVarA = kVar.i.a();
                vc.s.j(mVarA);
                return new com.revolut.feature.topup_screen.impl.flow.external_card_details.e(externalCardDetailsFlowContract$InputData, aVarA5, iVar4, aVarA6, bVarA4, dVar9, aVarA7, mVarA, (ewe.b) eVar10.d.get());
            case 14:
                qve.k kVar2 = (qve.k) this.f247501b;
                qve.h hVar6 = (qve.h) this.d;
                int i96 = this.f247502c;
                if (i96 == 0) {
                    return new aye.m(hVar6.f249594a, kVar2.f249604b.b(), (cli.n) hVar6.f249595b.get());
                }
                if (i96 != 1) {
                    throw new AssertionError(i96);
                }
                je6.h hVarC = ((xf6.t) kVar2.f).c();
                vc.s.j(hVarC);
                return new aye.p(hVarC, new sze.d(new sze.b()));
            case 15:
                return a();
            case 16:
                return b();
            case 17:
                return c();
            case 18:
                return d();
            case 19:
                return e();
            case 20:
                return f();
            case 21:
                return g();
            case 22:
                return h();
            case 23:
                return i();
            case 24:
                return j();
            case 25:
                return k();
            case 26:
                return l();
            case 27:
                return m();
            case 28:
                return n();
            default:
                qy7.c cVar15 = (qy7.c) this.f247501b;
                qy7.e eVar11 = (qy7.e) this.d;
                int i99 = this.f247502c;
                switch (i99) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI3 = bq.i.i(eVar11.f250215a);
                        BaseDelegatesActivity baseDelegatesActivityF3 = bq.i.f(eVar11.f250215a);
                        t70.g gVarO3 = cVar15.f250188b.o();
                        vc.s.j(gVarO3);
                        return new npi.c(contextI3, baseDelegatesActivityF3, gVarO3);
                    case 2:
                        return new tpi.i((rpi.c) eVar11.e.get(), gsi.c.a(eVar11.f250215a));
                    case 3:
                        return new rpi.b(bq.i.b(eVar11.f250215a));
                    case 4:
                        return new rpi.h(bq.i.b(eVar11.f250215a));
                    case 5:
                        return new iri.g((iri.j) cVar15.i.get(), new ly7.k(), bq.i.f(eVar11.f250215a), bq.i.l(eVar11.f250215a));
                    case 6:
                        return new iri.l(new ly7.k(), bq.i.f(eVar11.f250215a), (iri.d) eVar11.i.get());
                    case 7:
                        return new iri.d(bq.i.f(eVar11.f250215a));
                    case 8:
                        return new opi.b(bq.i.f(eVar11.f250215a));
                    case 9:
                        return new en.c(ImmutableSet.of((ln.d) eVar11.f250216b.f250198r.get()), bq.i.l(eVar11.f250215a));
                    case 10:
                        eVar11.getClass();
                        return new xpi.c(xpi.f.d, bq.i.b(eVar11.f250215a));
                    case 11:
                        eVar11.getClass();
                        return new iqi.b(iqi.g.f167870b, bq.i.b(eVar11.f250215a));
                    case 12:
                        eVar11.getClass();
                        return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) cVar15.u.get(), cVar15.h());
                    case 13:
                        um.c cVar16 = (um.c) cVar15.v.get();
                        eVar11.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(7);
                        qy7.c cVar17 = eVar11.f250216b;
                        builderBuilderWithExpectedSize.add(cVar17.z.get());
                        builderBuilderWithExpectedSize.add(cVar17.A.get());
                        hn.h hVar7 = (hn.h) cVar17.B.get();
                        t70.g gVarO4 = cVar17.f250188b.o();
                        vc.s.j(gVarO4);
                        builderBuilderWithExpectedSize.add(new jn.a(hVar7, gVarO4));
                        builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize.add(cVar17.k());
                        builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(eVar11.f250224p)));
                        return new in.e(cVar16, builderBuilderWithExpectedSize.build(), cVar15.h());
                    case 14:
                        return bq.i.t(eVar11.f250215a);
                    case 15:
                        eVar11.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize2.add(eVar11.f250226r.get());
                        builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(eVar11.f)));
                        return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) cVar15.f250203y.get(), cVar15.h());
                    case 16:
                        return new zm.a();
                    case 17:
                        eVar11.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize3.add(eVar11.f250216b.k());
                        return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) cVar15.B.get(), (npi.f) eVar11.d.get());
                    case 18:
                        return new gn.c((lpi.e) eVar11.u.get(), (sm.e) cVar15.E.get(), ImmutableSet.copyOf((Collection) gn.e.a()), cVar15.h());
                    case 19:
                        return new lpi.b(bq.i.i(eVar11.f250215a), bq.i.j(eVar11.f250215a));
                    case 20:
                        eVar11.getClass();
                        return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) cVar15.F.get(), cVar15.h());
                    case 21:
                        eVar11.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                        qy7.c cVar18 = eVar11.f250216b;
                        builderBuilderWithExpectedSize4.add(cVar18.z.get());
                        return new g3l.c(j6.a.g(cVar18.A, builderBuilderWithExpectedSize4), (g3l.g) cVar15.f250201w.get(), (k3l.b) eVar11.f250230x.get(), cVar15.h());
                    case 22:
                        return new k3l.d(bq.i.b(eVar11.f250215a));
                    case 23:
                        return new wm.l((opi.d) eVar11.k.get(), (wm.a) cVar15.O.get(), ImmutableSet.copyOf((Collection) xm.b.a()), cVar15.h());
                    case 24:
                        xpi.g gVar8 = (xpi.g) eVar11.f250222m.get();
                        iqi.h hVar8 = (iqi.h) eVar11.f250223n.get();
                        ly7.b bVar14 = (ly7.b) cVar15.f250202x.get();
                        ly7.a aVar20 = (ly7.a) cVar15.N.get();
                        tpi.j jVar = (tpi.j) eVar11.f.get();
                        f9b.f fVar7 = (f9b.f) eVar11.f250224p.get();
                        opi.d dVar10 = (opi.d) eVar11.k.get();
                        fx7.f fVarB = eVar11.f250216b.f250189c.b();
                        vc.s.j(fVarB);
                        ty7.p pVar3 = new ty7.p(gVar8, hVar8, bVar14, aVar20, jVar, fVar7, dVar10, new uy7.f(new yx7.h(fVarB), new yx7.d()), (mm.d) cVar15.C.get());
                        kli.a.p(pVar3, bq.i.d(eVar11.f250215a));
                        return pVar3;
                    default:
                        throw new AssertionError(i99);
                }
        }
    }
}
