package au0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class f2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f2[] $VALUES;
    public static final f2 COUNT_TAG;
    public static final f2 DOT_INDICATOR;
    public static final f2 LINE_INDICATOR;

    static {
        f2 f2Var = new f2("LINE_INDICATOR", 0);
        LINE_INDICATOR = f2Var;
        f2 f2Var2 = new f2("COUNT_TAG", 1);
        COUNT_TAG = f2Var2;
        f2 f2Var3 = new f2("DOT_INDICATOR", 2);
        DOT_INDICATOR = f2Var3;
        f2[] f2VarArr = {f2Var, f2Var2, f2Var3};
        $VALUES = f2VarArr;
        $ENTRIES = vc.s.n(f2VarArr);
    }

    public static f2 valueOf(String str) {
        return (f2) Enum.valueOf(f2.class, str);
    }

    public static f2[] values() {
        return (f2[]) $VALUES.clone();
    }
}
