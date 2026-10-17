package fu6;

import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.common.models.FreelancerAccountDetails;
import com.revolut.feature.freelancer.common.models.FreelancerPermissions;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderPayment;
import com.revolut.feature.freelancer.common.models.payments.FreelancerOrderPaymentReceipt;
import com.revolut.feature.freelancer.common.models.payments.FreelancerPaymentReceipt;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.details.FreelancerAcquiringOrderDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.details.FreelancerAcquiringOrderDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import fjd.g0;
import ip0.y;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.t0;
import nr6.w;
import vkm.j2;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerAcquiringOrderDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FreelancerAcquiringOrderDetailsScreen freelancerAcquiringOrderDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerAcquiringOrderDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FreelancerPermissions freelancerPermissions;
        FreelancerPaymentReceipt freelancerPaymentReceipt;
        String str;
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        Object obj3 = yVar.f167226b.f58324n;
        com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a aVar2 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a) jVarE3;
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.z;
        if (obj3 instanceof hu6.b) {
            aVar2.n2(new g0(aVar2, obj3, null, 18), new whi.b(6));
        } else {
            boolean z = obj3 instanceof hu6.c;
            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
            if (z) {
                ArrayList arrayList = ((hu6.c) obj3).f155565a;
                if (arrayList.size() > 1) {
                    oki.h.v2(aVar3, new FreelancerAcquiringOrderDetailsScreenContract$ModalStep.ReceiptPaymentSelection(arrayList), bottom_dialog);
                } else {
                    FreelancerOrderPaymentReceipt freelancerOrderPaymentReceipt = (FreelancerOrderPaymentReceipt) d0.d0(arrayList);
                    if (freelancerOrderPaymentReceipt != null && (freelancerPaymentReceipt = freelancerOrderPaymentReceipt.f73460b) != null && (str = freelancerPaymentReceipt.f73461a) != null) {
                        tqi.g gVar = aVar2.f73677t;
                        m70.a.c(t0.f186434a);
                        aVar2.C1(u0.b(gVar.f(8378, "", str)));
                    }
                }
            } else if (obj3 instanceof hu6.d) {
                w wVar = ((hu6.d) obj3).f155566a;
                FreelancerAccountDetails freelancerAccountDetails = (FreelancerAccountDetails) ((i) ((j2) aVar2.f73680y.f22677a).getValue()).f138088a.getContent();
                if (freelancerAccountDetails == null || (freelancerPermissions = freelancerAccountDetails.f73270b) == null || !freelancerPermissions.f73322b) {
                    oki.h.v2(aVar3, new FreelancerAcquiringOrderDetailsScreenContract$ModalStep.AccountRestriction(lr6.d.OUTBOUND_BLOCKED), ModalDestination.Style.POPUP.f98311a);
                } else {
                    ArrayList arrayList2 = wVar.e;
                    if (arrayList2.size() > 1) {
                        oki.h.v2(aVar3, new FreelancerAcquiringOrderDetailsScreenContract$ModalStep.RefundPaymentSelection(arrayList2), bottom_dialog);
                    } else {
                        AcquiringOrderPayment acquiringOrderPayment = (AcquiringOrderPayment) d0.d0(arrayList2);
                        if (acquiringOrderPayment != null) {
                            aVar2.C1(new FreelancerBizFeatureConfig.OrderPaymentRefund(acquiringOrderPayment, pyd.c.H(acquiringOrderPayment.f73358g, acquiringOrderPayment.i)));
                        }
                    }
                }
            }
        }
        return Unit.f186387a;
    }
}
