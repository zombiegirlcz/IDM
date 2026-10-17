package xl2;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class c0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 COMPLETE;
    public static final c0 INCOMPLETE;

    static {
        c0 c0Var = new c0("INCOMPLETE", 0);
        INCOMPLETE = c0Var;
        c0 c0Var2 = new c0("COMPLETE", 1);
        COMPLETE = c0Var2;
        c0[] c0VarArr = {c0Var, c0Var2};
        $VALUES = c0VarArr;
        $ENTRIES = vc.s.n(c0VarArr);
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }
}
