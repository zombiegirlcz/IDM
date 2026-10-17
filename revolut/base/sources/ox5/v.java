package ox5;

import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.CryptoTradeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoTradeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(CryptoTradeScreen cryptoTradeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoTradeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v vVar = new v(this.v, continuation);
        vVar.u = obj2;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((SmallStockCardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SmallStockCardDelegate.Model model = (SmallStockCardDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarD3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b bVar = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b) nVarD3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        bVar.I2(model.f53388p);
        return Unit.f186387a;
    }
}
