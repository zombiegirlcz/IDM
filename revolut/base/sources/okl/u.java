package okl;

import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.ChallengeDetails;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$UaePass;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class u extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.sso.impl.ui.auth.n nVar, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        u uVar = new u(this.v, continuation);
        uVar.u = obj2;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((gkl.e0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        gkl.e0 e0Var = (gkl.e0) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Challenge challenge = e0Var.f144443a;
        ChallengeDetails challengeDetails = challenge.f106101g;
        if ((challengeDetails instanceof ChallengeDetails.UaePass ? (ChallengeDetails.UaePass) challengeDetails : null) == null) {
            throw new IllegalStateException("Expected UaePass challenge details");
        }
        com.revolut.sso.impl.ui.auth.n.j3(this.v, new AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$UaePass(challenge));
        return Unit.f186387a;
    }
}
