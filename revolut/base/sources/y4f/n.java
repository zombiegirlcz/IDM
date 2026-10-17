package y4f;

import ael.t;
import ael.y;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vdl.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f310913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.trading.impl.ui.holdings.information.entry.a f310914b;

    public /* synthetic */ n(com.revolut.feature.trading.impl.ui.holdings.information.entry.a aVar, int i) {
        this.f310913a = i;
        this.f310914b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        TradingAccount.Portfolio portfolio = (TradingAccount.Portfolio) obj2;
        switch (this.f310913a) {
            case 0:
                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                t tVar = this.f310914b.f91221r;
                String portfolioId = portfolio.f105210a.toString();
                Intrinsics.checkNotNullExpressionValue(portfolioId, "toString(...)");
                n9l.b ratesUpdatePeriod = n9l.b.SEC_10;
                xi0.b.Companion.getClass();
                xi0.b targetCurrency = xi0.b.i;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                Intrinsics.checkNotNullParameter(ratesUpdatePeriod, "ratesUpdatePeriod");
                Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
                return rd0.e.b(pd.b.r(rd0.e.c(nim.a.v(((y) tVar.d).e(portfolioId, w4l.i.f294643c), new aed.a(14)), kotlin.coroutines.g.f186406a), new a31.m(tVar, 8, ratesUpdatePeriod, targetCurrency)));
            default:
                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                ybl.d dVar = this.f310914b.f91220q;
                String portfolioId2 = portfolio.f105210a.toString();
                Intrinsics.checkNotNullExpressionValue(portfolioId2, "toString(...)");
                y yVar = (y) dVar;
                yVar.getClass();
                Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                w4l.i loadingStrategy = w4l.i.f294643c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                p0 p0Var = yVar.f3682a;
                p0Var.getClass();
                Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return rd0.e.b(p0Var.i.e(portfolioId2, loadingStrategy));
        }
    }
}
