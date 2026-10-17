package okl;

import com.revolut.sso.api.models.Evidence;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Evidence f226204c;

    public /* synthetic */ k(com.revolut.sso.impl.ui.auth.n nVar, Evidence evidence, int i) {
        this.f226202a = i;
        this.f226203b = nVar;
        this.f226204c = evidence;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() {
        /*
            r6 = this;
            int r0 = r6.f226202a
            switch(r0) {
                case 0: goto L3a;
                default: goto L5;
            }
        L5:
            com.revolut.sso.impl.ui.auth.n r0 = r6.f226203b
            qki.d r1 = r0.m0
            java.lang.Object r1 = r1.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State r1 = (com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State) r1
            java.util.List r1 = r1.getI()
            java.lang.Object r1 = zhm.d0.o0(r1)
            com.revolut.sso.api.models.Evidence r2 = r6.f226204c
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            if (r1 != 0) goto L26
            r0.N2(r2)
        L26:
            oh4.i r1 = new oh4.i
            r3 = 11
            r4 = 0
            r1.<init>(r0, r2, r4, r3)
            yi5.b r2 = new yi5.b
            r3 = 26
            r2.<init>(r3)
            skm.a2 r0 = r0.l2(r1, r2)
            return r0
        L3a:
            com.revolut.sso.impl.ui.auth.n r0 = r6.f226203b
            com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData r1 = r0.F
            boolean r2 = r1 instanceof com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData.OperationBoundAuthentication
            if (r2 == 0) goto L53
            com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData$OperationBoundAuthentication r1 = (com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData.OperationBoundAuthentication) r1
            com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData$OperationBoundAuthentication$Origin r1 = r1.f106228g
            boolean r2 = r1 instanceof com.revolut.sso.impl.ui.auth.AuthenticationFlowContract.InputData.OperationBoundAuthentication.Origin.OneTimeFaceSignIn
            if (r2 == 0) goto L53
            com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData$OperationBoundAuthentication$Origin$OneTimeFaceSignIn r1 = (com.revolut.sso.impl.ui.auth.AuthenticationFlowContract.InputData.OperationBoundAuthentication.Origin.OneTimeFaceSignIn) r1
            long r1 = r1.f106231a
            long r1 = kotlin.time.b.f(r1)
            goto L55
        L53:
            r1 = 3000(0xbb8, double:1.482E-320)
        L55:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            vkm.v1 r1 = ta6.a.I(r1, r3)
            o95.c r2 = new o95.c
            r3 = 29
            com.revolut.sso.api.models.Evidence r4 = r6.f226204c
            r5 = 0
            r2.<init>(r0, r4, r5, r3)
            r3 = 3
            skm.a2 r0 = yji.l.b1(r0, r1, r5, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okl.k.invoke():java.lang.Object");
    }
}
