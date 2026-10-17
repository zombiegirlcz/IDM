package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments;

import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.TransferInvestmentsFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ d u;
    public final /* synthetic */ TransferInvestmentsFlowContract$Step.ProductArticle v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, TransferInvestmentsFlowContract$Step.ProductArticle productArticle, Continuation continuation) {
        super(2, continuation);
        this.u = dVar;
        this.v = productArticle;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d.I2(this.u, this.v.f91616a, false);
        return Unit.f186387a;
    }
}
