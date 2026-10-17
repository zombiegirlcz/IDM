package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout;

import bej.d;
import bej.m;
import chj.c0;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanPointsOption;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanPointsOptions;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.model.EsimProfileDetails;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers.EsimDynamicTermsMapper$TermsClickData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$ModalStep;
import dej.j1;
import dfj.s3;
import dfj.w;
import hx7.e;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import njj.b0;
import njj.b1;
import njj.j0;
import njj.m0;
import njj.n0;
import njj.o0;
import njj.t0;
import njj.w0;
import njj.z0;
import nyb.k;
import oki.h;
import q7c.g;
import qjj.o;
import unj.j;
import vkm.j2;
import vkm.q;
import wli.x;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements j0 {
    public final s3 A;
    public final gte.a B;
    public final o C;
    public final ynj.b D;
    public final ugc.a E;
    public final vii.b F;
    public final y G;
    public final com.revolut.kompot.navigable.vc.modal.a H;
    public final i90.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final EsimMobilePlanCheckoutScreenContract$InputData f101171p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f101172q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w f101173r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f101174s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f101175t;
    public final k u;
    public final m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j f101176w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final chj.d f101177x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c0 f101178y;
    public final com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.a z;

    public a(n stateMapper, i90.b uuidUtils, EsimMobilePlanCheckoutScreenContract$InputData inputData, g paymentMethodsInteractor, w dataPlansInteractor, d mobilePlanCheckoutInteractor, x deeplinkHandler, k revPointsInteractor, m esimStatementsInteractor, j esimStatementsDialogBuilder, chj.d esimInstallationControllerExtension, c0 subscriptionPurchaseControllerExtension, com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.a mobilePlanEsimMigrationControllerProvider, s3 subscriptionsInteractor, gte.a featureToggleInteractor, o subscriptionRefundDataConsumptionInfoMapper, ynj.b checkoutPlanChangeResolver, ugc.a giftRecipientNameResolver) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(paymentMethodsInteractor, "paymentMethodsInteractor");
        Intrinsics.checkNotNullParameter(dataPlansInteractor, "dataPlansInteractor");
        Intrinsics.checkNotNullParameter(mobilePlanCheckoutInteractor, "mobilePlanCheckoutInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(esimStatementsInteractor, "esimStatementsInteractor");
        Intrinsics.checkNotNullParameter(esimStatementsDialogBuilder, "esimStatementsDialogBuilder");
        Intrinsics.checkNotNullParameter(esimInstallationControllerExtension, "esimInstallationControllerExtension");
        Intrinsics.checkNotNullParameter(subscriptionPurchaseControllerExtension, "subscriptionPurchaseControllerExtension");
        Intrinsics.checkNotNullParameter(mobilePlanEsimMigrationControllerProvider, "mobilePlanEsimMigrationControllerProvider");
        Intrinsics.checkNotNullParameter(subscriptionsInteractor, "subscriptionsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(subscriptionRefundDataConsumptionInfoMapper, "subscriptionRefundDataConsumptionInfoMapper");
        Intrinsics.checkNotNullParameter(checkoutPlanChangeResolver, "checkoutPlanChangeResolver");
        Intrinsics.checkNotNullParameter(giftRecipientNameResolver, "giftRecipientNameResolver");
        this.o = uuidUtils;
        this.f101171p = inputData;
        this.f101172q = paymentMethodsInteractor;
        this.f101173r = dataPlansInteractor;
        this.f101174s = mobilePlanCheckoutInteractor;
        this.f101175t = deeplinkHandler;
        this.u = revPointsInteractor;
        this.v = esimStatementsInteractor;
        this.f101176w = esimStatementsDialogBuilder;
        this.f101177x = esimInstallationControllerExtension;
        this.f101178y = subscriptionPurchaseControllerExtension;
        this.z = mobilePlanEsimMigrationControllerProvider;
        this.A = subscriptionsInteractor;
        this.B = featureToggleInteractor;
        this.C = subscriptionRefundDataConsumptionInfoMapper;
        this.D = checkoutPlanChangeResolver;
        this.E = giftRecipientNameResolver;
        this.F = new vii.b();
        this.G = mra.d.b(this, new b0(wp5.y.u(uuidUtils, "toString(...)"), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), true, null), stateMapper, new b1(), false, 8);
        this.H = e.a(this, new n8i.e(this, 29));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof njj.a1
            if (r0 == 0) goto L13
            r0 = r5
            njj.a1 r0 = (njj.a1) r0
            int r1 = r0.f216540w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f216540w = r1
            goto L18
        L13:
            njj.a1 r0 = new njj.a1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f216540w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L4e
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            dfj.s3 r4 = r4.A     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L4e
            r0.f216540w = r3     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L4e
            java.lang.Object r4 = r4.d(r0)     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L4e
            if (r4 != r1) goto L3d
            return r1
        L3d:
            kotlin.Unit r4 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L40 java.util.concurrent.CancellationException -> L4e
            goto L4b
        L40:
            r4 = move-exception
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r4, r5)
        L4b:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L4e:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a.I2(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        String strN;
        Continuation continuation = null;
        o0 o0Var = new o0(3, this, continuation);
        vii.b bVar = this.F;
        l.a1(this, new amh.w(q.Q(bVar, o0Var), 18), null, null, new t0(5, this, continuation), 3);
        l.a1(this, q.Q(bVar, new o0(1, this, continuation)), null, null, new w0(this, null), 3);
        l.a1(this, q.Q(bVar, new o0(0, this, continuation)), null, null, new t0(0, this, continuation), 3);
        l.a1(this, q.Q(bVar, new o0(2, this, continuation)), null, null, new t0(2, this, continuation), 3);
        l.a1(this, this.f101178y.d3(), null, null, new n0(this, null), 3);
        l.a1(this, this.f101177x.Z2(), null, null, new t0(3, this, continuation), 3);
        EsimMobilePlanCheckoutScreenContract$InputData esimMobilePlanCheckoutScreenContract$InputData = this.f101171p;
        List listC = u.c(esimMobilePlanCheckoutScreenContract$InputData.getF101150a());
        if (!(esimMobilePlanCheckoutScreenContract$InputData instanceof EsimMobilePlanCheckoutScreenContract$InputData.PurchaseNewPlan)) {
            esimMobilePlanCheckoutScreenContract$InputData = null;
        }
        EsimMobilePlanCheckoutScreenContract$InputData.PurchaseNewPlan purchaseNewPlan = (EsimMobilePlanCheckoutScreenContract$InputData.PurchaseNewPlan) esimMobilePlanCheckoutScreenContract$InputData;
        EsimGiftRecipient esimGiftRecipient = purchaseNewPlan != null ? purchaseNewPlan.d : null;
        if (esimGiftRecipient != null) {
            this.E.getClass();
            strN = ugc.a.n(esimGiftRecipient);
        } else {
            strN = null;
        }
        l.a1(this, this.f101173r.d(listC, strN, w4l.h.f294642c), null, null, new t0(4, this, continuation), 3);
        l.a1(this, q.Q(bVar, new o0(4, this, continuation)), null, null, new z0(this, null), 3);
    }

    public final j1 J2() {
        dej.a aVar;
        EsimMobilePlanPointsOptions esimMobilePlanPointsOptions;
        Object next;
        y yVar = this.G;
        b0 b0Var = (b0) ((j2) yVar.f22677a).getValue();
        if ((b0Var.f216546g.getContent() instanceof m1c.y) && b0Var.f216547h && (aVar = (dej.a) ((b0) ((j2) yVar.f22677a).getValue()).e.getContent()) != null && (esimMobilePlanPointsOptions = aVar.i.f100421c) != null) {
            Iterator it8 = esimMobilePlanPointsOptions.f100309c.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (((EsimMobilePlanPointsOption) next).d) {
                    break;
                }
            }
            EsimMobilePlanPointsOption esimMobilePlanPointsOption = (EsimMobilePlanPointsOption) next;
            if (esimMobilePlanPointsOption != null) {
                return new j1(esimMobilePlanPointsOptions.f100307a, esimMobilePlanPointsOptions.f100308b, esimMobilePlanPointsOption);
            }
        }
        return null;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.H;
    }

    public final void K2(EsimProfile esimProfile) {
        if (((jte.d) this.B).c(EsimApi$Toggles.EsimMobilePlanFlexibleStart.f100177c)) {
            h.v2(this.H, new EsimMobilePlanCheckoutScreenContract$ModalStep.EsimInstallation(esimProfile), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        String str = esimProfile.f100423a;
        EsimProfileDetails esimProfileDetails = esimProfile.f100426g;
        this.f101177x.b3(str, esimProfileDetails != null ? esimProfileDetails.a() : null);
    }

    public final void L2(EsimDynamicTermsMapper$TermsClickData termsClickData) {
        Intrinsics.checkNotNullParameter(termsClickData, "termsClickData");
        if (termsClickData instanceof EsimDynamicTermsMapper$TermsClickData.ActionParcel) {
            return;
        }
        if (!(termsClickData instanceof EsimDynamicTermsMapper$TermsClickData.DownloadContractSummaryParcel)) {
            if (!(termsClickData instanceof EsimDynamicTermsMapper$TermsClickData.UrlParcel)) {
                throw new NoWhenBranchMatchedException();
            }
            A1(new n0(this, ((EsimDynamicTermsMapper$TermsClickData.UrlParcel) termsClickData).f100945b, null, 0), new yi5.b(25));
            return;
        }
        EsimDynamicTermsMapper$TermsClickData.DownloadContractSummaryParcel downloadContractSummaryParcel = (EsimDynamicTermsMapper$TermsClickData.DownloadContractSummaryParcel) termsClickData;
        A1(new m0(this, downloadContractSummaryParcel.f100941a, downloadContractSummaryParcel.f100942b, downloadContractSummaryParcel.d, downloadContractSummaryParcel.f100943c, downloadContractSummaryParcel.e, null), new yi5.b(25));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.G;
    }
}
