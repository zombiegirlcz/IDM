package a5k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends yji.n implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i5k.a f1439l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m3j.a f1440m;

    public c(i5k.a appFraudCheckExtension, m3j.a accountClosedDialogProvider) {
        Intrinsics.checkNotNullParameter(appFraudCheckExtension, "appFraudCheckExtension");
        Intrinsics.checkNotNullParameter(accountClosedDialogProvider, "accountClosedDialogProvider");
        this.f1439l = appFraudCheckExtension;
        this.f1440m = accountClosedDialogProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b6, code lost:
    
        if (vkm.q.x(r1, r8) == r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(f5j.a r21, com.revolut.feature.transfer.models.transfer.TransferTrustData r22, com.revolut.domain.models.beneficiary.ConfirmationResult.ResultCode r23, boolean r24, gim.c r25) {
        /*
            r20 = this;
            r0 = r20
            r1 = r25
            boolean r2 = r1 instanceof a5k.b
            if (r2 == 0) goto L18
            r2 = r1
            a5k.b r2 = (a5k.b) r2
            int r3 = r2.f1435y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f1435y = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            a5k.b r2 = new a5k.b
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.f1433w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.f1435y
            r9 = 2
            r4 = 1
            if (r3 == 0) goto L42
            if (r3 == r4) goto L39
            if (r3 != r9) goto L31
            yhm.o.b(r1)
            goto Lb9
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            boolean r3 = r8.v
            com.revolut.domain.models.beneficiary.ConfirmationResult$ResultCode r4 = r8.u
            yhm.o.b(r1)
            r10 = r4
            goto L64
        L42:
            yhm.o.b(r1)
            n61.j.c(r21)
            r1 = r22
            boolean r1 = r1.f92304a
            r10 = r23
            r8.u = r10
            r7 = r24
            r8.v = r7
            r8.f1435y = r4
            i5k.a r3 = r0.f1439l
            r5 = 0
            r6 = 1
            r4 = r1
            java.lang.Object r1 = r3.b3(r4, r5, r6, r7, r8)
            if (r1 != r2) goto L62
            goto Lb8
        L62:
            r3 = r24
        L64:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L6f
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L6f:
            com.revolut.domain.models.beneficiary.ConfirmationResult$ResultCode r1 = com.revolut.domain.models.beneficiary.ConfirmationResult.ResultCode.ACCOUNT_CLOSED
            if (r10 != r1) goto Lbc
            m3j.a r1 = r0.f1440m
            r1.getClass()
            nii.y0 r1 = new nii.y0
            nii.l0 r10 = new nii.l0
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.retail.feature.beneficiary.impl.R$string.beneficiary_creation_cop_result_account_closed_aslau_title
            r5 = 0
            r6 = 14
            r11.<init>(r4, r5, r5, r6)
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.retail.feature.beneficiary.impl.R$string.beneficiary_creation_cop_result_account_closed_aslau_description
            r12.<init>(r4, r5, r5, r6)
            com.revolut.core.ui_kit.models.TextLocalisedClause r14 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.retail.feature.beneficiary.impl.R$string.beneficiary_creation_cop_result_account_closed_aslau_got_it
            r14.<init>(r4, r5, r5, r6)
            r18 = 0
            r19 = 1012(0x3f4, float:1.418E-42)
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r4 = 0
            r6 = 4
            java.lang.String r7 = "ACCOUNT_CLOSED_ID"
            r1.<init>(r7, r10, r4, r6)
            kotlinx.coroutines.flow.Flow r1 = r0.L2(r1)
            r8.u = r5
            r8.v = r3
            r8.f1435y = r9
            java.lang.Object r1 = vkm.q.x(r1, r8)
            if (r1 != r2) goto Lb9
        Lb8:
            return r2
        Lb9:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        Lbc:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a5k.c.Z2(f5j.a, com.revolut.feature.transfer.models.transfer.TransferTrustData, com.revolut.domain.models.beneficiary.ConfirmationResult$ResultCode, boolean, gim.c):java.lang.Object");
    }
}
