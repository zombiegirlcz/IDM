package ms0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class q3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q3[] $VALUES;
    public static final q3 BIG;
    public static final q3 SMALL;

    static {
        q3 q3Var = new q3("SMALL", 0);
        SMALL = q3Var;
        q3 q3Var2 = new q3("BIG", 1);
        BIG = q3Var2;
        q3[] q3VarArr = {q3Var, q3Var2};
        $VALUES = q3VarArr;
        $ENTRIES = vc.s.n(q3VarArr);
    }

    public static q3 valueOf(String str) {
        return (q3) Enum.valueOf(q3.class, str);
    }

    public static q3[] values() {
        return (q3[]) $VALUES.clone();
    }
}
