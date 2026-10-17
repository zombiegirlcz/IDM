package b6i;

import com.revolut.feature_move_money.api.model.OrderMode;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_move_money.impl.amount.c f12794w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(com.revolut.feature_move_money.impl.amount.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f12794w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k0 k0Var = new k0(this.f12794w, continuation, 0);
                k0Var.v = obj2;
                return k0Var;
            case 1:
                k0 k0Var2 = new k0(this.f12794w, continuation, 1);
                k0Var2.v = obj2;
                return k0Var2;
            default:
                k0 k0Var3 = new k0(this.f12794w, continuation, 2);
                k0Var3.v = obj2;
                return k0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k0) create((s6i.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((k0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k0) create((x) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature_move_money.impl.amount.c cVar = this.f12794w;
        switch (i) {
            case 0:
                s6i.e eVar = (s6i.e) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.Y, new b58.f(eVar, cVar, 10));
                break;
            case 1:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.Y, new b4d.c(cVar, 6, (s6i.e) pair.f186385a, (OrderMode) pair.f186386b));
                break;
            default:
                x xVar = (x) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.Y, new b4b.z(xVar, 18));
                break;
        }
        return Unit.f186387a;
    }
}
