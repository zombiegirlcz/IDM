package akl;

import com.revolut.sso.api.models.UserInfo;
import com.revolut.sso.impl.domain.models.RevolutAccountImpl;
import com.revolut.sso.impl.domain.models.SessionToken;
import com.revolut.sso.impl.network.services.AuthenticationService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.a2;

/* JADX INFO: loaded from: classes12.dex */
public final class n1 implements f1 {

    @NotNull
    public static final g1 Companion = new g1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kg.o f6059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f6060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AuthenticationService f6061c;
    public final o0 d;
    public final uil.a e;
    public final rqk.m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bjl.p0 f6062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ne0.j f6063h;
    public final skm.a0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile SessionToken f6064j;
    public a2 k;

    public n1(kg.o gson, CoroutineScope ssoScope, AuthenticationService authenticationService, o0 revolutAccountUserInfoRepository, uil.a revolutAccountsManager, rqk.m userInfoFromAppProvider, bjl.p0 revolutSsoDependenciesProvider, ne0.j cache, skm.a0 ssoScopeExceptionHandler) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(ssoScope, "ssoScope");
        Intrinsics.checkNotNullParameter(authenticationService, "authenticationService");
        Intrinsics.checkNotNullParameter(revolutAccountUserInfoRepository, "revolutAccountUserInfoRepository");
        Intrinsics.checkNotNullParameter(revolutAccountsManager, "revolutAccountsManager");
        Intrinsics.checkNotNullParameter(userInfoFromAppProvider, "userInfoFromAppProvider");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(ssoScopeExceptionHandler, "ssoScopeExceptionHandler");
        this.f6059a = gson;
        this.f6060b = ssoScope;
        this.f6061c = authenticationService;
        this.d = revolutAccountUserInfoRepository;
        this.e = revolutAccountsManager;
        this.f = userInfoFromAppProvider;
        this.f6062g = revolutSsoDependenciesProvider;
        this.f6063h = cache;
        this.i = ssoScopeExceptionHandler;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0108, code lost:
    
