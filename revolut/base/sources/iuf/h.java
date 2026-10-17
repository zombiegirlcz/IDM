package iuf;

import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.ManualTransferReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ ManualTransferReviewScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ManualTransferReviewScreen manualTransferReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.u = manualTransferReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CellDetailsSwitcherDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a aVar2 = (com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a) this.u.d();
        aVar2.H2(aVar2.f92495y, new is6.t(new isd.a(24), aVar2, 12));
        return Unit.f186387a;
    }
}
