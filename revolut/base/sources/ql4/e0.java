package ql4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class e0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 ELIGIBLE;
    public static final e0 INELIGIBLE;

    static {
        e0 e0Var = new e0("ELIGIBLE", 0);
        ELIGIBLE = e0Var;
        e0 e0Var2 = new e0("INELIGIBLE", 1);
        INELIGIBLE = e0Var2;
        e0[] e0VarArr = {e0Var, e0Var2};
        $VALUES = e0VarArr;
        $ENTRIES = vc.s.n(e0VarArr);
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }
}
