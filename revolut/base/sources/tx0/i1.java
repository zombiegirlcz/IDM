package tx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class i1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i1[] $VALUES;

    @yhm.d
    public static final i1 MAX;
    public static final i1 THREE_ICONS;
    public static final i1 ZERO;

    static {
        i1 i1Var = new i1("ZERO", 0);
        ZERO = i1Var;
        i1 i1Var2 = new i1("MAX", 1);
        MAX = i1Var2;
        i1 i1Var3 = new i1("THREE_ICONS", 2);
        THREE_ICONS = i1Var3;
        i1[] i1VarArr = {i1Var, i1Var2, i1Var3};
        $VALUES = i1VarArr;
        $ENTRIES = vc.s.n(i1VarArr);
    }

    public static i1 valueOf(String str) {
        return (i1) Enum.valueOf(i1.class, str);
    }

    public static i1[] values() {
        return (i1[]) $VALUES.clone();
    }
}
