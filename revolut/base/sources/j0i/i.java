package j0i;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature_crypto_picker.impl.ui.picker.CryptoPickerController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ CryptoPickerController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CryptoPickerController cryptoPickerController, Continuation continuation) {
        super(2, continuation);
        this.u = cryptoPickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        KProperty[] kPropertyArr = CryptoPickerController.U;
        this.u.d3().f174565c.i0();
        return Unit.f186387a;
    }
}
