package com.revolut.feature.retail.salary_account.impl.flow.ui;

import bgb.f;
import com.revolut.feature.retail.salary_account.impl.flow.ui.SalaryAccountFlowContract$InputData;
import com.revolut.feature.retail.salary_account.impl.flow.ui.SalaryAccountFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import fnc.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import yki.i;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends h implements bgb.b {

    @NotNull
    public static final f Companion = new f();
    public final SalaryAccountFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zfb.a f82979p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rfb.b f82980q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s f82981r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final bhb.a f82982s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final on2.b f82983t;
    public final i u;

    public d(SalaryAccountFlowContract$InputData inputData, zfb.a salaryAccountProductArticleProvider, rfb.b salaryAccountFeatureChecker, s salarySwitchRequestStatusInteractor, bhb.a salarySwitchAssistantStatusDialogProvider, on2.b bankAccountSwitchingFeatureChecker) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(salaryAccountProductArticleProvider, "salaryAccountProductArticleProvider");
        Intrinsics.checkNotNullParameter(salaryAccountFeatureChecker, "salaryAccountFeatureChecker");
        Intrinsics.checkNotNullParameter(salarySwitchRequestStatusInteractor, "salarySwitchRequestStatusInteractor");
        Intrinsics.checkNotNullParameter(salarySwitchAssistantStatusDialogProvider, "salarySwitchAssistantStatusDialogProvider");
        Intrinsics.checkNotNullParameter(bankAccountSwitchingFeatureChecker, "bankAccountSwitchingFeatureChecker");
        this.o = inputData;
        this.f82979p = salaryAccountProductArticleProvider;
        this.f82980q = salaryAccountFeatureChecker;
        this.f82981r = salarySwitchRequestStatusInteractor;
        this.f82982s = salarySwitchAssistantStatusDialogProvider;
        this.f82983t = bankAccountSwitchingFeatureChecker;
        this.u = d8l.d.a(this, new b7d.c(this, 27));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.retail.salary_account.impl.flow.ui.d r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof bgb.k
            if (r0 == 0) goto L13
            r0 = r8
            bgb.k r0 = (bgb.k) r0
            int r1 = r0.f15172w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15172w = r1
            goto L18
        L13:
            bgb.k r0 = new bgb.k
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f15172w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L3f
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            zfb.a r8 = r7.f82979p
            r0.f15172w = r3
            zfb.c r8 = (zfb.c) r8
            java.lang.Enum r8 = r8.a(r0)
            if (r8 != r1) goto L3f
            return r1
        L3f:
            agb.a r8 = (agb.a) r8
            yki.i r1 = r7.u
            com.revolut.feature.retail.salary_account.impl.flow.ui.SalaryAccountFlowContract$Step$SalaryAccountProductArticle r2 = new com.revolut.feature.retail.salary_account.impl.flow.ui.SalaryAccountFlowContract$Step$SalaryAccountProductArticle
            r2.<init>(r8)
            r5 = 0
            r6 = 12
            r3 = 0
            r4 = 0
            r0 = r7
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.salary_account.impl.flow.ui.d.I2(com.revolut.feature.retail.salary_account.impl.flow.ui.d, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        SalaryAccountFlowContract$InputData.SalaryHub salaryHub = SalaryAccountFlowContract$InputData.SalaryHub.f82968a;
        SalaryAccountFlowContract$InputData salaryAccountFlowContract$InputData = this.o;
        Continuation continuation = null;
        if (Intrinsics.f(salaryAccountFlowContract$InputData, salaryHub)) {
            l2(new c(this, null), new yi5.b(26));
            return;
        }
        if (Intrinsics.f(salaryAccountFlowContract$InputData, SalaryAccountFlowContract$InputData.MoveSalary.f82967a)) {
            l2(new bgb.h(this, bgb.c.DEEPLINK, continuation, 1), new yi5.b(26));
        } else {
            if (!Intrinsics.f(salaryAccountFlowContract$InputData, SalaryAccountFlowContract$InputData.IncomeInsuranceClaim.f82966a)) {
                throw new NoWhenBranchMatchedException();
            }
            h.w2(this.u, SalaryAccountFlowContract$Step.IncomeInsuranceClaim.f82969a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
