package lmd;

import knd.v;
import kotlin.jvm.internal.Intrinsics;
import xnd.n;
import xod.p;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eqj.d f196953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f196954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kzi.a f196955c;
    public final p d;
    public final n e;

    public d(eqj.d analyticsCustomPeriodInteractor, v analyticsDataProvider, kzi.a intervalMapper, cpd.h widgetChartDataProvider, p widgetContentMapper, n widgetParamsProvider) {
        Intrinsics.checkNotNullParameter(analyticsCustomPeriodInteractor, "analyticsCustomPeriodInteractor");
        Intrinsics.checkNotNullParameter(analyticsDataProvider, "analyticsDataProvider");
        Intrinsics.checkNotNullParameter(intervalMapper, "intervalMapper");
        Intrinsics.checkNotNullParameter(widgetChartDataProvider, "widgetChartDataProvider");
        Intrinsics.checkNotNullParameter(widgetContentMapper, "widgetContentMapper");
        Intrinsics.checkNotNullParameter(widgetParamsProvider, "widgetParamsProvider");
        this.f196953a = analyticsCustomPeriodInteractor;
        this.f196954b = analyticsDataProvider;
        this.f196955c = intervalMapper;
        this.d = widgetContentMapper;
        this.e = widgetParamsProvider;
    }
}
