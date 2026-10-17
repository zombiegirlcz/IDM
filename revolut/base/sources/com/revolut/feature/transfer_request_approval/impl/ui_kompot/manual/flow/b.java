package com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow;

import buf.h;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow.ManualTransferFlowContract$Step;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.ManualTransferReviewScreenContract$InputData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ c u;
    public final /* synthetic */ h v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, h hVar, Continuation continuation) {
        super(2, continuation);
        this.u = cVar;
        this.v = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = this.v;
        this.u.E2(new ManualTransferFlowContract$Step.Review(new ManualTransferReviewScreenContract$InputData(hVar.f18805b, hVar.f18804a)), true, null, false);
        return Unit.f186387a;
    }
}
