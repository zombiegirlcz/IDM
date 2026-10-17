package dx4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class w4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w4[] $VALUES;
    public static final w4 CENTER;
    public static final w4 START;

    static {
        w4 w4Var = new w4("START", 0);
        START = w4Var;
        w4 w4Var2 = new w4("CENTER", 1);
        CENTER = w4Var2;
        w4[] w4VarArr = {w4Var, w4Var2};
        $VALUES = w4VarArr;
        $ENTRIES = vc.s.n(w4VarArr);
    }

    public static w4 valueOf(String str) {
        return (w4) Enum.valueOf(w4.class, str);
    }

    public static w4[] values() {
        return (w4[]) $VALUES.clone();
    }
}
