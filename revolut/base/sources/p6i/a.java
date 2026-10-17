package p6i;

import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import h6i.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends n {

    /* JADX INFO: renamed from: p6i.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1292a implements l {

        /* JADX INFO: renamed from: p6i.a$a$a, reason: collision with other inner class name */
        public static final class C1293a extends AbstractC1292a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1293a f233314a = new C1293a();

            private C1293a() {
            }
        }

        /* JADX INFO: renamed from: p6i.a$a$b */
        public static final class b extends AbstractC1292a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f233315a = new b();

            private b() {
            }
        }

        private AbstractC1292a() {
        }
    }

    @Override // p6i.n
    public final Object b(f0 f0Var, m mVar) {
        TradingAccount.TaxAdvantage.Limit f105255l;
        TradingAccount.TaxAdvantage.Limit.TopUpLimit topUpLimit;
        if (!f0Var.f149666c) {
            AccountSource accountSource = f0Var.f149664a.d;
            if (!(accountSource instanceof AccountSource.InvestCashHolding)) {
                accountSource = null;
            }
            AccountSource.InvestCashHolding investCashHolding = (AccountSource.InvestCashHolding) accountSource;
            TradingAccount tradingAccount = investCashHolding != null ? investCashHolding.f97198a : null;
            TradingAccount.TaxAdvantage taxAdvantage = (TradingAccount.TaxAdvantage) (tradingAccount instanceof TradingAccount.TaxAdvantage ? tradingAccount : null);
            if (taxAdvantage != null && (f105255l = taxAdvantage.getF105255l()) != null && (topUpLimit = f105255l.f105246a) != null && f0Var.f149665b > topUpLimit.f105249c.f115082a) {
                return AbstractC1292a.C1293a.f233314a;
            }
        }
        return AbstractC1292a.b.f233315a;
    }
}
