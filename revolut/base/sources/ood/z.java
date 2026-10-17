package ood;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list.TripsListController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ TripsListController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(TripsListController tripsListController, Continuation continuation) {
        super(2, continuation);
        this.u = tripsListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new z(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q0 q0Var = (q0) this.u.R2();
        Object content = ((a) ((j2) q0Var.C.f22677a).getValue()).f227028a.getContent();
        g gVar = content instanceof g ? (g) content : null;
        if (gVar != null) {
            q0Var.l1().M0(new mod.s(gVar.f227039b.f227032b));
        }
        return Unit.f186387a;
    }
}
