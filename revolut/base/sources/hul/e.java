package hul;

import aw0.n6;
import com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InvestOrderReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(InvestOrderReviewScreen investOrderReviewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = investOrderReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InvestOrderReviewScreen investOrderReviewScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar = (com.revolut.trading.orders.ui.invest.placement.screens.review.o) investOrderReviewScreen.e3();
                oVar.getClass();
                oVar.l2(new g0(oVar, null, 8), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
