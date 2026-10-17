package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TotalWealthFlowContract$Step f87992w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, TotalWealthFlowContract$Step totalWealthFlowContract$Step, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
        this.f87992w = totalWealthFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f87992w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f.I2(r2, r3, r4, r5, true, r7, r9) == r0) goto L18;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.u
            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f r2 = r9.v
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r10)
            goto L56
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            yhm.o.b(r10)
            goto L3e
        L1e:
            yhm.o.b(r10)
            dtd.a r10 = r2.f88002s
            r9.u = r4
            dtd.d r10 = (dtd.d) r10
            mk0.a r10 = r10.e
            tk0.b r1 = new tk0.b
            java.lang.String r4 = "CUSTOM_ASSETS_SMART_ESTIMATION_AGREED"
            r1.<init>(r4)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.Object r10 = r10.e(r1, r4, r9)
            if (r10 != r0) goto L39
            goto L3b
        L39:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L3b:
            if (r10 != r0) goto L3e
            goto L55
        L3e:
            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.TotalWealthFlowContract$Step r10 = r9.f87992w
            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.TotalWealthFlowContract$Step$SmartEstimationProductArticle r10 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.TotalWealthFlowContract$Step.SmartEstimationProductArticle) r10
            r1 = r3
            com.revolut.retail.feature.api.custom_assets.models.CustomAsset r3 = r10.f87983b
            com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition r4 = r10.f87984c
            xi0.b r5 = r10.d
            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.SmartEstimationAccess r7 = r10.e
            r9.u = r1
            r6 = 1
            r8 = r9
            java.lang.Object r10 = com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f.I2(r2, r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L56
        L55:
            return r0
        L56:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
