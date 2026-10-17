package com.revolut.trading.orders.ui.invest.placement.screens.review;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ o u;
    public final /* synthetic */ bfl.g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, bfl.g gVar, Continuation continuation) {
        super(1, continuation);
        this.u = oVar;
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        oki.h.v2(this.u.f106983h0, new InvestOrderReviewScreenContract$ModalStep.SettlementDate(this.v), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
