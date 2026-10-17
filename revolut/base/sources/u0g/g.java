package u0g;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g ATTRACTION;
    public static final g DESTINATION;
    public static final g EXPERIENCE;

    static {
        g gVar = new g("DESTINATION", 0);
        DESTINATION = gVar;
        g gVar2 = new g("ATTRACTION", 1);
        ATTRACTION = gVar2;
        g gVar3 = new g("EXPERIENCE", 2);
        EXPERIENCE = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
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
