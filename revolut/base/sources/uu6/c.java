package uu6;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.FreelancerAcquiringPaymentDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.FreelancerAcquiringPaymentDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import iv6.s;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerAcquiringPaymentDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FreelancerAcquiringPaymentDetailsScreen freelancerAcquiringPaymentDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerAcquiringPaymentDetailsScreen;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        pr6.g gVar;
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.d();
        String listId = model.f51832a;
        Object obj3 = model.o;
        com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.a aVar2 = (com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.a) iVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "LIST_ID_TOTAL_PROCESSING_FEE_ITEM")) {
            od0.i iVar = (od0.i) ((h) ((j2) aVar2.v.f22677a).getValue()).f283142a.getContent();
            pr6.e eVar = (iVar == null || (gVar = (pr6.g) iVar.f224257a) == null) ? null : gVar.f238951a;
            if (eVar != null && (list = eVar.f238946n) != null) {
                oki.h.v2(aVar2.f73712w, new FreelancerAcquiringPaymentDetailsScreenContract$ModalStep.FeeBreakdown(list), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        }
        if (obj3 instanceof jr6.i) {
            aVar2.I2(((jr6.i) obj3).f177943a);
        } else if (obj3 instanceof jr6.j) {
            aVar2.I2(((jr6.j) obj3).f177944a);
        } else if (obj3 instanceof jr6.k) {
            aVar2.I2(((jr6.k) obj3).f177945a);
        } else if (obj3 instanceof iv6.r) {
            aVar2.I2(((iv6.r) obj3).f168760a);
        } else if (obj3 instanceof s) {
            aVar2.I2(((s) obj3).f168761a);
        }
        return Unit.f186387a;
    }
}
