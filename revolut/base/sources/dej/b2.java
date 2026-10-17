package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class b2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b2[] $VALUES;
    public static final b2 CANCELLED;
    public static final b2 ELIGIBLE;
    public static final b2 NON_ELIGIBLE;
    public static final b2 SCHEDULED;
    public static final b2 UNKNOWN;

    static {
        b2 b2Var = new b2("NON_ELIGIBLE", 0);
        NON_ELIGIBLE = b2Var;
        b2 b2Var2 = new b2("ELIGIBLE", 1);
        ELIGIBLE = b2Var2;
        b2 b2Var3 = new b2("SCHEDULED", 2);
        SCHEDULED = b2Var3;
        b2 b2Var4 = new b2("CANCELLED", 3);
        CANCELLED = b2Var4;
        b2 b2Var5 = new b2("UNKNOWN", 4);
        UNKNOWN = b2Var5;
        b2[] b2VarArr = {b2Var, b2Var2, b2Var3, b2Var4, b2Var5};
        $VALUES = b2VarArr;
        $ENTRIES = vc.s.n(b2VarArr);
    }

    public static b2 valueOf(String str) {
        return (b2) Enum.valueOf(b2.class, str);
    }

    public static b2[] values() {
        return (b2[]) $VALUES.clone();
    }
}
