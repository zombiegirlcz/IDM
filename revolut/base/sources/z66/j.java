package z66;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.defi.asset_details.api.model.DefiCurrency;
import com.revolut.feature.defi.asset_details.api.navigation.DeFiAssetDetailsDestination;
import com.revolut.feature.defi.trade.impl.ui.trade.DefiTradeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DefiTradeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DefiTradeScreen defiTradeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = defiTradeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c cVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.defi.trade.impl.ui.trade.a aVar2 = (com.revolut.feature.defi.trade.impl.ui.trade.a) cVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        DefiCurrency defiCurrency = obj3 instanceof DefiCurrency ? (DefiCurrency) obj3 : null;
        if (defiCurrency != null) {
            aVar2.C1(new DeFiAssetDetailsDestination(defiCurrency.getCurrency()));
        }
        return Unit.f186387a;
    }
}