        if (r1 == r3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01bb, code lost:
    
        if (r9 != r3) goto L51;
     */
    /* JADX WARN: Path cross not found for [B:39:0x015d, B:42:0x0166], limit reached: 101 */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01bb -> B:51:0x01bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01e7 -> B:62:0x01ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01e9 -> B:62:0x01ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x025f -> B:78:0x0267). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r21, com.revolut.sso.api.models.UserInfoFromApp r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: akl.n1.a(java.lang.String, com.revolut.sso.api.models.UserInfoFromApp, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof akl.i1
            if (r0 == 0) goto L13
            r0 = r8
            akl.i1 r0 = (akl.i1) r0
            int r1 = r0.f6036y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6036y = r1
            goto L18
        L13:
            akl.i1 r0 = new akl.i1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f6034w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f6036y
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r8)
            goto L7d
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            boolean r10 = r0.u
            java.lang.String r9 = r0.v
            yhm.o.b(r8)
            goto L6c
        L3e:
            yhm.o.b(r8)
            goto L5c
        L42:
            yhm.o.b(r8)
            if (r9 != 0) goto L4d
            bjl.p0 r8 = r7.f6062g
            rqk.k r8 = (rqk.k) r8
            java.lang.String r9 = r8.f256593p
        L4d:
            if (r10 == 0) goto L5f
            r0.v = r6
            r0.u = r10
            r0.f6036y = r5
            java.lang.Object r8 = r7.f(r9, r0)
            if (r8 != r1) goto L5c
            goto L7c
        L5c:
            com.revolut.sso.impl.domain.models.SessionToken r8 = (com.revolut.sso.impl.domain.models.SessionToken) r8
            goto L7f
        L5f:
            r0.v = r9
            r0.u = r10
            r0.f6036y = r4
            java.lang.Object r8 = r7.e(r9, r0)
            if (r8 != r1) goto L6c
            goto L7c
        L6c:
            com.revolut.sso.impl.domain.models.SessionToken r8 = (com.revolut.sso.impl.domain.models.SessionToken) r8
            if (r8 != 0) goto L7f
            r0.v = r6
            r0.u = r10
            r0.f6036y = r3
            java.lang.Object r8 = r7.f(r9, r0)
            if (r8 != r1) goto L7d
        L7c:
            return r1
        L7d:
            com.revolut.sso.impl.domain.models.SessionToken r8 = (com.revolut.sso.impl.domain.models.SessionToken) r8
        L7f:
            r7.f6064j = r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: akl.n1.b(gim.c, java.lang.String, boolean):java.lang.Object");
    }

    public final SessionToken c() {
        return this.f6064j;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.sso.api.accounts.RevolutAccount r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof akl.k1
            if (r0 == 0) goto L13
            r0 = r6
            akl.k1 r0 = (akl.k1) r0
            int r1 = r0.f6045w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6045w = r1
            goto L18
        L13:
            akl.k1 r0 = new akl.k1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f6045w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f6045w = r3
            uil.a r6 = r4.e
            pjl.z0 r6 = (pjl.z0) r6
            java.lang.String r2 = "com.revolut.sso.session"
            java.io.Serializable r6 = r6.k(r5, r0, r2)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L4b
            com.revolut.sso.impl.domain.models.SessionToken r5 = new com.revolut.sso.impl.domain.models.SessionToken
            r5.<init>(r6)
            return r5
        L4b:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: akl.n1.d(com.revolut.sso.api.accounts.RevolutAccount, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r8, gim.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof akl.j1
            if (r0 == 0) goto L13
            r0 = r9
            akl.j1 r0 = (akl.j1) r0
            int r1 = r0.f6041x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6041x = r1
            goto L18
        L13:
            akl.j1 r0 = new akl.j1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f6041x
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r9)
            return r9
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            yhm.o.b(r9)
            goto L80
        L3a:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L40 java.util.concurrent.CancellationException -> L42
            goto L57
        L40:
            r9 = move-exception
            goto L5c
        L42:
            r8 = move-exception
            goto L91
        L44:
            yhm.o.b(r9)
            yhm.m$a r9 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L40 java.util.concurrent.CancellationException -> L42
            rqk.m r9 = r7.f     // Catch: java.lang.Throwable -> L40 java.util.concurrent.CancellationException -> L42
            r0.u = r8     // Catch: java.lang.Throwable -> L40 java.util.concurrent.CancellationException -> L42
            r0.f6041x = r5     // Catch: java.lang.Throwable -> L40 java.util.concurrent.CancellationException -> L42
            r2 = 0
            java.lang.Object r9 = r9.a(r2, r0)     // Catch: java.lang.Throwable -> L40 java.util.concurrent.CancellationException -> L42
            if (r9 != r1) goto L57
            goto L8f
        L57:
            com.revolut.sso.api.models.UserInfoFromApp r9 = (com.revolut.sso.api.models.UserInfoFromApp) r9     // Catch: java.lang.Throwable -> L40 java.util.concurrent.CancellationException -> L42
            yhm.m$a r2 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L40 java.util.concurrent.CancellationException -> L42
            goto L62
        L5c:
            yhm.m$a r2 = yhm.m.INSTANCE
            yhm.n r9 = yhm.o.a(r9)
        L62:
            java.lang.Throwable r2 = yhm.m.a(r9)
            if (r2 == 0) goto L6b
            hx7.e.n(r2)
        L6b:
            boolean r2 = r9 instanceof yhm.n
            if (r2 == 0) goto L70
            r9 = r6
        L70:
            com.revolut.sso.api.models.UserInfoFromApp r9 = (com.revolut.sso.api.models.UserInfoFromApp) r9
            if (r9 != 0) goto L75
            goto L84
        L75:
            r0.u = r6
            r0.f6041x = r4
            java.lang.Object r9 = r7.a(r8, r9, r0)
            if (r9 != r1) goto L80
            goto L8f
        L80:
            com.revolut.sso.api.accounts.RevolutAccount r9 = (com.revolut.sso.api.accounts.RevolutAccount) r9
            if (r9 != 0) goto L85
        L84:
            return r6
        L85:
            r0.u = r6
            r0.f6041x = r3
            java.lang.Object r8 = r7.d(r9, r0)
            if (r8 != r1) goto L90
        L8f:
            return r1
        L90:
            return r8
        L91:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: akl.n1.e(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r11, gim.c r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof akl.l1
            if (r0 == 0) goto L14
            r0 = r12
            akl.l1 r0 = (akl.l1) r0
            int r1 = r0.f6048x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f6048x = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            akl.l1 r0 = new akl.l1
            r0.<init>(r10, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r12.f6048x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r0)
            return r0
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            java.lang.String r11 = r12.u
            yhm.o.b(r0)     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L3c
            goto L53
        L3a:
            r0 = move-exception
            goto L59
        L3c:
            r0 = move-exception
            r11 = r0
            goto L8d
        L3f:
            yhm.o.b(r0)
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L3c
            bjl.p0 r0 = r10.f6062g     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L3c
            r12.u = r11     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L3c
            r12.f6048x = r4     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L3c
            rqk.k r0 = (rqk.k) r0     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L3c
            java.lang.Object r0 = r0.d(r12)     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L3c
            if (r0 != r1) goto L53
            goto L8b
        L53:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L3c
            yhm.m$a r2 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L3a java.util.concurrent.CancellationException -> L3c
        L57:
            r6 = r11
            goto L60
        L59:
            yhm.m$a r2 = yhm.m.INSTANCE
            yhm.n r0 = yhm.o.a(r0)
            goto L57
        L60:
            java.lang.Throwable r11 = yhm.m.a(r0)
            if (r11 == 0) goto L69
            hx7.e.n(r11)
        L69:
            boolean r11 = r0 instanceof yhm.n
            r8 = 0
            if (r11 == 0) goto L6f
            r0 = r8
        L6f:
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L75
            return r8
        L75:
            r12.u = r8
            r12.f6048x = r3
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            a1a.b r4 = new a1a.b
            r9 = 29
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r11 = skm.e0.J(r11, r4, r12)
            if (r11 != r1) goto L8c
        L8b:
            return r1
        L8c:
            return r11
        L8d:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: akl.n1.f(java.lang.String, gim.c):java.lang.Object");
    }

    public final SessionToken g() {
        return (SessionToken) this.f6063h.get("KEY_TEMPORARY_SESSION_TOKEN");
    }

    public final Object h(UserInfo userInfo, SessionToken sessionToken, gim.c cVar) throws Throwable {
        RevolutAccountImpl.Companion companion = RevolutAccountImpl.INSTANCE;
        String str = sessionToken.f106160a;
        SessionToken sessionToken2 = new SessionToken(str);
        companion.getClass();
        RevolutAccountImpl revolutAccountImplA = RevolutAccountImpl.Companion.a(sessionToken2, userInfo);
        pjl.z0 z0Var = (pjl.z0) this.e;
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, new pjl.u0(z0Var, revolutAccountImplA, str, null), cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public final void i(SessionToken sessionToken) {
        ne0.j jVar = this.f6063h;
        if (sessionToken == null) {
            jVar.remove("KEY_TEMPORARY_SESSION_TOKEN");
        } else {
            jVar.f("KEY_TEMPORARY_SESSION_TOKEN", sessionToken);
        }
    }
}
