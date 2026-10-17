package i52;

import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.review.TransferReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ TransferReviewScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(TransferReviewScreen transferReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.u = transferReviewScreen;
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
        com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a aVar2 = (com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a) this.u.d();
        aVar2.H2(aVar2.A, new i25.e(new i4h.q(13), aVar2, 2));
        return Unit.f186387a;
    }
}
