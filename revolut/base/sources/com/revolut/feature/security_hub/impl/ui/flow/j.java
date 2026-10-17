package com.revolut.feature.security_hub.impl.ui.flow;

import com.revolut.feature.security_hub.api.models.WealthProtectionFeaturesState;
import com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        m mVar = this.v;
        yki.a aVar = mVar.N;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            huc.j jVar = new huc.j(mVar, null, 1);
            this.u = 1;
            obj2 = mVar.p2(this, jVar);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        oki.h.t2(mVar, mVar.N, new SecurityHubFlowContract$Step.WealthProtection((WealthProtectionFeaturesState) obj2), ((aVar.d() instanceof SecurityHubFlowContract$Step.Initial) || (aVar.d() instanceof SecurityHubFlowContract$Step.ProductArticle)) ? false : true, null, false, 12);
        return Unit.f186387a;
    }
}
