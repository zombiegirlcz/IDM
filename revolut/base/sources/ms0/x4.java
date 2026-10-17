package ms0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class x4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x4[] $VALUES;
    public static final x4 MINUTES;
    public static final x4 SECONDS;

    static {
        x4 x4Var = new x4("SECONDS", 0);
        SECONDS = x4Var;
        x4 x4Var2 = new x4("MINUTES", 1);
        MINUTES = x4Var2;
        x4[] x4VarArr = {x4Var, x4Var2};
        $VALUES = x4VarArr;
        $ENTRIES = vc.s.n(x4VarArr);
    }

    public static x4 valueOf(String str) {
        return (x4) Enum.valueOf(x4.class, str);
    }

    public static x4[] values() {
        return (x4[]) $VALUES.clone();
    }
}
