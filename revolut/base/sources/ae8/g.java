package ae8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a5h.g f3509w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(a5h.g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f3509w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f3509w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f3509w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        a5h.g gVar = this.f3509w;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e0.C(coroutineScope, rd0.e.i(), null, new f(gVar, null, 0), 2);
                e0.C(coroutineScope, rd0.e.i(), null, new f(gVar, null, 1), 2);
                e0.C(coroutineScope, rd0.e.i(), null, new f(gVar, null, 2), 2);
                e0.C(coroutineScope, rd0.e.i(), null, new f(gVar, null, 3), 2);
                return e0.C(coroutineScope, rd0.e.i(), null, new f(gVar, null, 4), 2);
            default:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return e0.C(coroutineScope2, rd0.e.i(), null, new f(gVar, null, 5), 2);
        }
    }
}
