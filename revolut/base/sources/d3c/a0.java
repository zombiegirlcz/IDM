package d3c;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 FOUR_PX;
    public static final a0 PRODIGI;
    public static final a0 SPRING;
    public static final a0 TAG;
    public static final a0 UNKNOWN;

    static {
        a0 a0Var = new a0("UNKNOWN", 0);
        UNKNOWN = a0Var;
        a0 a0Var2 = new a0("TAG", 1);
        TAG = a0Var2;
        a0 a0Var3 = new a0("PRODIGI", 2);
        PRODIGI = a0Var3;
        a0 a0Var4 = new a0("SPRING", 3);
        SPRING = a0Var4;
        a0 a0Var5 = new a0("FOUR_PX", 4);
        FOUR_PX = a0Var5;
        a0[] a0VarArr = {a0Var, a0Var2, a0Var3, a0Var4, a0Var5};
        $VALUES = a0VarArr;
        $ENTRIES = vc.s.n(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }
}
