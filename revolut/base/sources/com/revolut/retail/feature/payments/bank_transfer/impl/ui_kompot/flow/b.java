package com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow;

import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow.BankTransferFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f102107w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ BankTransferFlowContract$Step.AddressUpdate f102108x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AddressFlowContract$OutputData f102109y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, BankTransferFlowContract$Step.AddressUpdate addressUpdate, AddressFlowContract$OutputData addressFlowContract$OutputData, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f102107w = str;
        this.f102108x = addressUpdate;
        this.f102109y = addressFlowContract$OutputData;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f102107w, this.f102108x, this.f102109y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            AddressFlowContract$OutputData addressFlowContract$OutputData = this.f102109y;
            c cVar = this.v;
            a aVar2 = new a(cVar, this.f102108x, addressFlowContract$OutputData, null);
            this.u = 1;
            if (u0.b0(cVar.X(), this.f102107w, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
