package n0c;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.rev_points.buying.api.navigation.InputData;
import com.revolut.feature.rev_points.buying.api.navigation.RevPointsBuyingDestination;
import com.revolut.feature.rev_points.impl.ui.transactions.details.RevPointsTransactionDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsTransactionDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RevPointsTransactionDetailsScreen revPointsTransactionDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsTransactionDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        String listId = item.f58316a;
        com.revolut.feature.rev_points.impl.ui.transactions.details.b bVar = (com.revolut.feature.rev_points.impl.ui.transactions.details.b) jVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        Continuation continuation = null;
        if (iHashCode != -1297832070) {
            if (iHashCode != -1160237073) {
                if (iHashCode == 342683007 && listId.equals("BUY_AGAIN_ONE_OFF_PURCHASE_LIST_ID")) {
                    bVar.C1(new RevPointsBuyingDestination(new InputData(false, (Integer) null, (Function1) null, 15)));
                }
            } else if (listId.equals("MANAGE_SPARE_CHANGE_LIST_ID")) {
                bVar.A1(new mci.e(bVar, continuation, 27), new yi5.b(25));
            }
        } else if (listId.equals("MANAGE_RECURRING_PURCHASE_LIST_ID")) {
            bVar.C1(new RevPointsBuyingDestination(new InputData(true, (Integer) null, (Function1) null, 14)));
        }
        return Unit.f186387a;
    }
}
