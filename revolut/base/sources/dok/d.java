package dok;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.k0;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f116579w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ gim.i f116580x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(AtomicBoolean atomicBoolean, Function1 function1, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        switch (i) {
            case 1:
                this.f116579w = atomicBoolean;
                this.f116580x = (gim.i) function1;
                super(2, continuation);
                break;
            default:
                this.f116579w = atomicBoolean;
                this.f116580x = (gim.i) function1;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f116579w, this.f116580x, continuation, 0);
            default:
                return new d(this.f116579w, this.f116580x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v9, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                AtomicBoolean atomicBoolean = this.f116579w;
                if (i == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (k0.b(50L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        atomicBoolean.set(false);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                if (!atomicBoolean.get()) {
                    this.v = 2;
                    if (this.f116580x.invoke(this) == aVar) {
                        return aVar;
                    }
                }
                atomicBoolean.set(false);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                AtomicBoolean atomicBoolean2 = this.f116579w;
                if (i2 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (k0.b(50L, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        atomicBoolean2.set(false);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                if (!atomicBoolean2.get()) {
                    this.v = 2;
                    if (this.f116580x.invoke(this) == aVar2) {
                        return aVar2;
                    }
                }
                atomicBoolean2.set(false);
                return Unit.f186387a;
        }
    }
}
