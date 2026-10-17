package com.revolut.feature.onboarding.impl.playbilling;

import com.android.billingclient.api.BillingConfigResponseListener;
import skm.l;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements BillingConfigResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f78523a;

    public c(l lVar) {
        this.f78523a = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // com.android.billingclient.api.BillingConfigResponseListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBillingConfigResponse(com.android.billingclient.api.BillingResult r4, com.android.billingclient.api.BillingConfig r5) {
        /*
            r3 = this;
            java.lang.String r0 = "billingResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            skm.l r0 = r3.f78523a
            boolean r1 = r0.d()
            if (r1 == 0) goto L4d
            int r1 = r4.getResponseCode()
            if (r1 != 0) goto L1e
            if (r5 == 0) goto L1e
            yhm.m r4 = new yhm.m
            r4.<init>(r5)
            r0.resumeWith(r4)
            return
        L1e:
            com.revolut.feature.onboarding.impl.playbilling.OnboardingPlayBillingFailure$BillingConfigError r5 = new com.revolut.feature.onboarding.impl.playbilling.OnboardingPlayBillingFailure$BillingConfigError
            int r1 = r4.getResponseCode()
            java.lang.String r4 = r4.getDebugMessage()
            if (r4 == 0) goto L34
            boolean r2 = kotlin.text.d0.W(r4)
            if (r2 != 0) goto L31
            goto L32
        L31:
            r4 = 0
        L32:
            if (r4 != 0) goto L3c
        L34:
            java.lang.String r4 = "getBillingConfig failed (responseCode="
            java.lang.String r2 = ")"
            java.lang.String r4 = j6.a.l(r1, r4, r2)
        L3c:
            r5.<init>(r4)
            yhm.m$a r4 = yhm.m.INSTANCE
            yhm.n r4 = yhm.o.a(r5)
            yhm.m r5 = new yhm.m
            r5.<init>(r4)
            r0.resumeWith(r5)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.playbilling.c.onBillingConfigResponse(com.android.billingclient.api.BillingResult, com.android.billingclient.api.BillingConfig):void");
    }
}
