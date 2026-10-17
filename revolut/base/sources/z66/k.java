package z66;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.defi.trade.impl.ui.trade.DefiTradeContract$ModalStep;
import com.revolut.feature.defi.trade.impl.ui.trade.DefiTradeScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ DefiTradeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(DefiTradeScreen defiTradeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = defiTradeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.defi.trade.impl.ui.trade.a aVar2 = (com.revolut.feature.defi.trade.impl.ui.trade.a) this.u.R2();
        oki.h.v2(aVar2.f71891w, new DefiTradeContract$ModalStep.SelectSorting(((b) ((j2) aVar2.f71892x.f22677a).getValue()).e), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
