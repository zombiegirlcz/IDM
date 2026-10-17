package vmi;

import aim.e;
import com.revolut.oauth.api.consent.OAuthAuthorizeParams;
import com.revolut.oauth.impl.network.service.OAuthService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import rqk.k;
import th6.p;
import uyd.e0;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OAuthService f290599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f290600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f290601c;
    public final x4l.c d;

    public d(OAuthService service, j memoryCache, k ssoDependenciesProvider) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(ssoDependenciesProvider, "ssoDependenciesProvider");
        this.f290599a = service;
        this.f290600b = memoryCache;
        this.f290601c = ssoDependenciesProvider;
        Continuation continuation = null;
        this.d = new x4l.c(new p(this, continuation, 21), new vh2.j(this, 19), new vh9.b(this, 9), new rp1.c(2, 18, continuation), new e0(3, 2, continuation));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(vmi.d r11, com.revolut.oauth.api.consent.OAuthAuthorizeParams r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vmi.d.a(vmi.d, com.revolut.oauth.api.consent.OAuthAuthorizeParams, gim.c):java.lang.Object");
    }

    public static String c(OAuthAuthorizeParams oAuthAuthorizeParams) {
        e eVarB = u.b();
        eVarB.add("oauth_consent_info");
        eVarB.add(oAuthAuthorizeParams.f98485b);
        String str = oAuthAuthorizeParams.d;
        if (str == null) {
            str = "";
        }
        eVarB.add(str);
        eVarB.add(oAuthAuthorizeParams.f98486c);
        eVarB.add(oAuthAuthorizeParams.f);
        return d0.k0(u.a(eVarB), "_", null, null, 0, null, 62);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ymi.b r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof vmi.b
            if (r0 == 0) goto L13
            r0 = r7
            vmi.b r0 = (vmi.b) r0
            int r1 = r0.f290597w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f290597w = r1
            goto L18
        L13:
            vmi.b r0 = new vmi.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f290597w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            vge.r r7 = new vge.r
            r2 = 27
            r4 = 0
            r7.<init>(r5, r6, r4, r2)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            r0.f290597w = r3
            java.lang.Object r7 = skm.e0.J(r6, r7, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            ymi.e r7 = (ymi.e) r7
            java.lang.String r6 = r7.f315011a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vmi.d.b(ymi.b, gim.c):java.lang.Object");
    }
}
