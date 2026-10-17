package ekf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f127084l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m0 f127085m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y f127086n;
    public final cl3.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k38.c f127087p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q8k.g f127088q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mjf.u f127089r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w0 f127090s;

    public i0(klf.h0 commonDataSource, m0 p2pDataProvider, y p2pActionsMapper, cl3.a contactsInteractor, k38.c jointAccountsInteractor, q8k.g peerToPeerFeatureConfigProvider, mjf.u recallableInteractor, w0 recipientChecker) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(p2pDataProvider, "p2pDataProvider");
        Intrinsics.checkNotNullParameter(p2pActionsMapper, "p2pActionsMapper");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(peerToPeerFeatureConfigProvider, "peerToPeerFeatureConfigProvider");
        Intrinsics.checkNotNullParameter(recallableInteractor, "recallableInteractor");
        Intrinsics.checkNotNullParameter(recipientChecker, "recipientChecker");
        this.f127084l = commonDataSource;
        this.f127085m = p2pDataProvider;
        this.f127086n = p2pActionsMapper;
        this.o = contactsInteractor;
        this.f127087p = jointAccountsInteractor;
        this.f127088q = peerToPeerFeatureConfigProvider;
        this.f127089r = recallableInteractor;
        this.f127090s = recipientChecker;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(ekf.i0 r25, tof.a3 r26, kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ekf.i0.Z2(ekf.i0, tof.a3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(ekf.i0 r14, tof.a3 r15, kotlin.coroutines.Continuation r16) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ekf.i0.b3(ekf.i0, tof.a3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (g3(r7) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (e3(r7) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if (f3(r7) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        if (d3(r7) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r7, java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r7 = r9 instanceof ekf.b0
            if (r7 == 0) goto L13
            r7 = r9
            ekf.b0 r7 = (ekf.b0) r7
            int r0 = r7.f127048w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.f127048w = r0
            goto L1a
        L13:
            ekf.b0 r7 = new ekf.b0
            gim.c r9 = (gim.c) r9
            r7.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r7.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f127048w
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L3b
            if (r1 == r5) goto L37
            if (r1 == r4) goto L37
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            goto L37
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            yhm.o.b(r9)
            goto L90
        L3b:
            yhm.o.b(r9)
            akf.u1 r9 = akf.v1.Companion
            akf.t1 r1 = akf.t1.SEND_AGAIN_P2P
            boolean r9 = a10.b.B(r9, r1, r8)
            if (r9 == 0) goto L51
            r7.f127048w = r5
            java.lang.Object r7 = r6.g3(r7)
            if (r7 != r0) goto L90
            goto L8f
        L51:
            akf.t1 r9 = akf.t1.REQUEST
            java.lang.String r9 = akf.u1.a(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r8, r9)
            if (r9 == 0) goto L66
            r7.f127048w = r4
            java.lang.Object r7 = r6.e3(r7)
            if (r7 != r0) goto L90
            goto L8f
        L66:
            akf.t1 r9 = akf.t1.RECURRING
            java.lang.String r9 = akf.u1.a(r9)
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r8, r9)
            if (r9 == 0) goto L7b
            r7.f127048w = r3
            java.lang.Object r7 = r6.f3(r7)
            if (r7 != r0) goto L90
            goto L8f
        L7b:
            akf.t1 r9 = akf.t1.RECALL
            java.lang.String r9 = akf.u1.a(r9)
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r9)
            if (r8 == 0) goto L93
            r7.f127048w = r2
            java.lang.Object r7 = r6.d3(r7)
            if (r7 != r0) goto L90
        L8f:
            return r0
        L90:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L93:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ekf.i0.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        if (r7.invoke(r6, r0) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(tof.a3 r6, kotlin.jvm.functions.Function2 r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ekf.z
            if (r0 == 0) goto L13
            r0 = r8
            ekf.z r0 = (ekf.z) r0
            int r1 = r0.f127146y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127146y = r1
            goto L18
        L13:
            ekf.z r0 = new ekf.z
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f127144w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127146y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L85
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.jvm.internal.q r6 = r0.v
            r7 = r6
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            tof.a3 r6 = r0.u
            yhm.o.b(r8)
            goto L52
        L3d:
            yhm.o.b(r8)
            r0.u = r6
            r8 = r7
            kotlin.jvm.internal.q r8 = (kotlin.jvm.internal.q) r8
            r0.v = r8
            r0.f127146y = r4
            ekf.w0 r8 = r5.f127090s
            java.lang.Object r8 = r8.a(r6, r0)
            if (r8 != r1) goto L52
            goto L84
        L52:
            ekf.s0 r8 = (ekf.s0) r8
            boolean r2 = r8 instanceof ekf.t0
            r4 = 0
            if (r2 == 0) goto L70
            com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig r6 = new com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig
            ekf.t0 r8 = (ekf.t0) r8
            com.revolut.shared.feature.suspicious_transaction.api.navigation.SuspiciousRecipientWarningDestination r7 = r8.f127127a
            yhi.b r8 = yhi.b.BOTTOM_DIALOG
            r0 = 12
            r6.<init>(r7, r8, r4, r0)
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.c(r6)
            r5.A2(r6)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L70:
            ekf.s0$a r2 = ekf.s0.a.f127125a
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r2)
            if (r8 == 0) goto L88
            r0.u = r4
            r0.v = r4
            r0.f127146y = r3
            java.lang.Object r6 = r7.invoke(r6, r0)
            if (r6 != r1) goto L85
        L84:
            return r1
        L85:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L88:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ekf.i0.c3(tof.a3, kotlin.jvm.functions.Function2, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (nim.a.a(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ekf.c0
            if (r0 == 0) goto L13
            r0 = r6
            ekf.c0 r0 = (ekf.c0) r0
            int r1 = r0.f127053w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127053w = r1
            goto L18
        L13:
            ekf.c0 r0 = new ekf.c0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127053w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L5b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L48
        L36:
            yhm.o.b(r6)
            klf.h0 r6 = r5.f127084l
            kotlinx.coroutines.flow.SharedFlow r6 = r6.d()
            r0.f127053w = r4
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L48
            goto L5a
        L48:
            tof.a3 r6 = (tof.a3) r6
            mjf.u r2 = r5.f127089r
            java.lang.String r6 = r6.f272581b
            pfm.r r6 = r2.a(r6)
            r0.f127053w = r3
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ekf.i0.d3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(gim.c r18) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ekf.i0.e3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (c3((tof.a3) r13, r4, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(gim.c r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof ekf.e0
            if (r0 == 0) goto L13
            r0 = r13
            ekf.e0 r0 = (ekf.e0) r0
            int r1 = r0.f127067w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127067w = r1
            goto L18
        L13:
            ekf.e0 r0 = new ekf.e0
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127067w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r13)
            r6 = r12
            goto L65
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L33:
            yhm.o.b(r13)
            goto L4a
        L37:
            yhm.o.b(r13)
            klf.h0 r13 = r12.f127084l
            kotlinx.coroutines.flow.SharedFlow r13 = r13.d()
            r0.f127067w = r4
            java.lang.Object r13 = vkm.q.x(r13, r0)
            if (r13 != r1) goto L4a
            r6 = r12
            goto L64
        L4a:
            tof.a3 r13 = (tof.a3) r13
            a97.i r4 = new a97.i
            r10 = 0
            r11 = 25
            r5 = 2
            java.lang.Class<ekf.i0> r7 = ekf.i0.class
            java.lang.String r8 = "openScheduledTransfer"
            java.lang.String r9 = "openScheduledTransfer(Lcom/revolut/feature/transactions/models/Transaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r6 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.f127067w = r3
            java.lang.Object r13 = r12.c3(r13, r4, r0)
            if (r13 != r1) goto L65
        L64:
            return r1
        L65:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ekf.i0.f3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (c3((tof.a3) r13, r4, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g3(gim.c r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof ekf.f0
            if (r0 == 0) goto L13
            r0 = r13
            ekf.f0 r0 = (ekf.f0) r0
            int r1 = r0.f127076w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127076w = r1
            goto L18
        L13:
            ekf.f0 r0 = new ekf.f0
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127076w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r13)
            r6 = r12
            goto L65
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L33:
            yhm.o.b(r13)
            goto L4a
        L37:
            yhm.o.b(r13)
            klf.h0 r13 = r12.f127084l
            kotlinx.coroutines.flow.SharedFlow r13 = r13.d()
            r0.f127076w = r4
            java.lang.Object r13 = vkm.q.x(r13, r0)
            if (r13 != r1) goto L4a
            r6 = r12
            goto L64
        L4a:
            tof.a3 r13 = (tof.a3) r13
            a97.i r4 = new a97.i
            r10 = 0
            r11 = 26
            r5 = 2
            java.lang.Class<ekf.i0> r7 = ekf.i0.class
            java.lang.String r8 = "openTransfer"
            java.lang.String r9 = "openTransfer(Lcom/revolut/feature/transactions/models/Transaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r6 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.f127076w = r3
            java.lang.Object r13 = r12.c3(r13, r4, r0)
            if (r13 != r1) goto L65
        L64:
            return r1
        L65:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ekf.i0.g3(gim.c):java.lang.Object");
    }
}
