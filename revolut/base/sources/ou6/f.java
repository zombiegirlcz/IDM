package ou6;

import com.revolut.feature.freelancer.impl.ui.acquiring_order.list.FreelancerAcquiringOrderListScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.list.FreelancerAcquiringOrderListScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerAcquiringOrderListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(FreelancerAcquiringOrderListScreen freelancerAcquiringOrderListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerAcquiringOrderListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        String listId = yVar.f167226b.f58316a;
        com.revolut.feature.freelancer.impl.ui.acquiring_order.list.a aVar2 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.list.a) lVarE3;
        cli.y yVar2 = aVar2.f73703x;
        Intrinsics.checkNotNullParameter(listId, "listId");
        switch (listId.hashCode()) {
            case -786800373:
                if (listId.equals("ACQUIRING_CHANNEL_FILTER_CHIP")) {
                    aVar2.H2(yVar2, new o(1));
                }
                break;
            case -629059764:
                if (listId.equals("AMOUNT_FILTER_CHIP")) {
                    aVar2.H2(yVar2, new os9.f(27));
                }
                break;
            case 188189923:
                if (listId.equals("CURRENCIES_FILTER_CHIP")) {
                    aVar2.H2(yVar2, new os9.f(28));
                }
                break;
            case 553958412:
                if (listId.equals("ACQUIRING_DATE_RANGE_FILTER_CHIP")) {
                    aVar2.H2(yVar2, new os9.f(29));
                }
                break;
            case 1081656880:
                if (listId.equals("FILTERS_CHIP")) {
                    oki.h.v2(aVar2.f73702w, new FreelancerAcquiringOrderListScreenContract$ModalStep.SalesFilters(((h) ((j2) yVar2.f22677a).getValue()).d), ModalDestination.Style.POPUP.f98311a);
                }
                break;
            case 1919282098:
                if (listId.equals("ACQUIRING_STATUS_FILTER_CHIP")) {
                    aVar2.H2(yVar2, new o(0));
                }
                break;
        }
        return Unit.f186387a;
    }
}
