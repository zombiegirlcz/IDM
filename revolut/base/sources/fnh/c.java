package fnh;

import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsCollectionAssetsTypeFilterValue;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionTimeframeFilterValue;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public final Map a(knh.b source) {
        InstrumentsCollectionAssetsTypeFilterValue instrumentsCollectionAssetsTypeFilterValue;
        Intrinsics.checkNotNullParameter(source, "source");
        InstrumentsTrendCollectionId instrumentsTrendCollectionId = source.f186164a;
        if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.MostTraded.f74902a)) {
            Pair pair = new Pair(ph7.b.TIMEFRAME, InstrumentsTrendCollectionTimeframeFilterValue.ONE_WEEK);
            ph7.b bVar = ph7.b.ASSETS_TYPE;
            knh.a aVar = source.f186165b;
            int i = b.f136686a[aVar.ordinal()];
            if (i == 1) {
                instrumentsCollectionAssetsTypeFilterValue = InstrumentsCollectionAssetsTypeFilterValue.CFDS;
            } else if (i == 2) {
                instrumentsCollectionAssetsTypeFilterValue = InstrumentsCollectionAssetsTypeFilterValue.STOCKS;
            } else if (i == 3) {
                instrumentsCollectionAssetsTypeFilterValue = InstrumentsCollectionAssetsTypeFilterValue.ETFS;
            } else {
                if (i != 4) {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalArgumentException("Asset type " + aVar + " is not supported");
                }
                instrumentsCollectionAssetsTypeFilterValue = InstrumentsCollectionAssetsTypeFilterValue.BONDS;
            }
            return r0.k(pair, new Pair(bVar, instrumentsCollectionAssetsTypeFilterValue));
        }
        if (instrumentsTrendCollectionId instanceof InstrumentsTrendCollectionId.Bonds) {
            return r0.g();
        }
        if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.CfdsPnlDrivers.f74894a)) {
            return q0.c(new Pair(ph7.b.TIMEFRAME, InstrumentsTrendCollectionTimeframeFilterValue.ONE_DAY));
        }
        if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.MostShortedCfds.f74901a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.IndexEtfs.f74900a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.TechnologyEtfs.f74906a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.EtnsCryptoExposure.f74897a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.EtcsCommodityExposure.f74896a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.PreciousMetalsEtcs.f74904a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.EtpsLeveraged.f74898a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.RecommendedBuy.f74905a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.DividendLeaders.f74895a)) {
            return r0.g();
        }
        if (!Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.PopularStarterCfds.f74903a) && !Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.FreeStocks.f74899a)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("Collection " + source.f186164a + " is not supported");
    }
}
