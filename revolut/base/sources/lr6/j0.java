package lr6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;
    public static final j0 ACTIVE;
    public static final j0 CANCELLED;
    public static final j0 COMPLETED;
    public static final j0 DECLINED;
    public static final j0 FAILED;
    public static final j0 PENDING;
    public static final j0 REJECTED;
    public static final j0 REVERTED;

    static {
        j0 j0Var = new j0("FAILED", 0);
        FAILED = j0Var;
        j0 j0Var2 = new j0("ACTIVE", 1);
        ACTIVE = j0Var2;
        j0 j0Var3 = new j0("REVERTED", 2);
        REVERTED = j0Var3;
        j0 j0Var4 = new j0("DECLINED", 3);
        DECLINED = j0Var4;
        j0 j0Var5 = new j0("COMPLETED", 4);
        COMPLETED = j0Var5;
        j0 j0Var6 = new j0("PENDING", 5);
        PENDING = j0Var6;
        j0 j0Var7 = new j0("REJECTED", 6);
        REJECTED = j0Var7;
        j0 j0Var8 = new j0("CANCELLED", 7);
        CANCELLED = j0Var8;
        j0[] j0VarArr = {j0Var, j0Var2, j0Var3, j0Var4, j0Var5, j0Var6, j0Var7, j0Var8};
        $VALUES = j0VarArr;
        $ENTRIES = vc.s.n(j0VarArr);
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }
}
