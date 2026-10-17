package j9k;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements d {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f172373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r10.a f172374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f172375c;
    public final n8b.a d;
    public final f61.a e;
    public final l61.a f;

    public p(fk3.a configurationInteractor, r10.a outgoingCurrenciesProvider, wsg.n walletInteractor, n8b.a countryInteractor, f61.a brazilCurrenciesInteractor, l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(outgoingCurrenciesProvider, "outgoingCurrenciesProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(brazilCurrenciesInteractor, "brazilCurrenciesInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.f172373a = configurationInteractor;
        this.f172374b = outgoingCurrenciesProvider;
        this.f172375c = walletInteractor;
        this.d = countryInteractor;
        this.e = brazilCurrenciesInteractor;
        this.f = userCompanyInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof j9k.g
            if (r0 == 0) goto L13
            r0 = r5
            j9k.g r0 = (j9k.g) r0
            int r1 = r0.f172362w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172362w = r1
            goto L18
        L13:
            j9k.g r0 = new j9k.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f172362w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            wsg.n r5 = r4.f172375c
            com.revolut.core.model.account.AccountId$Personal r2 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r5 = r5.x(r2)
            r0.f172362w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j9k.p.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof j9k.h
            if (r0 == 0) goto L13
            r0 = r6
            j9k.h r0 = (j9k.h) r0
            int r1 = r0.f172363w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172363w = r1
            goto L18
        L13:
            j9k.h r0 = new j9k.h
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f172363w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L61
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            n8b.a r6 = r5.d
            o8b.c r6 = (o8b.c) r6
            boolean r6 = r6.g()
            if (r6 == 0) goto L4a
            xi0.a r6 = xi0.b.Companion
            r6.getClass()
            xi0.b r6 = xi0.b.E
            java.lang.String r6 = r6.f306286a
            java.util.Set r6 = zhm.y0.b(r6)
            return r6
        L4a:
            fk3.a r6 = r5.f172373a
            ik3.c r6 = (ik3.c) r6
            efm.r r6 = r6.n()
            r2 = 3
            r4 = 0
            efm.r r6 = m70.a.g(r6, r4, r4, r2)
            r0.f172363w = r3
            java.lang.Object r6 = nim.a.c(r6, r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            java.lang.String r0 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            java.util.Set r6 = (java.util.Set) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j9k.p.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof j9k.i
            if (r0 == 0) goto L13
            r0 = r6
            j9k.i r0 = (j9k.i) r0
            int r1 = r0.f172364w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172364w = r1
            goto L18
        L13:
            j9k.i r0 = new j9k.i
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f172364w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L4a
        L36:
            yhm.o.b(r6)
            l61.a r6 = r5.f
            ang.b r6 = (ang.b) r6
            efm.d0 r6 = r6.a()
            r0.f172364w = r4
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L4a
            goto L61
        L4a:
            java.lang.String r2 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            l71.d r6 = (l71.d) r6
            boolean r6 = l71.f.a(r6)
            if (r6 == 0) goto L63
            r0.f172364w = r3
            f61.a r6 = r5.e
            java.lang.Object r6 = r6.x(r0)
            if (r6 != r1) goto L62
        L61:
            return r1
        L62:
            return r6
        L63:
            zhm.h0 r6 = zhm.h0.f322473a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j9k.p.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
    
        if (r13 != r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d9, code lost:
    
        if (r13 == r0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r10, com.revolut.feature.transfer.core.models.TransferFlowType r11, hrf.f r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9k.p.e(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, com.revolut.feature.transfer.core.models.TransferFlowType, hrf.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r11 == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r7, com.revolut.feature.transfer.core.models.TransferFlowType r8, hrf.f r9, xi0.b r10, gim.c r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof j9k.k
            if (r0 == 0) goto L13
            r0 = r11
            j9k.k r0 = (j9k.k) r0
            int r1 = r0.f172369x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172369x = r1
            goto L18
        L13:
            j9k.k r0 = new j9k.k
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f172369x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r11)
            return r11
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            xi0.b r10 = r0.u
            yhm.o.b(r11)
            goto L4b
        L39:
            yhm.o.b(r11)
            boolean r8 = r8 instanceof com.revolut.feature.transfer.core.models.TransferFlowType.Crypto
            if (r8 == 0) goto L66
            r0.u = r10
            r0.f172369x = r4
            java.lang.Object r11 = r6.i(r0)
            if (r11 != r1) goto L4b
            goto Lb0
        L4b:
            java.util.Set r11 = (java.util.Set) r11
            if (r10 == 0) goto L5b
            boolean r7 = cp5.d.z(r10)
            if (r7 == 0) goto L56
            goto L57
        L56:
            r10 = r5
        L57:
            if (r10 == 0) goto L5b
            java.lang.String r5 = r10.f306286a
        L5b:
            java.util.List r7 = zhm.v.l(r5)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.LinkedHashSet r7 = zhm.a1.l(r11, r7)
            return r7
        L66:
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.ContactTargetAccount r8 = r7.f102271b
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.ContactTargetAccount$PersonalAccount r10 = com.revolut.retail.feature.payments.peer_to_peer.api.navigation.ContactTargetAccount.PersonalAccount.f102259a
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r8, r10)
            if (r10 != 0) goto L8e
            boolean r10 = r8 instanceof com.revolut.retail.feature.payments.peer_to_peer.api.navigation.ContactTargetAccount.Subaccount
            if (r10 == 0) goto L75
            goto L8e
        L75:
            boolean r7 = r8 instanceof com.revolut.retail.feature.payments.peer_to_peer.api.navigation.ContactTargetAccount.SplitBillLink
            if (r7 == 0) goto L88
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.ContactTargetAccount$SplitBillLink r8 = (com.revolut.retail.feature.payments.peer_to_peer.api.navigation.ContactTargetAccount.SplitBillLink) r8
            com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLinkDetails r7 = r8.f102260a
            dj0.d r7 = r7.i
            xi0.b r7 = r7.f115083b
            java.lang.String r7 = r7.f306286a
            java.util.Set r7 = zhm.y0.b(r7)
            return r7
        L88:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L8e:
            n8b.a r8 = r6.d
            o8b.c r8 = (o8b.c) r8
            boolean r8 = r8.g()
            if (r8 == 0) goto La6
            xi0.a r7 = xi0.b.Companion
            r7.getClass()
            xi0.b r7 = xi0.b.E
            java.lang.String r7 = r7.f306286a
            java.util.Set r7 = zhm.y0.b(r7)
            return r7
        La6:
            r0.u = r5
            r0.f172369x = r3
            java.io.Serializable r7 = r6.h(r7, r9, r0)
            if (r7 != r1) goto Lb1
        Lb0:
            return r1
        Lb1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j9k.p.f(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, com.revolut.feature.transfer.core.models.TransferFlowType, hrf.f, xi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof j9k.l
            if (r0 == 0) goto L13
            r0 = r5
            j9k.l r0 = (j9k.l) r0
            int r1 = r0.f172370w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172370w = r1
            goto L18
        L13:
            j9k.l r0 = new j9k.l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f172370w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            l61.a r5 = r4.f
            ang.b r5 = (ang.b) r5
            efm.d0 r5 = r5.a()
            r0.f172370w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            l71.d r5 = (l71.d) r5
            boolean r5 = l71.f.a(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j9k.p.g(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r10 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ee, code lost:
    
        if (r10 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable h(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r8, hrf.f r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9k.p.h(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, hrf.f, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(gim.c r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof j9k.n
            if (r0 == 0) goto L13
            r0 = r14
            j9k.n r0 = (j9k.n) r0
            int r1 = r0.f172372w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172372w = r1
            goto L18
        L13:
            j9k.n r0 = new j9k.n
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f172372w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r14)
            goto L72
        L27:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L2f:
            yhm.o.b(r14)
            io3.l r6 = io3.l.CURRENT
            io3.i r8 = io3.i.INTERNAL
            r11 = 0
            r12 = 116(0x74, float:1.63E-43)
            wsg.n r4 = r13.f172375c
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            efm.r r14 = osg.b.e(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            efm.r r14 = zi0.c.J(r14)
            r2 = 3
            r4 = 0
            efm.r r14 = m70.a.g(r14, r4, r4, r2)
            zhm.f0 r2 = zhm.f0.f322471a
            efm.r r14 = ue0.e.E(r14, r2)
            j7b.l r2 = new j7b.l
            r4 = 10
            r2.<init>(r4)
            j6k.g r4 = new j6k.g
            r5 = 2
            r4.<init>(r2, r5)
            efm.r r14 = r14.map(r4)
            java.lang.String r2 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r2)
            r0.f172372w = r3
            java.lang.Object r14 = nim.a.c(r14, r0)
            if (r14 != r1) goto L72
            return r1
        L72:
            java.lang.String r0 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: j9k.p.i(gim.c):java.lang.Object");
    }
}
