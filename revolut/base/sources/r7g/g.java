package r7g;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g CHEAPEST;
    public static final g EARLIEST_DEPARTURE;
    public static final g FASTEST;
    public static final g RECOMMENDED;

    static {
        g gVar = new g("RECOMMENDED", 0);
        RECOMMENDED = gVar;
        g gVar2 = new g("CHEAPEST", 1);
        CHEAPEST = gVar2;
        g gVar3 = new g("FASTEST", 2);
        FASTEST = gVar3;
        g gVar4 = new g("EARLIEST_DEPARTURE", 3);
        EARLIEST_DEPARTURE = gVar4;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
