package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class lg0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ lg0[] $VALUES;
    public static final lg0 BOTTOM;
    public static final lg0 TOP;

    static {
        lg0 lg0Var = new lg0("TOP", 0);
        TOP = lg0Var;
        lg0 lg0Var2 = new lg0("BOTTOM", 1);
        BOTTOM = lg0Var2;
        lg0[] lg0VarArr = {lg0Var, lg0Var2};
        $VALUES = lg0VarArr;
        $ENTRIES = vc.s.n(lg0VarArr);
    }

    public static lg0 valueOf(String str) {
        return (lg0) Enum.valueOf(lg0.class, str);
    }

    public static lg0[] values() {
        return (lg0[]) $VALUES.clone();
    }
}
