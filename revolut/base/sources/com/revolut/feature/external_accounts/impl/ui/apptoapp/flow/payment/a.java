package com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment;

import ej6.u;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ OpenBankingAuthPaymentFlowContract$Step f72514w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u f72515x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, OpenBankingAuthPaymentFlowContract$Step openBankingAuthPaymentFlowContract$Step, u uVar, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f72514w = openBankingAuthPaymentFlowContract$Step;
        this.f72515x = uVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f72514w, this.f72515x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d.J2(r5, r8, r7) == r0) goto L25;
     */
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
            r2 = 2
            r3 = 1
            r4 = 0
            com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d r5 = r7.v
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            yhm.o.b(r8)
            goto L78
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            yhm.o.b(r8)
            goto L33
        L1f:
            yhm.o.b(r8)
            pi6.q r8 = new pi6.q
            ej6.u r1 = r7.f72515x
            r6 = 1
            r8.<init>(r5, r1, r4, r6)
            r7.u = r3
            java.lang.Object r8 = do3.q.t(r5, r8, r7)
            if (r8 != r0) goto L33
            goto L6c
        L33:
            pi6.c r8 = (pi6.c) r8
            boolean r1 = r8 instanceof pi6.a
            if (r1 == 0) goto L41
            pi6.a r8 = (pi6.a) r8
            java.lang.String r8 = r8.f236435a
            com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d.K2(r5, r8)
            goto L78
        L41:
            boolean r1 = r8 instanceof pi6.b
            if (r1 == 0) goto L7b
            pi6.b r8 = (pi6.b) r8
            java.lang.Object r8 = r8.f236436a
            java.lang.String r8 = (java.lang.String) r8
            com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.OpenBankingAuthPaymentFlowContract$Step r1 = r7.f72514w
            com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.OpenBankingAuthPaymentFlowContract$Step$PaymentScreen r1 = (com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.OpenBankingAuthPaymentFlowContract$Step.PaymentScreen) r1
            com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OpenBankingAuthPaymentScreenContract$InputData r1 = r1.f72512a
            com.revolut.domain.models.openbanking.OpenBankingPayment r1 = r1.f72530b
            com.revolut.domain.models.openbanking.Provider r1 = r1.f60394p
            if (r1 == 0) goto L59
            java.lang.String r4 = r1.f60401a
        L59:
            java.lang.String r1 = "IDEAL"
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r4, r1)
            if (r1 == 0) goto L6d
            kotlin.jvm.internal.Intrinsics.h(r8)
            r7.u = r2
            java.lang.Object r8 = com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d.J2(r5, r8, r7)
            if (r8 != r0) goto L78
        L6c:
            return r0
        L6d:
            pi6.m r0 = new pi6.m
            kotlin.jvm.internal.Intrinsics.h(r8)
            r0.<init>(r8)
            r5.C2(r0)
        L78:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L7b:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
