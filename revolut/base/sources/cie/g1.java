package cie;

import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class g1 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.ui.tab.d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.revolut.feature.tab.accounts.impl.ui.tab.d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g1 g1Var = new g1(this.v, continuation);
        g1Var.u = obj2;
        return g1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g1) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        oki.h.v2(this.v.p0, (TabAccountsScreenContract$ModalStep) pair.f186385a, (ModalDestination.Style) pair.f186386b);
        return Unit.f186387a;
    }
}
