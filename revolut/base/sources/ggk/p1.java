package ggk;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class p1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p1[] $VALUES;
    public static final p1 PRIMARY;
    public static final p1 SECONDARY;
    public static final p1 UNKNOWN;

    static {
        p1 p1Var = new p1("PRIMARY", 0);
        PRIMARY = p1Var;
        p1 p1Var2 = new p1("SECONDARY", 1);
        SECONDARY = p1Var2;
        p1 p1Var3 = new p1("UNKNOWN", 2);
        UNKNOWN = p1Var3;
        p1[] p1VarArr = {p1Var, p1Var2, p1Var3};
        $VALUES = p1VarArr;
        $ENTRIES = vc.s.n(p1VarArr);
    }

    public static p1 valueOf(String str) {
        return (p1) Enum.valueOf(p1.class, str);
    }

    public static p1[] values() {
        return (p1[]) $VALUES.clone();
    }
}
