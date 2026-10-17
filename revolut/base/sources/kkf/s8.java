package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s8 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184942l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fsf.b f184943m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final csf.b f184944n;

    public s8(klf.h0 commonDataSource, fsf.b transferReasonsCommonUiMapper, csf.b transferReasonsInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transferReasonsCommonUiMapper, "transferReasonsCommonUiMapper");
        Intrinsics.checkNotNullParameter(transferReasonsInteractor, "transferReasonsInteractor");
        this.f184942l = commonDataSource;
        this.f184943m = transferReasonsCommonUiMapper;
        this.f184944n = transferReasonsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof kkf.p8
            if (r0 == 0) goto L13
            r0 = r14
            kkf.p8 r0 = (kkf.p8) r0
            int r1 = r0.f184893y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184893y = r1
            goto L18
        L13:
            kkf.p8 r0 = new kkf.p8
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.f184891w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184893y
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r3) goto L38
            if (r2 != r4) goto L30
            ttf.a r1 = r0.v
            tof.a3 r0 = r0.u
            yhm.o.b(r14)
            r11 = r1
            goto L82
        L30:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L38:
            tof.a3 r2 = r0.u
            yhm.o.b(r14)
            goto L60
        L3e:
            yhm.o.b(r14)
            klf.h0 r14 = r13.f184942l
            tof.a3 r2 = r14.b()
            if (r2 != 0) goto L4a
            goto L87
        L4a:
            kjk.x r6 = new kjk.x
            r7 = 23
            r6.<init>(r7)
            kotlinx.coroutines.flow.Flow r14 = r14.f(r6)
            r0.u = r2
            r0.f184893y = r3
            java.lang.Object r14 = vkm.q.z(r14, r0)
            if (r14 != r1) goto L60
            goto L7e
        L60:
            ttf.a r14 = (ttf.a) r14
            if (r14 != 0) goto L65
            goto L87
        L65:
            java.lang.String r3 = r2.f272581b
            r0.u = r2
            r0.v = r14
            r0.f184893y = r4
            csf.b r4 = r13.f184944n
            tsf.e r4 = (tsf.e) r4
            lsf.d r4 = r4.f274126a
            com.revolut.feature.transfer_reasons.models.interactor.TransferReasonsRequest$ForTransaction r6 = new com.revolut.feature.transfer_reasons.models.interactor.TransferReasonsRequest$ForTransaction
            r6.<init>(r3, r5)
            java.lang.Object r0 = r4.b(r6, r0)
            if (r0 != r1) goto L7f
        L7e:
            return r1
        L7f:
            r11 = r14
            r14 = r0
            r0 = r2
        L82:
            r8 = r14
            com.revolut.feature.transfer_reasons.models.reason.TransferReasons r8 = (com.revolut.feature.transfer_reasons.models.reason.TransferReasons) r8
            if (r8 != 0) goto L88
        L87:
            return r5
        L88:
            tof.o3 r14 = r0.J
            if (r14 == 0) goto L90
            dj0.d r14 = r14.f272965a
            if (r14 != 0) goto L92
        L90:
            dj0.d r14 = r0.N1
        L92:
            dj0.d r7 = r14.a()
            tof.w5 r14 = r0.f272624y
            java.lang.String r9 = r14.f273143a
            java.lang.String r10 = r0.f272581b
            com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData$EditFromTransaction r6 = new com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData$EditFromTransaction
            com.revolut.feature.transfer_reasons.models.interactor.TransferReasonsRequest$ForTransaction r12 = new com.revolut.feature.transfer_reasons.models.interactor.TransferReasonsRequest$ForTransaction
            r12.<init>(r10, r5)
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.s8.Z2(gim.c):java.lang.Object");
    }

    public final cmf.p b3() {
        return new cmf.p(new z7(this.f184942l.f(new kjk.x(24)), this, 5), new chc.c0(23), zhm.u.c(this), "TransferReasonCatalogue");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r4, java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof kkf.r8
            if (r4 == 0) goto L13
            r4 = r6
            kkf.r8 r4 = (kkf.r8) r4
            int r0 = r4.f184922w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f184922w = r0
            goto L1a
        L13:
            kkf.r8 r4 = new kkf.r8
            gim.c r6 = (gim.c) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f184922w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            java.lang.String r6 = "TRANSFER_REASONS_CATALOGUE_ROW_ID"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r5 != 0) goto L3f
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L3f:
            r4.f184922w = r2
            java.lang.Object r6 = r3.Z2(r4)
            if (r6 != r0) goto L48
            return r0
        L48:
            if (r6 == 0) goto L5d
            com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData$EditFromTransaction r6 = (com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData.EditFromTransaction) r6
            com.revolut.feature.transfer_reasons.api.navigation.b r4 = new com.revolut.feature.transfer_reasons.api.navigation.b
            r4.<init>(r6)
            com.revolut.kompot.navigable.vc.ViewController r4 = r3.o2(r4)
            r5 = 3
            r6 = 0
            yji.n.P2(r3, r4, r6, r6, r5)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L5d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Unable to create transfer reasons input data"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.s8.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
