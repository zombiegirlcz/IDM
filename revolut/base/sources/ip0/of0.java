package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class of0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ of0[] $VALUES;
    public static final of0 ACCENT;
    public static final of0 PURPLE;
    public static final of0 TEAL;

    static {
        of0 of0Var = new of0("PURPLE", 0);
        PURPLE = of0Var;
        of0 of0Var2 = new of0("TEAL", 1);
        TEAL = of0Var2;
        of0 of0Var3 = new of0("ACCENT", 2);
        ACCENT = of0Var3;
        of0[] of0VarArr = {of0Var, of0Var2, of0Var3};
        $VALUES = of0VarArr;
        $ENTRIES = vc.s.n(of0VarArr);
    }

    public static of0 valueOf(String str) {
        return (of0) Enum.valueOf(of0.class, str);
    }

    public static of0[] values() {
        return (of0[]) $VALUES.clone();
    }
}
