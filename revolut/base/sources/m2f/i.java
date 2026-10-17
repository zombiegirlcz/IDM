package m2f;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.TradeRevPointsTransferScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TradeRevPointsTransferScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TradeRevPointsTransferScreen tradeRevPointsTransferScreen, Continuation continuation) {
        super(2, continuation);
        this.v = tradeRevPointsTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a aVar2 = (com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a) qVarR2;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        aVar2.H.a();
        aVar2.G.a();
        return Unit.f186387a;
    }
}
