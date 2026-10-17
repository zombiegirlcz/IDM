package wvg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class b1 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f300329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f300330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f300331c;

    public b1(e0 performanceChartRepository, o combinedPerformanceChartRepository, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(performanceChartRepository, "performanceChartRepository");
        Intrinsics.checkNotNullParameter(combinedPerformanceChartRepository, "combinedPerformanceChartRepository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f300329a = performanceChartRepository;
        this.f300330b = combinedPerformanceChartRepository;
        this.f300331c = dateProvider;
    }

    @Override // wvg.e1
    public final Flow a(String userId, iwg.a analyticsProductType, String str, eel.c timeSpan, xi0.b currency, iwg.c method, String str2) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "chartPeriod");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(method, "method");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        DateTime to6 = ((l80.f) this.f300331c).h();
        e0 e0Var = this.f300329a;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(method, "method");
        return rd0.e.b(rd0.e.c(e0Var.f.a(new d1(userId, analyticsProductType, timeSpan, to6, currency, method, str2, str), loadingStrategy), kotlin.coroutines.g.f186406a));
    }

    @Override // wvg.e1
    public final Flow b(String userId, List analyticsProductTypes, eel.c timeSpan, xi0.b currency, iwg.c method, String str, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(timeSpan, "chartPeriod");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        o oVar = this.f300330b;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(method, "method");
        return rd0.e.b(rd0.e.c(oVar.e.a(new l(timeSpan, method, userId, str, zhm.d0.P0(analyticsProductTypes, new m()), currency), w4l.i.f294643c), kotlin.coroutines.g.f186406a));
    }
}
