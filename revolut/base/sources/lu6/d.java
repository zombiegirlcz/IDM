package lu6;

import com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.FreelancerAcquiringOrderFiltersScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ FreelancerAcquiringOrderFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(FreelancerAcquiringOrderFiltersScreen freelancerAcquiringOrderFiltersScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = freelancerAcquiringOrderFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FreelancerAcquiringOrderFiltersScreen freelancerAcquiringOrderFiltersScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a aVar2 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a) freelancerAcquiringOrderFiltersScreen.R2();
                aVar2.C2(new m(aVar2.f73685q.f73681a));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a aVar4 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a) freelancerAcquiringOrderFiltersScreen.R2();
                aVar4.C2(new m(((l) ((j2) aVar4.f73688t.f22677a).getValue()).f200048b));
                break;
        }
        return Unit.f186387a;
    }
}
