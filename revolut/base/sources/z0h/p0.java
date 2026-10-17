package z0h;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class p0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p0[] $VALUES;
    public static final p0 ALL;
    public static final p0 BONDS;
    public static final p0 ETFS;
    public static final p0 STOCKS;

    static {
        p0 p0Var = new p0("ALL", 0);
        ALL = p0Var;
        p0 p0Var2 = new p0("STOCKS", 1);
        STOCKS = p0Var2;
        p0 p0Var3 = new p0("ETFS", 2);
        ETFS = p0Var3;
        p0 p0Var4 = new p0("BONDS", 3);
        BONDS = p0Var4;
        p0[] p0VarArr = {p0Var, p0Var2, p0Var3, p0Var4};
        $VALUES = p0VarArr;
        $ENTRIES = vc.s.n(p0VarArr);
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) $VALUES.clone();
    }
}
