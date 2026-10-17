package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class xo0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ xo0[] $VALUES;
    public static final xo0 MATCH_PARENT;
    public static final xo0 WRAP_CONTENT;

    static {
        xo0 xo0Var = new xo0("WRAP_CONTENT", 0);
        WRAP_CONTENT = xo0Var;
        xo0 xo0Var2 = new xo0("MATCH_PARENT", 1);
        MATCH_PARENT = xo0Var2;
        xo0[] xo0VarArr = {xo0Var, xo0Var2};
        $VALUES = xo0VarArr;
        $ENTRIES = vc.s.n(xo0VarArr);
    }

    public static xo0 valueOf(String str) {
        return (xo0) Enum.valueOf(xo0.class, str);
    }

    public static xo0[] values() {
        return (xo0[]) $VALUES.clone();
    }
}
