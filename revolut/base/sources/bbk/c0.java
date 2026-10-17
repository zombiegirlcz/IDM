package bbk;

import i12.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ d0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, Continuation continuation) {
        super(2, continuation);
        this.v = d0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c0 c0Var = new c0(this.v, continuation);
        c0Var.u = obj2;
        return c0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c0) create((i12.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        i12.a aVar = (i12.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean z = aVar instanceof i12.b;
        d0 d0Var = this.v;
        if (z) {
            d0Var.H2(d0Var.f14323t, new b0(aVar, 0));
        } else {
            if (!Intrinsics.f(aVar, a.C0902a.f157526a)) {
                throw new NoWhenBranchMatchedException();
            }
            d0.I2("timeout");
            d0Var.l2(new u(1, d0Var, null), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
