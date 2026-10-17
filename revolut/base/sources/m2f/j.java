package m2f;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.buying.api.navigation.InputData;
import com.revolut.feature.rev_points.buying.api.navigation.RevPointsBuyingDestination;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.TradeRevPointsTransferScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TradeRevPointsTransferScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TradeRevPointsTransferScreen tradeRevPointsTransferScreen, Continuation continuation) {
        super(2, continuation);
        this.v = tradeRevPointsTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarR2 = this.v.R2();
        String listId = model.f53228a;
        com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a aVar2 = (com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a) qVarR2;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "TOP_UP_BUY_REV_POINTS_ITEM")) {
            aVar2.C1(new RevPointsBuyingDestination(new InputData(false, (Integer) null, (Function1) new m11.h(aVar2, 5), 5)));
        }
        return Unit.f186387a;
    }
}
