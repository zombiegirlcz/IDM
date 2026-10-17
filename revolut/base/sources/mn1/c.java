package mn1;

import com.revolut.feature.apm.bills.boleto.impl.screen.review.BoletoTransferReviewScreen;
import dp4.y0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BoletoTransferReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(BoletoTransferReviewScreen boletoTransferReviewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = boletoTransferReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BoletoTransferReviewScreen boletoTransferReviewScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                boletoTransferReviewScreen.R2().B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0VarE3 = boletoTransferReviewScreen.R2();
                b0VarE3.getClass();
                b0VarE3.l2(new y0(b0VarE3, (Continuation) null, 11), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
