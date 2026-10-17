package kxk;

import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.feature.trading_hours.impl.ui.market_hours.MarketHoursController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ MarketHoursController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(MarketHoursController marketHoursController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = marketHoursController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        MarketHoursController marketHoursController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((n) marketHoursController.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVar = (n) marketHoursController.e3();
                nVar.getClass();
                nVar.C1(new ExternalDestination.Browser("https://help.revolut.com/help/wealth/stocks/trading-stocks/when-can-i-trade/when-can-i-trade/?geo-redirect=true", null));
                break;
        }
        return Unit.f186387a;
    }
}
