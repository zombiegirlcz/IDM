package b6i;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_move_money.impl.amount.c f12782w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(com.revolut.feature_move_money.impl.amount.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f12782w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g0(this.f12782w, continuation, 0);
            default:
                return new g0(this.f12782w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature_move_money.impl.amount.c cVar = this.f12782w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    h6i.e0 e0Var = cVar.f97288r;
                    this.v = 1;
                    obj2 = e0Var.c(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                cVar.H2(cVar.Y, new t((s6i.e) obj2, 1));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature_move_money.impl.amount.c cVar2 = this.f12782w;
                a3i.q qVar = new a3i.q(cVar2, null, 7);
                this.v = 1;
                Object objB = pu7.a.B(cVar2.k, "MoveMoneyDualAmountCta", qVar, this);
                return objB == aVar2 ? aVar2 : objB;
        }
    }
}
