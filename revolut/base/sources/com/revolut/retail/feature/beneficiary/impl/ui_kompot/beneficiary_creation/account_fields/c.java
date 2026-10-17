package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields;

import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.AccountFieldsScreenContract$ModalStep;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$ExpansionDefinition;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AccountFieldsScreenContract$ModalStep f99683w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o3j.b f99684x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, AccountFieldsScreenContract$ModalStep accountFieldsScreenContract$ModalStep, o3j.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f99683w = accountFieldsScreenContract$ModalStep;
        this.f99684x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f99683w, this.f99684x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        d dVar = this.v;
        w3j.b bVar = dVar.v;
        BeneficiaryInfoState beneficiaryInfoStateK2 = dVar.K2();
        Field$ExpansionDefinition field$ExpansionDefinition = ((AccountFieldsScreenContract$ModalStep.ExpansionSelector) this.f99683w).f99678a;
        String str = this.f99684x.f221827a.f99693a;
        this.u = 1;
        Object objA = bVar.a(beneficiaryInfoStateK2, field$ExpansionDefinition, str, this);
        return objA == aVar ? aVar : objA;
    }
}
