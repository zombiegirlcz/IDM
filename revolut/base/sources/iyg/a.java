package iyg;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.retail.feature.crypto.disclaimer.api.DisclaimerParams;
import com.revolut.shared.feature.wealth.models.config.Links;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f169703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WidgetisedAnalyticsType f169704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vyg.c f169705c;
    public final boolean d;
    public final DisclaimerParams e;
    public final hel.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f169706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f169707h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f169708j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f169709l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dvg.a f169710m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Links f169711n;

    public a(List availableAnalyticsTypes, WidgetisedAnalyticsType widgetisedAnalyticsType, vyg.c selectedTimeframe, boolean z, DisclaimerParams disclaimerParams, hel.b bVar, Data totalValueChartData, Data performanceChartData, Data pnlValuesData, Data pnlChartData, Data allocationsData, Data data, dvg.a analyticsState, Links links) {
        Intrinsics.checkNotNullParameter(availableAnalyticsTypes, "availableAnalyticsTypes");
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        Intrinsics.checkNotNullParameter(totalValueChartData, "totalValueChartData");
        Intrinsics.checkNotNullParameter(performanceChartData, "performanceChartData");
        Intrinsics.checkNotNullParameter(pnlValuesData, "pnlValuesData");
        Intrinsics.checkNotNullParameter(pnlChartData, "pnlChartData");
        Intrinsics.checkNotNullParameter(allocationsData, "allocationsData");
        Intrinsics.checkNotNullParameter(analyticsState, "analyticsState");
        this.f169703a = availableAnalyticsTypes;
        this.f169704b = widgetisedAnalyticsType;
        this.f169705c = selectedTimeframe;
        this.d = z;
        this.e = disclaimerParams;
        this.f = bVar;
        this.f169706g = totalValueChartData;
        this.f169707h = performanceChartData;
        this.i = pnlValuesData;
        this.f169708j = pnlChartData;
        this.k = allocationsData;
        this.f169709l = data;
        this.f169710m = analyticsState;
        this.f169711n = links;
    }

    public static a a(a aVar, List list, WidgetisedAnalyticsType widgetisedAnalyticsType, vyg.c cVar, boolean z, DisclaimerParams disclaimerParams, hel.b bVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, dvg.a aVar2, Links links, int i) {
        List availableAnalyticsTypes = (i & 1) != 0 ? aVar.f169703a : list;
        WidgetisedAnalyticsType widgetisedAnalyticsType2 = (i & 2) != 0 ? aVar.f169704b : widgetisedAnalyticsType;
        vyg.c selectedTimeframe = (i & 4) != 0 ? aVar.f169705c : cVar;
        boolean z3 = (i & 8) != 0 ? aVar.d : z;
        DisclaimerParams disclaimerParams2 = (i & 16) != 0 ? aVar.e : disclaimerParams;
        hel.b bVar2 = (i & 32) != 0 ? aVar.f : bVar;
        Data totalValueChartData = (i & 64) != 0 ? aVar.f169706g : data;
        Data performanceChartData = (i & 128) != 0 ? aVar.f169707h : data2;
        Data pnlValuesData = (i & 256) != 0 ? aVar.i : data3;
        Data pnlChartData = (i & 512) != 0 ? aVar.f169708j : data4;
        Data allocationsData = (i & 1024) != 0 ? aVar.k : data5;
        Data data7 = (i & 2048) != 0 ? aVar.f169709l : data6;
        dvg.a analyticsState = (i & 4096) != 0 ? aVar.f169710m : aVar2;
        Links links2 = (i & 8192) != 0 ? aVar.f169711n : links;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(availableAnalyticsTypes, "availableAnalyticsTypes");
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        Intrinsics.checkNotNullParameter(totalValueChartData, "totalValueChartData");
        Intrinsics.checkNotNullParameter(performanceChartData, "performanceChartData");
        Intrinsics.checkNotNullParameter(pnlValuesData, "pnlValuesData");
        Intrinsics.checkNotNullParameter(pnlChartData, "pnlChartData");
        Intrinsics.checkNotNullParameter(allocationsData, "allocationsData");
        Intrinsics.checkNotNullParameter(analyticsState, "analyticsState");
        return new a(availableAnalyticsTypes, widgetisedAnalyticsType2, selectedTimeframe, z3, disclaimerParams2, bVar2, totalValueChartData, performanceChartData, pnlValuesData, pnlChartData, allocationsData, data7, analyticsState, links2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f169703a, aVar.f169703a) && Intrinsics.f(this.f169704b, aVar.f169704b) && this.f169705c == aVar.f169705c && this.d == aVar.d && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f && Intrinsics.f(this.f169706g, aVar.f169706g) && Intrinsics.f(this.f169707h, aVar.f169707h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f169708j, aVar.f169708j) && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f169709l, aVar.f169709l) && this.f169710m == aVar.f169710m && Intrinsics.f(this.f169711n, aVar.f169711n);
    }

    public final int hashCode() {
        int iHashCode = this.f169703a.hashCode() * 31;
        WidgetisedAnalyticsType widgetisedAnalyticsType = this.f169704b;
        int iC = j6.a.c((this.f169705c.hashCode() + ((iHashCode + (widgetisedAnalyticsType == null ? 0 : widgetisedAnalyticsType.hashCode())) * 31)) * 31, 31, this.d);
        DisclaimerParams disclaimerParams = this.e;
        int iHashCode2 = (iC + (disclaimerParams == null ? 0 : disclaimerParams.hashCode())) * 31;
        hel.b bVar = this.f;
        int iC2 = kii.e.c(this.k, kii.e.c(this.f169708j, kii.e.c(this.i, kii.e.c(this.f169707h, kii.e.c(this.f169706g, (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31), 31), 31), 31), 31);
        Data data = this.f169709l;
        int iHashCode3 = (this.f169710m.hashCode() + ((iC2 + (data == null ? 0 : data.hashCode())) * 31)) * 31;
        Links links = this.f169711n;
        return iHashCode3 + (links != null ? links.hashCode() : 0);
    }
}
