package bx5;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cryptocommodity_invest.api.R$string;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.amount.v2.CryptoCommodityBuyCollectionAmountScreenV2;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import io3.l;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.y0;
import zw5.n;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoCommodityBuyCollectionAmountScreenV2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CryptoCommodityBuyCollectionAmountScreenV2 cryptoCommodityBuyCollectionAmountScreenV2, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoCommodityBuyCollectionAmountScreenV2;
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
        o.b(obj2);
        zw5.e eVarI3 = this.v.T2();
        Object obj3 = model.f51981p;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
        xi0.b currency = (xi0.b) obj3;
        n nVar = (n) eVarI3;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        String str = ((zw5.a) nVar.t2()).f;
        l lVar = l.CURRENT;
        aim.o oVar = new aim.o();
        oVar.add(k1j.a.POCKETS);
        oVar.add(k1j.a.CRYPTO);
        oVar.add(k1j.a.VAULTS);
        nVar.C1(new BridgeDestination(vhi.c.c(new CurrencyChooserFlowDestination(new CurrencyChooserFlowDestination.StartType.BalancePicker(str, currency, lVar, (Set) null, (Set) null, (Set) y0.a(oVar), new TextLocalisedClause(R$string.cryptocommodity_invest_collections_amount_buy_from_title, null, null, 14), true, (Integer) 4, (Set) null, 1080)), yhi.b.POPUP, 4, false, 8)));
        return Unit.f186387a;
    }
}
