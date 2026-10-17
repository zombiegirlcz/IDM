package lqb;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f199293w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f199294x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f199294x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f199294x, continuation, 0);
                cVar.f199293w = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f199294x, continuation, 1);
                cVar2.f199293w = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.f199293w;
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
                aim.e eVarB = u.b();
                g gVar = this.f199294x;
                Continuation continuation = null;
                eVarB.add(e0.g(coroutineScope, null, null, new b(gVar, continuation, 8), 3));
                eVarB.add(e0.g(coroutineScope, null, null, new b(gVar, continuation, 9), 3));
                eVarB.add(e0.g(coroutineScope, null, null, new b(gVar, continuation, 10), 3));
                eVarB.add(e0.g(coroutineScope, null, null, new b(gVar, continuation, 11), 3));
                eVarB.add(e0.g(coroutineScope, null, null, new b(gVar, continuation, 12), 3));
                eVarB.add(e0.g(coroutineScope, null, null, new b(gVar, continuation, 13), 3));
                eVarB.add(e0.g(coroutineScope, null, null, new b(gVar, continuation, 14), 3));
                eVarB.add(e0.g(coroutineScope, null, null, new b(gVar, continuation, 15), 3));
                aim.e eVarA = u.a(eVarB);
                this.f199293w = null;
                this.v = 1;
                Object objH = e0.h(eVarA, this);
                return objH == aVar ? aVar : objH;
            default:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f199293w;
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
                aim.e eVarB2 = u.b();
                g gVar2 = this.f199294x;
                eVarB2.add(e0.g(coroutineScope2, null, null, new d(gVar2, null), 3));
                eVarB2.add(e0.g(coroutineScope2, null, null, new e(gVar2, null), 3));
                eVarB2.add(e0.g(coroutineScope2, null, null, new f(gVar2, null), 3));
                aim.e eVarA2 = u.a(eVarB2);
                this.f199293w = null;
                this.v = 1;
                Object objH2 = e0.h(eVarA2, this);
                return objH2 == aVar2 ? aVar2 : objH2;
        }
    }
}
