package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class j1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j1[] $VALUES;
    public static final j1 ALLOWED;
    public static final j1 DISALLOWED;
    public static final j1 RESTRICTED;

    static {
        j1 j1Var = new j1("ALLOWED", 0);
        ALLOWED = j1Var;
        j1 j1Var2 = new j1("DISALLOWED", 1);
        DISALLOWED = j1Var2;
        j1 j1Var3 = new j1("RESTRICTED", 2);
        RESTRICTED = j1Var3;
        j1[] j1VarArr = {j1Var, j1Var2, j1Var3};
        $VALUES = j1VarArr;
        $ENTRIES = vc.s.n(j1VarArr);
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) $VALUES.clone();
    }
}
