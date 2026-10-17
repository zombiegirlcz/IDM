package e9k;

import j9k.c0;
import j9k.z;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements n5k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f124038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p9k.a f124039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f124040c;

    public g(z flowInteractor, p9k.a transferDataObservable, c0 transferQuoteInteractor) {
        Intrinsics.checkNotNullParameter(flowInteractor, "flowInteractor");
        Intrinsics.checkNotNullParameter(transferDataObservable, "transferDataObservable");
        Intrinsics.checkNotNullParameter(transferQuoteInteractor, "transferQuoteInteractor");
        this.f124038a = flowInteractor;
        this.f124039b = transferDataObservable;
        this.f124040c = transferQuoteInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0214  */
    @Override // n5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r32) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e9k.g.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // n5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof e9k.e
            if (r0 == 0) goto L13
            r0 = r5
            e9k.e r0 = (e9k.e) r0
            int r1 = r0.f124036w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f124036w = r1
            goto L18
        L13:
            e9k.e r0 = new e9k.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f124036w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            p9k.a r5 = r4.f124039b
            ihm.j r5 = r5.f255130a
            r0.f124036w = r3
            java.lang.Object r5 = nim.a.c(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r5 = (com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData) r5
            xi0.b r5 = r5.f102246c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e9k.g.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // n5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof e9k.f
            if (r0 == 0) goto L13
            r0 = r5
            e9k.f r0 = (e9k.f) r0
            int r1 = r0.f124037w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f124037w = r1
            goto L18
        L13:
            e9k.f r0 = new e9k.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f124037w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            p9k.a r5 = r4.f124039b
            ihm.j r5 = r5.f255130a
            r0.f124037w = r3
            java.lang.Object r5 = nim.a.c(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r5 = (com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData) r5
            xi0.b r5 = r5.f102245b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e9k.g.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // n5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof e9k.d
            if (r0 == 0) goto L13
            r0 = r7
            e9k.d r0 = (e9k.d) r0
            int r1 = r0.f124035x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f124035x = r1
            goto L18
        L13:
            e9k.d r0 = new e9k.d
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f124035x
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r7)
            return r7
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r2 = r0.u
            yhm.o.b(r7)
            goto L66
        L3b:
            yhm.o.b(r7)
            goto L4f
        L3f:
            yhm.o.b(r7)
            p9k.a r7 = r6.f124039b
            ihm.j r7 = r7.f255130a
            r0.f124035x = r5
            java.lang.Object r7 = nim.a.c(r7, r0)
            if (r7 != r1) goto L4f
            goto L8d
        L4f:
            r2 = r7
            com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r2 = (com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData) r2
            kotlin.jvm.internal.Intrinsics.h(r2)
            r0.u = r2
            r0.f124035x = r4
            j9k.c0 r7 = r6.f124040c
            kotlinx.coroutines.flow.Flow r7 = r7.a(r2)
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L66
            goto L8d
        L66:
            hrf.c r7 = (hrf.c) r7
            if (r7 == 0) goto L95
            kotlin.jvm.internal.Intrinsics.h(r2)
            r4 = 0
            r0.u = r4
            r0.f124035x = r3
            boolean r3 = r7 instanceof hrf.a
            if (r3 == 0) goto L7f
            hrf.a r7 = (hrf.a) r7
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r7 = r7.f154810a
            java.lang.Object r7 = r6.f(r7, r2, r0)
            goto L8b
        L7f:
            boolean r3 = r7 instanceof hrf.b
            if (r3 == 0) goto L8f
            hrf.b r7 = (hrf.b) r7
            nrf.c r7 = r7.f154811a
            java.lang.Object r7 = r6.g(r7, r2, r0)
        L8b:
            if (r7 != r1) goto L8e
        L8d:
            return r1
        L8e:
            return r7
        L8f:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L95:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "PeerToPeerQuote cannot be null when requiring PaymentBreakdownAction"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e9k.g.d(gim.c):java.lang.Object");
    }

    @Override // n5k.a
    public final Object e(Continuation continuation) {
        throw new IllegalStateException("FeeBreakdownAction Dialog not supported in P2P");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r19, com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e9k.g.f(com.revolut.shared.feature.market_data.models.domain.models.OrderQuote, com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(nrf.c r19, com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r20, gim.c r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = r3 instanceof e9k.a
            if (r4 == 0) goto L1b
            r4 = r3
            e9k.a r4 = (e9k.a) r4
            int r5 = r4.F
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.F = r5
            goto L20
        L1b:
            e9k.a r4 = new e9k.a
            r4.<init>(r0, r3)
        L20:
            java.lang.Object r3 = r4.D
            fim.a r5 = fim.a.COROUTINE_SUSPENDED
            int r6 = r4.F
            r7 = 1
            if (r6 == 0) goto L52
            if (r6 != r7) goto L4a
            boolean r1 = r4.C
            boolean r2 = r4.B
            mga.a0 r5 = r4.A
            n9l.a r6 = r4.z
            dj0.d r7 = r4.f124028y
            dj0.d r8 = r4.f124027x
            dj0.d r9 = r4.f124026w
            com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r10 = r4.v
            nrf.c r4 = r4.u
            yhm.o.b(r3)
            r15 = r5
            r5 = r6
            r6 = r9
            r9 = r1
            r1 = r4
            r4 = r8
            r8 = r2
            r2 = r10
            goto Lb3
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L52:
            yhm.o.b(r3)
            dj0.d r9 = r1.f218624c
            nrf.e r3 = r1.e
            dj0.d r8 = r1.f218623b
            lrf.a r6 = r1.f218622a
            double r13 = r6.f199511a
            dj0.d r6 = r3.f218633a
            n9l.a r10 = new n9l.a
            xi0.b r11 = r9.f115083b
            xi0.b r12 = r8.f115083b
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            r16 = 0
            r17 = 0
            r10.<init>(r11, r12, r13, r15, r16, r17)
            nrf.f r3 = r3.f218634b
            boolean r3 = r3.f218637b
            java.lang.String r11 = r1.f218627j
            r12 = 0
            if (r11 == 0) goto L7f
            java.lang.String r13 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r13)
            goto L80
        L7f:
            r11 = r12
        L80:
            mga.a0 r13 = new mga.a0
            r13.<init>(r11, r12)
            com.revolut.feature.transfer.models.quotes.CreditCardInterest r11 = r1.f218625g
            boolean r11 = cp5.d.c(r11)
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r12 = r2.f102247g
            r4.u = r1
            r4.v = r2
            r4.f124026w = r9
            r4.f124027x = r8
            r4.f124028y = r6
            r4.z = r10
            r4.A = r13
            r4.B = r3
            r4.C = r11
            r4.F = r7
            j9k.z r7 = r0.f124038a
            java.lang.Object r4 = r7.a(r12, r4)
            if (r4 != r5) goto Laa
            return r5
        Laa:
            r5 = r8
            r8 = r3
            r3 = r4
            r4 = r5
            r7 = r6
            r6 = r9
            r5 = r10
            r9 = r11
            r15 = r13
        Lb3:
            r10 = r3
            prf.g r10 = (prf.g) r10
            com.revolut.feature.transfer.core.models.FundingSource r11 = r2.e
            nrf.e r12 = r1.e
            l5k.e r3 = new l5k.e
            r14 = 0
            r16 = 9472(0x2500, float:1.3273E-41)
            r13 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e9k.g.g(nrf.c, com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData, gim.c):java.lang.Object");
    }
}
