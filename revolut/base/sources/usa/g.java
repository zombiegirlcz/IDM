package usa;

import com.revolut.feature.push_to_card.impl.ui.review.PushToCardTransferReviewScreenContract$InputData;
import eli.j;
import jid.z;
import kotlin.jvm.internal.Intrinsics;
import mri.w;
import ogm.i;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends n implements d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PushToCardTransferReviewScreenContract$InputData f282852l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z f282853m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final bqf.d f282854n;
    public final com.revolut.domain.interactors.transactions.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wsg.n f282855p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f282856q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w f282857r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f282858s;

    public g(PushToCardTransferReviewScreenContract$InputData inputData, z interactor, bqf.d trustInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, wsg.n walletInteractor, j twoFaErrorHandler, w jobInteractor, i transactionForAnimationFetcher) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(trustInteractor, "trustInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(jobInteractor, "jobInteractor");
        Intrinsics.checkNotNullParameter(transactionForAnimationFetcher, "transactionForAnimationFetcher");
        this.f282852l = inputData;
        this.f282853m = interactor;
        this.f282854n = trustInteractor;
        this.o = transactionsInteractor;
        this.f282855p = walletInteractor;
        this.f282856q = twoFaErrorHandler;
        this.f282857r = jobInteractor;
        this.f282858s = transactionForAnimationFetcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.transfer.models.transfer.TransferTrustData r11, gim.c r12) throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = r12 instanceof usa.e
            if (r0 == 0) goto L13
            r0 = r12
            usa.e r0 = (usa.e) r0
            int r1 = r0.f282848y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f282848y = r1
            goto L18
        L13:
            usa.e r0 = new usa.e
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f282846w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f282848y
            r7 = 0
            r9 = 1
            if (r2 == 0) goto L3a
            if (r2 != r9) goto L32
            iy9.d r11 = r0.v
            com.revolut.feature.transfer.models.transfer.TransferTrustData r1 = r0.u
            yhm.o.b(r12)     // Catch: java.lang.Exception -> L2d
            r4 = r10
            goto L7a
        L2d:
            r0 = move-exception
            r12 = r0
            r4 = r10
            r6 = r1
            goto L68
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            yhm.o.b(r12)
            com.revolut.feature.transfer.models.transfer.RecipientTrustState r12 = r11.f92305b
            boolean r12 = com.revolut.feature.transfer.models.transfer.a.a(r12)
            if (r12 != 0) goto L48
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L48:
            iy9.d r5 = iy9.d.CARD_OWNER
            s15.j r3 = new s15.j     // Catch: java.lang.Exception -> L64
            r8 = 18
            r4 = r10
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L60
            r0.u = r6     // Catch: java.lang.Exception -> L60
            r0.v = r5     // Catch: java.lang.Exception -> L60
            r0.f282848y = r9     // Catch: java.lang.Exception -> L60
            java.lang.Object r11 = do3.q.u(r10, r3, r0)     // Catch: java.lang.Exception -> L60
            if (r11 != r1) goto L7a
            return r1
        L60:
            r0 = move-exception
        L61:
            r12 = r0
            r11 = r5
            goto L68
        L64:
            r0 = move-exception
            r4 = r10
            r6 = r11
            goto L61
        L68:
            com.revolut.feature.transfer.core.api.trust.RecipientTrustError r0 = new com.revolut.feature.transfer.core.api.trust.RecipientTrustError
            r0.<init>(r12, r11, r6)
            zhm.h0 r11 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r7, r7, r0, r11)
            boolean r11 = r12 instanceof com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException
            if (r11 != 0) goto L7d
        L7a:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L7d:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: usa.g.Z2(com.revolut.feature.transfer.models.transfer.TransferTrustData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a7, code lost:
    
        if (r1 == r3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01fe, code lost:
    
        if (nim.a.a(r1, r2) == r3) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0242 A[PHI: r3
      0x0242: PHI (r3v8 java.lang.Object) = 
      (r3v0 java.lang.Object)
      (r3v5 java.lang.Object)
      (r3v6 java.lang.Object)
      (r3v6 java.lang.Object)
      (r3v9 java.lang.Object)
     binds: [B:25:0x0082, B:47:0x018c, B:66:0x01fe, B:52:0x01a7, B:73:0x0240] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0243 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData r26, com.revolut.feature.transfer.models.transfer.TransferTrustData r27, boolean r28, gim.c r29) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: usa.g.b3(com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData, com.revolut.feature.transfer.models.transfer.TransferTrustData, boolean, gim.c):java.lang.Object");
    }
}
