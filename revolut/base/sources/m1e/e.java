package m1e;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination;
import com.revolut.feature.stock_lending.impl.ui.v2.screen.product.StockLendingProductScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StockLendingProductScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(StockLendingProductScreen stockLendingProductScreen, Continuation continuation) {
        super(2, continuation);
        this.v = stockLendingProductScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (Intrinsics.f(model.f52708a, "faq_header")) {
            l lVar = (l) this.v.R2();
            lVar.getClass();
            lVar.C1(new SharedHelpDestination((SharedHelpDestination.InputData) null, 3));
        }
        return Unit.f186387a;
    }
}
