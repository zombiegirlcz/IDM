package ej6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;
    public static final i0 AVAILABLE;
    public static final i0 INSUFFICIENT_FUNDS;
    public static final i0 UNAVAILABLE;

    static {
        i0 i0Var = new i0("UNAVAILABLE", 0);
        UNAVAILABLE = i0Var;
        i0 i0Var2 = new i0("INSUFFICIENT_FUNDS", 1);
        INSUFFICIENT_FUNDS = i0Var2;
        i0 i0Var3 = new i0("AVAILABLE", 2);
        AVAILABLE = i0Var3;
        i0[] i0VarArr = {i0Var, i0Var2, i0Var3};
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
