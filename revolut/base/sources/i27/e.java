package i27;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.OrderInitPageListScreen;
import com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderInitPageListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(OrderInitPageListScreen orderInitPageListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = orderInitPageListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g gVarE3 = this.v.d();
        Object obj3 = model.u;
        com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.b bVar = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.b) gVarE3;
        bVar.getClass();
        if (obj3 instanceof OrderInitiationPage) {
            bVar.C1(new FreelancerBizFeatureConfig.OrderInitPageDetailsDestination(((OrderInitiationPage) obj3).f86427a));
        }
        return Unit.f186387a;
    }
}
