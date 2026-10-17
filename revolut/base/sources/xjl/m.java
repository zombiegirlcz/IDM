package xjl;

import bjl.q0;
import kotlin.jvm.internal.Intrinsics;
import okl.n1;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f306572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f306573b;

    public m(n1 authenticationInteractor, i revolutSsoFlowConfigurationInteractor) {
        Intrinsics.checkNotNullParameter(authenticationInteractor, "authenticationInteractor");
        Intrinsics.checkNotNullParameter(revolutSsoFlowConfigurationInteractor, "revolutSsoFlowConfigurationInteractor");
        this.f306572a = authenticationInteractor;
        this.f306573b = revolutSsoFlowConfigurationInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(cjl.g r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof xjl.k
            if (r0 == 0) goto L13
            r0 = r6
            xjl.k r0 = (xjl.k) r0
            int r1 = r0.f306569w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f306569w = r1
            goto L18
        L13:
            xjl.k r0 = new xjl.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f306569w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            xjl.l r6 = new xjl.l
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.f306569w = r3
            xjl.i r5 = r4.f306573b
            java.lang.String r2 = r5.b()
            java.lang.String r5 = r5.a(r2)
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            gkl.h0 r6 = (gkl.h0) r6
            boolean r5 = r6 instanceof gkl.e0
            if (r5 == 0) goto L5f
            gkl.e0 r6 = (gkl.e0) r6
            com.revolut.sso.impl.domain.models.Challenge r5 = r6.f144443a
            java.lang.String r5 = r5.f106100c
            if (r5 == 0) goto L7a
            cjl.d r6 = new cjl.d
            r6.<init>(r5)
            return r6
        L5f:
            gkl.d0 r5 = gkl.d0.f144440a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r6, r5)
            if (r5 != 0) goto L7a
            boolean r5 = r6 instanceof gkl.f0
            if (r5 != 0) goto L7a
            gkl.g0 r5 = gkl.g0.f144451a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r6, r5)
            if (r5 == 0) goto L74
            goto L7a
        L74:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L7a:
            cjl.c$a r5 = cjl.c.a.f24708a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xjl.m.a(cjl.g, gim.c):java.lang.Object");
    }
}
