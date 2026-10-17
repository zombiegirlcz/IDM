package r7d;

import android.app.Activity;
import android.content.Context;
import android.text.InputFilter;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultRegistry;
import blh.g0;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.passcode.PasscodeScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Input;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.pick_your_rate.PickYourRateScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.ReviewProductDetailsScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.SavingsCurrencySelectionContract$InputData;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.SavingsProductSelectionContract$InputData;
import com.revolut.feature.retail.slot_manager.impl.network.RetailSlotManagerChecklistService;
import com.revolut.feature.slot_manager.impl.ui.screen.checklist.SlotChecklistControllerContract$InputData;
import com.revolut.feature.slot_manager.impl.ui.screen.prompt.SlotManagerPromptControllerContract$InputData;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_swift_transfer_status.InboundSwiftTransferStatusScreenContract$InputData;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_transaction_list.InboundTransactionListScreenContract$InputData;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.ChallengeDetailsScreenContract$InputData;
import dee.d0;
import dee.f0;
import dee.i0;
import fmb.o0;
import g48.r0;
import i60.b;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import om4.k0;
import pyc.c0;
import qgk.k3;
import t80.e;
import vtc.p0;
import wf0.m0;
import wf0.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f252156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f252157c;
    public final Object d;

    public /* synthetic */ o(Object obj2, Object obj3, int i, int i2) {
        this.f252155a = i2;
        this.f252156b = obj2;
        this.d = obj3;
        this.f252157c = i;
    }

    private final Object a() {
        rlb.h hVar = (rlb.h) this.d;
        int i = this.f252157c;
        if (i == 0) {
            return kxa.j.j((j60.a) hVar.d.get());
        }
        if (i == 1) {
            return v1.c.r((com.revolut.kompot.navigable.a) hVar.f254994b.get(), (rp0.m) hVar.f254995c.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i == 3) {
            ijb.a aVarG = ((blb.e) ((rlb.e) this.f252156b).f254970a).g();
            vc.s.j(aVarG);
            return new zlb.o(aVarG, (j60.a) hVar.f.get(), new zlb.r(new dcd.b()), hVar.f254993a);
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        j60.a bottomExpandableDialogEmbeddedControllerExtension = (j60.a) hVar.d.get();
        amb.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(bottomExpandableDialogEmbeddedControllerExtension, "bottomExpandableDialogEmbeddedControllerExtension");
        vc.s.k(bottomExpandableDialogEmbeddedControllerExtension);
        return bottomExpandableDialogEmbeddedControllerExtension;
    }

    private final Object b() {
        rlb.i iVar = (rlb.i) this.d;
        rlb.e eVar = (rlb.e) this.f252156b;
        tib.b bVar = eVar.f254970a;
        int i = this.f252157c;
        if (i == 0) {
            clb.c extension = (clb.c) iVar.f254998b.get();
            cmb.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            vc.s.k(extension);
            return extension;
        }
        if (i == 1) {
            dkk.a0 savingsErrorHandlingApiFactory = ((blb.e) bVar).d();
            cmb.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(savingsErrorHandlingApiFactory, "savingsErrorHandlingApiFactory");
            return savingsErrorHandlingApiFactory.a();
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        ijb.a aVarG = ((blb.e) bVar).g();
        vc.s.j(aVarG);
        ffk.t tVarF = eVar.f254971b.f();
        vc.s.j(tVarF);
        ugc.a aVarB = ((vjb.b) eVar.d).b();
        wli.x xVarD = ((s41.a) eVar.i).d();
        f80.a aVarX = eVar.f254978n.x();
        vc.s.j(aVarX);
        gte.a aVarB2 = eVar.f254974h.b();
        vc.s.j(aVarB2);
        clb.c cVar = (clb.c) iVar.f254998b.get();
        rlb.e eVar2 = iVar.f254997a;
        dcd.b bVar2 = new dcd.b();
        gte.a aVarB3 = eVar2.f254974h.b();
        vc.s.j(aVarB3);
        return new bmb.u(aVarG, tVarF, aVarB, xVarD, aVarX, aVarB2, cVar, new bmb.w(bVar2, aVarB3));
    }

    private final Object c() {
        rlb.e eVar = (rlb.e) this.f252156b;
        rlb.j jVar = (rlb.j) this.d;
        int i = this.f252157c;
        switch (i) {
            case 0:
                return kxa.j.j((j60.a) jVar.e.get());
            case 1:
                return v1.c.r((com.revolut.kompot.navigable.a) jVar.f255002c.get(), (rp0.m) jVar.d.get());
            case 2:
                return new rp0.m();
            case 3:
                Object extension = (tmb.i) jVar.f255004h.get();
                umb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar = (yji.n) extension;
                vc.s.k(nVar);
                return nVar;
            case 4:
                j60.a aVar = (j60.a) jVar.f255003g.get();
                pmb.k kVar = new pmb.k();
                mre.c cVarB = eVar.k.b();
                vc.s.j(cVarB);
                return new tmb.l(aVar, kVar, cVarB, ((s41.a) eVar.i).d());
            case 5:
                j60.a bottomExpandableDialogEmbeddedControllerExtension = (j60.a) jVar.e.get();
                qmb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(bottomExpandableDialogEmbeddedControllerExtension, "bottomExpandableDialogEmbeddedControllerExtension");
                vc.s.k(bottomExpandableDialogEmbeddedControllerExtension);
                return bottomExpandableDialogEmbeddedControllerExtension;
            case 6:
                ijb.a aVarG = ((blb.e) eVar.f254970a).g();
                vc.s.j(aVarG);
                wsg.n nVarB = eVar.f254976l.b();
                ang.f fVarE = eVar.f254977m.e();
                tmb.i iVar = (tmb.i) jVar.f255004h.get();
                SavingsProductSelectionContract$InputData savingsProductSelectionContract$InputData = jVar.f255000a;
                f80.a aVarX = eVar.f254978n.x();
                vc.s.j(aVarX);
                return new com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.a(aVarG, nVarB, fVarE, iVar, savingsProductSelectionContract$InputData, aVarX, new pmb.r(new tmb.b(), new tmb.a(), new dcd.b(), ((k3) jVar.f255001b.o).b(), new vlb.c()));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        rr1.c cVar = (rr1.c) this.d;
        rr1.a aVar = (rr1.a) this.f252156b;
        l70.e eVar = aVar.f256633c;
        int i = this.f252157c;
        if (i == 0) {
            wsg.n nVarB = aVar.f256632b.b();
            w80.b bVarJ = eVar.j();
            vc.s.j(bVarJ);
            l2j.a aVar2 = new l2j.a();
            tr1.g gVar = (tr1.g) aVar.o.get();
            rr1.a aVar3 = cVar.f256644b;
            so9.b bVar = aVar3.d;
            jm4.r rVar = aVar3.e;
            vo9.a aVarB = ((ut9.a) bVar).b();
            vc.s.j(aVarB);
            k0 k0VarQ = rVar.q();
            vc.s.j(k0VarQ);
            gte.a aVarB2 = aVar3.f.b();
            vc.s.j(aVarB2);
            al4.n nVarS = rVar.s();
            vc.s.j(nVarS);
            return new wr1.u(nVarB, bVarJ, aVar2, gVar, new tr1.f(aVarB, k0VarQ, aVarB2, nVarS), cVar.f256643a, (cli.n) cVar.e.get());
        }
        if (i == 1) {
            yof.d dVar = (yof.d) cVar.d.get();
            u80.o oVar = new u80.o();
            w80.b bVarJ2 = eVar.j();
            vc.s.j(bVarJ2);
            return new wr1.o(oVar, bVarJ2, dVar);
        }
        if (i != 2) {
            if (i != 3) {
                throw new AssertionError(i);
            }
            ldd.a factory = new ldd.a();
            xr1.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(factory, "factory");
            return new ldd.b();
        }
        ppf.a factory2 = aVar.f256634g.b();
        vc.s.j(factory2);
        ldd.b delegate = (ldd.b) cVar.f256645c.get();
        xr1.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory2, "factory");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return ppf.a.a(delegate);
    }

    private final Object e() {
        int i = this.f252157c;
        if (i == 0) {
            rr1.d dVar = (rr1.d) this.d;
            return new cs1.j(dVar.f256646a, (cli.n) dVar.f256647b.get());
        }
        if (i == 1) {
            return new cs1.i((p5k.w) ((rr1.e) this.f252156b).f.get(), 0);
        }
        throw new AssertionError(i);
    }

    private final Object f() {
        rr1.a aVar = (rr1.a) this.f252156b;
        rr1.e eVar = (rr1.e) this.d;
        rr1.a aVar2 = eVar.f256650b;
        int i = this.f252157c;
        if (i == 0) {
            return new com.revolut.feature.apm.bills.tapi.impl.flow.transfer.a(eVar.f256649a, new qpk.b());
        }
        if (i != 1) {
            if (i == 2) {
                return new p5k.y();
            }
            throw new AssertionError(i);
        }
        p5k.y yVar = (p5k.y) eVar.e.get();
        k5i.c cVarA = aVar.f256635h.a();
        p5k.y yVar2 = (p5k.y) eVar.e.get();
        p2k.a aVar3 = aVar2.i;
        ite.a aVar4 = aVar2.f;
        v2k.c cVarA2 = aVar3.a();
        gte.a aVarB = aVar4.b();
        vc.s.j(aVarB);
        gte.a aVarB2 = aVar4.b();
        vc.s.j(aVarB2);
        g1i.c cVar = new g1i.c(aVarB2, 2);
        gte.a aVarB3 = aVar4.b();
        vc.s.j(aVarB3);
        p5k.f fVar = new p5k.f(yVar2, cVarA2, aVarB, cVar, new p5k.l(aVarB3));
        j9l.a aVar5 = new j9l.a();
        gte.a aVarB4 = aVar2.f.b();
        vc.s.j(aVarB4);
        return new p5k.x(yVar, cVarA, fVar, new kgm.i(aVar5, aVarB4), new p5k.p());
    }

    private final Object g() {
        rr1.a aVar = (rr1.a) this.f252156b;
        rr1.f fVar = (rr1.f) this.d;
        rr1.a aVar2 = fVar.f256653b;
        int i = this.f252157c;
        if (i == 0) {
            return kxa.j.k((j60.a) fVar.e.get());
        }
        if (i == 1) {
            return ehe.n.s((com.revolut.kompot.navigable.a) fVar.f256654c.get(), (rp0.m) fVar.d.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            if (i == 4) {
                return new as1.o();
            }
            throw new AssertionError(i);
        }
        as1.h hVar = fVar.f256652a;
        zof.f fVarD = aVar.f256634g.d();
        vc.s.j(fVarD);
        wo1.b bVarB = ((up1.e) aVar.f256636j).b();
        vc.s.j(bVarB);
        wsg.n nVarB = aVar.f256632b.b();
        l2j.a aVar3 = new l2j.a();
        tr1.g gVar = (tr1.g) aVar.o.get();
        sf0.h hVarB = aVar2.k.b();
        vc.s.j(hVarB);
        v60.e eVarA = aVar2.f256637l.a();
        vc.s.j(eVarA);
        abk.c cVar = new abk.c(hVarB, eVarA, 1);
        so9.b bVar = aVar2.d;
        jm4.r rVar = aVar2.e;
        vo9.a aVarB = ((ut9.a) bVar).b();
        vc.s.j(aVarB);
        k0 k0VarQ = rVar.q();
        vc.s.j(k0VarQ);
        gte.a aVarB2 = aVar2.f.b();
        vc.s.j(aVarB2);
        al4.n nVarS = rVar.s();
        vc.s.j(nVarS);
        return new as1.a0(hVar, fVarD, bVarB, nVarB, aVar3, gVar, cVar, new tr1.f(aVarB, k0VarQ, aVarB2, nVarS), (cli.n) fVar.f256655g.get());
    }

    private final Object h() {
        rs5.d dVar = (rs5.d) this.d;
        rs5.c cVar = (rs5.c) this.f252156b;
        int i = this.f252157c;
        switch (i) {
            case 0:
                ys5.h factory = cVar.m();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a(null, lt5.a.CRYPTO, null, null);
            case 1:
                xi5.a api2 = cVar.d;
                ss5.a cryptoFeedWidgetsEventDispatcher = (ss5.a) cVar.H.get();
                ish.a0 widgetsUiInteractor = cVar.f256961a.c();
                vc.s.j(widgetsUiInteractor);
                xh5.a cryptoFeatureEnabledInteractor = cVar.B.a();
                vc.s.j(cryptoFeatureEnabledInteractor);
                vi5.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(api2, "api");
                Intrinsics.checkNotNullParameter(cryptoFeedWidgetsEventDispatcher, "cryptoFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
                ou5.b bVarA = api2.a();
                Intrinsics.checkNotNullParameter(cryptoFeedWidgetsEventDispatcher, "cryptoFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
                return new yi5.l(cryptoFeedWidgetsEventDispatcher, (iva.a) bVarA.f229821c, widgetsUiInteractor, (pu5.a) bVarA.d, cryptoFeatureEnabledInteractor);
            case 2:
                ss5.a cryptoFeedWidgetsEventDispatcher2 = (ss5.a) cVar.H.get();
                ish.a0 widgetsUiInteractor2 = cVar.f256961a.c();
                vc.s.j(widgetsUiInteractor2);
                ks5.g factory2 = (ks5.g) cVar.f256976n0.get();
                Intrinsics.checkNotNullParameter(cryptoFeedWidgetsEventDispatcher2, "cryptoFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor2, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(factory2, "factory");
                factory2.getClass();
                Intrinsics.checkNotNullParameter(cryptoFeedWidgetsEventDispatcher2, "cryptoFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor2, "widgetsUiInteractor");
                return new ws5.i(widgetsUiInteractor2, cryptoFeedWidgetsEventDispatcher2);
            case 3:
                s3d.m mVarC = cVar.f256982t.c();
                vc.s.j(mVarC);
                zs5.a aVar = new zs5.a();
                ash.d dVar2 = (ash.d) cVar.H.get();
                m3d.j jVarA = cVar.C.a();
                vc.s.j(jVarA);
                at5.b.Companion.getClass();
                return p0.t(mVarC, aVar, dVar2, jVarA, null);
            case 4:
                s3d.m mVarC2 = cVar.f256982t.c();
                vc.s.j(mVarC2);
                zs5.a aVar2 = new zs5.a();
                ash.d dVar3 = (ash.d) cVar.H.get();
                m3d.j jVarA2 = cVar.C.a();
                vc.s.j(jVarA2);
                at5.b.Companion.getClass();
                return p0.r(mVarC2, aVar2, dVar3, jVarA2, null);
            case 5:
                s3d.m mVarC3 = cVar.f256982t.c();
                vc.s.j(mVarC3);
                zs5.a aVar3 = new zs5.a();
                ash.d dVar4 = (ash.d) cVar.H.get();
                m3d.j jVarA3 = cVar.C.a();
                vc.s.j(jVarA3);
                at5.b.Companion.getClass();
                return p0.B(mVarC3, aVar3, dVar4, jVarA3, null);
            case 6:
                s3d.m mVarC4 = cVar.f256982t.c();
                vc.s.j(mVarC4);
                zs5.a aVar4 = new zs5.a();
                ash.d dVar5 = (ash.d) cVar.H.get();
                m3d.j jVarA4 = cVar.C.a();
                vc.s.j(jVarA4);
                at5.b.Companion.getClass();
                return p0.l(mVarC4, aVar4, dVar5, jVarA4, null);
            case 7:
                b9k.f cryptoReceiveWidgetContractFactory = cVar.f256963b.a();
                ss5.a cryptoFeedWidgetsEventDispatcher3 = (ss5.a) cVar.H.get();
                ish.a0 widgetsUiInteractor3 = cVar.f256961a.c();
                vc.s.j(widgetsUiInteractor3);
                ij5.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(cryptoReceiveWidgetContractFactory, "cryptoReceiveWidgetContractFactory");
                Intrinsics.checkNotNullParameter(cryptoFeedWidgetsEventDispatcher3, "cryptoFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor3, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(cryptoFeedWidgetsEventDispatcher3, "cryptoFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor3, "widgetsUiInteractor");
                return new nj5.i(cryptoFeedWidgetsEventDispatcher3, (c70.a) cryptoReceiveWidgetContractFactory.e, widgetsUiInteractor3, (r70.c) cryptoReceiveWidgetContractFactory.f);
            case 8:
                r2d.g factory3 = (r2d.g) cVar.f256981s.o.get();
                vc.s.j(factory3);
                r2d.r presenterDelegate = dVar.a();
                ls5.a widgetConfigProvider = new ls5.a();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(presenterDelegate, "presenterDelegate");
                Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
                Intrinsics.checkNotNullParameter(presenterDelegate, "presenterDelegate");
                Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
                return new r2d.f(presenterDelegate, factory3.f251106a, widgetConfigProvider);
            case 9:
                r2d.g factory4 = (r2d.g) cVar.f256981s.o.get();
                vc.s.j(factory4);
                r2d.r presenterDelegate2 = dVar.a();
                ls5.a widgetConfigProvider2 = new ls5.a();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                Intrinsics.checkNotNullParameter(presenterDelegate2, "presenterDelegate");
                Intrinsics.checkNotNullParameter(widgetConfigProvider2, "widgetConfigProvider");
                Intrinsics.checkNotNullParameter(presenterDelegate2, "presenterDelegate");
                Intrinsics.checkNotNullParameter(widgetConfigProvider2, "widgetConfigProvider");
                return new r2d.f(presenterDelegate2, factory4.f251106a, widgetConfigProvider2);
            case 10:
                ss5.a cryptoFeedWidgetsEventDispatcher4 = (ss5.a) cVar.H.get();
                ish.a0 widgetsUiInteractor4 = cVar.f256961a.c();
                vc.s.j(widgetsUiInteractor4);
                ks5.g factory5 = (ks5.g) cVar.f256976n0.get();
                Intrinsics.checkNotNullParameter(cryptoFeedWidgetsEventDispatcher4, "cryptoFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor4, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(factory5, "factory");
                factory5.getClass();
                Intrinsics.checkNotNullParameter(cryptoFeedWidgetsEventDispatcher4, "cryptoFeedWidgetsEventDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor4, "widgetsUiInteractor");
                return new ns5.h(widgetsUiInteractor4, cryptoFeedWidgetsEventDispatcher4);
            case 11:
                prl.e factory6 = ((jaj.b) cVar.f256965c).a();
                k39.b navigationCommandsDispatcher = dVar.f256986a;
                iaj.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory6, "factory");
                Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
                Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
                return new saj.i((ish.a0) factory6.f239326c, navigationCommandsDispatcher, (gaj.b) factory6.d);
            case 12:
                k39.b navigationCommandsDispatcher2 = dVar.f256986a;
                su9.c uiFactory = cVar.v.b();
                sz5.f delegateFactory = cVar.v.c();
                nd.p widgetDataProvider = cVar.o();
                Intrinsics.checkNotNullParameter(navigationCommandsDispatcher2, "navigationCommandsDispatcher");
                Intrinsics.checkNotNullParameter(uiFactory, "uiFactory");
                Intrinsics.checkNotNullParameter(delegateFactory, "delegateFactory");
                Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
                return uiFactory.g(delegateFactory.O(navigationCommandsDispatcher2), widgetDataProvider);
            case 13:
                k39.b navigationCommandsDispatcher3 = dVar.f256986a;
                su9.c factory7 = cVar.v.b();
                sz5.f delegateFactory2 = cVar.v.c();
                nd.p widgetDataProvider2 = cVar.o();
                Intrinsics.checkNotNullParameter(navigationCommandsDispatcher3, "navigationCommandsDispatcher");
                Intrinsics.checkNotNullParameter(factory7, "factory");
                Intrinsics.checkNotNullParameter(delegateFactory2, "delegateFactory");
                Intrinsics.checkNotNullParameter(widgetDataProvider2, "widgetDataProvider");
                return factory7.g(delegateFactory2.O(navigationCommandsDispatcher3), widgetDataProvider2);
            case 14:
                r9h.a aVar5 = cVar.f256984x;
                s9h.c factory8 = new s9h.c();
                b9k.f assetWidgetFactory = aVar5.a();
                k39.b navigationCommandsDispatcher4 = dVar.f256986a;
                ish.a0 widgetsUiInteractor5 = cVar.f256961a.c();
                vc.s.j(widgetsUiInteractor5);
                Intrinsics.checkNotNullParameter(factory8, "factory");
                Intrinsics.checkNotNullParameter(assetWidgetFactory, "assetWidgetFactory");
                Intrinsics.checkNotNullParameter(navigationCommandsDispatcher4, "navigationCommandsDispatcher");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor5, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(navigationCommandsDispatcher4, "navigationCommandsDispatcher");
                q9h.g router = new q9h.g(navigationCommandsDispatcher4, (sgh.a) assetWidgetFactory.e, (gte.a) assetWidgetFactory.f13819g);
                Intrinsics.checkNotNullParameter(router, "router");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor5, "widgetsUiInteractor");
                return new s9h.b(router, widgetsUiInteractor5);
            case 15:
                g3d.b factory9 = (g3d.b) cVar.f256982t.f180695q.get();
                vc.s.j(factory9);
                ash.d widgetsCommonEventDispatcher = (ash.d) cVar.H.get();
                m3d.j navigationDestinationProvider = cVar.C.a();
                vc.s.j(navigationDestinationProvider);
                ish.a0 widgetsUiInteractor6 = cVar.f256961a.c();
                vc.s.j(widgetsUiInteractor6);
                Intrinsics.checkNotNullParameter(factory9, "factory");
                Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
                Intrinsics.checkNotNullParameter(navigationDestinationProvider, "navigationDestinationProvider");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor6, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
                Intrinsics.checkNotNullParameter(navigationDestinationProvider, "navigationDestinationProvider");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor6, "widgetsUiInteractor");
                return new f3d.k(widgetsCommonEventDispatcher, navigationDestinationProvider, widgetsUiInteractor6);
            case 16:
                g3d.b factory10 = (g3d.b) cVar.f256982t.f180695q.get();
                vc.s.j(factory10);
                ash.d widgetsCommonEventDispatcher2 = (ash.d) cVar.H.get();
                m3d.j navigationDestinationProvider2 = cVar.C.a();
                vc.s.j(navigationDestinationProvider2);
                ish.a0 widgetsUiInteractor7 = cVar.f256961a.c();
                vc.s.j(widgetsUiInteractor7);
                Intrinsics.checkNotNullParameter(factory10, "factory");
                Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher2, "widgetsCommonEventDispatcher");
                Intrinsics.checkNotNullParameter(navigationDestinationProvider2, "navigationDestinationProvider");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor7, "widgetsUiInteractor");
                Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher2, "widgetsCommonEventDispatcher");
                Intrinsics.checkNotNullParameter(navigationDestinationProvider2, "navigationDestinationProvider");
                Intrinsics.checkNotNullParameter(widgetsUiInteractor7, "widgetsUiInteractor");
                return new f3d.k(widgetsCommonEventDispatcher2, navigationDestinationProvider2, widgetsUiInteractor7);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        rtj.g gVar = (rtj.g) this.f252156b;
        rtj.a aVar = (rtj.a) this.d;
        int i = this.f252157c;
        if (i == 0) {
            com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) aVar.f257266c.get();
            i60.b.Companion.getClass();
            return b.a.a(aVar2);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        ChallengeDetailsScreenContract$InputData challengeDetailsScreenContract$InputData = aVar.f257264a;
        stj.h hVar = (stj.h) gVar.f257288n.get();
        wli.x xVarD = ((s41.a) gVar.f257283g).d();
        h60.d dVar = (h60.d) aVar.d.get();
        gte.a aVarB = gVar.f257280a.b();
        vc.s.j(aVarB);
        rtj.g gVar2 = aVar.f257265b;
        l80.e eVarH = gVar2.f257284h.h();
        vc.s.j(eVarH);
        Context context = gVar2.f257285j;
        ztj.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.a(challengeDetailsScreenContract$InputData, hVar, xVarD, dVar, aVarB, new ytj.t(eVarH, new ytj.w(new f01.c(context))));
    }

    private final Object j() {
        rtj.d dVar = (rtj.d) this.d;
        int i = this.f252157c;
        if (i == 0) {
            com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) dVar.f257274c.get();
            i60.b.Companion.getClass();
            return b.a.a(aVar);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        Context context = dVar.f257273b.f257285j;
        duj.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new cuj.y(new cuj.b0(new f01.c(context)), dVar.f257272a, new cuj.a(), (h60.d) dVar.d.get(), (stj.h) ((rtj.g) this.f252156b).f257288n.get());
    }

    private final Object k() {
        rtj.e eVar = (rtj.e) this.d;
        int i = this.f252157c;
        if (i != 0) {
            if (i == 1) {
                return new euj.m(new euj.n(), eVar.f257275a, (h60.d) eVar.f257277c.get(), (stj.h) ((rtj.g) this.f252156b).f257288n.get());
            }
            throw new AssertionError(i);
        }
        com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) eVar.f257276b.get();
        i60.b.Companion.getClass();
        return b.a.a(aVar);
    }

    private final Object l() {
        ryc.b bVar = (ryc.b) this.f252156b;
        ryc.c cVar = (ryc.c) this.d;
        int i = this.f252157c;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(cVar.f258307a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(cVar.f258307a);
                t70.g gVarO = bVar.f258293c.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) cVar.f258310g.get(), gsi.c.a(cVar.f258307a));
            case 3:
                return new rpi.b(bq.i.b(cVar.f258307a));
            case 4:
                return new rpi.h(bq.i.b(cVar.f258307a));
            case 5:
                return new iri.g((iri.j) bVar.f258296j.get(), (iri.m) bVar.k.get(), bq.i.f(cVar.f258307a), bq.i.l(cVar.f258307a));
            case 6:
                return new iri.l((iri.m) bVar.k.get(), bq.i.f(cVar.f258307a), (iri.d) cVar.k.get());
            case 7:
                return new iri.d(bq.i.f(cVar.f258307a));
            case 8:
                return new opi.b(bq.i.f(cVar.f258307a));
            case 9:
                cVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) bVar.f258297l.get(), bVar.c());
            case 10:
                um.c cVar2 = (um.c) bVar.f258298m.get();
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
                ryc.b bVar2 = cVar.f258309c;
                hn.h hVar = (hn.h) bVar2.f258299n.get();
                t70.g gVarO2 = bVar2.f258293c.o();
                vc.s.j(gVarO2);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO2));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(bVar2.d());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(cVar.o)));
                return new in.e(cVar2, builderBuilderWithExpectedSize.build(), bVar.c());
            case 11:
                return bq.i.t(cVar.f258307a);
            case 12:
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(cVar.f258317q.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(cVar.f258311h)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) bVar.f258300p.get(), bVar.c());
            case 13:
                return new zm.a();
            case 14:
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                ryc.b bVar3 = cVar.f258309c;
                builderBuilderWithExpectedSize3.add(bVar3.d());
                return new hn.d(j6.a.g(bVar3.f258304t, builderBuilderWithExpectedSize3), (hn.h) bVar.f258299n.get(), (npi.f) cVar.f.get());
            case 15:
                return new en.c(ImmutableSet.of((ln.d) cVar.f258309c.o.get()), bq.i.l(cVar.f258307a));
            case 16:
                return new gn.c((lpi.e) cVar.u.get(), (sm.e) bVar.u.get(), ImmutableSet.copyOf((Collection) gn.e.a()), bVar.c());
            case 17:
                return new lpi.b(bq.i.i(cVar.f258307a), bq.i.j(cVar.f258307a));
            case 18:
                cVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) bVar.v.get(), bVar.c());
            case 19:
                cVar.getClass();
                return new xpi.c(xpi.f.d, bq.i.b(cVar.f258307a));
            case 20:
                ypi.h hVar2 = cVar.f258308b;
                xoi.d dVar = cVar.f258307a;
                return new ypi.e(hVar2, bq.i.b(dVar), bq.i.o(dVar), bq.i.g(dVar));
            case 21:
                Activity activityB = bq.i.b(cVar.f258307a);
                y80.b bVar4 = new y80.b();
                g60.a aVar = (g60.a) cVar.z.get();
                xoi.d dVar2 = cVar.f258307a;
                Activity activityB2 = bq.i.b(dVar2);
                t80.g gVar = (t80.g) cVar.A.get();
                BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(dVar2);
                d4m.a aVarA = e4m.b.a(cVar.B);
                nli.a aVarE = cVar.e();
                t80.g gVar2 = (t80.g) cVar.A.get();
                l70.e eVar = cVar.f258309c.f258293c;
                zk0.b bVarL = eVar.l();
                vc.s.j(bVarL);
                oli.c cVar3 = new oli.c(gVar2, bVarL, cVar.e(), (g60.a) cVar.z.get(), cVar.f());
                ComponentActivity componentActivityA = gmf.b.a(dVar2);
                ActivityResultRegistry activityResultRegistryA = pli.b.a(gmf.b.a(dVar2));
                ami.n nVar = new ami.n(e4m.b.a(cVar.D), 1);
                d4m.a aVarA2 = e4m.b.a(cVar.B);
                t80.g gVar3 = (t80.g) cVar.A.get();
                nli.a aVarE2 = cVar.e();
                i90.b bVar5 = new i90.b();
                z70.a aVarF = eVar.f();
                vc.s.j(aVarF);
                c70.b bVar6 = new c70.b(aVarF, 2);
                z70.a aVarF2 = eVar.f();
                vc.s.j(aVarF2);
                return new upi.b(activityB, bVar4, new t80.v(aVar, activityB2, gVar, baseDelegatesActivityF2, aVarA, aVarE, cVar3, new oli.g(componentActivityA, activityResultRegistryA, nVar, aVarA2, gVar3, aVarE2, bVar5, new u96.b(bVar6, new smd.s(aVarF2)), cVar.f()), cVar.f()));
            case 22:
                return new g60.a(bq.i.b(cVar.f258307a));
            case 23:
                l70.e eVar2 = bVar.f258293c;
                l70.e eVar3 = bVar.f258293c;
                f80.a aVarX = eVar2.x();
                vc.s.j(aVarX);
                l80.e eVarH = eVar3.h();
                vc.s.j(eVarH);
                zk0.b bVarL2 = eVar3.l();
                vc.s.j(bVarL2);
                return new t80.b(aVarX, eVarH, bVarL2);
            case 24:
                return pli.c.a(new ks0.n(bq.i.f(cVar.f258307a)));
            case 25:
                ryc.f.Companion.getClass();
                return new t80.c(new e.a(null), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
            case 26:
                return t96.a.a();
            case 27:
                return new k3l.d(bq.i.b(cVar.f258307a));
            case 28:
                cVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                return new g3l.c(j6.a.g(cVar.f258309c.f258304t, builderBuilderWithExpectedSize4), (g3l.g) bVar.f258303s.get(), (k3l.b) cVar.F.get(), bVar.c());
            case 29:
                pyc.f fVar = (pyc.f) bVar.f258302r.get();
                pyc.c cVar4 = (pyc.c) bVar.f258305w.get();
                e4m.e eVar4 = cVar.f258322x;
                xoi.d dVar3 = cVar.f258307a;
                xpi.g gVar4 = (xpi.g) eVar4.get();
                ypi.i iVar = (ypi.i) cVar.f258323y.get();
                pyc.h hVar3 = (pyc.h) bVar.f258304t.get();
                sri.m mVarL = bq.i.l(dVar3);
                bqi.d dVar4 = (bqi.d) cVar.H.get();
                tri.c cVarE = bq.i.e(dVar3);
                opi.d dVar5 = (opi.d) cVar.f258314m.get();
                kpi.c cVar5 = (kpi.c) cVar.e.get();
                t70.g gVarO3 = bVar.f258293c.o();
                vc.s.j(gVarO3);
                c0 c0Var = new c0(fVar, cVar4, gVar4, iVar, hVar3, mVarL, dVar4, cVarE, dVar5, cVar5, gVarO3);
                kli.a.p(c0Var, bq.i.d(dVar3));
                return c0Var;
            case 30:
                return new bqi.c(bq.i.i(cVar.f258307a), bq.i.j(cVar.f258307a));
            case 31:
                Context context = bq.i.i(cVar.f258307a);
                ryc.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new p80.a(context);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object m() {
        ryc.b bVar = (ryc.b) this.f252156b;
        jpc.e eVar = (jpc.e) this.d;
        int i = this.f252157c;
        if (i != 0) {
            if (i == 1) {
                return new zyc.u();
            }
            throw new AssertionError(i);
        }
        zyc.a0 a0Var = new zyc.a0((pyc.f) bVar.f258302r.get(), (zyc.b) ((e4m.e) eVar.f177257c).get(), (pyc.h) bVar.f258304t.get());
        kli.a.p(a0Var, bq.i.d(((ryc.c) eVar.f177256b).f258307a));
        return a0Var;
    }

    @Override // phm.a
    public final Object get() {
        Object cVar;
        Object zVar;
        mfl.k kVar;
        mfl.h hVar;
        Object bVar;
        switch (this.f252155a) {
            case 0:
                l lVar = (l) this.f252156b;
                p pVar = (p) this.d;
                int i = this.f252157c;
                if (i == 0) {
                    return new s8d.l((jki.p) pVar.f252160c.get(), lVar.f252134j.a(), lVar.f252129a.a(), pVar.f252158a);
                }
                if (i == 1) {
                    return new s8d.j();
                }
                throw new AssertionError(i);
            case 1:
                l lVar2 = (l) this.f252156b;
                kde.a aVar = lVar2.f252129a;
                int i2 = this.f252157c;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new q8d.j();
                    }
                    throw new AssertionError(i2);
                }
                jki.p pVar2 = (jki.p) ((r) this.d).f252168b.get();
                gg0.d dVar = aVar.f182872b;
                return new q8d.p(pVar2, new m0((u0) dVar.H.get(), dVar.f143575a.a()), aVar.a(), new lde.j(new fde.a(aVar.f182878m.b()), aVar.f182874g.e()), lVar2.f252134j.a());
            case 2:
                rah.b bVar2 = (rah.b) this.f252156b;
                rah.a aVar2 = (rah.a) this.d;
                int i3 = this.f252157c;
                switch (i3) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI = bq.i.i(aVar2.f252854a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar2.f252854a);
                        t70.g gVarO = bVar2.f252865a.o();
                        vc.s.j(gVarO);
                        cVar = new npi.c(contextI, baseDelegatesActivityF, gVarO);
                        break;
                    case 2:
                        return new tpi.i((rpi.c) aVar2.f252858h.get(), gsi.c.a(aVar2.f252854a));
                    case 3:
                        return new rpi.b(bq.i.b(aVar2.f252854a));
                    case 4:
                        return new rpi.h(bq.i.b(aVar2.f252854a));
                    case 5:
                        cVar = new iri.g((iri.j) bVar2.f252868g.get(), (iri.m) bVar2.f252869h.get(), bq.i.f(aVar2.f252854a), bq.i.l(aVar2.f252854a));
                        break;
                    case 6:
                        cVar = new iri.l((iri.m) bVar2.f252869h.get(), bq.i.f(aVar2.f252854a), (iri.d) aVar2.f252860l.get());
                        break;
                    case 7:
                        return new iri.d(bq.i.f(aVar2.f252854a));
                    case 8:
                        return new opi.b(bq.i.f(aVar2.f252854a));
                    case 9:
                        return new en.c(ImmutableSet.of((ln.d) aVar2.e.i.get()), bq.i.l(aVar2.f252854a));
                    case 10:
                        aVar2.getClass();
                        return new xpi.c(xpi.f.d, bq.i.b(aVar2.f252854a));
                    case 11:
                        return new dqi.g(bq.i.b(aVar2.f252854a), aVar2.f252855b);
                    default:
                        throw new AssertionError(i3);
                }
                return cVar;
            case 3:
                rde.h hVar2 = (rde.h) this.f252156b;
                rde.c cVar2 = (rde.c) this.d;
                InboundSwiftTransferStatusScreenContract$InputData inboundSwiftTransferStatusScreenContract$InputData = cVar2.f253415a;
                int i5 = this.f252157c;
                switch (i5) {
                    case 0:
                        zVar = new dee.z((cli.n) cVar2.f253419h.get(), inboundSwiftTransferStatusScreenContract$InputData, (sde.e) hVar2.f253443q.get(), hVar2.f253434b.a());
                        break;
                    case 1:
                        zVar = new dee.c0(inboundSwiftTransferStatusScreenContract$InputData, e4m.b.a(cVar2.f253416b), e4m.b.a(cVar2.f253417c), e4m.b.a(cVar2.d), e4m.b.a(cVar2.e), e4m.b.a(cVar2.f), e4m.b.a(cVar2.f253418g));
                        break;
                    case 2:
                        d0 itemsFactory = new d0();
                        Intrinsics.checkNotNullParameter(itemsFactory, "itemsFactory");
                        return new dee.g();
                    case 3:
                        d0 d0Var = new d0();
                        thf.g gVarE = hVar2.f253437h.e();
                        vc.s.j(gVarE);
                        return new dee.b(d0Var, gVarE);
                    case 4:
                        d0 itemsFactory2 = new d0();
                        Intrinsics.checkNotNullParameter(itemsFactory2, "itemsFactory");
                        return new f0();
                    case 5:
                        d0 itemsFactory3 = new d0();
                        Intrinsics.checkNotNullParameter(itemsFactory3, "itemsFactory");
                        return new dee.d();
                    case 6:
                        d0 itemsFactory4 = new d0();
                        Intrinsics.checkNotNullParameter(itemsFactory4, "itemsFactory");
                        return new i0();
                    case 7:
                        return new dee.k0(new cee.b());
                    default:
                        throw new AssertionError(i5);
                }
                return zVar;
            case 4:
                rde.h hVar3 = (rde.h) this.f252156b;
                rde.d dVar2 = (rde.d) this.d;
                InboundTransactionListScreenContract$InputData inboundTransactionListScreenContract$InputData = dVar2.f253420a;
                int i6 = this.f252157c;
                if (i6 == 0) {
                    return new fee.l((cli.n) dVar2.f253421b.get(), inboundTransactionListScreenContract$InputData, (sde.b) hVar3.f253442p.get());
                }
                if (i6 != 1) {
                    throw new AssertionError(i6);
                }
                thf.g gVarE2 = hVar3.f253437h.e();
                vc.s.j(gVarE2);
                return new com.revolut.feature.support.impl.transfer_tracker.ui.inbound_transaction_list.b(gVarE2, inboundTransactionListScreenContract$InputData);
            case 5:
                rde.g gVar = (rde.g) this.d;
                int i21 = this.f252157c;
                if (i21 == 0) {
                    return kxa.j.k((j60.a) gVar.d.get());
                }
                if (i21 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) gVar.f253430b.get(), (rp0.m) gVar.f253431c.get());
                }
                if (i21 == 2) {
                    return new rp0.m();
                }
                if (i21 == 3) {
                    return new aee.q((cli.n) gVar.f.get(), gVar.f253429a, ((rde.h) this.f252156b).f253434b.b(), (j60.a) gVar.d.get(), new cee.a());
                }
                if (i21 != 4) {
                    throw new AssertionError(i21);
                }
                cee.b sectionsMapper = new cee.b();
                Intrinsics.checkNotNullParameter(sectionsMapper, "sectionsMapper");
                return new aee.t();
            case 6:
                rde.h hVar4 = (rde.h) this.f252156b;
                rde.i iVar = (rde.i) this.d;
                int i22 = this.f252157c;
                switch (i22) {
                    case 0:
                        return kxa.j.k((j60.a) iVar.f253446c.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) iVar.f253444a.get(), (rp0.m) iVar.f253445b.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        n60.a aVar3 = (n60.a) iVar.e.get();
                        o5k.i.l(aVar3);
                        return aVar3;
                    case 4:
                        return o5k.i.q((com.revolut.kompot.navigable.a) iVar.f253444a.get());
                    case 5:
                        cli.n nVar = (cli.n) iVar.f253448h.get();
                        sde.e eVar = (sde.e) hVar4.f253443q.get();
                        gte.a aVarB = hVar4.f.b();
                        vc.s.j(aVarB);
                        return new com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b(nVar, eVar, aVarB, hVar4.f253434b.b(), (w80.b) iVar.i.get(), (hee.a) iVar.f253449j.get(), (j60.a) iVar.f253446c.get(), new jee.a(), (n60.a) iVar.e.get());
                    case 6:
                        return new hee.v((InputFilter) iVar.f253447g.get());
                    case 7:
                        qd0.b languageProvider = hVar4.f253435c.n();
                        vc.s.j(languageProvider);
                        iee.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                        return new rx0.i(2, ((s80.b) languageProvider).b());
                    case 8:
                        qd0.b languageProvider2 = hVar4.f253435c.n();
                        vc.s.j(languageProvider2);
                        iee.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(languageProvider2, "languageProvider");
                        return v80.b.b(languageProvider2, false, false, 62);
                    case 9:
                        g2j.f fVar = hVar4.f253436g;
                        return new com.revolut.feature.support.impl.transfer_tracker.ui.input_form.a(new l2j.a(), vd0.d.a());
                    default:
                        throw new AssertionError(i22);
                }
            case 7:
                he9.g gVar2 = (he9.g) this.d;
                re9.a aVar4 = (re9.a) this.f252156b;
                he9.e eVar2 = aVar4.e;
                int i32 = this.f252157c;
                if (i32 != 0) {
                    if (i32 == 1) {
                        return new de9.y(new de9.z());
                    }
                    if (i32 == 2) {
                        return new he9.c(this, 5);
                    }
                    throw new AssertionError(i32);
                }
                PasscodeScreenContract$InputData passcodeScreenContract$InputData = gVar2.f151618b;
                oe9.a aVarB2 = eVar2.b();
                vc.s.j(aVarB2);
                fe9.h hVar5 = new fe9.h(((re9.a) gVar2.f).f253549b.a());
                ie9.d dVarA = eVar2.a();
                vc.s.j(dVarA);
                wl0.c cVarA = aVar4.f253549b.a();
                io.c cVarD = aVar4.f253551g.d();
                vc.s.j(cVarD);
                we9.b.Companion.getClass();
                return new de9.x(passcodeScreenContract$InputData, aVarB2, hVar5, dVarA, cVarA, cVarD, new we9.a(), (jki.p) gVar2.d.get());
            case 8:
                rfl.b bVar3 = (rfl.b) this.f252156b;
                zdl.c cVar3 = bVar3.f253910a;
                rfl.a aVar5 = (rfl.a) this.d;
                mfl.i inputData = aVar5.f253904a;
                int i33 = this.f252157c;
                switch (i33) {
                    case 0:
                        mfl.g gVar3 = (mfl.g) aVar5.f253906c.get();
                        kxk.o oVar = new kxk.o((mfl.k) aVar5.f253907g.get(), new pfl.c());
                        mfl.h hVar6 = (mfl.h) aVar5.f253909j.get();
                        rfl.b bVar4 = aVar5.f253905b;
                        ij0.a aVar6 = ((nj0.d) bVar4.d).f216295c;
                        ybl.o oVarL = bVar4.f253910a.l();
                        vc.s.j(oVarL);
                        return new mfl.o(gVar3, oVar, hVar6, new jx0.a(aVar6, oVarL), inputData);
                    case 1:
                        return ofl.d.a();
                    case 2:
                        d4m.a roboTitleDescriptionProvider = e4m.b.a(aVar5.d);
                        d4m.a stocksTitleDescriptionProvider = e4m.b.a(aVar5.e);
                        d4m.a privateMarketsTitleDescriptionProvider = e4m.b.a(aVar5.f);
                        ofl.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData, "inputData");
                        Intrinsics.checkNotNullParameter(roboTitleDescriptionProvider, "roboTitleDescriptionProvider");
                        Intrinsics.checkNotNullParameter(stocksTitleDescriptionProvider, "stocksTitleDescriptionProvider");
                        Intrinsics.checkNotNullParameter(privateMarketsTitleDescriptionProvider, "privateMarketsTitleDescriptionProvider");
                        int i43 = ofl.a.f224905a[inputData.f205028b.ordinal()];
                        if (i43 == 1) {
                            Object obj2 = roboTitleDescriptionProvider.get();
                            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                            kVar = (mfl.k) obj2;
                        } else if (i43 == 2 || i43 == 3) {
                            Object obj3 = stocksTitleDescriptionProvider.get();
                            Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                            kVar = (mfl.k) obj3;
                        } else {
                            if (i43 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Object obj4 = privateMarketsTitleDescriptionProvider.get();
                            Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                            kVar = (mfl.k) obj4;
                        }
                        mfl.k kVar2 = kVar;
                        vc.s.k(kVar2);
                        return kVar2;
                    case 3:
                        return new nfl.f();
                    case 4:
                        return new nfl.g();
                    case 5:
                        return new nfl.c();
                    case 6:
                        d4m.a roboContentProvider = e4m.b.a(aVar5.f253908h);
                        d4m.a contentProvider = e4m.b.a(aVar5.i);
                        ofl.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData, "inputData");
                        Intrinsics.checkNotNullParameter(roboContentProvider, "roboContentProvider");
                        Intrinsics.checkNotNullParameter(contentProvider, "contentProvider");
                        int i59 = ofl.a.f224905a[inputData.f205028b.ordinal()];
                        if (i59 == 1) {
                            Object obj5 = roboContentProvider.get();
                            Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                            hVar = (mfl.h) obj5;
                        } else {
                            if (i59 != 2 && i59 != 3 && i59 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Object obj6 = contentProvider.get();
                            Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
                            hVar = (mfl.h) obj6;
                        }
                        mfl.h hVar7 = hVar;
                        vc.s.k(hVar7);
                        return hVar7;
                    case 7:
                        ybl.o oVarL2 = cVar3.l();
                        vc.s.j(oVarL2);
                        return new nfl.e(oVarL2, inputData);
                    case 8:
                        ybl.o oVarL3 = cVar3.l();
                        vc.s.j(oVarL3);
                        ybl.l lVarA = bVar3.f253911b.a();
                        vc.s.j(lVarA);
                        ybl.k kVarD = bVar3.f253912c.d();
                        vc.s.j(kVarD);
                        return new nfl.b(oVarL3, lVarA, inputData, kVarD);
                    default:
                        throw new AssertionError(i33);
                }
            case 9:
                rkd.g gVar4 = (rkd.g) this.f252156b;
                wqb.a aVar7 = gVar4.f254800a;
                rkd.h hVar8 = (rkd.h) this.d;
                SlotChecklistControllerContract$InputData slotChecklistControllerContract$InputData = hVar8.f254817a;
                rkd.g gVar5 = hVar8.f254819c;
                int i66 = this.f252157c;
                if (i66 == 0) {
                    com.revolut.kompot.navigable.a aVar8 = (com.revolut.kompot.navigable.a) hVar8.d.get();
                    i60.b.Companion.getClass();
                    return b.a.a(aVar8);
                }
                if (i66 == 1) {
                    return new lld.b((h60.d) hVar8.e.get(), new ks0.n(slotChecklistControllerContract$InputData));
                }
                if (i66 != 2) {
                    if (i66 != 3) {
                        throw new AssertionError(i66);
                    }
                    nld.e eVar3 = new nld.e();
                    pld.h hVar9 = new pld.h(fe0.d.a());
                    toa.a aVarA = gVar5.f254800a.e.a();
                    vc.s.j(aVarA);
                    nld.d dVar3 = new nld.d(hVar9, new sqb.d(aVarA));
                    old.h progressVariantProvider = new old.h();
                    Intrinsics.checkNotNullParameter(progressVariantProvider, "progressVariantProvider");
                    return new kxk.o(eVar3, dVar3, new nld.b(new kpj.f(new old.e(), new old.b((f01.a) gVar5.A.get(), new old.d((f01.a) gVar5.A.get()))), new nld.i(new qld.b(), (f01.a) gVar5.A.get()), new nld.j(), new nld.a()));
                }
                cli.n nVar2 = (cli.n) hVar8.f254820g.get();
                lld.u uVar = new lld.u(slotChecklistControllerContract$InputData, gVar5.c(), new kpj.f(new yqb.b()));
                wli.x xVarD = ((s41.a) gVar4.f254804h).d();
                skd.j jVar = (skd.j) gVar4.f254815x.get();
                lld.b bVar5 = (lld.b) hVar8.f.get();
                kkd.f fVar2 = hVar8.f254818b;
                wqb.c.Companion.getClass();
                RetailSlotManagerChecklistService retailSlotManagerChecklistService = (RetailSlotManagerChecklistService) aVar7.f.get();
                tqb.b.Companion.getClass();
                pak.h hVar10 = new pak.h(new rul.e(retailSlotManagerChecklistService, rd0.e.a(skm.p0.f264002b)));
                com.revolut.feature.slot_manager.impl.ui.screen.checklist.b bVar6 = (com.revolut.feature.slot_manager.impl.ui.screen.checklist.b) gVar4.B.get();
                gte.a aVarB3 = gVar4.f254805j.b();
                vc.s.j(aVarB3);
                toa.a aVarA2 = aVar7.e.a();
                vc.s.j(aVarA2);
                return new com.revolut.feature.slot_manager.impl.ui.screen.checklist.a(nVar2, uVar, xVarD, jVar, bVar5, fVar2, hVar10, bVar6, aVarB3, new sqb.d(aVarA2), hVar8.f254817a);
            case 10:
                rkd.i iVar2 = (rkd.i) this.d;
                rkd.g gVar6 = (rkd.g) this.f252156b;
                int i74 = this.f252157c;
                if (i74 != 0) {
                    if (i74 == 1) {
                        return new rld.p(new tld.d(new tld.b((c90.c) iVar2.f254823b.N.get(), new uld.b())));
                    }
                    throw new AssertionError(i74);
                }
                cli.n nVar3 = (cli.n) iVar2.f254824c.get();
                SlotManagerPromptControllerContract$InputData slotManagerPromptControllerContract$InputData = iVar2.f254822a;
                wli.x xVarD2 = ((s41.a) gVar6.f254804h).d();
                skd.i iVarC = gVar6.c();
                om4.d0 d0VarB = gVar6.f254800a.b();
                f80.a aVarX = gVar6.f.x();
                vc.s.j(aVarX);
                rld.a aVar9 = (rld.a) gVar6.M.get();
                rld.b bVar7 = new rld.b();
                i90.b uuidUtils = new i90.b();
                rkd.t.Companion.getClass();
                Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
                Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
                return new rld.m(nVar3, slotManagerPromptControllerContract$InputData, xVarD2, iVarC, d0VarB, aVarX, aVar9, bVar7, new rea.j(uuidUtils, 24));
            case 11:
                rlb.e eVar4 = (rlb.e) this.f252156b;
                rlb.b bVar8 = (rlb.b) this.d;
                int i92 = this.f252157c;
                switch (i92) {
                    case 0:
                        return kxa.j.j((j60.a) bVar8.e.get());
                    case 1:
                        return v1.c.r((com.revolut.kompot.navigable.a) bVar8.f254948c.get(), (rp0.m) bVar8.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        Object extension = (tmb.i) bVar8.f254950h.get();
                        umb.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        yji.n nVar4 = (yji.n) extension;
                        vc.s.k(nVar4);
                        return nVar4;
                    case 4:
                        j60.a aVar10 = (j60.a) bVar8.f254949g.get();
                        pmb.k kVar3 = new pmb.k();
                        mre.c cVarB = eVar4.k.b();
                        vc.s.j(cVarB);
                        return new tmb.l(aVar10, kVar3, cVarB, ((s41.a) eVar4.i).d());
                    case 5:
                        j60.a bottomExpandableDialogEmbeddedControllerExtension = (j60.a) bVar8.e.get();
                        emb.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(bottomExpandableDialogEmbeddedControllerExtension, "bottomExpandableDialogEmbeddedControllerExtension");
                        vc.s.k(bottomExpandableDialogEmbeddedControllerExtension);
                        return bottomExpandableDialogEmbeddedControllerExtension;
                    case 6:
                        dmb.p pVar3 = new dmb.p(new dcd.b(), new tmb.b(), new tmb.a(), ((k3) bVar8.f254947b.o).b());
                        PickYourRateScreenContract$InputData pickYourRateScreenContract$InputData = bVar8.f254946a;
                        ijb.a aVarG = ((blb.e) eVar4.f254970a).g();
                        vc.s.j(aVarG);
                        ffk.t tVarF = eVar4.f254971b.f();
                        vc.s.j(tVarF);
                        wsg.n nVarB = eVar4.f254976l.b();
                        tmb.i iVar3 = (tmb.i) bVar8.f254950h.get();
                        f80.a aVarX2 = eVar4.f254978n.x();
                        vc.s.j(aVarX2);
                        return new dmb.o(pVar3, pickYourRateScreenContract$InputData, aVarG, tVarF, nVarB, iVar3, aVarX2);
                    default:
                        throw new AssertionError(i92);
                }
            case 12:
                rlb.e eVar5 = (rlb.e) this.f252156b;
                rlb.c cVar4 = (rlb.c) this.d;
                int i96 = this.f252157c;
                switch (i96) {
                    case 0:
                        return kxa.j.j((j60.a) cVar4.e.get());
                    case 1:
                        return v1.c.r((com.revolut.kompot.navigable.a) cVar4.f254954c.get(), (rp0.m) cVar4.d.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return s2l.c.j((r60.b) cVar4.f254956h.get());
                    case 4:
                        return s2l.c.q((com.revolut.kompot.navigable.a) cVar4.f254954c.get(), (rp0.p0) cVar4.f254955g.get(), kxa.j.o(new nji.b()));
                    case 5:
                        return new rp0.p0();
                    case 6:
                        Object extension2 = (tkb.a) cVar4.k.get();
                        gmb.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        yji.n nVar5 = (yji.n) extension2;
                        vc.s.k(nVar5);
                        return nVar5;
                    case 7:
                        skb.f fVarB = ((blb.e) eVar5.f254970a).b();
                        f80.a aVarX3 = eVar5.f254978n.x();
                        vc.s.j(aVarX3);
                        ag.p provider = ufg.p0.u(fVarB, aVarX3, ((s41.a) eVar5.i).d());
                        j60.a bottomDialogExtension = (j60.a) cVar4.f254957j.get();
                        gmb.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider, "provider");
                        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomExpandableDialogControllerExtension");
                        skb.f fVar3 = (skb.f) provider.f4717b;
                        f80.a aVar11 = (f80.a) provider.f4718c;
                        wli.x xVar = (wli.x) provider.d;
                        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
                        return new tkb.c(bottomDialogExtension, fVar3, aVar11, xVar);
                    case 8:
                        j60.a bottomExpandableDialogEmbeddedControllerExtension2 = (j60.a) cVar4.e.get();
                        gmb.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(bottomExpandableDialogEmbeddedControllerExtension2, "bottomExpandableDialogEmbeddedControllerExtension");
                        vc.s.k(bottomExpandableDialogEmbeddedControllerExtension2);
                        return bottomExpandableDialogEmbeddedControllerExtension2;
                    case 9:
                        clb.c extension3 = (clb.c) cVar4.f254959m.get();
                        gmb.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        vc.s.k(extension3);
                        return extension3;
                    case 10:
                        dkk.a0 savingsErrorHandlingApiFactory = ((blb.e) eVar5.f254970a).d();
                        gmb.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(savingsErrorHandlingApiFactory, "savingsErrorHandlingApiFactory");
                        return savingsErrorHandlingApiFactory.a();
                    case 11:
                        okb.m extension4 = (okb.m) cVar4.f254961p.get();
                        pkb.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension4, "extension");
                        vc.s.k(extension4);
                        return extension4;
                    case 12:
                        r60.b bVar9 = (r60.b) cVar4.f254956h.get();
                        okb.g gVar7 = (okb.g) cVar4.o.get();
                        ypg.e eVar6 = (ypg.e) ((wpg.l) cVar4.f254953b.f254979p).P.get();
                        vc.s.j(eVar6);
                        return new okb.m(bVar9, gVar7, new kpj.f(eVar6));
                    case 13:
                        return new okb.a();
                    case 14:
                        Object extension5 = (vkb.a) cVar4.f254963r.get();
                        wkb.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension5, "extension");
                        yji.n nVar6 = (yji.n) extension5;
                        vc.s.k(nVar6);
                        return nVar6;
                    case 15:
                        ang.f fVarE = eVar5.f254977m.e();
                        j60.a aVar12 = (j60.a) cVar4.f254957j.get();
                        com.revolut.feature.retail.savings.impl.common.sole_tax_residency.a aVar13 = new com.revolut.feature.retail.savings.impl.common.sole_tax_residency.a();
                        mre.c cVarB2 = eVar5.k.b();
                        vc.s.j(cVarB2);
                        bVar = new com.revolut.feature.retail.savings.impl.common.sole_tax_residency.b(fVarE, aVar12, aVar13, cVarB2);
                        break;
                    case 16:
                        fpg.c cVar5 = eVar5.f254979p;
                        efk.a aVar14 = eVar5.f254971b;
                        tib.b bVar10 = eVar5.f254970a;
                        ypg.e eVar7 = (ypg.e) ((wpg.l) cVar5).P.get();
                        vc.s.j(eVar7);
                        ijb.a aVarG2 = ((blb.e) bVar10).g();
                        vc.s.j(aVarG2);
                        gnb.b bVarA = ((fnb.b) eVar5.f254980q).a();
                        ang.f fVarE2 = eVar5.f254977m.e();
                        j60.a aVar15 = (j60.a) cVar4.f254957j.get();
                        vkb.a aVar16 = (vkb.a) cVar4.f254963r.get();
                        vkb.f fVar4 = (vkb.f) cVar4.f254965t.get();
                        ReviewProductDetailsScreenContract$InputData reviewProductDetailsScreenContract$InputData = cVar4.f254952a;
                        okb.m mVar = (okb.m) cVar4.f254961p.get();
                        tkb.a aVar17 = (tkb.a) cVar4.k.get();
                        mpg.a aVar18 = (mpg.a) cVar4.u.get();
                        wli.x xVarD3 = ((s41.a) eVar5.i).d();
                        skb.f fVarB2 = ((blb.e) bVar10).b();
                        f80.a aVarX4 = eVar5.f254978n.x();
                        vc.s.j(aVarX4);
                        r0 r0VarC = eVar5.f254975j.c();
                        clb.c cVar6 = (clb.c) cVar4.f254959m.get();
                        ffk.t tVarF2 = aVar14.f();
                        vc.s.j(tVarF2);
                        r10.r rVarH = ((blb.e) bVar10).h();
                        sfk.a aVarE = aVar14.e();
                        vc.s.j(aVarE);
                        yjb.c cVar7 = new yjb.c();
                        gte.a aVarB4 = eVar5.f254974h.b();
                        vc.s.j(aVarB4);
                        fkg.a aVar19 = new fkg.a((eqb.b) ((blb.e) bVar10).f16515t.get());
                        tkb.e eVar8 = new tkb.e();
                        rlb.e eVar9 = cVar4.f254953b;
                        ite.a aVar20 = eVar9.f254974h;
                        kmb.c cVar8 = new kmb.c(new jmb.f(eVar8, new dcd.b()), new kmb.b(new com.revolut.feature.retail.savings.impl.common.product_info.a(), new rkb.d()), new k48.a());
                        dcd.b bVar11 = new dcd.b();
                        l80.e eVarH = eVar9.f254978n.h();
                        vc.s.j(eVarH);
                        jmb.h hVar11 = new jmb.h(bVar11, eVarH);
                        rkb.b bVar12 = new rkb.b();
                        k48.a aVar21 = new k48.a();
                        gte.a aVarB5 = aVar20.b();
                        vc.s.j(aVarB5);
                        kmb.e eVar10 = new kmb.e(hVar11, bVar12, aVar21, new hmb.a(aVarB5), new hqb.a());
                        dcd.b savingsInterestRateFormatter = new dcd.b();
                        yik.h pricingPlanStringMapper = ((k3) eVar9.o).b();
                        gte.a featureToggleInteractor = aVar20.b();
                        vc.s.j(featureToggleInteractor);
                        gmb.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
                        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
                        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                        imb.e eVar11 = new imb.e(savingsInterestRateFormatter, pricingPlanStringMapper, featureToggleInteractor);
                        dcd.b savingsInterestRateFormatter2 = new dcd.b();
                        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter2, "savingsInterestRateFormatter");
                        imb.b bVar13 = new imb.b(savingsInterestRateFormatter2);
                        gte.a aVarB6 = aVar20.b();
                        vc.s.j(aVarB6);
                        bVar = new com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b(eVar7, aVarG2, bVarA, fVarE2, aVar15, aVar16, fVar4, reviewProductDetailsScreenContract$InputData, mVar, aVar17, aVar18, xVarD3, fVarB2, aVarX4, r0VarC, cVar6, tVarF2, rVarH, aVarE, cVar7, aVarB4, aVar19, new o0(cVar8, eVar10, eVar11, bVar13, aVarB6));
                        break;
                    case 17:
                        return new vkb.g();
                    case 18:
                        pre.c cVarA2 = ((wpg.l) eVar5.f254979p).u.a();
                        vc.s.j(cVarA2);
                        g0 provider2 = bjf.f.l(cVarA2);
                        gmb.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(provider2, "provider");
                        return new arg.d((pre.c) provider2.f16654b);
                    default:
                        throw new AssertionError(i96);
                }
                return bVar;
            case 13:
                rlb.d dVar4 = (rlb.d) this.d;
                rlb.e eVar12 = (rlb.e) this.f252156b;
                tib.b bVar14 = eVar12.f254970a;
                bnb.a aVar22 = eVar12.f254981r;
                int i99 = this.f252157c;
                if (i99 == 0) {
                    clb.c extension6 = (clb.c) dVar4.f254968c.get();
                    mmb.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension6, "extension");
                    vc.s.k(extension6);
                    return extension6;
                }
                if (i99 == 1) {
                    dkk.a0 savingsErrorHandlingApiFactory2 = ((blb.e) bVar14).d();
                    mmb.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(savingsErrorHandlingApiFactory2, "savingsErrorHandlingApiFactory");
                    return savingsErrorHandlingApiFactory2.a();
                }
                if (i99 == 2) {
                    rnb.w wVarB = aVar22.b();
                    vc.s.j(wVarB);
                    return new lmb.c(wVarB);
                }
                if (i99 == 3) {
                    rnb.w wVarB2 = aVar22.b();
                    vc.s.j(wVarB2);
                    ybl.k kVarD2 = eVar12.f254982s.d();
                    vc.s.j(kVarD2);
                    return new lmb.g(wVarB2, kVarD2, new lmb.l());
                }
                if (i99 != 4) {
                    throw new AssertionError(i99);
                }
                SavingsAccountCreationStepDestination savingsAccountCreationStepDestination = dVar4.f254966a;
                lmb.i iVar4 = (lmb.i) dVar4.e.get();
                lmb.k kVar4 = (lmb.k) dVar4.f.get();
                wlb.a aVar23 = (wlb.a) eVar12.e.f254945c.get();
                vc.s.j(aVar23);
                clb.c cVar9 = (clb.c) dVar4.f254968c.get();
                lmb.l lVar3 = new lmb.l();
                lmb.b0 b0Var = new lmb.b0(dVar4.f254967b);
                ijb.a aVarG3 = ((blb.e) bVar14).g();
                vc.s.j(aVarG3);
                til.m mVarA = eVar12.f254983t.a();
                vc.s.j(mVarA);
                rnb.w wVarB3 = aVar22.b();
                vc.s.j(wVarB3);
                return new com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.a(savingsAccountCreationStepDestination, iVar4, kVar4, aVar23, cVar9, lVar3, b0Var, aVarG3, mVarA, wVarB3, ((vjb.b) eVar12.d).b(), new lmb.z());
            case 14:
                rlb.e eVar13 = (rlb.e) this.f252156b;
                rlb.f fVar5 = (rlb.f) this.d;
                int i100 = this.f252157c;
                switch (i100) {
                    case 0:
                        return kxa.j.j((j60.a) fVar5.d.get());
                    case 1:
                        return v1.c.r((com.revolut.kompot.navigable.a) fVar5.f254985b.get(), (rp0.m) fVar5.f254986c.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        Object extension7 = (tmb.i) fVar5.f254987g.get();
                        umb.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension7, "extension");
                        yji.n nVar7 = (yji.n) extension7;
                        vc.s.k(nVar7);
                        return nVar7;
                    case 4:
                        j60.a aVar24 = (j60.a) fVar5.f.get();
                        pmb.k kVar5 = new pmb.k();
                        mre.c cVarB3 = eVar13.k.b();
                        vc.s.j(cVarB3);
                        return new tmb.l(aVar24, kVar5, cVarB3, ((s41.a) eVar13.i).d());
                    case 5:
                        j60.a bottomExpandableDialogEmbeddedControllerExtension3 = (j60.a) fVar5.d.get();
                        omb.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(bottomExpandableDialogEmbeddedControllerExtension3, "bottomExpandableDialogEmbeddedControllerExtension");
                        vc.s.k(bottomExpandableDialogEmbeddedControllerExtension3);
                        return bottomExpandableDialogEmbeddedControllerExtension3;
                    case 6:
                        ijb.a aVarG4 = ((blb.e) eVar13.f254970a).g();
                        vc.s.j(aVarG4);
                        wsg.n nVarB2 = eVar13.f254976l.b();
                        ffk.t tVarF3 = eVar13.f254971b.f();
                        vc.s.j(tVarF3);
                        ang.f fVarE3 = eVar13.f254977m.e();
                        tmb.i iVar5 = (tmb.i) fVar5.f254987g.get();
                        SavingsCurrencySelectionContract$InputData savingsCurrencySelectionContract$InputData = fVar5.f254984a;
                        f80.a aVarX5 = eVar13.f254978n.x();
                        vc.s.j(aVarX5);
                        return new com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.a(aVarG4, nVarB2, tVarF3, fVarE3, iVar5, savingsCurrencySelectionContract$InputData, aVarX5, eVar13.f254973g.g(), new nmb.t(new dcd.b(), new vlb.c()));
                    default:
                        throw new AssertionError(i100);
                }
            case 15:
                rlb.g gVar8 = (rlb.g) this.d;
                rlb.e eVar14 = (rlb.e) this.f252156b;
                tib.b bVar15 = eVar14.f254970a;
                ite.a aVar25 = eVar14.f254974h;
                int i101 = this.f252157c;
                if (i101 == 0) {
                    clb.c extension8 = (clb.c) gVar8.d.get();
                    ylb.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension8, "extension");
                    vc.s.k(extension8);
                    return extension8;
                }
                if (i101 == 1) {
                    dkk.a0 savingsErrorHandlingApiFactory3 = ((blb.e) bVar15).d();
                    ylb.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(savingsErrorHandlingApiFactory3, "savingsErrorHandlingApiFactory");
                    return savingsErrorHandlingApiFactory3.a();
                }
                if (i101 != 2) {
                    if (i101 != 3) {
                        throw new AssertionError(i101);
                    }
                    gte.a featureToggleInteractor2 = aVar25.b();
                    vc.s.j(featureToggleInteractor2);
                    ylb.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(featureToggleInteractor2, "featureToggleInteractor");
                    return new vlb.e(featureToggleInteractor2);
                }
                SavingsOnboardingFlowContract$Input savingsOnboardingFlowContract$Input = gVar8.f254989a;
                ijb.a aVarG5 = ((blb.e) bVar15).g();
                vc.s.j(aVarG5);
                ffk.t tVarF4 = eVar14.f254971b.f();
                vc.s.j(tVarF4);
                zja.a aVarA3 = ((ika.b) eVar14.f254972c).a();
                vc.s.j(aVarA3);
                ugc.a aVarB7 = ((vjb.b) eVar14.d).b();
                wlb.a aVar26 = (wlb.a) eVar14.e.f254945c.get();
                vc.s.j(aVar26);
                clb.c cVar10 = (clb.c) gVar8.d.get();
                rlb.e eVar15 = gVar8.f254990b;
                xlb.y yVar = new xlb.y(eVar15.f.a(), eVar15.f254973g.g());
                vlb.e eVar16 = (vlb.e) gVar8.f.get();
                wli.x xVarD4 = ((s41.a) eVar14.i).d();
                gte.a aVarB8 = aVar25.b();
                vc.s.j(aVarB8);
                return new com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e(savingsOnboardingFlowContract$Input, aVarG5, tVarF4, aVarA3, aVarB7, aVar26, cVar10, yVar, eVar16, xVarD4, aVarB8, eVar14.f254975j.c(), new w38.t());
            case 16:
                return a();
            case 17:
                return b();
            case 18:
                return c();
            case 19:
                return d();
            case 20:
                return e();
            case 21:
                return f();
            case 22:
                return g();
            case 23:
                return h();
            case 24:
                return i();
            case 25:
                return j();
            case 26:
                return k();
            case 27:
                return l();
            case 28:
                return m();
            default:
                kbb.c cVar11 = (kbb.c) this.d;
                int i102 = this.f252157c;
                if (i102 != 0) {
                    if (i102 == 1) {
                        return new tyc.q();
                    }
                    throw new AssertionError(i102);
                }
                tyc.s sVar = new tyc.s((pyc.f) ((ryc.b) this.f252156b).f258302r.get(), (tyc.n) ((e4m.e) cVar11.f182550c).get());
                kli.a.p(sVar, bq.i.d(((ryc.c) cVar11.f182549b).f258307a));
                return sVar;
        }
    }
}
