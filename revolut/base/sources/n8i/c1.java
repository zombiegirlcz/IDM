package n8i;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class c1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_move_money.impl.topup.a f213411w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(com.revolut.feature_move_money.impl.topup.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f213411w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c1(this.f213411w, continuation, 0);
            case 1:
                return new c1(this.f213411w, continuation, 1);
            default:
                return new c1(this.f213411w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature_move_money.impl.topup.a aVar2 = this.f213411w;
                u0 u0Var = new u0(aVar2, null, 1);
                this.v = 1;
                Object objB = pu7.a.B(aVar2.k, "MoveMoneyTopupAmountCta", u0Var, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature_move_money.impl.topup.a aVar4 = this.f213411w;
                d1 d1Var = new d1(aVar4, null);
                this.v = 1;
                Object objP2 = aVar4.p2(this, d1Var);
                return objP2 == aVar3 ? aVar3 : objP2;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature_move_money.impl.topup.a aVar6 = this.f213411w;
                e1 e1Var = new e1(aVar6, null);
                this.v = 1;
                Object objP22 = aVar6.p2(this, e1Var);
                return objP22 == aVar5 ? aVar5 : objP22;
        }
    }
}
