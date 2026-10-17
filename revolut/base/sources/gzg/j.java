package gzg;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.feature.wealth.analytics.ui.widgetised.total_value.WidgetisedAnalyticsTotalValueScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WidgetisedAnalyticsTotalValueScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(WidgetisedAnalyticsTotalValueScreen widgetisedAnalyticsTotalValueScreen, Continuation continuation) {
        super(2, continuation);
        this.v = widgetisedAnalyticsTotalValueScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((TrendViewDelegate.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.u
            com.revolut.core.ui_kit.delegates.TrendViewDelegate$a r0 = (com.revolut.core.ui_kit.delegates.TrendViewDelegate.a) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r7)
            com.revolut.feature.wealth.analytics.ui.widgetised.total_value.WidgetisedAnalyticsTotalValueScreen r7 = r6.v
            gzg.p r7 = r7.d()
            kotlin.jvm.internal.Intrinsics.h(r0)
            com.revolut.feature.wealth.analytics.ui.widgetised.total_value.a r7 = (com.revolut.feature.wealth.analytics.ui.widgetised.total_value.a) r7
            r7.getClass()
            java.lang.String r1 = "trendViewState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            boolean r1 = r0 instanceof com.revolut.core.ui_kit.delegates.mi
            r2 = 0
            if (r1 == 0) goto L25
            r1 = r0
            com.revolut.core.ui_kit.delegates.mi r1 = (com.revolut.core.ui_kit.delegates.mi) r1
            goto L26
        L25:
            r1 = r2
        L26:
            if (r1 == 0) goto L46
            r3 = r0
            com.revolut.core.ui_kit.delegates.mi r3 = (com.revolut.core.ui_kit.delegates.mi) r3
            ip0.jm0 r3 = r3.f54484a
            java.util.List r3 = r3.f164881c
            if (r3 == 0) goto L3e
            int r1 = r1.f54485b
            java.lang.Object r1 = r3.get(r1)
            hw0.k r1 = (hw0.k) r1
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r1.e
            goto L3f
        L3e:
            r1 = r2
        L3f:
            boolean r3 = r1 instanceof com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint
            if (r3 == 0) goto L46
            com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint r1 = (com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint) r1
            goto L47
        L46:
            r1 = r2
        L47:
            boolean r3 = r0 instanceof com.revolut.core.ui_kit.delegates.hi
            if (r3 == 0) goto L4f
            r3 = r0
            com.revolut.core.ui_kit.delegates.hi r3 = (com.revolut.core.ui_kit.delegates.hi) r3
            goto L50
        L4f:
            r3 = r2
        L50:
            if (r3 == 0) goto L93
            com.revolut.core.ui_kit.delegates.hi r0 = (com.revolut.core.ui_kit.delegates.hi) r0
            ip0.jm0 r0 = r0.f54261a
            java.util.List r4 = r0.f164881c
            if (r4 == 0) goto L67
            int r5 = r3.f54262b
            java.lang.Object r4 = r4.get(r5)
            hw0.k r4 = (hw0.k) r4
            if (r4 == 0) goto L67
            java.lang.Object r4 = r4.e
            goto L68
        L67:
            r4 = r2
        L68:
            boolean r5 = r4 instanceof com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint
            if (r5 == 0) goto L6f
            com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint r4 = (com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint) r4
            goto L70
        L6f:
            r4 = r2
        L70:
            java.util.List r0 = r0.f164881c
            if (r0 == 0) goto L81
            int r3 = r3.d
            java.lang.Object r0 = r0.get(r3)
            hw0.k r0 = (hw0.k) r0
            if (r0 == 0) goto L81
            java.lang.Object r0 = r0.e
            goto L82
        L81:
            r0 = r2
        L82:
            boolean r3 = r0 instanceof com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint
            if (r3 == 0) goto L89
            com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint r0 = (com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint) r0
            goto L8a
        L89:
            r0 = r2
        L8a:
            if (r4 == 0) goto L93
            if (r0 == 0) goto L93
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r4, r0)
        L93:
            cli.y r0 = r7.f95137x
            gvi.s r3 = new gvi.s
            r4 = 7
            r3.<init>(r1, r2, r4)
            r7.H2(r0, r3)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gzg.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
