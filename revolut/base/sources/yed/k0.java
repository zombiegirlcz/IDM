package yed;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.b1;
import rp0.c1;
import rp0.d1;
import rp0.e1;
import yed.p;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k0 k0Var = new k0(this.v, continuation);
        k0Var.u = obj2;
        return k0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k0) create((e1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        e1 e1Var = (e1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean z = e1Var instanceof b1;
        com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b bVar = this.v;
        if (z) {
            bVar.v2(p.b.f312889a);
        } else if (!(e1Var instanceof c1)) {
            if (!(e1Var instanceof d1)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.v2(p.a.f312888a);
        }
        return Unit.f186387a;
    }
}
