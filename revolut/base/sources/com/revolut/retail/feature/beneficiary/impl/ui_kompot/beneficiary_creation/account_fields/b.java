package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields;

import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.AccountFieldsScreenContract$ModalStep;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m4j.h;
import n4j.j;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function1 {
    public final /* synthetic */ d u;
    public final /* synthetic */ AccountFieldsScreenContract$ModalStep v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f99682w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, AccountFieldsScreenContract$ModalStep accountFieldsScreenContract$ModalStep, h hVar, Continuation continuation) {
        super(1, continuation);
        this.u = dVar;
        this.v = accountFieldsScreenContract$ModalStep;
        this.f99682w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.u, this.v, this.f99682w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = this.u;
        v3j.b bVar = dVar.u;
        BeneficiaryInfoState currentInfo = dVar.K2();
        Field$BackendDefinition.SearchList field = ((AccountFieldsScreenContract$ModalStep.SearchList) this.v).f99680a;
        String selectedItem = this.f99682w.f202739a.f60293a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(currentInfo, "currentInfo");
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        return n4j.h.b(currentInfo, Field$BackendDefinition.SearchList.b(field, j.a(field.f99718a.f60271a, field.f99719b, selectedItem)));
    }
}
