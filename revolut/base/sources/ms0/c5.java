package ms0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class c5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c5[] $VALUES;
    public static final c5 ACCENT;
    public static final c5 PRIMARY_BLACK;
    public static final c5 PRIMARY_WHITE;

    static {
        c5 c5Var = new c5("ACCENT", 0);
        ACCENT = c5Var;
        c5 c5Var2 = new c5("PRIMARY_WHITE", 1);
        PRIMARY_WHITE = c5Var2;
        c5 c5Var3 = new c5("PRIMARY_BLACK", 2);
        PRIMARY_BLACK = c5Var3;
        c5[] c5VarArr = {c5Var, c5Var2, c5Var3};
        $VALUES = c5VarArr;
        $ENTRIES = vc.s.n(c5VarArr);
    }

    public static c5 valueOf(String str) {
        return (c5) Enum.valueOf(c5.class, str);
    }

    public static c5[] values() {
        return (c5[]) $VALUES.clone();
    }
}
