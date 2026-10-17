package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class g6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g6[] $VALUES;
    public static final g6 LEFT;
    public static final g6 RIGHT;

    static {
        g6 g6Var = new g6("LEFT", 0);
        LEFT = g6Var;
        g6 g6Var2 = new g6("RIGHT", 1);
        RIGHT = g6Var2;
        g6[] g6VarArr = {g6Var, g6Var2};
        $VALUES = g6VarArr;
        $ENTRIES = vc.s.n(g6VarArr);
    }

    public static g6 valueOf(String str) {
        return (g6) Enum.valueOf(g6.class, str);
    }

    public static g6[] values() {
        return (g6[]) $VALUES.clone();
    }
}
