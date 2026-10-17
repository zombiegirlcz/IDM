package a68;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f1560w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f1560w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f1560w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f1560w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            default:
                d dVar3 = new d(this.f1560w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        e eVar = this.f1560w;
        Continuation continuation = null;
        int i2 = 2;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e0.C(coroutineScope, rd0.e.i(), null, new c(eVar, continuation, 1), 2);
                e0.C(coroutineScope, rd0.e.i(), null, new c(eVar, continuation, i2), 2);
                e0.C(coroutineScope, rd0.e.i(), null, new c(eVar, continuation, 3), 2);
                e0.C(coroutineScope, rd0.e.i(), null, new c(eVar, continuation, 4), 2);
                return e0.C(coroutineScope, rd0.e.i(), null, new c(eVar, continuation, 5), 2);
            case 1:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e0.C(coroutineScope2, rd0.e.i(), null, new c(eVar, continuation, 6), 2);
                e0.C(coroutineScope2, rd0.e.i(), null, new c(eVar, continuation, 7), 2);
                e0.C(coroutineScope2, rd0.e.i(), null, new c(eVar, continuation, 8), 2);
                return e0.C(coroutineScope2, rd0.e.i(), null, new c(eVar, continuation, 9), 2);
            default:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e0.C(coroutineScope3, rd0.e.i(), null, new c(eVar, continuation, 10), 2);
                e0.C(coroutineScope3, rd0.e.i(), null, new c(eVar, continuation, 11), 2);
                return e0.C(coroutineScope3, rd0.e.i(), null, new c(eVar, continuation, 12), 2);
        }
    }
}
