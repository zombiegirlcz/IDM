package nh7;

import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import java.util.List;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CFDS_PNL_DRIVERS;
    public static final d MOST_TRADED;
    public static final d POPULAR_STARTER_CFDS;
    public static final d RECOMMENDED_BUYS;

    @NotNull
    private final InstrumentsTrendCollectionId collectionId;

    @NotNull
    private final String defaultWidgetType;

    @NotNull
    private final c displayMode;

    @NotNull
    private final List<String> widgetTypes;

    static {
        d dVar = new d("MOST_TRADED", 0, InstrumentsTrendCollectionId.MostTraded.f74902a, new a(ph7.c.MOST_TRADED), u.c("MostTradedDynamic"));
        MOST_TRADED = dVar;
        d dVar2 = new d("POPULAR_STARTER_CFDS", 1, InstrumentsTrendCollectionId.PopularStarterCfds.f74903a, new a(ph7.c.POPULAR_FIRST_TIME_BUYS_CFDS), u.c("PopularFirstBuysCfdsDynamic"));
        POPULAR_STARTER_CFDS = dVar2;
        d dVar3 = new d("CFDS_PNL_DRIVERS", 2, InstrumentsTrendCollectionId.CfdsPnlDrivers.f74894a, new b(v.k(ph7.c.CFDS_PROFIT_DRIVERS, ph7.c.CFDS_LOSS_DRIVERS)), u.c("CfdsPnLDriversDynamic"));
        CFDS_PNL_DRIVERS = dVar3;
        d dVar4 = new d("RECOMMENDED_BUYS", 3, InstrumentsTrendCollectionId.RecommendedBuy.f74905a, new a(ph7.c.RECOMMENDED_BUY), u.c("RecommendedBuysDynamic"));
        RECOMMENDED_BUYS = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public d(String str, int i, InstrumentsTrendCollectionId instrumentsTrendCollectionId, c cVar, List list) {
        String str2 = (String) d0.b0(list);
        this.collectionId = instrumentsTrendCollectionId;
        this.displayMode = cVar;
        this.widgetTypes = list;
        this.defaultWidgetType = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final InstrumentsTrendCollectionId a() {
        return this.collectionId;
    }

    public final String b() {
        return this.defaultWidgetType;
    }

    public final c c() {
        return this.displayMode;
    }

    public final List d() {
        return this.widgetTypes;
    }
}
