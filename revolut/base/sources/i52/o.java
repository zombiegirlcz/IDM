package i52;

import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.review.TransferReviewContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferReviewContract$InputData f158574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmTransferContract$InputData f158575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x02.b f158576c;
    public final bqf.d d;
    public final com.revolut.domain.interactors.transactions.a e;

    public o(TransferReviewContract$InputData inputData, ApmTransferContract$InputData flowInputData, x02.b quoteInteractor, bqf.d trustInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(trustInteractor, "trustInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f158574a = inputData;
        this.f158575b = flowInputData;
        this.f158576c = quoteInteractor;
        this.d = trustInteractor;
        this.e = transactionsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(i52.o r9, gim.c r10) {
        /*
            com.revolut.feature.apm.core.ui.impl.ui.transfer.review.TransferReviewContract$InputData r0 = r9.f158574a
            boolean r1 = r10 instanceof i52.m
            if (r1 == 0) goto L15
            r1 = r10
            i52.m r1 = (i52.m) r1
            int r2 = r1.f158572y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f158572y = r2
            goto L1a
        L15:
            i52.m r1 = new i52.m
            r1.<init>(r9, r10)
        L1a:
            java.lang.Object r10 = r1.f158570w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f158572y
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L3e
            if (r3 == r6) goto L38
            if (r3 != r4) goto L30
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r9 = r1.v
            yhm.o.b(r10)
            goto La1
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.String r0 = r1.u
            yhm.o.b(r10)
            goto L8c
        L3e:
            yhm.o.b(r10)
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection r10 = r0.f62467b
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient r10 = r10.t0()
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r3)
            boolean r7 = r10 instanceof com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient.Contact
            if (r7 == 0) goto L59
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient$Contact r10 = (com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient.Contact) r10
            com.revolut.feature.apm.core.models.recipients.ApmContact r10 = r10.f62299a
            com.revolut.feature.apm.core.models.recipients.ApmIdentifier r10 = r10.getF62147a()
            goto L5e
        L59:
            boolean r10 = r10 instanceof com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient.OpenRequest
            if (r10 == 0) goto Lb7
            r10 = r5
        L5e:
            boolean r7 = r10 instanceof com.revolut.feature.apm.core.models.recipients.ApmIdentifier.Uuid
            if (r7 == 0) goto Lad
            com.revolut.feature.apm.core.models.recipients.ApmIdentifier$Uuid r10 = (com.revolut.feature.apm.core.models.recipients.ApmIdentifier.Uuid) r10
            java.lang.String r10 = r10.f62112a
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection r0 = r0.f62467b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient r0 = r0.t0()
            com.revolut.feature.apm.core.api.product.ApmProduct r0 = k12.b.a(r0)
            r0.getClass()
            boolean r0 = r0 instanceof com.revolut.feature.apm.core.api.product.ApmBreb
            if (r0 != 0) goto L8f
            bqf.d r0 = r9.d
            iy9.d r3 = iy9.d.BENEFICIARY
            r1.u = r10
            r1.f158572y = r6
            java.lang.Object r0 = r0.b(r10, r3, r1)
            if (r0 != r2) goto L89
            goto L9d
        L89:
            r8 = r0
            r0 = r10
            r10 = r8
        L8c:
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r10 = (com.revolut.feature.transfer.models.transfer.RecipientTrustState) r10
            goto L91
        L8f:
            r0 = r10
            r10 = r5
        L91:
            r1.u = r5
            r1.v = r10
            r1.f158572y = r4
            java.lang.Object r9 = r9.b(r0, r1)
            if (r9 != r2) goto L9e
        L9d:
            return r2
        L9e:
            r8 = r10
            r10 = r9
            r9 = r8
        La1:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            com.revolut.feature.transfer.models.transfer.TransferTrustData r0 = new com.revolut.feature.transfer.models.transfer.TransferTrustData
            r0.<init>(r10, r9)
            return r0
        Lad:
            com.revolut.feature.transfer.models.transfer.TransferTrustData r9 = new com.revolut.feature.transfer.models.transfer.TransferTrustData
            com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo r10 = r0.d
            boolean r10 = r10 instanceof com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo.Request
            r9.<init>(r10, r5)
            return r9
        Lb7:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i52.o.a(i52.o, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r14, gim.c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof i52.n
            if (r0 == 0) goto L13
            r0 = r15
            i52.n r0 = (i52.n) r0
            int r1 = r0.f158573w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f158573w = r1
            goto L18
        L13:
            i52.n r0 = new i52.n
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f158573w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r15)
            goto L8e
        L27:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L2f:
            yhm.o.b(r15)
            com.revolut.feature.apm.core.ui.impl.ui.transfer.review.TransferReviewContract$InputData r15 = r13.f158574a
            com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo r15 = r15.d
            boolean r15 = r15 instanceof com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo.Request
            if (r15 == 0) goto L3d
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            return r14
        L3d:
            tof.i7$c r15 = tof.i7.Companion
            tof.e7 r2 = new tof.e7
            r2.<init>(r14)
            tof.qb r14 = new tof.qb
            tof.v6 r4 = tof.v6.COMPLETED
            java.util.List r4 = zhm.u.c(r4)
            r14.<init>(r4)
            r4 = 2
            tof.i7[] r4 = new tof.i7[r4]
            r5 = 0
            r4[r5] = r2
            r4[r3] = r14
            r15.getClass()
            tof.q7 r7 = tof.i7.c.a(r4)
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r3)
            com.revolut.domain.interactors.transactions.TransactionsSort r10 = com.revolut.domain.interactors.transactions.TransactionsSort.NO_SORT
            r11 = 0
            r12 = 18
            com.revolut.domain.interactors.transactions.a r6 = r13.e
            r8 = 0
            ufm.i r14 = com.revolut.domain.interactors.transactions.a.b(r6, r7, r8, r9, r10, r11, r12)
            i4h.q r15 = new i4h.q
            r2 = 12
            r15.<init>(r2)
            i52.j r2 = new i52.j
            r2.<init>(r5, r15)
            ufm.i r15 = new ufm.i
            r15.<init>(r14, r2, r3)
            java.lang.String r14 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r14)
            r0.f158573w = r3
            java.lang.Object r15 = nim.a.b(r15, r0)
            if (r15 != r1) goto L8e
            return r1
        L8e:
            java.lang.String r14 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: i52.o.b(java.lang.String, gim.c):java.lang.Object");
    }
}
