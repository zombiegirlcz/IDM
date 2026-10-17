package qoc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class p0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p0[] $VALUES;
    public static final p0 FIRST_AND_LAST;
    public static final p0 YEARLY;
    public static final p0 YEAR_ENDPOINTS;

    static {
        p0 p0Var = new p0("FIRST_AND_LAST", 0);
        FIRST_AND_LAST = p0Var;
        p0 p0Var2 = new p0("YEARLY", 1);
        YEARLY = p0Var2;
        p0 p0Var3 = new p0("YEAR_ENDPOINTS", 2);
        YEAR_ENDPOINTS = p0Var3;
        p0[] p0VarArr = {p0Var, p0Var2, p0Var3};
        $VALUES = p0VarArr;
        $ENTRIES = vc.s.n(p0VarArr);
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) $VALUES.clone();
    }
}
