package cie;

import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.tab.accounts.impl.ui.tab.AccountsController;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AccountsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AccountsController accountsController, Continuation continuation) {
        super(2, continuation);
        this.v = accountsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        vh model = (vh) pair.f186385a;
        com.revolut.feature.tab.accounts.impl.ui.tab.d dVar = (com.revolut.feature.tab.accounts.impl.ui.tab.d) this.v.R2();
        dVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        dVar.O2(model);
        return Unit.f186387a;
    }
}
