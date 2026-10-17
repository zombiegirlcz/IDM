package iyg;

import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.WidgetisedAnalyticsDashboardScreen;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WidgetisedAnalyticsDashboardScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(WidgetisedAnalyticsDashboardScreen widgetisedAnalyticsDashboardScreen, Continuation continuation) {
        super(2, continuation);
        this.v = widgetisedAnalyticsDashboardScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, continuation);
        qVar.u = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((HeaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String f95154a;
        HeaderDelegate.Model model = (HeaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a aVar2 = (com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a) iVarR2;
        cli.y yVar = aVar2.P;
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.f52406p instanceof fxg.b) {
            j2 j2Var = (j2) yVar.f22677a;
            j2 j2Var2 = (j2) yVar.f22677a;
            WidgetisedAnalyticsType widgetisedAnalyticsType = ((a) j2Var.getValue()).f169704b;
            if (widgetisedAnalyticsType != null) {
                kzg.a aVar3 = widgetisedAnalyticsType instanceof kzg.a ? (kzg.a) widgetisedAnalyticsType : null;
                if (aVar3 != null && (f95154a = aVar3.getF95154a()) != null) {
                    aVar2.R2(new e(widgetisedAnalyticsType, ((a) j2Var2.getValue()).f169711n, ((a) j2Var2.getValue()).f, f95154a));
                }
            }
        }
        return Unit.f186387a;
    }
}
