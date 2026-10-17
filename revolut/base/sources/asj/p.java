package asj;

import com.revolut.retail.feature.impl.budgeting.ui.rev10.flow.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.u.l1().M0(a.C0626a.f101511b);
        return Unit.f186387a;
    }
}
