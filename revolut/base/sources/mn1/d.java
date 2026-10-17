package mn1;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.apm.bills.boleto.impl.screen.review.BoletoTransferReviewScreen;
import dp4.y0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ BoletoTransferReviewScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BoletoTransferReviewScreen boletoTransferReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.u = boletoTransferReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0VarE3 = this.u.R2();
        b0VarE3.getClass();
        b0VarE3.l2(new y0(b0VarE3, (Continuation) null, 11), new yi5.b(26));
        return Unit.f186387a;
    }
}
