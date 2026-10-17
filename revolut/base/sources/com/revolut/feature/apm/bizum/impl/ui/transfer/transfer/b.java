package com.revolut.feature.apm.bizum.impl.ui.transfer.transfer;

import bqf.d;
import com.revolut.feature.apm.bizum.api.navigation.BizumTransferInputData;
import hy1.l;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends n implements qt1.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BizumTransferInputData f61638l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ps1.b f61639m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f61640n;
    public final ax1.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f61641p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wsg.n f61642q;

    public b(BizumTransferInputData inputData, ps1.b interactor, l bizumContactsProvider, ax1.a moneyRequestInteractor, d trustInteractor, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(bizumContactsProvider, "bizumContactsProvider");
        Intrinsics.checkNotNullParameter(moneyRequestInteractor, "moneyRequestInteractor");
        Intrinsics.checkNotNullParameter(trustInteractor, "trustInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f61638l = inputData;
        this.f61639m = interactor;
        this.f61640n = bizumContactsProvider;
        this.o = moneyRequestInteractor;
        this.f61641p = trustInteractor;
        this.f61642q = walletInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b r4, com.revolut.feature.apm.core.models.transfers.money_requests.BizumMoneyRequestInfo r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof qt1.c
            if (r0 == 0) goto L13
            r0 = r6
            qt1.c r0 = (qt1.c) r0
            int r1 = r0.f248914x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f248914x = r1
            goto L18
        L13:
            qt1.c r0 = new qt1.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f248914x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.models.transfers.money_requests.BizumMoneyRequestInfo r5 = r0.u
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            ax1.a r4 = r4.o
            java.lang.String r6 = r5.f62186a
            r0.u = r5
            r0.f248914x = r3
            pz1.c r4 = (pz1.c) r4
            java.lang.Object r4 = r4.a(r6, r0)
            if (r4 != r1) goto L45
            return r1
        L45:
            qt1.k r4 = new qt1.k
            java.lang.String r5 = r5.getF62186a()
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b.Z2(com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b, com.revolut.feature.apm.core.models.transfers.money_requests.BizumMoneyRequestInfo, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b r7, com.revolut.feature.apm.core.models.bizum.BizumTransferInfo r8, com.revolut.feature.transfer.models.transfer.TransferTrustData r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof qt1.d
            if (r0 == 0) goto L13
            r0 = r10
            qt1.d r0 = (qt1.d) r0
            int r1 = r0.f248917y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f248917y = r1
            goto L18
        L13:
            qt1.d r0 = new qt1.d
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f248915w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f248917y
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            k71.c r7 = r0.v
            yhm.o.b(r10)
            goto L95
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            yhm.o.b(r10)
            goto L5f
        L3c:
            com.revolut.feature.apm.core.models.bizum.BizumTransferInfo r8 = r0.u
            yhm.o.b(r10)
            goto L50
        L42:
            yhm.o.b(r10)
            r0.u = r8
            r0.f248917y = r5
            java.lang.Object r9 = r7.e3(r9, r0)
            if (r9 != r1) goto L50
            goto L93
        L50:
            ps1.b r9 = r7.f61639m
            java.lang.String r8 = r8.f61922a
            r0.u = r6
            r0.f248917y = r4
            java.lang.Object r10 = r9.a(r8, r0)
            if (r10 != r1) goto L5f
            goto L93
        L5f:
            r8 = r10
            k71.c r8 = (k71.c) r8
            r0.u = r6
            r0.v = r8
            r0.f248917y = r3
            wsg.n r7 = r7.f61642q
            com.revolut.core.model.account.AccountId$Personal r9 = com.revolut.core.model.account.AccountId.Personal.f51414a
            efm.b r10 = r7.j0(r9)
            pfm.a r7 = r7.k0(r9)
            efm.f[] r9 = new efm.f[r4]
            r2 = 0
            r9[r2] = r10
            r9[r5] = r7
            efm.b r7 = efm.b.p(r9)
            java.lang.String r9 = "mergeArray(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r9)
            pfm.a r7 = ue0.e.v(r7)
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L8f
            goto L91
        L8f:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L91:
            if (r7 != r1) goto L94
        L93:
            return r1
        L94:
            r7 = r8
        L95:
            qt1.l r8 = new qt1.l
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b.b3(com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b, com.revolut.feature.apm.core.models.bizum.BizumTransferInfo, com.revolut.feature.transfer.models.transfer.TransferTrustData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c3(com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b r11, com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData r12, gim.c r13) {
        /*
            boolean r0 = r13 instanceof qt1.f
            if (r0 == 0) goto L13
            r0 = r13
            qt1.f r0 = (qt1.f) r0
            int r1 = r0.f248919w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f248919w = r1
            goto L18
        L13:
            qt1.f r0 = new qt1.f
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f248919w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L63
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r13)
            s02.c r4 = new s02.c
            com.revolut.feature.apm.bizum.api.navigation.BizumTransferInputData r13 = r11.f61638l
            com.revolut.feature.apm.core.models.recipients.BizumContact r7 = r13.f61561a
            dj0.d r8 = r12.getF72729b()
            java.lang.String r9 = r12.d
            r10 = 0
            com.revolut.domain.models.moneyrequest.MoneyRequestChannel$Bizum r5 = com.revolut.domain.models.moneyrequest.MoneyRequestChannel.Bizum.f60331b
            r6 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            ax1.a r11 = r11.o
            r0.f248919w = r3
            pz1.c r11 = (pz1.c) r11
            qz1.c r11 = r11.f240865a
            r11.getClass()
            qu4.s r12 = new qu4.s
            r13 = 0
            r2 = 12
            r12.<init>(r11, r4, r13, r2)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r11, r12, r0)
            if (r13 != r1) goto L63
            return r1
        L63:
            java.lang.String r11 = "null cannot be cast to non-null type com.revolut.feature.apm.core.models.transfers.money_requests.BizumMoneyRequestInfo"
            kotlin.jvm.internal.Intrinsics.i(r13, r11)
            com.revolut.feature.apm.core.models.transfers.money_requests.BizumMoneyRequestInfo r13 = (com.revolut.feature.apm.core.models.transfers.money_requests.BizumMoneyRequestInfo) r13
            com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo$Request r11 = new com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo$Request
            r11.<init>(r13)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b.c3(com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b, com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d3(com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b r12, com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData r13, gim.c r14) {
        /*
            com.revolut.feature.apm.bizum.api.navigation.BizumTransferInputData r0 = r12.f61638l
            boolean r1 = r14 instanceof qt1.g
            if (r1 == 0) goto L15
            r1 = r14
            qt1.g r1 = (qt1.g) r1
            int r2 = r1.f248920w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f248920w = r2
            goto L1a
        L15:
            qt1.g r1 = new qt1.g
            r1.<init>(r12, r14)
        L1a:
            java.lang.Object r14 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f248920w
            r4 = 1
            if (r3 == 0) goto L32
            if (r3 != r4) goto L2a
            yhm.o.b(r14)
            goto L9c
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            yhm.o.b(r14)
            com.revolut.feature.apm.core.models.recipients.BizumContact r14 = r0.f61561a
            xi0.b r3 = gs1.b.f146272a
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r3)
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor r14 = r14.f62117b
            boolean r3 = r14 instanceof com.revolut.feature.apm.core.models.recipients.ApmDescriptor.Phone
            r5 = 0
            if (r3 == 0) goto L48
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor$Phone r14 = (com.revolut.feature.apm.core.models.recipients.ApmDescriptor.Phone) r14
            goto L49
        L48:
            r14 = r5
        L49:
            if (r14 == 0) goto L4f
            java.lang.String r14 = r14.f62110b
            r10 = r14
            goto L50
        L4f:
            r10 = r5
        L50:
            if (r10 == 0) goto La4
            b02.i r6 = new b02.i
            dj0.d r7 = r13.getF72729b()
            java.lang.String r8 = r13.d
            com.revolut.feature.transfer.core.models.FundingSource r13 = r13.f61631a
            com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource r9 = oc.c.u(r13)
            com.revolut.feature.apm.core.models.recipients.BizumContact r13 = r0.f61561a
            java.lang.String r11 = r13.getDisplayName()
            r6.<init>(r7, r8, r9, r10, r11)
            ps1.b r12 = r12.f61639m
            r1.f248920w = r4
            hs1.c r13 = r12.f239387a
            gte.a r12 = r12.f239389c
            com.revolut.feature.apm.core.api.ApmToggles$BizumTransferAny2Any r14 = com.revolut.feature.apm.core.api.ApmToggles$BizumTransferAny2Any.f61787c
            jte.d r12 = (jte.d) r12
            boolean r12 = r12.c(r14)
            if (r12 == 0) goto L8a
            hs1.b r12 = new hs1.b
            r12.<init>(r13, r6, r5, r4)
            skm.p0 r13 = skm.p0.f264001a
            elm.f r13 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r13, r12, r1)
        L88:
            r14 = r12
            goto L99
        L8a:
            hs1.b r12 = new hs1.b
            r14 = 0
            r12.<init>(r13, r6, r5, r14)
            skm.p0 r13 = skm.p0.f264001a
            elm.f r13 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r13, r12, r1)
            goto L88
        L99:
            if (r14 != r2) goto L9c
            return r2
        L9c:
            com.revolut.feature.apm.core.models.bizum.BizumTransferInfo r14 = (com.revolut.feature.apm.core.models.bizum.BizumTransferInfo) r14
            com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo$Send r12 = new com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo$Send
            r12.<init>(r14)
            return r12
        La4:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Required value was null."
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b.d3(com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b, com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(com.revolut.feature.transfer.models.transfer.TransferTrustData r11, gim.c r12) throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = r12 instanceof qt1.b
            if (r0 == 0) goto L13
            r0 = r12
            qt1.b r0 = (qt1.b) r0
            int r1 = r0.f248912y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f248912y = r1
            goto L18
        L13:
            qt1.b r0 = new qt1.b
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f248910w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f248912y
            r7 = 0
            r9 = 1
            if (r2 == 0) goto L3a
            if (r2 != r9) goto L32
            iy9.d r11 = r0.v
            com.revolut.feature.transfer.models.transfer.TransferTrustData r1 = r0.u
            yhm.o.b(r12)     // Catch: java.lang.Exception -> L2d
            r4 = r10
            goto L7a
        L2d:
            r0 = move-exception
            r12 = r0
            r4 = r10
            r6 = r1
            goto L68
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            yhm.o.b(r12)
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r12 = r11.f92305b
            boolean r12 = com.revolut.feature.transfer.models.transfer.a.a(r12)
            if (r12 != 0) goto L48
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L48:
            iy9.d r5 = iy9.d.BENEFICIARY
            oqk.h r3 = new oqk.h     // Catch: java.lang.Exception -> L64
            r8 = 14
            r4 = r10
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L60
            r0.u = r6     // Catch: java.lang.Exception -> L60
            r0.v = r5     // Catch: java.lang.Exception -> L60
            r0.f248912y = r9     // Catch: java.lang.Exception -> L60
            java.lang.Object r11 = do3.q.u(r10, r3, r0)     // Catch: java.lang.Exception -> L60
            if (r11 != r1) goto L7a
            return r1
        L60:
            r0 = move-exception
        L61:
            r12 = r0
            r11 = r5
            goto L68
        L64:
            r0 = move-exception
            r4 = r10
            r6 = r11
            goto L61
        L68:
            com.revolut.feature.transfer.core.api.trust.RecipientTrustError r0 = new com.revolut.feature.transfer.core.api.trust.RecipientTrustError
            r0.<init>(r12, r11, r6)
            zhm.h0 r11 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r7, r7, r0, r11)
            boolean r11 = r12 instanceof com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException
            if (r11 != 0) goto L7d
        L7a:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L7d:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b.e3(com.revolut.feature.transfer.models.transfer.TransferTrustData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo r5, com.revolut.feature.transfer.models.transfer.TransferTrustData r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof qt1.e
            if (r0 == 0) goto L13
            r0 = r7
            qt1.e r0 = (qt1.e) r0
            int r1 = r0.f248918w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f248918w = r1
            goto L18
        L13:
            qt1.e r0 = new qt1.e
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f248918w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.a r7 = new com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.a
            r2 = 0
            r7.<init>(r5, r4, r6, r2)
            r0.f248918w = r3
            java.lang.Object r7 = do3.q.u(r4, r7, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            qt1.m r7 = (qt1.m) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b.f3(com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo, com.revolut.feature.transfer.models.transfer.TransferTrustData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g3(com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof qt1.h
            if (r0 == 0) goto L13
            r0 = r8
            qt1.h r0 = (qt1.h) r0
            int r1 = r0.f248922x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f248922x = r1
            goto L18
        L13:
            qt1.h r0 = new qt1.h
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f248922x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo r7 = r0.u
            yhm.o.b(r8)
            return r7
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            goto L4c
        L38:
            yhm.o.b(r8)
            pmk.t r8 = new pmk.t
            r2 = 22
            r5 = 0
            r8.<init>(r6, r7, r5, r2)
            r0.f248922x = r4
            java.lang.Object r8 = do3.q.u(r6, r8, r0)
            if (r8 != r1) goto L4c
            goto L60
        L4c:
            com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo r8 = (com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo) r8
            com.revolut.feature.apm.bizum.api.navigation.BizumTransferInputData r7 = r6.f61638l
            com.revolut.feature.apm.core.models.recipients.BizumContact r7 = r7.f61561a
            com.revolut.feature.apm.core.models.recipients.BizumContact r2 = r8.B8()
            r0.u = r8
            r0.f248922x = r3
            java.lang.Object r7 = r6.h3(r7, r2, r0)
            if (r7 != r1) goto L61
        L60:
            return r1
        L61:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b.g3(com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        if (r3.b(r8, r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h3(com.revolut.feature.apm.core.models.recipients.BizumContact r8, com.revolut.feature.apm.core.models.recipients.BizumContact r9, gim.c r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof qt1.j
            if (r0 == 0) goto L13
            r0 = r10
            qt1.j r0 = (qt1.j) r0
            int r1 = r0.f248925x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f248925x = r1
            goto L18
        L13:
            qt1.j r0 = new qt1.j
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f248925x
            hy1.l r3 = r7.f61640n
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            yhm.o.b(r10)
            goto L91
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            com.revolut.feature.apm.core.models.recipients.BizumContact r9 = r0.u
            yhm.o.b(r10)
            goto L75
        L3b:
            yhm.o.b(r10)
            com.revolut.feature.apm.core.models.recipients.ApmIdentifier r10 = r8.f62116a
            java.lang.String r10 = r10.getF62112a()
            com.revolut.feature.apm.core.models.recipients.ApmIdentifier r2 = r9.f62116a
            java.lang.String r2 = r2.getF62112a()
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r10, r2)
            if (r10 == 0) goto L53
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L53:
            com.revolut.feature.apm.core.models.recipients.ApmIdentifier r8 = r8.f62116a
            boolean r10 = r8 instanceof com.revolut.feature.apm.core.models.recipients.ApmIdentifier.Uuid
            if (r10 == 0) goto L78
            com.revolut.feature.apm.core.models.recipients.ApmIdentifier$Uuid r8 = (com.revolut.feature.apm.core.models.recipients.ApmIdentifier.Uuid) r8
            java.lang.String r8 = r8.f62112a
            r0.u = r9
            r0.f248925x = r5
            r3.getClass()
            hy1.j r10 = new hy1.j
            r2 = 0
            r10.<init>(r3, r8, r6, r2)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r8, r10, r0)
            if (r10 != r1) goto L75
            goto L90
        L75:
            com.revolut.feature.apm.core.models.recipients.BizumContact r10 = (com.revolut.feature.apm.core.models.recipients.BizumContact) r10
            goto L79
        L78:
            r10 = r6
        L79:
            com.revolut.feature.apm.core.models.recipients.BizumContact[] r8 = new com.revolut.feature.apm.core.models.recipients.BizumContact[]{r10, r9}
            java.lang.String r9 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            java.util.List r8 = kotlin.collections.d.L(r8)
            r0.u = r6
            r0.f248925x = r4
            java.lang.Object r8 = r3.b(r8, r0)
            if (r8 != r1) goto L91
        L90:
            return r1
        L91:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b.h3(com.revolut.feature.apm.core.models.recipients.BizumContact, com.revolut.feature.apm.core.models.recipients.BizumContact, gim.c):java.lang.Object");
    }
}
