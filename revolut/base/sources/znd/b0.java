package znd;

import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AnalyticsDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(AnalyticsDetailsController analyticsDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = analyticsDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b0 b0Var = new b0(this.v, continuation);
        b0Var.u = obj2;
        return b0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b0) create((pf) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        pf action = (pf) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) this.v.R2();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        Object obj3 = action.f;
        Object obj4 = null;
        if (Intrinsics.f(obj3, ind.l.f162815b)) {
            bVar.n2(new s0(bVar, null), new whi.b(6));
        } else if (Intrinsics.f(obj3, ind.k.f162814b)) {
            bVar.H2(bVar.N, new yrk.e(bVar, 21, obj4, obj4));
        } else if (obj3 == null) {
            com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b.P2(bVar, null, 3);
        }
        return Unit.f186387a;
    }
}
