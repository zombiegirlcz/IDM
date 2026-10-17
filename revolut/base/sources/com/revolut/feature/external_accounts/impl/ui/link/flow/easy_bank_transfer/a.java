package com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer;

import com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.EasyBankTransferFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ EasyBankTransferFlowContract$Step u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EasyBankTransferFlowContract$Step easyBankTransferFlowContract$Step, e eVar, Continuation continuation) {
        super(1, continuation);
        this.u = easyBankTransferFlowContract$Step;
        this.v = eVar;
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
        EasyBankTransferFlowContract$Step easyBankTransferFlowContract$Step = this.u;
        this.v.I2(((EasyBankTransferFlowContract$Step.Instructions) easyBankTransferFlowContract$Step).f72973a, ((EasyBankTransferFlowContract$Step.Instructions) easyBankTransferFlowContract$Step).f72974b, null, ((EasyBankTransferFlowContract$Step.Instructions) easyBankTransferFlowContract$Step).d);
        return Unit.f186387a;
    }
}
