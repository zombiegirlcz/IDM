package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class y0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y0[] $VALUES;
    public static final y0 CARRIER;
    public static final y0 PHONE_NUMBER;

    static {
        y0 y0Var = new y0("PHONE_NUMBER", 0);
        PHONE_NUMBER = y0Var;
        y0 y0Var2 = new y0("CARRIER", 1);
        CARRIER = y0Var2;
        y0[] y0VarArr = {y0Var, y0Var2};
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
