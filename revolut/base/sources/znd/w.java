package znd;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ AnalyticsDetailsController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(AnalyticsDetailsController analyticsDetailsController, Continuation continuation) {
        super(2, continuation);
        this.u = analyticsDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new w(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) this.u.R2()).N2();
        return Unit.f186387a;
    }
}
