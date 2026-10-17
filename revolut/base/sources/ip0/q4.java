package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class q4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q4[] $VALUES;
    public static final q4 END;
    public static final q4 START;

    static {
        q4 q4Var = new q4("START", 0);
        START = q4Var;
        q4 q4Var2 = new q4("END", 1);
        END = q4Var2;
        q4[] q4VarArr = {q4Var, q4Var2};
        $VALUES = q4VarArr;
        $ENTRIES = vc.s.n(q4VarArr);
    }

    public static q4 valueOf(String str) {
        return (q4) Enum.valueOf(q4.class, str);
    }

    public static q4[] values() {
        return (q4[]) $VALUES.clone();
    }
}
