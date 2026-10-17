package dwc;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.TransactionsDayNightLimitsScreen;
import com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.TransactionsDayNightLimitsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransactionsDayNightLimitsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TransactionsDayNightLimitsScreen transactionsDayNightLimitsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transactionsDayNightLimitsScreen;
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

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowStep flowStep;
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.O.getValue();
        String listId = model.f52708a;
        com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a aVar2 = (com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.a) gVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (!Intrinsics.f(listId, "OTHER_LIMITS_SUBHEADER_LIST_ID")) {
            if (Intrinsics.f(listId, "INDIVIDUAL_LIMITS_SUBHEADER_LIST_ID")) {
                flowStep = TransactionsDayNightLimitsScreenContract$ModalStep.TransfersToIndividuals.f85726a;
            }
            return Unit.f186387a;
        }
        flowStep = TransactionsDayNightLimitsScreenContract$ModalStep.OtherPaymentsAndTransfers.f85724a;
        oki.h.v2(aVar2.f85733x, flowStep, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
