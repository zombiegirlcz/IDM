package rzj;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g COMMODITIES;
    public static final g CRYPTO;
    public static final g STOCKS;
    public static final g UNKNOWN;

    static {
        g gVar = new g("STOCKS", 0);
        STOCKS = gVar;
        g gVar2 = new g("CRYPTO", 1);
        CRYPTO = gVar2;
        g gVar3 = new g("COMMODITIES", 2);
        COMMODITIES = gVar3;
        g gVar4 = new g("UNKNOWN", 3);
        UNKNOWN = gVar4;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
