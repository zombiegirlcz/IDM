package e38;

import kotlin.jvm.internal.Intrinsics;
import ybl.l;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f122209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f122210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y2f.a f122211c;
    public final n28.d d;

    public f(gte.a featureToggleInteractor, l tradingConfigInteractor, y2f.a tradingTransactionsInteractor, n28.d widgetAvailabilityProvider) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(tradingTransactionsInteractor, "tradingTransactionsInteractor");
        Intrinsics.checkNotNullParameter(widgetAvailabilityProvider, "widgetAvailabilityProvider");
        this.f122209a = featureToggleInteractor;
        this.f122210b = tradingConfigInteractor;
        this.f122211c = tradingTransactionsInteractor;
        this.d = widgetAvailabilityProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(e38.f r5, gim.c r6) {
        /*
            n28.d r0 = r5.d
            boolean r1 = r6 instanceof e38.d
            if (r1 == 0) goto L15
            r1 = r6
            e38.d r1 = (e38.d) r1
            int r2 = r1.f122207w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f122207w = r2
            goto L1a
        L15:
            e38.d r1 = new e38.d
            r1.<init>(r5, r6)
        L1a:
            java.lang.Object r5 = r1.u
            fim.a r6 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f122207w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r5)
            return r5
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r5)
            goto L46
        L38:
            yhm.o.b(r5)
            com.revolut.shared.feature.wealth.models.account.WealthAccountType r5 = com.revolut.shared.feature.wealth.models.account.WealthAccountType.SECURITIES
            r1.f122207w = r4
            java.lang.Object r5 = r0.d(r5, r1)
            if (r5 != r6) goto L46
            goto L58
        L46:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L5a
            com.revolut.shared.feature.wealth.models.account.WealthAccountType r5 = com.revolut.shared.feature.wealth.models.account.WealthAccountType.TAA
            r1.f122207w = r3
            java.lang.Object r5 = r0.d(r5, r1)
            if (r5 != r6) goto L59
        L58:
            return r6
        L59:
            return r5
        L5a:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e38.f.a(e38.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(e38.f r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof e38.e
            if (r0 == 0) goto L13
            r0 = r5
            e38.e r0 = (e38.e) r0
            int r1 = r0.f122208w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f122208w = r1
            goto L18
        L13:
            e38.e r0 = new e38.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f122208w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L4d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            ybl.l r4 = r4.f122210b
            akg.n r4 = ybl.l.d(r4)
            e07.k r5 = new e07.k
            r2 = 15
            r5.<init>(r2)
            r2 = 0
            jhi.b r4 = mo3.a.g(r4, r2, r5, r3)
            r0.f122208w = r3
            java.lang.Object r5 = vkm.q.x(r4, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation r5 = (com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation) r5
            hel.b r4 = r5.f105106a
            if (r4 != 0) goto L55
            r4 = -1
            goto L5d
        L55:
            int[] r5 = e38.a.f122202a
            int r4 = r4.ordinal()
            r4 = r5[r4]
        L5d:
            switch(r4) {
                case -1: goto L66;
                case 0: goto L60;
                case 1: goto L67;
                case 2: goto L67;
                case 3: goto L66;
                case 4: goto L66;
                case 5: goto L66;
                case 6: goto L66;
                case 7: goto L66;
                default: goto L60;
            }
        L60:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L66:
            r3 = 0
        L67:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e38.f.b(e38.f, gim.c):java.lang.Object");
    }
}
