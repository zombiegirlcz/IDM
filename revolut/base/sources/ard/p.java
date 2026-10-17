package ard;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SelectTransactionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(SelectTransactionController selectTransactionController, Continuation continuation) {
        super(2, continuation);
        this.v = selectTransactionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        a3 a3Var = obj3 instanceof a3 ? (a3) obj3 : null;
        if (a3Var != null) {
            ((com.revolut.feature.spending_analytics.impl.ui.rev10.select.a) this.v.d()).L2(a3Var);
        }
        return Unit.f186387a;
    }
}
