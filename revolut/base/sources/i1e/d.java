package i1e;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.stock_lending.impl.ui.screens.details.StockLendingDetailsScreen;
import com.revolut.feature.stock_lending.impl.ui.screens.transaction.StockLendingTransactionDetailsScreen;
import com.revolut.feature.stock_lending.impl.ui.screens.transaction.StockLendingTransactionDetailsScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StockLendingDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(StockLendingDetailsScreen stockLendingDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = stockLendingDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVar = (h) this.v.Y.getValue();
        Object obj3 = model.u;
        s sVar = (s) hVar;
        sVar.getClass();
        if (obj3 instanceof c1e.a) {
            yji.l.g2(sVar, new StockLendingTransactionDetailsScreen(new StockLendingTransactionDetailsScreenContract$InputData((c1e.a) obj3)), ModalDestination.Style.POPUP.f98311a, null, 2);
        }
        return Unit.f186387a;
    }
}
