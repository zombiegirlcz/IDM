package xu6;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.fees.FreelancerAcquiringPaymentFeesScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.fees.FreelancerAcquiringPaymentFeesScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerAcquiringPaymentFeesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FreelancerAcquiringPaymentFeesScreen freelancerAcquiringPaymentFeesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerAcquiringPaymentFeesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.P.getValue();
        Object obj3 = model.o;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = ((com.revolut.feature.freelancer.impl.ui.acquiring_payment.fees.a) eVar).f73718q;
        if (obj3 instanceof pr6.h) {
            int i = i.f308970a[((pr6.h) obj3).ordinal()];
            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
            if (i == 1) {
                oki.h.v2(aVar2, FreelancerAcquiringPaymentFeesScreenContract$ModalStep.PromotionFees.f73716a, bottom_dialog);
            } else if (i == 2) {
                oki.h.v2(aVar2, FreelancerAcquiringPaymentFeesScreenContract$ModalStep.ProcessingFees.f73715a, bottom_dialog);
            } else if (i == 3) {
                oki.h.v2(aVar2, FreelancerAcquiringPaymentFeesScreenContract$ModalStep.ExchangeFees.f73714a, bottom_dialog);
            }
        }
        return Unit.f186387a;
    }
}
