package okl;

import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class m0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(com.revolut.sso.impl.ui.auth.n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m0(this.v, continuation, 0);
            case 1:
                return new m0(this.v, continuation, 1);
            default:
                return new m0(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((m0) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.sso.impl.ui.auth.n nVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.f106374p.f226222c.a();
                nVar.u3(false);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                AuthenticationFlowContract$State authenticationFlowContract$State = (AuthenticationFlowContract$State) ((j2) nVar.m0.f22677a).getValue();
                if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.AccessRecovery) {
                    nVar.C2(bjl.o.f16181a);
                } else if (!(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignIn)) {
                    if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.OperationBoundAuthentication) {
                        nVar.k3(bjl.v.f16190a);
                    } else if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.ExternalClientAuthentication) {
                        nVar.C2(bjl.r.f16184a);
                    } else {
                        if (!(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nVar.k3(bjl.f0.f16165a);
                    }
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.u3(true);
                return Unit.f186387a;
        }
    }
}
