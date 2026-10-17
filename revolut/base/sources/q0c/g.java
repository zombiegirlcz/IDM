package q0c;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.impl.ui.transactions.list.RevPointsTransactionsListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsTransactionsListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(RevPointsTransactionsListScreen revPointsTransactionsListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsTransactionsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarF3 = this.v.k3();
        Intrinsics.h(model);
        com.revolut.feature.rev_points.impl.ui.transactions.list.d dVar = (com.revolut.feature.rev_points.impl.ui.transactions.list.d) pVarF3;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52373a, "EMPTY_ITEM_LIST_ID")) {
            dVar.C1(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenEarnHub(3)));
        }
        return Unit.f186387a;
    }
}
