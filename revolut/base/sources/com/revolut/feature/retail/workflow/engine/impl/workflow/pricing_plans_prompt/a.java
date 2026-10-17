package com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b.J2(r2, r9) == r0) goto L17;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.u
            com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b r2 = r9.v
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r10)
            goto L47
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            yhm.o.b(r10)
            goto L2a
        L1e:
            yhm.o.b(r10)
            r9.u = r4
            java.lang.Object r10 = com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b.I2(r2, r9)
            if (r10 != r0) goto L2a
            goto L36
        L2a:
            com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt$Available r10 = (com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt.Available) r10
            if (r10 != 0) goto L37
            r9.u = r3
            java.lang.Object r10 = com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.b.J2(r2, r9)
            if (r10 != r0) goto L47
        L36:
            return r0
        L37:
            yki.i r3 = r2.f83409s
            com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.PricingPlansPromptResolverFlowContract$Step$Prompt r4 = new com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.PricingPlansPromptResolverFlowContract$Step$Prompt
            r4.<init>(r10)
            com.revolut.kompot.navigable.TransitionAnimation$NONE r6 = com.revolut.kompot.navigable.TransitionAnimation.NONE.f98393a
            r7 = 0
            r8 = 8
            r5 = 0
            oki.h.t2(r2, r3, r4, r5, r6, r7, r8)
        L47:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.workflow.engine.impl.workflow.pricing_plans_prompt.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
