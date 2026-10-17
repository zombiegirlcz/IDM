package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class h3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h3[] $VALUES;
    public static final h3 DATA_USAGE;
    public static final h3 PERIOD_DAYS_PASSED;
    public static final h3 UNKNOWN;

    static {
        h3 h3Var = new h3("DATA_USAGE", 0);
        DATA_USAGE = h3Var;
        h3 h3Var2 = new h3("PERIOD_DAYS_PASSED", 1);
        PERIOD_DAYS_PASSED = h3Var2;
        h3 h3Var3 = new h3("UNKNOWN", 2);
        UNKNOWN = h3Var3;
        h3[] h3VarArr = {h3Var, h3Var2, h3Var3};
        $VALUES = h3VarArr;
        $ENTRIES = vc.s.n(h3VarArr);
    }

    public static h3 valueOf(String str) {
        return (h3) Enum.valueOf(h3.class, str);
    }

    public static h3[] values() {
        return (h3[]) $VALUES.clone();
    }
}
