package e0a;

import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreenContract$InputData;
import cu8.r0;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends yji.n implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PeerToPeerChatScreenContract$InputData f121497l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y8k.b f121498m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final qz9.t f121499n;
    public final iz9.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wz9.a f121500p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r0 f121501q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f121502r;

    public i(PeerToPeerChatScreenContract$InputData inputData, y8k.b peerToPeerFeatureConfigProvider, qz9.t suggestionsInteractor, iz9.c transactionsInteractor, wz9.a suspiciousTransactionsActionsExtension, r0 kycTransformer) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(peerToPeerFeatureConfigProvider, "peerToPeerFeatureConfigProvider");
        Intrinsics.checkNotNullParameter(suggestionsInteractor, "suggestionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(suspiciousTransactionsActionsExtension, "suspiciousTransactionsActionsExtension");
        Intrinsics.checkNotNullParameter(kycTransformer, "kycTransformer");
        this.f121497l = inputData;
        this.f121498m = peerToPeerFeatureConfigProvider;
        this.f121499n = suggestionsInteractor;
        this.o = transactionsInteractor;
        this.f121500p = suspiciousTransactionsActionsExtension;
        this.f121501q = kycTransformer;
        this.f121502r = vkm.q.b(0, 7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(e0a.i r7, gim.c r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof e0a.g
            if (r0 == 0) goto L16
            r0 = r8
            e0a.g r0 = (e0a.g) r0
            int r1 = r0.f121492x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f121492x = r1
            goto L1b
        L16:
            e0a.g r0 = new e0a.g
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f121492x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            e0a.i r7 = r0.u
            yhm.o.b(r8)
            goto L57
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            y8k.b r8 = r7.f121498m
            com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreenContract$InputData r2 = r7.f121497l
            zm3.a r4 = r2.f79768a
            com.revolut.feature.transfer.core.models.TransferMoneyPocket r2 = r2.f79769b
            r5 = 0
            if (r2 == 0) goto L45
            dj0.d r2 = r2.f92261a
            goto L46
        L45:
            r2 = r5
        L46:
            r6 = 12
            ufm.b r8 = q8k.g.a(r8, r4, r2, r5, r6)
            r0.u = r7
            r0.f121492x = r3
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L57
            return r1
        L57:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            com.revolut.retail.core.navigation.feature.FeatureConfig r8 = (com.revolut.retail.core.navigation.feature.FeatureConfig) r8
            com.revolut.kompot.bridge.navigation.BridgeDestination r8 = zh9.u0.c(r8)
            r7.A2(r8)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e0a.i.Z2(e0a.i, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r6 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof e0a.f
            if (r0 == 0) goto L13
            r0 = r6
            e0a.f r0 = (e0a.f) r0
            int r1 = r0.f121490w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f121490w = r1
            goto L18
        L13:
            e0a.f r0 = new e0a.f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f121490w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L76
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L44
        L36:
            yhm.o.b(r6)
            r0.f121490w = r4
            cu8.r0 r6 = r5.f121501q
            java.lang.Object r6 = ks8.m.b(r6, r0)
            if (r6 != r1) goto L44
            goto L75
        L44:
            ks8.j r6 = (ks8.j) r6
            boolean r2 = r6 instanceof ks8.i
            if (r2 == 0) goto L54
            e0a.a r0 = new e0a.a
            ks8.i r6 = (ks8.i) r6
            com.revolut.retail.core.navigation.FeatureCommand r6 = r6.f189312a
            r0.<init>(r6)
            return r0
        L54:
            ks8.j$a r2 = ks8.j.a.f189313a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r2)
            if (r6 == 0) goto L8d
            com.revolut.feature.payments.social.api.model.ChatTransferRecipient$ContactRecipient r6 = new com.revolut.feature.payments.social.api.model.ChatTransferRecipient$ContactRecipient
            com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreenContract$InputData r2 = r5.f121497l
            zm3.a r2 = r2.f79768a
            r6.<init>(r2)
            iz9.c r2 = r5.o
            qz9.n r2 = (qz9.n) r2
            pfm.z r6 = r2.f(r6)
            r0.f121490w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L76
        L75:
            return r1
        L76:
            od0.i r6 = (od0.i) r6
            boolean r0 = r6.d()
            if (r0 == 0) goto L8a
            e0a.c r0 = new e0a.c
            java.lang.Object r6 = r6.c()
            java.lang.String r6 = (java.lang.String) r6
            r0.<init>(r6)
            return r0
        L8a:
            e0a.b r6 = e0a.b.f121475a
            return r6
        L8d:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e0a.i.b3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
    
        if (r10 != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(java.lang.String r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0a.i.c3(java.lang.String, gim.c):java.lang.Object");
    }
}
