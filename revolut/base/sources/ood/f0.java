package ood;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list.TripsListController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import om4.l3;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TripsListController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(TripsListController tripsListController, Continuation continuation) {
        super(2, continuation);
        this.v = tripsListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f0 f0Var = new f0(this.v, continuation);
        f0Var.u = obj2;
        return f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f0) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f52613a;
        boolean zF = Intrinsics.f(str, "SEE_ALL_INCLUDED");
        TripsListController tripsListController = this.v;
        if (zF) {
            q0 q0Var = (q0) tripsListController.R2();
            q0Var.H2(q0Var.C, new l3(28));
        } else if (Intrinsics.f(str, "SEE_ALL_EXCLUDED")) {
            q0 q0Var2 = (q0) tripsListController.R2();
            q0Var2.H2(q0Var2.C, new l3(29));
        }
        return Unit.f186387a;
    }
}
