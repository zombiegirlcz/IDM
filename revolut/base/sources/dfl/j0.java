package dfl;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class j0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;
    public static final j0 ISA;
    public static final j0 JISA;
    public static final j0 UNKNOWN;

    static {
        j0 j0Var = new j0("ISA", 0);
        ISA = j0Var;
        j0 j0Var2 = new j0("JISA", 1);
        JISA = j0Var2;
        j0 j0Var3 = new j0("UNKNOWN", 2);
        UNKNOWN = j0Var3;
        j0[] j0VarArr = {j0Var, j0Var2, j0Var3};
        $VALUES = j0VarArr;
        $ENTRIES = vc.s.n(j0VarArr);
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }
}
