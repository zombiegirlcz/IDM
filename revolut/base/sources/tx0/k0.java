package tx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class k0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k0[] $VALUES;
    public static final k0 EXTRA_SMALL;
    public static final k0 LARGE;
    public static final k0 MEDIUM;
    public static final k0 SMALL;
    public static final k0 TINY;

    static {
        k0 k0Var = new k0("LARGE", 0);
        LARGE = k0Var;
        k0 k0Var2 = new k0("MEDIUM", 1);
        MEDIUM = k0Var2;
        k0 k0Var3 = new k0("SMALL", 2);
        SMALL = k0Var3;
        k0 k0Var4 = new k0("EXTRA_SMALL", 3);
        EXTRA_SMALL = k0Var4;
        k0 k0Var5 = new k0("TINY", 4);
        TINY = k0Var5;
        k0[] k0VarArr = {k0Var, k0Var2, k0Var3, k0Var4, k0Var5};
        $VALUES = k0VarArr;
        $ENTRIES = vc.s.n(k0VarArr);
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }
}
