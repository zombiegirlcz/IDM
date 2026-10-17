package r7i;

import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tnb.g0;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f252236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f252237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f252238c;
    public final ybl.l d;
    public final b e;

    public p(gte.a featureToggleInteractor, ang.f userInteractor, g0 tradingCurrencyCompatibilityInteractor, ybl.l tradingConfigInteractor, b cfdInvestAccountEligibilityChecker) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(tradingCurrencyCompatibilityInteractor, "tradingCurrencyCompatibilityInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(cfdInvestAccountEligibilityChecker, "cfdInvestAccountEligibilityChecker");
        this.f252236a = featureToggleInteractor;
        this.f252237b = userInteractor;
        this.f252238c = tradingCurrencyCompatibilityInteractor;
        this.d = tradingConfigInteractor;
        this.e = cfdInvestAccountEligibilityChecker;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof r7i.j
            if (r0 == 0) goto L13
            r0 = r6
            r7i.j r0 = (r7i.j) r0
            int r1 = r0.f252222w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f252222w = r1
            goto L18
        L13:
            r7i.j r0 = new r7i.j
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f252222w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r6)
            goto L51
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            yhm.o.b(r6)
            ybl.l r6 = r5.d
            r2 = 3
            efm.r r6 = ybl.l.c(r6, r3, r2)
            vkm.d r6 = rd0.e.b(r6)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.q0 r6 = rd0.e.n(r6, r2)
            zfd.e r6 = zi0.c.w(r6)
            r0.f252222w = r4
            java.lang.Object r6 = vkm.q.z(r6, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            if (r6 == 0) goto L5f
            java.lang.Object r6 = r6.getContent()
            hel.a r6 = (hel.a) r6
            if (r6 == 0) goto L5f
            boolean r3 = r6.f151719g
        L5f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r7i.p.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature_move_money.api.model.AccountWrapper r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof r7i.k
            if (r0 == 0) goto L13
            r0 = r7
            r7i.k r0 = (r7i.k) r0
            int r1 = r0.f252224x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f252224x = r1
            goto L18
        L13:
            r7i.k r0 = new r7i.k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f252224x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature_move_money.api.model.AccountWrapper r6 = r0.u
            yhm.o.b(r7)
            goto L5b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            j8l.a r7 = r6.f97224a
            boolean r7 = pw5.a.p(r7)
            if (r7 == 0) goto L3f
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L3f:
            tnb.g0 r7 = r5.f252238c
            akg.n r7 = r7.h()
            r6d.h r2 = new r6d.h
            r4 = 4
            r2.<init>(r4)
            r4 = 0
            jhi.b r7 = mo3.a.g(r7, r4, r2, r3)
            r0.u = r6
            r0.f252224x = r3
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            java.util.Set r7 = (java.util.Set) r7
            xi0.b r6 = r6.getCurrency()
            boolean r6 = r7.contains(r6)
            r6 = r6 ^ r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r7i.p.b(com.revolut.feature_move_money.api.model.AccountWrapper, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Margin r18, kel.b r19, x5i.d r20, com.revolut.feature_move_money.api.model.AccountWrapper r21, gim.c r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7i.p.c(com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$Margin, kel.b, x5i.d, com.revolut.feature_move_money.api.model.AccountWrapper, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r8, kel.b r9, x5i.d r10, com.revolut.feature_move_money.api.model.AccountWrapper r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7i.p.d(com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount, kel.b, x5i.d, com.revolut.feature_move_money.api.model.AccountWrapper, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r21, x5i.d r22, com.revolut.feature_move_money.api.model.AccountWrapper r23, gim.c r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7i.p.e(com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount, x5i.d, com.revolut.feature_move_money.api.model.AccountWrapper, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof r7i.o
            if (r0 == 0) goto L13
            r0 = r6
            r7i.o r0 = (r7i.o) r0
            int r1 = r0.f252235x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f252235x = r1
            goto L18
        L13:
            r7i.o r0 = new r7i.o
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f252235x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r5 = r0.u
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L5f
        L29:
            r5 = move-exception
            goto L72
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            com.revolut.feature.wealth.api.FeatureWealthApi$Toggles$InvestMoveMoneyGlobal r6 = com.revolut.feature.wealth.api.FeatureWealthApi$Toggles.InvestMoveMoneyGlobal.f95160c
            gte.a r2 = r4.f252236a
            jte.d r2 = (jte.d) r2
            boolean r6 = r2.c(r6)
            if (r6 == 0) goto L4b
            com.revolut.feature.user.api.UserApi$Toggles$MultipleCountryProfiles r6 = com.revolut.feature.user.api.UserApi$Toggles$MultipleCountryProfiles.f94594c
            boolean r6 = r2.c(r6)
            if (r6 == 0) goto L4b
            goto L8e
        L4b:
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L29
            ang.f r6 = r4.f252237b     // Catch: java.lang.Throwable -> L29
            r2 = 0
            efm.d0 r6 = r6.f(r2)     // Catch: java.lang.Throwable -> L29
            r0.u = r5     // Catch: java.lang.Throwable -> L29
            r0.f252235x = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r6 = nim.a.b(r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r6 != r1) goto L5f
            return r1
        L5f:
            do3.n r6 = (do3.n) r6     // Catch: java.lang.Throwable -> L29
            java.lang.String r6 = r6.f116408a     // Catch: java.lang.Throwable -> L29
            java.lang.String r5 = r5.getF105264c()     // Catch: java.lang.Throwable -> L29
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r6, r5)     // Catch: java.lang.Throwable -> L29
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L29
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L29
            goto L78
        L72:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
        L78:
            java.lang.Throwable r6 = yhm.m.a(r5)
            if (r6 == 0) goto L81
            hx7.e.n(r6)
        L81:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r0 = r5 instanceof yhm.n
            if (r0 == 0) goto L88
            r5 = r6
        L88:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r3 = r5.booleanValue()
        L8e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r7i.p.f(com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount, gim.c):java.lang.Object");
    }

    public final boolean g(TradingAccount tradingAccount) {
        if ((tradingAccount instanceof TradingAccount.GIA) || (tradingAccount instanceof TradingAccount.Margin) || (tradingAccount instanceof TradingAccount.MoneyMarketFunds) || (tradingAccount instanceof TradingAccount.PaperTrading) || (tradingAccount instanceof TradingAccount.Robo)) {
            return true;
        }
        if (tradingAccount instanceof TradingAccount.TaxAdvantage) {
            return ((jte.d) this.f252236a).c(FeatureWealthApi$Toggles.CommoditiesMoveMoney.f95156c);
        }
        if (tradingAccount instanceof TradingAccount.Unknown) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean h(TradingAccount tradingAccount) {
        if ((tradingAccount instanceof TradingAccount.GIA) || (tradingAccount instanceof TradingAccount.Margin) || (tradingAccount instanceof TradingAccount.MoneyMarketFunds) || (tradingAccount instanceof TradingAccount.PaperTrading) || (tradingAccount instanceof TradingAccount.Robo)) {
            return true;
        }
        boolean z = tradingAccount instanceof TradingAccount.TaxAdvantage.Isa;
        gte.a aVar = this.f252236a;
        if (z) {
            return ((jte.d) aVar).c(FeatureWealthApi$Toggles.InvestIsaMoveMoneyInvest.f95159c);
        }
        if (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Personal) {
            return ((jte.d) aVar).c(FeatureWealthApi$Toggles.TeenInvestJisaMoveMoney.f95169c);
        }
        if (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Custodian) {
            return ((jte.d) aVar).c(FeatureWealthApi$Toggles.JuniorInvestJisaMoveMoney.f95166c);
        }
        if ((tradingAccount instanceof TradingAccount.TaxAdvantage.Pea) || (tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) || (tradingAccount instanceof TradingAccount.Unknown)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
