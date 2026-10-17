package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class t4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t4[] $VALUES;
    public static final t4 PROGRESS;
    public static final t4 SEGMENTED;

    static {
        t4 t4Var = new t4("SEGMENTED", 0);
        SEGMENTED = t4Var;
        t4 t4Var2 = new t4("PROGRESS", 1);
        PROGRESS = t4Var2;
        t4[] t4VarArr = {t4Var, t4Var2};
        $VALUES = t4VarArr;
        $ENTRIES = vc.s.n(t4VarArr);
    }

    public static t4 valueOf(String str) {
        return (t4) Enum.valueOf(t4.class, str);
    }

    public static t4[] values() {
        return (t4[]) $VALUES.clone();
    }
}
