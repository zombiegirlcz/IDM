package ot1;

import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.feature.apm.bizum.impl.ui.transfer.review.BizumTransferReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ BizumTransferReviewScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(BizumTransferReviewScreen bizumTransferReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.u = bizumTransferReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new t(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((CellDetailsSwitcherDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0VarI3 = this.u.T2();
        b0VarI3.f229392w.x(((bqf.e) b0VarI3.f229393x).b());
        return Unit.f186387a;
    }
}
