package mel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class j0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;
    public static final j0 BUY;
    public static final j0 HOLD;
    public static final j0 SELL;
    public static final j0 STRONG_BUY;
    public static final j0 STRONG_SELL;

    static {
        j0 j0Var = new j0("STRONG_BUY", 0);
        STRONG_BUY = j0Var;
        j0 j0Var2 = new j0("BUY", 1);
        BUY = j0Var2;
        j0 j0Var3 = new j0("HOLD", 2);
        HOLD = j0Var3;
        j0 j0Var4 = new j0("SELL", 3);
        SELL = j0Var4;
        j0 j0Var5 = new j0("STRONG_SELL", 4);
        STRONG_SELL = j0Var5;
        j0[] j0VarArr = {j0Var, j0Var2, j0Var3, j0Var4, j0Var5};
        $VALUES = j0VarArr;
        $ENTRIES = vc.s.n(j0VarArr);
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }
}
