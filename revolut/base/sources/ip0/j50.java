package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class j50 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j50[] $VALUES;
    public static final j50 COMPLETED;
    public static final j50 FAILED;
    public static final j50 INACTIVE;
    public static final j50 NORMAL;
    public static final j50 PENDING;
    public static final j50 WARNING;

    static {
        j50 j50Var = new j50("NORMAL", 0);
        NORMAL = j50Var;
        j50 j50Var2 = new j50("PENDING", 1);
        PENDING = j50Var2;
        j50 j50Var3 = new j50("WARNING", 2);
        WARNING = j50Var3;
        j50 j50Var4 = new j50("COMPLETED", 3);
        COMPLETED = j50Var4;
        j50 j50Var5 = new j50("FAILED", 4);
        FAILED = j50Var5;
        j50 j50Var6 = new j50("INACTIVE", 5);
        INACTIVE = j50Var6;
        j50[] j50VarArr = {j50Var, j50Var2, j50Var3, j50Var4, j50Var5, j50Var6};
        $VALUES = j50VarArr;
        $ENTRIES = vc.s.n(j50VarArr);
    }

    public static j50 valueOf(String str) {
        return (j50) Enum.valueOf(j50.class, str);
    }

    public static j50[] values() {
        return (j50[]) $VALUES.clone();
    }
}
