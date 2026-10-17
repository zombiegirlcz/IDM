package dx4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class g4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g4[] $VALUES;
    public static final g4 HORIZONTAL;
    public static final g4 VERTICAL;

    static {
        g4 g4Var = new g4("VERTICAL", 0);
        VERTICAL = g4Var;
        g4 g4Var2 = new g4("HORIZONTAL", 1);
        HORIZONTAL = g4Var2;
        g4[] g4VarArr = {g4Var, g4Var2};
        $VALUES = g4VarArr;
        $ENTRIES = vc.s.n(g4VarArr);
    }

    public static g4 valueOf(String str) {
        return (g4) Enum.valueOf(g4.class, str);
    }

    public static g4[] values() {
        return (g4[]) $VALUES.clone();
    }
}
