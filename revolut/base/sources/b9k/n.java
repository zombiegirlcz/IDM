package b9k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rp0.g1;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends q8k.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t99.k f13832l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ang.f f13833m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g1 f13834n;
    public final zrc.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hsc.c f13835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f13836q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xdk.g f13837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i5k.d f13838s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final osf.g f13839t;

    public n(t99.k exchangeGlobalAccessFlowProvider, ang.f userInteractor, g1 shotDialogDisplayer, zrc.d cryptoScaInteractor, hsc.c cryptoScaPromptShotDialogProvider, t reviewRequirementResolver, xdk.g pocketExtension, i5k.d appFraudCheckExtension, osf.g transferReasonLauncherExtension) {
        Intrinsics.checkNotNullParameter(exchangeGlobalAccessFlowProvider, "exchangeGlobalAccessFlowProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(cryptoScaInteractor, "cryptoScaInteractor");
        Intrinsics.checkNotNullParameter(cryptoScaPromptShotDialogProvider, "cryptoScaPromptShotDialogProvider");
        Intrinsics.checkNotNullParameter(reviewRequirementResolver, "reviewRequirementResolver");
        Intrinsics.checkNotNullParameter(pocketExtension, "pocketExtension");
        Intrinsics.checkNotNullParameter(appFraudCheckExtension, "appFraudCheckExtension");
        Intrinsics.checkNotNullParameter(transferReasonLauncherExtension, "transferReasonLauncherExtension");
        this.f13832l = exchangeGlobalAccessFlowProvider;
        this.f13833m = userInteractor;
        this.f13834n = shotDialogDisplayer;
        this.o = cryptoScaInteractor;
        this.f13835p = cryptoScaPromptShotDialogProvider;
        this.f13836q = reviewRequirementResolver;
        this.f13837r = pocketExtension;
        this.f13838s = appFraudCheckExtension;
        this.f13839t = transferReasonLauncherExtension;
    }

    @Override // yji.n
    public final void D2() {
        w2(this.f13837r, null);
        w2(this.f13838s, null);
        w2(this.f13839t, null);
    }

    @Override // yji.n
    public final void E2() {
        m2(this.f13839t);
        m2(this.f13838s);
        m2(this.f13837r);
    }

    @Override // q8k.f
    public final Object Z2(PeerToPeerTransferData peerToPeerTransferData, PeerToPeerRecipient peerToPeerRecipient, gim.c cVar, hrf.c cVar2, hrf.f fVar, boolean z, boolean z3) {
        int i = g.f13820a[fVar.ordinal()];
        if (i == 1) {
            return d3(peerToPeerTransferData, peerToPeerRecipient, cVar, cVar2, fVar, z, z3);
        }
        if (i == 2) {
            return c3(peerToPeerTransferData, cVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof b9k.h
            if (r0 == 0) goto L13
            r0 = r9
            b9k.h r0 = (b9k.h) r0
            int r1 = r0.f13822x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13822x = r1
            goto L18
        L13:
            b9k.h r0 = new b9k.h
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f13822x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r8 = r0.u
            yhm.o.b(r9)
            goto L99
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r8 = r0.u
            yhm.o.b(r9)
            goto L4a
        L3a:
            yhm.o.b(r9)
            xi0.b r9 = r8.f102245b
            r0.u = r8
            r0.f13822x = r4
            java.lang.Object r9 = r7.e3(r9, r0)
            if (r9 != r1) goto L4a
            goto L98
        L4a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L58
            q8k.b r9 = new q8k.b
            r9.<init>(r8)
            return r9
        L58:
            r0.u = r8
            r0.f13822x = r3
            skm.l r9 = new skm.l
            kotlin.coroutines.Continuation r2 = fim.h.b(r0)
            r9.<init>(r4, r2)
            r9.u()
            grl.k9 r2 = frl.a.f137500l
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r3 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r3 = "value"
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r2 = com.google.android.gms.internal.mlkit_vision_face.a.h(r2, r3, r2)
            r3 = 3
            t99.k r5 = r7.f13832l
            r6 = 0
            com.revolut.feature.onboarding.impl.exchange_global_access.flow.ExchangeGlobalAccessFlow r2 = t99.k.b(r5, r6, r2, r3)
            b9k.k r3 = new b9k.k
            r5 = 0
            r3.<init>(r9, r5)
            r2.l2(r3)
            b9k.l r3 = new b9k.l
            r3.<init>(r9, r5)
            yji.n.S2(r7, r2, r3, r4)
            java.lang.Object r9 = r9.t()
            if (r9 != r1) goto L96
            java.lang.String r2 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
        L96:
            if (r9 != r1) goto L99
        L98:
            return r1
        L99:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto La7
            q8k.b r9 = new q8k.b
            r9.<init>(r8)
            return r9
        La7:
            q8k.a r8 = q8k.a.f243142a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b9k.n.c3(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0217, code lost:
    
        if (f3(r10, r6) != r4) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r32, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r33, gim.c r34, hrf.c r35, hrf.f r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b9k.n.d3(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, gim.c, hrf.c, hrf.f, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(xi0.b r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof b9k.j
            if (r0 == 0) goto L13
            r0 = r6
            b9k.j r0 = (b9k.j) r0
            int r1 = r0.f13826w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13826w = r1
            goto L18
        L13:
            b9k.j r0 = new b9k.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f13826w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L52
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            xi0.a r6 = xi0.b.Companion
            r6.getClass()
            xi0.b r6 = xi0.b.z
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r5 == 0) goto L42
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L42:
            ang.f r5 = r4.f13833m
            r6 = 0
            efm.d0 r5 = r5.f(r6)
            r0.f13826w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            do3.n r6 = (do3.n) r6
            boolean r5 = te0.w.V(r6)
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b9k.n.e3(xi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        if (r7 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof b9k.m
            if (r0 == 0) goto L13
            r0 = r8
            b9k.m r0 = (b9k.m) r0
            int r1 = r0.f13831w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13831w = r1
            goto L18
        L13:
            b9k.m r0 = new b9k.m
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f13831w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            goto La1
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            goto L5d
        L37:
            yhm.o.b(r8)
            xi0.b r8 = r7.f102246c
            xi0.b r7 = r7.f102245b
            r0.f13831w = r4
            zrc.d r2 = r6.o
            r2.getClass()
            boolean r8 = cp5.d.A(r8)
            if (r8 == 0) goto L57
            boolean r7 = cp5.d.z(r7)
            if (r7 == 0) goto L57
            java.lang.Object r7 = r2.c(r0)
        L55:
            r8 = r7
            goto L5a
        L57:
            vrc.e r7 = vrc.e.f291574a
            goto L55
        L5a:
            if (r8 != r1) goto L5d
            goto La0
        L5d:
            vrc.g r8 = (vrc.g) r8
            boolean r7 = r8 instanceof vrc.f
            if (r7 == 0) goto La4
            vrc.f r8 = (vrc.f) r8
            r0.f13831w = r3
            skm.l r7 = new skm.l
            kotlin.coroutines.Continuation r2 = fim.h.b(r0)
            r7.<init>(r4, r2)
            r7.u()
            wrc.a r2 = new wrc.a
            java.lang.String r8 = r8.f291575a
            r3 = 14
            r5 = 0
            r2.<init>(r8, r5, r3)
            com.revolut.kompot.navigable.vc.ViewController r8 = r6.o2(r2)
            b9k.k r2 = new b9k.k
            r3 = 1
            r2.<init>(r7, r3)
            r8.l2(r2)
            a26.s r2 = new a26.s
            r3 = 7
            r2.<init>(r6, r7, r3)
            yji.n.P2(r6, r8, r5, r2, r4)
            java.lang.Object r7 = r7.t()
            if (r7 != r1) goto L9e
            java.lang.String r8 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r8)
        L9e:
            if (r7 != r1) goto La1
        La0:
            return r1
        La1:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        La4:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b9k.n.f3(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData, gim.c):java.lang.Object");
    }
}
