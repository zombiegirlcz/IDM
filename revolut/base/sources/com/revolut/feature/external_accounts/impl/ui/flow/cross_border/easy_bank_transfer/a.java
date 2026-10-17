package com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer;

import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.CrossBorderEasyBankTransferFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ CrossBorderEasyBankTransferFlowContract$Step u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CrossBorderEasyBankTransferFlowContract$Step crossBorderEasyBankTransferFlowContract$Step, e eVar, Continuation continuation) {
        super(1, continuation);
        this.u = crossBorderEasyBankTransferFlowContract$Step;
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
        CrossBorderEasyBankTransferFlowContract$Step crossBorderEasyBankTransferFlowContract$Step = this.u;
        e.I2(this.v, ((CrossBorderEasyBankTransferFlowContract$Step.Instructions) crossBorderEasyBankTransferFlowContract$Step).f72836a, ((CrossBorderEasyBankTransferFlowContract$Step.Instructions) crossBorderEasyBankTransferFlowContract$Step).f72837b, ((CrossBorderEasyBankTransferFlowContract$Step.Instructions) crossBorderEasyBankTransferFlowContract$Step).d, ((CrossBorderEasyBankTransferFlowContract$Step.Instructions) crossBorderEasyBankTransferFlowContract$Step).e, null);
        return Unit.f186387a;
    }
}
