package com.revolut.sso.impl.ui.auth;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        if (com.revolut.sso.impl.ui.auth.n.Q2(r5, null, null, null, r11, 7) == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r11.u
            r2 = 3
            r3 = 2
            r4 = 1
            com.revolut.sso.impl.ui.auth.n r5 = r11.v
            if (r1 == 0) goto L26
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            yhm.o.b(r12)
            goto Lb1
        L16:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1e:
            yhm.o.b(r12)
            goto L44
        L22:
            yhm.o.b(r12)
            goto L33
        L26:
            yhm.o.b(r12)
            r11.u = r4
            java.lang.Object r12 = com.revolut.sso.impl.ui.auth.n.J2(r5, r11)
            if (r12 != r0) goto L33
            goto Lb0
        L33:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L4b
            bjl.p0 r1 = r5.S
            r11.u = r3
            rqk.k r1 = (rqk.k) r1
            java.lang.Object r12 = r1.f(r12, r11)
            if (r12 != r0) goto L44
            goto Lb0
        L44:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            goto L4c
        L4b:
            r12 = 0
        L4c:
            qki.d r1 = r5.m0
            java.lang.Object r3 = r1.f22677a
            vkm.j2 r3 = (vkm.j2) r3
            java.lang.Object r3 = r3.getValue()
            boolean r3 = r3 instanceof com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State.ExternalClientAuthentication
            if (r3 != 0) goto L9a
            yki.i r12 = r5.l0
            com.revolut.kompot.navigable.flow.FlowStep r12 = r12.d()
            com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step r12 = (com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step) r12
            if (r12 == 0) goto L6d
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getSimpleName()
            goto L6e
        L6d:
            r12 = 0
        L6e:
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.f186429a
            java.lang.Class<com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State$ExternalClientAuthentication> r2 = com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State.ExternalClientAuthentication.class
            kotlin.reflect.KClass r2 = r0.b(r2)
            java.lang.String r2 = r2.m()
            java.lang.Object r1 = r1.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.String r0 = okl.m.p(r1, r0)
            java.lang.String r1 = ",\n                Expected: "
            java.lang.String r3 = "\n                Actual: "
            java.lang.String r4 = "Authentication flow has unexpected state.\n                Current step: "
            java.lang.StringBuilder r12 = v0.a.m(r4, r12, r1, r2, r3)
            java.lang.String r12 = m72.b.q(r0, r12)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r12 = r12.toString()
            r0.<init>(r12)
            throw r0
        L9a:
            okl.j1 r3 = new okl.j1
            r4 = 0
            r3.<init>(r5, r12, r4)
            r5.H2(r1, r3)
            r11.u = r2
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 7
            r9 = r11
            java.lang.Object r12 = com.revolut.sso.impl.ui.auth.n.Q2(r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto Lb1
        Lb0:
            return r0
        Lb1:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.auth.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
