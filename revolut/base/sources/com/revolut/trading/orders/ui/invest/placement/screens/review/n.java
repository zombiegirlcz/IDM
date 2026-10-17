package com.revolut.trading.orders.ui.invest.placement.screens.review;

import com.revolut.feature.trading_orders.api.ui.widgets.free_trades_incentive.FreeTradesIncentiveContract$FreeTradesLimit;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreenContract$ModalStep;
import cul.z1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.q;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        o oVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            jhi.b bVarG = mo3.a.g(rd0.e.n(new z1(oVar.N.j(), 1), y0.b(new Pair("InvestOrderReviewScreenModel", "showCommissionFreeTradesInfoDialog invalid data"))), null, new ht1.l(20), 1);
            this.u = 1;
            obj2 = q.z(bVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        FreeTradesIncentiveContract$FreeTradesLimit freeTradesIncentiveContract$FreeTradesLimit = (FreeTradesIncentiveContract$FreeTradesLimit) obj2;
        if (freeTradesIncentiveContract$FreeTradesLimit == null) {
            return null;
        }
        oki.h.v2(oVar.f106983h0, new InvestOrderReviewScreenContract$ModalStep.CommissionFreeTradeDialog(freeTradesIncentiveContract$FreeTradesLimit), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
