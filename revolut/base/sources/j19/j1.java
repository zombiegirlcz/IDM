package j19;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class j1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j1[] $VALUES;
    public static final j1 CASHBACK;
    public static final j1 PROMOCODE;
    public static final j1 REV_POINTS;

    static {
        j1 j1Var = new j1("REV_POINTS", 0);
        REV_POINTS = j1Var;
        j1 j1Var2 = new j1("CASHBACK", 1);
        CASHBACK = j1Var2;
        j1 j1Var3 = new j1("PROMOCODE", 2);
        PROMOCODE = j1Var3;
        j1[] j1VarArr = {j1Var, j1Var2, j1Var3};
        $VALUES = j1VarArr;
        $ENTRIES = vc.s.n(j1VarArr);
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) $VALUES.clone();
    }
}
