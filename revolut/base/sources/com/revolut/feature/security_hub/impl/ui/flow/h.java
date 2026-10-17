package com.revolut.feature.security_hub.impl.ui.flow;

import com.revolut.feature.security_hub.impl.ui.flow.SecurityHubFlowContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f85563w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SecurityHubFlowContract$Step.Initial.Destination.WealthProtection f85564x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, CoroutineScope coroutineScope, SecurityHubFlowContract$Step.Initial.Destination.WealthProtection wealthProtection, Continuation continuation) {
        super(1, continuation);
        this.v = mVar;
        this.f85563w = coroutineScope;
        this.f85564x = wealthProtection;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, this.f85563w, this.f85564x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            SecurityHubFlowContract$Step.Initial.Destination.WealthProtection wealthProtection = this.f85564x;
            m mVar = this.v;
            g gVar = new g(mVar, this.f85563w, wealthProtection, null);
            this.u = 1;
            if (mVar.p2(this, gVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
