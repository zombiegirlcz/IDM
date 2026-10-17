package fu6;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.details.FreelancerAcquiringOrderDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.details.FreelancerAcquiringOrderDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru6.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerAcquiringOrderDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FreelancerAcquiringOrderDetailsScreen freelancerAcquiringOrderDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerAcquiringOrderDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        Object obj3 = model.o;
        com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a aVar2 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a) jVarE3;
        aVar2.getClass();
        if (obj3 instanceof jr6.j) {
            aVar2.I2(((jr6.j) obj3).f177944a);
        } else if (obj3 instanceof jr6.i) {
            aVar2.I2(((jr6.i) obj3).f177943a);
        } else if (obj3 instanceof jr6.k) {
            aVar2.I2(((jr6.k) obj3).f177945a);
        } else if (obj3 instanceof ru6.b) {
            aVar2.C1(new FreelancerBizFeatureConfig.InvoiceDetailsNavigationDestination(((ru6.b) obj3).f257446a.f218578a));
        } else if (obj3 instanceof ru6.c) {
            aVar2.C1(new FreelancerBizFeatureConfig.OrderInitPageDetailsDestination(((ru6.c) obj3).f257448a.f218576a));
        } else if (obj3 instanceof ru6.o) {
            aVar2.I2(((ru6.o) obj3).f257454a);
        } else if (obj3 instanceof ru6.t) {
            oki.h.v2(aVar2.z, new FreelancerAcquiringOrderDetailsScreenContract$ModalStep.FeeBreakdown(((ru6.t) obj3).f257457a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else if (obj3 instanceof b0) {
            aVar2.I2(((b0) obj3).f257447a);
        }
        return Unit.f186387a;
    }
}
