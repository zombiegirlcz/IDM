package i52;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.review.TransferReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class w extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransferReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(TransferReviewScreen transferReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transferReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        w wVar = new w(this.v, continuation);
        wVar.u = obj2;
        return wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.d();
        com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a aVar2 = (com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a) iVarE3;
        aVar2.J2(model.o, model.f51832a);
        return Unit.f186387a;
    }
}
