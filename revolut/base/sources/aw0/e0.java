package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class e0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 DP_24;
    public static final e0 DP_32;
    public static final e0 DP_40;
    public static final e0 DP_56;

    static {
        e0 e0Var = new e0("DP_56", 0);
        DP_56 = e0Var;
        e0 e0Var2 = new e0("DP_40", 1);
        DP_40 = e0Var2;
        e0 e0Var3 = new e0("DP_32", 2);
        DP_32 = e0Var3;
        e0 e0Var4 = new e0("DP_24", 3);
        DP_24 = e0Var4;
        e0[] e0VarArr = {e0Var, e0Var2, e0Var3, e0Var4};
        $VALUES = e0VarArr;
        $ENTRIES = vc.s.n(e0VarArr);
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }
}
