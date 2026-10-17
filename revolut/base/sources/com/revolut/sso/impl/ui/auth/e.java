package com.revolut.sso.impl.ui.auth;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jkl.i f106361w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n nVar, jkl.i iVar, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
        this.f106361w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, this.f106361w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b1, code lost:
    
        if (com.revolut.sso.impl.ui.auth.n.Q2(r4, r5, null, null, r10, 6) == r0) goto L25;
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
            com.revolut.sso.impl.ui.auth.n r4 = r10.v
            r5 = 0
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            yhm.o.b(r11)
            goto Lb4
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            yhm.o.b(r11)
            goto L32
        L20:
            yhm.o.b(r11)
            okl.q0 r11 = new okl.q0
            r11.<init>(r4, r5)
            r10.u = r3
            java.lang.Object r11 = r4.p2(r10, r11)
            if (r11 != r0) goto L32
            goto Lb3
        L32:
            java.util.UUID r11 = (java.util.UUID) r11
            if (r11 != 0) goto L3c
            r11 = 0
            r4.u3(r11)
            goto Lb4
        L3c:
            java.lang.String r11 = r11.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
            java.lang.String r1 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            qki.d r1 = r4.m0
            java.lang.Object r3 = r1.f22677a
            vkm.j2 r3 = (vkm.j2) r3
            java.lang.Object r3 = r3.getValue()
            boolean r3 = r3 instanceof com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State.SignIn
            if (r3 != 0) goto L96
            yki.i r11 = r4.l0
            com.revolut.kompot.navigable.flow.FlowStep r11 = r11.d()
            com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step r11 = (com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step) r11
            if (r11 == 0) goto L6a
            java.lang.Class r11 = r11.getClass()
            java.lang.String r5 = r11.getSimpleName()
        L6a:
            kotlin.jvm.internal.p0 r11 = kotlin.jvm.internal.o0.f186429a
            java.lang.Class<com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State$SignIn> r0 = com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State.SignIn.class
            kotlin.reflect.KClass r0 = r11.b(r0)
            java.lang.String r0 = r0.m()
            java.lang.Object r1 = r1.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.String r11 = okl.m.p(r1, r11)
            java.lang.String r1 = ",\n                Expected: "
            java.lang.String r2 = "\n                Actual: "
            java.lang.String r3 = "Authentication flow has unexpected state.\n                Current step: "
            java.lang.StringBuilder r0 = v0.a.m(r3, r5, r1, r0, r2)
            java.lang.String r11 = m72.b.q(r11, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r11 = r11.toString()
            r0.<init>(r11)
            throw r0
        L96:
            a9j.n r3 = new a9j.n
            r5 = 14
            jkl.i r6 = r10.f106361w
            r3.<init>(r4, r5, r11, r6)
            r4.H2(r1, r3)
            com.revolut.sso.impl.domain.models.Claim$IdentityId r5 = new com.revolut.sso.impl.domain.models.Claim$IdentityId
            r5.<init>(r11)
            r10.u = r2
            r6 = 0
            r7 = 0
            r9 = 6
            r8 = r10
            java.lang.Object r11 = com.revolut.sso.impl.ui.auth.n.Q2(r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto Lb4
        Lb3:
            return r0
        Lb4:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.auth.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
