package o3b;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;

/* JADX INFO: loaded from: classes6.dex */
public final class k0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ n0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(n0 n0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = n0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k0(this.v, continuation, 0);
            default:
                return new k0(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        n0 n0Var = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n0Var.v.i == null) {
                    n0Var.u.a("CREATE_BRACKET_ORDER_IDEMPOTENCY_TAG");
                } else {
                    n0Var.u.a("UPDATE_ORDER_IDEMPOTENCY_TAG");
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0Var.C2(new b0(null, null, k4l.m0.PENDING));
                break;
        }
        return Unit.f186387a;
    }
}
