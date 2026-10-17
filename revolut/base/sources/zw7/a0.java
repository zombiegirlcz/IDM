package zw7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 ACTIVE;
    public static final a0 CANCELLED;
    public static final a0 INACTIVE;
    public static final a0 INITIALISING;
    public static final a0 LAPSED;
    public static final a0 NO_POLICY;
    public static final a0 UNKNOWN;

    static {
        a0 a0Var = new a0("NO_POLICY", 0);
        NO_POLICY = a0Var;
        a0 a0Var2 = new a0("INITIALISING", 1);
        INITIALISING = a0Var2;
        a0 a0Var3 = new a0("ACTIVE", 2);
        ACTIVE = a0Var3;
        a0 a0Var4 = new a0("CANCELLED", 3);
        CANCELLED = a0Var4;
        a0 a0Var5 = new a0("INACTIVE", 4);
        INACTIVE = a0Var5;
        a0 a0Var6 = new a0("LAPSED", 5);
        LAPSED = a0Var6;
        a0 a0Var7 = new a0("UNKNOWN", 6);
        UNKNOWN = a0Var7;
        a0[] a0VarArr = {a0Var, a0Var2, a0Var3, a0Var4, a0Var5, a0Var6, a0Var7};
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
