package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class sc0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ sc0[] $VALUES;
    public static final sc0 FORCE_CHANGE;
    public static final sc0 SKIP_IF_SCROLLING;

    static {
        sc0 sc0Var = new sc0("FORCE_CHANGE", 0);
        FORCE_CHANGE = sc0Var;
        sc0 sc0Var2 = new sc0("SKIP_IF_SCROLLING", 1);
        SKIP_IF_SCROLLING = sc0Var2;
        sc0[] sc0VarArr = {sc0Var, sc0Var2};
        $VALUES = sc0VarArr;
        $ENTRIES = vc.s.n(sc0VarArr);
    }

    public static sc0 valueOf(String str) {
        return (sc0) Enum.valueOf(sc0.class, str);
    }

    public static sc0[] values() {
        return (sc0[]) $VALUES.clone();
    }
}
