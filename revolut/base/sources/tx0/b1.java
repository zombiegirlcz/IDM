package tx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class b1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b1[] $VALUES;
    public static final b1 FAST;
    public static final b1 MEDIUM;
    public static final b1 NONE;
    public static final b1 SLOW;

    static {
        b1 b1Var = new b1("FAST", 0);
        FAST = b1Var;
        b1 b1Var2 = new b1("MEDIUM", 1);
        MEDIUM = b1Var2;
        b1 b1Var3 = new b1("SLOW", 2);
        SLOW = b1Var3;
        b1 b1Var4 = new b1("NONE", 3);
        NONE = b1Var4;
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
