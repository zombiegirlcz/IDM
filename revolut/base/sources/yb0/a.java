package yb0;

import com.revolut.core.backend_flow.impl.ui.transactions.TransactionsSelectionController;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends gim.i implements Function2 {
    public final /* synthetic */ TransactionsSelectionController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TransactionsSelectionController transactionsSelectionController, Continuation continuation) {
        super(2, continuation);
        this.u = transactionsSelectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.u.d();
        if (((d) ((j2) iVar.f312151x.f22677a).getValue()).f312145c.getError() != null) {
            iVar.l2(new y7i.h(iVar, null, 3), new y8a.h(iVar, 14));
        } else {
            dc0.f fVar = iVar.f312149t;
            fVar.getClass();
            fVar.T2(new dc0.e(fVar, null), new yi5.b(27));
        }
        return Unit.f186387a;
    }
}
