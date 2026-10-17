package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class tn0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ tn0[] $VALUES;
    public static final tn0 MATCH_PARENT;
    public static final tn0 WRAP_CONTENT;

    static {
        tn0 tn0Var = new tn0("WRAP_CONTENT", 0);
        WRAP_CONTENT = tn0Var;
        tn0 tn0Var2 = new tn0("MATCH_PARENT", 1);
        MATCH_PARENT = tn0Var2;
        tn0[] tn0VarArr = {tn0Var, tn0Var2};
        $VALUES = tn0VarArr;
        $ENTRIES = vc.s.n(tn0VarArr);
    }

    public static tn0 valueOf(String str) {
        return (tn0) Enum.valueOf(tn0.class, str);
    }

    public static tn0[] values() {
        return (tn0[]) $VALUES.clone();
    }
}
