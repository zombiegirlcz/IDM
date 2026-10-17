package ggk;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class q1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q1[] $VALUES;
    public static final q1 ACTIVE;
    public static final q1 UPCOMING;

    static {
        q1 q1Var = new q1("ACTIVE", 0);
        ACTIVE = q1Var;
        q1 q1Var2 = new q1("UPCOMING", 1);
        UPCOMING = q1Var2;
        q1[] q1VarArr = {q1Var, q1Var2};
        $VALUES = q1VarArr;
        $ENTRIES = vc.s.n(q1VarArr);
    }

    public static q1 valueOf(String str) {
        return (q1) Enum.valueOf(q1.class, str);
    }

    public static q1[] values() {
        return (q1[]) $VALUES.clone();
    }
}
