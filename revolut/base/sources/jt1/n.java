package jt1;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ BizumTransferAmountScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(BizumTransferAmountScreen bizumTransferAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.u = bizumTransferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z zVar = (z) this.u.T2();
        zVar.getClass();
        zVar.l2(new x(zVar, null, 1), new yi5.b(26));
        return Unit.f186387a;
    }
}
