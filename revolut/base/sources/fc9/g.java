package fc9;

import com.android.billingclient.api.BillingClient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingClient f133664a;

    public g(BillingClient billingClient) {
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        this.f133664a = billingClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof fc9.f
            if (r0 == 0) goto L13
            r0 = r6
            fc9.f r0 = (fc9.f) r0
            int r1 = r0.f133663w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f133663w = r1
            goto L18
        L13:
            fc9.f r0 = new fc9.f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f133663w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L65
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            r0.f133663w = r3
            skm.l r6 = new skm.l
            kotlin.coroutines.Continuation r2 = fim.h.b(r0)
            r6.<init>(r3, r2)
            r6.u()
            com.android.billingclient.api.GetBillingConfigParams$Builder r2 = com.android.billingclient.api.GetBillingConfigParams.newBuilder()
            com.android.billingclient.api.GetBillingConfigParams r2 = r2.build()
            java.lang.String r3 = "build(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            com.revolut.feature.onboarding.impl.playbilling.c r3 = new com.revolut.feature.onboarding.impl.playbilling.c
            r3.<init>(r6)
            com.android.billingclient.api.BillingClient r4 = r5.f133664a
            r4.getBillingConfigAsync(r2, r3)
            java.lang.Object r6 = r6.t()
            if (r6 != r1) goto L62
            java.lang.String r2 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
        L62:
            if (r6 != r1) goto L65
            return r1
        L65:
            yhm.m r6 = (yhm.m) r6
            java.lang.Object r6 = r6.f314193a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fc9.g.a(gim.c):java.lang.Object");
    }
}
