package t9f;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.buy_in_price.BuyInPriceScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BuyInPriceScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BuyInPriceScreen buyInPriceScreen, Continuation continuation) {
        super(2, continuation);
        this.v = buyInPriceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        Intrinsics.h(model);
        o oVar = (o) lVarE3;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.i instanceof h) {
            j60.a.v(oVar.f269030q, false, null, 3);
        }
        return Unit.f186387a;
    }
}
