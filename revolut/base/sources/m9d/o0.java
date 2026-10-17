package m9d;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class o0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g1 f203730w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f203731x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(g1 g1Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f203730w = g1Var;
        this.f203731x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o0(this.f203730w, this.f203731x, continuation, 0);
            case 1:
                return new o0(this.f203730w, this.f203731x, continuation, 1);
            case 2:
                return new o0(this.f203730w, this.f203731x, continuation, 2);
            case 3:
                return new o0(this.f203730w, this.f203731x, continuation, 3);
            default:
                return new o0(this.f203730w, this.f203731x, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    g1 g1Var = this.f203730w;
                    n0 n0Var = new n0(g1Var, this.f203731x, null, 0);
                    this.v = 1;
                    if (g1Var.p2(this, n0Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
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
                g1 g1Var2 = this.f203730w;
                n0 n0Var2 = new n0(g1Var2, this.f203731x, null, 1);
                this.v = 1;
                Object objP2 = g1Var2.p2(this, n0Var2);
                return objP2 == aVar2 ? aVar2 : objP2;
            case 2:
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
                g1 g1Var3 = this.f203730w;
                n0 n0Var3 = new n0(g1Var3, this.f203731x, null, 2);
                this.v = 1;
                Object objP22 = g1Var3.p2(this, n0Var3);
                return objP22 == aVar3 ? aVar3 : objP22;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                g1 g1Var4 = this.f203730w;
                n0 n0Var4 = new n0(g1Var4, this.f203731x, null, 3);
                this.v = 1;
                Object objP23 = g1Var4.p2(this, n0Var4);
                return objP23 == aVar4 ? aVar4 : objP23;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    g1 g1Var5 = this.f203730w;
                    n0 n0Var5 = new n0(g1Var5, this.f203731x, null, 4);
                    this.v = 1;
                    if (g1Var5.p2(this, n0Var5) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
