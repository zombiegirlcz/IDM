package ox5;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.CryptoTradeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoTradeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(CryptoTradeScreen cryptoTradeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoTradeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.v, continuation);
        sVar.u = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean zF = Intrinsics.f(model.f52373a, "SEARCH_CLEAR_LIST_ITEM_ID");
        CryptoTradeScreen cryptoTradeScreen = this.v;
        if (zF) {
            com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b bVar = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b) cryptoTradeScreen.d();
            bVar.W0("");
            ((lx5.b) bVar.G).f200529c.k(iw5.h.f168966a);
        } else {
            com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b bVar2 = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b) cryptoTradeScreen.d();
            bVar2.getClass();
            Intrinsics.checkNotNullParameter(model, "model");
            String str = model.f52373a;
            if (Intrinsics.f(str, "WATCHLIST_SECTION_ITEM_ID")) {
                bVar2.L2();
            } else if (Intrinsics.f(str, "SEARCH_ERROR_LIST_ITEM_ID")) {
                bVar2.K2();
            }
        }
        return Unit.f186387a;
    }
}
