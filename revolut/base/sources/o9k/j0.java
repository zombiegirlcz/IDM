package o9k;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import yhm.m;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y f223322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q8k.o f223323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v0 f223324n;
    public final ks0.n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g9k.b f223325p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kbb.c f223326q;

    public j0(y transactionResultProcessingDelegate, q8k.o transferExtension, v0 transferResultExtension, ks0.n scheduleResultProcessingDelegate, g9k.b executionStepListener, kbb.c peerToPeerSubmissionExtraDataProvider) {
        Intrinsics.checkNotNullParameter(transactionResultProcessingDelegate, "transactionResultProcessingDelegate");
        Intrinsics.checkNotNullParameter(transferExtension, "transferExtension");
        Intrinsics.checkNotNullParameter(transferResultExtension, "transferResultExtension");
        Intrinsics.checkNotNullParameter(scheduleResultProcessingDelegate, "scheduleResultProcessingDelegate");
        Intrinsics.checkNotNullParameter(executionStepListener, "executionStepListener");
        Intrinsics.checkNotNullParameter(peerToPeerSubmissionExtraDataProvider, "peerToPeerSubmissionExtraDataProvider");
        this.f223322l = transactionResultProcessingDelegate;
        this.f223323m = transferExtension;
        this.f223324n = transferResultExtension;
        this.o = scheduleResultProcessingDelegate;
        this.f223325p = executionStepListener;
        this.f223326q = peerToPeerSubmissionExtraDataProvider;
    }

    public static final void Z2(j0 j0Var, CancellableContinuation cancellableContinuation, q8k.n nVar) {
        j0Var.getClass();
        if (cancellableContinuation.d()) {
            m.Companion companion = yhm.m.INSTANCE;
            cancellableContinuation.resumeWith(nVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(o9k.j0 r7, com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r8, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r9, qua.p r10, boolean r11, gim.c r12) {
        /*
            r7.getClass()
            boolean r0 = r12 instanceof o9k.i0
            if (r0 == 0) goto L16
            r0 = r12
            o9k.i0 r0 = (o9k.i0) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.B = r1
            goto L1b
        L16:
            o9k.i0 r0 = new o9k.i0
            r0.<init>(r7, r12)
        L1b:
            java.lang.Object r12 = r0.z
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            boolean r8 = r0.f223320y
            q9k.b r9 = r0.f223319x
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r10 = r0.v
            com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r11 = r0.u
            yhm.o.b(r12)
            goto L80
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            boolean r11 = r0.f223320y
            qua.p r10 = r0.f223318w
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r9 = r0.v
            com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r8 = r0.u
            yhm.o.b(r12)
            goto L5f
        L49:
            yhm.o.b(r12)
            kbb.c r12 = r7.f223326q
            r0.u = r8
            r0.v = r9
            r0.f223318w = r10
            r0.f223320y = r11
            r0.B = r4
            java.lang.Object r12 = r12.w(r9, r0)
            if (r12 != r1) goto L5f
            goto L78
        L5f:
            q9k.b r12 = (q9k.b) r12
            q8k.o r2 = r7.f223323m
            r0.u = r8
            r0.v = r9
            r5 = 0
            r0.f223318w = r5
            r0.f223319x = r12
            r0.f223320y = r11
            r0.B = r3
            o9k.t0 r2 = (o9k.t0) r2
            java.lang.Object r10 = r2.e(r8, r9, r10, r0)
            if (r10 != r1) goto L79
        L78:
            return r1
        L79:
            r6 = r11
            r11 = r8
            r8 = r6
            r6 = r10
            r10 = r9
            r9 = r12
            r12 = r6
        L80:
            qua.p r12 = (qua.p) r12
            zm3.a r10 = r10.f102270a
            ks0.n r7 = r7.o
            dj0.d r11 = r11.f102256s
            r7.getClass()
            java.lang.String r7 = "targetMoney"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r7)
            if (r12 != 0) goto L95
            o9k.d r7 = o9k.d.f223299a
            return r7
        L95:
            if (r10 == 0) goto Lb7
            boolean r7 = hx7.q.M(r10)
            if (r7 != r4) goto Lb7
            if (r9 == 0) goto Lb1
            q9k.a r7 = r9.f243916a
            xi0.b r9 = r11.f115083b
            boolean r9 = d8l.d.n(r7, r9)
            if (r9 != 0) goto Lb1
            if (r8 == 0) goto Lb1
            o9k.g r8 = new o9k.g
            r8.<init>(r12, r7)
            return r8
        Lb1:
            o9k.e r7 = new o9k.e
            r7.<init>(r12)
            return r7
        Lb7:
            if (r8 == 0) goto Lbf
            o9k.f r7 = new o9k.f
            r7.<init>(r12)
            return r7
        Lbf:
            o9k.e r7 = new o9k.e
            r7.<init>(r12)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o9k.j0.b3(o9k.j0, com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, qua.p, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ef, code lost:
    
        if (r0 == r9) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r14, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r15, gim.c r16) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o9k.j0.c3(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r17, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r18, boolean r19, boolean r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o9k.j0.d3(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, boolean, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r16, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r17, qua.p r18, boolean r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o9k.j0.e3(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, qua.p, boolean, gim.c):java.lang.Object");
    }
}
