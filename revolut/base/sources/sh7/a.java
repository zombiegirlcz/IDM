package sh7;

import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ph7.c;
import xii.b;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements b {

    @NotNull
    private static final C1461a Companion = new C1461a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f263441a;

    /* JADX INFO: renamed from: sh7.a$a, reason: collision with other inner class name */
    public static final class C1461a {
        private C1461a() {
        }
    }

    public a() {
        String[] elements = {"instruments/most-traded", "instruments/most-traded/stock", "instruments/most-traded/security", "instruments/cfds-pnl-drivers", "instruments/popular-starter-cfds", "instruments/etns-crypto-exposure", "instruments/etcs-commodity-exposure", "instruments/etps-leveraged"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f263441a = d.y0(elements);
    }

    public static c b(String str, InstrumentsTrendCollectionId instrumentsTrendCollectionId) {
        if (instrumentsTrendCollectionId.equals(InstrumentsTrendCollectionId.MostTraded.f74902a)) {
            int iHashCode = str.hashCode();
            if (iHashCode == -1997566020) {
                if (str.equals("MOST_TRADED")) {
                    return c.MOST_TRADED;
                }
                return null;
            }
            if (iHashCode == 1651518480) {
                if (str.equals("MOST_SOLD")) {
                    return c.MOST_SOLD;
                }
                return null;
            }
            if (iHashCode == 1779904807 && str.equals("MOST_BOUGHT")) {
                return c.MOST_BOUGHT;
            }
            return null;
        }
        if (instrumentsTrendCollectionId.equals(InstrumentsTrendCollectionId.CfdsPnlDrivers.f74894a)) {
            int iHashCode2 = str.hashCode();
            if (iHashCode2 == -1965470160) {
                if (str.equals("PROFIT_DRIVERS")) {
                    return c.CFDS_PROFIT_DRIVERS;
                }
                return null;
            }
            if (iHashCode2 == -1423864817) {
                if (str.equals("LOSS_DRIVERS")) {
                    return c.CFDS_LOSS_DRIVERS;
                }
                return null;
            }
            if (iHashCode2 == 64897 && str.equals("ALL")) {
                return c.CFDS_PNL_DRIVERS;
            }
            return null;
        }
        if (instrumentsTrendCollectionId.equals(InstrumentsTrendCollectionId.PopularStarterCfds.f74903a)) {
            return null;
        }
        if (instrumentsTrendCollectionId.equals(InstrumentsTrendCollectionId.MostShortedCfds.f74901a) || (instrumentsTrendCollectionId instanceof InstrumentsTrendCollectionId.Bonds) || instrumentsTrendCollectionId.equals(InstrumentsTrendCollectionId.IndexEtfs.f74900a) || instrumentsTrendCollectionId.equals(InstrumentsTrendCollectionId.TechnologyEtfs.f74906a) || instrumentsTrendCollectionId.equals(InstrumentsTrendCollectionId.EtnsCryptoExposure.f74897a) || instrumentsTrendCollectionId.equals(InstrumentsTrendCollectionId.EtcsCommodityExposure.f74896a) || instrumentsTrendCollectionId.equals(InstrumentsTrendCollectionId.EtpsLeveraged.f74898a) || instrumentsTrendCollectionId.equals(InstrumentsTrendCollectionId.DividendLeaders.f74895a) || instrumentsTrendCollectionId.equals(InstrumentsTrendCollectionId.RecommendedBuy.f74905a) || instrumentsTrendCollectionId.equals(InstrumentsTrendCollectionId.FreeStocks.f74899a) || instrumentsTrendCollectionId.equals(InstrumentsTrendCollectionId.PreciousMetalsEtcs.f74904a)) {
            throw new IllegalArgumentException(str.concat(" deeplink is not supported"));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xii.b
    public final Set a() {
        return this.f263441a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f8  */
    @Override // xii.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.kompot.common.ParcelableDestination e(lg0.e r17) {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sh7.a.e(lg0.e):com.revolut.kompot.common.ParcelableDestination");
    }
}
