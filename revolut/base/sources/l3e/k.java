package l3e;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import com.revolut.feature.store.impl.ui.orders.StoreOrdersScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ StoreOrdersScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(StoreOrdersScreen storeOrdersScreen, Continuation continuation) {
        super(2, continuation);
        this.u = storeOrdersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.store.impl.ui.orders.a aVar2 = (com.revolut.feature.store.impl.ui.orders.a) this.u.R2();
        aVar2.getClass();
        aVar2.C1(new RevPointsGiftcardsDestination(RevPointsGiftcardsDestination.StartType.UsedAndExpiredCards.f83667a, null));
        return Unit.f186387a;
    }
}
