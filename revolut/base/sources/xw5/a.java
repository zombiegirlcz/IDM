package xw5;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.CryptoCommodityBuyCollectionFlow;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoCommodityBuyCollectionFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CryptoCommodityBuyCollectionFlow cryptoCommodityBuyCollectionFlow, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoCommodityBuyCollectionFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.T.getValue();
        String listId = model.f51781a;
        com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.a aVar2 = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.a) dVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (!Intrinsics.f(listId, "BREAKDOWN_DIALOG_FEE_CELL_ID")) {
            throw new IllegalStateException(a10.b.s("Click on action cell within dialog with listId ", listId, " not supported"));
        }
        aVar2.O2();
        return Unit.f186387a;
    }
}
