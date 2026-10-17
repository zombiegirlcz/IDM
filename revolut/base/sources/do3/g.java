package do3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g ACTIVE;
    public static final g EXPIRED;
    public static final g GRACE_PERIOD;
    public static final g INACTIVE;

    static {
        g gVar = new g("INACTIVE", 0);
        INACTIVE = gVar;
        g gVar2 = new g("ACTIVE", 1);
        ACTIVE = gVar2;
        g gVar3 = new g("GRACE_PERIOD", 2);
        GRACE_PERIOD = gVar3;
        g gVar4 = new g("EXPIRED", 3);
        EXPIRED = gVar4;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4};
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
