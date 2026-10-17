package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n8 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n8[] $VALUES;
    public static final n8 DEFAULT;
    public static final n8 SECURE;

    static {
        n8 n8Var = new n8("DEFAULT", 0);
        DEFAULT = n8Var;
        n8 n8Var2 = new n8("SECURE", 1);
        SECURE = n8Var2;
        n8[] n8VarArr = {n8Var, n8Var2};
        $VALUES = n8VarArr;
        $ENTRIES = vc.s.n(n8VarArr);
    }

    public static n8 valueOf(String str) {
        return (n8) Enum.valueOf(n8.class, str);
    }

    public static n8[] values() {
        return (n8[]) $VALUES.clone();
    }
}
