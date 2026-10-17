package mf4;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class f0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g f204852w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f204852w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f0(this.f204852w, continuation, 0);
            case 1:
                return new f0(this.f204852w, continuation, 1);
            case 2:
                return new f0(this.f204852w, continuation, 2);
            case 3:
                return new f0(this.f204852w, continuation, 3);
            default:
                return new f0(this.f204852w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
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
                com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar = this.f204852w;
                e0 e0Var = new e0(gVar, null, 1);
                this.v = 1;
                Object objB = pu7.a.B(gVar.k, "acceptOffer", e0Var, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar2 = this.f204852w;
                    com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.c cVar = new com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.c(gVar2, null);
                    this.v = 1;
                    if (gVar2.p2(this, cVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar3 = this.f204852w;
                    e0 e0Var2 = new e0(gVar3, null, 2);
                    this.v = 1;
                    if (gVar3.p2(this, e0Var2) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar4 = this.f204852w;
                e0 e0Var3 = new e0(gVar4, null, 4);
                this.v = 1;
                Object objP2 = gVar4.p2(this, e0Var3);
                return objP2 == aVar4 ? aVar4 : objP2;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                e eVar = this.f204852w.f68151q;
                this.v = 1;
                Serializable serializableN = ((a0) eVar).n(this);
                return serializableN == aVar5 ? aVar5 : serializableN;
        }
    }
}
