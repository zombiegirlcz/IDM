package q87;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.market.MarketDetailsRedesignScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ MarketDetailsRedesignScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(MarketDetailsRedesignScreen marketDetailsRedesignScreen, Continuation continuation) {
        super(2, continuation);
        this.u = marketDetailsRedesignScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a aVar2 = (com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a) this.u.d();
        aVar2.getClass();
        aVar2.n2(new y(0, aVar2, null), new whi.b(6));
        return Unit.f186387a;
    }
}
