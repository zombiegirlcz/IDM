package qh4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.rollee.c f246461w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y f246462x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(com.revolut.feature.credit.application.plugins.impl.ui.rollee.c cVar, y yVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f246461w = cVar;
        this.f246462x = yVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f246461w, this.f246462x, continuation, 0);
            default:
                return new i(this.f246461w, this.f246462x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                com.revolut.feature.credit.application.plugins.impl.ui.rollee.c cVar = this.f246461w;
                cVar.f68336r.set(true);
                com.revolut.feature.credit.application.plugins.impl.ui.rollee.b bVar = new com.revolut.feature.credit.application.plugins.impl.ui.rollee.b(cVar, this.f246462x, null, 1);
                this.v = 1;
                Object objB = pu7.a.B(cVar.k, "session failed", bVar, this);
                return objB == aVar ? aVar : objB;
            default:
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
                com.revolut.feature.credit.application.plugins.impl.ui.rollee.c cVar2 = this.f246461w;
                cVar2.f68336r.set(true);
                com.revolut.feature.credit.application.plugins.impl.ui.rollee.b bVar2 = new com.revolut.feature.credit.application.plugins.impl.ui.rollee.b(cVar2, this.f246462x, null, 2);
                this.v = 1;
                Object objB2 = pu7.a.B(cVar2.k, "session granted", bVar2, this);
                return objB2 == aVar2 ? aVar2 : objB2;
        }
    }
}
