package com.revolut.retail.feature.impl.userauth.screen.revolut_sso;

import bjl.m;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f101707w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f101708x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ RetailRevolutSsoFlowContract$Step f101709y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m mVar, c cVar, Ref$ObjectRef ref$ObjectRef, RetailRevolutSsoFlowContract$Step retailRevolutSsoFlowContract$Step, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
        this.f101707w = cVar;
        this.f101708x = ref$ObjectRef;
        this.f101709y = retailRevolutSsoFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f101707w, this.f101708x, this.f101709y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c.K2(r4, r1, (java.lang.String) r11, r10) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c.J2(r4, r5, r6, r7, r8, r10) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        return r0;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L15:
            yhm.o.b(r11)
            goto L8b
        L1a:
            yhm.o.b(r11)
            bjl.m r11 = r10.v
            boolean r1 = r11 instanceof bjl.l
            com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c r4 = r10.f101707w
            java.lang.String r5 = "codeVerifier"
            kotlin.jvm.internal.Ref$ObjectRef r6 = r10.f101708x
            r7 = 0
            if (r1 == 0) goto L5b
            r1 = r11
            bjl.l r1 = (bjl.l) r1
            bjl.n0 r1 = r1.f16177a
            boolean r2 = r1 instanceof bjl.n0
            if (r2 != 0) goto L48
            gom.c r0 = gom.e.f145194a
            java.lang.Class r11 = r11.getClass()
            java.lang.String r1 = "Expected SignUpOutputData Authenticated but got "
            java.lang.String r11 = a0.d.l(r11, r1)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.e(r11, r1)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L48:
            java.lang.Object r11 = r6.f186409a
            if (r11 == 0) goto L57
            java.lang.String r11 = (java.lang.String) r11
            r10.u = r3
            java.lang.Object r11 = com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c.K2(r4, r1, r11, r10)
            if (r11 != r0) goto L8b
            goto L8a
        L57:
            kotlin.jvm.internal.Intrinsics.r(r5)
            throw r7
        L5b:
            boolean r1 = r11 instanceof bjl.k
            if (r1 == 0) goto L92
            java.lang.Object r1 = r6.f186409a
            if (r1 == 0) goto L8e
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            bjl.k r11 = (bjl.k) r11
            bjl.d0 r6 = r11.f16174a
            bjl.j r11 = r11.f16175b
            if (r11 == 0) goto L79
            com.revolut.sso.api.login.RevolutSsoApi$SignUpOutputData$Authenticated$Method$Phone r7 = new com.revolut.sso.api.login.RevolutSsoApi$SignUpOutputData$Authenticated$Method$Phone
            java.lang.String r1 = r11.f16170a
            int r8 = r11.f16171b
            wi0.b r11 = r11.f16172c
            r7.<init>(r8, r1, r11)
        L79:
            com.revolut.retail.feature.impl.userauth.screen.revolut_sso.RetailRevolutSsoFlowContract$Step r11 = r10.f101709y
            com.revolut.retail.feature.impl.userauth.screen.revolut_sso.RetailRevolutSsoFlowContract$Step$CombinedAuthentication r11 = (com.revolut.retail.feature.impl.userauth.screen.revolut_sso.RetailRevolutSsoFlowContract$Step.CombinedAuthentication) r11
            boolean r11 = r11.d
            r8 = r11 ^ 1
            r10.u = r2
            r9 = r10
            java.lang.Object r11 = com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c.J2(r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L8b
        L8a:
            return r0
        L8b:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L8e:
            kotlin.jvm.internal.Intrinsics.r(r5)
            throw r7
        L92:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.impl.userauth.screen.revolut_sso.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
