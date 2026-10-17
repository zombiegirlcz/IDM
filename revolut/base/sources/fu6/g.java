package fu6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPayment$Id;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.details.FreelancerAcquiringOrderDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerAcquiringOrderDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FreelancerAcquiringOrderDetailsScreen freelancerAcquiringOrderDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerAcquiringOrderDetailsScreen;
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
        j jVarE3 = this.v.R2();
        Object obj3 = model.u;
        com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a aVar2 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a) jVarE3;
        aVar2.getClass();
        if (obj3 instanceof AcquiringPayment$Id) {
            aVar2.C1(new FreelancerBizFeatureConfig.AcquiringPayments(new FreelancerBizFeatureConfig.AcquiringPayments.InitialStep.PaymentDetails(((AcquiringPayment$Id) obj3).f73363a)));
        }
        return Unit.f186387a;
    }
}
