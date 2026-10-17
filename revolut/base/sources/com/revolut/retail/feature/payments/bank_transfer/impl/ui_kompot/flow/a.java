package com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow;

import com.revolut.data.network.models.beneficiary.mapper.BeneficiaryResponseMapperKt;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.address.models.Address;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow.BankTransferFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.r;
import r21.h;
import te0.w;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BankTransferFlowContract$Step.AddressUpdate f102105w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AddressFlowContract$OutputData f102106x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, BankTransferFlowContract$Step.AddressUpdate addressUpdate, AddressFlowContract$OutputData addressFlowContract$OutputData, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f102105w = addressUpdate;
        this.f102106x = addressFlowContract$OutputData;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f102105w, this.f102106x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        BankTransferFlowContract$Step.AddressUpdate addressUpdate = this.f102105w;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            d3j.b bVar = cVar.f102110p;
            f5j.a beneficiary = addressUpdate.f102100a;
            Address newAddress = this.f102106x.f60940a;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            Intrinsics.checkNotNullParameter(newAddress, "newAddress");
            f5j.b bVar2 = beneficiary.v;
            f5j.b fields = bVar2 != null ? new f5j.b(bVar2.f132346a, bVar2.f132347b, bVar2.f132348c, bVar2.d, newAddress) : new f5j.b(null, null, null, null, newAddress);
            o71.a aVar2 = bVar.f111211a;
            String id10 = beneficiary.f132329a;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(fields, "fields");
            r rVarG0 = w.g0(((h) aVar2).f251037a.submitBeneficiaryByIdExtraFields(id10, BeneficiaryResponseMapperKt.toNetworkModel(fields)));
            this.u = 1;
            if (nim.a.a(rVarG0, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        cVar.I2(addressUpdate.f102100a, addressUpdate.f102101b, false);
        return Unit.f186387a;
    }
}
