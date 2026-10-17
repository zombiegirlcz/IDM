package akf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p0 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f5876l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f5877m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vz1.g f5878n;
    public final wlf.b o;

    public p0(klf.h0 commonDataSource, klf.m1 juniorDataSource, vz1.g apmPaymentsAuthorisationsRepository, wlf.b paymentAuthorisationUiMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(apmPaymentsAuthorisationsRepository, "apmPaymentsAuthorisationsRepository");
        Intrinsics.checkNotNullParameter(paymentAuthorisationUiMapper, "paymentAuthorisationUiMapper");
        this.f5876l = commonDataSource;
        this.f5877m = juniorDataSource;
        this.f5878n = apmPaymentsAuthorisationsRepository;
        this.o = paymentAuthorisationUiMapper;
    }

    public final cmf.f Z2() {
        return new cmf.f(vkm.q.Q(yh5.b.d(this.f5876l.d(), new a35.d(this.f5877m.a(), 13)), new a0e.m((Continuation) null, this, 19)), zhm.u.c(this), "DeactivatePaymentAuthorisation");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r21, java.lang.String r22, kotlin.coroutines.Continuation r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "CANCEL_SUBSCRIPTION"
            r3 = r22
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r3, r2)
            r3 = 0
            if (r2 == 0) goto Lb1
            boolean r2 = r1 instanceof com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary
            r4 = 0
            if (r2 == 0) goto L17
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary r1 = (com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary) r1
            goto L18
        L17:
            r1 = r4
        L18:
            if (r1 != 0) goto L1c
            goto Lb1
        L1c:
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails r2 = r1.f61995g
            wlf.b r5 = r0.o
            r5.getClass()
            java.lang.String r6 = "paymentMethodDetails"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
            boolean r6 = r2 instanceof com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.PayTo
            if (r6 == 0) goto L34
            r7 = r2
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails$PayTo r7 = (com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.PayTo) r7
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails$Creditor r7 = r7.f62044b
            java.lang.String r7 = r7.f62030a
            goto L3f
        L34:
            boolean r7 = r2 instanceof com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Pix
            if (r7 == 0) goto La1
            r7 = r2
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails$Pix r7 = (com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Pix) r7
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails$Creditor r7 = r7.f62057a
            java.lang.String r7 = r7.f62030a
        L3f:
            r8 = 12
            r9 = 14
            if (r6 == 0) goto L52
            com.revolut.core.ui_kit.models.TextLocalisedClause r10 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r11 = com.revolut.feature.apm.core.api.R$string.mandate_details_cancel_subscription_confirmation_payto_title
            java.util.List r12 = zhm.u.c(r7)
            r10.<init>(r11, r12, r4, r8)
        L50:
            r13 = r10
            goto L5e
        L52:
            boolean r10 = r2 instanceof com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Pix
            if (r10 == 0) goto La1
            com.revolut.core.ui_kit.models.TextLocalisedClause r10 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r11 = com.revolut.feature.subscriptionscommon.impl.R$string.recurring_payment_details_dialog_cancel_pix_mandate_title
            r10.<init>(r11, r4, r4, r9)
            goto L50
        L5e:
            if (r6 == 0) goto L6d
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r10 = com.revolut.feature.apm.core.api.R$string.mandate_details_cancel_subscription_confirmation_payto_subtitle
            java.util.List r7 = zhm.u.c(r7)
            r6.<init>(r10, r7, r4, r8)
        L6b:
            r14 = r6
            goto L79
        L6d:
            boolean r6 = r2 instanceof com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Pix
            if (r6 == 0) goto La1
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r7 = com.revolut.feature.subscriptionscommon.impl.R$string.recurring_payment_details_dialog_cancel_pix_mandate_subtitle
            r6.<init>(r7, r4, r4, r9)
            goto L6b
        L79:
            bmf.b r12 = r5.f298478a
            com.revolut.core.ui_kit.models.TextLocalisedClause r15 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            boolean r2 = r2 instanceof com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Pix
            if (r2 == 0) goto L84
            int r5 = com.revolut.feature.subscriptionscommon.impl.R$string.recurring_payment_details_dialog_cancel_pix_mandate_cta_button_positive
            goto L86
        L84:
            int r5 = com.revolut.feature.subscriptionscommon.impl.R$string.mandate_details_cancel_confirmation_action_confirm
        L86:
            r15.<init>(r5, r4, r4, r9)
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            if (r2 == 0) goto L90
            int r2 = com.revolut.feature.subscriptionscommon.impl.R$string.recurring_payment_details_dialog_cancel_pix_mandate_cta_button_negative
            goto L92
        L90:
            int r2 = com.revolut.feature.subscriptionscommon.impl.R$string.mandate_details_cancel_confirmation_action_decline
        L92:
            r5.<init>(r2, r4, r4, r9)
            r18 = 0
            r19 = 472(0x1d8, float:6.61E-43)
            r16 = 0
            r17 = r5
            com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController r4 = bmf.a.a(r12, r13, r14, r15, r16, r17, r18, r19)
        La1:
            if (r4 != 0) goto La4
            goto Lb1
        La4:
            acb.f r2 = new acb.f
            r3 = 24
            r2.<init>(r0, r1, r3)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r1 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            r0.N2(r4, r1, r2)
            r3 = 1
        Lb1:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: akf.p0.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
