package rnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m0 m0Var = new m0(2, continuation);
        m0Var.u = obj2;
        return m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m0) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        od0.i iVar = (od0.i) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return iVar.f224257a != null ? zi0.c.i(new AnalyticsAccount.Savings.JointAll(l38.a.c((n38.a) iVar.c()))) : zi0.c.i(AnalyticsAccount.Personal.All.f99192a);
    }
}
