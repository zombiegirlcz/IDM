package aqd;

import com.revolut.core.ui_kit.delegates.DraggableDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.IncomeSortersDetailsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class e1 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IncomeSortersDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(IncomeSortersDetailsController incomeSortersDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = incomeSortersDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e1 e1Var = new e1(this.v, continuation);
        e1Var.u = obj2;
        return e1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e1) create((DraggableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        DraggableDelegate.Model model = (DraggableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.f52202l;
        IncomeSorterHomeContract$DestinationValue destination = obj3 instanceof IncomeSorterHomeContract$DestinationValue ? (IncomeSorterHomeContract$DestinationValue) obj3 : null;
        if (destination != null) {
            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e eVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e) this.v.d();
            eVar.getClass();
            Intrinsics.checkNotNullParameter(destination, "destination");
            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.d dVar = eVar.f87760p;
            IncomeSorterDestinationId destinationId = destination.f87827c;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(destinationId, "destinationId");
            dqd.j jVar = dVar.f87758b;
            List destinations = zhm.u.c(destinationId);
            Intrinsics.checkNotNullParameter(destinations, "destinations");
            j2 j2Var = jVar.f116947c;
            j2Var.g(null, zhm.d0.F0(new dqd.g(destinations), (Collection) j2Var.getValue()));
        }
        return Unit.f186387a;
    }
}
