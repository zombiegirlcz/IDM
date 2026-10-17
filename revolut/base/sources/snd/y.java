package snd;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.CellWithLinearGaugeWidgetDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class y extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AnalyticsDashboardController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(AnalyticsDashboardController analyticsDashboardController, Continuation continuation) {
        super(2, continuation);
        this.v = analyticsDashboardController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        y yVar = new y(this.v, continuation);
        yVar.u = obj2;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((BaseDraggableWidgetDelegate.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BaseDraggableWidgetDelegate.a aVar = (BaseDraggableWidgetDelegate.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object f55256g = null;
        if (aVar instanceof com.revolut.core.ui_kit.delegates.widgets.i) {
            koi.j jVar = ((com.revolut.core.ui_kit.delegates.widgets.i) aVar).f55375c;
            if (jVar instanceof CellWithLinearGaugeWidgetDelegate.Model) {
                f55256g = ((CellWithLinearGaugeWidgetDelegate.Model) jVar).f55015c.f51953h;
            } else if (jVar instanceof qv0.p) {
                f55256g = ((qv0.p) jVar).getF55158j();
            }
        }
        if (f55256g != null) {
            ((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.b) this.v.d()).K2(f55256g);
        }
        return Unit.f186387a;
    }
}
