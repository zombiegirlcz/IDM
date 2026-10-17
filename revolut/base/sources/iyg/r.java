package iyg;

import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.WidgetisedAnalyticsDashboardContract$ModalStep;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.WidgetisedAnalyticsDashboardScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WidgetisedAnalyticsDashboardScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(WidgetisedAnalyticsDashboardScreen widgetisedAnalyticsDashboardScreen, Continuation continuation) {
        super(2, continuation);
        this.v = widgetisedAnalyticsDashboardScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r rVar = new r(this.v, continuation);
        rVar.u = obj2;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((ReferralContactDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ReferralContactDelegate.Model model = (ReferralContactDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a aVar2 = (com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a) iVarR2;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f53167l;
        fxg.a aVar3 = obj3 instanceof fxg.a ? (fxg.a) obj3 : null;
        if (aVar3 != null) {
            oki.h.v2(aVar2.I, new WidgetisedAnalyticsDashboardContract$ModalStep.PortfolioInsightsUsageInfo(aVar3.f138819a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
