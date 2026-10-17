package com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow;

import com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.CashHoldingsInfoFlowContract$InputData;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.CashHoldingsInfoFlowContract$ModalStep;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            c cVar = this.v;
            CashHoldingsInfoFlowContract$InputData cashHoldingsInfoFlowContract$InputData = cVar.f96019p;
            if (cashHoldingsInfoFlowContract$InputData instanceof CashHoldingsInfoFlowContract$InputData.ForSelectedCashHolding) {
                cVar.I2(new CashHoldingsInfoFlowContract$ModalStep.AvailableExplanation(cashHoldingsInfoFlowContract$InputData.getF96005b(), cashHoldingsInfoFlowContract$InputData.getF96006c(), ((CashHoldingsInfoFlowContract$InputData.ForSelectedCashHolding) cashHoldingsInfoFlowContract$InputData).f96001a));
            } else {
                if (!(cashHoldingsInfoFlowContract$InputData instanceof CashHoldingsInfoFlowContract$InputData.ForTradingAccount)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.u = 1;
                Object objP2 = cVar.p2(this, new b(cVar, (CashHoldingsInfoFlowContract$InputData.ForTradingAccount) cashHoldingsInfoFlowContract$InputData, null));
                if (objP2 != aVar) {
                    objP2 = Unit.f186387a;
                }
                if (objP2 == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
