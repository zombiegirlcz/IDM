package ms0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class n5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n5[] $VALUES;
    public static final n5 BOTTOM;
    public static final n5 TOP;
    public static final n5 TOP_BOTTOM;

    static {
        n5 n5Var = new n5("TOP", 0);
        TOP = n5Var;
        n5 n5Var2 = new n5("BOTTOM", 1);
        BOTTOM = n5Var2;
        n5 n5Var3 = new n5("TOP_BOTTOM", 2);
        TOP_BOTTOM = n5Var3;
        n5[] n5VarArr = {n5Var, n5Var2, n5Var3};
        $VALUES = n5VarArr;
        $ENTRIES = vc.s.n(n5VarArr);
    }

    public static n5 valueOf(String str) {
        return (n5) Enum.valueOf(n5.class, str);
    }

    public static n5[] values() {
        return (n5[]) $VALUES.clone();
    }
}
