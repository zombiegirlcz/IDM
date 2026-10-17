package akl;

import com.google.gson.reflect.TypeToken;
import com.revolut.sso.api.models.Evidence;
import com.revolut.sso.api.models.GoogleEvidence;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.domain.models.SessionToken;
import com.revolut.sso.impl.network.services.ClaimsService;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements l {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClaimsService f6080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f6081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1 f6082c;
    public final lkl.b d;
    public final x4l.c e;

    public r(ClaimsService service, ne0.j memoryCache, f1 sessionTokenRepository, lkl.b ssoServerErrorParser) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(sessionTokenRepository, "sessionTokenRepository");
        Intrinsics.checkNotNullParameter(ssoServerErrorParser, "ssoServerErrorParser");
        this.f6080a = service;
        this.f6081b = memoryCache;
        this.f6082c = sessionTokenRepository;
        this.d = ssoServerErrorParser;
        Continuation continuation = null;
        this.e = new x4l.c(new a72.k(this, continuation, 3), new afa.q(this, 17), new ack.f(this, 20), new o(2, 0, continuation), new a19.e(3, 3, continuation));
    }

    public static final mkl.b a(r rVar) {
        String str;
        SessionToken sessionTokenG = ((n1) rVar.f6082c).g();
        if (sessionTokenG == null || (str = sessionTokenG.f106160a) == null) {
            return null;
        }
        return new mkl.b(str);
    }

    public static final gkl.n1 b(r rVar, Response response) {
        Lazy lazy = ikl.a.f161999a;
        Object objBody = response.body();
        if (objBody == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        kg.o oVarA = ikl.a.a();
        Type type = new TypeToken<jkl.h>() { // from class: com.revolut.sso.impl.data.repositories.ClaimsRepositoryImpl$prepareAuthenticationAcceptedResponse$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d((String) objBody, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        jkl.h hVar = (jkl.h) objD;
        if (!(hVar instanceof jkl.c)) {
            if ((hVar instanceof jkl.a) || (hVar instanceof jkl.d) || (hVar instanceof jkl.f) || (hVar instanceof jkl.e) || (hVar instanceof jkl.g)) {
                throw new HttpException(response);
            }
            throw new NoWhenBranchMatchedException();
        }
        jkl.c cVar = (jkl.c) hVar;
        if (cVar.getSessionToken() != null) {
            ((n1) rVar.f6082c).i(new SessionToken(cVar.getSessionToken()));
        }
        Challenge challengeA = yjl.f.a(cVar.getChallenge());
        ArrayList arrayListZ = zhm.d0.Z(cVar.getAvailableMethods());
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : arrayListZ) {
            if (((jkl.i) obj2) != jkl.i.UNKNOWN) {
                arrayList.add(obj2);
            }
        }
        return new gkl.n1(challengeA, arrayList);
    }

    public final Object c(String str, Evidence evidence, gim.c cVar) {
        skm.p0 p0Var = skm.p0.f264001a;
        return skm.e0.J(elm.f.f127540b, new a1a.b(this, str, evidence, null, 25), cVar);
    }

    public final Object d(String str, gkl.n nVar, gim.i iVar) throws Throwable {
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, new a1a.b(this, nVar, str, null, 26), iVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    public final Object e(String str, String str2, Claim claim, GoogleEvidence googleEvidence, gim.i iVar) {
        skm.p0 p0Var = skm.p0.f264001a;
        return skm.e0.J(elm.f.f127540b, new a31.w(5, claim, this, googleEvidence, str2, str, (Continuation) null), iVar);
    }

    public final Object f(String str, String str2, gkl.m mVar, Claim claim, Set set, gim.i iVar) {
        skm.p0 p0Var = skm.p0.f264001a;
        return skm.e0.J(elm.f.f127540b, new a41.j1(claim, this, mVar, str, str2, set, (Continuation) null), iVar);
    }
}
