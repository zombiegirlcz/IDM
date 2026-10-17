package jel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class e1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e1[] $VALUES;
    public static final e1 LARGE_CAP;
    public static final e1 MICRO_CAP;
    public static final e1 MID_CAP;
    public static final e1 MIXED;
    public static final e1 SMALL_CAP;

    static {
        e1 e1Var = new e1("LARGE_CAP", 0);
        LARGE_CAP = e1Var;
        e1 e1Var2 = new e1("MID_CAP", 1);
        MID_CAP = e1Var2;
        e1 e1Var3 = new e1("SMALL_CAP", 2);
        SMALL_CAP = e1Var3;
        e1 e1Var4 = new e1("MICRO_CAP", 3);
        MICRO_CAP = e1Var4;
        e1 e1Var5 = new e1("MIXED", 4);
        MIXED = e1Var5;
        e1[] e1VarArr = {e1Var, e1Var2, e1Var3, e1Var4, e1Var5};
        $VALUES = e1VarArr;
        $ENTRIES = vc.s.n(e1VarArr);
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) $VALUES.clone();
    }
}
