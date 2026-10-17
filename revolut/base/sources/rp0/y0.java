package rp0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class y0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y0[] $VALUES;
    public static final y0 ANOTHER_SHOT;
    public static final y0 MANUAL;
    public static final y0 SWIPED;
    public static final y0 TIMEOUT;
    public static final y0 TRIGGERED_ACTION;

    static {
        y0 y0Var = new y0("SWIPED", 0);
        SWIPED = y0Var;
        y0 y0Var2 = new y0("TRIGGERED_ACTION", 1);
        TRIGGERED_ACTION = y0Var2;
        y0 y0Var3 = new y0("TIMEOUT", 2);
        TIMEOUT = y0Var3;
        y0 y0Var4 = new y0("MANUAL", 3);
        MANUAL = y0Var4;
        y0 y0Var5 = new y0("ANOTHER_SHOT", 4);
        ANOTHER_SHOT = y0Var5;
        y0[] y0VarArr = {y0Var, y0Var2, y0Var3, y0Var4, y0Var5};
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
