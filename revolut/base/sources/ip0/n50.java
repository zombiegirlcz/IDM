package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class n50 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n50[] $VALUES;
    public static final n50 BLUE;
    public static final n50 GREEN;
    public static final n50 RED;

    static {
        n50 n50Var = new n50("RED", 0);
        RED = n50Var;
        n50 n50Var2 = new n50("GREEN", 1);
        GREEN = n50Var2;
        n50 n50Var3 = new n50("BLUE", 2);
        BLUE = n50Var3;
        n50[] n50VarArr = {n50Var, n50Var2, n50Var3};
        $VALUES = n50VarArr;
        $ENTRIES = vc.s.n(n50VarArr);
    }

    public static n50 valueOf(String str) {
        return (n50) Enum.valueOf(n50.class, str);
    }

    public static n50[] values() {
        return (n50[]) $VALUES.clone();
    }
}
