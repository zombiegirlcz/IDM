package k4l;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class q0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q0[] $VALUES;
    public static final q0 DAY;
    public static final q0 GOOD_TIL_EXT_MARKET;
    public static final q0 GTC;
    public static final q0 MARKET_ON_OPEN;

    static {
        q0 q0Var = new q0("DAY", 0);
        DAY = q0Var;
        q0 q0Var2 = new q0("GTC", 1);
        GTC = q0Var2;
        q0 q0Var3 = new q0("MARKET_ON_OPEN", 2);
        MARKET_ON_OPEN = q0Var3;
        q0 q0Var4 = new q0("GOOD_TIL_EXT_MARKET", 3);
        GOOD_TIL_EXT_MARKET = q0Var4;
        q0[] q0VarArr = {q0Var, q0Var2, q0Var3, q0Var4};
        $VALUES = q0VarArr;
        $ENTRIES = vc.s.n(q0VarArr);
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) $VALUES.clone();
    }
}
