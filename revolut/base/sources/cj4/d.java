package cj4;

import ffk.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f24601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vfk.c f24602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final sg4.a f24603n;

    public d(t pricingPlanInteractor, vfk.c planSelectBillingControllerModelExtension, sg4.a creditPricingPlanAnalyticsMetadataFactory) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(planSelectBillingControllerModelExtension, "planSelectBillingControllerModelExtension");
        Intrinsics.checkNotNullParameter(creditPricingPlanAnalyticsMetadataFactory, "creditPricingPlanAnalyticsMetadataFactory");
        this.f24601l = pricingPlanInteractor;
        this.f24602m = planSelectBillingControllerModelExtension;
        this.f24603n = creditPricingPlanAnalyticsMetadataFactory;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a9, code lost:
    
        if (r7.f24602m.Z2(r8, r3, r4, r5, r6) == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // cj4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(java.lang.String r8, jt3.a r9, com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r10, kotlin.jvm.functions.Function0 r11, gim.c r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof cj4.c
            if (r0 == 0) goto L14
            r0 = r12
            cj4.c r0 = (cj4.c) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            cj4.c r0 = new cj4.c
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f24599x
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.z
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L46
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            kotlin.jvm.functions.Function0 r8 = r6.f24598w
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            yhm.o.b(r12)
            goto Lac
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.jvm.functions.Function0 r8 = r6.f24598w
            r11 = r8
            kotlin.jvm.functions.Function0 r11 = (kotlin.jvm.functions.Function0) r11
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r10 = r6.v
            jt3.a r9 = r6.u
            yhm.o.b(r12)
            goto L61
        L46:
            yhm.o.b(r12)
            ffk.t r12 = r7.f24601l
            efm.d0 r8 = r12.f(r8)
            r6.u = r9
            r6.v = r10
            r12 = r11
            kotlin.jvm.functions.Function0 r12 = (kotlin.jvm.functions.Function0) r12
            r6.f24598w = r12
            r6.z = r3
            java.lang.Object r12 = nim.a.b(r8, r6)
            if (r12 != r0) goto L61
            goto Lab
        L61:
            od0.i r12 = (od0.i) r12
            java.lang.Object r8 = r12.c()
            hha.d r8 = (hha.d) r8
            int[] r12 = cj4.b.f24597a
            int r9 = r9.ordinal()
            r9 = r12[r9]
            r12 = 0
            if (r9 == r3) goto L83
            if (r9 != r2) goto L7d
            java.lang.String r9 = "CreditUpgradePlanControllerModelExtensionImpl.kt"
            java.lang.String r1 = "Unknown credit plan upgrade source"
            r3 = r12
            goto L86
        L7d:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L83:
            xfa.b r9 = xfa.b.CREDIT_CARD
            r3 = r9
        L86:
            if (r3 != 0) goto L8b
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L8b:
            sg4.a r9 = r7.f24603n
            r9.getClass()
            xfa.a r4 = sg4.a.a(r10)
            ac1.b r5 = new ac1.b
            r9 = 5
            r5.<init>(r9, r11)
            r6.u = r12
            r6.v = r12
            r6.f24598w = r12
            r6.z = r2
            vfk.c r1 = r7.f24602m
            r2 = r8
            java.lang.Object r8 = r1.Z2(r2, r3, r4, r5, r6)
            if (r8 != r0) goto Lac
        Lab:
            return r0
        Lac:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cj4.d.Z2(java.lang.String, jt3.a, com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration, kotlin.jvm.functions.Function0, gim.c):java.lang.Object");
    }
}
