package f28;

import aw0.ja;
import aw0.l1;
import aw0.o9;
import aw0.u6;
import aw0.w6;
import aw0.x6;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.LineChartResizableTileDelegate;
import com.revolut.core.ui_kit.delegates.w7;
import com.revolut.core.ui_kit.delegates.widgets.LineChartTileWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 {
    public static LineChartTileWidgetDelegate.Model b(e0 e0Var, String str, String str2, ja jaVar, boolean z, List list, u6 u6Var, MoneyClause moneyClause, int i) {
        return LineChartTileWidgetDelegate.Model.Companion.a(LineChartTileWidgetDelegate.Model.INSTANCE, str, new LineChartResizableTileDelegate.Model(str2, list, jaVar, new x6(zhm.u.c(new w6(z ? R$attr.uikit_colorPerformancePositive : R$attr.uikit_colorPerformanceNegative, z ? R$attr.uikit_colorPerformancePositive_30 : R$attr.uikit_colorPerformanceNegative_30, R$attr.uikit_colorTransparent, BitmapDescriptorFactory.HUE_RED, 1.0f, false, 64))), new l1.c(0), w7.MEDIUM, null, (i & 64) != 0 ? null : moneyClause, null, (i & 32) != 0 ? null : u6Var, null, 7488));
    }

    public static TextLocalisedClause c(h0 timeframe) {
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        switch (d0.f131458a[timeframe.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.wealth_analytics_timeframe_one_day_chart_title, null, null, 14);
            case 2:
                return new TextLocalisedClause(R$string.wealth_analytics_timeframe_one_week_chart_title, null, null, 14);
            case 3:
                return new TextLocalisedClause(R$string.wealth_analytics_timeframe_one_month_chart_title, null, null, 14);
            case 4:
                return new TextLocalisedClause(R$string.wealth_analytics_timeframe_six_months_chart_title, null, null, 14);
            case 5:
                return new TextLocalisedClause(R$string.wealth_analytics_timeframe_one_year_chart_title, null, null, 14);
            case 6:
                return new TextLocalisedClause(R$string.wealth_analytics_timeframe_all_time_chart_title, null, null, 14);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static float d(int i, int i2) {
        if (i2 == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(i2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(bigDecimalValueOf2, MathContext.DECIMAL128);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide.floatValue();
    }

    public final LineChartTileWidgetDelegate.Model a(Clause clause, TextLocalisedClause textLocalisedClause, String str) {
        ja jaVar = new ja(textLocalisedClause, clause, null);
        zhm.f0 f0Var = zhm.f0.f322471a;
        m70.a.c(t0.f186434a);
        return b(this, str, "EMPTY_ANALYTICS_WIDGET_LIST_ID", jaVar, true, f0Var, new u6(BitmapDescriptorFactory.HUE_RED, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 12), null, 64);
    }
}
