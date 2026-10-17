package xw5;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.CryptoCommodityBuyCollectionFlow;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoCommodityBuyCollectionFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CryptoCommodityBuyCollectionFlow cryptoCommodityBuyCollectionFlow, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoCommodityBuyCollectionFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.T.getValue();
        String listId = model.f52613a;
        com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.a aVar2 = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.a) dVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (!Intrinsics.f(listId, "MINIMUM_INVESTMENT_DIALOG_ID") && !Intrinsics.f(listId, "FIRST_TIME_BUY_DIALOG_BUTTON_ID")) {
            throw new IllegalStateException(a10.b.s("Click on large action button with listId ", listId, " not supported"));
        }
        j60.a.v(aVar2.f71534t, false, null, 3);
        return Unit.f186387a;
    }
}
