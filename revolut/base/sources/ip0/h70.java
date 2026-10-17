package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class h70 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h70[] $VALUES;
    public static final h70 MULTI_LINES;
    public static final h70 NO_LINES;

    static {
        h70 h70Var = new h70("MULTI_LINES", 0);
        MULTI_LINES = h70Var;
        h70 h70Var2 = new h70("NO_LINES", 1);
        NO_LINES = h70Var2;
        h70[] h70VarArr = {h70Var, h70Var2};
        $VALUES = h70VarArr;
        $ENTRIES = vc.s.n(h70VarArr);
    }

    public static h70 valueOf(String str) {
        return (h70) Enum.valueOf(h70.class, str);
    }

    public static h70[] values() {
        return (h70[]) $VALUES.clone();
    }
}
