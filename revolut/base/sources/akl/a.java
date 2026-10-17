package akl;

import com.revolut.sso.api.exceptions.RevolutSSOException;
import com.revolut.sso.impl.domain.models.SsoServerError;
import com.revolut.sso.impl.network.services.AppConsentService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f5989w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f5989w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f5989w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            AppConsentService appConsentService = cVar.f5996c;
            String str = ((rqk.k) cVar.f5995b).f256593p;
            this.u = 1;
            obj2 = appConsentService.approveAppChallenge(this.f5989w, str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        Response response = (Response) obj2;
        if (response.code() != 202) {
            if (response.isSuccessful()) {
                return bjl.a.f16156a;
            }
            HttpException httpException = new HttpException(response);
            if (cVar.d.a(httpException) instanceof SsoServerError.ChallengeNoLongerAvailable) {
                return bjl.c.f16159a;
            }
            throw httpException;
        }
        jkl.r0 r0Var = (jkl.r0) cVar.f5994a.c((String) response.body(), jkl.r0.class);
        if (r0Var instanceof jkl.p0) {
            return new bjl.b(((jkl.p0) r0Var).getAuthenticationId());
        }
        if (!(r0Var instanceof jkl.q0)) {
            throw new NoWhenBranchMatchedException();
        }
        Throwable thInitCause = new HttpException(response).initCause(new RevolutSSOException.IllegalState(j6.a.q("Unexpected confirm app consent response code: ", ((jkl.q0) r0Var).getCode())));
        Intrinsics.checkNotNullExpressionValue(thInitCause, "initCause(...)");
        throw thInitCause;
    }
}
