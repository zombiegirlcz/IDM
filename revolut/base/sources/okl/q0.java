package okl;

import com.revolut.sso.api.accounts.RevolutAccount;
import com.revolut.sso.api.models.UserInfo;
import com.revolut.sso.impl.domain.models.InitialAuthenticationCredential;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class q0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.revolut.sso.impl.ui.auth.n nVar, Continuation continuation) {
        super(1, continuation);
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new q0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((q0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.sso.impl.ui.auth.n nVar = this.v;
            InitialAuthenticationCredential f106296b = ((AuthenticationFlowContract$State) ((j2) nVar.m0.f22677a).getValue()).getF106296b();
            Intrinsics.i(f106296b, "null cannot be cast to non-null type com.revolut.sso.impl.domain.models.InitialAuthenticationCredential.Account");
            RevolutAccount revolutAccount = ((InitialAuthenticationCredential.Account) f106296b).f106153a;
            uil.a aVar2 = nVar.R;
            this.u = 1;
            obj2 = ((pjl.z0) aVar2).l(revolutAccount, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        UserInfo userInfo = (UserInfo) obj2;
        if (userInfo != null) {
            return userInfo.f105990a;
        }
        return null;
    }
}
