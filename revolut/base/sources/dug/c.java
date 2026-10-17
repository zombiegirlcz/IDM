package dug;

import a09.z;
import ael.q0;
import akg.n;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import dkk.a0;
import du7.e2;
import efm.d0;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rfm.f0;
import sri.m;
import wp5.y;
import ybl.k;
import yhm.j;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements ntg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f117971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ktg.a f117972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f117973c;
    public final Lazy d;

    public c(m navigator, ktg.a accountClosureInteractor, k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(accountClosureInteractor, "accountClosureInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f117971a = navigator;
        this.f117972b = accountClosureInteractor;
        this.f117973c = tradingAccountsInteractor;
        this.d = j.b(new e2(26));
    }

    public static mtg.b c(TradingAccount tradingAccount) {
        if (tradingAccount instanceof TradingAccount.GIA) {
            return mtg.b.TRADING;
        }
        if (tradingAccount instanceof TradingAccount.Margin) {
            return mtg.b.MARGIN;
        }
        if (tradingAccount instanceof TradingAccount.Robo.Regular) {
            return mtg.b.ROBO;
        }
        if (!(tradingAccount instanceof TradingAccount.TaxAdvantage.Pea) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Isa)) {
            if (!(tradingAccount instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount instanceof TradingAccount.Robo) && !(tradingAccount instanceof TradingAccount.TaxAdvantage) && !(tradingAccount instanceof TradingAccount.PaperTrading) && !(tradingAccount instanceof TradingAccount.Unknown)) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException(("Trading Account of type: " + tradingAccount.W() + " not supported in account closure deeplink.").toString());
        }
        return mtg.b.TAA;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "account-closure") && cVar.e(3).length() == 0;
    }

    public final f0 b(jf0.c cVar) {
        n nVarH;
        String str = (String) cVar.d.get("portfolioId");
        k kVar = this.f117973c;
        if (str != null) {
            nVarH = ((q0) kVar).o(str, w4l.h.f294642c);
        } else {
            nVarH = k.h(kVar, TradingAccountType.Gia.f105270a, null, 6);
        }
        d0 d0VarFirstOrError = zi0.c.J(pd.b.r(rd0.e.c(nVarH, kotlin.coroutines.g.f186406a), new a(this, 0))).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return zi0.c.t(d0VarFirstOrError);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof dug.b
            if (r0 == 0) goto L13
            r0 = r6
            dug.b r0 = (dug.b) r0
            int r1 = r0.f117970w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f117970w = r1
            goto L1a
        L13:
            dug.b r0 = new dug.b
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f117970w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            rfm.f0 r5 = r4.b(r5)
            r0.f117970w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            yhm.r r6 = (yhm.r) r6
            java.lang.Object r5 = r6.f314201a
            com.revolut.retail.trading.core.domain.account_closure.AccountClosureStatus r5 = (com.revolut.retail.trading.core.domain.account_closure.AccountClosureStatus) r5
            java.lang.Object r0 = r6.f314202b
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r0 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount) r0
            java.lang.Object r6 = r6.f314203c
            java.lang.String r6 = (java.lang.String) r6
            boolean r5 = r5 instanceof com.revolut.retail.trading.core.domain.account_closure.AccountClosureStatus.NoAccountClosure
            r1 = 0
            if (r5 != 0) goto L55
            return r1
        L55:
            c(r0)
            com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig r5 = new com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig
            com.revolut.feature.wealth.account_closure.api.navigation.AccountClosureDestination r0 = new com.revolut.feature.wealth.account_closure.api.navigation.AccountClosureDestination
            r0.<init>(r6)
            yhi.b r6 = yhi.b.POPUP
            r2 = 12
            r5.<init>(r0, r6, r1, r2)
            com.revolut.retail.core.navigation.FeatureCommand r5 = gc0.c.f(r5)
            q06.h r6 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r0.<init>(r5)
            r6.<init>(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dug.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c cVar, boolean z) {
        if (!y.D(cVar, "deeplink", 2, "account-closure")) {
            throw new IllegalStateException(j6.a.q("provide handler for ", cVar.e(2)));
        }
        ufm.i iVar = new ufm.i(new ufm.i(b(cVar), new a0(new z(this, cVar, z, 18), 26), 0), new cie.b(29), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.I(iVar, h0.f322473a, new ds4.b(5));
    }
}
