package wh3;

import ei3.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends qh3.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q89.e f297391l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sh3.a f297392m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i f297393n;
    public final p o;

    public n(q89.e onboardingInteractor, sh3.a checkoutInteractor, i createCheckoutExtension, p processCheckoutOrderProvider) {
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(createCheckoutExtension, "createCheckoutExtension");
        Intrinsics.checkNotNullParameter(processCheckoutOrderProvider, "processCheckoutOrderProvider");
        this.f297391l = onboardingInteractor;
        this.f297392m = checkoutInteractor;
        this.f297393n = createCheckoutExtension;
        this.o = processCheckoutOrderProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // qh3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.checkout.models.CheckoutParams.CardOrder r11, com.revolut.retail.core.navigation.NaviCommand r12, com.revolut.analytics.tracking.v3.AnalyticsProduct r13, gim.c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof wh3.m
            if (r0 == 0) goto L13
            r0 = r14
            wh3.m r0 = (wh3.m) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            wh3.m r0 = new wh3.m
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f297389x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            com.revolut.analytics.tracking.v3.AnalyticsProduct r11 = r0.f297388w
            r13 = r11
            com.revolut.analytics.tracking.v3.AnalyticsProduct r13 = (com.revolut.analytics.tracking.v3.AnalyticsProduct) r13
            com.revolut.retail.core.navigation.NaviCommand r12 = r0.v
            com.revolut.feature.checkout.models.CheckoutParams$CardOrder r11 = r0.u
            yhm.o.b(r14)
            r3 = r11
            r5 = r12
            r4 = r13
            goto L79
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            yhm.o.b(r14)
            q89.e r14 = r10.f297391l
            db9.d r14 = (db9.d) r14
            boolean r14 = r14.c()
            r7 = r14 ^ 1
            sh3.a r14 = r10.f297392m
            r6 = r14
            ei3.m r6 = (ei3.m) r6
            r6.getClass()
            java.lang.String r14 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r14)
            ald.m r4 = new ald.m
            r9 = 11
            r8 = 0
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            kotlin.coroutines.g r11 = kotlin.coroutines.g.f186406a
            ufm.b r11 = te0.w.o0(r11, r4)
            r0.u = r5
            r0.v = r12
            r14 = r13
            com.revolut.analytics.tracking.v3.AnalyticsProduct r14 = (com.revolut.analytics.tracking.v3.AnalyticsProduct) r14
            r0.f297388w = r14
            r0.z = r3
            java.lang.Object r14 = nim.a.b(r11, r0)
            if (r14 != r1) goto L76
            return r1
        L76:
            r3 = r5
            r4 = r13
            r5 = r12
        L79:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r11 = r14.booleanValue()
            if (r11 != 0) goto L8a
            r6 = 0
            r7 = 44
            wh3.i r2 = r10.f297393n
            qh3.a.b3(r2, r3, r4, r5, r6, r7)
            goto L9a
        L8a:
            ei3.p r11 = r10.o
            r11.getClass()
            com.revolut.retail.core.navigation.FeatureCommand r11 = ei3.p.a(r3, r5, r4)
            com.revolut.kompot.bridge.navigation.BridgeDestination r11 = zh9.u0.b(r11)
            r10.A2(r11)
        L9a:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.n.Z2(com.revolut.feature.checkout.models.CheckoutParams$CardOrder, com.revolut.retail.core.navigation.NaviCommand, com.revolut.analytics.tracking.v3.AnalyticsProduct, gim.c):java.lang.Object");
    }
}
