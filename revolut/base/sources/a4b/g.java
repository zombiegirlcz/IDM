package a4b;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g CHANGE_POSITION_SIDE;
    public static final g CLOSE_POSITIONS;
    public static final g OPEN_POSITION;
    public static final g REDUCE_POSITIONS;

    static {
        g gVar = new g("REDUCE_POSITIONS", 0);
        REDUCE_POSITIONS = gVar;
        g gVar2 = new g("CLOSE_POSITIONS", 1);
        CLOSE_POSITIONS = gVar2;
        g gVar3 = new g("OPEN_POSITION", 2);
        OPEN_POSITION = gVar3;
        g gVar4 = new g("CHANGE_POSITION_SIDE", 3);
        CHANGE_POSITION_SIDE = gVar4;
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
