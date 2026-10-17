package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow;

import c5j.k;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.BeneficiaryCreationFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ BeneficiaryCreationFlowContract$Step u;
    public final /* synthetic */ k v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BeneficiaryCreationFlowContract$Step beneficiaryCreationFlowContract$Step, k kVar, Continuation continuation) {
        super(1, continuation);
        this.u = beneficiaryCreationFlowContract$Step;
        this.v = kVar;
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
        return BeneficiaryCreationFlowContract$CreationProcessState.a(((BeneficiaryCreationFlowContract$Step.MissingFields) this.u).f99747a, null, this.v.f21571a, null, null, 13);
    }
}
