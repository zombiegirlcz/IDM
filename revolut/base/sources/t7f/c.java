package t7f;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.PortfolioInsightsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PortfolioInsightsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PortfolioInsightsScreen portfolioInsightsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = portfolioInsightsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.T.getValue();
        Intrinsics.h(model);
        com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.a aVar2 = (com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.a) eVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.k, "PortfolioInsightsScreenError")) {
            aVar2.f91384t.a();
        }
        return Unit.f186387a;
    }
}
