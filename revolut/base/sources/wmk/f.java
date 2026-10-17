package wmk;

import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.z1;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wik.m f298689l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final whk.g f298690m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j2 f298691n;
    public final z1 o;

    public f(wik.m pricingPlanOffersInteractor, whk.g planDowngradeOfferPromptBuilder) {
        Intrinsics.checkNotNullParameter(pricingPlanOffersInteractor, "pricingPlanOffersInteractor");
        Intrinsics.checkNotNullParameter(planDowngradeOfferPromptBuilder, "planDowngradeOfferPromptBuilder");
        this.f298689l = pricingPlanOffersInteractor;
        this.f298690m = planDowngradeOfferPromptBuilder;
        this.f298691n = vkm.q.c(new a(null));
        this.o = vkm.q.a(1, 1, ukm.f.DROP_OLDEST);
    }

    @Override // yji.n
    public final void D2() {
        wik.m mVar = this.f298689l;
        mVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.n.j2(this, nim.a.u(new u36.g(2, mVar, wik.m.class, "provideOfferReminder", "provideOfferReminder(Lcom/revolut/feature/pricingplans/models/PricingPlanSubscription;)Ljava/util/Optional;", 4, 24), rd0.e.b(mVar.f297923a.v(loadingStrategy))), null, new wka.e(this, null, 6), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // wmk.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(hha.d r7, hha.d r8, gim.c r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof wmk.e
            if (r0 == 0) goto L13
            r0 = r9
            wmk.e r0 = (wmk.e) r0
            int r1 = r0.f298688y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f298688y = r1
            goto L18
        L13:
            wmk.e r0 = new wmk.e
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f298686w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f298688y
            vkm.z1 r3 = r6.o
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r9)
            return r9
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            hha.d r8 = r0.v
            hha.d r7 = r0.u
            yhm.o.b(r9)
            goto L4f
        L3c:
            yhm.o.b(r9)
            r3.i()
            r0.u = r7
            r0.v = r8
            r0.f298688y = r5
            java.lang.Object r9 = r6.b3(r0)
            if (r9 != r1) goto L4f
            goto L80
        L4f:
            com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPeriod r9 = (com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPeriod) r9
            if (r9 != 0) goto L56
            wmk.b$a$b r7 = wmk.b.a.C1649b.f298683a
            return r7
        L56:
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_reminder.PlanDowngradeOfferReminderScreenContract$InputData r2 = new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_reminder.PlanDowngradeOfferReminderScreenContract$InputData
            r2.<init>(r7, r8, r9)
            tji.f r8 = r6.q2()
            r8.c()
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_reminder.PlanDowngradeOfferReminderScreen r8 = new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_reminder.PlanDowngradeOfferReminderScreen
            r8.<init>(r2)
            vx9.v r2 = new vx9.v
            r5 = 23
            r2.<init>(r6, r5, r7, r9)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r7 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            r6.N2(r8, r7, r2)
            r7 = 0
            r0.u = r7
            r0.v = r7
            r0.f298688y = r4
            java.lang.Object r7 = vkm.q.x(r3, r0)
            if (r7 != r1) goto L81
        L80:
            return r1
        L81:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wmk.f.Z2(hha.d, hha.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof wmk.c
            if (r0 == 0) goto L13
            r0 = r5
            wmk.c r0 = (wmk.c) r0
            int r1 = r0.f298685w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f298685w = r1
            goto L18
        L13:
            wmk.c r0 = new wmk.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f298685w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f298685w = r3
            vkm.j2 r5 = r4.f298691n
            java.lang.Object r5 = vkm.q.z(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            wmk.a r5 = (wmk.a) r5
            r0 = 0
            if (r5 == 0) goto L52
            java.util.Optional r5 = r5.f298681a
            if (r5 == 0) goto L52
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            java.lang.Object r5 = r5.orElse(r0)
            com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPeriod r5 = (com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPeriod) r5
            return r5
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wmk.f.b3(gim.c):java.lang.Object");
    }
}
