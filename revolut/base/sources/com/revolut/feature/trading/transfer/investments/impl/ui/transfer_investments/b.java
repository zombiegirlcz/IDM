package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments;

import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.TransferInvestmentsFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ d u;
    public final /* synthetic */ TransferInvestmentsFlowContract$Step.NewTransferInvestmentsTypeSelection v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, TransferInvestmentsFlowContract$Step.NewTransferInvestmentsTypeSelection newTransferInvestmentsTypeSelection, Continuation continuation) {
        super(2, continuation);
        this.u = dVar;
        this.v = newTransferInvestmentsTypeSelection;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        this.u.K2(this.v.f91615a, true);
        return Unit.f186387a;
    }
}
