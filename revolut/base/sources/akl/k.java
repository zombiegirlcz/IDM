package akl;

import com.revolut.sso.impl.domain.models.SessionToken;
import com.revolut.sso.impl.network.services.AuthenticationService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AuthenticationService f6042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f6043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lkl.b f6044c;

    public k(AuthenticationService service, f1 sessionTokenRepository, lkl.b ssoServerErrorParser) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(sessionTokenRepository, "sessionTokenRepository");
        Intrinsics.checkNotNullParameter(ssoServerErrorParser, "ssoServerErrorParser");
        this.f6042a = service;
        this.f6043b = sessionTokenRepository;
        this.f6044c = ssoServerErrorParser;
    }

    public static final mkl.b a(k kVar) {
        String str;
        SessionToken sessionTokenG = ((n1) kVar.f6043b).g();
        if (sessionTokenG == null || (str = sessionTokenG.f106160a) == null) {
            return null;
        }
        return new mkl.b(str);
    }

    public static Object b(k kVar, cjl.s sVar, String str, String str2, jkl.i iVar, gim.i iVar2) {
        kVar.getClass();
        j jVar = new j(null, kVar, str, sVar, iVar, null, str2, null, null, null, null, null);
        skm.p0 p0Var = skm.p0.f264001a;
        return skm.e0.J(elm.f.f127540b, jVar, iVar2);
    }
}
