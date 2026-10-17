package n8f;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.strategy_overview.StrategyOverviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ StrategyOverviewScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(StrategyOverviewScreen strategyOverviewScreen, Continuation continuation) {
        super(2, continuation);
        this.u = strategyOverviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((s) ((j) this.u.g0.getValue())).v.a();
        return Unit.f186387a;
    }
}
