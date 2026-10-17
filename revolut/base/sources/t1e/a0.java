package t1e;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 CANCELLED;
    public static final a0 CONFIRMED;
    public static final a0 FAILED;
    public static final a0 PENDING;
    public static final a0 UNKNOWN;

    static {
        a0 a0Var = new a0("CONFIRMED", 0);
        CONFIRMED = a0Var;
        a0 a0Var2 = new a0("PENDING", 1);
        PENDING = a0Var2;
        a0 a0Var3 = new a0("FAILED", 2);
        FAILED = a0Var3;
        a0 a0Var4 = new a0("CANCELLED", 3);
        CANCELLED = a0Var4;
        a0 a0Var5 = new a0("UNKNOWN", 4);
        UNKNOWN = a0Var5;
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
