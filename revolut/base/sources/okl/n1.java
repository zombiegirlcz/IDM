package okl;

import com.revolut.sso.impl.domain.models.AuthAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes12.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final akl.d f226220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final akl.k f226221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final akl.i0 f226222c;
    public final bjl.p0 d;
    public final z1 e;

    public n1(akl.d authenticationRepository, akl.k challengesRepository, akl.i0 pendingAuthenticationRepository, bjl.p0 revolutSsoDependenciesProvider) {
        Intrinsics.checkNotNullParameter(authenticationRepository, "authenticationRepository");
        Intrinsics.checkNotNullParameter(challengesRepository, "challengesRepository");
        Intrinsics.checkNotNullParameter(pendingAuthenticationRepository, "pendingAuthenticationRepository");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        this.f226220a = authenticationRepository;
        this.f226221b = challengesRepository;
        this.f226222c = pendingAuthenticationRepository;
        this.d = revolutSsoDependenciesProvider;
        this.e = ta6.a.a(0);
    }

    public static Object c(n1 n1Var, AuthAction authAction, jkl.i iVar, gim.i iVar2) {
        akl.h hVar = (akl.h) n1Var.f226220a;
        hVar.getClass();
        skm.p0 p0Var = skm.p0.f264001a;
        return skm.e0.J(elm.f.f127540b, new a31.w(4, hVar, authAction, iVar, (Object) null, (Continuation) null), iVar2);
    }

    public final Object a(AuthAction authAction, jkl.i iVar, String str, boolean z, xkl.e eVar) throws Throwable {
        cjl.s sVarG = yjl.a.g(authAction);
        String strE = yjl.a.e(authAction, this.d);
        Boolean boolH = yjl.a.h(authAction);
        String strB = yjl.a.b(authAction);
        akl.k kVar = this.f226221b;
        kVar.getClass();
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, new akl.i(z, kVar, sVarG, iVar, str, strE, boolH, strB, (Continuation) null), eVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
    
        if (r9.emit(r14, r2) == r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d9, code lost:
    
        if (r9.emit(r11, r2) == r3) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.sso.impl.domain.models.AuthAction r21, jkl.i r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okl.n1.b(com.revolut.sso.impl.domain.models.AuthAction, jkl.i, gim.c):java.lang.Object");
    }
}
