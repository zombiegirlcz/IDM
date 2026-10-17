package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields;

import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.AccountFieldsScreenContract$ModalStep;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n4j.h;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ d u;
    public final /* synthetic */ AccountFieldsScreenContract$ModalStep v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o3j.b f99681w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, AccountFieldsScreenContract$ModalStep accountFieldsScreenContract$ModalStep, o3j.b bVar, Continuation continuation) {
        super(1, continuation);
        this.u = dVar;
        this.v = accountFieldsScreenContract$ModalStep;
        this.f99681w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.u, this.v, this.f99681w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = this.u;
        v3j.a aVar2 = dVar.f99690w;
        BeneficiaryInfoState currentInfo = dVar.K2();
        Field$BackendDefinition.DropdownDefinition field = ((AccountFieldsScreenContract$ModalStep.DefinitionSelector) this.v).f99676a;
        String selectedChoice = this.f99681w.f221827a.f99693a;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(currentInfo, "currentInfo");
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(selectedChoice, "selectedChoice");
        return h.b(currentInfo, Field$BackendDefinition.DropdownDefinition.b(field, selectedChoice));
    }
}
