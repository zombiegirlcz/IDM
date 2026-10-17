package d2e;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g DISCOVER_MORE;
    public static final g HERO;
    public static final g LOGO;
    public static final g REGULAR;

    static {
        g gVar = new g("HERO", 0);
        HERO = gVar;
        g gVar2 = new g("LOGO", 1);
        LOGO = gVar2;
        g gVar3 = new g("REGULAR", 2);
        REGULAR = gVar3;
        g gVar4 = new g("DISCOVER_MORE", 3);
        DISCOVER_MORE = gVar4;
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
