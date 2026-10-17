package i9e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f159775a;

    public z(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f159775a = featureToggleInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        if ((r6 != null ? r6.e : null) == io3.l.MERCHANT) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.feature.subscriptions.impl.subscriptiondetails.models.SubscriptionPaymentFromParcelData.EditPaymentSourceInfo a(qua.p r5, io3.d r6, com.revolut.core.model.account.AccountId r7) {
        /*
            r4 = this;
            java.lang.String r0 = "recurringPayment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.revolut.feature.subscriptions.api.SubscriptionsApi$Toggles$DirectDebitAutoFX r0 = com.revolut.feature.subscriptions.api.SubscriptionsApi$Toggles.DirectDebitAutoFX.f89130c
            gte.a r1 = r4.f159775a
            jte.d r1 = (jte.d) r1
            boolean r0 = r1.c(r0)
            r1 = 0
            if (r0 == 0) goto L6c
            if (r7 == 0) goto L6c
            ibd.e r0 = r5.f249314a
            java.lang.String r2 = r5.W
            ibd.h r0 = r0.f160152c
            ibd.h r3 = ibd.h.EXTERNAL_MANDATE
            if (r0 != r3) goto L6c
            boolean r0 = qua.u.x(r5)
            if (r0 != 0) goto L6c
            if (r6 == 0) goto L2f
            java.lang.String r0 = r6.f163145a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r2)
            if (r0 == 0) goto L2f
            goto L30
        L2f:
            r6 = r1
        L30:
            if (r2 == 0) goto L50
            if (r6 == 0) goto L37
            io3.l r0 = r6.e
            goto L38
        L37:
            r0 = r1
        L38:
            io3.l r2 = io3.l.CURRENT
            if (r0 == r2) goto L50
            if (r6 == 0) goto L41
            io3.l r0 = r6.e
            goto L42
        L41:
            r0 = r1
        L42:
            io3.l r2 = io3.l.SAVINGS
            if (r0 == r2) goto L50
            if (r6 == 0) goto L4b
            io3.l r0 = r6.e
            goto L4c
        L4b:
            r0 = r1
        L4c:
            io3.l r2 = io3.l.MERCHANT
            if (r0 != r2) goto L6c
        L50:
            com.revolut.feature.subscriptions.impl.subscriptiondetails.models.SubscriptionPaymentFromParcelData$EditPaymentSourceInfo r0 = new com.revolut.feature.subscriptions.impl.subscriptiondetails.models.SubscriptionPaymentFromParcelData$EditPaymentSourceInfo
            if (r6 == 0) goto L56
            java.lang.String r1 = r6.f163145a
        L56:
            ibd.e r6 = r5.f249314a
            java.lang.String r6 = r6.f160150a
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            qua.j r5 = r5.X
            qua.j r2 = qua.j.PRO
            if (r5 != r2) goto L67
            r5 = 1
            goto L68
        L67:
            r5 = 0
        L68:
            r0.<init>(r7, r1, r6, r5)
            return r0
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i9e.z.a(qua.p, io3.d, com.revolut.core.model.account.AccountId):com.revolut.feature.subscriptions.impl.subscriptiondetails.models.SubscriptionPaymentFromParcelData$EditPaymentSourceInfo");
    }
}
