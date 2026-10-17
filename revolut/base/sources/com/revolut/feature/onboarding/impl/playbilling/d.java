package com.revolut.feature.onboarding.impl.playbilling;

import com.android.billingclient.api.BillingClientStateListener;
import com.revolut.feature.onboarding.impl.playbilling.OnboardingPlayBillingFailure;
import java.util.concurrent.CopyOnWriteArrayList;
import skm.l;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements BillingClientStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f78524a;

    public d(l lVar) {
        this.f78524a = lVar;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
        OnboardingPlayBillingFailure.ServiceDisconnected serviceDisconnected = new OnboardingPlayBillingFailure.ServiceDisconnected();
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, serviceDisconnected, h0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    @Override // com.android.billingclient.api.BillingClientStateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBillingSetupFinished(com.android.billingclient.api.BillingResult r5) {
        /*
            r4 = this;
            java.lang.String r0 = "billingResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            skm.l r0 = r4.f78524a
            boolean r1 = r0.d()
            if (r1 == 0) goto L4f
            int r1 = r5.getResponseCode()
            if (r1 != 0) goto L20
            yhm.m$a r5 = yhm.m.INSTANCE
            kotlin.Unit r5 = kotlin.Unit.f186387a
            yhm.m r1 = new yhm.m
            r1.<init>(r5)
            r0.resumeWith(r1)
            return
        L20:
            com.revolut.feature.onboarding.impl.playbilling.OnboardingPlayBillingFailure$BillingSetupError r1 = new com.revolut.feature.onboarding.impl.playbilling.OnboardingPlayBillingFailure$BillingSetupError
            int r2 = r5.getResponseCode()
            java.lang.String r5 = r5.getDebugMessage()
            if (r5 == 0) goto L36
            boolean r3 = kotlin.text.d0.W(r5)
            if (r3 != 0) goto L33
            goto L34
        L33:
            r5 = 0
        L34:
            if (r5 != 0) goto L3e
        L36:
            java.lang.String r5 = "Billing setup failed (responseCode="
            java.lang.String r3 = ")"
            java.lang.String r5 = j6.a.l(r2, r5, r3)
        L3e:
            r1.<init>(r5)
            yhm.m$a r5 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r1)
            yhm.m r1 = new yhm.m
            r1.<init>(r5)
            r0.resumeWith(r1)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.playbilling.d.onBillingSetupFinished(com.android.billingclient.api.BillingResult):void");
    }
}
