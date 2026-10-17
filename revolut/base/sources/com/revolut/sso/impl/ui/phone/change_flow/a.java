package com.revolut.sso.impl.ui.phone.change_flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
    
        if (r4.m(r5, r6, r7, r8, r9, r10, r12) == r0) goto L23;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r12.u
            r2 = 2
            r3 = 1
            com.revolut.sso.impl.ui.phone.change_flow.b r5 = r12.v
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            yhm.o.b(r13)
            goto L8f
        L13:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1b:
            yhm.o.b(r13)
            goto L2d
        L1f:
            yhm.o.b(r13)
            rqk.m r13 = r5.f106659w
            r12.u = r3
            java.lang.Object r13 = r13.a(r3, r12)
            if (r13 != r0) goto L2d
            goto L8e
        L2d:
            com.revolut.sso.api.models.UserInfoFromApp r13 = (com.revolut.sso.api.models.UserInfoFromApp) r13
            java.lang.String r1 = r13.f105998c
            r3 = 0
            if (r1 == 0) goto L3a
            java.lang.String r4 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            goto L3b
        L3a:
            r1 = r3
        L3b:
            java.lang.String r13 = r13.f105997b
            if (r13 != 0) goto L5b
            com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState r13 = new com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState
            java.lang.String r0 = "Client app cannot provide required id. Please, check if setup and integration are correct"
            r13.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r3, r3, r13, r0)
            nol.e r13 = new nol.e
            r0 = 4
            r13.<init>(r5, r0)
            r5.O2(r13)
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        L5b:
            qki.d r3 = r5.f106660x
            avj.o r4 = new avj.o
            r6 = 23
            r4.<init>(r13, r1, r6)
            r5.H2(r3, r4)
            wll.e r4 = r5.o
            com.revolut.sso.impl.ui.phone.change_flow.ChangePhoneFlowContract$InputData r3 = r5.f106655q
            java.lang.String r6 = r3.f106641b
            gkl.m r7 = gkl.m.PHONE
            com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId r3 = new com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId
            r3.<init>(r13)
            java.util.Set r8 = zhm.y0.b(r3)
            nol.c r9 = new nol.c
            r13 = 3
            r9.<init>(r5, r13)
            ni1.a r10 = new ni1.a
            r13 = 19
            r10.<init>(r5, r1, r13)
            r12.u = r2
            r11 = r12
            java.lang.Object r13 = r4.m(r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L8f
        L8e:
            return r0
        L8f:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.phone.change_flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
