package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class p9 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p9[] $VALUES;
    public static final p9 ALWAYS;
    public static final p9 NEVER;
    public static final p9 ONLY_NEGATIVE;

    static {
        p9 p9Var = new p9("ALWAYS", 0);
        ALWAYS = p9Var;
        p9 p9Var2 = new p9("ONLY_NEGATIVE", 1);
        ONLY_NEGATIVE = p9Var2;
        p9 p9Var3 = new p9("NEVER", 2);
        NEVER = p9Var3;
        p9[] p9VarArr = {p9Var, p9Var2, p9Var3};
        $VALUES = p9VarArr;
        $ENTRIES = vc.s.n(p9VarArr);
    }

    public static p9 valueOf(String str) {
        return (p9) Enum.valueOf(p9.class, str);
    }

    public static p9[] values() {
        return (p9[]) $VALUES.clone();
    }
}
