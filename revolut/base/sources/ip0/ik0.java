package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ik0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ik0[] $VALUES;
    public static final ik0 DAY;
    public static final ik0 NIGHT;
    public static final ik0 SYSTEM;

    static {
        ik0 ik0Var = new ik0("DAY", 0);
        DAY = ik0Var;
        ik0 ik0Var2 = new ik0("NIGHT", 1);
        NIGHT = ik0Var2;
        ik0 ik0Var3 = new ik0("SYSTEM", 2);
        SYSTEM = ik0Var3;
        ik0[] ik0VarArr = {ik0Var, ik0Var2, ik0Var3};
        $VALUES = ik0VarArr;
        $ENTRIES = vc.s.n(ik0VarArr);
    }

    public static ik0 valueOf(String str) {
        return (ik0) Enum.valueOf(ik0.class, str);
    }

    public static ik0[] values() {
        return (ik0[]) $VALUES.clone();
    }
}
