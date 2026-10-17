package aok;

import kotlin.jvm.internal.Intrinsics;
import pfk.x;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gte.a f8003l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x f8004m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wli.x f8005n;

    public c(gte.a featureToggleInteractor, x pricingPlanCancelRepository, wli.x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanCancelRepository, "pricingPlanCancelRepository");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f8003l = featureToggleInteractor;
        this.f8004m = pricingPlanCancelRepository;
        this.f8005n = deeplinkHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // aok.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof aok.b
            if (r0 == 0) goto L13
            r0 = r7
            aok.b r0 = (aok.b) r0
            int r1 = r0.f8002w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8002w = r1
            goto L18
        L13:
            aok.b r0 = new aok.b
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f8002w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yhm.o.b(r7)
            goto L54
        L36:
            yhm.o.b(r7)
            gte.a r7 = r6.f8003l
            com.revolut.retail.feature.plan_rewards.api.PlanRewardsApi$Toggles$MonthlyDraws r2 = com.revolut.retail.feature.plan_rewards.api.PlanRewardsApi$Toggles$MonthlyDraws.f102521c
            boolean r7 = r7.a(r2)
            if (r7 == 0) goto L44
            goto L93
        L44:
            a3i.q r7 = new a3i.q
            r2 = 6
            r5 = 0
            r7.<init>(r6, r5, r2)
            r0.f8002w = r4
            java.lang.Object r7 = r6.Y2(r0, r7)
            if (r7 != r1) goto L54
            goto L8b
        L54:
            iha.a0 r7 = (iha.a0) r7
            iha.y r2 = iha.y.f161359a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r7, r2)
            if (r2 != 0) goto L93
            boolean r2 = r7 instanceof iha.z
            if (r2 == 0) goto L63
            goto L93
        L63:
            boolean r2 = r7 instanceof com.revolut.feature.pricingplans.models.cancel.ValueOfferReminderResponse$Content
            if (r2 == 0) goto L8d
            com.revolut.feature.pricingplans.models.cancel.ValueOfferReminderResponse$Content r7 = (com.revolut.feature.pricingplans.models.cancel.ValueOfferReminderResponse$Content) r7
            r0.f8002w = r3
            skm.r r2 = skm.e0.b()
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.value_offer_reminder.PlanValueOfferReminderScreen r3 = new com.revolut.retail.feature.pricing_plans.ui.impl.screens.value_offer_reminder.PlanValueOfferReminderScreen
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.value_offer_reminder.PlanValueOfferReminderScreenContract$InputData r4 = new com.revolut.retail.feature.pricing_plans.ui.impl.screens.value_offer_reminder.PlanValueOfferReminderScreenContract$InputData
            r4.<init>(r7)
            r3.<init>(r4)
            amh.j r7 = new amh.j
            r4 = 15
            r7.<init>(r2, r6, r4)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r4 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            r6.N2(r3, r4, r7)
            java.lang.Object r7 = r2.y(r0)
            if (r7 != r1) goto L8c
        L8b:
            return r1
        L8c:
            return r7
        L8d:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L93:
            aok.a$a$b r7 = aok.a.AbstractC0069a.b.f8001a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: aok.c.Z2(gim.c):java.lang.Object");
    }
}
