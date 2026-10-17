package a0j;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 CREDIT;
    public static final b0 GROW;
    public static final b0 SAVE;
    public static final b0 SPEND;

    static {
        b0 b0Var = new b0("SPEND", 0);
        SPEND = b0Var;
        b0 b0Var2 = new b0("SAVE", 1);
        SAVE = b0Var2;
        b0 b0Var3 = new b0("GROW", 2);
        GROW = b0Var3;
        b0 b0Var4 = new b0("CREDIT", 3);
        CREDIT = b0Var4;
        b0[] b0VarArr = {b0Var, b0Var2, b0Var3, b0Var4};
        $VALUES = b0VarArr;
        $ENTRIES = vc.s.n(b0VarArr);
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }
}
