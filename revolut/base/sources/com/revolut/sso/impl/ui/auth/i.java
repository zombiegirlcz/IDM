package com.revolut.sso.impl.ui.auth;

import com.revolut.sso.impl.domain.models.AuthResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AuthResult.PermissionRequired f106365w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, AuthResult.PermissionRequired permissionRequired, Continuation continuation) {
        super(1, continuation);
        this.v = nVar;
        this.f106365w = permissionRequired;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.v, this.f106365w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r8 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.u
            r2 = 0
            r3 = 2
            com.revolut.sso.impl.ui.auth.n r4 = r7.v
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L20
            if (r1 == r5) goto L1c
            if (r1 != r3) goto L14
            yhm.o.b(r8)
            goto L50
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            yhm.o.b(r8)
            goto L2e
        L20:
            yhm.o.b(r8)
            rqk.m r8 = r4.f106371e0
            r7.u = r5
            java.lang.Object r8 = r8.a(r2, r7)
            if (r8 != r0) goto L2e
            goto L4f
        L2e:
            com.revolut.sso.api.models.UserInfoFromApp r8 = (com.revolut.sso.api.models.UserInfoFromApp) r8
            java.lang.String r8 = r8.f105997b
            if (r8 == 0) goto L53
            akl.o0 r1 = r4.f0
            akl.e1 r1 = (akl.e1) r1
            akg.n r8 = r1.e(r8, r2)
            ob2.a r1 = new ob2.a
            r2 = 29
            r1.<init>(r2)
            jhi.b r8 = mo3.a.g(r8, r6, r1, r5)
            r7.u = r3
            java.lang.Object r8 = vkm.q.x(r8, r7)
            if (r8 != r0) goto L50
        L4f:
            return r0
        L50:
            com.revolut.sso.impl.domain.models.UserInfoAccount r8 = (com.revolut.sso.impl.domain.models.UserInfoAccount) r8
            goto L54
        L53:
            r8 = r6
        L54:
            if (r8 != 0) goto L6c
            r4.y3()
            com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState r8 = new com.revolut.sso.api.exceptions.RevolutSSOException$IllegalState
            java.lang.String r0 = "User info is null: failed to fetch account details"
            r8.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r6, r6, r8, r0)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L6c:
            com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step$MerchantPermissions r0 = new com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step$MerchantPermissions
            com.revolut.sso.impl.domain.models.AuthResult$PermissionRequired r1 = r7.f106365w
            com.revolut.sso.impl.domain.models.ChallengeClient r2 = r1.f106084a
            java.util.ArrayList r3 = r1.f106085b
            java.util.Set r1 = r1.f106086c
            r0.<init>(r8, r2, r3, r1)
            com.revolut.sso.impl.ui.auth.n.j3(r4, r0)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.auth.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
