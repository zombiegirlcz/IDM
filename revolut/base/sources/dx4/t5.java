package dx4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class t5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t5[] $VALUES;
    public static final t5 TEAL;

    static {
        t5 t5Var = new t5("TEAL", 0);
        TEAL = t5Var;
        t5[] t5VarArr = {t5Var};
        $VALUES = t5VarArr;
        $ENTRIES = vc.s.n(t5VarArr);
    }

    public static t5 valueOf(String str) {
        return (t5) Enum.valueOf(t5.class, str);
    }

    public static t5[] values() {
        return (t5[]) $VALUES.clone();
    }
}
