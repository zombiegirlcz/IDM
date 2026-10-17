package okl;

import com.revolut.sso.api.models.Evidence;
import com.revolut.sso.impl.domain.models.AuthAction;
import com.revolut.sso.impl.domain.models.AuthResult;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.domain.models.SsoServerError;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class q extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226231w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Claim f226232x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Evidence f226233y;
    public final /* synthetic */ Set z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.sso.impl.ui.auth.n nVar, Claim claim, Evidence evidence, Set set, Continuation continuation) {
        super(2, continuation);
        this.f226231w = nVar;
        this.f226232x = claim;
        this.f226233y = evidence;
        this.z = set;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.f226231w, this.f226232x, this.f226233y, this.z, continuation);
        qVar.v = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws SsoServerError.CaptchaRequired {
        gkl.i iVar;
        String str = (String) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.sso.impl.ui.auth.n nVar = this.f226231w;
            AuthAction authActionR2 = nVar.R2(str);
            AuthenticationFlowContract$State authenticationFlowContract$State = (AuthenticationFlowContract$State) ((j2) nVar.m0.f22677a).getValue();
            boolean z = authenticationFlowContract$State instanceof AuthenticationFlowContract$State.AccessRecovery;
            Claim claim = this.f226232x;
            Evidence evidence = this.f226233y;
            Set set = this.z;
            if (z || (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignIn)) {
                iVar = new gkl.i(claim, evidence, set);
            } else {
                if (!(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.OperationBoundAuthentication) && !(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.ExternalClientAuthentication) && !(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication)) {
                    throw new NoWhenBranchMatchedException();
                }
                iVar = new gkl.i(null, evidence, set);
            }
            n1 n1Var = nVar.f106374p;
            this.v = null;
            this.u = 1;
            obj2 = ((akl.h) n1Var.f226220a).e(authActionR2, iVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        AuthResult authResult = (AuthResult) obj2;
        if (authResult instanceof AuthResult.CaptchaRequired) {
            throw new SsoServerError.CaptchaRequired(null);
        }
        return authResult;
    }
}
