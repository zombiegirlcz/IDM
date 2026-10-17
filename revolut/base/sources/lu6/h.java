package lu6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.FreelancerAcquiringOrderFiltersScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerAcquiringOrderFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(FreelancerAcquiringOrderFiltersScreen freelancerAcquiringOrderFiltersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerAcquiringOrderFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.R2();
        Object obj3 = ((RowDelegate.Model) model.f53305b).u;
        com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a aVar2 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a) nVarE3;
        aVar2.getClass();
        xi0.b bVar = obj3 instanceof xi0.b ? (xi0.b) obj3 : null;
        if (bVar != null) {
            aVar2.H2(aVar2.f73688t, new i5f.g(bVar, aVar2));
        }
        return Unit.f186387a;
    }
}
