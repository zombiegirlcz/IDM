package mll;

import com.revolut.sso.impl.domain.models.AuthAction;
import com.revolut.sso.impl.domain.models.AuthResult;
import com.revolut.sso.impl.domain.models.SsoServerError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.combined_authentication.flow.c f207052w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AuthAction.SignIn f207053x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ gkl.i f207054y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.revolut.sso.impl.ui.combined_authentication.flow.c cVar, AuthAction.SignIn signIn, gkl.i iVar, Continuation continuation) {
        super(2, continuation);
        this.f207052w = cVar;
        this.f207053x = signIn;
        this.f207054y = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e0 e0Var = new e0(this.f207052w, this.f207053x, this.f207054y, continuation);
        e0Var.v = obj2;
        return e0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws SsoServerError.CaptchaRequired {
        String str = (String) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            akl.d dVar = this.f207052w.B;
            AuthAction.SignIn signInB = AuthAction.SignIn.b(this.f207053x, str);
            this.v = null;
            this.u = 1;
            obj2 = ((akl.h) dVar).e(signInB, this.f207054y, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        if (((AuthResult) obj2) instanceof AuthResult.CaptchaRequired) {
            throw new SsoServerError.CaptchaRequired(null);
        }
        return obj2;
    }
}
