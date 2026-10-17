package s17;

import com.revolut.feature.freelancer.common.models.FreelancerAccountDetails;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.freelancer.common.models.FreelancerPermissions;
import gim.i;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(2, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FreelancerAccountDetails freelancerAccountDetails;
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        FreelancerAccountOnboardingState freelancerAccountOnboardingState = (FreelancerAccountOnboardingState) pair.f186385a;
        od0.i iVar = (od0.i) pair.f186386b;
        FreelancerPermissions freelancerPermissions = null;
        FreelancerAccountOnboardingState.Onboarded onboarded = freelancerAccountOnboardingState instanceof FreelancerAccountOnboardingState.Onboarded ? (FreelancerAccountOnboardingState.Onboarded) freelancerAccountOnboardingState : null;
        if (onboarded != null && (freelancerAccountDetails = onboarded.f73273a) != null) {
            freelancerPermissions = freelancerAccountDetails.f73270b;
        }
        return new Pair(freelancerPermissions, iVar.f224257a);
    }
}
