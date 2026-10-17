package gkl;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class r1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r1[] $VALUES;
    public static final r1 BUSINESS;
    public static final r1 PERSONAL;
    public static final r1 UNKNOWN;

    static {
        r1 r1Var = new r1("PERSONAL", 0);
        PERSONAL = r1Var;
        r1 r1Var2 = new r1("BUSINESS", 1);
        BUSINESS = r1Var2;
        r1 r1Var3 = new r1("UNKNOWN", 2);
        UNKNOWN = r1Var3;
        r1[] r1VarArr = {r1Var, r1Var2, r1Var3};
        $VALUES = r1VarArr;
        $ENTRIES = vc.s.n(r1VarArr);
    }

    public static r1 valueOf(String str) {
        return (r1) Enum.valueOf(r1.class, str);
    }

    public static r1[] values() {
        return (r1[]) $VALUES.clone();
    }
}
