package wyg;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.wealth.analytics.ui.widgetised.performance.WidgetisedAnalyticsPerformanceScreen;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WidgetisedAnalyticsPerformanceScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(WidgetisedAnalyticsPerformanceScreen widgetisedAnalyticsPerformanceScreen, Continuation continuation) {
        super(2, continuation);
        this.v = widgetisedAnalyticsPerformanceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c cVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.wealth.analytics.ui.widgetised.performance.a aVar2 = (com.revolut.feature.wealth.analytics.ui.widgetised.performance.a) cVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        vyg.h hVar = obj3 instanceof vyg.h ? (vyg.h) obj3 : null;
        if (hVar != null) {
            kbb.c cVar = aVar2.v;
            WidgetisedAnalyticsType analyticsType = ((a) ((j2) aVar2.f95110w.f22677a).getValue()).f301273b;
            String benchmarkRef = hVar.f293321c;
            boolean z = !hVar.f293319a;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
            Intrinsics.checkNotNullParameter(benchmarkRef, "benchmarkRef");
            vyg.g gVarS = kbb.c.S(analyticsType);
            if (gVarS != null) {
                ((vvg.b) cVar.f182549b).a(gVarS, benchmarkRef, z);
            }
        }
        return Unit.f186387a;
    }
}
