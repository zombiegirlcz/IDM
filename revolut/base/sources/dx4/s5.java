package dx4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class s5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s5[] $VALUES;
    public static final s5 NO_BACKGROUND;
    public static final s5 WITH_BACKGROUND;

    static {
        s5 s5Var = new s5("NO_BACKGROUND", 0);
        NO_BACKGROUND = s5Var;
        s5 s5Var2 = new s5("WITH_BACKGROUND", 1);
        WITH_BACKGROUND = s5Var2;
        s5[] s5VarArr = {s5Var, s5Var2};
        $VALUES = s5VarArr;
        $ENTRIES = vc.s.n(s5VarArr);
    }

    public static s5 valueOf(String str) {
        return (s5) Enum.valueOf(s5.class, str);
    }

    public static s5[] values() {
        return (s5[]) $VALUES.clone();
    }
}
