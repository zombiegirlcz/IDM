package ekf;

import klf.m1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r0 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f127119l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m1 f127120m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gqa.b f127121n;
    public final lra.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n0 f127122p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w0 f127123q;

    public r0(klf.h0 commonDataSource, m1 juniorDataSource, gqa.b pushToCardStatusChecker, lra.d cardOwnersInteractor, n0 sendAgainActionAvailabilityChecker, w0 recipientChecker) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(pushToCardStatusChecker, "pushToCardStatusChecker");
        Intrinsics.checkNotNullParameter(cardOwnersInteractor, "cardOwnersInteractor");
        Intrinsics.checkNotNullParameter(sendAgainActionAvailabilityChecker, "sendAgainActionAvailabilityChecker");
        Intrinsics.checkNotNullParameter(recipientChecker, "recipientChecker");
        this.f127119l = commonDataSource;
        this.f127120m = juniorDataSource;
        this.f127121n = pushToCardStatusChecker;
        this.o = cardOwnersInteractor;
        this.f127122p = sendAgainActionAvailabilityChecker;
        this.f127123q = recipientChecker;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(tof.a3 r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ekf.q0
            if (r0 == 0) goto L13
            r0 = r10
            ekf.q0 r0 = (ekf.q0) r0
            int r1 = r0.f127116x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127116x = r1
            goto L18
        L13:
            ekf.q0 r0 = new ekf.q0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127116x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            tof.a3 r9 = r0.u
            yhm.o.b(r10)
            goto L59
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            yhm.o.b(r10)
            java.lang.String r10 = r9.j0
            if (r10 == 0) goto L8e
            lra.d r2 = r8.o
            efm.r r10 = r2.b(r10)
            vkm.d r10 = rd0.e.b(r10)
            ej9.t r2 = new ej9.t
            r5 = 15
            r2.<init>(r5)
            jhi.b r10 = mo3.a.g(r10, r4, r2, r3)
            r0.u = r9
            r0.f127116x = r3
            java.lang.Object r10 = vkm.q.x(r10, r0)
            if (r10 != r1) goto L59
            return r1
        L59:
            com.revolut.feature.push_to_card.api.data.CardOwner r10 = (com.revolut.feature.push_to_card.api.data.CardOwner) r10
            com.revolut.feature.push_to_card.api.navigation.PushToCardTransferBridgeFeatureConfig$BridgeDestination r0 = new com.revolut.feature.push_to_card.api.navigation.PushToCardTransferBridgeFeatureConfig$BridgeDestination
            com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData$a r1 = com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData.INSTANCE
            com.revolut.feature.transfer.core.models.TransferFlowType$Default r2 = com.revolut.feature.transfer.core.models.TransferFlowType.Default.f92257b
            com.revolut.feature.transfer.core.models.TransferMoneyPocket r3 = new com.revolut.feature.transfer.core.models.TransferMoneyPocket
            tof.o3 r5 = r9.J
            if (r5 == 0) goto L6f
            dj0.d r5 = r5.f272965a
            if (r5 == 0) goto L6f
            dj0.d r4 = r5.a()
        L6f:
            com.revolut.feature.transfer.core.models.SourceAccount$Pocket r5 = new com.revolut.feature.transfer.core.models.SourceAccount$Pocket
            tof.w5 r9 = r9.f272624y
            java.lang.String r6 = r9.f273143a
            io3.l r9 = r9.f273144b
            com.revolut.core.model.account.AccountId$Personal r7 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r5.<init>(r7, r9, r6)
            r3.<init>(r4, r5)
            r9 = 24
            com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData$NewTransfer r9 = com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData.Companion.a(r1, r10, r3, r2, r9)
            r0.<init>(r9)
            r8.A2(r0)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L8e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Required value was null."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ekf.r0.Z2(tof.a3, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (Z2(r7, r6) == r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r6, java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r6 = r8 instanceof ekf.p0
            if (r6 == 0) goto L13
            r6 = r8
            ekf.p0 r6 = (ekf.p0) r6
            int r0 = r6.f127113x
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f127113x = r0
            goto L1a
        L13:
            ekf.p0 r6 = new ekf.p0
            gim.c r8 = (gim.c) r8
            r6.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r6.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f127113x
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L42
            if (r1 == r4) goto L3e
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            yhm.o.b(r8)
            goto La2
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            tof.a3 r7 = r6.u
            yhm.o.b(r8)
            goto L71
        L3e:
            yhm.o.b(r8)
            goto L61
        L42:
            yhm.o.b(r8)
            akf.u1 r8 = akf.v1.Companion
            akf.t1 r1 = akf.t1.SEND_AGAIN_PUSH_TO_CARD
            boolean r7 = a10.b.B(r8, r1, r7)
            if (r7 != 0) goto L52
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L52:
            klf.h0 r7 = r5.f127119l
            kotlinx.coroutines.flow.SharedFlow r7 = r7.d()
            r6.f127113x = r4
            java.lang.Object r8 = vkm.q.x(r7, r6)
            if (r8 != r0) goto L61
            goto La1
        L61:
            r7 = r8
            tof.a3 r7 = (tof.a3) r7
            r6.u = r7
            r6.f127113x = r3
            ekf.w0 r8 = r5.f127123q
            java.lang.Object r8 = r8.a(r7, r6)
            if (r8 != r0) goto L71
            goto La1
        L71:
            ekf.s0 r8 = (ekf.s0) r8
            boolean r1 = r8 instanceof ekf.t0
            r3 = 0
            if (r1 == 0) goto L8f
            com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig r6 = new com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig
            ekf.t0 r8 = (ekf.t0) r8
            com.revolut.shared.feature.suspicious_transaction.api.navigation.SuspiciousRecipientWarningDestination r7 = r8.f127127a
            yhi.b r8 = yhi.b.BOTTOM_DIALOG
            r0 = 12
            r6.<init>(r7, r8, r3, r0)
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.c(r6)
            r5.A2(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L8f:
            ekf.s0$a r1 = ekf.s0.a.f127125a
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r1)
            if (r8 == 0) goto La5
            r6.u = r3
            r6.f127113x = r2
            java.lang.Object r6 = r5.Z2(r7, r6)
            if (r6 != r0) goto La2
        La1:
            return r0
        La2:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        La5:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ekf.r0.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
