package jel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class j2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j2[] $VALUES;
    public static final j2 CALL;
    public static final j2 FULL_LOSS;
    public static final j2 LOSS;
    public static final j2 NEUTRAL;
    public static final j2 PROFIT;

    static {
        j2 j2Var = new j2("FULL_LOSS", 0);
        FULL_LOSS = j2Var;
        j2 j2Var2 = new j2("LOSS", 1);
        LOSS = j2Var2;
        j2 j2Var3 = new j2("NEUTRAL", 2);
        NEUTRAL = j2Var3;
        j2 j2Var4 = new j2("PROFIT", 3);
        PROFIT = j2Var4;
        j2 j2Var5 = new j2("CALL", 4);
        CALL = j2Var5;
        j2[] j2VarArr = {j2Var, j2Var2, j2Var3, j2Var4, j2Var5};
        $VALUES = j2VarArr;
        $ENTRIES = vc.s.n(j2VarArr);
    }

    public static j2 valueOf(String str) {
        return (j2) Enum.valueOf(j2.class, str);
    }

    public static j2[] values() {
        return (j2[]) $VALUES.clone();
    }
}
