package au0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class w5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w5[] $VALUES;
    public static final w5 NONE;
    public static final w5 OVERLAY_GRADIENT;
    public static final w5 PROJECTION_MASK;

    static {
        w5 w5Var = new w5("NONE", 0);
        NONE = w5Var;
        w5 w5Var2 = new w5("OVERLAY_GRADIENT", 1);
        OVERLAY_GRADIENT = w5Var2;
        w5 w5Var3 = new w5("PROJECTION_MASK", 2);
        PROJECTION_MASK = w5Var3;
        w5[] w5VarArr = {w5Var, w5Var2, w5Var3};
        $VALUES = w5VarArr;
        $ENTRIES = vc.s.n(w5VarArr);
    }

    public static w5 valueOf(String str) {
        return (w5) Enum.valueOf(w5.class, str);
    }

    public static w5[] values() {
        return (w5[]) $VALUES.clone();
    }
}
