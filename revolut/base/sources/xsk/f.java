package xsk;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f308558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f308559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f308560c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f308561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f308562h;

    public f(Data annualChartData, Data quarterlyChartData) {
        Data data;
        Data data2;
        Data data3;
        Data data4;
        Data data5;
        Data data6;
        cel.h hVar;
        cel.h hVar2;
        Intrinsics.checkNotNullParameter(annualChartData, "annualChartData");
        Intrinsics.checkNotNullParameter(quarterlyChartData, "quarterlyChartData");
        this.f308558a = annualChartData;
        this.f308559b = quarterlyChartData;
        try {
            Object content = annualChartData.getContent();
            data = new Data(content != null ? (cel.n) ((Map) content).get(cel.a.SALES_ANN) : null, annualChartData.getError(), annualChartData.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, annualChartData.getLoading());
        }
        this.f308560c = data;
        Data data7 = this.f308558a;
        try {
            Object content2 = data7.getContent();
            data2 = new Data(content2 != null ? (cel.n) ((Map) content2).get(cel.a.NET_INCOME_ANN) : null, data7.getError(), data7.getLoading());
        } catch (Throwable th11) {
            data2 = new Data(null, th11, data7.getLoading());
        }
        this.d = data2;
        Data data8 = this.f308558a;
        try {
            Object content3 = data8.getContent();
            data3 = new Data(content3 != null ? (cel.n) ((Map) content3).get(cel.a.PROFIT_MARGIN_ANN) : null, data8.getError(), data8.getLoading());
        } catch (Throwable th12) {
            data3 = new Data(null, th12, data8.getLoading());
        }
        this.e = data3;
        Data data9 = this.f308558a;
        try {
            Object content4 = data9.getContent();
            if (content4 != null) {
                Object obj2 = ((Map) content4).get(cel.a.SALES_ANN_GROWTH);
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.models.asset_data_points.AssetPercentageDataSeries");
                hVar2 = (cel.h) obj2;
            } else {
                hVar2 = null;
            }
            new Data(hVar2, data9.getError(), data9.getLoading());
        } catch (Throwable th13) {
            new Data(null, th13, data9.getLoading());
        }
        Data data10 = this.f308559b;
        try {
            Object content5 = data10.getContent();
            data4 = new Data(content5 != null ? (cel.n) ((Map) content5).get(cel.a.SALES_QTR) : null, data10.getError(), data10.getLoading());
        } catch (Throwable th14) {
            data4 = new Data(null, th14, data10.getLoading());
        }
        this.f = data4;
        Data data11 = this.f308559b;
        try {
            Object content6 = data11.getContent();
            data5 = new Data(content6 != null ? (cel.n) ((Map) content6).get(cel.a.NET_INCOME_QTR) : null, data11.getError(), data11.getLoading());
        } catch (Throwable th15) {
            data5 = new Data(null, th15, data11.getLoading());
        }
        this.f308561g = data5;
        Data data12 = this.f308559b;
        try {
            Object content7 = data12.getContent();
            data6 = new Data(content7 != null ? (cel.n) ((Map) content7).get(cel.a.PROFIT_MARGIN_QTR) : null, data12.getError(), data12.getLoading());
        } catch (Throwable th16) {
            data6 = new Data(null, th16, data12.getLoading());
        }
        this.f308562h = data6;
        Data data13 = this.f308559b;
        try {
            Object content8 = data13.getContent();
            if (content8 != null) {
                Object obj3 = ((Map) content8).get(cel.a.SALES_QTR_GROWTH);
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.models.asset_data_points.AssetPercentageDataSeries");
                hVar = (cel.h) obj3;
            } else {
                hVar = null;
            }
            new Data(hVar, data13.getError(), data13.getLoading());
        } catch (Throwable th17) {
            new Data(null, th17, data13.getLoading());
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f308558a, fVar.f308558a) && Intrinsics.f(this.f308559b, fVar.f308559b);
    }

    public final int hashCode() {
        return this.f308559b.hashCode() + (this.f308558a.hashCode() * 31);
    }
}
