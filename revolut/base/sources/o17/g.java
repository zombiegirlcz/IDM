package o17;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.FreelancerSaleDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerSaleDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FreelancerSaleDetailsScreen freelancerSaleDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerSaleDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        Object obj3 = model.u;
        com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a aVar2 = (com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a) mVarE3;
        aVar2.getClass();
        if (obj3 instanceof FreelancerOrder) {
            aVar2.C1(new FreelancerBizFeatureConfig.SaleDetails(new FreelancerBizFeatureConfig.SaleDetails.Sale.C0487SaleDetails((FreelancerOrder) obj3)));
        }
        return Unit.f186387a;
    }
}
