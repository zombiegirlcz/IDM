package fa1;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g EXTREMELY_LOW;
    public static final g LOW;
    public static final g SUFFICIENT;

    static {
        g gVar = new g("SUFFICIENT", 0);
        SUFFICIENT = gVar;
        g gVar2 = new g("LOW", 1);
        LOW = gVar2;
        g gVar3 = new g("EXTREMELY_LOW", 2);
        EXTREMELY_LOW = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
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
