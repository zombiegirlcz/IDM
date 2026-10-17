package je5;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.crypto.currency_pair.picker.impl.ui.currency_pair_picker.CryptoCurrencyPairPickerScreen;
import je5.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ CryptoCurrencyPairPickerScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CryptoCurrencyPairPickerScreen cryptoCurrencyPairPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cryptoCurrencyPairPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((q) this.u.R2()).I2(i.a.f173219a);
        return Unit.f186387a;
    }
}
