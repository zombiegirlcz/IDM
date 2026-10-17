package snd;

import com.revolut.core.ui_kit.delegates.CellWithLinearGaugeDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class z extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AnalyticsDashboardController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(AnalyticsDashboardController analyticsDashboardController, Continuation continuation) {
        super(2, continuation);
        this.v = analyticsDashboardController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        z zVar = new z(this.v, continuation);
        zVar.u = obj2;
        return zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z) create((CellWithLinearGaugeDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellWithLinearGaugeDelegate.Model model = (CellWithLinearGaugeDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.b) this.v.d()).K2(model.f51953h);
        return Unit.f186387a;
    }
}
