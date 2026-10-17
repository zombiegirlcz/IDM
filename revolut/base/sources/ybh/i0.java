package ybh;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class i0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;
    public static final i0 ONE_OFF;
    public static final i0 RECURRING;

    static {
        i0 i0Var = new i0("ONE_OFF", 0);
        ONE_OFF = i0Var;
        i0 i0Var2 = new i0("RECURRING", 1);
        RECURRING = i0Var2;
        i0[] i0VarArr = {i0Var, i0Var2};
        $VALUES = i0VarArr;
        $ENTRIES = vc.s.n(i0VarArr);
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) $VALUES.clone();
    }
}
