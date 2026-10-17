package u8f;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g COMPLETED;
    public static final g FAILED;
    public static final g IN_PROGRESS;
    public static final g PENDING;
    public static final g UNKNOWN;

    static {
        g gVar = new g("COMPLETED", 0);
        COMPLETED = gVar;
        g gVar2 = new g("IN_PROGRESS", 1);
        IN_PROGRESS = gVar2;
        g gVar3 = new g("PENDING", 2);
        PENDING = gVar3;
        g gVar4 = new g("FAILED", 3);
        FAILED = gVar4;
        g gVar5 = new g("UNKNOWN", 4);
        UNKNOWN = gVar5;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5};
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
