package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ prd.i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(prd.i iVar, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r6 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r6 == r0) goto L20;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            yhm.o.b(r6)
            goto L53
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            yhm.o.b(r6)
            goto L36
        L1c:
            yhm.o.b(r6)
            prd.i r6 = r5.v
            tsj.g r1 = r6.f238991p
            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData r6 = r6.o
            boolean r4 = r6 instanceof com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData.CurrentValue
            if (r4 == 0) goto L3d
            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData$CurrentValue r6 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData.CurrentValue) r6
            java.lang.String r6 = r6.f87938a
            r5.u = r3
            java.lang.Object r6 = r1.h(r6, r5)
            if (r6 != r0) goto L36
            goto L52
        L36:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            goto L59
        L3d:
            boolean r3 = r6 instanceof com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData.HistoricalValue
            if (r3 == 0) goto L5e
            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData$HistoricalValue r6 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData.HistoricalValue) r6
            java.lang.String r3 = r6.f87941a
            com.revolut.retail.feature.api.custom_assets.models.ValueHistoryEntry r6 = r6.f87942b
            java.time.LocalDate r6 = r6.f99233a
            r5.u = r2
            r2 = 0
            java.lang.Object r6 = r1.j(r3, r6, r2, r5)
            if (r6 != r0) goto L53
        L52:
            return r0
        L53:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
        L59:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L5e:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
