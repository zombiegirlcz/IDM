package au6;

import com.revolut.feature.freelancer.impl.network.models.c0;
import com.revolut.feature.freelancer.impl.network.services.FreelancerAccountService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ n1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(n1 n1Var, Continuation continuation) {
        super(2, continuation);
        this.v = n1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m1(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            n1 n1Var = this.v;
            du6.h hVar = (du6.h) j6.a.k(du6.h.class, n1Var.f9581c, "STORAGE_CACHE_KEY_JOIN_CAMPAIGN_PARAMS");
            if (hVar != null) {
                n1Var.f9581c.I0("STORAGE_CACHE_KEY_JOIN_CAMPAIGN_PARAMS");
                FreelancerAccountService freelancerAccountService = n1Var.f9579a;
                c0.Companion companion = com.revolut.feature.freelancer.impl.network.models.c0.INSTANCE;
                String origin = hVar.getOrigin();
                String refValue = hVar.getRefValue();
                companion.getClass();
                com.revolut.feature.freelancer.impl.network.models.c0 c0VarA = c0.Companion.a(origin, refValue);
                this.u = 1;
                obj2 = freelancerAccountService.uploadJoinCampaignParams(c0VarA, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yhm.o.b(obj2);
        return Unit.f186387a;
    }
}
