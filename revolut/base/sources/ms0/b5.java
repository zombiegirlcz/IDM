package ms0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b5[] $VALUES;
    public static final b5 LOADING;
    public static final b5 NORMAL;
    public static final b5 PENDING;

    static {
        b5 b5Var = new b5("NORMAL", 0);
        NORMAL = b5Var;
        b5 b5Var2 = new b5("PENDING", 1);
        PENDING = b5Var2;
        b5 b5Var3 = new b5("LOADING", 2);
        LOADING = b5Var3;
        b5[] b5VarArr = {b5Var, b5Var2, b5Var3};
        $VALUES = b5VarArr;
        $ENTRIES = vc.s.n(b5VarArr);
    }

    public static b5 valueOf(String str) {
        return (b5) Enum.valueOf(b5.class, str);
    }

    public static b5[] values() {
        return (b5[]) $VALUES.clone();
    }
}
