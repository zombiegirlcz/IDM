package ms0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class a0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 ACCENT;
    public static final a0 ACCENT_HIGHLIGHTED;
    public static final a0 CONTEXTUAL;
    public static final a0 DANGER;
    public static final a0 ELEVATED;
    public static final a0 INVERTED_PRIMARY;
    public static final a0 PRIMARY_NEUTRAL;
    public static final a0 SOLID_ACCENT;

    static {
        a0 a0Var = new a0("ELEVATED", 0);
        ELEVATED = a0Var;
        a0 a0Var2 = new a0("ACCENT_HIGHLIGHTED", 1);
        ACCENT_HIGHLIGHTED = a0Var2;
        a0 a0Var3 = new a0("ACCENT", 2);
        ACCENT = a0Var3;
        a0 a0Var4 = new a0("SOLID_ACCENT", 3);
        SOLID_ACCENT = a0Var4;
        a0 a0Var5 = new a0("PRIMARY_NEUTRAL", 4);
        PRIMARY_NEUTRAL = a0Var5;
        a0 a0Var6 = new a0("INVERTED_PRIMARY", 5);
        INVERTED_PRIMARY = a0Var6;
        a0 a0Var7 = new a0("CONTEXTUAL", 6);
        CONTEXTUAL = a0Var7;
        a0 a0Var8 = new a0("DANGER", 7);
        DANGER = a0Var8;
        a0[] a0VarArr = {a0Var, a0Var2, a0Var3, a0Var4, a0Var5, a0Var6, a0Var7, a0Var8};
        $VALUES = a0VarArr;
        $ENTRIES = vc.s.n(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }
}
