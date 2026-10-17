package pdh;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g COMPLETED;
    public static final g FAILED;
    public static final g NONE;
    public static final g OFFBOARDED;
    public static final g PENDING;
    public static final g UNKNOWN;

    static {
        g gVar = new g("NONE", 0);
        NONE = gVar;
        g gVar2 = new g("COMPLETED", 1);
        COMPLETED = gVar2;
        g gVar3 = new g("PENDING", 2);
        PENDING = gVar3;
        g gVar4 = new g("FAILED", 3);
        FAILED = gVar4;
        g gVar5 = new g("OFFBOARDED", 4);
        OFFBOARDED = gVar5;
        g gVar6 = new g("UNKNOWN", 5);
        UNKNOWN = gVar6;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6};
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
