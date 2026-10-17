package tx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class q1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q1[] $VALUES;
    public static final q1 AVATAR;
    public static final q1 AVATAR_LARGE;
    public static final q1 PLAN;

    static {
        q1 q1Var = new q1("AVATAR", 0);
        AVATAR = q1Var;
        q1 q1Var2 = new q1("AVATAR_LARGE", 1);
        AVATAR_LARGE = q1Var2;
        q1 q1Var3 = new q1("PLAN", 2);
        PLAN = q1Var3;
        q1[] q1VarArr = {q1Var, q1Var2, q1Var3};
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
