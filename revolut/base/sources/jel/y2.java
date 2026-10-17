package jel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class y2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y2[] $VALUES;
    public static final y2 BUY;
    public static final y2 HOLD;
    public static final y2 SELL;

    static {
        y2 y2Var = new y2("BUY", 0);
        BUY = y2Var;
        y2 y2Var2 = new y2("HOLD", 1);
        HOLD = y2Var2;
        y2 y2Var3 = new y2("SELL", 2);
        SELL = y2Var3;
        y2[] y2VarArr = {y2Var, y2Var2, y2Var3};
        $VALUES = y2VarArr;
        $ENTRIES = vc.s.n(y2VarArr);
    }

    public static y2 valueOf(String str) {
        return (y2) Enum.valueOf(y2.class, str);
    }

    public static y2[] values() {
        return (y2[]) $VALUES.clone();
    }
}
