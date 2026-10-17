package com.revolut.feature.apm.wero.impl.ui.pay;

import ang.f;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.apm.core.models.payments_authorisations.ui.ApmPaymentAuthorisationUi;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod;
import com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmPaymentAuthorisationNavigation$InputData;
import com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$Step;
import com.revolut.retail.feature.pending_payments.api.PendingPaymentsToggles$Wero;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$InputData;
import ghl.c;
import gi2.e;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import tak.d;
import yki.i;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements gi2.b {

    @NotNull
    public static final e Companion = new e();
    public final WeroPayFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ki2.b f63092p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ni2.a f63093q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final oh2.a f63094r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f63095s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final kz9.a f63096t;
    public final f12.a u;
    public final d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final gte.a f63097w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i f63098x;

    public b(WeroPayFlowContract$InputData inputData, ki2.b weroPayInteractor, ni2.a weroRequestLinkMapper, oh2.a errorHandlerExtension, f userInteractor, kz9.a chatNavigationProvider, f12.a paymentAuthorisationExtension, d pendingPaymentExtension, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(weroPayInteractor, "weroPayInteractor");
        Intrinsics.checkNotNullParameter(weroRequestLinkMapper, "weroRequestLinkMapper");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(chatNavigationProvider, "chatNavigationProvider");
        Intrinsics.checkNotNullParameter(paymentAuthorisationExtension, "paymentAuthorisationExtension");
        Intrinsics.checkNotNullParameter(pendingPaymentExtension, "pendingPaymentExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f63092p = weroPayInteractor;
        this.f63093q = weroRequestLinkMapper;
        this.f63094r = errorHandlerExtension;
        this.f63095s = userInteractor;
        this.f63096t = chatNavigationProvider;
        this.u = paymentAuthorisationExtension;
        this.v = pendingPaymentExtension;
        this.f63097w = featureToggleInteractor;
        this.f63098x = d8l.d.a(this, new c(this, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.apm.wero.impl.ui.pay.b r25, java.lang.String r26, gim.c r27) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.wero.impl.ui.pay.b.I2(com.revolut.feature.apm.wero.impl.ui.pay.b, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.apm.wero.impl.ui.pay.b r28, g12.r r29, gim.c r30) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.wero.impl.ui.pay.b.J2(com.revolut.feature.apm.wero.impl.ui.pay.b, g12.r, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.feature.apm.wero.impl.ui.pay.b r23, gim.c r24) {
        /*
            r0 = r23
            r1 = r24
            boolean r2 = r1 instanceof gi2.h
            if (r2 == 0) goto L17
            r2 = r1
            gi2.h r2 = (gi2.h) r2
            int r3 = r2.f144067w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f144067w = r3
            goto L1c
        L17:
            gi2.h r2 = new gi2.h
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f144067w
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            yhm.o.b(r1)
            goto L41
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L33:
            yhm.o.b(r1)
            ki2.b r0 = r0.f63092p
            r2.f144067w = r5
            java.lang.Object r1 = r0.a(r2)
            if (r1 != r3) goto L41
            return r3
        L41:
            jh2.q r1 = (jh2.q) r1
            java.lang.String r3 = r1.f174137a
            com.revolut.feature.apm.core.ui.api.navigation.qr.QrData r0 = new com.revolut.feature.apm.core.ui.api.navigation.qr.QrData
            g12.a r1 = g12.a.QR_CODE
            int r2 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_wero
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r2)
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.apm.wero.api.R$string.wero_qr_details_hint
            r12 = 0
            r13 = 14
            r11.<init>(r2, r12, r12, r13)
            com.revolut.core.ui_kit.models.TextClause r2 = new com.revolut.core.ui_kit.models.TextClause
            r8 = 0
            r9 = 126(0x7e, float:1.77E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r6 = r10
            com.revolut.feature.apm.core.ui.api.navigation.qr.QrData$Button r10 = new com.revolut.feature.apm.core.ui.api.navigation.qr.QrData$Button
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r14 = new com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage
            int r15 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_share
            r21 = 0
            r22 = 254(0xfe, float:3.56E-43)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.feature.apm.wero.api.R$string.wero_qr_details_share
            r4.<init>(r5, r12, r12, r13)
            r10.<init>(r4, r14)
            r8 = r11
            com.revolut.feature.apm.core.ui.api.navigation.qr.QrData$Button r11 = new com.revolut.feature.apm.core.ui.api.navigation.qr.QrData$Button
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r14 = new com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage
            int r15 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_pencil
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.feature.apm.wero.api.R$string.wero_qr_details_action_create
            r4.<init>(r5, r12, r12, r13)
            r11.<init>(r4, r14)
            r4 = r3
            java.lang.String r3 = "WERO_QR_SHOW_CODE_ID"
            r5 = r1
            r9 = r2
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.revolut.feature.apm.core.ui.api.navigation.qr.QrDetailsInputData r0 = new com.revolut.feature.apm.core.ui.api.navigation.qr.QrDetailsInputData
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.apm.wero.api.R$string.wero_qr_link_title
            r1.<init>(r3, r12, r12, r13)
            r0.<init>(r1, r2)
            com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$Step$ShowUserCode r1 = new com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$Step$ShowUserCode
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.wero.impl.ui.pay.b.K2(com.revolut.feature.apm.wero.impl.ui.pay.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        if (r8.N2((com.revolut.feature.apm.wero.impl.data.models.WeroQrScanDetails.Pay) r10, r1) == r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (kotlin.Unit.f186387a == r2) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L2(com.revolut.feature.apm.wero.impl.ui.pay.b r8, java.lang.String r9, gim.c r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.wero.impl.ui.pay.b.L2(com.revolut.feature.apm.wero.impl.ui.pay.b, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    public final WeroPayFlowContract$Step M2(ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary) {
        if (((jte.d) this.f63097w).c(PendingPaymentsToggles$Wero.f102396c)) {
            return new WeroPayFlowContract$Step.PendingPayment(new PendingPaymentContract$InputData.Apm(apmPaymentAuthorisationSummary, true));
        }
        PaymentMethodDetails paymentMethodDetails = apmPaymentAuthorisationSummary.f61995g;
        Intrinsics.i(paymentMethodDetails, "null cannot be cast to non-null type com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Wero");
        PaymentMethodDetails.Wero wero = (PaymentMethodDetails.Wero) paymentMethodDetails;
        LocalDateTime localDateTime = apmPaymentAuthorisationSummary.f61997j;
        LocalDateTime localDateTime2 = apmPaymentAuthorisationSummary.f61999m;
        return new WeroPayFlowContract$Step.ConfirmPayment(new ApmPaymentAuthorisationNavigation$InputData(ApmWero.f61829c, ApmPaymentMethod.WERO.f62179a, new ApmPaymentAuthorisationPendingAction.Mandate(apmPaymentAuthorisationSummary), new ApmPaymentAuthorisationUi((localDateTime == null || localDateTime2 == null) ? null : new ApmPaymentAuthorisationUi.TimerInfo(oi0.d.R(localDateTime2) - oi0.d.R(localDateTime), oi0.d.R(localDateTime2)), new ApmPaymentAuthorisationUi.MerchantInfo(wero.f62072a.f62030a, wero.f62074c, wero.f62073b, LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_card, R$attr.uikit_colorOnAccent, R$attr.uikit_colorAccent), oi0.d.R(localDateTime)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N2(com.revolut.feature.apm.wero.impl.data.models.WeroQrScanDetails.Pay r26, gim.c r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            boolean r3 = r2 instanceof gi2.j
            if (r3 == 0) goto L19
            r3 = r2
            gi2.j r3 = (gi2.j) r3
            int r4 = r3.f144072y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f144072y = r4
            goto L1e
        L19:
            gi2.j r3 = new gi2.j
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f144070w
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f144072y
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L3a
            if (r5 != r7) goto L32
            yki.i r1 = r3.v
            com.revolut.feature.apm.wero.impl.ui.pay.b r3 = r3.u
            yhm.o.b(r2)
            goto L94
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            yhm.o.b(r2)
            r3.u = r0
            yki.i r2 = r0.f63098x
            r3.v = r2
            r3.f144072y = r7
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection$Outgoing r9 = new com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection$Outgoing
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient$Outgoing r3 = r1.f63042a
            com.revolut.feature.apm.wero.impl.data.models.WeroQrScanParams r5 = r1.f63044c
            dj0.d r8 = r5.f63046a
            if (r8 != 0) goto L51
            r8 = r7
            goto L52
        L51:
            r8 = 0
        L52:
            r9.<init>(r3, r8, r7)
            com.revolut.feature.transfer.core.models.TransferMoneyPocket r13 = new com.revolut.feature.transfer.core.models.TransferMoneyPocket
            dj0.d r3 = r5.f63046a
            r5 = 2
            r13.<init>(r3, r6, r5)
            com.revolut.core.ui_kit.models.TextLocalisedClause r10 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.apm.wero.api.R$string.apm_descriptor_transfer_wero_amount_title
            r5 = 14
            r10.<init>(r3, r6, r6, r5)
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.apm.wero.api.R$string.apm_descriptor_transfer_wero_review_title
            r11.<init>(r3, r6, r6, r5)
            com.revolut.feature.apm.wero.impl.common.ApmTransferDestinationWero r12 = r1.f63043b
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData r8 = new com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData
            r23 = 0
            r24 = 30688(0x77e0, float:4.3003E-41)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 1
            r21 = 0
            r22 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$Step$Transfer r1 = new com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$Step$Transfer
            r1.<init>(r8)
            if (r1 != r4) goto L90
            return r4
        L90:
            r3 = r2
            r2 = r1
            r1 = r3
            r3 = r0
        L94:
            com.revolut.kompot.navigable.flow.FlowStep r2 = (com.revolut.kompot.navigable.flow.FlowStep) r2
            r4 = 6
            oki.h.u2(r3, r1, r2, r6, r4)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.wero.impl.ui.pay.b.N2(com.revolut.feature.apm.wero.impl.data.models.WeroQrScanDetails$Pay, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (((oh2.b) this.f63094r).Z2(throwable, new g8i.h(this, 7))) {
            return true;
        }
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return false;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f63098x;
    }
}
