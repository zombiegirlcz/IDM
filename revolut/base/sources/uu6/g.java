package uu6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.FreelancerAcquiringPaymentDetailsScreen;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tof.a3;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerAcquiringPaymentDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FreelancerAcquiringPaymentDetailsScreen freelancerAcquiringPaymentDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerAcquiringPaymentDetailsScreen;
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
        i iVarE3 = this.v.d();
        Object obj3 = model.u;
        com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.a aVar2 = (com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.a) iVarE3;
        aVar2.getClass();
        if (obj3 instanceof nr6.b) {
            aVar2.C1(new FreelancerBizFeatureConfig.AcquiringOrders(new FreelancerBizFeatureConfig.AcquiringOrders.InitialStep.OrderDetails(((nr6.b) obj3).f218537a)));
        } else if (obj3 instanceof a3) {
            aVar2.C1(u0.c(new TransactionsFeatureConfig.Details(new k71.g((a3) obj3), null, null, null, 126)));
        }
        return Unit.f186387a;
    }
}
