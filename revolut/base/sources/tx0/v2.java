package tx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class v2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v2[] $VALUES;
    public static final v2 CENTER;
    public static final v2 TOP;

    static {
        v2 v2Var = new v2("CENTER", 0);
        CENTER = v2Var;
        v2 v2Var2 = new v2("TOP", 1);
        TOP = v2Var2;
        v2[] v2VarArr = {v2Var, v2Var2};
        $VALUES = v2VarArr;
        $ENTRIES = vc.s.n(v2VarArr);
    }

    public static v2 valueOf(String str) {
        return (v2) Enum.valueOf(v2.class, str);
    }

    public static v2[] values() {
        return (v2[]) $VALUES.clone();
    }
}
