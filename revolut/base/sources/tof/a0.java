package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 BASIC;
    public static final a0 FULL;
    public static final a0 UNKNOWN;

    static {
        a0 a0Var = new a0("BASIC", 0);
        BASIC = a0Var;
        a0 a0Var2 = new a0("FULL", 1);
        FULL = a0Var2;
        a0 a0Var3 = new a0("UNKNOWN", 2);
        UNKNOWN = a0Var3;
        a0[] a0VarArr = {a0Var, a0Var2, a0Var3};
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
