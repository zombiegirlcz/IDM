package okl;

import com.revolut.sso.api.models.EmailEvidence;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$EmailOtp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AuthenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$EmailOtp f226176w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ tni.f f226177x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.revolut.sso.impl.ui.auth.n nVar, AuthenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$EmailOtp authenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$EmailOtp, tni.f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
        this.f226176w = authenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$EmailOtp;
        this.f226177x = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f0(this.v, this.f226176w, this.f226177x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            Claim.Email email = new Claim.Email(this.f226176w.f106329a);
            gkl.m mVar = gkl.m.EMAIL;
            String secret = ((tni.e) this.f226177x).f272457a;
            Intrinsics.checkNotNullParameter(secret, "secret");
            EmailEvidence emailEvidence = new EmailEvidence(secret);
            this.u = 1;
            if (com.revolut.sso.impl.ui.auth.n.L2(this.v, email, mVar, emailEvidence, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
