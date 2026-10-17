package a8j;

import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f2265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2 f2266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2 f2267c;
    public final j2 d;

    public a(j2 chartType, j2 selectedChartPeriod, j2 selectedCandle, j2 pocketCurrency) {
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Intrinsics.checkNotNullParameter(selectedChartPeriod, "selectedChartPeriod");
        Intrinsics.checkNotNullParameter(selectedCandle, "selectedCandle");
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        this.f2265a = chartType;
        this.f2266b = selectedChartPeriod;
        this.f2267c = selectedCandle;
        this.d = pocketCurrency;
    }
}
