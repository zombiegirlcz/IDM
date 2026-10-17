package ybj;

import com.revolut.feature.crypto.tfr.validation.api.model.MeshEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MeshEvent.TransferCompleted.Success f312381w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MeshEvent.IntegrationConnected f312382x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b bVar, MeshEvent.TransferCompleted.Success success, MeshEvent.IntegrationConnected integrationConnected, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f312381w = success;
        this.f312382x = integrationConnected;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, this.f312381w, this.f312382x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
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
        MeshEvent.IntegrationConnected integrationConnected = this.f312382x;
        com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b bVar = this.v;
        j jVar = new j(bVar, this.f312381w, integrationConnected, null);
        this.u = 1;
        Object objP2 = bVar.p2(this, jVar);
        return objP2 == aVar ? aVar : objP2;
    }
}
