package ru5;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ z u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, Continuation continuation) {
        super(2, continuation);
        this.u = zVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new y(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return this.u.C1(new BridgeDestination(new FeatureCommand(new CryptoRemittanceKompotFeatureConfig.CurrencyPicker(new CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData((CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData.Currencies) null, new TextLocalisedClause(R.string.currency_select_title, null, null, 14), (CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint) CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.OrdersWidget.f70940a, (pj5.a) null, (TextLocalisedClause) null, false, false, Constants.TAG_F5), null))));
    }
}
