package vkm;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes14.dex */
public final class s0 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f290116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f290117c;

    public /* synthetic */ s0(Object obj2, Object obj3, int i) {
        this.f290115a = i;
        this.f290116b = obj2;
        this.f290117c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof xfb.l
            if (r0 == 0) goto L13
            r0 = r12
            xfb.l r0 = (xfb.l) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            xfb.l r0 = new xfb.l
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L88
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r12)
            java.lang.Object r12 = r10.f290116b
            kotlinx.coroutines.flow.FlowCollector r12 = (kotlinx.coroutines.flow.FlowCollector) r12
            com.revolut.data.model.Data r11 = (com.revolut.data.model.Data) r11
            java.lang.Object r11 = r11.getContent()
            xfb.o r11 = (xfb.o) r11
            r2 = 0
            if (r11 == 0) goto L7a
            java.lang.Object r4 = r10.f290117c
            rfb.e r4 = (rfb.e) r4
            boolean r5 = r11.f305224b
            do3.g r6 = r11.f305223a
            if (r5 == 0) goto L5b
            boolean r5 = v04.b.i(r6)
            if (r5 == 0) goto L59
            rfb.d r5 = rfb.d.f253751a
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r5)
            if (r4 == 0) goto L60
        L59:
            r2 = r3
            goto L60
        L5b:
            boolean r2 = v04.b.i(r6)
            r2 = r2 ^ r3
        L60:
            if (r2 == 0) goto L72
            boolean r11 = r11.f305225c
            if (r11 == 0) goto L72
            com.revolut.feature.referrals.shared.ui.api.navigation.ReferralsBizFeatureConfig$InviteCampaignHomeNavigationDestination r4 = new com.revolut.feature.referrals.shared.ui.api.navigation.ReferralsBizFeatureConfig$InviteCampaignHomeNavigationDestination
            pwa.n r8 = pwa.n.SALARY
            r9 = 7
            r5 = 0
            r6 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            goto L74
        L72:
            com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$SalaryHub r4 = com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$SalaryHub.f82951a
        L74:
            rfb.a r11 = new rfb.a
            r11.<init>(r2, r4)
            goto L7f
        L7a:
            rfb.a r11 = new rfb.a
            r11.<init>(r2)
        L7f:
            r0.v = r3
            java.lang.Object r11 = r12.emit(r11, r0)
            if (r11 != r1) goto L88
            return r1
        L88:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.s0.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r23, kotlin.coroutines.Continuation r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r1 instanceof xk6.a
            if (r2 == 0) goto L17
            r2 = r1
            xk6.a r2 = (xk6.a) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.v = r3
            goto L1c
        L17:
            xk6.a r2 = new xk6.a
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.v
            r5 = 1
            if (r4 == 0) goto L34
            if (r4 != r5) goto L2c
            yhm.o.b(r1)
            goto Lc2
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            yhm.o.b(r1)
            java.lang.Object r1 = r0.f290116b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            r4 = r23
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L4a:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto Lb9
            java.lang.Object r7 = r4.next()
            r9 = r7
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction r9 = (com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction) r9
            java.lang.Object r7 = r0.f290117c
            xk6.b r7 = (xk6.b) r7
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails$Pse r8 = uk6.a.a(r9)
            r10 = 0
            if (r8 != 0) goto L63
            goto Lb3
        L63:
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails$Creditor r11 = r8.e
            t12.c r7 = r7.f306612c
            b12.a r12 = new b12.a
            com.revolut.core.ui_kit_core.displayers.image.Image r13 = rak.a.a(r11)
            com.revolut.core.ui_kit.models.TextClause r14 = new com.revolut.core.ui_kit.models.TextClause
            java.lang.String r15 = r11.f62030a
            r20 = 0
            r21 = 126(0x7e, float:1.77E-43)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r11 = r12
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails$Pse$ExecutionType r8 = r8.f
            boolean r15 = r8 instanceof com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Pse.ExecutionType.Otp
            if (r15 == 0) goto L8c
            int r8 = com.revolut.feature.external_accounts.impl.R$string.apm_payment_confirmation_pending_action_review_authorisation_with_otp
            goto La1
        L8c:
            boolean r15 = r8 instanceof com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Pse.ExecutionType.OneTime
            if (r15 != 0) goto L9f
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails$Pse$ExecutionType$Unknown r15 = com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Pse.ExecutionType.Unknown.f62067a
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r15)
            if (r8 == 0) goto L99
            goto L9f
        L99:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L9f:
            int r8 = com.revolut.feature.external_accounts.impl.R$string.apm_payment_confirmation_pending_action_review
        La1:
            r15 = 14
            r12.<init>(r8, r10, r10, r15)
            r10 = r13
            r13 = 0
            r8 = r11
            r11 = r14
            r14 = 16
            r8.<init>(r9, r10, r11, r12, r13, r14)
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$Model r10 = r7.a(r8)
        Lb3:
            if (r10 == 0) goto L4a
            r6.add(r10)
            goto L4a
        Lb9:
            r2.v = r5
            java.lang.Object r1 = r1.emit(r6, r2)
            if (r1 != r3) goto Lc2
            return r3
        Lc2:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.s0.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r34, kotlin.coroutines.Continuation r35) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.s0.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r29, kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.s0.d(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r30, kotlin.coroutines.Continuation r31) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.s0.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008a A[PHI: r7
      0x008a: PHI (r7v9 java.lang.String) = (r7v5 java.lang.String), (r7v11 java.lang.String) binds: [B:26:0x0087, B:21:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r27, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.s0.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof xkf.r1
            if (r0 == 0) goto L13
            r0 = r7
            xkf.r1 r0 = (xkf.r1) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            xkf.r1 r0 = new xkf.r1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L6a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.lang.Object r7 = r5.f290116b
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r2 = r5.f290117c
            kgm.i r2 = (kgm.i) r2
            java.lang.String r4 = "issues"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L4c
            rnf.d r6 = rnf.d.OpenTroubleshooting
            goto L61
        L4c:
            java.lang.Object r6 = r2.f184023b
            uig.a r6 = (uig.a) r6
            gte.a r6 = r6.f280439a
            com.revolut.feature.transaction.troubleshooter.api.deps.TransactionTroubleshooterApi$Toggles$TransactionTroubleshooterImprovementDefinition r2 = com.revolut.feature.transaction.troubleshooter.api.deps.TransactionTroubleshooterApi$Toggles$TransactionTroubleshooterImprovementDefinition.f91839c
            jte.d r6 = (jte.d) r6
            boolean r6 = r6.c(r2)
            if (r6 == 0) goto L5f
            rnf.d r6 = rnf.d.ShowThisTransactionPopUp
            goto L61
        L5f:
            rnf.d r6 = rnf.d.OpenHelpCentreMain
        L61:
            r0.v = r3
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L6a
            return r1
        L6a:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.s0.g(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:576:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:582:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r8v27, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r36, kotlin.coroutines.Continuation r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.s0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public s0(FlowCollector flowCollector, xfb.m mVar, rfb.e eVar) {
        this.f290115a = 21;
        this.f290116b = flowCollector;
        this.f290117c = eVar;
    }
}
