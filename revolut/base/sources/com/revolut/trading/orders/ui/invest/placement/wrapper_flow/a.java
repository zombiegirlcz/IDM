package com.revolut.trading.orders.ui.invest.placement.wrapper_flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b.J2(r2, r6, r5) == r0) goto L17;
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
            com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b r2 = r5.v
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r6)
            goto L53
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            yhm.o.b(r6)
            goto L2c
        L1e:
            yhm.o.b(r6)
            s99.i r6 = r2.f107022q
            r5.u = r4
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r0) goto L2c
            goto L3c
        L2c:
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output r6 = (com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output) r6
            boolean r1 = r6 instanceof com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldNotLaunch
            if (r1 == 0) goto L3d
            com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData r6 = r2.o
            r5.u = r3
            java.lang.Object r6 = com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b.J2(r2, r6, r5)
            if (r6 != r0) goto L53
        L3c:
            return r0
        L3d:
            boolean r0 = r6 instanceof com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldLaunch
            if (r0 == 0) goto L56
            yki.i r0 = r2.f107026w
            com.revolut.trading.orders.ui.invest.placement.wrapper_flow.InvestOrderWrapperFlowContract$WrapperFlowStep$McyActivation r1 = new com.revolut.trading.orders.ui.invest.placement.wrapper_flow.InvestOrderWrapperFlowContract$WrapperFlowStep$McyActivation
            com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData r2 = r2.o
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output$ShouldLaunch r6 = (com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldLaunch) r6
            bla.c r6 = r6.f78169a
            r1.<init>(r2, r6)
            com.revolut.kompot.common.ModalDestination$Style$POPUP r6 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            oki.h.w2(r0, r1, r6)
        L53:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L56:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.trading.orders.ui.invest.placement.wrapper_flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
