package n3e;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import com.revolut.feature.store.impl.ui.orders.see_all.StoreOrdersSeeAllScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ StoreOrdersSeeAllScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(StoreOrdersSeeAllScreen storeOrdersSeeAllScreen, Continuation continuation) {
        super(2, continuation);
        this.u = storeOrdersSeeAllScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.store.impl.ui.orders.see_all.a aVar2 = (com.revolut.feature.store.impl.ui.orders.see_all.a) this.u.d();
        aVar2.getClass();
        aVar2.C1(new RevPointsGiftcardsDestination(RevPointsGiftcardsDestination.StartType.UsedAndExpiredCards.f83667a, null));
        return Unit.f186387a;
    }
}
