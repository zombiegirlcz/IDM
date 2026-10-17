package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ prd.i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(prd.i iVar, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r7 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r7 == r0) goto L20;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            yhm.o.b(r7)
            goto L6c
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            yhm.o.b(r7)
            goto L44
        L1c:
            yhm.o.b(r7)
            prd.i r7 = r6.v
            cli.y r1 = r7.f238993r
            tsj.g r4 = r7.f238991p
            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData r7 = r7.o
            boolean r5 = r7 instanceof com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData.CurrentValue
            if (r5 == 0) goto L4b
            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData$CurrentValue r7 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData.CurrentValue) r7
            java.lang.String r7 = r7.f87938a
            java.lang.Object r1 = r1.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            prd.a r1 = (prd.a) r1
            dj0.d r1 = r1.f238977a
            r6.u = r3
            java.lang.Object r7 = r4.a(r1, r6, r7)
            if (r7 != r0) goto L44
            goto L6b
        L44:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L72
        L4b:
            boolean r3 = r7 instanceof com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData.HistoricalValue
            if (r3 == 0) goto L77
            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData$HistoricalValue r7 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData.HistoricalValue) r7
            java.lang.String r3 = r7.f87941a
            com.revolut.retail.feature.api.custom_assets.models.ValueHistoryEntry r7 = r7.f87942b
            java.time.LocalDate r7 = r7.f99233a
            java.lang.Object r1 = r1.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            prd.a r1 = (prd.a) r1
            dj0.d r1 = r1.f238977a
            r6.u = r2
            java.lang.Object r7 = r4.j(r3, r7, r1, r6)
            if (r7 != r0) goto L6c
        L6b:
            return r0
        L6c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
        L72:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L77:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
