package nx4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class o2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o2[] $VALUES;
    public static final o2 CUSTOM;
    public static final o2 MONEY;
    public static final o2 MONEY_WITH_PERCENTAGE;
    public static final o2 NUMBER;

    static {
        o2 o2Var = new o2("CUSTOM", 0);
        CUSTOM = o2Var;
        o2 o2Var2 = new o2("NUMBER", 1);
        NUMBER = o2Var2;
        o2 o2Var3 = new o2("MONEY", 2);
        MONEY = o2Var3;
        o2 o2Var4 = new o2("MONEY_WITH_PERCENTAGE", 3);
        MONEY_WITH_PERCENTAGE = o2Var4;
        o2[] o2VarArr = {o2Var, o2Var2, o2Var3, o2Var4};
        $VALUES = o2VarArr;
        $ENTRIES = vc.s.n(o2VarArr);
    }

    public static o2 valueOf(String str) {
        return (o2) Enum.valueOf(o2.class, str);
    }

    public static o2[] values() {
        return (o2[]) $VALUES.clone();
    }
}
