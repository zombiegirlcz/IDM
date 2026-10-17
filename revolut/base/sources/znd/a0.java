package znd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AnalyticsDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(AnalyticsDetailsController analyticsDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = analyticsDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a0 a0Var = new a0(this.v, continuation);
        a0Var.u = obj2;
        return a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a0) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vh clickData = (vh) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b bVarR2 = this.v.R2();
        Intrinsics.h(clickData);
        com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) bVarR2;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Object obj3 = ((RowDelegate.Model) clickData.f54884b).u;
        a3 a3Var = obj3 instanceof a3 ? (a3) obj3 : null;
        if (a3Var != null) {
            bVar.l2(new x0(clickData.f54883a.e, bVar, a3Var, clickData, null), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
