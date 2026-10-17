package ox5;

import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.CryptoTradeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoTradeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(CryptoTradeScreen cryptoTradeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoTradeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        x xVar = new x(this.v, continuation);
        xVar.u = obj2;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((ReferralContactDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ReferralContactDelegate.Model model = (ReferralContactDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarD3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b bVar = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b) nVarD3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        bVar.I2(model.f53167l);
        return Unit.f186387a;
    }
}
