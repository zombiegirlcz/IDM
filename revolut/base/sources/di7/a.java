package di7;

import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsCollectionAssetsTypeFilterValue;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionFilterValue;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionTimeframeFilterValue;
import com.revolut.feature.instruments.trend.collections.api.model.cfdspnldrivers.InstrumentsCfdsPnlDriversCollectionKeyFilterValue;
import com.revolut.feature.instruments.trend.collections.api.model.mosttraded.InstrumentsMostTradedCollectionKeyFilterValue;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentsTrendCollectionId f114936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f114937b;

    public a(InstrumentsTrendCollectionId collectionId, Map filters) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f114936a = collectionId;
        this.f114937b = filters;
    }

    public final String a() {
        String str;
        String strName;
        InstrumentsTrendCollectionId.MostTraded mostTraded = InstrumentsTrendCollectionId.MostTraded.f74902a;
        InstrumentsTrendCollectionId instrumentsTrendCollectionId = this.f114936a;
        if (Intrinsics.f(instrumentsTrendCollectionId, mostTraded)) {
            str = "mosttraded";
        } else if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.PopularStarterCfds.f74903a)) {
            str = "popularstartercfds";
        } else if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.CfdsPnlDrivers.f74894a)) {
            str = "cfdspnldrivers";
        } else if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.MostShortedCfds.f74901a)) {
            str = "mostshortedcfds";
        } else if (instrumentsTrendCollectionId instanceof InstrumentsTrendCollectionId.Bonds) {
            str = "bonds_" + ((InstrumentsTrendCollectionId.Bonds) instrumentsTrendCollectionId).f74893a;
        } else if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.IndexEtfs.f74900a)) {
            str = "indexetfs";
        } else if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.TechnologyEtfs.f74906a)) {
            str = "technologyttfs";
        } else if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.EtnsCryptoExposure.f74897a)) {
            str = "etnscryptoexposure";
        } else if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.EtcsCommodityExposure.f74896a)) {
            str = "etcscommodityexposure";
        } else if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.EtpsLeveraged.f74898a)) {
            str = "etpsleveraged";
        } else if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.DividendLeaders.f74895a)) {
            str = "dividendleaders";
        } else if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.RecommendedBuy.f74905a)) {
            str = "recommendedbuy";
        } else if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.FreeStocks.f74899a)) {
            str = "freestocks";
        } else {
            if (!Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.PreciousMetalsEtcs.f74904a)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "preciousmetalsetcs";
        }
        Set<Map.Entry> setEntrySet = this.f114937b.entrySet();
        ArrayList arrayList = new ArrayList(w.t(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            ph7.b bVar = (ph7.b) entry.getKey();
            InstrumentsTrendCollectionFilterValue instrumentsTrendCollectionFilterValue = (InstrumentsTrendCollectionFilterValue) entry.getValue();
            if (instrumentsTrendCollectionFilterValue instanceof InstrumentsMostTradedCollectionKeyFilterValue) {
                strName = null;
            } else if (instrumentsTrendCollectionFilterValue instanceof InstrumentsTrendCollectionTimeframeFilterValue) {
                strName = ((InstrumentsTrendCollectionTimeframeFilterValue) instrumentsTrendCollectionFilterValue).name();
            } else if (instrumentsTrendCollectionFilterValue instanceof InstrumentsCollectionAssetsTypeFilterValue) {
                strName = ((InstrumentsCollectionAssetsTypeFilterValue) instrumentsTrendCollectionFilterValue).name();
            } else {
                if (!(instrumentsTrendCollectionFilterValue instanceof InstrumentsCfdsPnlDriversCollectionKeyFilterValue)) {
                    throw new IllegalArgumentException("Can't cache filter value " + instrumentsTrendCollectionFilterValue);
                }
                strName = ((InstrumentsCfdsPnlDriversCollectionKeyFilterValue) instrumentsTrendCollectionFilterValue).name();
            }
            arrayList.add(bVar + ":" + strName);
        }
        return d0.k0(v.k(str, "SECURITY", arrayList.toString()), "_", null, null, 0, null, 62);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f114936a, aVar.f114936a) && Intrinsics.f(this.f114937b, aVar.f114937b);
    }

    public final int hashCode() {
        return this.f114937b.hashCode() + (this.f114936a.hashCode() * 31);
    }
}
