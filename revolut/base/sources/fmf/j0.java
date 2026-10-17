package fmf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n0 f136396w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f136397x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f136398y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(n0 n0Var, String str, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f136396w = n0Var;
        this.f136397x = str;
        this.f136398y = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j0(this.f136396w, this.f136397x, this.f136398y, continuation, 0);
            case 1:
                return new j0(this.f136396w, this.f136397x, this.f136398y, continuation, 1);
            default:
                return new j0(this.f136396w, this.f136397x, this.f136398y, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                n0 n0Var = this.f136396w;
                i0 i0Var = new i0(n0Var, this.f136397x, this.f136398y, null, 1);
                this.v = 1;
                Object objB = pu7.a.B(n0Var.k, "CLICK_TASK_ID", i0Var, this);
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
                n0 n0Var2 = this.f136396w;
                i0 i0Var2 = new i0(n0Var2, this.f136397x, this.f136398y, null, 3);
                this.v = 1;
                Object objB2 = pu7.a.B(n0Var2.k, "CLICK_TASK_ID", i0Var2, this);
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
                n0 n0Var3 = this.f136396w;
                i0 i0Var3 = new i0(n0Var3, this.f136397x, this.f136398y, null, 5);
                this.v = 1;
                Object objB3 = pu7.a.B(n0Var3.k, "CLICK_TASK_ID", i0Var3, this);
                return objB3 == aVar3 ? aVar3 : objB3;
        }
    }
}
