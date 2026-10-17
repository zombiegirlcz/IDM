package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow;

import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.BeneficiaryCreationFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function1 {
    public final /* synthetic */ BeneficiaryCreationFlowContract$Step u;
    public final /* synthetic */ AddressFlowContract$OutputData v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BeneficiaryCreationFlowContract$Step beneficiaryCreationFlowContract$Step, AddressFlowContract$OutputData addressFlowContract$OutputData, Continuation continuation) {
        super(1, continuation);
        this.u = beneficiaryCreationFlowContract$Step;
        this.v = addressFlowContract$OutputData;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        return BeneficiaryCreationFlowContract$CreationProcessState.a(((BeneficiaryCreationFlowContract$Step.Address) this.u).f99741a, null, null, null, this.v.f60940a, 7);
    }
}
