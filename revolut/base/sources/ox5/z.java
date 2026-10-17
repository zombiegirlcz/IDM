package ox5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.CryptoTradeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoTradeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(CryptoTradeScreen cryptoTradeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoTradeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        z zVar = new z(this.v, continuation);
        zVar.u = obj2;
        return zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vh clickData = (vh) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarD3 = this.v.d();
        Intrinsics.h(clickData);
        com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b bVar = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b) nVarD3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        String str = clickData.f54883a.f53505a;
        Object obj3 = ((RowDelegate.Model) clickData.f54884b).u;
        if (Intrinsics.f(str, "WATCHLIST_REMOVE") && (obj3 instanceof ifd.g)) {
            bVar.n2(new k0(bVar, obj3, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
