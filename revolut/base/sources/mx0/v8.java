package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class v8 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v8[] $VALUES;
    public static final v8 COLORED;
    public static final v8 REGULAR;

    static {
        v8 v8Var = new v8("REGULAR", 0);
        REGULAR = v8Var;
        v8 v8Var2 = new v8("COLORED", 1);
        COLORED = v8Var2;
        v8[] v8VarArr = {v8Var, v8Var2};
        $VALUES = v8VarArr;
        $ENTRIES = vc.s.n(v8VarArr);
    }

    public static v8 valueOf(String str) {
        return (v8) Enum.valueOf(v8.class, str);
    }

    public static v8[] values() {
        return (v8[]) $VALUES.clone();
    }
}
