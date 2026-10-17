package com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zhb.k;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function1 {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f83059w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k kVar, Continuation continuation) {
        super(1, continuation);
        this.f83059w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f83059w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r1 == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        if (r1 == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        return r3;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            zhb.k r0 = r7.f83059w
            t1j.b r1 = r0.f322389p
            com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.PayrollPlatformEmailInputContract$InputData r2 = r0.o
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r7.v
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L22
            if (r4 == r6) goto L1b
            if (r4 != r5) goto L13
            goto L1b
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            java.lang.String r1 = r7.u
            yhm.o.b(r8)
            goto L89
        L22:
            yhm.o.b(r8)
            cli.y r8 = r0.f322391r
            java.lang.Object r8 = r8.f22677a
            vkm.j2 r8 = (vkm.j2) r8
            java.lang.Object r8 = r8.getValue()
            zhb.a r8 = (zhb.a) r8
            java.lang.String r8 = r8.f322380a
            com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.PayrollPlatformEmailInputContract$InputData$UpdatePayrollPlatform r4 = com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.PayrollPlatformEmailInputContract$InputData.UpdatePayrollPlatform.f83058a
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r2, r4)
            if (r4 == 0) goto L5f
            r7.u = r8
            r7.v = r6
            java.lang.Object r1 = r1.f267380b
            ugc.a r1 = (ugc.a) r1
            java.lang.Object r1 = r1.f279998b
            com.revolut.feature.retail.salary_account.impl.switch_assistant.data.SalarySwitchAssistantService r1 = (com.revolut.feature.retail.salary_account.impl.switch_assistant.data.SalarySwitchAssistantService) r1
            whb.i r2 = new whb.i
            r2.<init>(r8)
            java.lang.Object r1 = r1.updateWorkEmail(r2, r7)
            if (r1 != r3) goto L53
            goto L55
        L53:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L55:
            if (r1 != r3) goto L58
            goto L5a
        L58:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L5a:
            if (r1 != r3) goto L5d
            goto L88
        L5d:
            r1 = r8
            goto L89
        L5f:
            boolean r4 = r2 instanceof com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.PayrollPlatformEmailInputContract$InputData.AccountToWorkEmail
            if (r4 == 0) goto L94
            com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.PayrollPlatformEmailInputContract$InputData$AccountToWorkEmail r2 = (com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.PayrollPlatformEmailInputContract$InputData.AccountToWorkEmail) r2
            java.lang.String r2 = r2.f83057a
            r7.u = r8
            r7.v = r5
            java.lang.Object r1 = r1.f267380b
            ugc.a r1 = (ugc.a) r1
            java.lang.Object r1 = r1.f279998b
            com.revolut.feature.retail.salary_account.impl.switch_assistant.data.SalarySwitchAssistantService r1 = (com.revolut.feature.retail.salary_account.impl.switch_assistant.data.SalarySwitchAssistantService) r1
            whb.c r4 = new whb.c
            r4.<init>(r8)
            java.lang.Object r1 = r1.sendAccountToWorkEmail(r2, r4, r7)
            if (r1 != r3) goto L7f
            goto L81
        L7f:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L81:
            if (r1 != r3) goto L84
            goto L86
        L84:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L86:
            if (r1 != r3) goto L5d
        L88:
            return r3
        L89:
            zhb.d r8 = new zhb.d
            r8.<init>(r1)
            r0.C2(r8)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L94:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
