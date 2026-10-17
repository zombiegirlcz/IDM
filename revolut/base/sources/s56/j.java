package s56;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.defi.remittances.impl.ui.send.amount.DeFiSendAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ DeFiSendAmountScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DeFiSendAmountScreen deFiSendAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.u = deFiSendAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.defi.remittances.impl.ui.send.amount.b) this.u.d()).f71839y.a();
        return Unit.f186387a;
    }
}
