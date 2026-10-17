package mtl;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ p v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, Continuation continuation) {
        super(1, continuation);
        this.v = pVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (mtl.p.J2(r6, r5) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        if (mtl.p.I2(r6, r1, r5) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
    
        return r0;
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
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            yhm.o.b(r6)
            goto L5f
        L19:
            yhm.o.b(r6)
            mtl.p r6 = r5.v
            com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData r1 = r6.o
            com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$DisplayOptions r1 = r1.getDisplayOptions()
            boolean r4 = r1 instanceof com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract.InputData.RecurringOrders.DisplayOptions
            if (r4 == 0) goto L2b
            com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData$RecurringOrders$DisplayOptions r1 = (com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract.InputData.RecurringOrders.DisplayOptions) r1
            goto L2c
        L2b:
            r1 = 0
        L2c:
            if (r1 == 0) goto L68
            com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData$RecurringOrders$PlusActionNavBarButton r1 = r1.f91759a
            if (r1 != 0) goto L33
            goto L68
        L33:
            com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData$RecurringOrders$PlusActionNavBarButton$OpenRecurringBuys r4 = com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract.InputData.RecurringOrders.PlusActionNavBarButton.OpenRecurringBuys.f91761a
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L41
            com.revolut.feature.wealth.ui.api.navigation.investment_plans_collection.RecurringBuyHubCollectionDestination r0 = com.revolut.feature.wealth.ui.api.navigation.investment_plans_collection.RecurringBuyHubCollectionDestination.f95936a
            r6.C1(r0)
            goto L5f
        L41:
            boolean r4 = r1 instanceof com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract.InputData.RecurringOrders.PlusActionNavBarButton.StartSecurityOrder
            if (r4 == 0) goto L4e
            r5.u = r3
            java.lang.Object r6 = mtl.p.J2(r6, r5)
            if (r6 != r0) goto L5f
            goto L5e
        L4e:
            boolean r3 = r1 instanceof com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract.InputData.RecurringOrders.PlusActionNavBarButton.StartCommodityOrder
            if (r3 == 0) goto L62
            com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData$RecurringOrders$PlusActionNavBarButton$StartCommodityOrder r1 = (com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract.InputData.RecurringOrders.PlusActionNavBarButton.StartCommodityOrder) r1
            xi0.b r1 = r1.f91762a
            r5.u = r2
            java.lang.Object r6 = mtl.p.I2(r6, r1, r5)
            if (r6 != r0) goto L5f
        L5e:
            return r0
        L5f:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L62:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L68:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mtl.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
