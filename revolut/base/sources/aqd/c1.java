package aqd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.IncomeSortersDetailsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.IncomeSorterFlowContract$SelectionMode;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models.RemainingBalanceDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class c1 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IncomeSortersDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(IncomeSortersDetailsController incomeSortersDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = incomeSortersDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c1 c1Var = new c1(this.v, continuation);
        c1Var.u = obj2;
        return c1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c1) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        RemainingBalanceDestination remainingBalanceDestination = obj3 instanceof RemainingBalanceDestination ? (RemainingBalanceDestination) obj3 : null;
        if (remainingBalanceDestination != null) {
            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e eVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e) this.v.d();
            eVar.getClass();
            Intrinsics.checkNotNullParameter(remainingBalanceDestination, "remainingBalanceDestination");
            m mVar = (m) ((t) ((j2) eVar.f87766x.f22677a).getValue()).f8402a.getContent();
            if (mVar != null) {
                RemainingBalanceDestination remainingBalanceDestination2 = mVar.f;
                eVar.l1().M0(new kqd.l(new IncomeSorterFlowContract$SelectionMode.RemainingBalanceDestinationSelection(remainingBalanceDestination2 instanceof RemainingBalanceDestination.PlaceholderCurrencyDestination ? (RemainingBalanceDestination.PlaceholderCurrencyDestination) remainingBalanceDestination2 : null, remainingBalanceDestination), mVar.f8363a.f115083b));
            }
        }
        return Unit.f186387a;
    }
}
