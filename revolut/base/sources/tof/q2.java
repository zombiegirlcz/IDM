package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class q2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q2[] $VALUES;
    public static final q2 SALARY;

    static {
        q2 q2Var = new q2("SALARY", 0);
        SALARY = q2Var;
        q2[] q2VarArr = {q2Var};
        $VALUES = q2VarArr;
        $ENTRIES = vc.s.n(q2VarArr);
    }

    public static q2 valueOf(String str) {
        return (q2) Enum.valueOf(q2.class, str);
    }

    public static q2[] values() {
        return (q2[]) $VALUES.clone();
    }
}
