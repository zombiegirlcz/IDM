package jsg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.voluntary.offboarding.impl.ui.flow.e f178176w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f178176w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f178176w, continuation, 0);
            case 1:
                return new e(this.f178176w, continuation, 1);
            case 2:
                return new e(this.f178176w, continuation, 2);
            default:
                return new e(this.f178176w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar = this.f178176w;
                    com.revolut.feature.voluntary.offboarding.impl.ui.flow.a aVar2 = new com.revolut.feature.voluntary.offboarding.impl.ui.flow.a(eVar, null);
                    this.v = 1;
                    if (eVar.p2(this, aVar2) == aVar) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar2 = this.f178176w;
                inh.g gVar = new inh.g(21, null, eVar2);
                this.v = 1;
                Object objP2 = eVar2.p2(this, gVar);
                return objP2 == aVar3 ? aVar3 : objP2;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.voluntary.offboarding.impl.ui.flow.e.O2(this.f178176w, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar3 = this.f178176w;
                    com.revolut.feature.voluntary.offboarding.impl.ui.flow.d dVar = new com.revolut.feature.voluntary.offboarding.impl.ui.flow.d(eVar3, null);
                    this.v = 1;
                    if (eVar3.p2(this, dVar) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
