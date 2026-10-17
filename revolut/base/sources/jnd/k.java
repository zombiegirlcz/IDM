package jnd;

import aw0.k7;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MoneyClause.Format.Defaults f176715a = new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14);

    public k(e budgetInfoMapper) {
        Intrinsics.checkNotNullParameter(budgetInfoMapper, "budgetInfoMapper");
    }

    public final i a(he3.j categoryGroup, yld.c chartStyle, d budgetData, lzi.j period, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval) {
        dj0.d dVarC;
        Boolean boolE;
        dj0.d dVarC2;
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(categoryGroup, "categoryGroup");
        Intrinsics.checkNotNullParameter(chartStyle, "chartStyle");
        Intrinsics.checkNotNullParameter(budgetData, "budgetData");
        he3.l lVar = categoryGroup.d;
        dj0.d categorySpent = categoryGroup.f151564b;
        String categoryId = categoryGroup.f151563a;
        if (lVar == he3.l.CATEGORY && chartStyle != yld.c.PIE_CHART && analyticsSpendingPeriod$Interval == null && period != null && (dVarC = e.c(budgetData, period, categoryId, categorySpent)) != null && (boolE = e.e(budgetData, period, categoryId, categorySpent)) != null) {
            boolean zBooleanValue = boolE.booleanValue();
            Intrinsics.checkNotNullParameter(budgetData, "budgetData");
            Intrinsics.checkNotNullParameter(period, "period");
            Intrinsics.checkNotNullParameter(categoryId, "categoryId");
            Intrinsics.checkNotNullParameter(categorySpent, "categorySpent");
            dj0.d dVarB = e.b(budgetData, period, categoryId);
            if (dVarB == null || (dVarC2 = e.c(budgetData, period, categoryId, categorySpent)) == null) {
                numValueOf = null;
            } else {
                long j2 = dVarB.f115082a;
                numValueOf = j2 <= 0 ? 0 : Integer.valueOf(kotlin.ranges.f.g(rim.d.b((dVarC2.f115082a / j2) * ((double) 100)), 0, 100));
            }
            if (numValueOf != null) {
                return new i(new TextLocalisedClause(zBooleanValue ? R$string.analytics_details_section_categories_budget_overspent : R$string.analytics_details_section_categories_budget_left, u.c(new MoneyClause(otd.f.a(dVarC.a()), f176715a, null, null, 12)), null, 12), ProgressStyle.Companion.c(ProgressStyle.INSTANCE, numValueOf.intValue(), R$attr.uikit_colorForeground));
            }
        }
        return null;
    }
}
