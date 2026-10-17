package com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection;

import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.PlanSelectionCoreFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.switch_to_individual.SwitchToIndividualPromptControllerModelExtension;
import cp5.d;
import ffk.t;
import jch.p;
import jhk.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import phk.k;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements jhk.b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f103090p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f103091q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bgk.a f103092r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SwitchToIndividualPromptControllerModelExtension f103093s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wmk.b f103094t;
    public final aok.a u;
    public final wfk.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.retail.feature.pricing_plans.ui.impl.analytics.a f103095w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final gte.a f103096x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final yki.a f103097y;

    public b(c inputData, t pricingPlanInteractor, k planBillingPickerControllerModelExtension, bgk.a planTermsWorkflowControllerExtension, SwitchToIndividualPromptControllerModelExtension switchToIndividualExtension, wmk.b downgradeOfferReminderExtension, aok.a valueOfferReminderExtension, wfk.a globalPlansExtension, com.revolut.retail.feature.pricing_plans.ui.impl.analytics.a analyticsContextFactory, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(planBillingPickerControllerModelExtension, "planBillingPickerControllerModelExtension");
        Intrinsics.checkNotNullParameter(planTermsWorkflowControllerExtension, "planTermsWorkflowControllerExtension");
        Intrinsics.checkNotNullParameter(switchToIndividualExtension, "switchToIndividualExtension");
        Intrinsics.checkNotNullParameter(downgradeOfferReminderExtension, "downgradeOfferReminderExtension");
        Intrinsics.checkNotNullParameter(valueOfferReminderExtension, "valueOfferReminderExtension");
        Intrinsics.checkNotNullParameter(globalPlansExtension, "globalPlansExtension");
        Intrinsics.checkNotNullParameter(analyticsContextFactory, "analyticsContextFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f103090p = pricingPlanInteractor;
        this.f103091q = planBillingPickerControllerModelExtension;
        this.f103092r = planTermsWorkflowControllerExtension;
        this.f103093s = switchToIndividualExtension;
        this.f103094t = downgradeOfferReminderExtension;
        this.u = valueOfferReminderExtension;
        this.v = globalPlansExtension;
        this.f103095w = analyticsContextFactory;
        this.f103096x = featureToggleInteractor;
        p pVar = new p(this, 16);
        this.f103097y = d.a(this, PlanSelectionCoreFlowContract$Step.SelectPlan.f103086a, f0.f322471a, pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (r5.J2(r8, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b r5, hha.d r6, hha.d r7, bib.b r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof jhk.q
            if (r0 == 0) goto L13
            r0 = r9
            jhk.q r0 = (jhk.q) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            jhk.q r0 = new jhk.q
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f174308x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            goto L8c
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            bib.b r8 = r0.f174307w
            hha.d r7 = r0.v
            hha.d r6 = r0.u
            yhm.o.b(r9)
            goto L5c
        L3c:
            yhm.o.b(r9)
            boolean r9 = dok.g.h(r7, r6)
            if (r9 == 0) goto L4b
            r8.invoke()
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L4b:
            wmk.b r9 = r5.f103094t
            r0.u = r6
            r0.v = r7
            r0.f174307w = r8
            r0.z = r4
            java.lang.Object r9 = r9.Z2(r6, r7, r0)
            if (r9 != r1) goto L5c
            goto L8b
        L5c:
            wmk.b$a r9 = (wmk.b.a) r9
            wmk.b$a$a r2 = wmk.b.a.C1648a.f298682a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r9, r2)
            if (r2 == 0) goto L6c
            yki.a r5 = r5.f103097y
            oki.h.D2(r5)
            goto L9e
        L6c:
            wmk.b$a$b r2 = wmk.b.a.C1649b.f298683a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r9, r2)
            if (r2 == 0) goto L93
            boolean r7 = r7.f152296p
            if (r7 == 0) goto L8f
            boolean r6 = r6.f152296p
            if (r6 != 0) goto L8f
            r6 = 0
            r0.u = r6
            r0.v = r6
            r0.f174307w = r6
            r0.z = r3
            java.lang.Object r5 = r5.J2(r8, r0)
            if (r5 != r1) goto L8c
        L8b:
            return r1
        L8c:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L8f:
            r8.invoke()
            goto L9e
        L93:
            wmk.b$a$c r5 = wmk.b.a.c.f298684a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r9, r5)
            if (r5 == 0) goto La1
            r8.invoke()
        L9e:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        La1:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b.I2(com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b, hha.d, hha.d, bib.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(kotlin.jvm.functions.Function0 r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jhk.n
            if (r0 == 0) goto L13
            r0 = r6
            jhk.n r0 = (jhk.n) r0
            int r1 = r0.f174303x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f174303x = r1
            goto L18
        L13:
            jhk.n r0 = new jhk.n
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f174303x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.functions.Function0 r5 = r0.u
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            yhm.o.b(r6)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            r6 = r5
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r0.u = r6
            r0.f174303x = r3
            aok.a r6 = r4.u
            java.lang.Object r6 = r6.Z2(r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            aok.a$a r6 = (aok.a.AbstractC0069a) r6
            aok.a$a$b r0 = aok.a.AbstractC0069a.b.f8001a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r6, r0)
            if (r0 == 0) goto L54
            r5.invoke()
            goto L5c
        L54:
            aok.a$a$a r5 = aok.a.AbstractC0069a.C0070a.f8000a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r6, r5)
            if (r5 == 0) goto L5f
        L5c:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L5f:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b.J2(kotlin.jvm.functions.Function0, gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f103097y;
    }
}
