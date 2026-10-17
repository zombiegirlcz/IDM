package com.revolut.retail.feature.plan_rewards.impl.presentation.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import xck.n;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function2 {
    public n u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f102552w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(2, continuation);
        this.f102552w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.f102552w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.v
            r2 = 6
            com.revolut.retail.feature.plan_rewards.impl.presentation.flow.MonthlyDrawsFlowContract$Step$Hub r3 = com.revolut.retail.feature.plan_rewards.impl.presentation.flow.MonthlyDrawsFlowContract$Step.Hub.f102544a
            com.revolut.retail.feature.plan_rewards.impl.presentation.flow.d r4 = r9.f102552w
            r5 = 0
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L24
            if (r1 == r7) goto L20
            if (r1 != r6) goto L18
            xck.n r0 = r9.u
            yhm.o.b(r10)
            goto L68
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            yhm.o.b(r10)
            goto L3c
        L24:
            yhm.o.b(r10)
            com.revolut.retail.feature.plan_rewards.impl.presentation.flow.MonthlyDrawsFlowContract$InputData r10 = r4.o
            boolean r10 = r10.f102541a
            if (r10 == 0) goto L81
            hdk.i r10 = new hdk.i
            r1 = 1
            r10.<init>(r4, r5, r1)
            r9.v = r7
            java.lang.Object r10 = r4.p2(r9, r10)
            if (r10 != r0) goto L3c
            goto L65
        L3c:
            xck.n r10 = (xck.n) r10
            int[] r1 = hdk.j.f151476a
            int r8 = r10.ordinal()
            r1 = r1[r8]
            switch(r1) {
                case 1: goto L7b;
                case 2: goto L7b;
                case 3: goto L7b;
                case 4: goto L7b;
                case 5: goto L55;
                case 6: goto L55;
                case 7: goto L4f;
                default: goto L49;
            }
        L49:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L4f:
            yki.i r10 = r4.u
            oki.h.D2(r10)
            goto L86
        L55:
            hdk.i r1 = new hdk.i
            r3 = 2
            r1.<init>(r4, r5, r3)
            r9.u = r10
            r9.v = r6
            java.lang.Object r1 = r4.p2(r9, r1)
            if (r1 != r0) goto L66
        L65:
            return r0
        L66:
            r0 = r10
            r10 = r1
        L68:
            com.revolut.feature.product_article.api.models.ProductArticleParams r10 = (com.revolut.feature.product_article.api.models.ProductArticleParams) r10
            yki.i r1 = r4.u
            com.revolut.retail.feature.plan_rewards.impl.presentation.flow.MonthlyDrawsFlowContract$Step$ProductArticle r3 = new com.revolut.retail.feature.plan_rewards.impl.presentation.flow.MonthlyDrawsFlowContract$Step$ProductArticle
            xck.n r6 = xck.n.NOT_OPTED_IN
            if (r0 != r6) goto L73
            goto L74
        L73:
            r7 = 0
        L74:
            r3.<init>(r10, r7)
            oki.h.u2(r4, r1, r3, r5, r2)
            goto L86
        L7b:
            yki.i r10 = r4.u
            oki.h.u2(r4, r10, r3, r5, r2)
            goto L86
        L81:
            yki.i r10 = r4.u
            oki.h.u2(r4, r10, r3, r5, r2)
        L86:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.plan_rewards.impl.presentation.flow.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
