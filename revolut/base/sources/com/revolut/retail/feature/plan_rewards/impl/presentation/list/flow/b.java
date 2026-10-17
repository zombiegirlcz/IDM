package com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r9 == r2) goto L18;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.c r0 = r8.v
            gdk.a r1 = r0.f102565q
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.u
            r4 = 0
            r5 = 0
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L22
            if (r3 == r7) goto L1e
            if (r3 != r6) goto L16
            yhm.o.b(r9)
            goto L66
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            yhm.o.b(r9)
            goto L3f
        L22:
            yhm.o.b(r9)
            r8.u = r7
            r9 = r1
            gdk.c r9 = (gdk.c) r9
            bdk.c r9 = r9.f143189a
            r9.getClass()
            bdk.b r3 = new bdk.b
            r3.<init>(r9, r5, r4)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r9, r3, r8)
            if (r9 != r2) goto L3f
            goto L65
        L3f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L4b
            com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.MilestoneRewardsFlowContract$Step$RewardsList r9 = com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.MilestoneRewardsFlowContract$Step.RewardsList.f102561a
            r2 = r9
            goto L6e
        L4b:
            r8.u = r6
            gdk.c r1 = (gdk.c) r1
            bdk.j r9 = r1.f143190b
            xck.o r1 = xck.o.MILESTONE
            r9.getClass()
            bdk.h r3 = new bdk.h
            r3.<init>(r1, r9, r5, r4)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r9, r3, r8)
            if (r9 != r2) goto L66
        L65:
            return r2
        L66:
            com.revolut.feature.product_article.api.models.ProductArticleParams r9 = (com.revolut.feature.product_article.api.models.ProductArticleParams) r9
            com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.MilestoneRewardsFlowContract$Step$ProductArticle r1 = new com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.MilestoneRewardsFlowContract$Step$ProductArticle
            r1.<init>(r9)
            r2 = r1
        L6e:
            yki.i r1 = r0.f102566r
            r5 = 0
            r6 = 12
            r3 = 0
            r4 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
