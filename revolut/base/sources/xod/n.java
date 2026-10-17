package xod;

import aw0.l2;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.widgets.j0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.tracking.TrackableAction;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zod.d0;
import zod.e0;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f307815a;

    public n(l80.e dateProvider, x chartWithDetailsSubtitleMapper) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(chartWithDetailsSubtitleMapper, "chartWithDetailsSubtitleMapper");
        this.f307815a = dateProvider;
    }

    public static CompositeClause d(zod.a widgetType, dj0.d dVar) {
        l lVar;
        k kVar;
        Clause moneyClause;
        Float fValueOf = Float.valueOf(10.0f);
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (dVar == null || dVar.k()) {
            lVar = null;
        } else {
            int[] iArr = m.f307814a;
            switch (iArr[widgetType.ordinal()]) {
                case 1:
                case 2:
                    dj0.d dVar2 = dj0.d.e;
                    kVar = new k(dVar.f(dVar2) ? R$attr.uikit_colorPerformanceNegative : R$attr.uikit_colorPerformancePositive, dVar.f(dVar2) ? R$drawable.uikit_icn_10_stocks_arrow_up : R$drawable.uikit_icn_10_stocks_arrow_down);
                    break;
                case 3:
                case 4:
                case 6:
                    dj0.d dVar3 = dj0.d.e;
                    kVar = new k(dVar.f(dVar3) ? R$attr.uikit_colorPerformancePositive : R$attr.uikit_colorPerformanceNegative, dVar.f(dVar3) ? R$drawable.uikit_icn_10_stocks_arrow_up : R$drawable.uikit_icn_10_stocks_arrow_down);
                    break;
                case 5:
                    dj0.d dVar4 = dj0.d.e;
                    kVar = new k(dVar.f(dVar4) ? R$attr.uikit_colorPerformancePositive : R$attr.uikit_colorPerformanceNegative, dVar.f(dVar4) ? R$drawable.uikit_icn_16_plus_circle : R$drawable.uikit_icn_16_minus_circle);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            int i = iArr[widgetType.ordinal()];
            int i2 = kVar.f307810a;
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                    moneyClause = new MoneyClause(otd.f.a(dVar.a()), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(i2), false, null, false, null, 254), null, 8);
                    break;
                case 5:
                    moneyClause = !dVar.f(dj0.d.e) ? new TextLocalisedClause(R$string.analytics_dashboard_widget_cashflow_negative_title, null, new Custom(Integer.valueOf(i2), false, null, false, null, 254), 10) : new TextLocalisedClause(R$string.analytics_dashboard_widget_cashflow_positive_title, null, new Custom(Integer.valueOf(i2), false, null, false, null, 254), 10);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            lVar = new l(moneyClause, kVar);
        }
        if (lVar == null) {
            return null;
        }
        k kVar2 = lVar.f307813b;
        List listK = zhm.v.k(new ImageClause(kVar2.f307811b, new ImageClauseTint.Color(kVar2.f307810a), fValueOf, fValueOf, 16), lVar.f307812a);
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static MoneyClause e(zod.a type, dj0.d total) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(total, "total");
        if (!zhm.v.k(zod.a.NET_BALANCE, zod.a.CASHFLOW).contains(type)) {
            total = total.a();
        }
        return new MoneyClause(otd.f.a(total), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
    }

    public static TextLocalisedClause f(zod.a type) {
        int i;
        Intrinsics.checkNotNullParameter(type, "type");
        switch (m.f307814a[type.ordinal()]) {
            case 1:
                i = R$string.analytics_dashboard_widget_spent_title;
                break;
            case 2:
                i = R$string.analytics_dashboard_widget_expenses_title;
                break;
            case 3:
                i = R$string.analytics_dashboard_widget_balance_title;
                break;
            case 4:
                i = R$string.analytics_dashboard_widget_income_title;
                break;
            case 5:
                i = R$string.analytics_dashboard_widget_net_cashflow_title;
                break;
            case 6:
                i = R$string.analytics_dashboard_widget_sales_title;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public static TrackableAction.Custom g(zod.a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new TrackableAction.Custom(f(type));
    }

    public static int h(AnalyticsAccountsSelection analyticsAccountsSelection) {
        Set<AnalyticsAccount> f99208a = analyticsAccountsSelection.getF99208a();
        if (!(f99208a instanceof Collection) || !f99208a.isEmpty()) {
            for (AnalyticsAccount analyticsAccount : f99208a) {
                if (!(analyticsAccount instanceof AnalyticsAccount.Savings.JuniorSaving) && !(analyticsAccount instanceof AnalyticsAccount.Junior)) {
                    return R$string.analytics_dashboard_widget_spent_empty_subtitle;
                }
            }
        }
        return R$string.analytics_dashboard_widget_spent_empty_subtitle_junior;
    }

    public final j0 a(e0 chartDetails, dj0.d dVar, l2 l2Var) {
        Intrinsics.checkNotNullParameter(chartDetails, "chartDetails");
        if (dVar == null || l2Var == null || (chartDetails instanceof zod.z)) {
            return null;
        }
        if (chartDetails instanceof d0) {
            return x.a(otd.f.c(3, null, null, otd.f.a(dVar.a())), dVar, l2Var, v.ARROW_UP_ON_INCREASE);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final TextLocalisedClause b(zod.a widgetType, AnalyticsSpendingPeriod$Interval interval, AnalyticsAccountsSelection accountsSelection) {
        int iH;
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(accountsSelection, "accountsSelection");
        LocalDate localDate = interval.f99210a;
        LocalDate localDate2 = interval.f99211b;
        LocalDate localDateE = ((l80.f) this.f307815a).e();
        boolean z = false;
        if (localDateE.compareTo((Object) localDate) >= 0 && localDateE.compareTo((Object) localDate2) <= 0) {
            z = true;
        }
        switch (m.f307814a[widgetType.ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                iH = !z ? R$string.analytics_chart_spent_empty_title : h(accountsSelection);
                break;
            case 3:
                iH = !z ? R$string.analytics_chart_net_balance_savings_empty_title : R$string.analytics_dashboard_widget_net_balance_savings_empty_subtitle;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(iH, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 10);
    }

    public final TextLocalisedClause c(zod.a widgetType, AnalyticsSpendingPeriod$Interval interval, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, AnalyticsAccountsSelection accountsSelection) throws Throwable {
        int iH;
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(accountsSelection, "accountsSelection");
        int i = m.f307814a[widgetType.ordinal()];
        l80.e eVar = this.f307815a;
        switch (i) {
            case 1:
            case 2:
                if (analyticsSpendingPeriod$Interval != null) {
                    LocalDate localDate = interval.f99210a;
                    LocalDate localDate2 = interval.f99211b;
                    LocalDate localDateE = ((l80.f) eVar).e();
                    iH = (localDateE.compareTo((Object) localDate) >= 0 && localDateE.compareTo((Object) localDate2) <= 0) ? R$string.analytics_dashboard_widget_spent_empty_subtitle_current_period : R$string.analytics_dashboard_widget_spent_empty_subtitle_previous_period;
                } else {
                    iH = h(accountsSelection);
                }
                break;
            case 3:
                if (analyticsSpendingPeriod$Interval != null) {
                    LocalDate localDate3 = interval.f99210a;
                    LocalDate localDate4 = interval.f99211b;
                    LocalDate localDateE2 = ((l80.f) eVar).e();
                    iH = (localDateE2.compareTo((Object) localDate3) >= 0 && localDateE2.compareTo((Object) localDate4) <= 0) ? R$string.analytics_dashboard_widget_net_balance_savings_empty_subtitle_current_period : R$string.analytics_dashboard_widget_net_balance_savings_empty_subtitle_previous_period;
                } else {
                    iH = R$string.analytics_dashboard_widget_net_balance_savings_empty_subtitle;
                }
                break;
            case 4:
            case 5:
            case 6:
                hx7.e.n(new IllegalArgumentException(widgetType + " empty clause not supported yet"));
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(iH, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 10);
    }
}
