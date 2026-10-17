package dx4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class i1 implements j1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i1[] $VALUES;
    public static final i1 BUSINESS;
    public static final i1 RETAIL;

    static {
        i1 i1Var = new i1("RETAIL", 0);
        RETAIL = i1Var;
        i1 i1Var2 = new i1("BUSINESS", 1);
        BUSINESS = i1Var2;
        i1[] i1VarArr = {i1Var, i1Var2};
        $VALUES = i1VarArr;
        $ENTRIES = vc.s.n(i1VarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static i1 valueOf(String str) {
        return (i1) Enum.valueOf(i1.class, str);
    }

    public static i1[] values() {
        return (i1[]) $VALUES.clone();
    }
}
