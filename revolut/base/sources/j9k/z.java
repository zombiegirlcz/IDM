package j9k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f172396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bqf.d f172397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bqf.g f172398c;

    public z(ang.f userInteractor, bqf.d trustInteractor, bqf.g trustedPayeeChecker) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(trustInteractor, "trustInteractor");
        Intrinsics.checkNotNullParameter(trustedPayeeChecker, "trustedPayeeChecker");
        this.f172396a = userInteractor;
        this.f172397b = trustInteractor;
        this.f172398c = trustedPayeeChecker;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof j9k.w
            if (r0 == 0) goto L13
            r0 = r6
            j9k.w r0 = (j9k.w) r0
            int r1 = r0.f172391x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172391x = r1
            goto L18
        L13:
            j9k.w r0 = new j9k.w
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f172391x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r5 = r0.u
            yhm.o.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            ang.f r6 = r4.f172396a
            r2 = 0
            efm.d0 r6 = r6.f(r2)
            r0.u = r5
            r0.f172391x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            do3.n r6 = (do3.n) r6
            prf.g r0 = new prf.g
            kotlin.jvm.internal.Intrinsics.h(r6)
            wi0.b r6 = do3.q.y(r6)
            wi0.a r1 = wi0.b.Companion
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            zm3.a r5 = r5.f102270a
            java.lang.String r5 = hx7.q.s(r5)
            r1.getClass()
            wi0.b r5 = wi0.a.a(r5)
            r0.<init>(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j9k.z.a(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        if (r10 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        if (r10 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r8, hrf.f r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof j9k.x
            if (r0 == 0) goto L13
            r0 = r10
            j9k.x r0 = (j9k.x) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            j9k.x r0 = new j9k.x
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f172393x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r8 = r0.f172392w
            yhm.o.b(r10)
            goto L86
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r8 = r0.f172392w
            zm3.a r8 = (zm3.a) r8
            hrf.f r9 = r0.v
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r8 = r0.u
            yhm.o.b(r10)
            goto L63
        L41:
            yhm.o.b(r10)
            zm3.a r10 = r8.f102270a
            boolean r2 = r10 instanceof zm3.l
            if (r2 == 0) goto L6a
            zm3.l r10 = (zm3.l) r10
            java.lang.String r10 = r10.getCode()
            iy9.d r2 = iy9.d.USER
            r0.u = r8
            r0.v = r9
            r0.f172392w = r5
            r0.z = r4
            bqf.d r4 = r7.f172397b
            java.lang.Object r10 = r4.b(r10, r2, r0)
            if (r10 != r1) goto L63
            goto L85
        L63:
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r10 = (com.revolut.feature.transfer.models.transfer.RecipientTrustState) r10
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
            goto L77
        L6a:
            boolean r2 = r10 instanceof zm3.g
            if (r2 == 0) goto L72
        L6e:
            r10 = r9
            r9 = r8
            r8 = r5
            goto L77
        L72:
            boolean r10 = r10 instanceof zm3.p
            if (r10 == 0) goto L92
            goto L6e
        L77:
            r0.u = r5
            r0.v = r5
            r0.f172392w = r8
            r0.z = r3
            java.lang.Object r10 = r7.c(r9, r10, r0)
            if (r10 != r1) goto L86
        L85:
            return r1
        L86:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            com.revolut.feature.transfer.models.transfer.TransferTrustData r10 = new com.revolut.feature.transfer.models.transfer.TransferTrustData
            r10.<init>(r9, r8)
            return r10
        L92:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j9k.z.b(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, hrf.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r5, hrf.f r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof j9k.y
            if (r0 == 0) goto L13
            r0 = r7
            j9k.y r0 = (j9k.y) r0
            int r1 = r0.f172395w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172395w = r1
            goto L18
        L13:
            j9k.y r0 = new j9k.y
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f172395w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            hrf.f r7 = hrf.f.INCOMING
            if (r6 != r7) goto L39
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L39:
            bqf.g r6 = r4.f172398c
            zm3.a r5 = r5.f102270a
            ufm.i r5 = r6.c(r5)
            r0.f172395w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j9k.z.c(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, hrf.f, gim.c):java.lang.Object");
    }
}
