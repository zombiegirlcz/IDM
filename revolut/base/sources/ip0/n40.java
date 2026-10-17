package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class n40 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n40[] $VALUES;
    public static final n40 CURRENT;
    public static final n40 FUTURE;
    public static final n40 PAST;

    static {
        n40 n40Var = new n40("PAST", 0);
        PAST = n40Var;
        n40 n40Var2 = new n40("CURRENT", 1);
        CURRENT = n40Var2;
        n40 n40Var3 = new n40("FUTURE", 2);
        FUTURE = n40Var3;
        n40[] n40VarArr = {n40Var, n40Var2, n40Var3};
        $VALUES = n40VarArr;
        $ENTRIES = vc.s.n(n40VarArr);
    }

    public static n40 valueOf(String str) {
        return (n40) Enum.valueOf(n40.class, str);
    }

    public static n40[] values() {
        return (n40[]) $VALUES.clone();
    }
}
