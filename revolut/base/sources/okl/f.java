package okl;

import com.revolut.sso.impl.domain.models.AuthResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AuthResult.Success f226175c;

    public /* synthetic */ f(int i, AuthResult.Success success, com.revolut.sso.impl.ui.auth.n nVar) {
        this.f226173a = i;
        this.f226174b = nVar;
        this.f226175c = success;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() {
        /*
            r10 = this;
            int r0 = r10.f226173a
            com.revolut.sso.impl.domain.models.AuthResult$Success r1 = r10.f226175c
            com.revolut.sso.impl.ui.auth.n r2 = r10.f226174b
            switch(r0) {
                case 0: goto L72;
                case 1: goto L22;
                default: goto L9;
            }
        L9:
            bjl.w r0 = new bjl.w
            java.lang.String r3 = r1.f106091b
            java.lang.String r1 = r1.e
            if (r1 == 0) goto L1a
            r0.<init>(r3, r1)
            r2.k3(r0)
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        L1a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            r0.<init>(r1)
            throw r0
        L22:
            java.util.ArrayList r0 = r1.f106092c
            okl.f r3 = new okl.f
            r4 = 2
            r3.<init>(r4, r1, r2)
            gkl.m r1 = gkl.m.BIO_PUBLIC_KEY
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L36
            r3.invoke()
            goto L6f
        L36:
            xkl.i r5 = r2.f106378t
            qki.d r0 = r2.m0
            java.lang.Object r0 = r0.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State r0 = (com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State) r0
            bjl.p0 r1 = r2.S
            java.lang.String r6 = com.revolut.sso.impl.ui.auth.o.a(r0, r1)
            oa2.b r7 = new oa2.b
            r0 = 20
            r7.<init>(r2, r3, r0)
            r5.getClass()
            java.lang.String r0 = "clientId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "onComplete"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            xge.f r4 = new xge.f
            r9 = 4
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            yi5.b r0 = new yi5.b
            r1 = 27
            r0.<init>(r1)
            r5.T2(r4, r0)
        L6f:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        L72:
            java.util.ArrayList r0 = r1.f106092c
            gkl.m r3 = gkl.m.WEBAUTHN
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L9d
            com.revolut.sso.api.models.UserInfo r0 = r1.d
            if (r0 == 0) goto L9d
            java.lang.String r0 = r0.d
            if (r0 == 0) goto L9d
            col.c r0 = r2.M
            gkl.w r3 = new gkl.w
            r4 = 1
            r3.<init>(r4)
            col.i r0 = (col.i) r0
            boolean r0 = r0.b3(r3)
            if (r0 == 0) goto L9d
            com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step$EnablePasskeyPrompt r0 = new com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step$EnablePasskeyPrompt
            r0.<init>(r1)
            com.revolut.sso.impl.ui.auth.n.j3(r2, r0)
            goto La7
        L9d:
            com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step$PostAuthentication r0 = new com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step$PostAuthentication
            r0.<init>(r1)
            com.revolut.sso.impl.ui.auth.n.j3(r2, r0)
            kotlin.Unit r0 = kotlin.Unit.f186387a
        La7:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okl.f.invoke():java.lang.Object");
    }
}
