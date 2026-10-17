package fnh;

import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public final ph7.c a(InstrumentsTrendCollectionId collectionId) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        if (collectionId.equals(InstrumentsTrendCollectionId.MostShortedCfds.f74901a)) {
            return ph7.c.CFDS_MOST_SHORTED;
        }
        if (collectionId.equals(InstrumentsTrendCollectionId.MostTraded.f74902a)) {
            return ph7.c.MOST_TRADED;
        }
        if (collectionId instanceof InstrumentsTrendCollectionId.Bonds) {
            return ph7.c.ALL_BONDS;
        }
        if (collectionId.equals(InstrumentsTrendCollectionId.CfdsPnlDrivers.f74894a)) {
            return ph7.c.CFDS_PNL_DRIVERS;
        }
        if (collectionId.equals(InstrumentsTrendCollectionId.IndexEtfs.f74900a)) {
            return ph7.c.INDEX_ETFS;
        }
        if (collectionId.equals(InstrumentsTrendCollectionId.TechnologyEtfs.f74906a)) {
            return ph7.c.TECHNOLOGY_ETFS;
        }
        if (collectionId.equals(InstrumentsTrendCollectionId.EtnsCryptoExposure.f74897a)) {
            return ph7.c.ETNS_CRYPTO_EXPOSURE;
        }
        if (collectionId.equals(InstrumentsTrendCollectionId.EtcsCommodityExposure.f74896a)) {
            return ph7.c.ETCS_COMMODITY_EXPOSURE;
        }
        if (collectionId.equals(InstrumentsTrendCollectionId.PreciousMetalsEtcs.f74904a)) {
            return ph7.c.PRECIOUS_METALS_ETCS;
        }
        if (collectionId.equals(InstrumentsTrendCollectionId.EtpsLeveraged.f74898a)) {
            return ph7.c.ETPS_LEVERAGED;
        }
        if (collectionId.equals(InstrumentsTrendCollectionId.DividendLeaders.f74895a)) {
            return ph7.c.DIV_YLD;
        }
        if (collectionId.equals(InstrumentsTrendCollectionId.RecommendedBuy.f74905a)) {
            return ph7.c.RECOMMENDED_BUY;
        }
        if (!collectionId.equals(InstrumentsTrendCollectionId.PopularStarterCfds.f74903a) && !collectionId.equals(InstrumentsTrendCollectionId.FreeStocks.f74899a)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("Collection " + collectionId + " is not supported");
    }
}
