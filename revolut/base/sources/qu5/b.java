package qu5;

import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPosition;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPositions;
import com.revolut.feature.crypto_investments.api.model.PocketBalancesWithSum;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mre.c;
import mu5.f;
import yji.n;
import zhm.d0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends n implements ot5.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ou5.b f249252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final lal.a f249253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r39.a f249254n;
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wsg.n f249255p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tj3.a f249256q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ppk.f f249257r;

    public b(ou5.b portfolioBalanceInteractor, lal.a commodityPositionsInteractor, r39.a commodityPositionsSorterInteractor, f cryptoInvestmentsInteractor, wsg.n walletInteractor, tj3.a commodityFeatureEnabledInteractor, ppk.f ratesInteractor, c termsNavigationFactory) {
        Intrinsics.checkNotNullParameter(portfolioBalanceInteractor, "portfolioBalanceInteractor");
        Intrinsics.checkNotNullParameter(commodityPositionsInteractor, "commodityPositionsInteractor");
        Intrinsics.checkNotNullParameter(commodityPositionsSorterInteractor, "commodityPositionsSorterInteractor");
        Intrinsics.checkNotNullParameter(cryptoInvestmentsInteractor, "cryptoInvestmentsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(commodityFeatureEnabledInteractor, "commodityFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.f249252l = portfolioBalanceInteractor;
        this.f249253m = commodityPositionsInteractor;
        this.f249254n = commodityPositionsSorterInteractor;
        this.o = cryptoInvestmentsInteractor;
        this.f249255p = walletInteractor;
        this.f249256q = commodityFeatureEnabledInteractor;
        this.f249257r = ratesInteractor;
    }

    public static final PocketBalancesWithSum Z2(b bVar, PocketBalancesWithSum pocketBalancesWithSum, del.f sortBy, CryptoCommodityPositions positions, ArrayList pocketMidRates) {
        if (sortBy == null) {
            bVar.getClass();
            return pocketBalancesWithSum;
        }
        r39.a aVar = bVar.f249254n;
        List pocketBalances = pocketBalancesWithSum.f71384a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(pocketMidRates, "pocketMidRates");
        Intrinsics.checkNotNullParameter(pocketBalances, "pocketBalances");
        Intrinsics.checkNotNullParameter(sortBy, "sortBy");
        ArrayList arrayList = positions.f71383b;
        int iB = q0.b(w.t(arrayList, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : arrayList) {
            CryptoCommodityPosition cryptoCommodityPosition = (CryptoCommodityPosition) obj2;
            linkedHashMap.put(new Pair(cryptoCommodityPosition.f71379a, cryptoCommodityPosition.d.f126704b), obj2);
        }
        int iB2 = q0.b(w.t(pocketMidRates, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
        Iterator it8 = pocketMidRates.iterator();
        while (it8.hasNext()) {
            n9l.a aVar2 = (n9l.a) it8.next();
            linkedHashMap2.put(aVar2.f213661a, Double.valueOf(aVar2.f213663c));
        }
        Comparator bVar2 = new mu5.b(sortBy, aVar, linkedHashMap, linkedHashMap2);
        int i = mu5.a.f208962b[sortBy.f113715b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar2 = bVar2.reversed();
        }
        Intrinsics.h(bVar2);
        return PocketBalancesWithSum.a(pocketBalancesWithSum, d0.P0(pocketBalances, bVar2));
    }
}
