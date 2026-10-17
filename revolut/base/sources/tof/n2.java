package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class n2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n2[] $VALUES;
    public static final n2 MONEYBOX;
    public static final n2 UNKNOWN;

    static {
        n2 n2Var = new n2("MONEYBOX", 0);
        MONEYBOX = n2Var;
        n2 n2Var2 = new n2("UNKNOWN", 1);
        UNKNOWN = n2Var2;
        n2[] n2VarArr = {n2Var, n2Var2};
        $VALUES = n2VarArr;
        $ENTRIES = vc.s.n(n2VarArr);
    }

    public static n2 valueOf(String str) {
        return (n2) Enum.valueOf(n2.class, str);
    }

    public static n2[] values() {
        return (n2[]) $VALUES.clone();
    }
}
