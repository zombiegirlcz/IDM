package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class lh0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ lh0[] $VALUES;
    public static final lh0 ACCENT;
    public static final lh0 BLACK;
    public static final lh0 GREY;
    public static final lh0 SEMIACCENT;
    public static final lh0 TRANSPARENT;

    static {
        lh0 lh0Var = new lh0("ACCENT", 0);
        ACCENT = lh0Var;
        lh0 lh0Var2 = new lh0("SEMIACCENT", 1);
        SEMIACCENT = lh0Var2;
        lh0 lh0Var3 = new lh0("TRANSPARENT", 2);
        TRANSPARENT = lh0Var3;
        lh0 lh0Var4 = new lh0("BLACK", 3);
        BLACK = lh0Var4;
        lh0 lh0Var5 = new lh0("GREY", 4);
        GREY = lh0Var5;
        lh0[] lh0VarArr = {lh0Var, lh0Var2, lh0Var3, lh0Var4, lh0Var5};
        $VALUES = lh0VarArr;
        $ENTRIES = vc.s.n(lh0VarArr);
    }

    public static lh0 valueOf(String str) {
        return (lh0) Enum.valueOf(lh0.class, str);
    }

    public static lh0[] values() {
        return (lh0[]) $VALUES.clone();
    }
}
