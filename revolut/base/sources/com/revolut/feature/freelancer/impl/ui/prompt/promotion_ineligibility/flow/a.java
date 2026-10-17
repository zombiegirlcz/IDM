package com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        if (com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow.b.I2(r6, r13) == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r13.u
            r2 = 14
            r3 = 3
            r4 = 2
            r5 = 1
            com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow.b r6 = r13.v
            r7 = 0
            if (r1 == 0) goto L2b
            if (r1 == r5) goto L27
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            yhm.o.b(r14)
            goto La9
        L19:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L21:
            yhm.o.b(r14)
            r1 = r14
            r14 = r7
            goto L72
        L27:
            yhm.o.b(r14)
            goto L40
        L2b:
            yhm.o.b(r14)
            gr6.e r14 = r6.f74099p
            r13.u = r5
            et6.l0 r14 = (et6.l0) r14
            r14.getClass()
            yoj.c r1 = yoj.c.FREELANCER_PHASE_1
            java.lang.Object r14 = r14.a(r1, r13)
            if (r14 != r0) goto L40
            goto L82
        L40:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L62
            r14 = r7
            yki.i r7 = r6.f74102s
            com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow.FreelancerPromotionIneligibilityFlowContract$Step$Prompt r8 = new com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow.FreelancerPromotionIneligibilityFlowContract$Step$Prompt
            com.revolut.core.ui_kit_core.displayers.image.models.CdnImage r0 = r6.f74101r
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.freelancer.impl.R$string.freelancer_promotion_pro_unavailable_title
            r1.<init>(r3, r14, r14, r2)
            r8.<init>(r0, r1, r14, r14)
            r11 = 0
            r12 = 14
            r9 = 0
            r10 = 0
            oki.h.t2(r6, r7, r8, r9, r10, r11, r12)
            goto La9
        L62:
            r14 = r7
            gr6.a r1 = r6.o
            r13.u = r4
            et6.g r1 = (et6.g) r1
            w4l.h r4 = w4l.h.f294642c
            java.lang.Object r1 = r1.c(r4, r13)
            if (r1 != r0) goto L72
            goto L82
        L72:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L83
            r13.u = r3
            java.lang.Object r14 = com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow.b.I2(r6, r13)
            if (r14 != r0) goto La9
        L82:
            return r0
        L83:
            yki.i r7 = r6.f74102s
            com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow.FreelancerPromotionIneligibilityFlowContract$Step$Prompt r8 = new com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow.FreelancerPromotionIneligibilityFlowContract$Step$Prompt
            com.revolut.core.ui_kit_core.displayers.image.models.CdnImage r0 = r6.f74101r
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.freelancer.impl.R$string.freelancer_promotion_reward_ineligible_title
            r1.<init>(r3, r14, r14, r2)
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.freelancer.impl.R$string.freelancer_promotion_reward_ineligible_description
            r3.<init>(r4, r14, r14, r2)
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.feature.freelancer.impl.R$string.freelancer_promotion_reward_ineligible_action
            r4.<init>(r5, r14, r14, r2)
            r8.<init>(r0, r1, r3, r4)
            r11 = 0
            r12 = 14
            r9 = 0
            r10 = 0
            oki.h.t2(r6, r7, r8, r9, r10, r11, r12)
        La9:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
