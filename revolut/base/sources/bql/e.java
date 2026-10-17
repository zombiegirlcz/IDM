package bql;

import com.revolut.sso.api.accounts.RevolutAccount;
import com.revolut.sso.api.models.Evidence;
import com.revolut.sso.api.models.RevolutAccountSession;
import com.revolut.sso.impl.domain.models.AuthAction;
import com.revolut.sso.impl.domain.models.AuthResult;
import com.revolut.sso.impl.domain.models.InitialAuthenticationCredential;
import com.revolut.sso.impl.domain.models.SsoServerError;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.signin_sessions_flow.a f17847w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f17848x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ RevolutAccountSession f17849y;
    public final /* synthetic */ Evidence z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.sso.impl.ui.signin_sessions_flow.a aVar, String str, RevolutAccountSession revolutAccountSession, Evidence evidence, Continuation continuation) {
        super(2, continuation);
        this.f17847w = aVar;
        this.f17848x = str;
        this.f17849y = revolutAccountSession;
        this.z = evidence;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.f17847w, this.f17848x, this.f17849y, this.z, continuation);
        eVar.v = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws SsoServerError.CaptchaRequired {
        String str = (String) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            akl.d dVar = this.f17847w.o;
            RevolutAccount account = this.f17849y.f105973a;
            Intrinsics.checkNotNullParameter(account, "account");
            InitialAuthenticationCredential.Account account2 = new InitialAuthenticationCredential.Account(account);
            Evidence evidence = this.z;
            List listL = v.l(evidence);
            h0 h0Var = h0.f322473a;
            AuthAction.SignIn signIn = new AuthAction.SignIn(this.f17848x, account2, listL, h0Var, h0Var, str, 16096);
            gkl.i iVar = new gkl.i(null, evidence, null);
            this.v = null;
            this.u = 1;
            obj2 = ((akl.h) dVar).e(signIn, iVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (((AuthResult) obj2) instanceof AuthResult.CaptchaRequired) {
            throw new SsoServerError.CaptchaRequired(null);
        }
        return obj2;
    }
}
