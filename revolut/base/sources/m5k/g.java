package m5k;

import kotlin.jvm.internal.Intrinsics;
import ybl.l;
import z0h.q1;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f202961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f202962b;

    public g(q1 tradingDisclaimerProvider, l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(tradingDisclaimerProvider, "tradingDisclaimerProvider");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.f202961a = tradingDisclaimerProvider;
        this.f202962b = tradingConfigInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.transfer.core.models.FundingSource r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof m5k.f
            if (r0 == 0) goto L13
            r0 = r9
            m5k.f r0 = (m5k.f) r0
            int r1 = r0.f202960x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f202960x = r1
            goto L18
        L13:
            m5k.f r0 = new m5k.f
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f202960x
            ybl.l r3 = r7.f202962b
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            hel.b r8 = r0.u
            yhm.o.b(r9)
            goto L7d
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r9)
            goto L66
        L3b:
            yhm.o.b(r9)
            boolean r9 = r8 instanceof com.revolut.feature.transfer.core.models.SavingsAccount
            if (r9 != 0) goto L99
            boolean r9 = r8 instanceof com.revolut.feature.transfer.core.models.PocketSource
            if (r9 != 0) goto L99
            boolean r9 = r8 instanceof com.revolut.feature.transfer.core.models.DeFiBalanceSource
            if (r9 == 0) goto L4b
            return r6
        L4b:
            boolean r8 = r8 instanceof com.revolut.feature.transfer.core.models.WealthPortfolio
            if (r8 == 0) goto L93
            akg.n r8 = ybl.l.d(r3)
            m56.g r9 = new m56.g
            r2 = 2
            r9.<init>(r2)
            jhi.b r8 = mo3.a.g(r8, r6, r9, r5)
            r0.f202960x = r5
            java.lang.Object r9 = vkm.q.x(r8, r0)
            if (r9 != r1) goto L66
            goto L7c
        L66:
            com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation r9 = (com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation) r9
            hel.b r8 = r9.f105106a
            if (r8 == 0) goto L92
            ael.t0 r3 = (ael.t0) r3
            ufm.i r9 = r3.f()
            r0.u = r8
            r0.f202960x = r4
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto L7d
        L7c:
            return r1
        L7d:
            com.revolut.shared.feature.wealth.models.config.Links r9 = (com.revolut.shared.feature.wealth.models.config.Links) r9
            com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment$TransferFeesBreakdown r0 = new com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment$TransferFeesBreakdown
            kotlin.jvm.internal.Intrinsics.h(r9)
            r0.<init>(r9, r8)
            java.util.List r9 = zhm.u.c(r0)
            z0h.q1 r0 = r7.f202961a
            com.revolut.core.ui_kit.models.CompositeClause r8 = z0h.q1.a(r0, r9, r8)
            return r8
        L92:
            return r6
        L93:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L99:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m5k.g.a(com.revolut.feature.transfer.core.models.FundingSource, gim.c):java.lang.Object");
    }
}
