package oi8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a f225460w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f225460w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f225460w, continuation, 0);
            case 1:
                return new f(this.f225460w, continuation, 1);
            default:
                return new f(this.f225460w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a aVar2 = this.f225460w;
                e eVar = new e(aVar2, null, 1);
                this.v = 1;
                Object objB = pu7.a.B(aVar2.k, "HANDLE_WORKFLOW_RESULT", eVar, this);
                return objB == aVar ? aVar : objB;
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
                com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a aVar4 = this.f225460w;
                h hVar = new h(aVar4, null);
                this.v = 1;
                Object objP2 = aVar4.p2(this, hVar);
                return objP2 == aVar3 ? aVar3 : objP2;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a aVar6 = this.f225460w;
                    e eVar2 = new e(aVar6, null, 2);
                    this.v = 1;
                    if (aVar6.p2(this, eVar2) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
