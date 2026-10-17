package nd3;

import ffk.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f214318a;

    public j(t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f214318a = pricingPlanInteractor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e A[LOOP:0: B:39:0x0098->B:41:0x009e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [nd3.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(xfa.b r9, uc3.d r10, hha.u r11, gim.c r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof nd3.f
            if (r0 == 0) goto L13
            r0 = r12
            nd3.f r0 = (nd3.f) r0
            int r1 = r0.f214314x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f214314x = r1
            goto L18
        L13:
            nd3.f r0 = new nd3.f
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214314x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            xfa.b r9 = r0.u
            yhm.o.b(r12)
            goto L87
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            xfa.b r9 = r0.u
            yhm.o.b(r12)
            goto L6c
        L3a:
            yhm.o.b(r12)
            if (r11 == 0) goto L51
            com.revolut.retail.core.navigation.FeatureCommand r10 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig$DashboardByFeature r0 = new com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig$DashboardByFeature
            r4 = 0
            r5 = 1020(0x3fc, float:1.43E-42)
            r3 = 0
            r2 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r10.<init>(r0)
            goto Lba
        L51:
            r2 = r9
            if (r10 != 0) goto L56
            r9 = -1
            goto L5e
        L56:
            int[] r9 = nd3.e.f214312a
            int r10 = r10.ordinal()
            r9 = r9[r10]
        L5e:
            if (r9 != r4) goto L7b
            r0.u = r2
            r0.f214314x = r4
            java.lang.Object r12 = r8.c(r0)
            if (r12 != r1) goto L6b
            goto L85
        L6b:
            r9 = r2
        L6c:
            hha.d r12 = (hha.d) r12
            if (r12 == 0) goto L73
            java.lang.String r10 = r12.f152287a
            goto L74
        L73:
            r10 = 0
        L74:
            java.util.List r10 = zhm.v.l(r10)
        L78:
            r6 = r9
            r2 = r10
            goto Laa
        L7b:
            r0.u = r2
            r0.f214314x = r3
            java.io.Serializable r12 = r8.b(r0)
            if (r12 != r1) goto L86
        L85:
            return r1
        L86:
            r9 = r2
        L87:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = zhm.w.t(r12, r11)
            r10.<init>(r11)
            java.util.Iterator r11 = r12.iterator()
        L98:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L78
            java.lang.Object r12 = r11.next()
            hha.d r12 = (hha.d) r12
            java.lang.String r12 = r12.f152287a
            r10.add(r12)
            goto L98
        Laa:
            com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig$DashboardByPlans r0 = new com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig$DashboardByPlans
            r5 = 0
            r1 = 0
            r3 = 0
            r4 = 0
            r7 = 189(0xbd, float:2.65E-43)
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.revolut.retail.core.navigation.FeatureCommand r10 = new com.revolut.retail.core.navigation.FeatureCommand
            r10.<init>(r0)
        Lba:
            com.revolut.kompot.bridge.navigation.BridgeDestination r9 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r9.<init>(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nd3.j.a(xfa.b, uc3.d, hha.u, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof nd3.g
            if (r0 == 0) goto L13
            r0 = r6
            nd3.g r0 = (nd3.g) r0
            int r1 = r0.f214315w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f214315w = r1
            goto L18
        L13:
            nd3.g r0 = new nd3.g
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214315w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L51
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            ffk.t r6 = r5.f214318a
            efm.r r6 = r6.o()
            n87.r r2 = new n87.r
            r4 = 19
            r2.<init>(r4)
            r4 = 0
            efm.r r6 = m70.a.g(r6, r4, r2, r3)
            vkm.d r6 = rd0.e.b(r6)
            r0.f214315w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            java.lang.String r0 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L61:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L7e
            java.lang.Object r1 = r6.next()
            r2 = r1
            hha.d r2 = (hha.d) r2
            boolean r3 = hha.s.j(r2)
            if (r3 != 0) goto L7a
            boolean r2 = hha.s.p(r2)
            if (r2 == 0) goto L61
        L7a:
            r0.add(r1)
            goto L61
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nd3.j.b(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof nd3.h
            if (r0 == 0) goto L13
            r0 = r6
            nd3.h r0 = (nd3.h) r0
            int r1 = r0.f214316w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f214316w = r1
            goto L18
        L13:
            nd3.h r0 = new nd3.h
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214316w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r6)
            goto L4c
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            yhm.o.b(r6)
            ffk.t r6 = r5.f214318a
            efm.r r6 = r6.n()
            nd3.i r2 = nd3.i.f214317a
            efm.r r6 = m70.a.g(r6, r4, r2, r3)
            vkm.d r6 = rd0.e.b(r6)
            r0.f214316w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            java.lang.String r0 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L57:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r6.next()
            r1 = r0
            hha.d r1 = (hha.d) r1
            boolean r1 = hha.s.j(r1)
            if (r1 == 0) goto L57
            return r0
        L6b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: nd3.j.c(gim.c):java.lang.Object");
    }
}
