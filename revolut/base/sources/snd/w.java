package snd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AnalyticsDashboardController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(AnalyticsDashboardController analyticsDashboardController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = analyticsDashboardController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.v, continuation, 0);
            case 1:
                return new w(this.v, continuation, 1);
            default:
                return new w(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((w) create((ip0.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((w) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((w) create((ip0.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        AnalyticsDashboardController analyticsDashboardController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.b) analyticsDashboardController.d()).J2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                analyticsDashboardController.m2().onBackPressed();
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.b) analyticsDashboardController.d()).I2();
                break;
        }
        return Unit.f186387a;
    }
}
