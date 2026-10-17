package zrl;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import dj0.d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ppk.f;
import rd0.e;
import su9.c;
import wg9.p;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements e4i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f324784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f324785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l4i.a f324786c;

    public b(c fxQuoteProvider, f ratesInteractor, l4i.a amountConverter) {
        Intrinsics.checkNotNullParameter(fxQuoteProvider, "fxQuoteProvider");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.f324784a = fxQuoteProvider;
        this.f324785b = ratesInteractor;
        this.f324786c = amountConverter;
    }

    public final Flow a(wrl.c request, Asset moneyInputAsset) {
        Flow flowV;
        TradingAccount.TaxAdvantage.Limit limit;
        TradingAccount.TaxAdvantage.Limit.TopUpLimit topUpLimit;
        d dVar;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(moneyInputAsset, "moneyInputAsset");
        Amount amount = request.f299637g.f91795b;
        TradingAccount tradingAccount = request.f299634a;
        Amount amountE = null;
        if ((tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) && (limit = ((TradingAccount.TaxAdvantage.Isa) tradingAccount).f105227l) != null && (topUpLimit = limit.f105246a) != null && (dVar = topUpLimit.f105249c) != null) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            e().getClass();
            amountE = l4i.a.e(dVar);
        }
        Amount amount2 = amountE;
        if (amount2 == null) {
            flowV = zi0.c.i(amount);
        } else {
            Asset asset = amount.f104718b;
            xi0.b bVar = amount2.f104718b.f104721c;
            xi0.b bVar2 = asset.f104721c;
            flowV = nim.a.v(Intrinsics.f(bVar, bVar2) ? zi0.c.i(amount2) : nim.a.v(e.b(this.f324785b.b(v1.c.w(bVar, bVar2), false)), new p(bVar, bVar2, amount2, asset, 18)), new orb.a(amount));
        }
        return boh.f.e(nim.a.v(boh.f.e(flowV, new a(request, this)), new a(this, request)), new zp5.f(this, moneyInputAsset, 2));
    }

    @Override // e4i.a
    public final l4i.a e() {
        return this.f324786c;
    }
}
