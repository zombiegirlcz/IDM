package snd;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ AnalyticsDashboardController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(AnalyticsDashboardController analyticsDashboardController, Continuation continuation) {
        super(2, continuation);
        this.u = analyticsDashboardController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new x(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.b) this.u.d()).J2();
        return Unit.f186387a;
    }
}
