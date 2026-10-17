package csl;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.stockdetails.api.navigation.StockDetailsFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import efm.d0;
import grl.k9;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements udf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1l.e f108533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.b f108534b;

    public c(c1l.e tradingOnboardingStartCommandProvider, ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(tradingOnboardingStartCommandProvider, "tradingOnboardingStartCommandProvider");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f108533a = tradingOnboardingStartCommandProvider;
        this.f108534b = instrumentTickerInteractor;
    }

    public final ufm.b a(FeatureCommand featureCommand, nel.n nVar, TradingAccount tradingAccount) {
        TradingOnboardingFeatureConfig.TradingAccountOrType withTradingAccount;
        List listC;
        k9 value = k9.Trading;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        FeatureCommand featureCommandF = gc0.c.f(new StockDetailsFeatureConfig(nVar.f214596b, null, 122));
        if (tradingAccount instanceof TradingAccount.TaxAdvantage) {
            TradingAccount.TaxAdvantage taxAdvantage = (TradingAccount.TaxAdvantage) tradingAccount;
            if (taxAdvantage instanceof TradingAccount.TaxAdvantage.Isa) {
                listC = u.c(TradingProductCode.IsaGB.f105316a);
            } else if (taxAdvantage instanceof TradingAccount.TaxAdvantage.JIsa) {
                listC = u.c(TradingProductCode.JIsaGB.f105317a);
            } else if (taxAdvantage instanceof TradingAccount.TaxAdvantage.Pea) {
                listC = u.c(TradingProductCode.PeaFr.f105321a);
            } else {
                if (!(taxAdvantage instanceof TradingAccount.TaxAdvantage.Unknown)) {
                    throw new NoWhenBranchMatchedException();
                }
                listC = f0.f322471a;
            }
            withTradingAccount = new TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountAndProducts(tradingAccount, listC);
        } else {
            withTradingAccount = new TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccount(tradingAccount);
        }
        return this.f108533a.b(featureCommand, new TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig(featureCommandF, withTradingAccount, null, new EndPromptParams(true, EndPromptType.TRADING), new AnalyticsProduct.Retail(value)), null);
    }

    public final ufm.i b(String securityRef, bfl.g tradeSide, TradingAccount tradingAccount, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        d0 d0VarFirstOrError = m70.a.g(((ael.k) this.f108534b).f(securityRef), null, new clk.b(24), 1).firstOrError();
        b bVar = new b(1, new a5b.b(tradingAccount, this, tradeSide, bigDecimal, 20));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, bVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final ufm.i c(String securityRef, bfl.g tradeSide, TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        d0 d0VarFirstOrError = m70.a.g(((ael.k) this.f108534b).f(securityRef), null, new clk.b(25), 1).firstOrError();
        b bVar = new b(2, new c1g.o(tradingAccount, 21, this, tradeSide));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, bVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final ufm.i d(TradingAccount tradingAccount, String securityRef) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        d0 d0VarFirstOrError = m70.a.g(((ael.k) this.f108534b).f(securityRef), null, new clk.b(23), 1).firstOrError();
        b bVar = new b(0, new cma.b(tradingAccount, this, 20));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, bVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
