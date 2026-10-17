package ood;

import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list.TripsListController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TripsListController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(TripsListController tripsListController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = tripsListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d0(this.v, continuation, 0);
            default:
                return new d0(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d0) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TripsListController tripsListController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!tripsListController.c0) {
                    tripsListController.c0 = true;
                    q0 q0Var = (q0) tripsListController.R2();
                    if (!q0Var.f227070q.a(null)) {
                        q0Var.B2();
                    }
                    tripsListController.c0 = false;
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((q0) tripsListController.R2()).K2();
                break;
        }
        return Unit.f186387a;
    }
}
