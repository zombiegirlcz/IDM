package bem;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import oim.n;
import yhm.o;

/* JADX INFO: loaded from: classes23.dex */
public final class g extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f14884w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f14885x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f14885x = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        sem.f fVar = (sem.f) obj2;
        switch (this.u) {
            case 0:
                g gVar = new g((n) this.f14885x, (Continuation) obj4, 0);
                gVar.f14884w = fVar;
                return gVar.invokeSuspend(Unit.f186387a);
            case 1:
                g gVar2 = new g((Function2) this.f14885x, (Continuation) obj4, 1);
                gVar2.f14884w = fVar;
                return gVar2.invokeSuspend(Unit.f186387a);
            default:
                g gVar3 = new g((vdm.b) this.f14885x, (Continuation) obj4, 2);
                gVar3.f14884w = fVar;
                return gVar3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                sem.f fVar = (sem.f) this.f14884w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    n nVar = (n) this.f14885x;
                    f fVar2 = new f();
                    Object obj3 = fVar.f262233a;
                    Object objB = fVar.b();
                    this.f14884w = null;
                    this.v = 1;
                    if (nVar.invoke(fVar2, obj3, objB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                sem.f fVar3 = (sem.f) this.f14884w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    Function2 function2 = (Function2) this.f14885x;
                    Object obj4 = fVar3.f262233a;
                    this.f14884w = null;
                    this.v = 1;
                    if (function2.invoke(obj4, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                sem.f fVar4 = (sem.f) this.f14884w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                try {
                    if (i3 == 0) {
                        o.b(obj2);
                        this.f14884w = fVar4;
                        this.v = 1;
                        obj2 = fVar4.c(this);
                        if (obj2 == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    return Unit.f186387a;
                } catch (Throwable cause) {
                    jem.b bVar = ((vdm.b) this.f14885x).i;
                    hem.c response = ((wdm.f) fVar4.f262233a).d();
                    Intrinsics.checkNotNullParameter(response, "response");
                    Intrinsics.checkNotNullParameter(cause, "cause");
                    bVar.getClass();
                    glm.a definition = iem.a.d;
                    Intrinsics.checkNotNullParameter(definition, "definition");
                    jem.a.a(((pem.a) bVar.f173621b).a(definition));
                    throw cause;
                }
        }
    }
}
