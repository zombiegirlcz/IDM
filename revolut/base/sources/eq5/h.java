package eq5;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.CryptoSendAmountInputScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ CryptoSendAmountInputScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CryptoSendAmountInputScreen cryptoSendAmountInputScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cryptoSendAmountInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) this.u.d()).L2();
        return Unit.f186387a;
    }
}
