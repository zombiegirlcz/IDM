package ejd;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ gim.i f126861w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f126862x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(Function2 function2, CoroutineScope coroutineScope, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        switch (i) {
            case 1:
                this.f126861w = (gim.i) function2;
                this.f126862x = coroutineScope;
                super(1, continuation);
                break;
            case 2:
                this.f126861w = (gim.i) function2;
                this.f126862x = coroutineScope;
                super(1, continuation);
                break;
            case 3:
                this.f126861w = (gim.i) function2;
                this.f126862x = coroutineScope;
                super(1, continuation);
                break;
            default:
                this.f126861w = (gim.i) function2;
                this.f126862x = coroutineScope;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r3v3, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f126861w, this.f126862x, continuation, 0);
            case 1:
                return new j(this.f126861w, this.f126862x, continuation, 1);
            case 2:
                return new j(this.f126861w, this.f126862x, continuation, 2);
            default:
                return new j(this.f126861w, this.f126862x, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r4v13, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r4v5, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r4v9, types: [gim.i, kotlin.jvm.functions.Function2] */
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
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.v = 1;
                Object objInvoke = this.f126861w.invoke(this.f126862x, this);
                return objInvoke == aVar ? aVar : objInvoke;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.v = 1;
                Object objInvoke2 = this.f126861w.invoke(this.f126862x, this);
                return objInvoke2 == aVar2 ? aVar2 : objInvoke2;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.v = 1;
                Object objInvoke3 = this.f126861w.invoke(this.f126862x, this);
                return objInvoke3 == aVar3 ? aVar3 : objInvoke3;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.v = 1;
                Object objInvoke4 = this.f126861w.invoke(this.f126862x, this);
                return objInvoke4 == aVar4 ? aVar4 : objInvoke4;
        }
    }
}
