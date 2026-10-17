package znd;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class y extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AnalyticsDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(AnalyticsDetailsController analyticsDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = analyticsDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        y yVar = new y(this.v, continuation);
        yVar.u = obj2;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f52613a;
        int iHashCode = str.hashCode();
        Continuation continuation = null;
        AnalyticsDetailsController analyticsDetailsController = this.v;
        switch (iHashCode) {
            case -1525720506:
                if (str.equals("SEE_ALL_INCLUDED")) {
                    com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) analyticsDetailsController.R2();
                    bVar.getClass();
                    bVar.n2(new t0(1, bVar, continuation), new whi.b(6));
                }
                break;
            case -600380451:
                if (str.equals("SEE_ALL_INFLOW")) {
                    com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) analyticsDetailsController.R2();
                    bVar2.getClass();
                    bVar2.n2(new t0(2, bVar2, continuation), new whi.b(6));
                }
                break;
            case -188718446:
                if (str.equals("SEE_ALL_OUTFLOW")) {
                    com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar3 = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) analyticsDetailsController.R2();
                    bVar3.getClass();
                    bVar3.n2(new t0(3, bVar3, continuation), new whi.b(6));
                }
                break;
            case 378074964:
                if (str.equals("SEE_ALL_EXCLUDED")) {
                    com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar4 = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) analyticsDetailsController.R2();
                    bVar4.getClass();
                    bVar4.n2(new t0(0, bVar4, continuation), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
