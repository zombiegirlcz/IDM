package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class c1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c1[] $VALUES;
    public static final c1 KARMA;
    public static final c1 LENDING_WORKS;
    public static final c1 UNKNOWN;

    static {
        c1 c1Var = new c1("KARMA", 0);
        KARMA = c1Var;
        c1 c1Var2 = new c1("LENDING_WORKS", 1);
        LENDING_WORKS = c1Var2;
        c1 c1Var3 = new c1("UNKNOWN", 2);
        UNKNOWN = c1Var3;
        c1[] c1VarArr = {c1Var, c1Var2, c1Var3};
        $VALUES = c1VarArr;
        $ENTRIES = vc.s.n(c1VarArr);
    }

    public static c1 valueOf(String str) {
        return (c1) Enum.valueOf(c1.class, str);
    }

    public static c1[] values() {
        return (c1[]) $VALUES.clone();
    }
}
