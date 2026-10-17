package yca;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.pix.screens.transfer_input_key.PixTransferInputKeyScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ PixTransferInputKeyScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PixTransferInputKeyScreen pixTransferInputKeyScreen, Continuation continuation) {
        super(2, continuation);
        this.u = pixTransferInputKeyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((t) this.u.R2()).C2(i.f312583a);
        return Unit.f186387a;
    }
}
