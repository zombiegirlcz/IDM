package com.revolut.feature.security_hub.impl.ui.flow;

import com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f85565w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SecurityHubFlowContract$Step.Initial.Destination.WealthProtection f85566x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, SecurityHubFlowContract$Step.Initial.Destination.WealthProtection wealthProtection, Continuation continuation) {
        super(2, continuation);
        this.f85565w = mVar;
        this.f85566x = wealthProtection;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.f85565w, this.f85566x, continuation);
        iVar.v = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        SecurityHubFlowContract$Step.Initial.Destination.WealthProtection wealthProtection = this.f85566x;
        m mVar = this.f85565w;
        h hVar = new h(mVar, coroutineScope, wealthProtection, null);
        this.v = null;
        this.u = 1;
        Object objB = pu7.a.B(mVar.k, "handleWealthProtectionSecurityDelay", hVar, this);
        return objB == aVar ? aVar : objB;
    }
}
