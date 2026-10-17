package mll;

import com.revolut.sso.impl.domain.models.AuthAction;
import com.revolut.sso.impl.domain.models.AuthResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.combined_authentication.flow.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AuthAction.SignIn f207057w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ gkl.i f207058x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.revolut.sso.impl.ui.combined_authentication.flow.c cVar, AuthAction.SignIn signIn, gkl.i iVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f207057w = signIn;
        this.f207058x = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f0(this.v, this.f207057w, this.f207058x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.sso.impl.ui.combined_authentication.flow.c cVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            gu2.e eVar = cVar.u;
            e0 e0Var = new e0(cVar, this.f207057w, this.f207058x, null);
            this.u = 1;
            obj2 = fkl.c.b(eVar, e0Var, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        cVar.V2((AuthResult) obj2, null);
        return Unit.f186387a;
    }
}
