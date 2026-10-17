package b9k;

import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f13850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bqf.d f13851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bqf.g f13852c;
    public volatile TransferTrustData d;

    public t(ang.f userInteractor, bqf.d trustInteractor, bqf.g trustedPayeeChecker) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(trustInteractor, "trustInteractor");
        Intrinsics.checkNotNullParameter(trustedPayeeChecker, "trustedPayeeChecker");
        this.f13850a = userInteractor;
        this.f13851b = trustInteractor;
        this.f13852c = trustedPayeeChecker;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof b9k.o
            if (r0 == 0) goto L13
            r0 = r6
            b9k.o r0 = (b9k.o) r0
            int r1 = r0.f13841x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13841x = r1
            goto L18
        L13:
            b9k.o r0 = new b9k.o
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f13841x
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
            ang.f r6 = r4.f13850a
            r2 = 0
            efm.d0 r6 = r6.f(r2)
            r0.u = r5
            r0.f13841x = r3
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
        throw new UnsupportedOperationException("Method not decompiled: b9k.t.a(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r10 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r7, hrf.f r8, hrf.c r9, gim.c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof b9k.p
            if (r0 == 0) goto L13
            r0 = r10
            b9k.p r0 = (b9k.p) r0
            int r1 = r0.f13844y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13844y = r1
            goto L18
        L13:
            b9k.p r0 = new b9k.p
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f13842w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f13844y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            hrf.c r7 = r0.v
            yhm.o.b(r10)
            r9 = r7
            goto L6e
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            hrf.c r9 = r0.v
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r7 = r0.u
            yhm.o.b(r10)
            goto L59
        L3e:
            yhm.o.b(r10)
            java.lang.String r10 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r10)
            zm3.a r10 = r7.f102270a
            boolean r10 = r10 instanceof zm3.l
            if (r10 == 0) goto L76
            r0.u = r7
            r0.v = r9
            r0.f13844y = r4
            java.lang.Object r10 = r6.c(r7, r8, r0)
            if (r10 != r1) goto L59
            goto L6d
        L59:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r8 = r10.booleanValue()
            if (r8 != 0) goto L80
            r0.u = r5
            r0.v = r9
            r0.f13844y = r3
            java.lang.Object r10 = r6.a(r7, r0)
            if (r10 != r1) goto L6e
        L6d:
            return r1
        L6e:
            prf.g r10 = (prf.g) r10
            boolean r7 = com.google.crypto.tink.shaded.protobuf.t1.q(r10)
            if (r7 != 0) goto L80
        L76:
            if (r9 == 0) goto L7c
            com.revolut.feature.transfer.models.quotes.TransferQuoteSplit r5 = r9.d()
        L7c:
            if (r5 == 0) goto L7f
            goto L80
        L7f:
            r4 = 0
        L80:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b9k.t.b(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, hrf.f, hrf.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r5, hrf.f r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof b9k.q
            if (r0 == 0) goto L13
            r0 = r7
            b9k.q r0 = (b9k.q) r0
            int r1 = r0.f13845w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13845w = r1
            goto L18
        L13:
            b9k.q r0 = new b9k.q
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f13845w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            r0.f13845w = r3
            java.lang.Object r7 = r4.e(r5, r6, r0)
            if (r7 != r1) goto L3b
            return r1
        L3b:
            com.revolut.feature.transfer.models.transfer.TransferTrustData r7 = (com.revolut.feature.transfer.models.transfer.TransferTrustData) r7
            boolean r5 = r7.f92304a
            if (r5 == 0) goto L4b
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r5 = r7.f92305b
            boolean r5 = com.revolut.feature.transfer.models.transfer.a.a(r5)
            if (r5 == 0) goto L4a
            goto L4b
        L4a:
            r3 = 0
        L4b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b9k.t.c(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, hrf.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r5, hrf.f r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof b9k.r
            if (r0 == 0) goto L13
            r0 = r7
            b9k.r r0 = (b9k.r) r0
            int r1 = r0.f13846w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13846w = r1
            goto L18
        L13:
            b9k.r r0 = new b9k.r
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f13846w
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
            bqf.g r6 = r4.f13852c
            zm3.a r5 = r5.f102270a
            ufm.i r5 = r6.c(r5)
            r0.f13846w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b9k.t.d(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, hrf.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r11 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        if (r11 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r9, hrf.f r10, gim.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof b9k.s
            if (r0 == 0) goto L13
            r0 = r11
            b9k.s r0 = (b9k.s) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            b9k.s r0 = new b9k.s
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f13848x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r9 = r0.f13847w
            yhm.o.b(r11)
            goto L8b
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r9 = r0.f13847w
            zm3.a r9 = (zm3.a) r9
            hrf.f r10 = r0.v
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r9 = r0.u
            yhm.o.b(r11)
            goto L68
        L41:
            yhm.o.b(r11)
            com.revolut.feature.transfer.models.transfer.TransferTrustData r11 = r8.d
            if (r11 == 0) goto L49
            return r11
        L49:
            zm3.a r11 = r9.f102270a
            boolean r2 = r11 instanceof zm3.l
            if (r2 == 0) goto L6f
            bqf.d r2 = r8.f13851b
            zm3.l r11 = (zm3.l) r11
            java.lang.String r11 = r11.getCode()
            iy9.d r6 = iy9.d.USER
            r0.u = r9
            r0.v = r10
            r0.f13847w = r5
            r0.z = r4
            java.lang.Object r11 = r2.b(r11, r6, r0)
            if (r11 != r1) goto L68
            goto L8a
        L68:
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r11 = (com.revolut.feature.transfer.models.transfer.RecipientTrustState) r11
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
            goto L7c
        L6f:
            boolean r2 = r11 instanceof zm3.g
            if (r2 == 0) goto L77
        L73:
            r11 = r10
            r10 = r9
            r9 = r5
            goto L7c
        L77:
            boolean r11 = r11 instanceof zm3.p
            if (r11 == 0) goto L99
            goto L73
        L7c:
            r0.u = r5
            r0.v = r5
            r0.f13847w = r9
            r0.z = r3
            java.lang.Object r11 = r8.d(r10, r11, r0)
            if (r11 != r1) goto L8b
        L8a:
            return r1
        L8b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r10 = r11.booleanValue()
            com.revolut.feature.transfer.models.transfer.TransferTrustData r11 = new com.revolut.feature.transfer.models.transfer.TransferTrustData
            r11.<init>(r10, r9)
            r8.d = r11
            return r11
        L99:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b9k.t.e(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, hrf.f, gim.c):java.lang.Object");
    }
}
