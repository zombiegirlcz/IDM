package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class z0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z0[] $VALUES;
    public static final z0 CONTRACT_END;
    public static final z0 EARLIEST_POSSIBLE_DATE;
    public static final z0 NOTICE_PERIOD;
    public static final z0 SPECIFIC_DATE;
    public static final z0 UNKNOWN;

    static {
        z0 z0Var = new z0("EARLIEST_POSSIBLE_DATE", 0);
        EARLIEST_POSSIBLE_DATE = z0Var;
        z0 z0Var2 = new z0("SPECIFIC_DATE", 1);
        SPECIFIC_DATE = z0Var2;
        z0 z0Var3 = new z0("CONTRACT_END", 2);
        CONTRACT_END = z0Var3;
        z0 z0Var4 = new z0("NOTICE_PERIOD", 3);
        NOTICE_PERIOD = z0Var4;
        z0 z0Var5 = new z0("UNKNOWN", 4);
        UNKNOWN = z0Var5;
        z0[] z0VarArr = {z0Var, z0Var2, z0Var3, z0Var4, z0Var5};
        $VALUES = z0VarArr;
        $ENTRIES = vc.s.n(z0VarArr);
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) $VALUES.clone();
    }
}
