package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PricingPlanAction.ClaimPlanReferral f103215w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, PricingPlanAction.ClaimPlanReferral claimPlanReferral, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f103215w = claimPlanReferral;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f103215w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.u
            com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction$ClaimPlanReferral r2 = r10.f103215w
            r3 = 1
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c r4 = r10.v
            if (r1 == 0) goto L19
            if (r1 != r3) goto L11
            yhm.o.b(r11)
            goto L25
        L11:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L19:
            yhm.o.b(r11)
            r10.u = r3
            java.lang.Object r11 = com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c.I2(r4, r2, r10)
            if (r11 != r0) goto L25
            return r0
        L25:
            qha.a r11 = (qha.a) r11
            hha.o r0 = r11.b()
            if (r0 == 0) goto L3a
            dj0.d r0 = r0.f152326a
            if (r0 == 0) goto L3a
            dj0.d r1 = dj0.d.e
            boolean r0 = r0.f(r1)
            if (r0 != r3) goto L3a
            goto L6b
        L3a:
            java.util.List r0 = r11.f246567c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L4c
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L4c
            goto L84
        L4c:
            java.util.Iterator r0 = r0.iterator()
        L50:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L84
            java.lang.Object r1 = r0.next()
            qha.b r1 = (qha.b) r1
            qha.d r1 = r1.f246574a
            qha.c r3 = qha.d.Companion
            r3.getClass()
            qha.d r3 = qha.d.f246580h
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L50
        L6b:
            yki.a r0 = r4.u
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.PlanReferralsClaimFlowContract$Step$Confirmation r1 = new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.PlanReferralsClaimFlowContract$Step$Confirmation
            com.revolut.feature.pricingplans.models.cancel.PricingPlanCancelScreenConfig r11 = r11.f246570j
            if (r11 == 0) goto L7c
            r1.<init>(r2, r11)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r11 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.w2(r0, r1, r11)
            goto L9c
        L7c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r11.<init>(r0)
            throw r11
        L84:
            zfk.c r11 = r4.f103218r
            java.lang.String r0 = r2.f102795a
            java.lang.String r1 = r2.f102796b
            hha.i r2 = r2.f102797c
            kkf.r6 r5 = r11.e3(r2, r0, r1)
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.b r8 = new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.b
            r11 = 0
            r8.<init>(r4, r11)
            r9 = 3
            r6 = 0
            r7 = 0
            yji.l.a1(r4, r5, r6, r7, r8, r9)
        L9c:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
