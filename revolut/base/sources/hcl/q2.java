package hcl;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class q2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q2[] $VALUES;
    public static final q2 DATE;
    public static final q2 MONEY;
    public static final q2 NUMBER;
    public static final q2 PERCENTAGE;
    public static final q2 STRING;
    public static final q2 UNKNOWN;

    static {
        q2 q2Var = new q2("STRING", 0);
        STRING = q2Var;
        q2 q2Var2 = new q2("NUMBER", 1);
        NUMBER = q2Var2;
        q2 q2Var3 = new q2("PERCENTAGE", 2);
        PERCENTAGE = q2Var3;
        q2 q2Var4 = new q2("DATE", 3);
        DATE = q2Var4;
        q2 q2Var5 = new q2("MONEY", 4);
        MONEY = q2Var5;
        q2 q2Var6 = new q2("UNKNOWN", 5);
        UNKNOWN = q2Var6;
        q2[] q2VarArr = {q2Var, q2Var2, q2Var3, q2Var4, q2Var5, q2Var6};
        $VALUES = q2VarArr;
        $ENTRIES = vc.s.n(q2VarArr);
    }

    public static q2 valueOf(String str) {
        return (q2) Enum.valueOf(q2.class, str);
    }

    public static q2[] values() {
        return (q2[]) $VALUES.clone();
    }
}
