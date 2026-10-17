package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class j3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j3[] $VALUES;
    public static final j3 ACTIVE;
    public static final j3 EXPIRED;
    public static final j3 FAILED;
    public static final j3 GRACE;
    public static final j3 INACTIVE;
    public static final j3 ORDERED;
    public static final j3 PENDING;
    public static final j3 SUSPENDED;
    public static final j3 UNKNOWN;

    static {
        j3 j3Var = new j3("ORDERED", 0);
        ORDERED = j3Var;
        j3 j3Var2 = new j3("PENDING", 1);
        PENDING = j3Var2;
        j3 j3Var3 = new j3("ACTIVE", 2);
        ACTIVE = j3Var3;
        j3 j3Var4 = new j3("GRACE", 3);
        GRACE = j3Var4;
        j3 j3Var5 = new j3("SUSPENDED", 4);
        SUSPENDED = j3Var5;
        j3 j3Var6 = new j3("FAILED", 5);
        FAILED = j3Var6;
        j3 j3Var7 = new j3("EXPIRED", 6);
        EXPIRED = j3Var7;
        j3 j3Var8 = new j3("INACTIVE", 7);
        INACTIVE = j3Var8;
        j3 j3Var9 = new j3("UNKNOWN", 8);
        UNKNOWN = j3Var9;
        j3[] j3VarArr = {j3Var, j3Var2, j3Var3, j3Var4, j3Var5, j3Var6, j3Var7, j3Var8, j3Var9};
        $VALUES = j3VarArr;
        $ENTRIES = vc.s.n(j3VarArr);
    }

    public static j3 valueOf(String str) {
        return (j3) Enum.valueOf(j3.class, str);
    }

    public static j3[] values() {
        return (j3[]) $VALUES.clone();
    }
}
