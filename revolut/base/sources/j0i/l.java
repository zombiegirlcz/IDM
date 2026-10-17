package j0i;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature_crypto_picker.impl.ui.picker.CryptoPickerController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ CryptoPickerController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(CryptoPickerController cryptoPickerController, Continuation continuation) {
        super(2, continuation);
        this.u = cryptoPickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature_crypto_picker.impl.ui.picker.a aVar2 = (com.revolut.feature_crypto_picker.impl.ui.picker.a) this.u.d();
        aVar2.H2(aVar2.u, new p(aVar2, 1));
        return Unit.f186387a;
    }
}
