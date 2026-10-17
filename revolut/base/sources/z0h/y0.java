package z0h;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class y0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y0[] $VALUES;
    public static final y0 ALL;
    public static final y0 BONDS;
    public static final y0 ETFS;
    public static final y0 STOCKS;

    static {
        y0 y0Var = new y0("ALL", 0);
        ALL = y0Var;
        y0 y0Var2 = new y0("STOCKS", 1);
        STOCKS = y0Var2;
        y0 y0Var3 = new y0("ETFS", 2);
        ETFS = y0Var3;
        y0 y0Var4 = new y0("BONDS", 3);
        BONDS = y0Var4;
        y0[] y0VarArr = {y0Var, y0Var2, y0Var3, y0Var4};
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
