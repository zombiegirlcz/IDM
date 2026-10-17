package m6f;

import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r ASSETS;
    public static final r REGIONS;
    public static final r SECTORS;
    private final int nameResId;

    static {
        r rVar = new r("ASSETS", 0, R$string.managed_portfolios_details_allocation_tab_assets);
        ASSETS = rVar;
        r rVar2 = new r("REGIONS", 1, R$string.managed_portfolios_details_allocation_tab_regions);
        REGIONS = rVar2;
        r rVar3 = new r("SECTORS", 2, R$string.managed_portfolios_details_allocation_tab_sectors);
        SECTORS = rVar3;
        r[] rVarArr = {rVar, rVar2, rVar3};
        $VALUES = rVarArr;
        $ENTRIES = vc.s.n(rVarArr);
    }

    public r(String str, int i, int i2) {
        this.nameResId = i2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public final int b() {
        return this.nameResId;
    }
}
