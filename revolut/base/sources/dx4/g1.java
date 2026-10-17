package dx4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class g1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g1[] $VALUES;
    public static final g1 ACCENT;
    public static final g1 BLACK;
    public static final g1 DANGER;
    public static final g1 INACTIVE;
    public static final g1 SUCCESS;
    public static final g1 WARNING;
    public static final g1 WHITE;

    static {
        g1 g1Var = new g1("ACCENT", 0);
        ACCENT = g1Var;
        g1 g1Var2 = new g1("SUCCESS", 1);
        SUCCESS = g1Var2;
        g1 g1Var3 = new g1("WARNING", 2);
        WARNING = g1Var3;
        g1 g1Var4 = new g1("DANGER", 3);
        DANGER = g1Var4;
        g1 g1Var5 = new g1("INACTIVE", 4);
        INACTIVE = g1Var5;
        g1 g1Var6 = new g1("WHITE", 5);
        WHITE = g1Var6;
        g1 g1Var7 = new g1("BLACK", 6);
        BLACK = g1Var7;
        g1[] g1VarArr = {g1Var, g1Var2, g1Var3, g1Var4, g1Var5, g1Var6, g1Var7};
        $VALUES = g1VarArr;
        $ENTRIES = vc.s.n(g1VarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static g1 valueOf(String str) {
        return (g1) Enum.valueOf(g1.class, str);
    }

    public static g1[] values() {
        return (g1[]) $VALUES.clone();
    }
}
