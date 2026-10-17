package ot1;

import com.revolut.feature.apm.bizum.impl.ui.transfer.review.BizumTransferReviewContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BizumTransferReviewContract$InputData f229415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x02.b f229416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bqf.d f229417c;
    public final com.revolut.domain.interactors.transactions.a d;
    public final fk3.a e;

    public o(BizumTransferReviewContract$InputData inputData, x02.b quoteInteractor, bqf.d trustInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(trustInteractor, "trustInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f229415a = inputData;
        this.f229416b = quoteInteractor;
        this.f229417c = trustInteractor;
        this.d = transactionsInteractor;
        this.e = configurationInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ot1.o r6, gim.c r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof ot1.l
            if (r0 == 0) goto L16
            r0 = r7
            ot1.l r0 = (ot1.l) r0
            int r1 = r0.f229410w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f229410w = r1
            goto L1b
        L16:
            ot1.l r0 = new ot1.l
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f229410w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r7)
            goto L7b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            fk3.a r6 = r6.e
            w4l.h r7 = w4l.h.f294642c
            ik3.c r6 = (ik3.c) r6
            e7l.g$b r2 = e7l.g.b.f123407a
            efm.r r6 = r6.l(r2, r7)
            r7 = 3
            efm.r r6 = m70.a.g(r6, r4, r4, r7)
            os9.f r7 = new os9.f
            r2 = 18
            r7.<init>(r2)
            or2.e r2 = new or2.e
            r5 = 20
            r2.<init>(r7, r5)
            efm.r r6 = r6.map(r2)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            od0.h r7 = od0.i.Companion
            r7.getClass()
            od0.i r7 = od0.i.f224256b
            efm.r r6 = ue0.e.E(r6, r7)
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r7 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r0.f229410w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L7b
            return r1
        L7b:
            od0.i r7 = (od0.i) r7
            if (r7 == 0) goto L86
            java.lang.Object r6 = r7.g()
            e7l.c r6 = (e7l.c) r6
            return r6
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ot1.o.a(ot1.o, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ot1.o r8, gim.c r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof ot1.m
            if (r0 == 0) goto L16
            r0 = r9
            ot1.m r0 = (ot1.m) r0
            int r1 = r0.f229413y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f229413y = r1
            goto L1b
        L16:
            ot1.m r0 = new ot1.m
            r0.<init>(r8, r9)
        L1b:
            java.lang.Object r9 = r0.f229411w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f229413y
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r8 = r0.v
            yhm.o.b(r9)
            goto L70
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.String r2 = r0.u
            yhm.o.b(r9)
            goto L5e
        L3e:
            yhm.o.b(r9)
            com.revolut.feature.apm.bizum.impl.ui.transfer.review.BizumTransferReviewContract$InputData r9 = r8.f229415a
            com.revolut.feature.apm.core.models.recipients.BizumContact r2 = r9.f61626a
            com.revolut.feature.apm.core.models.recipients.ApmIdentifier r2 = r2.f62116a
            boolean r6 = r2 instanceof com.revolut.feature.apm.core.models.recipients.ApmIdentifier.Uuid
            if (r6 == 0) goto L7c
            com.revolut.feature.apm.core.models.recipients.ApmIdentifier$Uuid r2 = (com.revolut.feature.apm.core.models.recipients.ApmIdentifier.Uuid) r2
            java.lang.String r2 = r2.f62112a
            bqf.d r9 = r8.f229417c
            iy9.d r6 = iy9.d.BENEFICIARY
            r0.u = r2
            r0.f229413y = r5
            java.lang.Object r9 = r9.b(r2, r6, r0)
            if (r9 != r1) goto L5e
            goto L6c
        L5e:
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r9 = (com.revolut.feature.transfer.models.transfer.RecipientTrustState) r9
            r0.u = r3
            r0.v = r9
            r0.f229413y = r4
            java.lang.Object r8 = r8.c(r2, r0)
            if (r8 != r1) goto L6d
        L6c:
            return r1
        L6d:
            r7 = r9
            r9 = r8
            r8 = r7
        L70:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            com.revolut.feature.transfer.models.transfer.TransferTrustData r0 = new com.revolut.feature.transfer.models.transfer.TransferTrustData
            r0.<init>(r9, r8)
            return r0
        L7c:
            com.revolut.feature.transfer.models.transfer.TransferTrustData r8 = new com.revolut.feature.transfer.models.transfer.TransferTrustData
            com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo r9 = r9.f61628c
            boolean r9 = r9 instanceof com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo.Request
            r8.<init>(r9, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ot1.o.b(ot1.o, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r14, gim.c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof ot1.n
            if (r0 == 0) goto L13
            r0 = r15
            ot1.n r0 = (ot1.n) r0
            int r1 = r0.f229414w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f229414w = r1
            goto L18
        L13:
            ot1.n r0 = new ot1.n
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f229414w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r15)
            goto L90
        L27:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L2f:
            yhm.o.b(r15)
            com.revolut.feature.apm.bizum.impl.ui.transfer.review.BizumTransferReviewContract$InputData r15 = r13.f229415a
            com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo r15 = r15.f61628c
            boolean r15 = r15 instanceof com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo.Request
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
            com.revolut.domain.interactors.transactions.a r6 = r13.d
            r8 = 0
            ufm.i r14 = com.revolut.domain.interactors.transactions.a.b(r6, r7, r8, r9, r10, r11, r12)
            os9.f r15 = new os9.f
            r2 = 19
            r15.<init>(r2)
            or2.e r2 = new or2.e
            r4 = 21
            r2.<init>(r15, r4)
            ufm.i r15 = new ufm.i
            r15.<init>(r14, r2, r3)
            java.lang.String r14 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r14)
            r0.f229414w = r3
            java.lang.Object r15 = nim.a.b(r15, r0)
            if (r15 != r1) goto L90
            return r1
        L90:
            java.lang.String r14 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ot1.o.c(java.lang.String, gim.c):java.lang.Object");
    }
}
