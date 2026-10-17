package lik;

import kotlin.jvm.internal.Intrinsics;
import phk.k;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends vfk.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final egk.e f195552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final yik.d f195553m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zfk.c f195554n;
    public final k o;

    public g(egk.e pricingPlansUiInteractor, yik.d sourceMapper, zfk.c planSubscriberControllerModelExtension, k planBillingPickerControllerModelExtension) {
        Intrinsics.checkNotNullParameter(pricingPlansUiInteractor, "pricingPlansUiInteractor");
        Intrinsics.checkNotNullParameter(sourceMapper, "sourceMapper");
        Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
        Intrinsics.checkNotNullParameter(planBillingPickerControllerModelExtension, "planBillingPickerControllerModelExtension");
        this.f195552l = pricingPlansUiInteractor;
        this.f195553m = sourceMapper;
        this.f195554n = planSubscriberControllerModelExtension;
        this.o = planBillingPickerControllerModelExtension;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // vfk.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(hha.d r7, xfa.b r8, xfa.a r9, ac1.b r10, gim.c r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof lik.f
            if (r0 == 0) goto L13
            r0 = r11
            lik.f r0 = (lik.f) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            lik.f r0 = new lik.f
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.f195551y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            ac1.b r10 = r0.f195550x
            xfa.a r9 = r0.f195549w
            xfa.b r8 = r0.v
            hha.d r7 = r0.u
            yhm.o.b(r11)
            goto L61
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            yhm.o.b(r11)
            yik.d r11 = r6.f195553m
            ggk.g0 r11 = r11.a(r8)
            java.lang.String r2 = r7.f152287a
            w4l.h r4 = w4l.h.f294642c
            egk.e r5 = r6.f195552l
            wik.t r5 = (wik.t) r5
            dfj.m0 r11 = r5.f(r2, r11, r4)
            vkm.v1 r11 = c8g.a.D(r11)
            r0.u = r7
            r0.v = r8
            r0.f195549w = r9
            r0.f195550x = r10
            r0.A = r3
            java.lang.Object r11 = vkm.q.F(r11, r0)
            if (r11 != r1) goto L61
            return r1
        L61:
            com.revolut.data.model.Data r11 = (com.revolut.data.model.Data) r11
            if (r11 == 0) goto La2
            java.lang.Object r11 = r11.getContent()
            ggk.g1 r11 = (ggk.g1) r11
            if (r11 == 0) goto La2
            com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptions r11 = r11.k
            if (r11 == 0) goto L91
            java.util.ArrayList r0 = r11.d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L7a
            goto L91
        L7a:
            phk.i r0 = new phk.i
            com.revolut.retail.feature.pricing_plans.ui.impl.model.SelectedBillingPlan$Plan r1 = new com.revolut.retail.feature.pricing_plans.ui.impl.model.SelectedBillingPlan$Plan
            r1.<init>(r7)
            r0.<init>(r1, r8, r11, r9)
            li8.n r8 = new li8.n
            r8.<init>(r6, r3, r7, r10)
            phk.k r7 = r6.o
            r7.Z2(r0, r8)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L91:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r8 = rd0.d.f253311a
            rd0.c r8 = rd0.c.ERROR
            java.lang.String r9 = "no billing option available"
            r10 = 0
            java.lang.String r11 = "PricingPlanNavigationCommandsProvider"
            rd0.d.a(r8, r11, r9, r10, r7)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        La2:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lik.g.Z2(hha.d, xfa.b, xfa.a, ac1.b, gim.c):java.lang.Object");
    }
}
