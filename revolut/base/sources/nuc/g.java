package nuc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.security_hub.impl.ui.hidden_transactions.HiddenTransactionsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njj.n0;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ HiddenTransactionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(HiddenTransactionsScreen hiddenTransactionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = hiddenTransactionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vh clickData = (vh) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        Intrinsics.h(clickData);
        com.revolut.feature.security_hub.impl.ui.hidden_transactions.a aVar2 = (com.revolut.feature.security_hub.impl.ui.hidden_transactions.a) lVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        if (Intrinsics.f(clickData.f54883a.f53505a, "UNHIDE")) {
            Object obj3 = ((RowDelegate.Model) clickData.f54884b).u;
            Continuation continuation = null;
            a3 a3Var = obj3 instanceof a3 ? (a3) obj3 : null;
            if (a3Var != null) {
                aVar2.A1(new n0(aVar2, a3Var, continuation, 20), new yi5.b(25));
            }
        }
        return Unit.f186387a;
    }
}
