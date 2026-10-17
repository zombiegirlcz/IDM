package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow;

import com.revolut.domain.models.banktransfer.AccountFieldType;
import com.revolut.domain.models.beneficiary.ConfirmationResult;
import com.revolut.feature.shared.beneficiary.api.confirmation_of_payee.BeneficiaryCreationType;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.BeneficiaryCreationFlowContract$Step;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n61.j;
import v4j.h;
import yhm.o;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ f u;
    public final /* synthetic */ f6d.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BeneficiaryCreationFlowContract$Step f99750w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, f6d.d dVar, BeneficiaryCreationFlowContract$Step beneficiaryCreationFlowContract$Step, Continuation continuation) {
        super(1, continuation);
        this.u = fVar;
        this.v = dVar;
        this.f99750w = beneficiaryCreationFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.u, this.v, this.f99750w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h hVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        v4j.i iVar = this.u.f99754p;
        BeneficiaryCreationType replacementName = ((f6d.c) this.v).f132417a;
        BeneficiaryCreationFlowContract$Step.ConfirmationOfPayee confirmationOfPayee = (BeneficiaryCreationFlowContract$Step.ConfirmationOfPayee) this.f99750w;
        BeneficiaryCreationFlowContract$CreationProcessState creationProcessState = confirmationOfPayee.f99743a;
        ConfirmationResult confirmationResult = confirmationOfPayee.f99744b;
        a5j.b bVar = iVar.f286115a;
        Intrinsics.checkNotNullParameter(replacementName, "replacementName");
        Intrinsics.checkNotNullParameter(creationProcessState, "creationProcessState");
        Intrinsics.checkNotNullParameter(confirmationResult, "confirmationResult");
        List list = creationProcessState.f99738b;
        if (list == null) {
            list = f0.f322471a;
        }
        BeneficiaryInfoState infoState = creationProcessState.f99737a;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((Field$BackendDefinition) it8.next()).getF99718a().f60271a);
        }
        if (replacementName instanceof BeneficiaryCreationType.Business) {
            hVar = new h(u.c(v4j.i.a(AccountFieldType.COMPANY_NAME, ((BeneficiaryCreationType.Business) replacementName).f86041a)), s4j.b.Business);
        } else {
            if (!(replacementName instanceof BeneficiaryCreationType.Personal)) {
                throw new NoWhenBranchMatchedException();
            }
            BeneficiaryCreationType.Personal personal = (BeneficiaryCreationType.Personal) replacementName;
            hVar = new h(v.k(v4j.i.a(AccountFieldType.FIRST_NAME, personal.f86042a), v4j.i.a(AccountFieldType.LAST_NAME, personal.f86043b)), s4j.b.Personal);
        }
        boolean zIsEmpty = arrayList.isEmpty();
        s4j.b newAccountType = hVar.f286114b;
        List list3 = hVar.f286113a;
        if (!zIsEmpty) {
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                if (kotlin.collections.d.I(j.f212688a, (String) it9.next())) {
                    ArrayList arrayListB = v4j.i.b(list, list3);
                    List updatedFields = infoState.getF99711g();
                    Intrinsics.checkNotNullParameter(infoState, "infoState");
                    Intrinsics.checkNotNullParameter(updatedFields, "updatedFields");
                    Intrinsics.checkNotNullParameter(newAccountType, "newAccountType");
                    return BeneficiaryCreationFlowContract$CreationProcessState.a(creationProcessState, n4j.h.a(infoState, updatedFields, newAccountType), arrayListB, a5j.b.b(confirmationResult), null, 8);
                }
            }
        }
        ArrayList updatedFields2 = v4j.i.b(infoState.getF99711g(), list3);
        Intrinsics.checkNotNullParameter(infoState, "infoState");
        Intrinsics.checkNotNullParameter(updatedFields2, "updatedFields");
        Intrinsics.checkNotNullParameter(newAccountType, "newAccountType");
        return BeneficiaryCreationFlowContract$CreationProcessState.a(creationProcessState, n4j.h.a(infoState, updatedFields2, newAccountType), null, a5j.b.b(confirmationResult), null, 10);
    }
}
