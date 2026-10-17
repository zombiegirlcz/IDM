package mn1;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.apm.bills.boleto.impl.screen.review.BoletoTransferReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BoletoTransferReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BoletoTransferReviewScreen boletoTransferReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = boletoTransferReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.v.R2().I2(model.f51832a);
        return Unit.f186387a;
    }
}
