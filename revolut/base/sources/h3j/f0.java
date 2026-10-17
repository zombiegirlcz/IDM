package h3j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o71.a f149151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3j.d f149152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kak.a f149153c;
    public final whf.b d;
    public final r10.a e;
    public final wif.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z2j.f f149154g;

    public f0(o71.a beneficiaryRepository, d3j.d paymentsSettingsInteractor, kak.a pdaInteractor, whf.b transactionsContentProvider, r10.a recipientAnalyticsInteractor, wif.a userFeaturesChecker, z2j.f beneficiaryTransactionFilterProvider) {
        Intrinsics.checkNotNullParameter(beneficiaryRepository, "beneficiaryRepository");
        Intrinsics.checkNotNullParameter(paymentsSettingsInteractor, "paymentsSettingsInteractor");
        Intrinsics.checkNotNullParameter(pdaInteractor, "pdaInteractor");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(recipientAnalyticsInteractor, "recipientAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        Intrinsics.checkNotNullParameter(beneficiaryTransactionFilterProvider, "beneficiaryTransactionFilterProvider");
        this.f149151a = beneficiaryRepository;
        this.f149152b = paymentsSettingsInteractor;
        this.f149153c = pdaInteractor;
        this.d = transactionsContentProvider;
        this.e = recipientAnalyticsInteractor;
        this.f = userFeaturesChecker;
        this.f149154g = beneficiaryTransactionFilterProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof h3j.b0
            if (r0 == 0) goto L13
            r0 = r7
            h3j.b0 r0 = (h3j.b0) r0
            int r1 = r0.f149141w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149141w = r1
            goto L18
        L13:
            h3j.b0 r0 = new h3j.b0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149141w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L63
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            wif.a r7 = r5.f
            wog.a r2 = wog.a.RECURRING_PAYMENTS
            efm.r r7 = r7.d(r2)
            efm.d0 r7 = r7.firstOrError()
            gvi.s r2 = new gvi.s
            r4 = 18
            r2.<init>(r5, r6, r4)
            h0l.g r6 = new h0l.g
            r4 = 9
            r6.<init>(r2, r4)
            r7.getClass()
            ufm.i r2 = new ufm.i
            r4 = 0
            r2.<init>(r7, r6, r4)
            java.lang.String r6 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r6)
            r0.f149141w = r3
            java.lang.Object r7 = nim.a.b(r2, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h3j.f0.a(java.lang.String, gim.c):java.lang.Object");
    }
}
