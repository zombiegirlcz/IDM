package com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        if (r12 != r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
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
            com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink.c r4 = r11.v
            r5 = 1
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            yhm.o.b(r12)
            goto Lbc
        L16:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1e:
            yhm.o.b(r12)
            goto L96
        L23:
            yhm.o.b(r12)
            goto L44
        L27:
            yhm.o.b(r12)
            q58.a r12 = r4.f76661p
            r58.b r1 = new r58.b
            com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink.AccountActivationDeeplinkFlowContract$InputData r6 = r4.o
            java.lang.String r6 = r6.f76654a
            r1.<init>(r6)
            a68.e r12 = (a68.e) r12
            ufm.i r12 = r12.c(r1)
            r11.u = r5
            java.lang.Object r12 = nim.a.b(r12, r11)
            if (r12 != r0) goto L44
            goto La9
        L44:
            r58.c r12 = (r58.c) r12
            r58.c$a r1 = r58.c.a.f251541a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r12, r1)
            if (r1 != 0) goto Lb0
            r58.c$d r1 = r58.c.d.f251544a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r12, r1)
            if (r1 == 0) goto L57
            goto Lb0
        L57:
            r58.c$b r1 = r58.c.b.f251542a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r12, r1)
            if (r1 == 0) goto L6c
            yki.i r5 = r4.f76664s
            r9 = 0
            r10 = 12
            com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink.AccountActivationDeeplinkFlowContract$Step$CompanyMismatch r6 = com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink.AccountActivationDeeplinkFlowContract$Step.CompanyMismatch.f76657a
            r7 = 0
            r8 = 0
            oki.h.t2(r4, r5, r6, r7, r8, r9, r10)
            goto Lbc
        L6c:
            r58.c$c r1 = r58.c.C1388c.f251543a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r12, r1)
            if (r1 == 0) goto L81
            yki.i r5 = r4.f76664s
            r9 = 0
            r10 = 12
            com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink.AccountActivationDeeplinkFlowContract$Step$CountryMismatch r6 = com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink.AccountActivationDeeplinkFlowContract$Step.CountryMismatch.f76658a
            r7 = 0
            r8 = 0
            oki.h.t2(r4, r5, r6, r7, r8, r9, r10)
            goto Lbc
        L81:
            r58.c$e r1 = r58.c.e.f251545a
            boolean r12 = kotlin.jvm.internal.Intrinsics.f(r12, r1)
            if (r12 == 0) goto Laa
            hj8.a r12 = r4.f76662q
            r11.u = r3
            nj8.n r12 = (nj8.n) r12
            java.lang.Object r12 = r12.n(r5, r11)
            if (r12 != r0) goto L96
            goto La9
        L96:
            r11.u = r2
            com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink.b r12 = new com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink.b
            r1 = 0
            r12.<init>(r4, r1)
            java.lang.Object r12 = skm.e0.o(r12, r11)
            if (r12 != r0) goto La5
            goto La7
        La5:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        La7:
            if (r12 != r0) goto Lbc
        La9:
            return r0
        Laa:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        Lb0:
            yki.i r5 = r4.f76664s
            r9 = 0
            r10 = 12
            com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink.AccountActivationDeeplinkFlowContract$Step$AccountApprovedAlready r6 = com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink.AccountActivationDeeplinkFlowContract$Step.AccountApprovedAlready.f76655a
            r7 = 0
            r8 = 0
            oki.h.t2(r4, r5, r6, r7, r8, r9, r10)
        Lbc:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
