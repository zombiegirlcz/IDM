package cpd;

import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import java.util.Set;
import knd.v;
import knd.y0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    @NotNull
    private static final a Companion = new a();
    public static final Set i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set f107940j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zq.a f107941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ge3.e f107942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f107943c;
    public final knd.e d;
    public final jnd.h e;
    public final ugc.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f107944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CoroutineScope f107945h;

    static {
        zod.a[] elements = {zod.a.SPENDING, zod.a.EXPENSES, zod.a.NET_BALANCE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        i = kotlin.collections.d.y0(elements);
        zod.a[] elements2 = {zod.a.INCOME, zod.a.SALES};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        f107940j = kotlin.collections.d.y0(elements2);
    }

    public g(zq.a periodDifferenceHelper, h widgetChartDataProvider, ge3.e transactionCategorisationInteractor, v analyticsDataProvider, knd.e analyticsAccountBalanceProvider, y0 initialBalancesByPeriodProvider, jnd.h analyticsBudgetProvider, ugc.a analyticsBudgetDetailsMapper, gte.a featureToggleInteractor, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(periodDifferenceHelper, "periodDifferenceHelper");
        Intrinsics.checkNotNullParameter(widgetChartDataProvider, "widgetChartDataProvider");
        Intrinsics.checkNotNullParameter(transactionCategorisationInteractor, "transactionCategorisationInteractor");
        Intrinsics.checkNotNullParameter(analyticsDataProvider, "analyticsDataProvider");
        Intrinsics.checkNotNullParameter(analyticsAccountBalanceProvider, "analyticsAccountBalanceProvider");
        Intrinsics.checkNotNullParameter(initialBalancesByPeriodProvider, "initialBalancesByPeriodProvider");
        Intrinsics.checkNotNullParameter(analyticsBudgetProvider, "analyticsBudgetProvider");
        Intrinsics.checkNotNullParameter(analyticsBudgetDetailsMapper, "analyticsBudgetDetailsMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f107941a = periodDifferenceHelper;
        this.f107942b = transactionCategorisationInteractor;
        this.f107943c = analyticsDataProvider;
        this.d = analyticsAccountBalanceProvider;
        this.e = analyticsBudgetProvider;
        this.f = analyticsBudgetDetailsMapper;
        this.f107944g = featureToggleInteractor;
        this.f107945h = coroutineScope;
    }

    public final boolean a(zod.c cVar) {
        zod.a aVar = cVar.f323980c;
        if (!((jte.d) this.f107944g).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c)) {
            return false;
        }
        if (i.contains(aVar)) {
            return true;
        }
        return cVar.f323979b == yld.c.PIE_CHART && f107940j.contains(aVar);
    }
}
