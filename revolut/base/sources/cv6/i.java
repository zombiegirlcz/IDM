package cv6;

import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentFilter;
import com.revolut.feature.freelancer.common.models.sale.FilteringDateRange;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.FreelancerAcquiringPaymentFiltersScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.FreelancerAcquiringPaymentFiltersScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import cul.n0;
import cul.n2;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerAcquiringPaymentFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(FreelancerAcquiringPaymentFiltersScreen freelancerAcquiringPaymentFiltersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerAcquiringPaymentFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        Object obj3 = yVar.f167226b.f58324n;
        com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.a aVar2 = (com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.a) lVarE3;
        cli.y yVar2 = aVar2.f73726t;
        t17.l lVar = obj3 instanceof t17.l ? (t17.l) obj3 : null;
        if (lVar != null) {
            Object obj4 = lVar.f267207c;
            if (obj4 instanceof FilteringDateRange) {
                aVar2.H2(yVar2, new o((FilteringDateRange) obj4, 0));
            } else if (obj4 instanceof lr6.a) {
                aVar2.H2(yVar2, new n0((lr6.a) obj4, 6));
            } else if (obj4 instanceof pr6.k) {
                aVar2.H2(yVar2, new n0((pr6.k) obj4, 4));
            } else if (Intrinsics.f(lVar.f267206b, "ITEM_ID_CUSTOM_DATE_RANGE_CHIP")) {
                AcquiringPaymentFilter acquiringPaymentFilter = ((j) ((j2) yVar2.f22677a).getValue()).f109287b;
                if ((acquiringPaymentFilter != null ? acquiringPaymentFilter.f73368b : null) instanceof FilteringDateRange.Custom) {
                    aVar2.H2(yVar2, new n2(10));
                } else {
                    oki.h.v2(aVar2.f73725s, FreelancerAcquiringPaymentFiltersScreenContract$ModalStep.StartDateRangePicker.f73721a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
            }
        }
        return Unit.f186387a;
    }
}
