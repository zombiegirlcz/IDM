package com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.g;
import tb4.m;
import yki.l;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public g u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FinancialEvidenceFlowContract$Step f67725w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f67726x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f67727y;
    public final /* synthetic */ m z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FinancialEvidenceFlowContract$Step financialEvidenceFlowContract$Step, e eVar, l lVar, m mVar, Continuation continuation) {
        super(1, continuation);
        this.f67725w = financialEvidenceFlowContract$Step;
        this.f67726x = eVar;
        this.f67727y = lVar;
        this.z = mVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.f67725w, this.f67726x, this.f67727y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
    
        if (r6.p2(r14, r15) != r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r14.v
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e r6 = r14.f67726x
            r13 = 0
            if (r1 == 0) goto L32
            if (r1 == r5) goto L2e
            if (r1 == r4) goto L29
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            yhm.o.b(r15)
            goto L6a
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            nii.g r1 = r14.u
            yhm.o.b(r15)
            r11 = r14
            goto La9
        L29:
            yhm.o.b(r15)
            r11 = r14
            goto L8c
        L2e:
            yhm.o.b(r15)
            goto L51
        L32:
            yhm.o.b(r15)
            com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.FinancialEvidenceFlowContract$Step r15 = r14.f67725w
            com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.FinancialEvidenceFlowContract$Step$Summary r15 = (com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.FinancialEvidenceFlowContract$Step.Summary) r15
            xu3.o0 r15 = r15.f67721b
            xu3.o0 r1 = xu3.o0.JOINT_APPLICANTS
            tb4.m r7 = r14.z
            if (r15 != r1) goto L74
            s15.j r15 = new s15.j
            r1 = 3
            r15.<init>(r6, r7, r13, r1)
            r14.v = r5
            java.lang.Object r15 = r6.p2(r14, r15)
            if (r15 != r0) goto L51
            r11 = r14
            goto Lb9
        L51:
            it3.d r15 = (it3.d) r15
            com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.FinancialEvidenceFlowContract$Step$JointApplicantsConfirmation r8 = new com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.FinancialEvidenceFlowContract$Step$JointApplicantsConfirmation
            xu3.n0 r0 = r6.Q2()
            ht3.l0 r0 = r0.f308935c
            if (r0 == 0) goto L6c
            r8.<init>(r15, r0)
            r11 = 0
            r12 = 12
            yki.l r7 = r14.f67727y
            r9 = 0
            r10 = 0
            oki.h.t2(r6, r7, r8, r9, r10, r11, r12)
        L6a:
            r11 = r14
            goto Lba
        L6c:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r15.<init>(r0)
            throw r15
        L74:
            sb4.g r9 = new sb4.g
            r15 = 0
            r9.<init>(r6, r15)
            sb4.i r10 = new sb4.i
            r10.<init>(r6, r7, r13, r15)
            r14.v = r4
            r7 = 0
            r8 = 0
            r12 = 3
            r11 = r14
            java.lang.Object r15 = n14.k.V(r6, r7, r8, r9, r10, r11, r12)
            if (r15 != r0) goto L8c
            goto Lb9
        L8c:
            r1 = r15
            nii.h r1 = (nii.h) r1
            boolean r15 = r1 instanceof nii.g
            if (r15 == 0) goto Lba
            r15 = r1
            nii.g r15 = (nii.g) r15
            nii.n1 r4 = r15.f216153b
            boolean r4 = r4 instanceof nii.k1
            if (r4 == 0) goto Lba
            sb4.c r4 = r6.f67730p
            r11.u = r15
            r11.v = r3
            java.lang.Object r15 = r4.b(r14)
            if (r15 != r0) goto La9
            goto Lb9
        La9:
            sb4.h r15 = new sb4.h
            r3 = 0
            r15.<init>(r6, r1, r13, r3)
            r11.u = r13
            r11.v = r2
            java.lang.Object r15 = r6.p2(r14, r15)
            if (r15 != r0) goto Lba
        Lb9:
            return r0
        Lba:
            kotlin.Unit r15 = kotlin.Unit.f186387a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
