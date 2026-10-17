package vgf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransactionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(TransactionsScreen transactionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transactionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vh actionData = (vh) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVarR2 = this.v.R2();
        Intrinsics.h(actionData);
        com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar2 = (com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a) uVarR2;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(actionData, "actionData");
        Object obj3 = ((RowDelegate.Model) actionData.f54884b).u;
        a3 a3Var = obj3 instanceof a3 ? (a3) obj3 : null;
        if (a3Var != null) {
            aVar2.n2(new z0(actionData, aVar2, null, a3Var), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
