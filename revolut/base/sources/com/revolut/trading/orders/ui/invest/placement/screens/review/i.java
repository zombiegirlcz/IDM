package com.revolut.trading.orders.ui.invest.placement.screens.review;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ o u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, Continuation continuation) {
        super(1, continuation);
        this.u = oVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVar = this.u;
        OrderQuote.Slippage.Available availableK2 = o.K2(oVar);
        if (availableK2 != null) {
            if (availableK2.f104781j != com.revolut.shared.feature.market_data.models.domain.models.b.LARGE_ORDER) {
                availableK2 = null;
            }
            if (availableK2 != null) {
                oki.h.v2(oVar.f106983h0, new InvestOrderReviewScreenContract$ModalStep.LargeOrderWarning(availableK2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
            }
        }
        return Unit.f186387a;
    }
}
