package k9k;

import b9k.n;
import j9k.c0;
import kotlin.jvm.internal.Intrinsics;
import q8k.r;
import r9k.k;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends r {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f182355l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c0 f182356m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k f182357n;
    public final n o;

    public e(b transferDataBuilder, c0 quoteInteractor, k errorStateProvider, n checksExtension) {
        Intrinsics.checkNotNullParameter(transferDataBuilder, "transferDataBuilder");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(errorStateProvider, "errorStateProvider");
        Intrinsics.checkNotNullParameter(checksExtension, "checksExtension");
        this.f182355l = transferDataBuilder;
        this.f182356m = quoteInteractor;
        this.f182357n = errorStateProvider;
        this.o = checksExtension;
    }

    @Override // yji.n
    public final void D2() {
        w2(this.o, null);
    }

    @Override // yji.n
    public final void E2() {
        m2(this.o);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // q8k.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(q8k.q r28, gim.c r29) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k9k.e.Z2(q8k.q, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof k9k.d
            if (r0 == 0) goto L14
            r0 = r13
            k9k.d r0 = (k9k.d) r0
            int r1 = r0.f182354x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f182354x = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            k9k.d r0 = new k9k.d
            r0.<init>(r11, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f182354x
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r12 = r7.u
            yhm.o.b(r13)
            goto L6a
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r12 = r7.u
            yhm.o.b(r13)
        L3b:
            r3 = r12
            goto L51
        L3d:
            yhm.o.b(r13)
            r7.u = r12
            r7.f182354x = r3
            j9k.c0 r13 = r11.f182356m
            kotlinx.coroutines.flow.Flow r13 = r13.a(r12)
            java.lang.Object r13 = vkm.q.x(r13, r7)
            if (r13 != r0) goto L3b
            goto L68
        L51:
            r5 = r13
            hrf.c r5 = (hrf.c) r5
            r12 = r2
            hrf.f r2 = r3.f102248h
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r4 = r3.f102247g
            r7.u = r3
            r7.f182354x = r12
            b9k.n r1 = r11.o
            r6 = 0
            r8 = 16
            java.lang.Object r13 = q8k.f.b3(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r13 != r0) goto L69
        L68:
            return r0
        L69:
            r12 = r3
        L6a:
            q8k.d r13 = (q8k.d) r13
            boolean r0 = r13 instanceof q8k.b
            if (r0 == 0) goto L76
            q8k.b r13 = (q8k.b) r13
            com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r13 = r13.f243143a
        L74:
            r10 = r13
            goto L7f
        L76:
            boolean r0 = r13 instanceof q8k.c
            if (r0 == 0) goto L99
            q8k.c r13 = (q8k.c) r13
            com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r13 = r13.f243144a
            goto L74
        L7f:
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData$ReviewOnly r0 = new com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData$ReviewOnly
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r1 = r12.f102247g
            hrf.f r2 = r12.f102248h
            com.revolut.feature.transfer.core.models.TransferFlowType$Default r3 = com.revolut.feature.transfer.core.models.TransferFlowType.Default.f92257b
            m1l.a r4 = m1l.a.SCHEDULE_DISABLED
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.LaunchMode$AsController r7 = new com.revolut.retail.feature.payments.peer_to_peer.api.navigation.LaunchMode$AsController
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.a r12 = com.revolut.retail.feature.payments.peer_to_peer.api.navigation.a.SILENT_COMPLETION
            r7.<init>(r12)
            r8 = 0
            zhm.h0 r9 = zhm.h0.f322473a
            r5 = 0
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L99:
            q8k.a r12 = q8k.a.f243142a
            boolean r12 = kotlin.jvm.internal.Intrinsics.f(r13, r12)
            if (r12 == 0) goto La9
            java.util.concurrent.CancellationException r12 = new java.util.concurrent.CancellationException
            java.lang.String r13 = "P2P transfer launch was cancelled by a submit check"
            r12.<init>(r13)
            throw r12
        La9:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: k9k.e.b3(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData, gim.c):java.lang.Object");
    }
}
