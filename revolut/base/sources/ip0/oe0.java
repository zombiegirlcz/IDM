package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class oe0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ oe0[] $VALUES;
    public static final oe0 ALWAYS;
    public static final oe0 NEVER;
    public static final oe0 TOOLTIP_ONLY;

    static {
        oe0 oe0Var = new oe0("ALWAYS", 0);
        ALWAYS = oe0Var;
        oe0 oe0Var2 = new oe0("NEVER", 1);
        NEVER = oe0Var2;
        oe0 oe0Var3 = new oe0("TOOLTIP_ONLY", 2);
        TOOLTIP_ONLY = oe0Var3;
        oe0[] oe0VarArr = {oe0Var, oe0Var2, oe0Var3};
        $VALUES = oe0VarArr;
        $ENTRIES = vc.s.n(oe0VarArr);
    }

    public static oe0 valueOf(String str) {
        return (oe0) Enum.valueOf(oe0.class, str);
    }

    public static oe0[] values() {
        return (oe0[]) $VALUES.clone();
    }
}
