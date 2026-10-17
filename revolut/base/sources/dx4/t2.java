package dx4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class t2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t2[] $VALUES;
    public static final t2 IMAGE;
    public static final t2 UNKNOWN;
    public static final t2 VIDEO;

    static {
        t2 t2Var = new t2("VIDEO", 0);
        VIDEO = t2Var;
        t2 t2Var2 = new t2("IMAGE", 1);
        IMAGE = t2Var2;
        t2 t2Var3 = new t2("UNKNOWN", 2);
        UNKNOWN = t2Var3;
        t2[] t2VarArr = {t2Var, t2Var2, t2Var3};
        $VALUES = t2VarArr;
        $ENTRIES = vc.s.n(t2VarArr);
    }

    public static t2 valueOf(String str) {
        return (t2) Enum.valueOf(t2.class, str);
    }

    public static t2[] values() {
        return (t2[]) $VALUES.clone();
    }
}
