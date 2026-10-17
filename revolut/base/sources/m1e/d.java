package m1e;

import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.feature.stock_lending.impl.ui.v2.screen.product.StockLendingProductScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lu6.p;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StockLendingProductScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(StockLendingProductScreen stockLendingProductScreen, Continuation continuation) {
        super(2, continuation);
        this.v = stockLendingProductScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((ExpandableCellDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ExpandableCellDelegate.Model model = (ExpandableCellDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVarR2 = this.v.R2();
        String faqId = model.f52256a;
        l lVar = (l) gVarR2;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(faqId, "faqId");
        lVar.H2(lVar.f201487r, new p(faqId, 4));
        return Unit.f186387a;
    }
}
