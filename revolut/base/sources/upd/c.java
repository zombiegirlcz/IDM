package upd;

import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nel.j0;
import nel.z;
import zhm.d0;
import zhm.z0;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.d f281960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.b f281961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ael.q f281962c;
    public final su9.c d;
    public final gte.a e;
    public final HashSet f;

    public c(ybl.d portfolioInteractor, ybl.b instrumentTickerInteractor, ael.q pnlInteractor, su9.c walletCurrencyMoneyConverter, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(pnlInteractor, "pnlInteractor");
        Intrinsics.checkNotNullParameter(walletCurrencyMoneyConverter, "walletCurrencyMoneyConverter");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f281960a = portfolioInteractor;
        this.f281961b = instrumentTickerInteractor;
        this.f281962c = pnlInteractor;
        this.d = walletCurrencyMoneyConverter;
        this.e = featureToggleInteractor;
        this.f = z0.e("EU_COMPLEX_ETFS", "GB_COMPLEX_ETFS");
    }

    public static IncomeSorterDestinationInfo.Investment.Instrument a(nel.n nVar, String str, TradingAccount tradingAccount, com.revolut.feature.spending_analytics.api.models.income_sorter.a aVar, hel.b bVar, kel.n nVar2, del.a aVar2, dj0.d dVar) {
        return new IncomeSorterDestinationInfo.Investment.Instrument(nVar.f214596b, nVar.d, nVar.e, nVar.i, nVar2 != null ? nVar2.f183174b : null, aVar2 != null ? aVar2.b() : null, dVar, aVar2 != null ? aVar2.a() : null, aVar2 != null ? aVar2.d : null, str, aVar, bVar, tradingAccount.getD() == cfl.b.ONBOARDING ? zld.a.PENDING : zld.a.ACTIVE, aVar == com.revolut.feature.spending_analytics.api.models.income_sorter.a.CUSTODIAN_JISA ? tradingAccount.getF().f105176b : null);
    }

    public final boolean b(nel.n nVar, InstrumentTicker instrumentTicker) {
        Boolean boolValueOf;
        List list;
        boolean z;
        if ((io3.h.n(nVar.f214597c) || nVar.f214597c == z.ETF) && nVar.f.f214630b) {
            j0 j0Var = nVar.f214598g;
            if (j0Var == null || (list = j0Var.f214580a) == null) {
                boolValueOf = null;
            } else {
                List list2 = list;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    z = true;
                    boolValueOf = Boolean.valueOf(z);
                } else {
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        if (!d0.h0((HashSet) it8.next(), this.f).isEmpty()) {
                            z = false;
                            break;
                        }
                    }
                    z = true;
                    boolValueOf = Boolean.valueOf(z);
                }
            }
            if (pd.b.k(boolValueOf)) {
                if (!pd.b.j(instrumentTicker != null ? Boolean.valueOf(instrumentTicker.i) : null)) {
                    return true;
                }
            }
        }
        return false;
    }
}
