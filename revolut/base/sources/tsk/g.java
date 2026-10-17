package tsk;

import com.revolut.data.model.Data;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f274150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f274151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f274152c;
    public final List d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f274153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f274154h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f274155j;

    public g(Data annualChartData, Data quarterlyChartData, List allYearPeriods, List allQuarterPeriods) {
        Data data;
        Data data2;
        Data data3;
        Data data4;
        Data data5;
        Data data6;
        cel.h hVar;
        cel.j jVar;
        cel.j jVar2;
        cel.h hVar2;
        cel.j jVar3;
        cel.j jVar4;
        Intrinsics.checkNotNullParameter(annualChartData, "annualChartData");
        Intrinsics.checkNotNullParameter(quarterlyChartData, "quarterlyChartData");
        Intrinsics.checkNotNullParameter(allYearPeriods, "allYearPeriods");
        Intrinsics.checkNotNullParameter(allQuarterPeriods, "allQuarterPeriods");
        this.f274150a = annualChartData;
        this.f274151b = quarterlyChartData;
        this.f274152c = allYearPeriods;
        this.d = allQuarterPeriods;
        try {
            Object content = annualChartData.getContent();
            if (content != null) {
                Object obj2 = ((Map) content).get(cel.a.EPS_ANN);
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.models.asset_data_points.AssetPreciseMoneyDataSeries");
                jVar4 = (cel.j) obj2;
            } else {
                jVar4 = null;
            }
            data = new Data(jVar4, annualChartData.getError(), annualChartData.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, annualChartData.getLoading());
        }
        this.e = data;
        Data data7 = this.f274150a;
        try {
            Object content2 = data7.getContent();
            if (content2 != null) {
                Object obj3 = ((Map) content2).get(cel.a.EPS_SURPRISE_BASIS_ANN);
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.models.asset_data_points.AssetPreciseMoneyDataSeries");
                jVar3 = (cel.j) obj3;
            } else {
                jVar3 = null;
            }
            data2 = new Data(jVar3, data7.getError(), data7.getLoading());
        } catch (Throwable th11) {
            data2 = new Data(null, th11, data7.getLoading());
        }
        this.f = data2;
        Data data8 = this.f274150a;
        try {
            Object content3 = data8.getContent();
            if (content3 != null) {
                Object obj4 = ((Map) content3).get(cel.a.EPS_ANN_GROWTH);
                Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.models.asset_data_points.AssetPercentageDataSeries");
                hVar2 = (cel.h) obj4;
            } else {
                hVar2 = null;
            }
            data3 = new Data(hVar2, data8.getError(), data8.getLoading());
        } catch (Throwable th12) {
            data3 = new Data(null, th12, data8.getLoading());
        }
        this.f274153g = data3;
        Data data9 = this.f274151b;
        try {
            Object content4 = data9.getContent();
            if (content4 != null) {
                Object obj5 = ((Map) content4).get(cel.a.EPS_QTR);
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.models.asset_data_points.AssetPreciseMoneyDataSeries");
                jVar2 = (cel.j) obj5;
            } else {
                jVar2 = null;
            }
            data4 = new Data(jVar2, data9.getError(), data9.getLoading());
        } catch (Throwable th13) {
            data4 = new Data(null, th13, data9.getLoading());
        }
        this.f274154h = data4;
        Data data10 = this.f274151b;
        try {
            Object content5 = data10.getContent();
            if (content5 != null) {
                Object obj6 = ((Map) content5).get(cel.a.EPS_SURPRISE_BASIS_QTR);
                Intrinsics.i(obj6, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.models.asset_data_points.AssetPreciseMoneyDataSeries");
                jVar = (cel.j) obj6;
            } else {
                jVar = null;
            }
            data5 = new Data(jVar, data10.getError(), data10.getLoading());
        } catch (Throwable th14) {
            data5 = new Data(null, th14, data10.getLoading());
        }
        this.i = data5;
        Data data11 = this.f274151b;
        try {
            Object content6 = data11.getContent();
            if (content6 != null) {
                Object obj7 = ((Map) content6).get(cel.a.EPS_QTR_GROWTH);
                Intrinsics.i(obj7, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.models.asset_data_points.AssetPercentageDataSeries");
                hVar = (cel.h) obj7;
            } else {
                hVar = null;
            }
            data6 = new Data(hVar, data11.getError(), data11.getLoading());
        } catch (Throwable th15) {
            data6 = new Data(null, th15, data11.getLoading());
        }
        this.f274155j = data6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f274150a, gVar.f274150a) && Intrinsics.f(this.f274151b, gVar.f274151b) && Intrinsics.f(this.f274152c, gVar.f274152c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(kii.e.c(this.f274151b, this.f274150a.hashCode() * 31, 31), 31, this.f274152c);
    }
}
