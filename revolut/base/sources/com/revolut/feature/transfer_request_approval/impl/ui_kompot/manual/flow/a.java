package com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow;

import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.ManualTransferContract$InputData;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow.ManualTransferFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import gim.i;
import iuf.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ c u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, n nVar, Continuation continuation) {
        super(2, continuation);
        this.u = cVar;
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = this.u;
        cVar.E2(new ManualTransferFlowContract$Step.Amount(new ManualTransferContract$InputData.WithTransferData(cVar.f92477t.f79597a, this.v.f168573a)), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false);
        return Unit.f186387a;
    }
}
