package o9k;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t0 implements q8k.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x8k.c f223360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cl3.a f223361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vv9.c f223362c;
    public final k61.a d;
    public final bqf.d e;
    public final ang.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wsg.n f223363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z80.b f223364h;
    public final eli.j i;

    public t0(x8k.c p2pTransferInteractor, cl3.a contactsInteractor, vv9.c moneyRequestInteractor, k61.a transferInteractor, bqf.d trustInteractor, ang.f userInteractor, wsg.n walletInteractor, z80.b phoneToolsProvider, eli.j twoFaErrorHandler) {
        Intrinsics.checkNotNullParameter(p2pTransferInteractor, "p2pTransferInteractor");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(moneyRequestInteractor, "moneyRequestInteractor");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(trustInteractor, "trustInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        this.f223360a = p2pTransferInteractor;
        this.f223361b = contactsInteractor;
        this.f223362c = moneyRequestInteractor;
        this.d = transferInteractor;
        this.e = trustInteractor;
        this.f = userInteractor;
        this.f223363g = walletInteractor;
        this.f223364h = phoneToolsProvider;
        this.i = twoFaErrorHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.transfer.models.transfer.TransferTrustData r13, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r14, gim.c r15) throws java.lang.Exception {
        /*
            r12 = this;
            boolean r0 = r15 instanceof o9k.l0
            if (r0 == 0) goto L13
            r0 = r15
            o9k.l0 r0 = (o9k.l0) r0
            int r1 = r0.f223335y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f223335y = r1
            goto L18
        L13:
            o9k.l0 r0 = new o9k.l0
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f223333w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f223335y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            iy9.d r13 = r0.v
            com.revolut.feature.transfer.models.transfer.TransferTrustData r14 = r0.u
            yhm.o.b(r15)     // Catch: java.lang.Exception -> L2f
            r6 = r12
            r8 = r13
            r13 = r14
            goto L93
        L2f:
            r0 = move-exception
            r15 = r0
            r6 = r12
            r9 = r14
            goto La2
        L35:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3d:
            yhm.o.b(r15)
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r15 = r13.f92305b
            boolean r15 = com.revolut.feature.transfer.models.transfer.a.a(r15)
            if (r15 != 0) goto L4b
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        L4b:
            java.lang.String r7 = t8k.a.a(r14)
            if (r7 != 0) goto L64
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Trust toggle can’t be applied without contact code"
            r13.<init>(r14)
            zhm.h0 r14 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r15 = rd0.d.f253311a
            rd0.c r15 = rd0.c.ERROR
            rd0.d.a(r15, r3, r3, r13, r14)
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        L64:
            iy9.d r8 = iy9.d.USER
            kotlinx.coroutines.d r14 = skm.p0.f264003c     // Catch: java.lang.Exception -> L9e
            mtj.i r5 = new mtj.i     // Catch: java.lang.Exception -> L9e
            r10 = 0
            r11 = 29
            r6 = r12
            r9 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L9b
            ufm.b r13 = te0.w.o0(r14, r5)     // Catch: java.lang.Exception -> L9b
            eli.j r14 = r6.i     // Catch: java.lang.Exception -> L9b
            eli.a r14 = sjg.a.a(r14)     // Catch: java.lang.Exception -> L9b
            efm.d0 r13 = r13.g(r14)     // Catch: java.lang.Exception -> L9b
            java.lang.String r14 = "compose(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r14)     // Catch: java.lang.Exception -> L9b
            r0.u = r9     // Catch: java.lang.Exception -> L9b
            r0.v = r8     // Catch: java.lang.Exception -> L9b
            r0.f223335y = r4     // Catch: java.lang.Exception -> L9b
            java.lang.Object r15 = nim.a.b(r13, r0)     // Catch: java.lang.Exception -> L9b
            if (r15 != r1) goto L92
            return r1
        L92:
            r13 = r9
        L93:
            kotlin.Unit r15 = (kotlin.Unit) r15     // Catch: java.lang.Exception -> L96
            goto Lb4
        L96:
            r0 = move-exception
            r15 = r0
            r9 = r13
        L99:
            r13 = r8
            goto La2
        L9b:
            r0 = move-exception
        L9c:
            r15 = r0
            goto L99
        L9e:
            r0 = move-exception
            r6 = r12
            r9 = r13
            goto L9c
        La2:
            com.revolut.feature.transfer.core.api.trust.RecipientTrustError r14 = new com.revolut.feature.transfer.core.api.trust.RecipientTrustError
            r14.<init>(r15, r13, r9)
            zhm.h0 r13 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r3, r3, r14, r13)
            boolean r13 = r15 instanceof com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException
            if (r13 != 0) goto Lb7
        Lb4:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        Lb7:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: o9k.t0.a(com.revolut.feature.transfer.models.transfer.TransferTrustData, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r17, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o9k.t0.b(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r19, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o9k.t0.c(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c0, code lost:
    
        if (r11 == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r9, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r10, gim.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof o9k.o0
            if (r0 == 0) goto L13
            r0 = r11
            o9k.o0 r0 = (o9k.o0) r0
            int r1 = r0.f223345y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f223345y = r1
            goto L18
        L13:
            o9k.o0 r0 = new o9k.o0
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f223343w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f223345y
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L50
            if (r2 == r7) goto L48
            if (r2 == r6) goto L44
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            yhm.o.b(r11)
            goto Lc3
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            yhm.o.b(r11)
            return r11
        L40:
            yhm.o.b(r11)
            return r11
        L44:
            yhm.o.b(r11)
            return r11
        L48:
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r10 = r0.v
            com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r9 = r0.u
            yhm.o.b(r11)
            goto L62
        L50:
            yhm.o.b(r11)
            com.revolut.feature.transfer.models.transfer.TransferTrustData r11 = r9.o
            r0.u = r9
            r0.v = r10
            r0.f223345y = r7
            java.lang.Object r11 = r8.a(r11, r10, r0)
            if (r11 != r1) goto L62
            goto Lc2
        L62:
            zm3.a r11 = r10.f102270a
            boolean r2 = r11 instanceof zm3.l
            r7 = 0
            if (r2 == 0) goto L7b
            zm3.l r11 = (zm3.l) r11
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.ContactTargetAccount r10 = r10.f102271b
            r0.u = r7
            r0.v = r7
            r0.f223345y = r6
            java.lang.Object r9 = r8.g(r9, r11, r10, r0)
            if (r9 != r1) goto L7a
            goto Lc2
        L7a:
            return r9
        L7b:
            boolean r2 = r11 instanceof zm3.f
            if (r2 == 0) goto L91
            zm3.f r11 = (zm3.f) r11
            java.lang.String r11 = r11.f323345a
            r0.u = r7
            r0.v = r7
            r0.f223345y = r5
            java.lang.Object r9 = r8.h(r9, r10, r11, r0)
            if (r9 != r1) goto L90
            goto Lc2
        L90:
            return r9
        L91:
            boolean r2 = r11 instanceof zm3.o
            if (r2 == 0) goto La7
            zm3.o r11 = (zm3.o) r11
            java.lang.String r11 = r11.f323376a
            r0.u = r7
            r0.v = r7
            r0.f223345y = r4
            java.lang.Object r9 = r8.h(r9, r10, r11, r0)
            if (r9 != r1) goto La6
            goto Lc2
        La6:
            return r9
        La7:
            boolean r2 = r11 instanceof zm3.e
            if (r2 != 0) goto Lb6
            boolean r11 = r11 instanceof zm3.n
            if (r11 == 0) goto Lb0
            goto Lb6
        Lb0:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        Lb6:
            r0.u = r7
            r0.v = r7
            r0.f223345y = r3
            java.lang.Object r11 = r8.c(r9, r10, r0)
            if (r11 != r1) goto Lc3
        Lc2:
            return r1
        Lc3:
            com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor r11 = (com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o9k.t0.d(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r73, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r74, qua.p r75, gim.c r76) {
        /*
            Method dump skipped, instruction units count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o9k.t0.e(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, qua.p, gim.c):java.lang.Object");
    }

    public final ufm.i f(efm.d0 d0Var, AccountId accountId) {
        ufm.i iVar = new ufm.i(d0Var, new o5i.a(25, new o54.a(this, accountId, 13)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r27, zm3.l r28, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.ContactTargetAccount r29, gim.c r30) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o9k.t0.g(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData, zm3.l, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.ContactTargetAccount, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        if (r10 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r7, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r8, java.lang.String r9, gim.c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof o9k.r0
            if (r0 == 0) goto L13
            r0 = r10
            o9k.r0 r0 = (o9k.r0) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            o9k.r0 r0 = new o9k.r0
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f223355x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r10)
            goto L95
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r10)
            return r10
        L39:
            java.lang.String r9 = r0.f223354w
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r8 = r0.v
            com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r7 = r0.u
            yhm.o.b(r10)
            goto L5c
        L43:
            yhm.o.b(r10)
            ang.f r10 = r6.f
            r2 = 0
            efm.d0 r10 = r10.f(r2)
            r0.u = r7
            r0.v = r8
            r0.f223354w = r9
            r0.z = r5
            java.lang.Object r10 = nim.a.b(r10, r0)
            if (r10 != r1) goto L5c
            goto L94
        L5c:
            java.lang.String r2 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)
            do3.n r10 = (do3.n) r10
            wi0.b r10 = do3.q.y(r10)
            java.lang.String r10 = r10.f297794a
            z80.b r2 = r6.f223364h
            boolean r10 = r2.k(r9, r10)
            r2 = 0
            if (r10 == 0) goto L86
            java.lang.String r8 = t8k.a.f(r8)
            r0.u = r2
            r0.v = r2
            r0.f223354w = r2
            r0.z = r4
            java.lang.Object r7 = r6.i(r7, r8, r9, r0)
            if (r7 != r1) goto L85
            goto L94
        L85:
            return r7
        L86:
            r0.u = r2
            r0.v = r2
            r0.f223354w = r2
            r0.z = r3
            java.lang.Object r10 = r6.c(r7, r8, r0)
            if (r10 != r1) goto L95
        L94:
            return r1
        L95:
            com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor r10 = (com.revolut.domain.models.transfers.PeerToPeerTransferDescriptor) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o9k.t0.h(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r29, java.lang.String r30, java.lang.String r31, gim.c r32) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o9k.t0.i(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
