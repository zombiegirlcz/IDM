package iw6;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.common.models.FreelancerCustomer;
import com.revolut.feature.freelancer.impl.ui.customer.details.FreelancerCustomerDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerCustomerDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FreelancerCustomerDetailsScreen freelancerCustomerDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerCustomerDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f fVar = (f) this.v.Q.getValue();
        Object obj3 = model.f52715m;
        m mVar = (m) fVar;
        mVar.getClass();
        if (obj3 instanceof o) {
            FreelancerCustomer freelancerCustomer = ((o) obj3).f168984a;
            mVar.C1(new FreelancerBizFeatureConfig.AddCustomerDestination(freelancerCustomer.f73281a, freelancerCustomer.f73282b, freelancerCustomer.f73283c, freelancerCustomer.d, freelancerCustomer.e, freelancerCustomer.f));
        }
        return Unit.f186387a;
    }
}
