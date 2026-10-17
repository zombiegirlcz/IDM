package t9f;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.buy_in_price.BuyInPriceScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BuyInPriceScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BuyInPriceScreen buyInPriceScreen, Continuation continuation) {
        super(2, continuation);
        this.v = buyInPriceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        Intrinsics.h(model);
        o oVar = (o) lVarE3;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        bw0.m mVar = model.e;
        if ((mVar != null ? mVar.e : null) instanceof g) {
            j60.a aVar2 = oVar.f269030q;
            oVar.f269029p.getClass();
            aVar2.x(d0.a(new TextLocalisedClause(R$string.trading_stocks_transfer_in_asset_price_sheet_title, null, null, 14), new TextLocalisedClause(R$string.trading_stocks_transfer_in_asset_price_sheet_subtitle, null, null, 14), new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), "PURCHASEPRICE_GOT_IT_BUTTON_ID", h.f269017a, 992));
        }
        return Unit.f186387a;
    }
}
