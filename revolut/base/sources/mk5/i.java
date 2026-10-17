package mk5;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.crypto.remittance.impl.ui.currency_picker.CurrencyChooserScreen;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositDestination;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositInput;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ CurrencyChooserScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CurrencyChooserScreen currencyChooserScreen, Continuation continuation) {
        super(2, continuation);
        this.u = currencyChooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a aVar2 = (com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a) this.u.d();
        aVar2.getClass();
        aVar2.C1(new CryptoDepositDestination(new CryptoDepositInput.DirectDeposit.AllOptions(false)));
        return Unit.f186387a;
    }
}
