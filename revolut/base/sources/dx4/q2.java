package dx4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class q2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q2[] $VALUES;
    public static final q2 DEFAULT;
    public static final q2 FOREGROUND;

    static {
        q2 q2Var = new q2("DEFAULT", 0);
        DEFAULT = q2Var;
        q2 q2Var2 = new q2("FOREGROUND", 1);
        FOREGROUND = q2Var2;
        q2[] q2VarArr = {q2Var, q2Var2};
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
