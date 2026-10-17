package yra;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ PushToCardTransferAmountScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PushToCardTransferAmountScreen pushToCardTransferAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.u = pushToCardTransferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVar = (x) this.u.T2();
        xVar.getClass();
        xVar.l2(new u(xVar, null, 1), new yi5.b(26));
        return Unit.f186387a;
    }
}
