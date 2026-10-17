package re2;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g VALUE_LOWER_THAN_ORIGINAL;
    public static final g VALUE_OVER_MAX_LIMIT;

    static {
        g gVar = new g("VALUE_LOWER_THAN_ORIGINAL", 0);
        VALUE_LOWER_THAN_ORIGINAL = gVar;
        g gVar2 = new g("VALUE_OVER_MAX_LIMIT", 1);
        VALUE_OVER_MAX_LIMIT = gVar2;
        g[] gVarArr = {gVar, gVar2};
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
