package y5b;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import w5b.n1;
import w5b.z4;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ c0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(c0 c0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a0(this.v, continuation, 0);
            default:
                return new a0(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a0) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        c0 c0Var = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n1 n1Var = (n1) c0Var.f311027b.T2("KEY_PLAN_CURRENT", n1.class);
                if (n1Var == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(n1Var, "<this>");
                return new r5b.j(n1Var.f294932a, n1Var.f294933b, n1Var.f294934c, n1Var.d);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z4 z4Var = (z4) c0Var.f311027b.T2("KEY_PRODUCT_ARTICLE", z4.class);
                if (z4Var != null) {
                    return z4Var.f295092a;
                }
                return null;
        }
    }
}
