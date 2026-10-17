package rsd;

import com.revolut.feature.crypto_investments.api.model.PocketBalancesWithSum;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TradingLegalEntityInformation f257056b;

    public /* synthetic */ g(TradingLegalEntityInformation tradingLegalEntityInformation, int i) {
        this.f257055a = i;
        this.f257056b = tradingLegalEntityInformation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f257055a) {
            case 0:
                PocketBalancesWithSum pocketBalancesWithSum = (PocketBalancesWithSum) obj2;
                Intrinsics.checkNotNullParameter(pocketBalancesWithSum, "pocketBalancesWithSum");
                return new tsd.d(pocketBalancesWithSum.f71384a.size(), pocketBalancesWithSum.f71385b, this.f257056b);
            case 1:
                List portfoliosWithBalance = (List) obj2;
                Intrinsics.checkNotNullParameter(portfoliosWithBalance, "portfoliosWithBalance");
                int size = portfoliosWithBalance.size();
                dj0.d.Companion.getClass();
                dj0.d dVarQ = dj0.d.e;
                int i = 0;
                for (Object obj3 : portfoliosWithBalance) {
                    int i2 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    dVarQ = i == 0 ? mif.a.Q(((del.b) ((Pair) obj3).f186386b).f113708a) : pyd.c.O(dVarQ, mif.a.Q(((del.b) ((Pair) obj3).f186386b).f113708a));
                    i = i2;
                }
                return new tsd.e(size, dVarQ, this.f257056b);
            default:
                return u87.e.a((u87.e) obj2, null, null, null, null, null, null, null, this.f257056b, null, 383);
        }
    }
}
