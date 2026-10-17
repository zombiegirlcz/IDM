package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow;

import com.revolut.domain.models.beneficiary.ConfirmationResult;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.BeneficiaryCreationFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ BeneficiaryCreationFlowContract$Step u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BeneficiaryCreationFlowContract$Step beneficiaryCreationFlowContract$Step, f fVar, Continuation continuation) {
        super(1, continuation);
        this.u = beneficiaryCreationFlowContract$Step;
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        BeneficiaryCreationFlowContract$Step.ConfirmationOfPayee confirmationOfPayee = (BeneficiaryCreationFlowContract$Step.ConfirmationOfPayee) this.u;
        BeneficiaryCreationFlowContract$CreationProcessState beneficiaryCreationFlowContract$CreationProcessState = confirmationOfPayee.f99743a;
        a5j.b bVar = this.v.f99758t;
        ConfirmationResult confirmationResult = confirmationOfPayee.f99744b;
        bVar.getClass();
        return BeneficiaryCreationFlowContract$CreationProcessState.a(beneficiaryCreationFlowContract$CreationProcessState, null, null, a5j.b.b(confirmationResult), null, 11);
    }
}
