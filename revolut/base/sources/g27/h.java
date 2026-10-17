package g27;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.details.OrderInitPageDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderInitPageDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(OrderInitPageDetailsScreen orderInitPageDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = orderInitPageDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.R2();
        Object obj3 = model.u;
        t tVar = (t) oVarE3;
        tVar.getClass();
        if (obj3 instanceof nr6.b) {
            tVar.C1(new FreelancerBizFeatureConfig.AcquiringOrders(new FreelancerBizFeatureConfig.AcquiringOrders.InitialStep.OrderDetails(((nr6.b) obj3).f218537a)));
        } else if (obj3 instanceof FreelancerOrder) {
            tVar.C1(((ct6.m) tVar.f139933q).h((FreelancerOrder) obj3));
        }
        return Unit.f186387a;
    }
}
