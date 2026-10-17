package nel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class n0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;
    public static final n0 MARKET_CLOSED;
    public static final n0 TRADEABLE;
    public static final n0 UNDEFINED;

    static {
        n0 n0Var = new n0("TRADEABLE", 0);
        TRADEABLE = n0Var;
        n0 n0Var2 = new n0("MARKET_CLOSED", 1);
        MARKET_CLOSED = n0Var2;
        n0 n0Var3 = new n0("UNDEFINED", 2);
        UNDEFINED = n0Var3;
        n0[] n0VarArr = {n0Var, n0Var2, n0Var3};
        $VALUES = n0VarArr;
        $ENTRIES = vc.s.n(n0VarArr);
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }
}
