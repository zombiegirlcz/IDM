package fv6;

import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.FreelancerAcquiringPaymentListScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.FreelancerAcquiringPaymentListScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerAcquiringPaymentListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FreelancerAcquiringPaymentListScreen freelancerAcquiringPaymentListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerAcquiringPaymentListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.R2();
        String listId = yVar.f167226b.f58316a;
        com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b bVar = (com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b) kVarE3;
        cli.y yVar2 = bVar.f73736s;
        Intrinsics.checkNotNullParameter(listId, "listId");
        switch (listId.hashCode()) {
            case -1927257472:
                if (listId.equals("ACQUIRING_PAYMENT_STATE_FILTER_CHIP")) {
                    bVar.l2(new p(bVar, AcquiringPaymentsQuery.a(((g) ((j2) yVar2.f22677a).getValue()).f138360b, null, h0.f322473a, null, null, null, LDSFile.EF_SOD_TAG), null, 0), new yi5.b(26));
                }
                break;
            case -931891942:
                if (listId.equals("ACQUIRING_PAYMENT_METHOD_FILTER_CHIP")) {
                    bVar.l2(new p(bVar, AcquiringPaymentsQuery.a(((g) ((j2) yVar2.f22677a).getValue()).f138360b, null, null, null, h0.f322473a, null, 95), null, 1), new yi5.b(26));
                }
                break;
            case 188189923:
                if (listId.equals("CURRENCIES_FILTER_CHIP")) {
                    bVar.l2(new p(bVar, AcquiringPaymentsQuery.a(((g) ((j2) yVar2.f22677a).getValue()).f138360b, null, null, h0.f322473a, null, null, LDSFile.EF_DG15_TAG), null, 3), new yi5.b(26));
                }
                break;
            case 553958412:
                if (listId.equals("ACQUIRING_DATE_RANGE_FILTER_CHIP")) {
                    bVar.l2(new p(bVar, AcquiringPaymentsQuery.a(((g) ((j2) yVar2.f22677a).getValue()).f138360b, null, null, null, null, null, 121), null, 2), new yi5.b(26));
                }
                break;
            case 1081656880:
                if (listId.equals("FILTERS_CHIP")) {
                    oki.h.v2(bVar.f73735r, new FreelancerAcquiringPaymentListScreenContract$ModalStep.PaymentFilters(bVar.f73734q.w(((g) ((j2) yVar2.f22677a).getValue()).f138360b)), ModalDestination.Style.POPUP.f98311a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
