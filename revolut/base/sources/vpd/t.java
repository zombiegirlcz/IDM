package vpd;

import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ IncomeSorterDestinationsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(IncomeSorterDestinationsController incomeSorterDestinationsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = incomeSorterDestinationsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.v, continuation, 0);
            default:
                return new t(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Set set;
        int i = this.u;
        IncomeSorterDestinationsController incomeSorterDestinationsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a) incomeSorterDestinationsController.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a aVar3 = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a) incomeSorterDestinationsController.d();
                l lVar = ((d) ((j2) aVar3.v.f22677a).getValue()).f291157b;
                j jVar = lVar instanceof j ? (j) lVar : null;
                if (jVar != null && (set = jVar.f291169a) != null) {
                    Set set2 = set;
                    ArrayList arrayList = new ArrayList(zhm.w.t(set2, 10));
                    Iterator it8 = set2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((IncomeSorterDestinationInfo) it8.next()).getId());
                    }
                    aVar3.C2(new g(zhm.d0.i1(arrayList)));
                }
                break;
        }
        return Unit.f186387a;
    }
}
