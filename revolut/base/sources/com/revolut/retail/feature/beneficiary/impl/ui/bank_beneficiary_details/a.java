package com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details;

import com.revolut.feature.shared.beneficiary.api.navigation.BeneficiaryCreationKompotFinishMode;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationDestination;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.BankBeneficiaryDetailsScreenContract$ModalStep;
import gim.i;
import h3j.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function1 {
    public f5j.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f99667w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f99667w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f99667w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        f5j.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        b bVar = this.f99667w;
        if (i == 0) {
            o.b(obj2);
            f5j.a aVarI2 = bVar.I2();
            f0 f0Var = bVar.o;
            String str = bVar.f99669q.f99660b;
            this.u = aVarI2;
            this.v = 1;
            Object objA = f0Var.a(str, this);
            if (objA == aVar2) {
                return aVar2;
            }
            aVar = aVarI2;
            obj2 = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.u;
            o.b(obj2);
        }
        if (((Boolean) obj2).booleanValue()) {
            h.v2(bVar.u, new BankBeneficiaryDetailsScreenContract$ModalStep.EditConfirmationDialog(aVar), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return Unit.f186387a;
        }
        return bVar.C1(new BeneficiaryCreationDestination(BeneficiaryCreationKompotFinishMode.Finish.f86047a, new BeneficiaryCreationKompotInputData.CreationConfiguration.Edit(aVar, h0.f322473a)));
    }
}
