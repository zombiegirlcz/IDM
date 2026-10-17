package ku0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g NEXT;
    public static final g NO_ANIMATION;
    public static final g PREVIOUS;

    static {
        g gVar = new g("NEXT", 0);
        NEXT = gVar;
        g gVar2 = new g("PREVIOUS", 1);
        PREVIOUS = gVar2;
        g gVar3 = new g("NO_ANIMATION", 2);
        NO_ANIMATION = gVar3;
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
