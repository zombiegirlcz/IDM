package hs3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class x1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x1[] $VALUES;
    public static final x1 ERROR;
    public static final x1 PENDING;
    public static final x1 SUCCESS;
    public static final x1 WARNING;

    static {
        x1 x1Var = new x1("SUCCESS", 0);
        SUCCESS = x1Var;
        x1 x1Var2 = new x1("WARNING", 1);
        WARNING = x1Var2;
        x1 x1Var3 = new x1("PENDING", 2);
        PENDING = x1Var3;
        x1 x1Var4 = new x1("ERROR", 3);
        ERROR = x1Var4;
        x1[] x1VarArr = {x1Var, x1Var2, x1Var3, x1Var4};
        $VALUES = x1VarArr;
        $ENTRIES = vc.s.n(x1VarArr);
    }

    public static x1 valueOf(String str) {
        return (x1) Enum.valueOf(x1.class, str);
    }

    public static x1[] values() {
        return (x1[]) $VALUES.clone();
    }
}
