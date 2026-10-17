package ms0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class o5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o5[] $VALUES;
    public static final o5 COMPACT;
    public static final o5 NORMAL;

    static {
        o5 o5Var = new o5("NORMAL", 0);
        NORMAL = o5Var;
        o5 o5Var2 = new o5("COMPACT", 1);
        COMPACT = o5Var2;
        o5[] o5VarArr = {o5Var, o5Var2};
        $VALUES = o5VarArr;
        $ENTRIES = vc.s.n(o5VarArr);
    }

    public static o5 valueOf(String str) {
        return (o5) Enum.valueOf(o5.class, str);
    }

    public static o5[] values() {
        return (o5[]) $VALUES.clone();
    }
}
