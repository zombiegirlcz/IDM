package wvg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class c1 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f300343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f300344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f300345c;

    public c1(t0 totalValueChartRepository, v combinedTotalValueChartRepository, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(totalValueChartRepository, "totalValueChartRepository");
        Intrinsics.checkNotNullParameter(combinedTotalValueChartRepository, "combinedTotalValueChartRepository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f300343a = totalValueChartRepository;
        this.f300344b = combinedTotalValueChartRepository;
        this.f300345c = dateProvider;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    @Override // wvg.a2
    public final Flow a(String userId, List analyticsProductTypes, eel.c timeSpan, xi0.b currency, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(timeSpan, "chartPeriod");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        DateTime to6 = ((l80.f) this.f300345c).h();
        v vVar = this.f300344b;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return rd0.e.b(rd0.e.c(nim.a.v(vVar.e.a(new e(userId, zhm.d0.P0(analyticsProductTypes, new t()), timeSpan, to6, currency, le.u1.g(iwg.d.VALUE_ONLY_CHART, rvg.a.f257779a)), w4l.i.f294643c), new wuk.c(16)), kotlin.coroutines.g.f186406a));
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
    @Override // wvg.a2
    public final Flow b(String userId, iwg.a analyticsProductType, String str, eel.c timeSpan, xi0.b currency) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "chartPeriod");
        Intrinsics.checkNotNullParameter(currency, "currency");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        DateTime to6 = ((l80.f) this.f300345c).h();
        t0 t0Var = this.f300343a;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return rd0.e.b(rd0.e.c(nim.a.v(t0Var.f.a(new b2(userId, analyticsProductType, timeSpan, to6, currency, str, le.u1.g(iwg.d.FULL_CHART, rvg.a.f257779a)), loadingStrategy), new wuk.c(20)), kotlin.coroutines.g.f186406a));
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
    @Override // wvg.a2
    public final Flow c(String userId, iwg.a analyticsProductType, String str, eel.c timeSpan, xi0.b currency, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "chartPeriod");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        DateTime to6 = ((l80.f) this.f300345c).h();
        t0 t0Var = this.f300343a;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return rd0.e.b(rd0.e.c(nim.a.v(t0Var.f.a(new b2(userId, analyticsProductType, timeSpan, to6, currency, str, le.u1.g(iwg.d.VALUE_ONLY_CHART, rvg.a.f257779a)), w4l.i.f294643c), new wuk.c(22)), kotlin.coroutines.g.f186406a));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    @Override // wvg.a2
    public final Flow d(String userId, List analyticsProductTypes, eel.c timeSpan, xi0.b currency, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(timeSpan, "chartPeriod");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        DateTime to6 = ((l80.f) this.f300345c).h();
        v vVar = this.f300344b;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return rd0.e.b(rd0.e.c(nim.a.v(vVar.e.a(new e(userId, zhm.d0.P0(analyticsProductTypes, new u()), timeSpan, to6, currency, le.u1.g(iwg.d.FULL_CHART, rvg.a.f257779a)), w4l.i.f294643c), new wuk.c(14)), kotlin.coroutines.g.f186406a));
    }
}
