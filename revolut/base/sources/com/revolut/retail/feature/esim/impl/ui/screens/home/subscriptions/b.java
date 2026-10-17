package com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions;

import bej.m;
import bej.n;
import bjj.f;
import chj.c0;
import chj.d;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimContractMetadata;
import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.model.EsimProfileDetails;
import com.revolut.retail.feature.esim.api.model.EsimTerms;
import com.revolut.retail.feature.esim.impl.R$plurals;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$ClauseClickParcel;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$OutputData;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$SubscriptionItemClickData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_transfer_info.EsimMobilePlanEsimTransferInfoScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_transfer_info.EsimMobilePlanEsimTransferInfoScreenContract$InputData;
import dcl.m0;
import dej.o3;
import dfj.a1;
import dfj.b2;
import dfj.d5;
import dfj.i1;
import dfj.l;
import dfj.s3;
import dfj.v2;
import dfj.z0;
import ffk.t;
import hha.s;
import hng.g;
import hx7.e;
import ip0.ak0;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import jhi.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lfg.d0;
import nfj.s2;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pij.c1;
import pij.e1;
import pij.f0;
import pij.f1;
import pij.g1;
import pij.i0;
import pij.k0;
import pij.k1;
import pij.l0;
import pij.v;
import pij.y;
import qij.o;
import skm.a2;
import unj.c;
import unj.j;
import vkm.j2;
import vkm.q;
import w4l.i;
import wli.x;
import zh9.u0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements y {

    @NotNull
    public static final k0 Companion = new k0();
    public final gfj.a A;
    public final gfj.b B;
    public final c C;
    public final j60.a D;
    public final d E;
    public final vij.c F;
    public final c0 G;
    public final f H;
    public final bjj.a I;
    public final mkd.d J;
    public final x K;
    public final m L;
    public final j M;
    public final l61.a N;
    public final l O;
    public final gte.a P;
    public final cej.b Q;
    public final tij.x R;
    public final kdh.b S;
    public final z0 T;
    public final c70.a U;
    public final nkj.d V;
    public final ehj.d W;
    public final sij.b X;
    public final i1 Y;
    public final dfj.c0 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final vii.b f101078a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public a2 f101079b0;
    public a2 c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public l0 f101080d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final cli.y f101081e0;
    public final com.revolut.kompot.navigable.vc.modal.a f0;
    public final EsimSubscriptionsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i90.b f101082p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f101083q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v2 f101084r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final bej.f f101085s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qij.l f101086t;
    public final n u;
    public final s3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final tij.t f101087w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final dfj.k0 f101088x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g2e.t f101089y;
    public final r10.d z;

    public b(EsimSubscriptionsScreenContract$InputData inputData, i90.b uuidUtils, cli.n stateMapper, t pricingPlanInteractor, v2 esimProfilesInteractor, bej.f esimPlanOffersInteractor, qij.l esimHomeBannerInteractor, n esimTermsInteractor, s3 esimSubscriptionsInteractor, tij.t viewSelectionMapper, dfj.k0 esimInstallationStateInteractor, g2e.t deviceGroupingInteractor, r10.d subscriptionsViewGroupingInteractor, gfj.a esimActiveSubscriptionsInteractor, gfj.b esimExpiredSubscriptionsInteractor, c esimCountryPickerControllerMapper, j60.a dialogControllerExtension, d esimInstallationControllerExtension, vij.c esimOfferActivationDialogBuilder, c0 subscriptionPurchaseControllerExtension, f subscriptionActivationControllerExtension, bjj.a subscriptionActivationConfirmationControllerProvider, mkd.d slotManagerExtension, x deeplinkHandler, m esimStatementsInteractor, j esimStatementsDialogBuilder, l61.a userCompanyInteractor, l esimConfigurationInteractor, gte.a featureToggleInteractor, cej.b mobilePlansFeatureAvailabilityInteractor, tij.x esimUnfreezingDialogBuilder, kdh.b deviceManagementInteractor, z0 internalDeepLinkInteractor, c70.a clipboard, nkj.d shotDialogBuilder, ehj.d esimInstallationUrlBuilder, sij.b esimTransferControllerModelExtension, i1 phoneNumberInteractor, dfj.c0 esimGiftingInteractor, dm0.d deviceIdProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(esimProfilesInteractor, "esimProfilesInteractor");
        Intrinsics.checkNotNullParameter(esimPlanOffersInteractor, "esimPlanOffersInteractor");
        Intrinsics.checkNotNullParameter(esimHomeBannerInteractor, "esimHomeBannerInteractor");
        Intrinsics.checkNotNullParameter(esimTermsInteractor, "esimTermsInteractor");
        Intrinsics.checkNotNullParameter(esimSubscriptionsInteractor, "esimSubscriptionsInteractor");
        Intrinsics.checkNotNullParameter(viewSelectionMapper, "viewSelectionMapper");
        Intrinsics.checkNotNullParameter(esimInstallationStateInteractor, "esimInstallationStateInteractor");
        Intrinsics.checkNotNullParameter(deviceGroupingInteractor, "deviceGroupingInteractor");
        Intrinsics.checkNotNullParameter(subscriptionsViewGroupingInteractor, "subscriptionsViewGroupingInteractor");
        Intrinsics.checkNotNullParameter(esimActiveSubscriptionsInteractor, "esimActiveSubscriptionsInteractor");
        Intrinsics.checkNotNullParameter(esimExpiredSubscriptionsInteractor, "esimExpiredSubscriptionsInteractor");
        Intrinsics.checkNotNullParameter(esimCountryPickerControllerMapper, "esimCountryPickerControllerMapper");
        Intrinsics.checkNotNullParameter(dialogControllerExtension, "dialogControllerExtension");
        Intrinsics.checkNotNullParameter(esimInstallationControllerExtension, "esimInstallationControllerExtension");
        Intrinsics.checkNotNullParameter(esimOfferActivationDialogBuilder, "esimOfferActivationDialogBuilder");
        Intrinsics.checkNotNullParameter(subscriptionPurchaseControllerExtension, "subscriptionPurchaseControllerExtension");
        Intrinsics.checkNotNullParameter(subscriptionActivationControllerExtension, "subscriptionActivationControllerExtension");
        Intrinsics.checkNotNullParameter(subscriptionActivationConfirmationControllerProvider, "subscriptionActivationConfirmationControllerProvider");
        Intrinsics.checkNotNullParameter(slotManagerExtension, "slotManagerExtension");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(esimStatementsInteractor, "esimStatementsInteractor");
        Intrinsics.checkNotNullParameter(esimStatementsDialogBuilder, "esimStatementsDialogBuilder");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(esimConfigurationInteractor, "esimConfigurationInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(esimUnfreezingDialogBuilder, "esimUnfreezingDialogBuilder");
        Intrinsics.checkNotNullParameter(deviceManagementInteractor, "deviceManagementInteractor");
        Intrinsics.checkNotNullParameter(internalDeepLinkInteractor, "internalDeepLinkInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(shotDialogBuilder, "shotDialogBuilder");
        Intrinsics.checkNotNullParameter(esimInstallationUrlBuilder, "esimInstallationUrlBuilder");
        Intrinsics.checkNotNullParameter(esimTransferControllerModelExtension, "esimTransferControllerModelExtension");
        Intrinsics.checkNotNullParameter(phoneNumberInteractor, "phoneNumberInteractor");
        Intrinsics.checkNotNullParameter(esimGiftingInteractor, "esimGiftingInteractor");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        this.o = inputData;
        this.f101082p = uuidUtils;
        this.f101083q = pricingPlanInteractor;
        this.f101084r = esimProfilesInteractor;
        this.f101085s = esimPlanOffersInteractor;
        this.f101086t = esimHomeBannerInteractor;
        this.u = esimTermsInteractor;
        this.v = esimSubscriptionsInteractor;
        this.f101087w = viewSelectionMapper;
        this.f101088x = esimInstallationStateInteractor;
        this.f101089y = deviceGroupingInteractor;
        this.z = subscriptionsViewGroupingInteractor;
        this.A = esimActiveSubscriptionsInteractor;
        this.B = esimExpiredSubscriptionsInteractor;
        this.C = esimCountryPickerControllerMapper;
        this.D = dialogControllerExtension;
        this.E = esimInstallationControllerExtension;
        this.F = esimOfferActivationDialogBuilder;
        this.G = subscriptionPurchaseControllerExtension;
        this.H = subscriptionActivationControllerExtension;
        this.I = subscriptionActivationConfirmationControllerProvider;
        this.J = slotManagerExtension;
        this.K = deeplinkHandler;
        this.L = esimStatementsInteractor;
        this.M = esimStatementsDialogBuilder;
        this.N = userCompanyInteractor;
        this.O = esimConfigurationInteractor;
        this.P = featureToggleInteractor;
        this.Q = mobilePlansFeatureAvailabilityInteractor;
        this.R = esimUnfreezingDialogBuilder;
        this.S = deviceManagementInteractor;
        this.T = internalDeepLinkInteractor;
        this.U = clipboard;
        this.V = shotDialogBuilder;
        this.W = esimInstallationUrlBuilder;
        this.X = esimTransferControllerModelExtension;
        this.Y = phoneNumberInteractor;
        this.Z = esimGiftingInteractor;
        this.f101078a0 = new vii.b();
        EsimSubscriptionsScreenContract$InputData.Routing routing = inputData.f101030b;
        EsimSubscriptionsScreenContract$InputData.Routing.INSTANCE.getClass();
        this.f101080d0 = !Intrinsics.f(routing, EsimSubscriptionsScreenContract$InputData.Routing.f101033c) ? l0.PENDING : l0.COMPLETED;
        this.f101081e0 = mra.d.b(this, new v(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), wp5.y.u(uuidUtils, "toString(...)"), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), deviceIdProvider.b(), new f0(null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, null, null), stateMapper, new a(this), false, 8);
        this.f0 = e.a(this, new p5f.c(this, 28));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b r6, java.lang.String r7, java.lang.String r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof pij.x0
            if (r0 == 0) goto L13
            r0 = r9
            pij.x0 r0 = (pij.x0) r0
            int r1 = r0.f236600y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f236600y = r1
            goto L18
        L13:
            pij.x0 r0 = new pij.x0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f236598w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f236600y
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r3) goto L37
            if (r2 != r4) goto L2f
            com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections r7 = r0.v
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L80
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L6b
        L3d:
            yhm.o.b(r9)
            dfj.i1 r9 = r6.Y
            vkm.d r9 = r9.a(r8)
            pig.y r2 = new pig.y
            r2.<init>(r7, r4)
            akg.n r7 = nim.a.v(r9, r2)
            pij.d r9 = new pij.d
            r2 = 6
            r9.<init>(r2)
            vkm.q0 r7 = c8g.c.c(r7, r9)
            m84.c r9 = new m84.c
            r2 = 25
            r9.<init>(r4, r2, r5)
            r0.u = r8
            r0.f236600y = r3
            java.lang.Object r9 = vkm.q.y(r7, r9, r0)
            if (r9 != r1) goto L6b
            goto L7f
        L6b:
            com.revolut.data.model.Data r9 = (com.revolut.data.model.Data) r9
            java.lang.Object r7 = r9.getContent()
            com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections r7 = (com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections) r7
            r0.u = r8
            r0.v = r7
            r0.f236600y = r4
            java.lang.Object r9 = r6.O2(r8, r0)
            if (r9 != r1) goto L80
        L7f:
            return r1
        L80:
            com.revolut.retail.feature.esim.api.model.EsimGiftRecipient r9 = (com.revolut.retail.feature.esim.api.model.EsimGiftRecipient) r9
            if (r7 == 0) goto L8b
            com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelectionOptions r0 = r7.f100408b
            if (r0 == 0) goto L8b
            com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting r0 = r0.f100404a
            goto L8c
        L8b:
            r0 = r5
        L8c:
            if (r0 == 0) goto L97
            com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$OutputData$MobilePlanPortingCreateClick r1 = new com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$OutputData$MobilePlanPortingCreateClick
            r1.<init>(r9, r0, r7, r8)
            r6.C2(r1)
            goto La4
        L97:
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r7 = rd0.c.ERROR
            java.lang.String r8 = "Can't start porting update flow, porting is null"
            java.lang.String r9 = "EsimSubscriptionsScreenModel"
            rd0.d.a(r7, r9, r8, r5, r6)
        La4:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b.I2(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b.J2(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b, java.lang.String, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public static final void K2(b bVar, Function1 function1) {
        List list;
        List list2;
        cli.y yVar = bVar.f101081e0;
        l0 l0Var = bVar.f101080d0;
        l0 l0Var2 = l0.NAVIGATING_TO_GET_PLAN;
        if (l0Var == l0Var2) {
            return;
        }
        bVar.H2(yVar, function1);
        j2 j2Var = (j2) yVar.f22677a;
        EsimSubscriptionsScreenContract$InputData esimSubscriptionsScreenContract$InputData = bVar.o;
        Data data = ((v) j2Var.getValue()).f236579a;
        Data data2 = ((v) j2Var.getValue()).e;
        if (bVar.f101080d0 == l0.PENDING && N2(data) && N2(data2)) {
            if (esimSubscriptionsScreenContract$InputData.f101030b.f101034a && (list = (List) data.getContent()) != null && list.isEmpty() && (list2 = (List) data2.getContent()) != null && list2.isEmpty()) {
                bVar.f101080d0 = l0Var2;
                bVar.H2(yVar, new pij.d(12));
                bVar.C2(new EsimSubscriptionsScreenContract$OutputData.GoToGetPlan(pij.x.AUTO_ROUTING));
            } else if (!esimSubscriptionsScreenContract$InputData.f101030b.f101035b) {
                bVar.f101080d0 = l0.COMPLETED;
            } else {
                bVar.f101080d0 = l0.COMPLETED;
                bVar.C2(new EsimSubscriptionsScreenContract$OutputData.GoToExpiredPlans(pij.x.AUTO_ROUTING));
            }
        }
    }

    public static void M2(b bVar, EsimProfile esimProfile) {
        bVar.L2(esimProfile, pd.b.j((Boolean) ((v) ((j2) bVar.f101081e0.f22677a).getValue()).f236585l.getContent()));
    }

    public static boolean N2(Data data) {
        List list;
        return !(data.getLoading() || data.getContent() == null) || ((list = (List) data.getContent()) != null && (list.isEmpty() ^ true));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, com.revolut.data.database.models.openbanking.d.y("EsimSubscriptionsScreenModel", "loadUserCompanyTillFinish", rd0.e.b(g.b(((ang.b) this.N).f7765a))), null, null, new pij.z0(this, continuation, 4), 3);
        l lVar = this.O;
        w4l.h loadingStrategy = w4l.h.f294642c;
        yji.l.a1(this, com.revolut.data.database.models.openbanking.d.y("EsimSubscriptionsScreenModel", "loadManualInstallationStateTillFinish", lVar.a(loadingStrategy)), null, null, new pij.z0(this, continuation, 2), 3);
        yji.l.a1(this, this.G.d3(), null, null, new pij.z0(this, continuation, 7), 3);
        yji.l.a1(this, this.H.b3(), null, null, new g1(this, null), 3);
        yji.l.a1(this, this.E.Z2(), null, null, new c1(this, null), 3);
        yji.l.a1(this, this.X.Z2(), null, null, new e1(this, null), 3);
        s3 s3Var = this.v;
        yji.l.a1(this, s3Var.b(loadingStrategy), null, null, new pij.z0(this, continuation, 9), 3);
        b2 b2Var = (b2) this.f101085s;
        b2Var.getClass();
        i loadingStrategy2 = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
        akg.n nVarV = nim.a.v(boh.f.e(rd0.e.b(b2Var.f113916b.q()), new m0(b2Var, loadingStrategy2, 16)), new dee.x(19));
        zhm.f0 f0Var = zhm.f0.f322471a;
        k kVarX = hb9.b.x(nVarV, f0Var);
        t tVar = this.f101083q;
        vkm.d dVarB = rd0.e.b(tVar.v(loadingStrategy));
        vkm.d dVarB2 = rd0.e.b(tVar.n());
        d5 d5Var = (d5) this.u;
        yji.l.a1(this, q.Q(this.f101078a0, new okf.m(continuation, yh5.b.h(kVarX, dVarB, dVarB2, d5Var.b(), d5Var.a()), 26)), null, null, new pij.z0(this, continuation, 3), 3);
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, q.q(new d83.i(((s2) s3Var.f114105a).i(loadingStrategy), 22)), null, null, new pij.z0(this, continuation, 8), 3);
        boolean zC = ((jte.d) this.P).c(EsimApi$Toggles.EsimGifting.f100175c);
        gfj.a aVar = this.A;
        if (zC) {
            yji.l.a1(this, boh.f.e(gfj.a.a(aVar, o3.PRIORITY_RANK, 1), new i0(this, 6)), null, null, new pij.z0(this, continuation, 6), 3);
        } else {
            yji.l.a1(this, boh.f.e(gfj.a.a(aVar, o3.PRIORITY_RANK, 1), new i0(this, 4)), null, null, new pij.z0(this, continuation, 5), 3);
        }
        yji.l.a1(this, this.B.a(loadingStrategy, o3.PRIORITY_RANK), null, null, new pij.z0(this, continuation, 10), 3);
        yji.l.a1(this, rd0.e.n(this.f101084r.h(), h0.f322473a), null, null, new pij.z0(this, continuation, 14), 3);
        yji.l.a1(this, hb9.b.x(rd0.e.b(this.S.j0(true, false)), f0Var), null, null, new pij.z0(this, continuation, 15), 3);
        dfj.c0 c0Var = this.Z;
        yji.l.a1(this, nim.a.v(c0Var.b(loadingStrategy), new pij.d(13)), null, null, new pij.z0(this, continuation, 11), 3);
        yji.l.a1(this, q.q(new d0(c0Var.f113926a.f215072c.C0("ESIM_GIFTING_ENTRY_POINT_SEEN_KEY", Boolean.TYPE), 17)), null, null, new jkh.g(this, continuation, 24), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f0;
    }

    public final void L2(EsimProfile esimProfile, boolean z) {
        String strA;
        EsimProfileDetails esimProfileDetails;
        String esimActivationCode = (esimProfile == null || (esimProfileDetails = esimProfile.f100426g) == null) ? null : esimProfileDetails.f100434b;
        if (esimProfile != null) {
            this.W.getClass();
            strA = ehj.d.a(esimProfile);
        } else {
            strA = null;
        }
        if (esimActivationCode == null && strA == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Can't install eSIM: both activation code and installation URL are missing");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "EsimSubscriptionsScreenModel", null, illegalStateException, h0Var);
            return;
        }
        if (((jte.d) this.P).c(EsimApi$Toggles.EsimMobilePlanFlexibleStart.f100177c)) {
            h.v2(this.f0, new EsimSubscriptionsScreenContract$ModalStep.EsimInstallation(esimProfile, z), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        if (z) {
            C2(EsimSubscriptionsScreenContract$OutputData.InstallationInstructionsClicked.f101051a);
            return;
        }
        String esimProfileId = esimProfile.f100423a;
        if (esimActivationCode == null) {
            esimActivationCode = "";
        }
        d dVar = this.E;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(esimProfileId, "esimProfileId");
        Intrinsics.checkNotNullParameter(esimActivationCode, "esimActivationCode");
        dVar.b3(esimProfileId, strA != null ? new EsimProfileDetails.InstallationType.InstallationLink(strA) : new EsimProfileDetails.InstallationType.ActivationCode(esimActivationCode));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O2(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof pij.a1
            if (r0 == 0) goto L13
            r0 = r9
            pij.a1 r0 = (pij.a1) r0
            int r1 = r0.f236527x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f236527x = r1
            goto L18
        L13:
            pij.a1 r0 = new pij.a1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f236527x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.String r8 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2a
            goto L6a
        L2a:
            r9 = move-exception
            goto L73
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            yhm.o.b(r9)
            com.revolut.retail.feature.esim.api.EsimApi$Toggles$EsimGifting r9 = com.revolut.retail.feature.esim.api.EsimApi$Toggles.EsimGifting.f100175c
            gte.a r2 = r7.P
            jte.d r2 = (jte.d) r2
            boolean r9 = r2.c(r9)
            if (r9 != 0) goto L44
            return r4
        L44:
            dfj.c0 r9 = r7.Z     // Catch: java.lang.Throwable -> L2a
            w4l.h r2 = w4l.h.f294642c     // Catch: java.lang.Throwable -> L2a
            kotlinx.coroutines.flow.Flow r9 = r9.a(r8, r2)     // Catch: java.lang.Throwable -> L2a
            pij.d r2 = new pij.d     // Catch: java.lang.Throwable -> L2a
            r5 = 10
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2a
            akg.n r9 = nim.a.v(r9, r2)     // Catch: java.lang.Throwable -> L2a
            m84.c r2 = new m84.c     // Catch: java.lang.Throwable -> L2a
            r5 = 27
            r6 = 2
            r2.<init>(r6, r5, r4)     // Catch: java.lang.Throwable -> L2a
            r0.u = r8     // Catch: java.lang.Throwable -> L2a
            r0.f236527x = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r9 = vkm.q.y(r9, r2, r0)     // Catch: java.lang.Throwable -> L2a
            if (r9 != r1) goto L6a
            return r1
        L6a:
            com.revolut.data.model.Data r9 = (com.revolut.data.model.Data) r9     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r9 = r9.getContent()     // Catch: java.lang.Throwable -> L2a
            com.revolut.retail.feature.esim.api.model.EsimGiftRecipient r9 = (com.revolut.retail.feature.esim.api.model.EsimGiftRecipient) r9     // Catch: java.lang.Throwable -> L2a
            return r9
        L73:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            java.lang.String r2 = "Failed to load gift recipient for subscription: "
            java.lang.String r8 = j6.a.q(r2, r8)
            java.lang.String r2 = "EsimSubscriptionsScreenModel"
            rd0.d.a(r1, r2, r8, r9, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b.O2(java.lang.String, gim.c):java.lang.Object");
    }

    public final void P2() {
        a2 a2Var = this.f101079b0;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f101079b0 = n2(knm.b.s(new k1(this, continuation, 0), new pij.d(7)), new whi.b(6));
    }

    public final void Q2() {
        a2 a2Var = this.c0;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.c0 = n2(knm.b.s(new k1(this, continuation, 1), new pij.d(9)), new whi.b(6));
    }

    public final void R2(EsimProfile esimProfile, Function0 function0) {
        String str;
        List<UserDevice> list = (List) ((v) ((j2) this.f101081e0.f22677a).getValue()).f236588p.getContent();
        if (list != null) {
            for (UserDevice userDevice : list) {
                if (Intrinsics.f(userDevice.f71914a, esimProfile.d)) {
                    str = userDevice.e;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        str = null;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "EsimSubscriptionsScreenModel", "Can't find device name associated with transferable esim profile", null, h0Var);
        }
        f2(new EsimMobilePlanEsimTransferInfoScreen(new EsimMobilePlanEsimTransferInfoScreenContract$InputData(str)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new ac1.b(16, function0));
    }

    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.revolut.core.ui_kit_core.displayers.image.models.CdnImage, ip0.yj0] */
    public final void S2(EsimSubscriptionsScreenContract$SubscriptionItemClickData.PlanOffer planOffer) {
        int i;
        boolean zIsAfter;
        ?? r102;
        Clause textLocalisedClause;
        int i2;
        List listK;
        rp0.t tVar;
        cli.y yVar = this.f101081e0;
        PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) ((v) ((j2) yVar.f22677a).getValue()).f236580b.getContent();
        j2 j2Var = (j2) yVar.f22677a;
        String str = (String) ((v) j2Var.getValue()).f.getContent();
        String str2 = (String) ((v) j2Var.getValue()).f236582g.getContent();
        if (str == null || str2 == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "EsimSubscriptionsScreenModel", "Terms URLs are missing in domain state when plan offer activation is requested", null, h0Var);
        }
        if (pricingPlanSubscription == null) {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "EsimSubscriptionsScreenModel", "Plan subscription is missing in domain state when plan offer activation is requested", null, h0Var2);
        }
        EsimCoverage coverage = planOffer.d;
        String mobilePlanId = planOffer.f101069a;
        int i3 = planOffer.f101070b;
        EsimDataPlanOfferInfo offerType = planOffer.e;
        long j2 = planOffer.f101071c;
        dej.l lVar = planOffer.f101072g;
        EsimTerms terms = planOffer.f;
        vij.c cVar = this.F;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(mobilePlanId, "dataPlanId");
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        Intrinsics.checkNotNullParameter(offerType, "planOfferInfo");
        Intrinsics.checkNotNullParameter(terms, "terms");
        CellDetailsDelegate.Model modelB = cVar.f289605b.b(coverage);
        int i5 = lVar == null ? -1 : vij.b.f289603a[lVar.ordinal()];
        if (i5 == -1) {
            i = R$string.esim_checkout_data_title;
        } else {
            if (i5 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.esim_subscriptions_item_label_messaging_pass_title;
        }
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("ID_ALLOWANCE_ITEM", new TextLocalisedClause(i, null, null, 14), gej.a.a(cVar.f289604a, j2, null, 6), 0, null, null, null, null, null, false, 0, 0, 32760);
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("ID_VALIDITY_ITEM", new TextLocalisedClause(R$string.esim_checkout_validity_title, null, null, 14), new TextLocalisedQuantityClause(R$plurals.esim_checkout_validity_days, Integer.valueOf(i3), (List) null, (Style) null, 28), 0, null, null, null, null, null, false, 0, 0, 32760);
        vij.e eVar = cVar.f289606c;
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        Intrinsics.checkNotNullParameter(offerType, "offerType");
        if (((jte.d) eVar.f289609c).c(EsimApi$Toggles.EsimDynamicTermsPlanBenefit.f100174c)) {
            textLocalisedClause = eVar.f289608b.a(terms, mobilePlanId, null, null, offerType);
            r102 = 0;
        } else {
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.esim_checkout_footer_links_terms_and_conditions, null, new Click(28, (Integer) null, (Object) new EsimSubscriptionsScreenContract$ClauseClickParcel.UrlNavigation(str), "ID_REVOLUT_TERMS_CLAUSE", false), 10);
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.esim_checkout_footer_links_terms_of_service, null, new Click(28, (Integer) null, (Object) new EsimSubscriptionsScreenContract$ClauseClickParcel.UrlNavigation(str2), "ID_PARTNER_TERMS_CLAUSE", false), 10);
            if (pricingPlanSubscription == null || !s.p(pricingPlanSubscription.f81129a)) {
                zIsAfter = true;
            } else {
                LocalDate localDateE = ((l80.f) eVar.f289607a).e();
                Date date = pricingPlanSubscription.e.toDate();
                Intrinsics.checkNotNullExpressionValue(date, "toDate(...)");
                zIsAfter = localDateE.isAfter(ebm.a.N(date).plusDays(14L));
            }
            if (zIsAfter) {
                r102 = 0;
                textLocalisedClause = new TextLocalisedClause(R$string.esim_checkout_plan_offer_disclaimer_title, zhm.v.k(textLocalisedClause2, textLocalisedClause3), null, 12);
            } else {
                r102 = 0;
                textLocalisedClause = new TextLocalisedClause(R$string.esim_checkout_plan_offer_disclaimer_downgrade_title, zhm.v.k(textLocalisedClause2, textLocalisedClause3), null, 12);
            }
        }
        TextDelegate.Model model3 = new TextDelegate.Model("ID_FOOTER_ITEM", textLocalisedClause, false, new ak0(r102, r102, 3), null, null, 0, 0, 0, 0, 2036);
        LargeActionButtonDelegate.Model model4 = new LargeActionButtonDelegate.Model("ID_CONTINUE_BUTTON", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.esim_checkout_actions_claim, null, null, 14), false, "ESIM_CHECKOUT_MAIN_BUTTON_LOADING_TAG", null, new EsimSubscriptionsScreenContract$ActivatePlanOfferClickData(mobilePlanId, offerType, new EsimContractMetadata(terms.f, Long.valueOf(terms.e))), null, 680);
        int i6 = R$attr.uikit_dp8;
        int i21 = R$attr.uikit_dp16;
        yp0.b.p(model4, i6, R$attr.uikit_dp24, i21, i21);
        int i22 = lVar == null ? -1 : vij.b.f289603a[lVar.ordinal()];
        if (i22 != -1) {
            i2 = 1;
            if (i22 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            listK = zhm.v.k(model, modelB, model2);
        } else {
            i2 = 1;
            listK = zhm.v.k(modelB, model, model2);
        }
        List list = listK;
        int i32 = lVar == null ? -1 : vij.b.f289603a[lVar.ordinal()];
        if (i32 == -1) {
            tVar = new rp0.t(new TextLocalisedClause(R$string.esim_checkout_plan_offer_title, null, null, 14), null, null, 30);
        } else {
            if (i32 != i2) {
                throw new NoWhenBranchMatchedException();
            }
            tVar = new rp0.t(new TextLocalisedClause(R$string.esim_checkout_messaging_pass_title, null, null, 14), new TextLocalisedClause(R$string.esim_checkout_messaging_pass_subtitle, null, null, 14), null, 28);
        }
        rp0.t tVar2 = tVar;
        rp0.l lVar2 = rp0.l.WINDOW;
        yp0.b.k(list, 0, 0, 0, 0, 31);
        this.D.x(new rp0.y(zhm.d0.E0(zhm.v.k(model3, model4), list), tVar2, lVar2, null, null, null, 1016));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Flow gVar;
        Q2();
        P2();
        o oVar = (o) this.f101086t;
        t38.e eVarB = oVar.f246741c.b(w4l.h.f294642c);
        Continuation continuation = null;
        if (((efj.d) oVar.f).a()) {
            dfj.x xVar = oVar.d;
            xVar.getClass();
            i loadingStrategy = i.f294643c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            gVar = q.q(zi0.c.w(nim.a.y(nim.a.v(rd0.e.d(q.Q(xVar.f114147b.d(loadingStrategy), new cvi.i(continuation, xVar, 19)), y0.b(new Pair("EsimHomeBannerInteractorImpl", "observeEsimRemoteBanners"))), new qg7.v(14)), new qg7.v(15))));
        } else {
            gVar = new go.g(new Data(zhm.f0.f322471a, null, false, 6, null), 2);
        }
        yji.l.b1(this, q.r(new qc8.a(25), boh.f.e(u0.m(eVarB, gVar), new qij.m(oVar, 0))), null, new pij.z0(this, continuation, 0), 3);
        yji.l.b1(this, this.f101088x.b(i.f294643c), null, new pij.z0(this, continuation, 1), 3);
        yji.l.b1(this, q.g(((a1) this.T).f113903a), null, new pij.z0(this, continuation, 12), 3);
        cej.b bVar = this.Q;
        boolean zA = ((efj.d) bVar).a();
        mkd.d dVar = this.J;
        if (zA) {
            yji.l.b1(this, ((gld.f0) dVar).f144638l.e(), null, new f1(this, null), 3);
        }
        boolean zA2 = ((efj.d) bVar).a();
        cli.y yVar = this.f101081e0;
        if (!zA2) {
            H2(yVar, new pij.d(14));
            return;
        }
        gld.f0 f0Var = (gld.f0) dVar;
        f0Var.c3(new mkd.a(new SlotContext(akd.s.MOBILE_PLAN_MANAGEMENT, y0.b(((v) ((j2) yVar.f22677a).getValue()).f236586m.f115814c))));
        yji.l.b1(this, f0Var.f144638l.h(), null, new pij.z0(this, continuation, 13), 3);
    }

    public final void T2() {
        this.f101078a0.a();
        Q2();
        P2();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f101081e0;
    }
}
