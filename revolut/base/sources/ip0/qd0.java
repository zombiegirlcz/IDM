package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class qd0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ qd0[] $VALUES;
    public static final qd0 INDETERMINATE;
    public static final qd0 SELECTED;
    public static final qd0 UNSELECTED;

    static {
        qd0 qd0Var = new qd0("INDETERMINATE", 0);
        INDETERMINATE = qd0Var;
        qd0 qd0Var2 = new qd0("SELECTED", 1);
        SELECTED = qd0Var2;
        qd0 qd0Var3 = new qd0("UNSELECTED", 2);
        UNSELECTED = qd0Var3;
        qd0[] qd0VarArr = {qd0Var, qd0Var2, qd0Var3};
        $VALUES = qd0VarArr;
        $ENTRIES = vc.s.n(qd0VarArr);
    }

    public static qd0 valueOf(String str) {
        return (qd0) Enum.valueOf(qd0.class, str);
    }

    public static qd0[] values() {
        return (qd0[]) $VALUES.clone();
    }
}
