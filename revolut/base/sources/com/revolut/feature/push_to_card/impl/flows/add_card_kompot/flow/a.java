package com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow;

import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ CardOwnerCreationFlowContract$Step u;
    public final /* synthetic */ AddressFlowContract$OutputData v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CardOwnerCreationFlowContract$Step cardOwnerCreationFlowContract$Step, AddressFlowContract$OutputData addressFlowContract$OutputData, Continuation continuation) {
        super(1, continuation);
        this.u = cardOwnerCreationFlowContract$Step;
        this.v = addressFlowContract$OutputData;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        return CardOwnerCreationFlowContract$CreationProcessState.a(((CardOwnerCreationFlowContract$Step.Address) this.u).f81570a, this.v.f60940a, null, 11);
    }
}
