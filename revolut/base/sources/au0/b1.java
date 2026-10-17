package au0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b1[] $VALUES;
    public static final b1 DEFAULT;
    public static final b1 LARGE;
    public static final b1 LARGE_SINGLE_LINE;
    public static final b1 MARKETING;

    static {
        b1 b1Var = new b1("DEFAULT", 0);
        DEFAULT = b1Var;
        b1 b1Var2 = new b1("LARGE", 1);
        LARGE = b1Var2;
        b1 b1Var3 = new b1("LARGE_SINGLE_LINE", 2);
        LARGE_SINGLE_LINE = b1Var3;
        b1 b1Var4 = new b1("MARKETING", 3);
        MARKETING = b1Var4;
        b1[] b1VarArr = {b1Var, b1Var2, b1Var3, b1Var4};
        $VALUES = b1VarArr;
        $ENTRIES = vc.s.n(b1VarArr);
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) $VALUES.clone();
    }
}
