package j3i;

import com.revolut.data.model.Data;
import com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.ChartLimitPickerControllerContract$Limit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChartLimitPickerControllerContract$Limit f171197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChartLimitPickerControllerContract$Limit f171198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f171199c;
    public final Data d;
    public final j e;
    public final xi0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r0i.c f171200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wd6.e f171201h;

    public k(ChartLimitPickerControllerContract$Limit chartLimitPickerControllerContract$Limit, ChartLimitPickerControllerContract$Limit chartLimitPickerControllerContract$Limit2, String selectedDuration, Data dataPoints, j currentPrice, xi0.b referencedCurrency, r0i.c orderType, wd6.e exchangeMode) {
        Intrinsics.checkNotNullParameter(selectedDuration, "selectedDuration");
        Intrinsics.checkNotNullParameter(dataPoints, "dataPoints");
        Intrinsics.checkNotNullParameter(currentPrice, "currentPrice");
        Intrinsics.checkNotNullParameter(referencedCurrency, "referencedCurrency");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        this.f171197a = chartLimitPickerControllerContract$Limit;
        this.f171198b = chartLimitPickerControllerContract$Limit2;
        this.f171199c = selectedDuration;
        this.d = dataPoints;
        this.e = currentPrice;
        this.f = referencedCurrency;
        this.f171200g = orderType;
        this.f171201h = exchangeMode;
    }

    public static k a(k kVar, ChartLimitPickerControllerContract$Limit chartLimitPickerControllerContract$Limit, ChartLimitPickerControllerContract$Limit chartLimitPickerControllerContract$Limit2, String str, Data data, j jVar, int i) {
        if ((i & 1) != 0) {
            chartLimitPickerControllerContract$Limit = kVar.f171197a;
        }
        ChartLimitPickerControllerContract$Limit chartLimitPickerControllerContract$Limit3 = chartLimitPickerControllerContract$Limit;
        if ((i & 2) != 0) {
            chartLimitPickerControllerContract$Limit2 = kVar.f171198b;
        }
        ChartLimitPickerControllerContract$Limit chartLimitPickerControllerContract$Limit4 = chartLimitPickerControllerContract$Limit2;
        if ((i & 4) != 0) {
            str = kVar.f171199c;
        }
        String selectedDuration = str;
        if ((i & 8) != 0) {
            data = kVar.d;
        }
        Data dataPoints = data;
        if ((i & 16) != 0) {
            jVar = kVar.e;
        }
        j currentPrice = jVar;
        xi0.b referencedCurrency = kVar.f;
        r0i.c orderType = kVar.f171200g;
        wd6.e exchangeMode = kVar.f171201h;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(selectedDuration, "selectedDuration");
        Intrinsics.checkNotNullParameter(dataPoints, "dataPoints");
        Intrinsics.checkNotNullParameter(currentPrice, "currentPrice");
        Intrinsics.checkNotNullParameter(referencedCurrency, "referencedCurrency");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        return new k(chartLimitPickerControllerContract$Limit3, chartLimitPickerControllerContract$Limit4, selectedDuration, dataPoints, currentPrice, referencedCurrency, orderType, exchangeMode);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f171197a, kVar.f171197a) && Intrinsics.f(this.f171198b, kVar.f171198b) && Intrinsics.f(this.f171199c, kVar.f171199c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && this.f171200g == kVar.f171200g && this.f171201h == kVar.f171201h;
    }

    public final int hashCode() {
        ChartLimitPickerControllerContract$Limit chartLimitPickerControllerContract$Limit = this.f171197a;
        int iHashCode = (chartLimitPickerControllerContract$Limit == null ? 0 : chartLimitPickerControllerContract$Limit.hashCode()) * 31;
        ChartLimitPickerControllerContract$Limit chartLimitPickerControllerContract$Limit2 = this.f171198b;
        return this.f171201h.hashCode() + ((this.f171200g.hashCode() + h30.l.j(this.f, (this.e.hashCode() + kii.e.c(this.d, p.a.c((iHashCode + (chartLimitPickerControllerContract$Limit2 != null ? chartLimitPickerControllerContract$Limit2.hashCode() : 0)) * 31, 31, this.f171199c), 31)) * 31, 31)) * 31);
    }
}
