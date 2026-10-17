package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class u0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u0[] $VALUES;
    public static final u0 COUNTRY;
    public static final u0 DATE;
    public static final u0 NUMBER;
    public static final u0 TEXT;
    public static final u0 TIME;
    public static final u0 UNKNOWN;

    static {
        u0 u0Var = new u0("TEXT", 0);
        TEXT = u0Var;
        u0 u0Var2 = new u0("NUMBER", 1);
        NUMBER = u0Var2;
        u0 u0Var3 = new u0("DATE", 2);
        DATE = u0Var3;
        u0 u0Var4 = new u0("TIME", 3);
        TIME = u0Var4;
        u0 u0Var5 = new u0("COUNTRY", 4);
        COUNTRY = u0Var5;
        u0 u0Var6 = new u0("UNKNOWN", 5);
        UNKNOWN = u0Var6;
        u0[] u0VarArr = {u0Var, u0Var2, u0Var3, u0Var4, u0Var5, u0Var6};
        $VALUES = u0VarArr;
        $ENTRIES = vc.s.n(u0VarArr);
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) $VALUES.clone();
    }
}
