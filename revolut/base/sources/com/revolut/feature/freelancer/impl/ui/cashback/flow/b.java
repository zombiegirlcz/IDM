package com.revolut.feature.freelancer.impl.ui.cashback.flow;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function1 {
    public ProductArticleParams u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f73743w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(1, continuation);
        this.f73743w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.f73743w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (com.revolut.feature.freelancer.impl.ui.cashback.flow.c.L2(r2, r1, null, r9, 2) == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
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
            com.revolut.feature.freelancer.impl.ui.cashback.flow.c r2 = r9.f73743w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            yhm.o.b(r10)
            goto L5d
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            com.revolut.feature.product_article.api.models.ProductArticleParams r1 = r9.u
            yhm.o.b(r10)
            goto L49
        L23:
            yhm.o.b(r10)
            goto L33
        L27:
            yhm.o.b(r10)
            r9.v = r5
            java.lang.Object r10 = com.revolut.feature.freelancer.impl.ui.cashback.flow.c.I2(r2, r9)
            if (r10 != r0) goto L33
            goto L5c
        L33:
            r1 = r10
            com.revolut.feature.product_article.api.models.ProductArticleParams r1 = (com.revolut.feature.product_article.api.models.ProductArticleParams) r1
            if (r1 == 0) goto L60
            zja.a r10 = r2.f73746r
            r9.u = r1
            r9.v = r4
            kka.h r10 = (kka.h) r10
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r5 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r10 = r10.e(r1, r5, r9)
            if (r10 != r0) goto L49
            goto L5c
        L49:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L60
            r10 = 0
            r9.u = r10
            r9.v = r3
            java.lang.Object r10 = com.revolut.feature.freelancer.impl.ui.cashback.flow.c.L2(r2, r1, r10, r9, r4)
            if (r10 != r0) goto L5d
        L5c:
            return r0
        L5d:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L60:
            yki.i r3 = r2.f73748t
            r7 = 0
            r8 = 12
            com.revolut.feature.freelancer.impl.ui.cashback.flow.FreelancerCashbackFlowContract$Step$Booster r4 = com.revolut.feature.freelancer.impl.ui.cashback.flow.FreelancerCashbackFlowContract$Step.Booster.f73739a
            r5 = 1
            r6 = 0
            oki.h.t2(r2, r3, r4, r5, r6, r7, r8)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.cashback.flow.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
