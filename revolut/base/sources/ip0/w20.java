package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class w20 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w20[] $VALUES;
    public static final w20 ICON_60DP;
    public static final w20 PICTURE_80DP;

    static {
        w20 w20Var = new w20("ICON_60DP", 0);
        ICON_60DP = w20Var;
        w20 w20Var2 = new w20("PICTURE_80DP", 1);
        PICTURE_80DP = w20Var2;
        w20[] w20VarArr = {w20Var, w20Var2};
        $VALUES = w20VarArr;
        $ENTRIES = vc.s.n(w20VarArr);
    }

    public static w20 valueOf(String str) {
        return (w20) Enum.valueOf(w20.class, str);
    }

    public static w20[] values() {
        return (w20[]) $VALUES.clone();
    }
}
