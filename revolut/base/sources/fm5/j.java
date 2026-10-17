package fm5;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import com.revolut.feature.crypto.strategies.api.R$string;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ l v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, Continuation continuation) {
        super(2, continuation);
        this.v = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((gm5.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        gm5.a aVar = (gm5.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (aVar == gm5.a.ACCEPTED) {
            this.v.C1(new BridgeDestination(new FeatureCommand(new CryptoRemittanceKompotFeatureConfig.CurrencyPicker(new CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData((CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData.Currencies) null, new TextLocalisedClause(R.string.common_currency_picker_header_title, null, null, 14), (CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint) CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.TakeProfitStopLossBuy.f70942a, pj5.a.MARKET_CAP, new TextLocalisedClause(R$string.crypto_strategies_currency_picker_search_hint, null, null, 14), false, false, Constants.TAG_BATTERY_STATE), null))));
        }
        return Unit.f186387a;
    }
}
