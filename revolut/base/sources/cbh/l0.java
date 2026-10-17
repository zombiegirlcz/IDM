package cbh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class l0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n0 f22828w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(n0 n0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f22828w = n0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l0(this.f22828w, continuation, 0);
            case 1:
                return new l0(this.f22828w, continuation, 1);
            default:
                return new l0(this.f22828w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                n0 n0Var = this.f22828w;
                k0 k0Var = new k0(n0Var, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(n0Var.e, "event_load_up", k0Var, this);
                return objB == aVar ? aVar : objB;
            case 1:
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
                n0 n0Var2 = this.f22828w;
                k0 k0Var2 = new k0(n0Var2, null, 1);
                this.v = 1;
                Object objB2 = pu7.a.B(n0Var2.e, "event_load_down", k0Var2, this);
                return objB2 == aVar2 ? aVar2 : objB2;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                n0 n0Var3 = this.f22828w;
                k0 k0Var3 = new k0(n0Var3, null, 2);
                this.v = 1;
                Object objB3 = pu7.a.B(n0Var3.e, "event_retry", k0Var3, this);
                return objB3 == aVar3 ? aVar3 : objB3;
        }
    }
}
