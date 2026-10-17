package com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt;

import cnc.t;
import com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep;
import d8l.d;
import egk.c;
import kotlin.jvm.internal.Intrinsics;
import plc.i;
import yki.j;
import yki.k;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends k implements j {
    public final SharedStep.PricingPlansPrompt o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f83406p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jvh.a f83407q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f83408r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.i f83409s;

    public b(SharedStep.PricingPlansPrompt step, c pricingPlanOffersInteractor, jvh.a workflowInteractor, i onStepResult) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(pricingPlanOffersInteractor, "pricingPlanOffersInteractor");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(onStepResult, "onStepResult");
        this.o = step;
        this.f83406p = pricingPlanOffersInteractor;
        this.f83407q = workflowInteractor;
        this.f83408r = onStepResult;
        this.f83409s = d.a(this, new t(this, 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b r5, gim.c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof ctb.c
            if (r0 == 0) goto L13
            r0 = r6
            ctb.c r0 = (ctb.c) r0
            int r1 = r0.f108657w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f108657w = r1
            goto L18
        L13:
            ctb.c r0 = new ctb.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f108657w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r6)
            goto L56
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            yhm.o.b(r6)
            egk.c r6 = r5.f83406p
            com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep$PricingPlansPrompt r5 = r5.o
            java.lang.String r5 = r5.e
            r0.f108657w = r4
            wik.m r6 = (wik.m) r6
            kjk.f r6 = r6.f297924b
            kjk.o r6 = (kjk.o) r6
            r6.getClass()
            kb7.c r2 = new kb7.c
            r4 = 10
            r2.<init>(r6, r5, r3, r4)
            skm.p0 r5 = skm.p0.f264001a
            elm.f r5 = elm.f.f127540b
            java.lang.Object r6 = skm.e0.J(r5, r2, r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt r6 = (com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt) r6
            boolean r5 = r6 instanceof com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt.Available
            if (r5 == 0) goto L5f
            com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt$Available r6 = (com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt.Available) r6
            return r6
        L5f:
            boolean r5 = r6 instanceof com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt.Unavailable
            if (r5 == 0) goto L64
            return r3
        L64:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b.I2(com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof ctb.d
            if (r0 == 0) goto L13
            r0 = r5
            ctb.d r0 = (ctb.d) r0
            int r1 = r0.f108658w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f108658w = r1
            goto L18
        L13:
            ctb.d r0 = new ctb.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f108658w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            jvh.a r5 = r4.f83407q
            com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep$PricingPlansPrompt r2 = r4.o
            java.lang.String r2 = r2.f105766b
            r0.f108658w = r3
            java.lang.Object r5 = jvh.a.h(r5, r2, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            plc.i r4 = r4.f83408r
            od9.h r5 = new od9.h
            r0 = 0
            r5.<init>(r0)
            r4.invoke(r5)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b.J2(com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        A1(new a(this, null), new cp7.k(this, 22));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f83409s;
    }
}
