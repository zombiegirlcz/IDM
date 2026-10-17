package rp0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b2[] $VALUES;
    public static final b2 DYNAMIC_MORE;
    public static final b2 SCROLLABLE;

    static {
        b2 b2Var = new b2("SCROLLABLE", 0);
        SCROLLABLE = b2Var;
        b2 b2Var2 = new b2("DYNAMIC_MORE", 1);
        DYNAMIC_MORE = b2Var2;
        b2[] b2VarArr = {b2Var, b2Var2};
        $VALUES = b2VarArr;
        $ENTRIES = vc.s.n(b2VarArr);
    }

    public static b2 valueOf(String str) {
        return (b2) Enum.valueOf(b2.class, str);
    }

    public static b2[] values() {
        return (b2[]) $VALUES.clone();
    }
}
