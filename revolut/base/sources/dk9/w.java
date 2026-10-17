package dk9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zh9.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f115485w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r0 f115486x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(a0 a0Var, r0 r0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f115485w = a0Var;
        this.f115486x = r0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.f115485w, this.f115486x, continuation, 0);
            case 1:
                return new w(this.f115485w, this.f115486x, continuation, 1);
            default:
                return new w(this.f115485w, this.f115486x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((w) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                a0 a0Var = this.f115485w;
                v vVar = new v(a0Var, this.f115486x, null, 1);
                this.v = 1;
                Object objB = pu7.a.B(a0Var.k, "cancel", vVar, this);
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
                r0 r0Var = this.f115486x;
                a0 a0Var2 = this.f115485w;
                v vVar2 = new v(r0Var, a0Var2, null);
                this.v = 1;
                Object objB2 = pu7.a.B(a0Var2.k, "check_balance_to_cancel", vVar2, this);
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
                a0 a0Var3 = this.f115485w;
                v vVar3 = new v(a0Var3, this.f115486x, null, 3);
                this.v = 1;
                Object objB3 = pu7.a.B(a0Var3.k, "pay_now", vVar3, this);
                return objB3 == aVar3 ? aVar3 : objB3;
        }
    }
}
