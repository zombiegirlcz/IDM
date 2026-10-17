package inc;

import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.PortfolioStrategyInformationScreen;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PortfolioStrategyInformationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(PortfolioStrategyInformationScreen portfolioStrategyInformationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = portfolioStrategyInformationScreen;
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
        PortfolioStrategyInformationScreen portfolioStrategyInformationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.a) portfolioStrategyInformationScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.a aVar3 = (com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.a) portfolioStrategyInformationScreen.e3();
                aVar3.getClass();
                aVar3.C1(u0.b(new FeatureCommand(new FaqFeatureConfig.Starter("portfolio-strategy-report", 2))));
                break;
        }
        return Unit.f186387a;
    }
}
