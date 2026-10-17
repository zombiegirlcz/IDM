package t42;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c f267871w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f267871w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x(this.f267871w, continuation, 0);
            case 1:
                return new x(this.f267871w, continuation, 1);
            default:
                return new x(this.f267871w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((x) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar = this.f267871w;
                    w wVar = new w(cVar, null);
                    this.v = 1;
                    if (cVar.p2(this, wVar) == aVar) {
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
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar2 = this.f267871w;
                    z zVar = new z(cVar2, null, 0);
                    this.v = 1;
                    if (cVar2.p2(this, zVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar3 = this.f267871w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = vkm.q.x(cVar3.f62444q.Z2(cVar3.N2(), ((b) ((j2) cVar3.G.f22677a).getValue()).d.f267843a), this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                if (((hrf.h) obj2).b()) {
                    this.v = 2;
                    if (com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c.J2(cVar3, this) == aVar3) {
                        return aVar3;
                    }
                }
                return Unit.f186387a;
        }
    }
}
