package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class r9 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r9[] $VALUES;
    public static final r9 FIVE;
    public static final r9 THREE;

    static {
        r9 r9Var = new r9("THREE", 0);
        THREE = r9Var;
        r9 r9Var2 = new r9("FIVE", 1);
        FIVE = r9Var2;
        r9[] r9VarArr = {r9Var, r9Var2};
        $VALUES = r9VarArr;
        $ENTRIES = vc.s.n(r9VarArr);
    }

    public static r9 valueOf(String str) {
        return (r9) Enum.valueOf(r9.class, str);
    }

    public static r9[] values() {
        return (r9[]) $VALUES.clone();
    }
}
