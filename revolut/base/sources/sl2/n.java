package sl2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.backend_driven_limits.impl.v2.ui.list.d f264095w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(com.revolut.feature.backend_driven_limits.impl.v2.ui.list.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f264095w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f264095w, continuation, 0);
            default:
                return new n(this.f264095w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                com.revolut.feature.backend_driven_limits.impl.v2.ui.list.d dVar = this.f264095w;
                rik.e eVar = new rik.e(dVar, null, 25);
                this.v = 1;
                Object objP2 = dVar.p2(this, eVar);
                return objP2 == aVar ? aVar : objP2;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    hl2.a aVar3 = this.f264095w.o;
                    this.v = 1;
                    x4l.c cVar = ((nl2.c) aVar3).f216987a.e;
                    Object obj3 = Unit.f186387a;
                    Object objD = cVar.d(obj3, false, this);
                    if (objD != aVar2) {
                        objD = obj3;
                    }
                    if (objD == aVar2) {
                        obj3 = objD;
                    }
                    if (obj3 == aVar2) {
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
