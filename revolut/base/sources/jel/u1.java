package jel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class u1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u1[] $VALUES;
    public static final u1 ANNUALLY;
    public static final u1 MONTHLY;
    public static final u1 QUARTERLY;

    static {
        u1 u1Var = new u1("MONTHLY", 0);
        MONTHLY = u1Var;
        u1 u1Var2 = new u1("QUARTERLY", 1);
        QUARTERLY = u1Var2;
        u1 u1Var3 = new u1("ANNUALLY", 2);
        ANNUALLY = u1Var3;
        u1[] u1VarArr = {u1Var, u1Var2, u1Var3};
        $VALUES = u1VarArr;
        $ENTRIES = vc.s.n(u1VarArr);
    }

    public static u1 valueOf(String str) {
        return (u1) Enum.valueOf(u1.class, str);
    }

    public static u1[] values() {
        return (u1[]) $VALUES.clone();
    }
}
