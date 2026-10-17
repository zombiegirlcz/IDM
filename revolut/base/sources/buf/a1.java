package buf;

import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.ManualTransferContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a1 extends jki.g implements k {
    public final n60.a A;
    public final rr9.d B;
    public final n C;
    public final auf.a D;
    public final s5k.a E;
    public final c F;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f18772p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.a f18773q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r10.q f18774r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final luf.a f18775s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final duf.b f18776t;
    public final zof.f u;
    public final kuf.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final kuf.e f18777w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final xdk.b f18778x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n5k.b f18779y;
    public final j60.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(t router, com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.a interactor, r10.q validator, luf.a transferDataObserver, duf.b balancesFilterInteractor, zof.f transferFeatureScreensProvider, kuf.d transferExtension, kuf.e transferResultExtension, xdk.b pocketExtension, n5k.b paymentFeesDialogExtension, j60.a bottomDialogExtension, n60.a keyboardExtension, rr9.d settlementInteractor, n footerDisclaimerProvider, auf.a markAsPaidBottomSheetDataProvider, s5k.a transferWalletLimitsExtension, jki.p stateMapper, ManualTransferContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(transferDataObserver, "transferDataObserver");
        Intrinsics.checkNotNullParameter(balancesFilterInteractor, "balancesFilterInteractor");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(transferExtension, "transferExtension");
        Intrinsics.checkNotNullParameter(transferResultExtension, "transferResultExtension");
        Intrinsics.checkNotNullParameter(pocketExtension, "pocketExtension");
        Intrinsics.checkNotNullParameter(paymentFeesDialogExtension, "paymentFeesDialogExtension");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        Intrinsics.checkNotNullParameter(settlementInteractor, "settlementInteractor");
        Intrinsics.checkNotNullParameter(footerDisclaimerProvider, "footerDisclaimerProvider");
        Intrinsics.checkNotNullParameter(markAsPaidBottomSheetDataProvider, "markAsPaidBottomSheetDataProvider");
        Intrinsics.checkNotNullParameter(transferWalletLimitsExtension, "transferWalletLimitsExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f18772p = router;
        this.f18773q = interactor;
        this.f18774r = validator;
        this.f18775s = transferDataObserver;
        this.f18776t = balancesFilterInteractor;
        this.u = transferFeatureScreensProvider;
        this.v = transferExtension;
        this.f18777w = transferResultExtension;
        this.f18778x = pocketExtension;
        this.f18779y = paymentFeesDialogExtension;
        this.z = bottomDialogExtension;
        this.A = keyboardExtension;
        this.B = settlementInteractor;
        this.C = footerDisclaimerProvider;
        this.D = markAsPaidBottomSheetDataProvider;
        this.E = transferWalletLimitsExtension;
        TransferRequestApprovalData f92462a = inputData.getF92462a();
        zhm.f0 f0Var = zhm.f0.f322471a;
        this.F = new c(f92462a, null, new d(null, new hrf.h(f0Var, f0Var, null), null), new b(e.DISABLED, e.HIDDEN), null, null, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(buf.a1 r8, com.revolut.domain.models.moneyrequest.MoneyRequest r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof buf.c0
            if (r0 == 0) goto L13
            r0 = r10
            buf.c0 r0 = (buf.c0) r0
            int r1 = r0.f18789x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18789x = r1
            goto L18
        L13:
            buf.c0 r0 = new buf.c0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f18789x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            com.revolut.domain.models.moneyrequest.MoneyRequest r9 = r0.u
            yhm.o.b(r10)
            goto L68
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            com.revolut.domain.models.moneyrequest.MoneyRequest r9 = r0.u
            yhm.o.b(r10)
            goto L55
        L3b:
            yhm.o.b(r10)
            com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData r10 = r8.C2()
            xdk.b r2 = r8.f18778x
            com.revolut.core.model.account.AccountId r6 = r10.f92456b
            xi0.b r7 = r10.f
            com.revolut.feature.transfer.core.models.FundingSource r10 = r10.f92455a
            r0.u = r9
            r0.f18789x = r5
            java.lang.Object r10 = r2.Z2(r6, r7, r10, r0)
            if (r10 != r1) goto L55
            goto L67
        L55:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L72
            r0.u = r9
            r0.f18789x = r4
            java.lang.Object r10 = r8.D2(r9, r0)
            if (r10 != r1) goto L68
        L67:
            return r1
        L68:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L72
            r10 = r5
            goto L73
        L72:
            r10 = r3
        L73:
            if (r10 == 0) goto L8d
            jki.i r10 = r8.t2()
            buf.c r10 = (buf.c) r10
            boolean r10 = r10.f18787g
            if (r10 == 0) goto L8c
            buf.h r10 = new buf.h
            com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData r0 = r8.C2()
            r10.<init>(r9, r0)
            r8.v2(r10)
            goto L8d
        L8c:
            r3 = r5
        L8d:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: buf.a1.y2(buf.a1, com.revolut.domain.models.moneyrequest.MoneyRequest, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z2(buf.a1 r17, com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData.GroupBillsApproval r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: buf.a1.z2(buf.a1, com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData$GroupBillsApproval, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A2(com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData.GroupBillsApproval r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof buf.h0
            if (r0 == 0) goto L14
            r0 = r10
            buf.h0 r0 = (buf.h0) r0
            int r1 = r0.f18806w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f18806w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            buf.h0 r0 = new buf.h0
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f18806w
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            yhm.o.b(r10)
            r1 = r8
            goto L4e
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            yhm.o.b(r10)
            a3b.i r4 = new a3b.i
            r10 = 2
            r4.<init>(r8, r9, r10)
            buf.j0 r5 = new buf.j0
            r10 = 0
            r5.<init>(r8, r9, r10)
            r6.f18806w = r2
            r2 = 0
            r3 = 0
            r7 = 2
            r1 = r8
            java.lang.Object r10 = n14.k.Q(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L4e
            return r0
        L4e:
            nii.e r10 = (nii.e) r10
            boolean r9 = r10 instanceof nii.c
            kuf.e r0 = r1.f18777w
            if (r9 == 0) goto L66
            nii.c r10 = (nii.c) r10
            nii.n1 r9 = r10.f216124b
            buf.b0 r10 = new buf.b0
            r2 = 2
            r10.<init>(r8, r2)
            kuf.f r0 = (kuf.f) r0
            r0.Z2(r9, r10)
            goto L7b
        L66:
            boolean r9 = r10 instanceof nii.d
            if (r9 == 0) goto L7e
            nii.d r10 = (nii.d) r10
            nii.n1 r9 = r10.f216134b
            if (r9 == 0) goto L7b
            buf.b0 r10 = new buf.b0
            r2 = 3
            r10.<init>(r8, r2)
            kuf.f r0 = (kuf.f) r0
            r0.b3(r9, r10)
        L7b:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L7e:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: buf.a1.A2(com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData$GroupBillsApproval, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B2(com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData.MoneyRequestApproval r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof buf.k0
            if (r0 == 0) goto L14
            r0 = r10
            buf.k0 r0 = (buf.k0) r0
            int r1 = r0.f18810w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f18810w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            buf.k0 r0 = new buf.k0
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f18810w
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            yhm.o.b(r10)
            r1 = r8
            goto L4e
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            yhm.o.b(r10)
            a3b.i r4 = new a3b.i
            r10 = 1
            r4.<init>(r8, r9, r10)
            buf.l0 r5 = new buf.l0
            r10 = 0
            r5.<init>(r8, r9, r10)
            r6.f18810w = r2
            r2 = 0
            r3 = 0
            r7 = 2
            r1 = r8
            java.lang.Object r10 = n14.k.Q(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L4e
            return r0
        L4e:
            nii.e r10 = (nii.e) r10
            boolean r9 = r10 instanceof nii.c
            kuf.e r0 = r1.f18777w
            if (r9 == 0) goto L66
            nii.c r10 = (nii.c) r10
            nii.n1 r9 = r10.f216124b
            buf.b0 r10 = new buf.b0
            r2 = 1
            r10.<init>(r8, r2)
            kuf.f r0 = (kuf.f) r0
            r0.Z2(r9, r10)
            goto L82
        L66:
            boolean r9 = r10 instanceof nii.d
            if (r9 == 0) goto L85
            nii.d r10 = (nii.d) r10
            nii.n1 r9 = r10.f216134b
            java.lang.Object r10 = r10.f216133a
            if (r9 == 0) goto L82
            if (r10 == 0) goto L82
            k71.i r10 = (k71.i) r10
            bnj.n r2 = new bnj.n
            r3 = 24
            r2.<init>(r8, r10, r3)
            kuf.f r0 = (kuf.f) r0
            r0.b3(r9, r2)
        L82:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L85:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: buf.a1.B2(com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData$MoneyRequestApproval, gim.c):java.lang.Object");
    }

    public final ManualTransferData C2() {
        ManualTransferData manualTransferData = ((c) t2()).f18785b;
        if (manualTransferData != null) {
            return manualTransferData;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        if (r15 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D2(com.revolut.domain.models.moneyrequest.MoneyRequest r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: buf.a1.D2(com.revolut.domain.models.moneyrequest.MoneyRequest, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        int i = 26;
        l2(new e0(this, continuation, 1), new yi5.b(i));
        l2(new e0(this, continuation, 0), new yi5.b(i));
        yji.l.a1(this, vkm.q.H(new a2c.c(2, 18, continuation), vkm.q.q(new bbk.z(q2(), 14))), null, null, new w0(this, continuation, 0), 3);
        yji.l.a1(this, vkm.q.H(new btk.j(this, continuation, 2), vkm.q.q(new bbk.z(q2(), 16))), null, null, new w0(this, continuation, 2), 3);
        yji.l.a1(this, vkm.q.Q(vkm.q.q(new bbk.z(q2(), 15)), new a67.c(continuation, this, 5)), null, null, new w0(this, continuation, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.F;
    }
}
