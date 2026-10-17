package gzg;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.retail.feature.crypto.disclaimer.api.DisclaimerParams;
import com.revolut.shared.feature.wealth.models.config.Links;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetisedAnalyticsType f148108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vyg.c f148109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f148110c;
    public final hel.b d;
    public final DisclaimerParams e;
    public final TotalValueChartPoint f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Pair f148111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f148112h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f148113j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final vyg.a f148114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Links f148115m;

    public n(WidgetisedAnalyticsType analyticsType, vyg.c selectedTimeframe, boolean z, hel.b bVar, DisclaimerParams disclaimerParams, TotalValueChartPoint totalValueChartPoint, Pair pair, boolean z3, Data totalValue, Data currentPortfolio, List allocationCategories, vyg.a selectedAllocationCategory, Links links) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        Intrinsics.checkNotNullParameter(totalValue, "totalValue");
        Intrinsics.checkNotNullParameter(currentPortfolio, "currentPortfolio");
        Intrinsics.checkNotNullParameter(allocationCategories, "allocationCategories");
        Intrinsics.checkNotNullParameter(selectedAllocationCategory, "selectedAllocationCategory");
        this.f148108a = analyticsType;
        this.f148109b = selectedTimeframe;
        this.f148110c = z;
        this.d = bVar;
        this.e = disclaimerParams;
        this.f = totalValueChartPoint;
        this.f148111g = pair;
        this.f148112h = z3;
        this.i = totalValue;
        this.f148113j = currentPortfolio;
        this.k = allocationCategories;
        this.f148114l = selectedAllocationCategory;
        this.f148115m = links;
    }

    public static n a(n nVar, vyg.c cVar, DisclaimerParams disclaimerParams, TotalValueChartPoint totalValueChartPoint, Pair pair, boolean z, Data data, Data data2, vyg.a aVar, int i) {
        WidgetisedAnalyticsType analyticsType = nVar.f148108a;
        vyg.c selectedTimeframe = (i & 2) != 0 ? nVar.f148109b : cVar;
        boolean z3 = nVar.f148110c;
        hel.b bVar = nVar.d;
        DisclaimerParams disclaimerParams2 = (i & 16) != 0 ? nVar.e : disclaimerParams;
        TotalValueChartPoint totalValueChartPoint2 = (i & 32) != 0 ? nVar.f : totalValueChartPoint;
        Pair pair2 = (i & 64) != 0 ? nVar.f148111g : pair;
        boolean z4 = (i & 128) != 0 ? nVar.f148112h : z;
        Data totalValue = (i & 256) != 0 ? nVar.i : data;
        Data currentPortfolio = (i & 512) != 0 ? nVar.f148113j : data2;
        List allocationCategories = nVar.k;
        vyg.a selectedAllocationCategory = (i & 2048) != 0 ? nVar.f148114l : aVar;
        Links links = nVar.f148115m;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        Intrinsics.checkNotNullParameter(totalValue, "totalValue");
        Intrinsics.checkNotNullParameter(currentPortfolio, "currentPortfolio");
        Intrinsics.checkNotNullParameter(allocationCategories, "allocationCategories");
        Intrinsics.checkNotNullParameter(selectedAllocationCategory, "selectedAllocationCategory");
        return new n(analyticsType, selectedTimeframe, z3, bVar, disclaimerParams2, totalValueChartPoint2, pair2, z4, totalValue, currentPortfolio, allocationCategories, selectedAllocationCategory, links);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f148108a, nVar.f148108a) && this.f148109b == nVar.f148109b && this.f148110c == nVar.f148110c && this.d == nVar.d && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && Intrinsics.f(this.f148111g, nVar.f148111g) && this.f148112h == nVar.f148112h && Intrinsics.f(this.i, nVar.i) && Intrinsics.f(this.f148113j, nVar.f148113j) && Intrinsics.f(this.k, nVar.k) && this.f148114l == nVar.f148114l && Intrinsics.f(this.f148115m, nVar.f148115m);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f148109b.hashCode() + (this.f148108a.hashCode() * 31)) * 31, 31, this.f148110c);
        hel.b bVar = this.d;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        DisclaimerParams disclaimerParams = this.e;
        int iHashCode2 = (iHashCode + (disclaimerParams == null ? 0 : disclaimerParams.hashCode())) * 31;
        TotalValueChartPoint totalValueChartPoint = this.f;
        int iHashCode3 = (iHashCode2 + (totalValueChartPoint == null ? 0 : totalValueChartPoint.hashCode())) * 31;
        Pair pair = this.f148111g;
        int iHashCode4 = (this.f148114l.hashCode() + p.a.d(kii.e.c(this.f148113j, kii.e.c(this.i, j6.a.c((iHashCode3 + (pair == null ? 0 : pair.hashCode())) * 31, 31, this.f148112h), 31), 31), 31, this.k)) * 31;
        Links links = this.f148115m;
        return iHashCode4 + (links != null ? links.hashCode() : 0);
    }
}
