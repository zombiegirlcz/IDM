package tx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class b3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b3[] $VALUES;
    public static final b3 DEFAULT;
    public static final b3 OPAQUE;

    static {
        b3 b3Var = new b3("DEFAULT", 0);
        DEFAULT = b3Var;
        b3 b3Var2 = new b3("OPAQUE", 1);
        OPAQUE = b3Var2;
        b3[] b3VarArr = {b3Var, b3Var2};
        $VALUES = b3VarArr;
        $ENTRIES = vc.s.n(b3VarArr);
    }

    public static b3 valueOf(String str) {
        return (b3) Enum.valueOf(b3.class, str);
    }

    public static b3[] values() {
        return (b3[]) $VALUES.clone();
    }
}
