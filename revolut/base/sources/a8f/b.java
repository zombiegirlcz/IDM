package a8f;

import aw0.o9;
import aw0.wa;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.trading.managed_portfolios.impl.R$plurals;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.performance.models.PortfolioInsightPerformanceMetricValue;
import d9.e1;
import java.math.RoundingMode;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nmc.d f2192a;

    public b(nmc.d roboPortfolioUIMapper) {
        Intrinsics.checkNotNullParameter(roboPortfolioUIMapper, "roboPortfolioUIMapper");
        this.f2192a = roboPortfolioUIMapper;
    }

    public final List a(PortfolioInsightPerformanceMetricValue item, int i, int i2) {
        Clause clauseE;
        Clause textLocalisedQuantityClause;
        Clause compositeClause;
        Intrinsics.checkNotNullParameter(item, "item");
        String strN = a0.d.n("PORTFOLIO_INSIGHT_TITLE_LIST_ID_", i);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        if (!(item instanceof PortfolioInsightPerformanceMetricValue.Percentage)) {
            if (item instanceof PortfolioInsightPerformanceMetricValue.PercentageRange) {
                Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);
                PortfolioInsightPerformanceMetricValue.PercentageRange percentageRange = (PortfolioInsightPerformanceMetricValue.PercentageRange) item;
                compositeClause = new CompositeClause(v.k(new PercentageClause(e1.Z(percentageRange.f91412a), (PercentageClause.Format) null, custom, 2), new PercentageClause(e1.Z(percentageRange.f91413b), (PercentageClause.Format) null, custom, 2)), new TextClause(" - ", (Style) custom, (Integer) null, false, (o9) null, (List) null, 124), null, null, 12);
            } else {
                if (item instanceof PortfolioInsightPerformanceMetricValue.Ratio) {
                    textLocalisedQuantityClause = new NumberClause(((PortfolioInsightPerformanceMetricValue.Ratio) item).f91414a, new NumberClause.Format.FixedDigitsAfterDot(2, 8, null, wa.SHOW_ALL_ZEROES, RoundingMode.HALF_EVEN), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8);
                } else if (item instanceof PortfolioInsightPerformanceMetricValue.RecoveryPeriodMonths) {
                    int i3 = R$plurals.wealth_robo_insights_description_max_drawdown_recovery_period_value;
                    int i5 = ((PortfolioInsightPerformanceMetricValue.RecoveryPeriodMonths) item).f91415a;
                    textLocalisedQuantityClause = new TextLocalisedQuantityClause(i3, Integer.valueOf(i5), u.c(Integer.valueOf(i5)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
                } else {
                    if (!(item instanceof PortfolioInsightPerformanceMetricValue.RiskLevel)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    clauseE = this.f2192a.e(((PortfolioInsightPerformanceMetricValue.RiskLevel) item).f91416a, elc.b.FOREGROUND);
                }
                compositeClause = textLocalisedQuantityClause;
            }
            List listK = v.k(new RowDelegate.Model(strN, null, textLocalisedClause, null, 0, null, null, null, 0, new RowDelegate.Model.c.b(compositeClause, null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, R$attr.uikit_dp0, 0, 0, 503313402), new PlainTextDelegate.Model(a0.d.n("PORTFOLIO_INSIGHT_TEXT_LIST_ID_", i), (Clause) null, (Clause) new TextLocalisedClause(i2, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp8, 0, 0, 0, 61422));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            return listK;
        }
        clauseE = new PercentageClause(e1.Z(((PortfolioInsightPerformanceMetricValue.Percentage) item).f91411a), (PercentageClause.Format) null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 2);
        compositeClause = clauseE;
        List listK2 = v.k(new RowDelegate.Model(strN, null, textLocalisedClause, null, 0, null, null, null, 0, new RowDelegate.Model.c.b(compositeClause, null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, R$attr.uikit_dp0, 0, 0, 503313402), new PlainTextDelegate.Model(a0.d.n("PORTFOLIO_INSIGHT_TEXT_LIST_ID_", i), (Clause) null, (Clause) new TextLocalisedClause(i2, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp8, 0, 0, 0, 61422));
        yp0.b.k(listK2, 0, 0, 0, 0, 31);
        return listK2;
    }
}
