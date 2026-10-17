package au0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class i5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i5[] $VALUES;
    public static final i5 ONE_LINE;
    public static final i5 TWO_LINES_ICON_IN_FIRST_LINE;
    public static final i5 TWO_LINES_ICON_IN_SECOND_LINE;

    static {
        i5 i5Var = new i5("ONE_LINE", 0);
        ONE_LINE = i5Var;
        i5 i5Var2 = new i5("TWO_LINES_ICON_IN_FIRST_LINE", 1);
        TWO_LINES_ICON_IN_FIRST_LINE = i5Var2;
        i5 i5Var3 = new i5("TWO_LINES_ICON_IN_SECOND_LINE", 2);
        TWO_LINES_ICON_IN_SECOND_LINE = i5Var3;
        i5[] i5VarArr = {i5Var, i5Var2, i5Var3};
        $VALUES = i5VarArr;
        $ENTRIES = vc.s.n(i5VarArr);
    }

    public static i5 valueOf(String str) {
        return (i5) Enum.valueOf(i5.class, str);
    }

    public static i5[] values() {
        return (i5[]) $VALUES.clone();
    }
}
