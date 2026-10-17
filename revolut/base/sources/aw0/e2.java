package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class e2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e2[] $VALUES;
    public static final e2 MONOCHROMATIC;
    public static final e2 PERFORMANCE;

    static {
        e2 e2Var = new e2("PERFORMANCE", 0);
        PERFORMANCE = e2Var;
        e2 e2Var2 = new e2("MONOCHROMATIC", 1);
        MONOCHROMATIC = e2Var2;
        e2[] e2VarArr = {e2Var, e2Var2};
        $VALUES = e2VarArr;
        $ENTRIES = vc.s.n(e2VarArr);
    }

    public static e2 valueOf(String str) {
        return (e2) Enum.valueOf(e2.class, str);
    }

    public static e2[] values() {
        return (e2[]) $VALUES.clone();
    }
}
