package u99;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c f278425w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f278425w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f278425w, continuation, 0);
            default:
                return new i(this.f278425w, continuation, 1);
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
        int i = this.u;
        com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c cVar = this.f278425w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.a aVar2 = new com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.a(cVar, null);
                    this.v = 1;
                    e eVar = com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c.Companion;
                    if (cVar.L2(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.b bVar = new com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.b(cVar, null);
                    this.v = 1;
                    if (u0.c0(cVar, "PRODUCT_ARTICLE_CTA_BUTTON_LOADING_TAG", bVar, this) == aVar3) {
                        return aVar3;
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
