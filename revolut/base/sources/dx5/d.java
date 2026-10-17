package dx5;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.confirmation.CryptoCommodityBuyCollectionConfirmationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoCommodityBuyCollectionConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CryptoCommodityBuyCollectionConfirmationScreen cryptoCommodityBuyCollectionConfirmationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoCommodityBuyCollectionConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g gVar = (g) this.v.Y.getValue();
        String listId = model.f51781a;
        n nVar = (n) gVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (!Intrinsics.f(listId, "BUY_COLLECTION_CONFIRMATION_FEE_CELL_ID")) {
            throw new IllegalStateException(a10.b.s("Click on cell action with listId ", listId, " not supported"));
        }
        ((com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.a) nVar.f120885s).P2();
        return Unit.f186387a;
    }
}
