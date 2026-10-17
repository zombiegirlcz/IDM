package kl7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o0[] $VALUES;
    public static final o0 FROM_1000_TO_5000;
    public static final o0 FROM_25000_TO_50000;
    public static final o0 FROM_50000_TO_75000;
    public static final o0 FROM_5000_TO_25000;
    public static final o0 FROM_75000_TO_100000;
    public static final o0 LESS_THAN_1000;
    public static final o0 MORE_THAN_100000;

    static {
        o0 o0Var = new o0("LESS_THAN_1000", 0);
        LESS_THAN_1000 = o0Var;
        o0 o0Var2 = new o0("FROM_1000_TO_5000", 1);
        FROM_1000_TO_5000 = o0Var2;
        o0 o0Var3 = new o0("FROM_5000_TO_25000", 2);
        FROM_5000_TO_25000 = o0Var3;
        o0 o0Var4 = new o0("FROM_25000_TO_50000", 3);
        FROM_25000_TO_50000 = o0Var4;
        o0 o0Var5 = new o0("FROM_50000_TO_75000", 4);
        FROM_50000_TO_75000 = o0Var5;
        o0 o0Var6 = new o0("FROM_75000_TO_100000", 5);
        FROM_75000_TO_100000 = o0Var6;
        o0 o0Var7 = new o0("MORE_THAN_100000", 6);
        MORE_THAN_100000 = o0Var7;
        o0[] o0VarArr = {o0Var, o0Var2, o0Var3, o0Var4, o0Var5, o0Var6, o0Var7};
        $VALUES = o0VarArr;
        $ENTRIES = vc.s.n(o0VarArr);
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) $VALUES.clone();
    }
}
