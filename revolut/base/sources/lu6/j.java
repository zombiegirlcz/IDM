package lu6;

import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.feature.freelancer.common.models.sale.FilteringDateRange;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.FreelancerAcquiringOrderFiltersScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.FreelancerAcquiringOrderFiltersScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nr6.c0;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerAcquiringOrderFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(FreelancerAcquiringOrderFiltersScreen freelancerAcquiringOrderFiltersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerAcquiringOrderFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.R2();
        Object obj3 = yVar.f167226b.f58324n;
        com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a aVar2 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a) nVarE3;
        cli.y yVar2 = aVar2.f73688t;
        t17.l lVar = obj3 instanceof t17.l ? (t17.l) obj3 : null;
        if (lVar != null) {
            Object obj4 = lVar.f267207c;
            if (obj4 instanceof FilteringDateRange) {
                aVar2.H2(yVar2, new cv6.o((FilteringDateRange) obj4, aVar2));
            } else if (obj4 instanceof c0) {
                aVar2.H2(yVar2, new lu5.o((c0) obj4, aVar2, 3));
            } else if (obj4 instanceof ju6.b) {
                aVar2.H2(yVar2, new lu5.o((ju6.b) obj4, aVar2, 2));
            } else if (Intrinsics.f(lVar.f267206b, "ITEM_ID_CUSTOM_DATE_RANGE_CHIP")) {
                AcquiringOrderFilter acquiringOrderFilter = ((l) ((j2) yVar2.f22677a).getValue()).f200048b;
                if ((acquiringOrderFilter != null ? acquiringOrderFilter.B2() : null) instanceof FilteringDateRange.Custom) {
                    aVar2.H2(yVar2, new lsl.b(15));
                } else {
                    oki.h.v2(aVar2.f73687s, FreelancerAcquiringOrderFiltersScreenContract$ModalStep.StartDateRangePicker.f73683a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
            }
        }
        return Unit.f186387a;
    }
}
