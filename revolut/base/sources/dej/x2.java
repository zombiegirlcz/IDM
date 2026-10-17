package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class x2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x2[] $VALUES;
    public static final x2 IN;
    public static final x2 OUT;
    public static final x2 UNKNOWN;

    static {
        x2 x2Var = new x2("IN", 0);
        IN = x2Var;
        x2 x2Var2 = new x2("OUT", 1);
        OUT = x2Var2;
        x2 x2Var3 = new x2("UNKNOWN", 2);
        UNKNOWN = x2Var3;
        x2[] x2VarArr = {x2Var, x2Var2, x2Var3};
        $VALUES = x2VarArr;
        $ENTRIES = vc.s.n(x2VarArr);
    }

    public static x2 valueOf(String str) {
        return (x2) Enum.valueOf(x2.class, str);
    }

    public static x2[] values() {
        return (x2[]) $VALUES.clone();
    }
}
