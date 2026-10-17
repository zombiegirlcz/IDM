package ghh;

import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import dv5.p;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f143935b;

    public /* synthetic */ e(f fVar, int i) {
        this.f143934a = i;
        this.f143935b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f143934a) {
            case 0:
                xi0.b transferCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(transferCurrency, "transferCurrency");
                return nim.a.v(this.f143935b.f143937b.p(transferCurrency), new p(27, transferCurrency));
            default:
                gte.a aVar = this.f143935b.f143938c;
                TradingAccount.TaxAdvantage taaTradingAccount = (TradingAccount.TaxAdvantage) obj2;
                Intrinsics.checkNotNullParameter(taaTradingAccount, "taaTradingAccount");
                if (taaTradingAccount instanceof TradingAccount.TaxAdvantage.Isa) {
                    od0.h hVar = od0.i.Companion;
                    Set setA = l1h.a.a(((jte.d) aVar).c(FeatureWealthApi$Toggles.CommoditiesMoveMoney.f95156c), true, ((jte.d) aVar).c(FeatureWealthApi$Toggles.InvestIsaMoveMoneyInvest.f95159c), false);
                    hVar.getClass();
                    return od0.h.a(setA);
                }
                if (taaTradingAccount instanceof TradingAccount.TaxAdvantage.JIsa) {
                    od0.h hVar2 = od0.i.Companion;
                    Set setA2 = l1h.a.a(false, false, false, false);
                    hVar2.getClass();
                    return od0.h.a(setA2);
                }
                if (!(taaTradingAccount instanceof TradingAccount.TaxAdvantage.Pea) && !(taaTradingAccount instanceof TradingAccount.TaxAdvantage.Unknown)) {
                    throw new NoWhenBranchMatchedException();
                }
                od0.i.Companion.getClass();
                return od0.i.f224256b;
        }
    }
}
