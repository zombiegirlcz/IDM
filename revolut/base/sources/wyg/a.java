package wyg;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChartPoint;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.retail.feature.crypto.disclaimer.api.DisclaimerParams;
import com.revolut.shared.feature.wealth.models.config.Links;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vyg.c f301272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WidgetisedAnalyticsType f301273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hel.b f301274c;
    public final boolean d;
    public final DisclaimerParams e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final iwg.c f301275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f301276h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PerformanceChartPoint f301277j;
    public final Pair k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f301278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vyg.e f301279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Data f301280n;
    public final Links o;

    public a(vyg.c selectedTimeframe, WidgetisedAnalyticsType selectedAnalyticsType, hel.b bVar, boolean z, DisclaimerParams disclaimerParams, Data contributorsData, iwg.c selectedCalculationMethodType, List availableCalculationMethods, Data performanceChartData, PerformanceChartPoint performanceChartPoint, Pair pair, List contributorCategories, vyg.e selectedContributorCategory, Data data, Links links) {
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        Intrinsics.checkNotNullParameter(selectedAnalyticsType, "selectedAnalyticsType");
        Intrinsics.checkNotNullParameter(contributorsData, "contributorsData");
        Intrinsics.checkNotNullParameter(selectedCalculationMethodType, "selectedCalculationMethodType");
        Intrinsics.checkNotNullParameter(availableCalculationMethods, "availableCalculationMethods");
        Intrinsics.checkNotNullParameter(performanceChartData, "performanceChartData");
        Intrinsics.checkNotNullParameter(contributorCategories, "contributorCategories");
        Intrinsics.checkNotNullParameter(selectedContributorCategory, "selectedContributorCategory");
        this.f301272a = selectedTimeframe;
        this.f301273b = selectedAnalyticsType;
        this.f301274c = bVar;
        this.d = z;
        this.e = disclaimerParams;
        this.f = contributorsData;
        this.f301275g = selectedCalculationMethodType;
        this.f301276h = availableCalculationMethods;
        this.i = performanceChartData;
        this.f301277j = performanceChartPoint;
        this.k = pair;
        this.f301278l = contributorCategories;
        this.f301279m = selectedContributorCategory;
        this.f301280n = data;
        this.o = links;
    }

    public static a a(a aVar, vyg.c cVar, DisclaimerParams disclaimerParams, Data data, iwg.c cVar2, Data data2, PerformanceChartPoint performanceChartPoint, Pair pair, vyg.e eVar, Data data3, int i) {
        vyg.c selectedTimeframe = (i & 1) != 0 ? aVar.f301272a : cVar;
        WidgetisedAnalyticsType selectedAnalyticsType = aVar.f301273b;
        hel.b bVar = aVar.f301274c;
        boolean z = aVar.d;
        DisclaimerParams disclaimerParams2 = (i & 16) != 0 ? aVar.e : disclaimerParams;
        Data contributorsData = (i & 32) != 0 ? aVar.f : data;
        iwg.c selectedCalculationMethodType = (i & 64) != 0 ? aVar.f301275g : cVar2;
        List availableCalculationMethods = aVar.f301276h;
        Data performanceChartData = (i & 256) != 0 ? aVar.i : data2;
        PerformanceChartPoint performanceChartPoint2 = (i & 512) != 0 ? aVar.f301277j : performanceChartPoint;
        Pair pair2 = (i & 1024) != 0 ? aVar.k : pair;
        List contributorCategories = aVar.f301278l;
        vyg.e selectedContributorCategory = (i & 4096) != 0 ? aVar.f301279m : eVar;
        Data data4 = (i & 8192) != 0 ? aVar.f301280n : data3;
        Links links = aVar.o;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        Intrinsics.checkNotNullParameter(selectedAnalyticsType, "selectedAnalyticsType");
        Intrinsics.checkNotNullParameter(contributorsData, "contributorsData");
        Intrinsics.checkNotNullParameter(selectedCalculationMethodType, "selectedCalculationMethodType");
        Intrinsics.checkNotNullParameter(availableCalculationMethods, "availableCalculationMethods");
        Intrinsics.checkNotNullParameter(performanceChartData, "performanceChartData");
        Intrinsics.checkNotNullParameter(contributorCategories, "contributorCategories");
        Intrinsics.checkNotNullParameter(selectedContributorCategory, "selectedContributorCategory");
        return new a(selectedTimeframe, selectedAnalyticsType, bVar, z, disclaimerParams2, contributorsData, selectedCalculationMethodType, availableCalculationMethods, performanceChartData, performanceChartPoint2, pair2, contributorCategories, selectedContributorCategory, data4, links);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f301272a == aVar.f301272a && Intrinsics.f(this.f301273b, aVar.f301273b) && this.f301274c == aVar.f301274c && this.d == aVar.d && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && this.f301275g == aVar.f301275g && Intrinsics.f(this.f301276h, aVar.f301276h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f301277j, aVar.f301277j) && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f301278l, aVar.f301278l) && this.f301279m == aVar.f301279m && Intrinsics.f(this.f301280n, aVar.f301280n) && Intrinsics.f(this.o, aVar.o);
    }

    public final int hashCode() {
        int iHashCode = (this.f301273b.hashCode() + (this.f301272a.hashCode() * 31)) * 31;
        hel.b bVar = this.f301274c;
        int iC = j6.a.c((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.d);
        DisclaimerParams disclaimerParams = this.e;
        int iC2 = kii.e.c(this.i, p.a.d(prk.o.d(this.f301275g, kii.e.c(this.f, (iC + (disclaimerParams == null ? 0 : disclaimerParams.hashCode())) * 31, 31), 31), 31, this.f301276h), 31);
        PerformanceChartPoint performanceChartPoint = this.f301277j;
        int iHashCode2 = (iC2 + (performanceChartPoint == null ? 0 : performanceChartPoint.hashCode())) * 31;
        Pair pair = this.k;
        int iHashCode3 = (this.f301279m.hashCode() + p.a.d((iHashCode2 + (pair == null ? 0 : pair.hashCode())) * 31, 31, this.f301278l)) * 31;
        Data data = this.f301280n;
        int iHashCode4 = (iHashCode3 + (data == null ? 0 : data.hashCode())) * 31;
        Links links = this.o;
        return iHashCode4 + (links != null ? links.hashCode() : 0);
    }
}
