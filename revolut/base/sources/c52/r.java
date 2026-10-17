package c52;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.models.transfers.ApmTransferDestination;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentInfo;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import ix6.l0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class r extends yji.n implements c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ApmTransferContract$InputData f21392l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final yw1.b f21393m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final iz1.n f21394n;
    public final lx1.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ax1.a f21395p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pz1.b f21396q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bqf.d f21397r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wsg.n f21398s;

    public r(ApmTransferContract$InputData inputData, yw1.b apmTransfersRepository, iz1.n apmTransfersDraftsRepository, lx1.d contactsInteractor, ax1.a moneyRequestInteractor, pz1.b moneyRequestsActionsRepository, bqf.d trustInteractor, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(apmTransfersRepository, "apmTransfersRepository");
        Intrinsics.checkNotNullParameter(apmTransfersDraftsRepository, "apmTransfersDraftsRepository");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(moneyRequestInteractor, "moneyRequestInteractor");
        Intrinsics.checkNotNullParameter(moneyRequestsActionsRepository, "moneyRequestsActionsRepository");
        Intrinsics.checkNotNullParameter(trustInteractor, "trustInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f21392l = inputData;
        this.f21393m = apmTransfersRepository;
        this.f21394n = apmTransfersDraftsRepository;
        this.o = contactsInteractor;
        this.f21395p = moneyRequestInteractor;
        this.f21396q = moneyRequestsActionsRepository;
        this.f21397r = trustInteractor;
        this.f21398s = walletInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(c52.r r7, com.revolut.feature.apm.core.models.transfers.money_requests.ApmAcceptMoneyRequest r8, com.revolut.feature.transfer.models.transfer.TransferTrustData r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof c52.f
            if (r0 == 0) goto L13
            r0 = r10
            c52.f r0 = (c52.f) r0
            int r1 = r0.f21371y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21371y = r1
            goto L18
        L13:
            c52.f r0 = new c52.f
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f21369w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f21371y
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
            goto L7c
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            yhm.o.b(r10)
            goto L6b
        L3c:
            com.revolut.feature.apm.core.models.transfers.money_requests.ApmAcceptMoneyRequest r8 = r0.u
            yhm.o.b(r10)
            goto L50
        L42:
            yhm.o.b(r10)
            r0.u = r8
            r0.f21371y = r5
            java.lang.Object r9 = r7.g3(r9, r0)
            if (r9 != r1) goto L50
            goto L7a
        L50:
            pz1.b r9 = r7.f21396q
            r0.u = r6
            r0.f21371y = r4
            r9.getClass()
            pnf.f r10 = new pnf.f
            r2 = 25
            r10.<init>(r9, r8, r6, r2)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r8, r10, r0)
            if (r10 != r1) goto L6b
            goto L7a
        L6b:
            r8 = r10
            k71.c r8 = (k71.c) r8
            r0.u = r6
            r0.v = r8
            r0.f21371y = r3
            java.lang.Object r7 = r7.o3(r0)
            if (r7 != r1) goto L7b
        L7a:
            return r1
        L7b:
            r7 = r8
        L7c:
            g52.b r8 = new g52.b
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c52.r.Z2(c52.r, com.revolut.feature.apm.core.models.transfers.money_requests.ApmAcceptMoneyRequest, com.revolut.feature.transfer.models.transfer.TransferTrustData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(c52.r r12, com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDraftRequest r13, com.revolut.feature.transfer.models.transfer.TransferTrustData r14, gim.c r15) {
        /*
            boolean r0 = r15 instanceof c52.g
            if (r0 == 0) goto L13
            r0 = r15
            c52.g r0 = (c52.g) r0
            int r1 = r0.f21374y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21374y = r1
            goto L18
        L13:
            c52.g r0 = new c52.g
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f21372w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f21374y
            r3 = 3
            r4 = 2
            r5 = 1
            r10 = 0
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            k71.c r12 = r0.v
            yhm.o.b(r15)
            goto L7e
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            yhm.o.b(r15)
            goto L6d
        L3c:
            com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDraftRequest r13 = r0.u
            yhm.o.b(r15)
        L41:
            r9 = r13
            goto L51
        L43:
            yhm.o.b(r15)
            r0.u = r13
            r0.f21374y = r5
            java.lang.Object r14 = r12.g3(r14, r0)
            if (r14 != r1) goto L41
            goto L7c
        L51:
            iz1.n r7 = r12.f21394n
            java.lang.String r8 = r9.f62201a
            r0.u = r10
            r0.f21374y = r4
            r7.getClass()
            ix6.l0 r6 = new ix6.l0
            r11 = 3
            r6.<init>(r7, r8, r9, r10, r11)
            skm.p0 r13 = skm.p0.f264001a
            elm.f r13 = elm.f.f127540b
            java.lang.Object r15 = skm.e0.J(r13, r6, r0)
            if (r15 != r1) goto L6d
            goto L7c
        L6d:
            r13 = r15
            k71.c r13 = (k71.c) r13
            r0.u = r10
            r0.v = r13
            r0.f21374y = r3
            java.lang.Object r12 = r12.o3(r0)
            if (r12 != r1) goto L7d
        L7c:
            return r1
        L7d:
            r12 = r13
        L7e:
            g52.b r13 = new g52.b
            r13.<init>(r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: c52.r.b3(c52.r, com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDraftRequest, com.revolut.feature.transfer.models.transfer.TransferTrustData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c3(c52.r r4, com.revolut.feature.apm.core.models.transfers.money_requests.ApmMoneyRequestInfo r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof c52.h
            if (r0 == 0) goto L13
            r0 = r6
            c52.h r0 = (c52.h) r0
            int r1 = r0.f21376x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21376x = r1
            goto L18
        L13:
            c52.h r0 = new c52.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f21376x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.models.transfers.money_requests.ApmMoneyRequestInfo r5 = r0.u
            yhm.o.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            ax1.a r4 = r4.f21395p
            java.lang.String r6 = r5.getF62186a()
            r0.u = r5
            r0.f21376x = r3
            pz1.c r4 = (pz1.c) r4
            java.lang.Object r4 = r4.a(r6, r0)
            if (r4 != r1) goto L47
            return r1
        L47:
            g52.a r4 = new g52.a
            java.lang.String r5 = r5.getF62186a()
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c52.r.c3(c52.r, com.revolut.feature.apm.core.models.transfers.money_requests.ApmMoneyRequestInfo, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d3(c52.r r12, com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo.Send r13, com.revolut.feature.transfer.models.transfer.TransferTrustData r14, gim.c r15) {
        /*
            boolean r0 = r15 instanceof c52.i
            if (r0 == 0) goto L13
            r0 = r15
            c52.i r0 = (c52.i) r0
            int r1 = r0.f21379y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21379y = r1
            goto L18
        L13:
            c52.i r0 = new c52.i
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f21377w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f21379y
            r3 = 3
            r4 = 2
            r5 = 1
            r10 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            k71.c r12 = r0.v
            yhm.o.b(r15)
            goto L84
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            yhm.o.b(r15)
            goto L73
        L3c:
            com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo$Send r13 = r0.u
            yhm.o.b(r15)
            goto L50
        L42:
            yhm.o.b(r15)
            r0.u = r13
            r0.f21379y = r5
            java.lang.Object r14 = r12.g3(r14, r0)
            if (r14 != r1) goto L50
            goto L82
        L50:
            yw1.b r14 = r12.f21393m
            com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentInfo r15 = r13.f62464b
            java.lang.String r8 = r15.f62204a
            com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues r9 = r13.f62465c
            r0.u = r10
            r0.f21379y = r4
            r7 = r14
            iz1.q r7 = (iz1.q) r7
            r7.getClass()
            ix6.l0 r6 = new ix6.l0
            r11 = 4
            r6.<init>(r7, r8, r9, r10, r11)
            skm.p0 r13 = skm.p0.f264001a
            elm.f r13 = elm.f.f127540b
            java.lang.Object r15 = skm.e0.J(r13, r6, r0)
            if (r15 != r1) goto L73
            goto L82
        L73:
            r13 = r15
            k71.c r13 = (k71.c) r13
            r0.u = r10
            r0.v = r13
            r0.f21379y = r3
            java.lang.Object r12 = r12.o3(r0)
            if (r12 != r1) goto L83
        L82:
            return r1
        L83:
            r12 = r13
        L84:
            g52.b r13 = new g52.b
            r13.<init>(r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: c52.r.d3(c52.r, com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo$Send, com.revolut.feature.transfer.models.transfer.TransferTrustData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e3(c52.r r12, com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c52.r.e3(c52.r, com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f3(c52.r r10, com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c52.r.f3(c52.r, com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData, gim.c):java.lang.Object");
    }

    public static final ApmIdentifier i3(ApmPaymentInfo apmPaymentInfo, ApmContact apmContact) {
        String str = apmPaymentInfo.f62205b;
        return str != null ? new ApmIdentifier.Uuid(str) : apmContact.getF62137a();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g3(com.revolut.feature.transfer.models.transfer.TransferTrustData r11, gim.c r12) throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = r12 instanceof c52.d
            if (r0 == 0) goto L13
            r0 = r12
            c52.d r0 = (c52.d) r0
            int r1 = r0.f21365y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21365y = r1
            goto L18
        L13:
            c52.d r0 = new c52.d
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f21363w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f21365y
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            iy9.d r11 = r0.v
            com.revolut.feature.transfer.models.transfer.TransferTrustData r1 = r0.u
            yhm.o.b(r12)     // Catch: java.lang.Exception -> L2d
            r5 = r10
            goto L90
        L2d:
            r0 = move-exception
            r12 = r0
            r5 = r10
            r8 = r1
            goto L7d
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
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient r12 = r10.j3()
            boolean r2 = r12 instanceof com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient.Contact
            if (r2 != 0) goto L53
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L53:
            iy9.d r7 = iy9.d.BENEFICIARY
            c52.e r4 = new c52.e     // Catch: java.lang.Exception -> L79
            r6 = r12
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient$Contact r6 = (com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient.Contact) r6     // Catch: java.lang.Exception -> L75
            r9 = 0
            r5 = r10
            r8 = r11
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L71
            r0.u = r8     // Catch: java.lang.Exception -> L6d
            r0.v = r7     // Catch: java.lang.Exception -> L6d
            r0.f21365y = r3     // Catch: java.lang.Exception -> L6d
            java.lang.Object r11 = do3.q.u(r10, r4, r0)     // Catch: java.lang.Exception -> L6d
            if (r11 != r1) goto L90
            return r1
        L6d:
            r0 = move-exception
        L6e:
            r12 = r0
        L6f:
            r11 = r7
            goto L7d
        L71:
            r0 = move-exception
        L72:
            r11 = r0
            r12 = r11
            goto L6f
        L75:
            r0 = move-exception
            r5 = r10
            r8 = r11
            goto L72
        L79:
            r0 = move-exception
            r5 = r10
            r8 = r11
            goto L6e
        L7d:
            com.revolut.feature.transfer.core.api.trust.RecipientTrustError r0 = new com.revolut.feature.transfer.core.api.trust.RecipientTrustError
            r0.<init>(r12, r11, r8)
            zhm.h0 r11 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r0, r11)
            boolean r11 = r12 instanceof com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException
            if (r11 != 0) goto L93
        L90:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L93:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: c52.r.g3(com.revolut.feature.transfer.models.transfer.TransferTrustData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h3(com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo r5, com.revolut.feature.transfer.models.transfer.TransferTrustData r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof c52.j
            if (r0 == 0) goto L13
            r0 = r7
            c52.j r0 = (c52.j) r0
            int r1 = r0.f21380w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21380w = r1
            goto L18
        L13:
            c52.j r0 = new c52.j
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f21380w
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
            c52.k r7 = new c52.k
            r2 = 0
            r7.<init>(r5, r4, r6, r2)
            r0.f21380w = r3
            java.lang.Object r7 = do3.q.u(r4, r7, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            g52.c r7 = (g52.c) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c52.r.h3(com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo, com.revolut.feature.transfer.models.transfer.TransferTrustData, gim.c):java.lang.Object");
    }

    public final ApmTransferRecipient j3() {
        return this.f21392l.f62280a.t0();
    }

    public final Object k3(TransferData transferData, ApmTransferDestination apmTransferDestination, gim.c cVar) {
        ApmPaymentSource apmPaymentSourceU = oc.c.u(transferData.f62453a);
        dj0.d f72729b = transferData.getF72729b();
        String str = transferData.e;
        TransferScheduleData transferScheduleData = transferData.f62456g;
        long j2 = transferScheduleData.f104285a;
        Continuation continuation = null;
        t02.f fVar = new t02.f(apmPaymentSourceU, apmTransferDestination, f72729b, str, j2 != 0 ? oc.c.I(j2) : null, transferScheduleData.f104286b);
        ApmTransferContract$InputData.PaymentReference paymentReference = this.f21392l.f;
        boolean z = paymentReference instanceof ApmTransferContract$InputData.PaymentReference.PaymentIntent;
        yw1.b bVar = this.f21393m;
        if (z) {
            String str2 = ((ApmTransferContract$InputData.PaymentReference.PaymentIntent) paymentReference).f62291a;
            iz1.q qVar = (iz1.q) bVar;
            qVar.getClass();
            l0 l0Var = new l0(qVar, str2, fVar, continuation, 5);
            p0 p0Var = p0.f264001a;
            return e0.J(elm.f.f127540b, l0Var, cVar);
        }
        if (paymentReference != null) {
            throw new NoWhenBranchMatchedException();
        }
        iz1.q qVar2 = (iz1.q) bVar;
        qVar2.getClass();
        ikf.g gVar = new ikf.g(qVar2, fVar, continuation, 29);
        p0 p0Var2 = p0.f264001a;
        return e0.J(elm.f.f127540b, gVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l3(com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof c52.n
            if (r0 == 0) goto L13
            r0 = r8
            c52.n r0 = (c52.n) r0
            int r1 = r0.f21387x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21387x = r1
            goto L18
        L13:
            c52.n r0 = new c52.n
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f21387x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo r7 = r0.u
            yhm.o.b(r8)
            return r7
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)
            goto L4a
        L39:
            yhm.o.b(r8)
            c52.o r8 = new c52.o
            r8.<init>(r6, r7, r5)
            r0.f21387x = r4
            java.lang.Object r8 = do3.q.u(r6, r8, r0)
            if (r8 != r1) goto L4a
            goto L7c
        L4a:
            com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo r8 = (com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo) r8
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient r7 = r8.getF62463a()
            boolean r2 = r7 instanceof com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient.Contact
            if (r2 == 0) goto L57
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient$Contact r7 = (com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient.Contact) r7
            goto L58
        L57:
            r7 = r5
        L58:
            if (r7 == 0) goto L5d
            com.revolut.feature.apm.core.models.recipients.ApmContact r7 = r7.f62299a
            goto L5e
        L5d:
            r7 = r5
        L5e:
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient r2 = r6.j3()
            boolean r4 = r2 instanceof com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient.Contact
            if (r4 == 0) goto L69
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient$Contact r2 = (com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient.Contact) r2
            goto L6a
        L69:
            r2 = r5
        L6a:
            if (r2 == 0) goto L6e
            com.revolut.feature.apm.core.models.recipients.ApmContact r5 = r2.f62299a
        L6e:
            if (r5 == 0) goto L7d
            if (r7 == 0) goto L7d
            r0.u = r8
            r0.f21387x = r3
            java.lang.Object r7 = r6.n3(r5, r7, r0)
            if (r7 != r1) goto L7d
        L7c:
            return r1
        L7d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c52.r.l3(com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3(com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData r10, gim.c r11) {
        /*
            r9 = this;
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData r0 = r9.f21392l
            boolean r1 = r11 instanceof c52.p
            if (r1 == 0) goto L15
            r1 = r11
            c52.p r1 = (c52.p) r1
            int r2 = r1.f21389w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f21389w = r2
            goto L1a
        L15:
            c52.p r1 = new c52.p
            r1.<init>(r9, r11)
        L1a:
            java.lang.Object r11 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f21389w
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L29
            goto L66
        L29:
            r10 = move-exception
            goto L6b
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            yhm.o.b(r11)
            yhm.m$a r11 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L29
            boolean r11 = r0.f62283g     // Catch: java.lang.Throwable -> L29
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection r3 = r0.f62280a     // Catch: java.lang.Throwable -> L29
            boolean r3 = r3 instanceof com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection.Outgoing     // Catch: java.lang.Throwable -> L29
            dj0.d r5 = r10.getF72729b()     // Catch: java.lang.Throwable -> L29
            long r5 = r5.f115082a     // Catch: java.lang.Throwable -> L29
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r6 = 0
            if (r5 <= 0) goto L4d
            r5 = r4
            goto L4e
        L4d:
            r5 = r6
        L4e:
            com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData$PaymentReference r7 = r0.f     // Catch: java.lang.Throwable -> L29
            if (r7 == 0) goto L53
            r6 = r4
        L53:
            if (r11 == 0) goto L66
            if (r3 == 0) goto L66
            if (r5 == 0) goto L66
            if (r6 != 0) goto L66
            com.revolut.feature.apm.core.models.transfers.ApmTransferDestination r11 = r0.d     // Catch: java.lang.Throwable -> L29
            r1.f21389w = r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r10 = r9.k3(r10, r11, r1)     // Catch: java.lang.Throwable -> L29
            if (r10 != r2) goto L66
            return r2
        L66:
            kotlin.Unit r10 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L29
            yhm.m$a r10 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L29
            goto L70
        L6b:
            yhm.m$a r11 = yhm.m.INSTANCE
            yhm.o.a(r10)
        L70:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c52.r.m3(com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
    
        if (((fy1.o) r3).g(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n3(com.revolut.feature.apm.core.models.recipients.ApmContact r7, com.revolut.feature.apm.core.models.recipients.ApmContact r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof c52.q
            if (r0 == 0) goto L13
            r0 = r9
            c52.q r0 = (c52.q) r0
            int r1 = r0.f21391x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21391x = r1
            goto L18
        L13:
            c52.q r0 = new c52.q
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f21391x
            lx1.d r3 = r6.o
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            yhm.o.b(r9)
            goto L9d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            com.revolut.feature.apm.core.models.recipients.ApmContact r8 = r0.u
            yhm.o.b(r9)
            goto L8b
        L3b:
            yhm.o.b(r9)
            com.revolut.feature.apm.core.models.recipients.ApmIdentifier r9 = r7.getF62137a()
            java.lang.String r9 = r9.getF62112a()
            com.revolut.feature.apm.core.models.recipients.ApmIdentifier r2 = r8.getF62137a()
            java.lang.String r2 = r2.getF62112a()
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r9, r2)
            if (r9 == 0) goto L65
            java.lang.String r7 = r7.getD()
            java.lang.String r9 = r8.getD()
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r9)
            if (r7 == 0) goto L65
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L65:
            r0.u = r8
            r0.f21391x = r5
            r7 = r3
            fy1.o r7 = (fy1.o) r7
            cz5.b r7 = r7.f138869b
            java.lang.Class r9 = r8.getClass()
            ky1.a r7 = r7.a(r9)
            if (r7 == 0) goto L86
            java.util.List r9 = zhm.u.c(r8)
            java.lang.Object r7 = r7.b(r9, r0)
            if (r7 != r1) goto L83
            goto L88
        L83:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            goto L88
        L86:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L88:
            if (r7 != r1) goto L8b
            goto L9c
        L8b:
            n02.b r7 = c8g.a.n(r8)
            r8 = 0
            r0.u = r8
            r0.f21391x = r4
            fy1.o r3 = (fy1.o) r3
            java.lang.Object r7 = r3.g(r7, r0)
            if (r7 != r1) goto L9d
        L9c:
            return r1
        L9d:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c52.r.n3(com.revolut.feature.apm.core.models.recipients.ApmContact, com.revolut.feature.apm.core.models.recipients.ApmContact, gim.c):java.lang.Object");
    }

    public final Object o3(gim.c cVar) {
        wsg.n nVar = this.f21398s;
        AccountId.Personal personal = AccountId.Personal.f51414a;
        efm.b bVarP = efm.b.p(nVar.j0(personal), nVar.k0(personal));
        Intrinsics.checkNotNullExpressionValue(bVarP, "mergeArray(...)");
        Object objA = nim.a.a(ue0.e.v(bVarP), cVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }
}
