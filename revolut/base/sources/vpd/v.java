package vpd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsController;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.a1;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IncomeSorterDestinationsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(IncomeSorterDestinationsController incomeSorterDestinationsController, Continuation continuation) {
        super(2, continuation);
        this.v = incomeSorterDestinationsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v vVar = new v(this.v, continuation);
        vVar.u = obj2;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = ((RowDelegate.Model) model.f53305b).u;
        IncomeSorterDestinationInfo destinationInfo = obj3 instanceof IncomeSorterDestinationInfo ? (IncomeSorterDestinationInfo) obj3 : null;
        if (destinationInfo != null) {
            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a aVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a) this.v.d();
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(destinationInfo, "destinationInfo");
            cli.y yVar = aVar2.v;
            l lVar = ((d) ((j2) yVar.f22677a).getValue()).f291157b;
            j jVar = lVar instanceof j ? (j) lVar : null;
            if (jVar != null) {
                Set set = jVar.f291169a;
                aVar2.H2(yVar, new an9.t(jVar, set.contains(destinationInfo) ? a1.j(set, destinationInfo) : a1.m(set, destinationInfo)));
            }
        }
        return Unit.f186387a;
    }
}
