package m1c;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class y0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y0[] $VALUES;
    public static final y0 PURCHASE;
    public static final y0 REWARD;
    public static final y0 UNKNOWN;

    static {
        y0 y0Var = new y0("PURCHASE", 0);
        PURCHASE = y0Var;
        y0 y0Var2 = new y0("REWARD", 1);
        REWARD = y0Var2;
        y0 y0Var3 = new y0("UNKNOWN", 2);
        UNKNOWN = y0Var3;
        y0[] y0VarArr = {y0Var, y0Var2, y0Var3};
        $VALUES = y0VarArr;
        $ENTRIES = vc.s.n(y0VarArr);
    }

    public static y0 valueOf(String str) {
        return (y0) Enum.valueOf(y0.class, str);
    }

    public static y0[] values() {
        return (y0[]) $VALUES.clone();
    }
}
