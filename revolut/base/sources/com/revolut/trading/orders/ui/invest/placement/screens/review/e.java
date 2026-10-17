package com.revolut.trading.orders.ui.invest.placement.screens.review;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreenContract$ModalStep;
import hu1.h0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.q;
import vkm.t0;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o oVar, Continuation continuation) {
        super(1, continuation);
        this.v = oVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        o oVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            jhi.b bVarG = mo3.a.g(new t0(oVar.g0.B(new h0(19)), 1), null, new ht1.l(14), 1);
            this.u = 1;
            obj2 = q.x(bVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        oki.h.v2(oVar.f106983h0, new InvestOrderReviewScreenContract$ModalStep.CbpDisclosure((TradingLegalEntityInformation) obj2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
