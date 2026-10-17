package pmk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f237632w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f237633x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(v vVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f237632w = vVar;
        this.f237633x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u(this.f237632w, this.f237633x, continuation, 0);
            default:
                return new u(this.f237632w, this.f237633x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                v vVar = this.f237632w;
                t tVar = new t(vVar, this.f237633x, null, 0);
                this.v = 1;
                Object objP2 = vVar.p2(this, tVar);
                return objP2 == aVar ? aVar : objP2;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    v vVar2 = this.f237632w;
                    ajk.b bVar = vVar2.z;
                    String str = this.f237633x;
                    pe2.c cVar = new pe2.c(vVar2, str, 15);
                    this.v = 1;
                    if (igk.k.b(vVar2, bVar, str, cVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
