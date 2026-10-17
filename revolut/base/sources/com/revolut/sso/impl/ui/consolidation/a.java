package com.revolut.sso.impl.ui.consolidation;

import com.revolut.sso.api.models.RevolutAccountSession;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends i implements Function2 {
    public RevolutAccountSession u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f106483w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f106484x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.f106484x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.f106484x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r12.f106483w
            r2 = 2
            r3 = 1
            r4 = 0
            com.revolut.sso.impl.ui.consolidation.b r5 = r12.f106484x
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.String r0 = r12.v
            com.revolut.sso.api.models.RevolutAccountSession r1 = r12.u
            yhm.o.b(r13)
            goto L60
        L17:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1f:
            yhm.o.b(r13)
            goto L36
        L23:
            yhm.o.b(r13)
            gca.l r13 = new gca.l
            r1 = 26
            r13.<init>(r5, r4, r1)
            r12.f106483w = r3
            java.lang.Object r13 = r5.p2(r12, r13)
            if (r13 != r0) goto L36
            goto L5d
        L36:
            r1 = r13
            com.revolut.sso.api.models.RevolutAccountSession r1 = (com.revolut.sso.api.models.RevolutAccountSession) r1
            if (r1 == 0) goto L82
            com.revolut.sso.api.models.UserInfo r13 = r1.f105974b
            java.lang.String r13 = r13.d
            if (r13 != 0) goto L43
            java.lang.String r13 = ""
        L43:
            kol.b r3 = r5.f106486q
            com.revolut.sso.api.accounts.RevolutAccount r6 = r1.f105973a
            java.lang.String r7 = "account"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            com.revolut.sso.impl.domain.models.InitialAuthenticationCredential$Account r7 = new com.revolut.sso.impl.domain.models.InitialAuthenticationCredential$Account
            r7.<init>(r6)
            r12.u = r1
            r12.v = r13
            r12.f106483w = r2
            java.lang.Object r2 = r3.b(r7, r12)
            if (r2 != r0) goto L5e
        L5d:
            return r0
        L5e:
            r0 = r13
            r13 = r2
        L60:
            com.revolut.sso.api.models.PasscodeWelcomeMessage r13 = (com.revolut.sso.api.models.PasscodeWelcomeMessage) r13
            if (r13 == 0) goto L67
            com.revolut.core.ui_kit.models.Clause r13 = r13.f105959a
            goto L68
        L67:
            r13 = r4
        L68:
            com.revolut.core.ui_kit.models.Clause r13 = c8g.c.p(r13)
            akl.y1 r2 = r5.f106485p
            com.revolut.sso.api.models.UserInfo r3 = r1.f105974b
            java.util.UUID r3 = r3.f105990a
            if (r3 == 0) goto L78
            java.lang.String r4 = r3.toString()
        L78:
            com.revolut.sso.impl.domain.models.UserInfoPicture r2 = r2.a(r4)
            com.revolut.sso.impl.ui.consolidation.continue_with_revolut.ContinueWithRevolutScreenContract$InputData$Identified r3 = new com.revolut.sso.impl.ui.consolidation.continue_with_revolut.ContinueWithRevolutScreenContract$InputData$Identified
            r3.<init>(r0, r13, r2)
            goto L84
        L82:
            com.revolut.sso.impl.ui.consolidation.continue_with_revolut.ContinueWithRevolutScreenContract$InputData$Anonymous r3 = com.revolut.sso.impl.ui.consolidation.continue_with_revolut.ContinueWithRevolutScreenContract$InputData.Anonymous.f106488a
        L84:
            yki.i r6 = r5.f106487r
            com.revolut.sso.impl.ui.consolidation.ContinueWithIdentityFlowContract$Step$ShowContinueWithRevolut r7 = new com.revolut.sso.impl.ui.consolidation.ContinueWithIdentityFlowContract$Step$ShowContinueWithRevolut
            r7.<init>(r3, r1)
            r10 = 0
            r11 = 12
            r8 = 0
            r9 = 0
            oki.h.t2(r5, r6, r7, r8, r9, r10, r11)
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.consolidation.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
