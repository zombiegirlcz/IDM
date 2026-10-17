package vg6;

import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.feature.external_accounts.impl.flow.link_result.LinkResultFlowContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, Continuation continuation) {
        super(2, continuation);
        this.v = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        k kVar = this.v;
        LinkResultFlowContract$InputData linkResultFlowContract$InputData = kVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            ack.n nVar = new ack.n(19);
            uk9.h hVar = new uk9.h(kVar, null, 12);
            this.u = 1;
            if (n14.k.Q(kVar, null, null, nVar, hVar, this, 3) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        if (linkResultFlowContract$InputData.e != null) {
            kVar.J2();
            return Unit.f186387a;
        }
        oki.h.D2(kVar.u);
        q qVar = kVar.f288771r;
        ExternalAccountsFeatureConfig.LinkSuccess.UseCase useCase = linkResultFlowContract$InputData.d;
        qVar.getClass();
        return kVar.C1(q.a(useCase));
    }
}
