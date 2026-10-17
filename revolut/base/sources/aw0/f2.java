package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class f2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f2[] $VALUES;
    public static final f2 CURRENT_OR_SELECTED_OF_PREVIOUS_LINE;
    public static final f2 FIRST_OF_CURRENT_LINE;
    public static final f2 LAST_OF_PREVIOUS_LINE;

    static {
        f2 f2Var = new f2("FIRST_OF_CURRENT_LINE", 0);
        FIRST_OF_CURRENT_LINE = f2Var;
        f2 f2Var2 = new f2("LAST_OF_PREVIOUS_LINE", 1);
        LAST_OF_PREVIOUS_LINE = f2Var2;
        f2 f2Var3 = new f2("CURRENT_OR_SELECTED_OF_PREVIOUS_LINE", 2);
        CURRENT_OR_SELECTED_OF_PREVIOUS_LINE = f2Var3;
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
