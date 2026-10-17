package sh2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends yji.n implements f12.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final oz1.j f263398l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final nh2.e f263399m;

    public f(oz1.j interactor, nh2.e weroKeyProvider) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(weroKeyProvider, "weroKeyProvider");
        this.f263398l = interactor;
        this.f263399m = weroKeyProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        if (r5.f263398l.a(r2, r6, r4, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction r6, com.revolut.feature.transfer.core.models.FundingSource r7, gim.c r8) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        /*
            r5 = this;
            boolean r0 = r8 instanceof sh2.e
            if (r0 == 0) goto L13
            r0 = r8
            sh2.e r0 = (sh2.e) r0
            int r1 = r0.f263397y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f263397y = r1
            goto L18
        L13:
            sh2.e r0 = new sh2.e
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f263395w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f263397y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L7a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction r6 = r0.v
            com.revolut.feature.transfer.core.models.FundingSource r7 = r0.u
            yhm.o.b(r8)
            goto L5d
        L3a:
            yhm.o.b(r8)
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary r8 = r6.getF61991a()
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails r8 = r8.f61995g
            java.lang.String r2 = "null cannot be cast to non-null type com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Wero"
            kotlin.jvm.internal.Intrinsics.i(r8, r2)
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails$Wero r8 = (com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Wero) r8
            java.lang.String r8 = r8.e
            r0.u = r7
            r0.v = r6
            r0.f263397y = r4
            nh2.e r2 = r5.f263399m
            com.revolut.feature.apm.core.impl.crypto.d r2 = r2.f215297b
            java.lang.Object r8 = r2.a(r8, r0)
            if (r8 != r1) goto L5d
            goto L79
        L5d:
            java.lang.String r8 = (java.lang.String) r8
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod r2 = com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod.WERO
            j02.e r4 = new j02.e
            com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource r7 = oc.c.u(r7)
            r4.<init>(r7, r8)
            r7 = 0
            r0.u = r7
            r0.v = r7
            r0.f263397y = r3
            oz1.j r7 = r5.f263398l
            java.lang.Object r6 = r7.a(r2, r6, r4, r0)
            if (r6 != r1) goto L7a
        L79:
            return r1
        L7a:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sh2.f.Z2(com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction, com.revolut.feature.transfer.core.models.FundingSource, gim.c):java.lang.Object");
    }
}
