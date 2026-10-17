package a2l;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g ACTIVE;
    public static final g EXPIRED;
    public static final g IN_PROGRESS;
    public static final g NOT_STARTED;
    public static final g UNKNOWN;
    public static final g UPGRADE;

    static {
        g gVar = new g("UPGRADE", 0);
        UPGRADE = gVar;
        g gVar2 = new g("NOT_STARTED", 1);
        NOT_STARTED = gVar2;
        g gVar3 = new g("IN_PROGRESS", 2);
        IN_PROGRESS = gVar3;
        g gVar4 = new g("ACTIVE", 3);
        ACTIVE = gVar4;
        g gVar5 = new g("EXPIRED", 4);
        EXPIRED = gVar5;
        g gVar6 = new g("UNKNOWN", 5);
        UNKNOWN = gVar6;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6};
        $VALUES = gVarArr;
        $ENTRIES = vc.s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
