package akf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f5882l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f5883m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gte.a f5884n;
    public final kl.t1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mjf.d f5885p;

    public q(klf.h0 commonDataSource, klf.m1 juniorDataSource, gte.a featureToggleInteractor, kl.t1 cardsFeatureAvailabilityChecker, mjf.d atmTransactionLimitsBottomSheetIdProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cardsFeatureAvailabilityChecker, "cardsFeatureAvailabilityChecker");
        Intrinsics.checkNotNullParameter(atmTransactionLimitsBottomSheetIdProvider, "atmTransactionLimitsBottomSheetIdProvider");
        this.f5882l = commonDataSource;
        this.f5883m = juniorDataSource;
        this.f5884n = featureToggleInteractor;
        this.o = cardsFeatureAvailabilityChecker;
        this.f5885p = atmTransactionLimitsBottomSheetIdProvider;
    }

    public final cmf.f Z2() {
        return new cmf.f(new t38.e(this.f5882l.h(new aik.d(13)), 24, new a35.d(this.f5883m.a(), 8), new m(3, 4, q.class, this, "buildAction", "buildAction(Lcom/revolut/feature/transactions/models/TransactionType;Z)Ljava/util/List;")), zhm.u.c(this), "AtmLimits");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        if (c3(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof akf.n
            if (r0 == 0) goto L13
            r0 = r11
            akf.n r0 = (akf.n) r0
            int r1 = r0.f5866w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5866w = r1
            goto L18
        L13:
            akf.n r0 = new akf.n
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f5866w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r11)
            goto L8d
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L32:
            yhm.o.b(r11)
            goto L6a
        L36:
            yhm.o.b(r11)
            kl.t1 r11 = r10.o
            java.lang.Object r11 = r11.f185240b
            l61.a r11 = (l61.a) r11
            ang.b r11 = (ang.b) r11
            efm.d0 r11 = r11.a()
            mjf.r r2 = mjf.r.f
            kx7.o0 r2 = new kx7.o0
            r5 = 11
            r2.<init>(r5)
            r11.getClass()
            ufm.i r5 = new ufm.i
            r5.<init>(r11, r2, r4)
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            pfm.z r11 = r5.o(r11)
            java.lang.String r2 = "onErrorReturnItem(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            r0.f5866w = r4
            java.lang.Object r11 = nim.a.b(r11, r0)
            if (r11 != r1) goto L6a
            goto L8c
        L6a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L84
            com.revolut.feature.security_hub.api.navigation.SecurityHubDestination r4 = new com.revolut.feature.security_hub.api.navigation.SecurityHubDestination
            r8 = 1
            r9 = 16
            com.revolut.feature.security_hub.api.SecurityHubStartScreen$TransactionsLimits r5 = com.revolut.feature.security_hub.api.SecurityHubStartScreen.TransactionsLimits.f85391a
            r6 = 1
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r10.A2(r4)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L84:
            r0.f5866w = r3
            java.lang.Object r11 = r10.c3(r0)
            if (r11 != r1) goto L8d
        L8c:
            return r1
        L8d:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: akf.q.b3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r4, java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof akf.o
            if (r4 == 0) goto L13
            r4 = r6
            akf.o r4 = (akf.o) r4
            int r0 = r4.f5870w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f5870w = r0
            goto L1a
        L13:
            akf.o r4 = new akf.o
            gim.c r6 = (gim.c) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f5870w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            akf.u1 r6 = akf.v1.Companion
            akf.t1 r1 = akf.t1.ATM_LIMITS
            boolean r5 = a10.b.B(r6, r1, r5)
            if (r5 == 0) goto L47
            r4.f5870w = r2
            java.lang.Object r4 = r3.b3(r4)
            if (r4 != r0) goto L48
            return r0
        L47:
            r2 = 0
        L48:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: akf.q.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof akf.p
            if (r0 == 0) goto L13
            r0 = r6
            akf.p r0 = (akf.p) r0
            int r1 = r0.f5875w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5875w = r1
            goto L18
        L13:
            akf.p r0 = new akf.p
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f5875w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            mjf.d r6 = r5.f5885p
            ufm.i r6 = r6.a()
            r0.f5875w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.String r6 = (java.lang.String) r6
            com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig r0 = new com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig
            com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig$BottomSheetDestination r1 = new com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig$BottomSheetDestination
            com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetDescriptor$BottomSheet r2 = new com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetDescriptor$BottomSheet
            kotlin.jvm.internal.Intrinsics.h(r6)
            r3 = 6
            r4 = 0
            r2.<init>(r6, r4, r3)
            r1.<init>(r2)
            yhi.b r6 = yhi.b.BOTTOM_DIALOG
            r2 = 12
            r0.<init>(r1, r6, r4, r2)
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.c(r0)
            r5.A2(r6)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: akf.q.c3(gim.c):java.lang.Object");
    }
}
