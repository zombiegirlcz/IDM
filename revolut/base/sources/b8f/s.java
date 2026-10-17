package b8f;

import com.revolut.core.ui_kit.delegates.qh;
import com.revolut.feature.robo.api.model.RiskMetrics;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.PortfolioInsightsPerformanceControllerContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.models.PortfolioInsightPerformanceMetric;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PortfolioRevealScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(PortfolioRevealScreen portfolioRevealScreen, Continuation continuation) {
        super(2, continuation);
        this.v = portfolioRevealScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.v, continuation);
        sVar.u = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((qh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        qh qhVar = (qh) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        int i = r.f13249a[qhVar.f54639b.ordinal()];
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        PortfolioRevealScreen portfolioRevealScreen = this.v;
        if (i == 1) {
            com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.b bVar = (com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.b) portfolioRevealScreen.d();
            RiskMetrics.ReturnBreakDown returnBreakDown = bVar.o.f91428c.f85042s;
            if (returnBreakDown != null) {
                BigDecimal bigDecimal = returnBreakDown.f85044a;
                BigDecimal bigDecimal2 = returnBreakDown.f85045b;
                RiskMetrics.ReturnBreakDown.OngoingCharges ongoingCharges = returnBreakDown.f85046c;
                oki.h.v2(bVar.f91435r, new PortfolioRevealScreenContract$ModalStep.PortfolioInsight(new PortfolioInsightsPerformanceControllerContract$InputData(bVar.o.f91426a, new PortfolioInsightPerformanceMetric.AverageAnnualReturnBreakdown(bigDecimal, bigDecimal2, ongoingCharges != null ? new PortfolioInsightPerformanceMetric.ProductFeeRange(ongoingCharges.f85047a, ongoingCharges.f85048b) : null))), popup);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.b bVar2 = (com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.b) portfolioRevealScreen.d();
            xdh.a aVar2 = bVar2.o.f91427b.f91247g;
            if (aVar2 != null) {
                oki.h.v2(bVar2.f91435r, new PortfolioRevealScreenContract$ModalStep.PortfolioInsight(new PortfolioInsightsPerformanceControllerContract$InputData(bVar2.o.f91426a, new PortfolioInsightPerformanceMetric.RiskLevel(aVar2))), popup);
            }
        }
        return Unit.f186387a;
    }
}
